package de.idsma.rw.Sampler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.XmiCasDeserializer;
import org.apache.uima.cas.impl.XmiCasSerializer;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.fit.factory.TypeSystemDescriptionFactory;
import org.apache.uima.resource.metadata.TypeSystemDescription;
import org.apache.uima.util.CasCreationUtils;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		
		String inputFile = "input/Wildermuth,_Ottilie_Zwei_Braeute.tg19_1.xml.xmi";
		String typeSystem = "resources/generatedTypesystem.xml";
		
		try {
		// Typsystem vom Pfad laden - UimaFit only 
	    TypeSystemDescription tsd = TypeSystemDescriptionFactory
	            .createTypeSystemDescriptionFromPath(typeSystem);
	    
	    
	    //CAS erstellen
	    CAS cas = CasCreationUtils.createCas(tsd,null,null);
	    XmiCasDeserializer.deserialize(new FileInputStream(inputFile), cas);
	    
	    
	    
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

}
