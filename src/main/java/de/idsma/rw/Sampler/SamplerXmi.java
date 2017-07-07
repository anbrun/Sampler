package de.idsma.rw.Sampler;

import java.io.*;
import java.util.*;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.Feature;
import org.apache.uima.cas.TypeSystem;
import org.apache.uima.cas.impl.XmiCasSerializer;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.factory.TypeSystemDescriptionFactory;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.metadata.TypeSystemDescription;
import org.apache.uima.util.CasCreationUtils;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.idsma.rw.types.Sample;

import org.apache.uima.cas.Type;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.cas.text.AnnotationIndex;

/**
 * Sampler UIMA component to sample random snippets from a text
 * 
 * @author Annelen Brunner, brunner@ids-mannheim.de
 */
public class SamplerXmi extends JCasAnnotator_ImplBase {
	private static int TRYLIMIT = 20;

	public static final String PARAM_SAMPLENR = "Number of samples to draw from this text";
	@ConfigurationParameter(name = PARAM_SAMPLENR, defaultValue = "1", description = "Number of samples to draw from this text")
	private int samplenr;

	public static final String PARAM_SAMPLELEN = "Length of samples to draw from this text";
	@ConfigurationParameter(name = PARAM_SAMPLELEN, defaultValue = "1000", description = "Length of samples to draw from this text")
	private int samplelen;

	public static final String PARAM_OUTPUTDIR = "Output directcory for samples";
	@ConfigurationParameter(name = PARAM_OUTPUTDIR, defaultValue = "samples", description = "Output directcory for samples")
	private String outputdir;
	
//	public static final TypeSystemDescription PARAM_TS = null;
//	@ConfigurationParameter(name = PARAM_OUTPUTDIR, description = "Typesystem for output files")
//	private TypeSystemDescription outputTS;
	
