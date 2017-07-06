
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
public class AlreadyHandled_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AlreadyHandled.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.uniwue.kalimachos.coref.type.AlreadyHandled");
 
  /** @generated */
  final Feature casFeat_Change;
  /** @generated */
  final int     casFeatCode_Change;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getChange(int addr) {
        if (featOkTst && casFeat_Change == null)
      jcas.throwFeatMissing("Change", "de.uniwue.kalimachos.coref.type.AlreadyHandled");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Change);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setChange(int addr, String v) {
        if (featOkTst && casFeat_Change == null)
      jcas.throwFeatMissing("Change", "de.uniwue.kalimachos.coref.type.AlreadyHandled");
    ll_cas.ll_setStringValue(addr, casFeatCode_Change, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AlreadyHandled_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Change = jcas.getRequiredFeatureDE(casType, "Change", "uima.cas.String", featOkTst);
    casFeatCode_Change  = (null == casFeat_Change) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Change).getCode();

  }
}



    