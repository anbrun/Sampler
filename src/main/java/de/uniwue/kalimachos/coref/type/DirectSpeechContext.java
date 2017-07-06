

/* First created by JCasGen Thu Jul 06 15:37:09 CEST 2017 */
package de.uniwue.kalimachos.coref.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Jul 06 15:39:03 CEST 2017
 * XML source: D:/Github/Sampler/resources/RWProjektTypeSystem.xml
 * @generated */
public class DirectSpeechContext extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DirectSpeechContext.class);
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
  protected DirectSpeechContext() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DirectSpeechContext(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DirectSpeechContext(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DirectSpeechContext(JCas jcas, int begin, int end) {
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
  //* Feature: Context

  /** getter for Context - gets 
   * @generated
   * @return value of the feature 
   */
  public String getContext() {
    if (DirectSpeechContext_Type.featOkTst && ((DirectSpeechContext_Type)jcasType).casFeat_Context == null)
      jcasType.jcas.throwFeatMissing("Context", "de.uniwue.kalimachos.coref.type.DirectSpeechContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DirectSpeechContext_Type)jcasType).casFeatCode_Context);}
    
  /** setter for Context - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContext(String v) {
    if (DirectSpeechContext_Type.featOkTst && ((DirectSpeechContext_Type)jcasType).casFeat_Context == null)
      jcasType.jcas.throwFeatMissing("Context", "de.uniwue.kalimachos.coref.type.DirectSpeechContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((DirectSpeechContext_Type)jcasType).casFeatCode_Context, v);}    
   
    
  //*--------------*
  //* Feature: DirectSpeech

  /** getter for DirectSpeech - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getDirectSpeech() {
    if (DirectSpeechContext_Type.featOkTst && ((DirectSpeechContext_Type)jcasType).casFeat_DirectSpeech == null)
      jcasType.jcas.throwFeatMissing("DirectSpeech", "de.uniwue.kalimachos.coref.type.DirectSpeechContext");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DirectSpeechContext_Type)jcasType).casFeatCode_DirectSpeech)));}
    
  /** setter for DirectSpeech - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDirectSpeech(Annotation v) {
    if (DirectSpeechContext_Type.featOkTst && ((DirectSpeechContext_Type)jcasType).casFeat_DirectSpeech == null)
      jcasType.jcas.throwFeatMissing("DirectSpeech", "de.uniwue.kalimachos.coref.type.DirectSpeechContext");
    jcasType.ll_cas.ll_setRefValue(addr, ((DirectSpeechContext_Type)jcasType).casFeatCode_DirectSpeech, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    