	private Random randomGenerator = new Random();

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {

		// select all sentence annotations inside tag body
	    String typeName = "de.uniwue.mk.kallimachos.tei.type.body";
	    Type bodyType = aJCas.getTypeSystem().getType(typeName);
	    AnnotationIndex<Annotation> bodyIndex = aJCas.getAnnotationIndex(bodyType);
	    List<Sentence> sentInBody = new ArrayList<>();
	    for (Annotation body : bodyIndex) {
	    	sentInBody = JCasUtil.selectCovered(aJCas, Sentence.class, body);
	    }
		System.out.println("sentInBody: " + sentInBody.size());
	    
	    //choose Sample
	   
	    
		Map<Sentence, Collection<Token>> sentsWithToks = JCasUtil.indexCovered(
				aJCas, Sentence.class, Token.class);

		// TEST
		// AnnotationIndex<Annotation> idx = aJCas.getAnnotationIndex();

		int samples = 0;
		int tries = 0;
		while (samples < this.samplenr) {
			// break the loop if there have been TRYLIMIT more tries than
			// samples
			System.out.println("Find sample: Try " + tries);
			if (tries > this.samplenr + TRYLIMIT) {
				Object[] params = new Object[0];
				//throw new AnalysisEngineProcessException("Too many tries: "
				//		+ tries, params);
				System.err.println("Too many tries: " + tries);
				break;
			}
			boolean success = this.getSample(aJCas, sentsWithToks, sentInBody, samples);
			if (success) {
				samples++;
			}
			tries++;
		}

		try {
			Iterator<Token> toks = JCasUtil.iterator(aJCas, Token.class);
			String docStart = new String();
			int counter = 0;
			while (counter < 5 && toks.hasNext()) {
				docStart = docStart + toks.next().getCoveredText();
				counter++;
			}
			docStart = docStart.replaceAll("[<\\?!/\\(\\)>\\.=*]+", "");
			docStart = docStart.replaceAll("\\\\", "");
			System.out.println("DocName: " + docStart);
			
			this.writeSamplesToFiles(aJCas, docStart);
			this.writeSamplesToXMI(aJCas, docStart);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	

	

	private void writeSamplesToFiles(JCas aJCas, String doc)
			throws Exception {
		Iterator<Sample> samples = JCasUtil.iterator(aJCas, Sample.class);
		while (samples.hasNext()) {
			Sample s = samples.next();

			String filename = this.outputdir + File.separator + doc + "_"
					+ s.getId() + ".txt";
			this.writeFile(filename, s.getCoveredText());
		}
	}
	
	
	private void writeSamplesToXMI(JCas aJCas, String doc)
			throws Exception {
		//Iterator<Sample> samples = JCasUtil.iterator(aJCas, Sample.class);
		
	    // get all Annotations in the range of Sample
		Map<Sample, Collection<Annotation>> samplesWithAnnos = JCasUtil.indexCovered(
						aJCas, Sample.class, Annotation.class);
		
		for (Sample s : samplesWithAnnos.keySet()) {
			//Sample s = samples.next();

			String filename = this.outputdir + File.separator + "samp_" + doc + "_"
					+ s.getId() + ".xmi";
			
			// create TS
			Collection<TypeSystemDescription> ts_coll = new HashSet<>();
			TypeSystemDescription tsdSampler = TypeSystemDescriptionFactory
					.createTypeSystemDescriptionFromPath("resources/RWProjektTypeSystem.xml");
			TypeSystemDescription tsd = TypeSystemDescriptionFactory
					.createTypeSystemDescriptionFromPath("resources/generatedTypeSystem.xml");
			ts_coll.add(tsd);
			ts_coll.add(tsdSampler);

			TypeSystemDescription mergedTypeSystems = null;
			mergedTypeSystems = CasCreationUtils.mergeTypeSystems(ts_coll);

			// initialize new CAS
		    CAS newCas = CasCreationUtils.createCas(mergedTypeSystems,null,null);
		    // set the text covered by Sample as text of the newCas
		    newCas.setDocumentText(s.getCoveredText());
		    
		    int sampleStart = s.getBegin();
		    int sampleEnd = s.getEnd();
		    // get the annotations covered by this sample
		    for (Annotation anno : samplesWithAnnos.get(s)) {
		    	// copy each annotation to the new Cas
		    	//newCas.addFsToIndexes(anno);
		    	System.out.println("Copy Anno: " + anno.getType().getName());
		        System.out.println("SampleStart: " + sampleStart + " SampleEnd: " + sampleEnd);
		        System.out.println("AnnoStart: " + anno.getBegin() + " AnnoEnd: " + anno.getEnd());
		    	Type newAnnoType = anno.getType();
		    	int newAnnoStart = 0;
		    	if (anno.getBegin() >= sampleStart) {
		    		newAnnoStart = anno.getBegin() - sampleStart;
		    	}
		    	int newAnnoEnd = sampleEnd;
		    	if (anno.getEnd() <= sampleEnd) {
		    		newAnnoEnd = newAnnoStart + (anno.getEnd() - anno.getBegin());
		    	}
		    	System.out.println("NewCASLen: " + newCas.getDocumentText().length());
		    	System.out.println("NewAnnoStart: " + newAnnoStart + " newAnnoEnd: " + newAnnoEnd);
		    	AnnotationFS newAnno = newCas.createAnnotation(newAnnoType, newAnnoStart, newAnnoEnd);
		    	try {
		    	System.out.println("HERE");
		    	newCas.addFsToIndexes(newAnno);
		    	System.out.println("THERE");
		    	}
		    	catch (Exception e) {
		    		System.out.println("adding failed for: " + anno.getType().getName());
		    	}
		    }
		
		    System.out.println("NEW ANNOTATIONS");
		    for (AnnotationFS anno : newCas.getAnnotationIndex()) {
		    	System.out.println("anno: " + anno.getType().getName());
		    }
		   
			XmiCasSerializer.serialize(newCas, new FileOutputStream(new File(filename)));
			
		}
	}
	
	
	private CAS copyAnno(String annoName, String newAnnoName, CAS mainCas, CAS mergeCas) {
		Type annoType = mergeCas.getTypeSystem().getType(annoName);
		AnnotationIndex<AnnotationFS> annoIndex = mergeCas.getAnnotationIndex(annoType);

		for (AnnotationFS anno : annoIndex) {
			// System.out.println("Anno: " + anno.getCoveredText());

			// copy this Anno to the mainCas, but change the Anno name to
			// newAnnoName
			Type newAnnoType = mainCas.getTypeSystem().getType(newAnnoName);
			AnnotationFS newAnno = mainCas.createAnnotation(newAnnoType, anno.getBegin(), anno.getEnd());

			// copy Features of anno to newAnno
			for (Feature feat : annoType.getFeatures()) {
				// only copy the features that are of the frame domain
				if (feat.getDomain().equals(annoType)) {
					newAnno.setFeatureValueFromString(feat, anno.getFeatureValueAsString(feat));
				}
			}
			// add the annotation zu the mainCas index
			mainCas.addFsToIndexes(newAnno);
		}
		return mainCas;
	}

	private void writeFile(String filename, String content) throws Exception {
		System.out.println("filename: " + filename);
		Writer writer = null;
		try {
			File file = new File(filename);
			file.getParentFile().mkdirs();
			writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(filename), "utf-8"));
			writer.write(content);
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				writer.close();
			} catch (Exception ex) {
				// ignore ex
			}
		}

	}

	private boolean getSample(JCas aJCas,
			Map<Sentence, Collection<Token>> sentTokMap, 
			List<Sentence> sentInBody,
			int sampleID) {
		boolean success = false;

		// // check if there are enough tokens left to generate a sample of the
		// appropriate length
		// Token startTok = sentTokMap.get(startSent).iterator().next();

		Map<Sentence, Collection<Sample>> sentSampMap = JCasUtil.indexCovering(
				aJCas, Sentence.class, Sample.class);

		Token startTok = null;
		int tries = 0;
		while (tries < TRYLIMIT) {
			startTok = this.pickStartToken(aJCas, sentTokMap, sentSampMap, sentInBody);
			if (startTok != null) {
				break;
			}
			tries++;
		}

		if (startTok != null) {

			List<Token> tokSample = JCasUtil.selectFollowing(Token.class,
					startTok, this.samplelen);

			if (tokSample.size() == this.samplelen) {
				// determine endTok --> always expand the Anno to the next
				// Sentence end
				Token sampleTokEnd = tokSample.get(tokSample.size() - 1);
				List<Sentence> coveringSents = JCasUtil.selectCovering(
						Sentence.class, sampleTokEnd);
				Sentence endSent = coveringSents.get(0);
				// only add annotation if the endSent is not covered by a
				// SampleAnno either
				System.out.println("Endsent not Sample? "
						+ sentSampMap.get(endSent).isEmpty());
				if (sentSampMap.get(endSent).isEmpty()) {

					// annotation only successfully added if it does not overlap
					// with another sample
					success = this.addAnnotation(aJCas, startTok.getBegin(),
							coveringSents.get(0).getEnd(), sampleID);
				}
			}
		}
		System.out.println("Success: " + success);
		return success;
	}

	private Token pickStartToken(JCas aJCas,
			Map<Sentence, Collection<Token>> sentTokMap,
			Map<Sentence, Collection<Sample>> sentSampMap,
			List<Sentence> sentInBody) {
		Token startTok = null;
		List<Sentence> sentList = new ArrayList<>(sentTokMap.keySet());
		int index = this.randomGenerator.nextInt(sentList.size());

		Sentence startSent = sentList.get(index);

		// check whether sent is part of body
		if (!sentInBody.contains(startSent)) {
			System.out.println("Sent not in Body");
		}
		else {
			System.out.println("Sent is in Body: " + startSent.getCoveredText());
		System.out.println("Startsent not Sample? "
				+ sentSampMap.get(startSent).isEmpty());
		// check whether the startSent is not covered by a Sample Annotation
		if (sentSampMap.get(startSent).isEmpty()) {
			startTok = sentTokMap.get(startSent).iterator().next();
		}
		}
		return startTok;
	}

	private boolean addAnnotation(JCas aJCas, int start, int end, int id) {
		boolean success = false;
		// generate a new annotation of type Indirect
		Sample s = new Sample(aJCas, start, end);
		s.setId(id);
		s.addToIndexes(aJCas);
		success = true;
		//
		// Map<Sample, Collection<Sample>> sampleMap = JCasUtil.indexCovered(
		// aJCas, Sample.class, Sample.class);
		// if (!sampleMap.get(s).isEmpty()) {
		// s.removeFromIndexes();
		// success = false;
		// }
		return success;
	}

}
