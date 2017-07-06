

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
public class AttributeType extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AttributeType.class);
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
  protected AttributeType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AttributeType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AttributeType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AttributeType(JCas jcas, int begin, int end) {
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

  /** getter for ID - gets Points to the ID of the Person where this attribute
            belongs to
   * @generated
   * @return value of the feature 
   */
  public String getID() {
    if (AttributeType_Type.featOkTst && ((AttributeType_Type)jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "de.uniwue.kalimachos.coref.type.AttributeType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AttributeType_Type)jcasType).casFeatCode_ID);}
    
  /** setter for ID - sets Points to the ID of the Person where this attribute
            belongs to 
   * @generated
   * @param v value to set into the feature 
   */
  public void setID(String v) {
    if (AttributeType_Type.featOkTst && ((AttributeType_Type)jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "de.uniwue.kalimachos.coref.type.AttributeType");
    jcasType.ll_cas.ll_setStringValue(addr, ((AttributeType_Type)jcasType).casFeatCode_ID, v);}    
  }

    