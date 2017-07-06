
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
public class Chapter_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Chapter.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.uniwue.kalimachos.coref.type.Chapter");
 
  /** @generated */
  final Feature casFeat_Enumeration;
  /** @generated */
  final int     casFeatCode_Enumeration;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getEnumeration(int addr) {
        if (featOkTst && casFeat_Enumeration == null)
      jcas.throwFeatMissing("Enumeration", "de.uniwue.kalimachos.coref.type.Chapter");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Enumeration);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEnumeration(int addr, String v) {
        if (featOkTst && casFeat_Enumeration == null)
      jcas.throwFeatMissing("Enumeration", "de.uniwue.kalimachos.coref.type.Chapter");
    ll_cas.ll_setStringValue(addr, casFeatCode_Enumeration, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Chapter_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Enumeration = jcas.getRequiredFeatureDE(casType, "Enumeration", "uima.cas.String", featOkTst);
    casFeatCode_Enumeration  = (null == casFeat_Enumeration) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Enumeration).getCode();

  }
}



    