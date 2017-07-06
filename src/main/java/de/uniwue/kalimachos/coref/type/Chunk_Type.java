
/* First created by JCasGen Thu Jul 06 15:37:09 CEST 2017 */
package de.uniwue.kalimachos.coref.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Thu Jul 06 15:39:03 CEST 2017
 * @generated */
public class Chunk_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Chunk.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.uniwue.kalimachos.coref.type.Chunk");
 
  /** @generated */
  final Feature casFeat_ChunkType;
  /** @generated */
  final int     casFeatCode_ChunkType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getChunkType(int addr) {
        if (featOkTst && casFeat_ChunkType == null)
      jcas.throwFeatMissing("ChunkType", "de.uniwue.kalimachos.coref.type.Chunk");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ChunkType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setChunkType(int addr, String v) {
        if (featOkTst && casFeat_ChunkType == null)
      jcas.throwFeatMissing("ChunkType", "de.uniwue.kalimachos.coref.type.Chunk");
    ll_cas.ll_setStringValue(addr, casFeatCode_ChunkType, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Chunk_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ChunkType = jcas.getRequiredFeatureDE(casType, "ChunkType", "uima.cas.String", featOkTst);
    casFeatCode_ChunkType  = (null == casFeat_ChunkType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ChunkType).getCode();

  }
}



    