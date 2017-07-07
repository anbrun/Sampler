package de.idsma.rw.Sampler;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.*;
import static org.apache.uima.fit.factory.CollectionReaderFactory.*;
import static org.apache.uima.fit.pipeline.SimplePipeline.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;

import org.apache.uima.UIMAException;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.impl.XmiCasSerializer;
import org.apache.uima.collection.CollectionReaderDescription;
import org.apache.uima.fit.component.CasDumpWriter;
import org.apache.uima.fit.factory.TypeSystemDescriptionFactory;
import org.apache.uima.fit.pipeline.JCasIterable;
import org.apache.uima.fit.pipeline.JCasIterator;
import org.apache.uima.fit.pipeline.SimplePipeline;
import org.apache.uima.resource.metadata.TypeSystemDescription;
import org.apache.uima.util.CasCreationUtils;

import de.tudarmstadt.ukp.dkpro.core.io.xmi.XmiReader;

/*
import uimarwprojekt.markframe.MarkFrame;
import uimarwprojekt.markfreeindirect.MarkFreeIndirect;
import uimarwprojekt.markindirect.MarkIndirect;
import uimarwprojekt.markquotation.MarkQuotation;
import uimarwprojekt.markreported.MarkReported;
import uimarwprojekt.markstwwords.MarkSTWWords;
*/
import de.tudarmstadt.ukp.dkpro.core.io.text.TextReader;
import de.tudarmstadt.ukp.dkpro.core.io.xmi.XmiWriter;
import de.tudarmstadt.ukp.dkpro.core.tokit.BreakIteratorSegmenter;
import de.tudarmstadt.ukp.dkpro.core.treetagger.TreeTaggerPosTagger;

public class Runner {

	public static void main(String[] args) throws UIMAException, IOException {

		try {

			CollectionReaderDescription cr = createReaderDescription(
					XmiReader.class, 
					XmiReader.PARAM_SOURCE_LOCATION, "input/*.xmi", 
					XmiReader.PARAM_LENIENT, false, 
					XmiReader.PARAM_LANGUAGE, "de");

			// Set Typesystem for inputfile (TEI schema)
			TypeSystemDescription tsd = TypeSystemDescriptionFactory
					.createTypeSystemDescriptionFromPath("resources/generatedTypeSystem.xml");
			cr.getCollectionReaderMetaData().setTypeSystem(tsd);

			// define DKPro segmenter 
			AnalysisEngineDescription seg = createEngineDescription(BreakIteratorSegmenter.class);

			// define TreeTagger
			AnalysisEngineDescription tagger = createEngineDescription(TreeTaggerPosTagger.class,
					TreeTaggerPosTagger.PARAM_EXECUTABLE_PATH,
					"resources/tree-tagger-windows-3.2/TreeTagger/bin/tree-tagger.exe",
					TreeTaggerPosTagger.PARAM_MODEL_LOCATION,
					"resources/tree-tagger-windows-3.2/TreeTagger/lib/german-utf8.par",
					TreeTaggerPosTagger.PARAM_MODEL_ENCODING, "UTF-8");

			
			// Typesystem for sampler (merge from generated TS, MiKalliTS und RWProjekt)
						TypeSystemDescription tsdSampler = TypeSystemDescriptionFactory
								.createTypeSystemDescriptionFromPath("resources/RWProjektTypeSystem.xml");
						//TypeSystemDescription tsdMiKalli = TypeSystemDescriptionFactory
						//		.createTypeSystemDescriptionFromPath("resources/MiKalliTypesystem.xml");
						Collection<TypeSystemDescription> ts_coll = new HashSet<>();
						ts_coll.add(tsd);
						ts_coll.add(tsdSampler);
						//ts_coll.add(tsdMiKalli);

						TypeSystemDescription mergedTypeSystems = null;
						mergedTypeSystems = CasCreationUtils.mergeTypeSystems(ts_coll);
			
			// define Sampler
			AnalysisEngineDescription sampler = createEngineDescription(
					SamplerXmi.class,
					//SamplerXmi.PARAM_TS, mergedTypeSystems,
					SamplerXmi.PARAM_SAMPLELEN, 500,
					SamplerXmi.PARAM_SAMPLENR, 1, 
					SamplerXmi.PARAM_OUTPUTDIR, "samples");
			

			// set TypeSystem for Sampler
			sampler.getAnalysisEngineMetaData().setTypeSystem(mergedTypeSystems);

			// AnalysisEngineDescription xmiWriter = createEngineDescription(
			// XmiWriter.class, XmiWriter.PARAM_TARGET_LOCATION, "target");
			// xmiWriter.getAnalysisEngineMetaData().setTypeSystem(mergedTypeSystems);

			// runPipeline(cr, seg, sampler, xmiWriter);

			JCasIterable iteratePipeline = SimplePipeline.iteratePipeline(cr, seg, sampler);
			JCasIterator iterator = iteratePipeline.iterator();

			CAS cas = null;
			while (iterator.hasNext()) {
				cas = iterator.next().getCas();
			}
			XmiCasSerializer.serialize(cas, new FileOutputStream(new File("out.xmi")));

			// runPipeline(cr, seg, tagger, rfTagger, markSTWWords,
			// markIndirect, xmiWriter);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
