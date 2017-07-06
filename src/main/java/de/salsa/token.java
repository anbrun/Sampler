

/* First created by JCasGen Thu Jul 06 15:37:09 CEST 2017 */
package de.salsa;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Jul 06 15:39:03 CEST 2017
 * XML source: D:/Github/Sampler/resources/RWProjektTypeSystem.xml
 * @generated */
public class token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(token.class);
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
  protected token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public token(JCas jcas, int begin, int end) {
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
  //* Feature: Word

  /** getter for Word - gets 
   * @generated
   * @return value of the feature 
   */
  public String getWord() {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Word == null)
      jcasType.jcas.throwFeatMissing("Word", "de.salsa.token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((token_Type)jcasType).casFeatCode_Word);}
    
  /** setter for Word - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWord(String v) {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Word == null)
      jcasType.jcas.throwFeatMissing("Word", "de.salsa.token");
    jcasType.ll_cas.ll_setStringValue(addr, ((token_Type)jcasType).casFeatCode_Word, v);}    
   
    
  //*--------------*
  //* Feature: Morph

  /** getter for Morph - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMorph() {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Morph == null)
      jcasType.jcas.throwFeatMissing("Morph", "de.salsa.token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((token_Type)jcasType).casFeatCode_Morph);}
    
  /** setter for Morph - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMorph(String v) {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Morph == null)
      jcasType.jcas.throwFeatMissing("Morph", "de.salsa.token");
    jcasType.ll_cas.ll_setStringValue(addr, ((token_Type)jcasType).casFeatCode_Morph, v);}    
   
    
  //*--------------*
  //* Feature: Gender

  /** getter for Gender - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGender() {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Gender == null)
      jcasType.jcas.throwFeatMissing("Gender", "de.salsa.token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((token_Type)jcasType).casFeatCode_Gender);}
    
  /** setter for Gender - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGender(String v) {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Gender == null)
      jcasType.jcas.throwFeatMissing("Gender", "de.salsa.token");
    jcasType.ll_cas.ll_setStringValue(addr, ((token_Type)jcasType).casFeatCode_Gender, v);}    
   
    
  //*--------------*
  //* Feature: Case

  /** getter for Case - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCase() {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Case == null)
      jcasType.jcas.throwFeatMissing("Case", "de.salsa.token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((token_Type)jcasType).casFeatCode_Case);}
    
  /** setter for Case - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCase(String v) {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Case == null)
      jcasType.jcas.throwFeatMissing("Case", "de.salsa.token");
    jcasType.ll_cas.ll_setStringValue(addr, ((token_Type)jcasType).casFeatCode_Case, v);}    
   
    
  //*--------------*
  //* Feature: Lemma

  /** getter for Lemma - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLemma() {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Lemma == null)
      jcasType.jcas.throwFeatMissing("Lemma", "de.salsa.token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((token_Type)jcasType).casFeatCode_Lemma);}
    
  /** setter for Lemma - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLemma(String v) {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Lemma == null)
      jcasType.jcas.throwFeatMissing("Lemma", "de.salsa.token");
    jcasType.ll_cas.ll_setStringValue(addr, ((token_Type)jcasType).casFeatCode_Lemma, v);}    
   
    
  //*--------------*
  //* Feature: Id

  /** getter for Id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "de.salsa.token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((token_Type)jcasType).casFeatCode_Id);}
    
  /** setter for Id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "de.salsa.token");
    jcasType.ll_cas.ll_setStringValue(addr, ((token_Type)jcasType).casFeatCode_Id, v);}    
   
    
  //*--------------*
  //* Feature: Person

  /** getter for Person - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPerson() {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Person == null)
      jcasType.jcas.throwFeatMissing("Person", "de.salsa.token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((token_Type)jcasType).casFeatCode_Person);}
    
  /** setter for Person - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPerson(String v) {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Person == null)
      jcasType.jcas.throwFeatMissing("Person", "de.salsa.token");
    jcasType.ll_cas.ll_setStringValue(addr, ((token_Type)jcasType).casFeatCode_Person, v);}    
   
    
  //*--------------*
  //* Feature: Tense

  /** getter for Tense - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTense() {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Tense == null)
      jcasType.jcas.throwFeatMissing("Tense", "de.salsa.token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((token_Type)jcasType).casFeatCode_Tense);}
    
  /** setter for Tense - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTense(String v) {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Tense == null)
      jcasType.jcas.throwFeatMissing("Tense", "de.salsa.token");
    jcasType.ll_cas.ll_setStringValue(addr, ((token_Type)jcasType).casFeatCode_Tense, v);}    
   
    
  //*--------------*
  //* Feature: Mood

  /** getter for Mood - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMood() {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Mood == null)
      jcasType.jcas.throwFeatMissing("Mood", "de.salsa.token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((token_Type)jcasType).casFeatCode_Mood);}
    
  /** setter for Mood - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMood(String v) {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Mood == null)
      jcasType.jcas.throwFeatMissing("Mood", "de.salsa.token");
    jcasType.ll_cas.ll_setStringValue(addr, ((token_Type)jcasType).casFeatCode_Mood, v);}    
   
    
  //*--------------*
  //* Feature: Degree

  /** getter for Degree - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDegree() {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Degree == null)
      jcasType.jcas.throwFeatMissing("Degree", "de.salsa.token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((token_Type)jcasType).casFeatCode_Degree);}
    
  /** setter for Degree - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDegree(String v) {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Degree == null)
      jcasType.jcas.throwFeatMissing("Degree", "de.salsa.token");
    jcasType.ll_cas.ll_setStringValue(addr, ((token_Type)jcasType).casFeatCode_Degree, v);}    
   
    
  //*--------------*
  //* Feature: Pos

  /** getter for Pos - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPos() {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Pos == null)
      jcasType.jcas.throwFeatMissing("Pos", "de.salsa.token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((token_Type)jcasType).casFeatCode_Pos);}
    
  /** setter for Pos - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPos(String v) {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Pos == null)
      jcasType.jcas.throwFeatMissing("Pos", "de.salsa.token");
    jcasType.ll_cas.ll_setStringValue(addr, ((token_Type)jcasType).casFeatCode_Pos, v);}    
   
    
  //*--------------*
  //* Feature: Number

  /** getter for Number - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNumber() {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Number == null)
      jcasType.jcas.throwFeatMissing("Number", "de.salsa.token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((token_Type)jcasType).casFeatCode_Number);}
    
  /** setter for Number - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNumber(String v) {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_Number == null)
      jcasType.jcas.throwFeatMissing("Number", "de.salsa.token");
    jcasType.ll_cas.ll_setStringValue(addr, ((token_Type)jcasType).casFeatCode_Number, v);}    
   
    
  //*--------------*
  //* Feature: none

  /** getter for none - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNone() {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_none == null)
      jcasType.jcas.throwFeatMissing("none", "de.salsa.token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((token_Type)jcasType).casFeatCode_none);}
    
  /** setter for none - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNone(String v) {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_none == null)
      jcasType.jcas.throwFeatMissing("none", "de.salsa.token");
    jcasType.ll_cas.ll_setStringValue(addr, ((token_Type)jcasType).casFeatCode_none, v);}    
  }

    