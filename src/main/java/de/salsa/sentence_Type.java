
/* First created by JCasGen Thu Jul 06 15:37:09 CEST 2017 */
package de.salsa;

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
public class sentence_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = sentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.salsa.sentence");
 
  /** @generated */
  final Feature casFeat_SentId;
  /** @generated */
  final int     casFeatCode_SentId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSentId(int addr) {
        if (featOkTst && casFeat_SentId == null)
      jcas.throwFeatMissing("SentId", "de.salsa.sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SentId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentId(int addr, String v) {
        if (featOkTst && casFeat_SentId == null)
      jcas.throwFeatMissing("SentId", "de.salsa.sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_SentId, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SentId = jcas.getRequiredFeatureDE(casType, "SentId", "uima.cas.String", featOkTst);
    casFeatCode_SentId  = (null == casFeat_SentId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentId).getCode();

  }
}



    