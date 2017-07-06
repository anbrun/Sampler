

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
public class Chapter extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Chapter.class);
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
  protected Chapter() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Chapter(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Chapter(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Chapter(JCas jcas, int begin, int end) {
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
  //* Feature: Enumeration

  /** getter for Enumeration - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEnumeration() {
    if (Chapter_Type.featOkTst && ((Chapter_Type)jcasType).casFeat_Enumeration == null)
      jcasType.jcas.throwFeatMissing("Enumeration", "de.uniwue.kalimachos.coref.type.Chapter");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Chapter_Type)jcasType).casFeatCode_Enumeration);}
    
  /** setter for Enumeration - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnumeration(String v) {
    if (Chapter_Type.featOkTst && ((Chapter_Type)jcasType).casFeat_Enumeration == null)
      jcasType.jcas.throwFeatMissing("Enumeration", "de.uniwue.kalimachos.coref.type.Chapter");
    jcasType.ll_cas.ll_setStringValue(addr, ((Chapter_Type)jcasType).casFeatCode_Enumeration, v);}    
  }

    