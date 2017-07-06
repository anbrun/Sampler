
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
public class DirectSpeechContext_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DirectSpeechContext.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.uniwue.kalimachos.coref.type.DirectSpeechContext");
 
  /** @generated */
  final Feature casFeat_Context;
  /** @generated */
  final int     casFeatCode_Context;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getContext(int addr) {
        if (featOkTst && casFeat_Context == null)
      jcas.throwFeatMissing("Context", "de.uniwue.kalimachos.coref.type.DirectSpeechContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Context);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContext(int addr, String v) {
        if (featOkTst && casFeat_Context == null)
      jcas.throwFeatMissing("Context", "de.uniwue.kalimachos.coref.type.DirectSpeechContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Context, v);}
    
  
 
  /** @generated */
  final Feature casFeat_DirectSpeech;
  /** @generated */
  final int     casFeatCode_DirectSpeech;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDirectSpeech(int addr) {
        if (featOkTst && casFeat_DirectSpeech == null)
      jcas.throwFeatMissing("DirectSpeech", "de.uniwue.kalimachos.coref.type.DirectSpeechContext");
    return ll_cas.ll_getRefValue(addr, casFeatCode_DirectSpeech);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDirectSpeech(int addr, int v) {
        if (featOkTst && casFeat_DirectSpeech == null)
      jcas.throwFeatMissing("DirectSpeech", "de.uniwue.kalimachos.coref.type.DirectSpeechContext");
    ll_cas.ll_setRefValue(addr, casFeatCode_DirectSpeech, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DirectSpeechContext_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Context = jcas.getRequiredFeatureDE(casType, "Context", "uima.cas.String", featOkTst);
    casFeatCode_Context  = (null == casFeat_Context) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Context).getCode();

 
    casFeat_DirectSpeech = jcas.getRequiredFeatureDE(casType, "DirectSpeech", "uima.tcas.Annotation", featOkTst);
    casFeatCode_DirectSpeech  = (null == casFeat_DirectSpeech) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_DirectSpeech).getCode();

  }
}



    