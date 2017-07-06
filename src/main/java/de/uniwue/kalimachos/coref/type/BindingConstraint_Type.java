
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
public class BindingConstraint_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = BindingConstraint.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.uniwue.kalimachos.coref.type.BindingConstraint");
 
  /** @generated */
  final Feature casFeat_IsCoreferent;
  /** @generated */
  final int     casFeatCode_IsCoreferent;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getIsCoreferent(int addr) {
        if (featOkTst && casFeat_IsCoreferent == null)
      jcas.throwFeatMissing("IsCoreferent", "de.uniwue.kalimachos.coref.type.BindingConstraint");
    return ll_cas.ll_getStringValue(addr, casFeatCode_IsCoreferent);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsCoreferent(int addr, String v) {
        if (featOkTst && casFeat_IsCoreferent == null)
      jcas.throwFeatMissing("IsCoreferent", "de.uniwue.kalimachos.coref.type.BindingConstraint");
    ll_cas.ll_setStringValue(addr, casFeatCode_IsCoreferent, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Actual;
  /** @generated */
  final int     casFeatCode_Actual;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getActual(int addr) {
        if (featOkTst && casFeat_Actual == null)
      jcas.throwFeatMissing("Actual", "de.uniwue.kalimachos.coref.type.BindingConstraint");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Actual);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setActual(int addr, int v) {
        if (featOkTst && casFeat_Actual == null)
      jcas.throwFeatMissing("Actual", "de.uniwue.kalimachos.coref.type.BindingConstraint");
    ll_cas.ll_setRefValue(addr, casFeatCode_Actual, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Previous;
  /** @generated */
  final int     casFeatCode_Previous;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPrevious(int addr) {
        if (featOkTst && casFeat_Previous == null)
      jcas.throwFeatMissing("Previous", "de.uniwue.kalimachos.coref.type.BindingConstraint");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Previous);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPrevious(int addr, int v) {
        if (featOkTst && casFeat_Previous == null)
      jcas.throwFeatMissing("Previous", "de.uniwue.kalimachos.coref.type.BindingConstraint");
    ll_cas.ll_setRefValue(addr, casFeatCode_Previous, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public BindingConstraint_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_IsCoreferent = jcas.getRequiredFeatureDE(casType, "IsCoreferent", "uima.cas.String", featOkTst);
    casFeatCode_IsCoreferent  = (null == casFeat_IsCoreferent) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_IsCoreferent).getCode();

 
    casFeat_Actual = jcas.getRequiredFeatureDE(casType, "Actual", "uima.tcas.Annotation", featOkTst);
    casFeatCode_Actual  = (null == casFeat_Actual) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Actual).getCode();

 
    casFeat_Previous = jcas.getRequiredFeatureDE(casType, "Previous", "uima.tcas.Annotation", featOkTst);
    casFeatCode_Previous  = (null == casFeat_Previous) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Previous).getCode();

  }
}



    