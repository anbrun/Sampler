
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
public class ChallengeNE_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ChallengeNE.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.uniwue.kalimachos.coref.type.ChallengeNE");
 
  /** @generated */
  final Feature casFeat_FirstNE;
  /** @generated */
  final int     casFeatCode_FirstNE;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFirstNE(int addr) {
        if (featOkTst && casFeat_FirstNE == null)
      jcas.throwFeatMissing("FirstNE", "de.uniwue.kalimachos.coref.type.ChallengeNE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_FirstNE);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFirstNE(int addr, String v) {
        if (featOkTst && casFeat_FirstNE == null)
      jcas.throwFeatMissing("FirstNE", "de.uniwue.kalimachos.coref.type.ChallengeNE");
    ll_cas.ll_setStringValue(addr, casFeatCode_FirstNE, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SecondNE;
  /** @generated */
  final int     casFeatCode_SecondNE;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSecondNE(int addr) {
        if (featOkTst && casFeat_SecondNE == null)
      jcas.throwFeatMissing("SecondNE", "de.uniwue.kalimachos.coref.type.ChallengeNE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SecondNE);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSecondNE(int addr, String v) {
        if (featOkTst && casFeat_SecondNE == null)
      jcas.throwFeatMissing("SecondNE", "de.uniwue.kalimachos.coref.type.ChallengeNE");
    ll_cas.ll_setStringValue(addr, casFeatCode_SecondNE, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ChallengeNE_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_FirstNE = jcas.getRequiredFeatureDE(casType, "FirstNE", "uima.cas.String", featOkTst);
    casFeatCode_FirstNE  = (null == casFeat_FirstNE) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_FirstNE).getCode();

 
    casFeat_SecondNE = jcas.getRequiredFeatureDE(casType, "SecondNE", "uima.cas.String", featOkTst);
    casFeatCode_SecondNE  = (null == casFeat_SecondNE) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SecondNE).getCode();

  }
}



    