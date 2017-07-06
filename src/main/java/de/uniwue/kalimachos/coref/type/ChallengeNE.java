

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
public class ChallengeNE extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ChallengeNE.class);
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
  protected ChallengeNE() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ChallengeNE(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ChallengeNE(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ChallengeNE(JCas jcas, int begin, int end) {
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
  //* Feature: FirstNE

  /** getter for FirstNE - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFirstNE() {
    if (ChallengeNE_Type.featOkTst && ((ChallengeNE_Type)jcasType).casFeat_FirstNE == null)
      jcasType.jcas.throwFeatMissing("FirstNE", "de.uniwue.kalimachos.coref.type.ChallengeNE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ChallengeNE_Type)jcasType).casFeatCode_FirstNE);}
    
  /** setter for FirstNE - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFirstNE(String v) {
    if (ChallengeNE_Type.featOkTst && ((ChallengeNE_Type)jcasType).casFeat_FirstNE == null)
      jcasType.jcas.throwFeatMissing("FirstNE", "de.uniwue.kalimachos.coref.type.ChallengeNE");
    jcasType.ll_cas.ll_setStringValue(addr, ((ChallengeNE_Type)jcasType).casFeatCode_FirstNE, v);}    
   
    
  //*--------------*
  //* Feature: SecondNE

  /** getter for SecondNE - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSecondNE() {
    if (ChallengeNE_Type.featOkTst && ((ChallengeNE_Type)jcasType).casFeat_SecondNE == null)
      jcasType.jcas.throwFeatMissing("SecondNE", "de.uniwue.kalimachos.coref.type.ChallengeNE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ChallengeNE_Type)jcasType).casFeatCode_SecondNE);}
    
  /** setter for SecondNE - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSecondNE(String v) {
    if (ChallengeNE_Type.featOkTst && ((ChallengeNE_Type)jcasType).casFeat_SecondNE == null)
      jcasType.jcas.throwFeatMissing("SecondNE", "de.uniwue.kalimachos.coref.type.ChallengeNE");
    jcasType.ll_cas.ll_setStringValue(addr, ((ChallengeNE_Type)jcasType).casFeatCode_SecondNE, v);}    
  }

    