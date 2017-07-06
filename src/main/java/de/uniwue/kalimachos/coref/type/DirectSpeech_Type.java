
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
public class DirectSpeech_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DirectSpeech.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.uniwue.kalimachos.coref.type.DirectSpeech");
 
  /** @generated */
  final Feature casFeat_ID;
  /** @generated */
  final int     casFeatCode_ID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getID(int addr) {
        if (featOkTst && casFeat_ID == null)
      jcas.throwFeatMissing("ID", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setID(int addr, String v) {
        if (featOkTst && casFeat_ID == null)
      jcas.throwFeatMissing("ID", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    ll_cas.ll_setStringValue(addr, casFeatCode_ID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Speaker;
  /** @generated */
  final int     casFeatCode_Speaker;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSpeaker(int addr) {
        if (featOkTst && casFeat_Speaker == null)
      jcas.throwFeatMissing("Speaker", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Speaker);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpeaker(int addr, int v) {
        if (featOkTst && casFeat_Speaker == null)
      jcas.throwFeatMissing("Speaker", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    ll_cas.ll_setRefValue(addr, casFeatCode_Speaker, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SpokenTo;
  /** @generated */
  final int     casFeatCode_SpokenTo;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSpokenTo(int addr) {
        if (featOkTst && casFeat_SpokenTo == null)
      jcas.throwFeatMissing("SpokenTo", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    return ll_cas.ll_getRefValue(addr, casFeatCode_SpokenTo);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpokenTo(int addr, int v) {
        if (featOkTst && casFeat_SpokenTo == null)
      jcas.throwFeatMissing("SpokenTo", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    ll_cas.ll_setRefValue(addr, casFeatCode_SpokenTo, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SpeakerArray;
  /** @generated */
  final int     casFeatCode_SpeakerArray;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSpeakerArray(int addr) {
        if (featOkTst && casFeat_SpeakerArray == null)
      jcas.throwFeatMissing("SpeakerArray", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    return ll_cas.ll_getRefValue(addr, casFeatCode_SpeakerArray);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpeakerArray(int addr, int v) {
        if (featOkTst && casFeat_SpeakerArray == null)
      jcas.throwFeatMissing("SpeakerArray", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    ll_cas.ll_setRefValue(addr, casFeatCode_SpeakerArray, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getSpeakerArray(int addr, int i) {
        if (featOkTst && casFeat_SpeakerArray == null)
      jcas.throwFeatMissing("SpeakerArray", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_SpeakerArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_SpeakerArray), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_SpeakerArray), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setSpeakerArray(int addr, int i, int v) {
        if (featOkTst && casFeat_SpeakerArray == null)
      jcas.throwFeatMissing("SpeakerArray", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_SpeakerArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_SpeakerArray), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_SpeakerArray), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_SpokenToArray;
  /** @generated */
  final int     casFeatCode_SpokenToArray;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSpokenToArray(int addr) {
        if (featOkTst && casFeat_SpokenToArray == null)
      jcas.throwFeatMissing("SpokenToArray", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    return ll_cas.ll_getRefValue(addr, casFeatCode_SpokenToArray);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpokenToArray(int addr, int v) {
        if (featOkTst && casFeat_SpokenToArray == null)
      jcas.throwFeatMissing("SpokenToArray", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    ll_cas.ll_setRefValue(addr, casFeatCode_SpokenToArray, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getSpokenToArray(int addr, int i) {
        if (featOkTst && casFeat_SpokenToArray == null)
      jcas.throwFeatMissing("SpokenToArray", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_SpokenToArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_SpokenToArray), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_SpokenToArray), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setSpokenToArray(int addr, int i, int v) {
        if (featOkTst && casFeat_SpokenToArray == null)
      jcas.throwFeatMissing("SpokenToArray", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_SpokenToArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_SpokenToArray), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_SpokenToArray), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_Category;
  /** @generated */
  final int     casFeatCode_Category;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCategory(int addr) {
        if (featOkTst && casFeat_Category == null)
      jcas.throwFeatMissing("Category", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Category);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCategory(int addr, String v) {
        if (featOkTst && casFeat_Category == null)
      jcas.throwFeatMissing("Category", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    ll_cas.ll_setStringValue(addr, casFeatCode_Category, v);}
    
  
 
  /** @generated */
  final Feature casFeat_UnknownSpeaker;
  /** @generated */
  final int     casFeatCode_UnknownSpeaker;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUnknownSpeaker(int addr) {
        if (featOkTst && casFeat_UnknownSpeaker == null)
      jcas.throwFeatMissing("UnknownSpeaker", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    return ll_cas.ll_getStringValue(addr, casFeatCode_UnknownSpeaker);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUnknownSpeaker(int addr, String v) {
        if (featOkTst && casFeat_UnknownSpeaker == null)
      jcas.throwFeatMissing("UnknownSpeaker", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    ll_cas.ll_setStringValue(addr, casFeatCode_UnknownSpeaker, v);}
    
  
 
  /** @generated */
  final Feature casFeat_UnknownSpokenTo;
  /** @generated */
  final int     casFeatCode_UnknownSpokenTo;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUnknownSpokenTo(int addr) {
        if (featOkTst && casFeat_UnknownSpokenTo == null)
      jcas.throwFeatMissing("UnknownSpokenTo", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    return ll_cas.ll_getStringValue(addr, casFeatCode_UnknownSpokenTo);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUnknownSpokenTo(int addr, String v) {
        if (featOkTst && casFeat_UnknownSpokenTo == null)
      jcas.throwFeatMissing("UnknownSpokenTo", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    ll_cas.ll_setStringValue(addr, casFeatCode_UnknownSpokenTo, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DirectSpeech_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ID = jcas.getRequiredFeatureDE(casType, "ID", "uima.cas.String", featOkTst);
    casFeatCode_ID  = (null == casFeat_ID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ID).getCode();

 
    casFeat_Speaker = jcas.getRequiredFeatureDE(casType, "Speaker", "uima.tcas.Annotation", featOkTst);
    casFeatCode_Speaker  = (null == casFeat_Speaker) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Speaker).getCode();

 
    casFeat_SpokenTo = jcas.getRequiredFeatureDE(casType, "SpokenTo", "uima.tcas.Annotation", featOkTst);
    casFeatCode_SpokenTo  = (null == casFeat_SpokenTo) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SpokenTo).getCode();

 
    casFeat_SpeakerArray = jcas.getRequiredFeatureDE(casType, "SpeakerArray", "uima.cas.FSArray", featOkTst);
    casFeatCode_SpeakerArray  = (null == casFeat_SpeakerArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SpeakerArray).getCode();

 
    casFeat_SpokenToArray = jcas.getRequiredFeatureDE(casType, "SpokenToArray", "uima.cas.FSArray", featOkTst);
    casFeatCode_SpokenToArray  = (null == casFeat_SpokenToArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SpokenToArray).getCode();

 
    casFeat_Category = jcas.getRequiredFeatureDE(casType, "Category", "uima.cas.String", featOkTst);
    casFeatCode_Category  = (null == casFeat_Category) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Category).getCode();

 
    casFeat_UnknownSpeaker = jcas.getRequiredFeatureDE(casType, "UnknownSpeaker", "uima.cas.String", featOkTst);
    casFeatCode_UnknownSpeaker  = (null == casFeat_UnknownSpeaker) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_UnknownSpeaker).getCode();

 
    casFeat_UnknownSpokenTo = jcas.getRequiredFeatureDE(casType, "UnknownSpokenTo", "uima.cas.String", featOkTst);
    casFeatCode_UnknownSpokenTo  = (null == casFeat_UnknownSpokenTo) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_UnknownSpokenTo).getCode();

  }
}



    