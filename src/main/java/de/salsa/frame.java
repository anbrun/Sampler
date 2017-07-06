

/* First created by JCasGen Thu Jul 06 15:37:09 CEST 2017 */
package de.salsa;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Jul 06 15:39:03 CEST 2017
 * XML source: D:/Github/Sampler/resources/RWProjektTypeSystem.xml
 * @generated */
public class frame extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(frame.class);
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
  protected frame() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public frame(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public frame(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public frame(JCas jcas, int begin, int end) {
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
  //* Feature: Name

  /** getter for Name - gets 
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (frame_Type.featOkTst && ((frame_Type)jcasType).casFeat_Name == null)
      jcasType.jcas.throwFeatMissing("Name", "de.salsa.frame");
    return jcasType.ll_cas.ll_getStringValue(addr, ((frame_Type)jcasType).casFeatCode_Name);}
    
  /** setter for Name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (frame_Type.featOkTst && ((frame_Type)jcasType).casFeat_Name == null)
      jcasType.jcas.throwFeatMissing("Name", "de.salsa.frame");
    jcasType.ll_cas.ll_setStringValue(addr, ((frame_Type)jcasType).casFeatCode_Name, v);}    
   
    
  //*--------------*
  //* Feature: Id

  /** getter for Id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (frame_Type.featOkTst && ((frame_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "de.salsa.frame");
    return jcasType.ll_cas.ll_getStringValue(addr, ((frame_Type)jcasType).casFeatCode_Id);}
    
  /** setter for Id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (frame_Type.featOkTst && ((frame_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "de.salsa.frame");
    jcasType.ll_cas.ll_setStringValue(addr, ((frame_Type)jcasType).casFeatCode_Id, v);}    
   
    
  //*--------------*
  //* Feature: Target

  /** getter for Target - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTarget() {
    if (frame_Type.featOkTst && ((frame_Type)jcasType).casFeat_Target == null)
      jcasType.jcas.throwFeatMissing("Target", "de.salsa.frame");
    return jcasType.ll_cas.ll_getStringValue(addr, ((frame_Type)jcasType).casFeatCode_Target);}
    
  /** setter for Target - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTarget(String v) {
    if (frame_Type.featOkTst && ((frame_Type)jcasType).casFeat_Target == null)
      jcasType.jcas.throwFeatMissing("Target", "de.salsa.frame");
    jcasType.ll_cas.ll_setStringValue(addr, ((frame_Type)jcasType).casFeatCode_Target, v);}    
   
    
  //*--------------*
  //* Feature: FrameEntries

  /** getter for FrameEntries - gets Contains framentries, each entry has 3 entires itself,
            id;name;idref

            those are separated by a colon ':'
   * @generated
   * @return value of the feature 
   */
  public StringArray getFrameEntries() {
    if (frame_Type.featOkTst && ((frame_Type)jcasType).casFeat_FrameEntries == null)
      jcasType.jcas.throwFeatMissing("FrameEntries", "de.salsa.frame");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((frame_Type)jcasType).casFeatCode_FrameEntries)));}
    
  /** setter for FrameEntries - sets Contains framentries, each entry has 3 entires itself,
            id;name;idref

            those are separated by a colon ':' 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrameEntries(StringArray v) {
    if (frame_Type.featOkTst && ((frame_Type)jcasType).casFeat_FrameEntries == null)
      jcasType.jcas.throwFeatMissing("FrameEntries", "de.salsa.frame");
    jcasType.ll_cas.ll_setRefValue(addr, ((frame_Type)jcasType).casFeatCode_FrameEntries, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for FrameEntries - gets an indexed value - Contains framentries, each entry has 3 entires itself,
						id;name;idref

						those are separated by a colon ':'
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getFrameEntries(int i) {
    if (frame_Type.featOkTst && ((frame_Type)jcasType).casFeat_FrameEntries == null)
      jcasType.jcas.throwFeatMissing("FrameEntries", "de.salsa.frame");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((frame_Type)jcasType).casFeatCode_FrameEntries), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((frame_Type)jcasType).casFeatCode_FrameEntries), i);}

  /** indexed setter for FrameEntries - sets an indexed value - Contains framentries, each entry has 3 entires itself,
						id;name;idref

						those are separated by a colon ':'
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setFrameEntries(int i, String v) { 
    if (frame_Type.featOkTst && ((frame_Type)jcasType).casFeat_FrameEntries == null)
      jcasType.jcas.throwFeatMissing("FrameEntries", "de.salsa.frame");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((frame_Type)jcasType).casFeatCode_FrameEntries), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((frame_Type)jcasType).casFeatCode_FrameEntries), i, v);}
  }

    