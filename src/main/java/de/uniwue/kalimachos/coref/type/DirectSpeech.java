

/* First created by JCasGen Thu Jul 06 15:37:09 CEST 2017 */
package de.uniwue.kalimachos.coref.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Jul 06 15:39:03 CEST 2017
 * XML source: D:/Github/Sampler/resources/RWProjektTypeSystem.xml
 * @generated */
public class DirectSpeech extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DirectSpeech.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected DirectSpeech() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DirectSpeech(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DirectSpeech(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DirectSpeech(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: ID

  /** getter for ID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getID() {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_ID);}
    
  /** setter for ID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setID(String v) {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    jcasType.ll_cas.ll_setStringValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_ID, v);}    
   
    
  //*--------------*
  //* Feature: Speaker

  /** getter for Speaker - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getSpeaker() {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_Speaker == null)
      jcasType.jcas.throwFeatMissing("Speaker", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_Speaker)));}
    
  /** setter for Speaker - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpeaker(Annotation v) {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_Speaker == null)
      jcasType.jcas.throwFeatMissing("Speaker", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    jcasType.ll_cas.ll_setRefValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_Speaker, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: SpokenTo

  /** getter for SpokenTo - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getSpokenTo() {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_SpokenTo == null)
      jcasType.jcas.throwFeatMissing("SpokenTo", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_SpokenTo)));}
    
  /** setter for SpokenTo - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpokenTo(Annotation v) {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_SpokenTo == null)
      jcasType.jcas.throwFeatMissing("SpokenTo", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    jcasType.ll_cas.ll_setRefValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_SpokenTo, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: SpeakerArray

  /** getter for SpeakerArray - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getSpeakerArray() {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_SpeakerArray == null)
      jcasType.jcas.throwFeatMissing("SpeakerArray", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_SpeakerArray)));}
    
  /** setter for SpeakerArray - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpeakerArray(FSArray v) {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_SpeakerArray == null)
      jcasType.jcas.throwFeatMissing("SpeakerArray", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    jcasType.ll_cas.ll_setRefValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_SpeakerArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for SpeakerArray - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Annotation getSpeakerArray(int i) {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_SpeakerArray == null)
      jcasType.jcas.throwFeatMissing("SpeakerArray", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_SpeakerArray), i);
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_SpeakerArray), i)));}

  /** indexed setter for SpeakerArray - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setSpeakerArray(int i, Annotation v) { 
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_SpeakerArray == null)
      jcasType.jcas.throwFeatMissing("SpeakerArray", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_SpeakerArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_SpeakerArray), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: SpokenToArray

  /** getter for SpokenToArray - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getSpokenToArray() {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_SpokenToArray == null)
      jcasType.jcas.throwFeatMissing("SpokenToArray", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_SpokenToArray)));}
    
  /** setter for SpokenToArray - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpokenToArray(FSArray v) {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_SpokenToArray == null)
      jcasType.jcas.throwFeatMissing("SpokenToArray", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    jcasType.ll_cas.ll_setRefValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_SpokenToArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for SpokenToArray - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Annotation getSpokenToArray(int i) {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_SpokenToArray == null)
      jcasType.jcas.throwFeatMissing("SpokenToArray", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_SpokenToArray), i);
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_SpokenToArray), i)));}

  /** indexed setter for SpokenToArray - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setSpokenToArray(int i, Annotation v) { 
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_SpokenToArray == null)
      jcasType.jcas.throwFeatMissing("SpokenToArray", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_SpokenToArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_SpokenToArray), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: Category

  /** getter for Category - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCategory() {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_Category == null)
      jcasType.jcas.throwFeatMissing("Category", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_Category);}
    
  /** setter for Category - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategory(String v) {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_Category == null)
      jcasType.jcas.throwFeatMissing("Category", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    jcasType.ll_cas.ll_setStringValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_Category, v);}    
   
    
  //*--------------*
  //* Feature: UnknownSpeaker

  /** getter for UnknownSpeaker - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUnknownSpeaker() {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_UnknownSpeaker == null)
      jcasType.jcas.throwFeatMissing("UnknownSpeaker", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_UnknownSpeaker);}
    
  /** setter for UnknownSpeaker - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUnknownSpeaker(String v) {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_UnknownSpeaker == null)
      jcasType.jcas.throwFeatMissing("UnknownSpeaker", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    jcasType.ll_cas.ll_setStringValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_UnknownSpeaker, v);}    
   
    
  //*--------------*
  //* Feature: UnknownSpokenTo

  /** getter for UnknownSpokenTo - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUnknownSpokenTo() {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_UnknownSpokenTo == null)
      jcasType.jcas.throwFeatMissing("UnknownSpokenTo", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_UnknownSpokenTo);}
    
  /** setter for UnknownSpokenTo - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUnknownSpokenTo(String v) {
    if (DirectSpeech_Type.featOkTst && ((DirectSpeech_Type)jcasType).casFeat_UnknownSpokenTo == null)
      jcasType.jcas.throwFeatMissing("UnknownSpokenTo", "de.uniwue.kalimachos.coref.type.DirectSpeech");
    jcasType.ll_cas.ll_setStringValue(addr, ((DirectSpeech_Type)jcasType).casFeatCode_UnknownSpokenTo, v);}    
  }

    