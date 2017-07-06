
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
public class DependencyParse_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DependencyParse.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.uniwue.kalimachos.coref.type.DependencyParse");
 
  /** @generated */
  final Feature casFeat_Headname;
  /** @generated */
  final int     casFeatCode_Headname;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getHeadname(int addr) {
        if (featOkTst && casFeat_Headname == null)
      jcas.throwFeatMissing("Headname", "de.uniwue.kalimachos.coref.type.DependencyParse");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Headname);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHeadname(int addr, String v) {
        if (featOkTst && casFeat_Headname == null)
      jcas.throwFeatMissing("Headname", "de.uniwue.kalimachos.coref.type.DependencyParse");
    ll_cas.ll_setStringValue(addr, casFeatCode_Headname, v);}
    
  
 
  /** @generated */
  final Feature casFeat_WordNumber;
  /** @generated */
  final int     casFeatCode_WordNumber;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getWordNumber(int addr) {
        if (featOkTst && casFeat_WordNumber == null)
      jcas.throwFeatMissing("WordNumber", "de.uniwue.kalimachos.coref.type.DependencyParse");
    return ll_cas.ll_getIntValue(addr, casFeatCode_WordNumber);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWordNumber(int addr, int v) {
        if (featOkTst && casFeat_WordNumber == null)
      jcas.throwFeatMissing("WordNumber", "de.uniwue.kalimachos.coref.type.DependencyParse");
    ll_cas.ll_setIntValue(addr, casFeatCode_WordNumber, v);}
    
  
 
  /** @generated */
  final Feature casFeat_DependencyRelation;
  /** @generated */
  final int     casFeatCode_DependencyRelation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDependencyRelation(int addr) {
        if (featOkTst && casFeat_DependencyRelation == null)
      jcas.throwFeatMissing("DependencyRelation", "de.uniwue.kalimachos.coref.type.DependencyParse");
    return ll_cas.ll_getStringValue(addr, casFeatCode_DependencyRelation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDependencyRelation(int addr, String v) {
        if (featOkTst && casFeat_DependencyRelation == null)
      jcas.throwFeatMissing("DependencyRelation", "de.uniwue.kalimachos.coref.type.DependencyParse");
    ll_cas.ll_setStringValue(addr, casFeatCode_DependencyRelation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_HeadAnnotation;
  /** @generated */
  final int     casFeatCode_HeadAnnotation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getHeadAnnotation(int addr) {
        if (featOkTst && casFeat_HeadAnnotation == null)
      jcas.throwFeatMissing("HeadAnnotation", "de.uniwue.kalimachos.coref.type.DependencyParse");
    return ll_cas.ll_getRefValue(addr, casFeatCode_HeadAnnotation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHeadAnnotation(int addr, int v) {
        if (featOkTst && casFeat_HeadAnnotation == null)
      jcas.throwFeatMissing("HeadAnnotation", "de.uniwue.kalimachos.coref.type.DependencyParse");
    ll_cas.ll_setRefValue(addr, casFeatCode_HeadAnnotation, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DependencyParse_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Headname = jcas.getRequiredFeatureDE(casType, "Headname", "uima.cas.String", featOkTst);
    casFeatCode_Headname  = (null == casFeat_Headname) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Headname).getCode();

 
    casFeat_WordNumber = jcas.getRequiredFeatureDE(casType, "WordNumber", "uima.cas.Integer", featOkTst);
    casFeatCode_WordNumber  = (null == casFeat_WordNumber) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_WordNumber).getCode();

 
    casFeat_DependencyRelation = jcas.getRequiredFeatureDE(casType, "DependencyRelation", "uima.cas.String", featOkTst);
    casFeatCode_DependencyRelation  = (null == casFeat_DependencyRelation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_DependencyRelation).getCode();

 
    casFeat_HeadAnnotation = jcas.getRequiredFeatureDE(casType, "HeadAnnotation", "uima.tcas.Annotation", featOkTst);
    casFeatCode_HeadAnnotation  = (null == casFeat_HeadAnnotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_HeadAnnotation).getCode();

  }
}



    