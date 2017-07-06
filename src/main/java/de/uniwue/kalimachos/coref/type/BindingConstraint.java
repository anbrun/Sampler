

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
public class BindingConstraint extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BindingConstraint.class);
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
  protected BindingConstraint() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public BindingConstraint(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public BindingConstraint(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public BindingConstraint(JCas jcas, int begin, int end) {
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
  //* Feature: IsCoreferent

  /** getter for IsCoreferent - gets 
   * @generated
   * @return value of the feature 
   */
  public String getIsCoreferent() {
    if (BindingConstraint_Type.featOkTst && ((BindingConstraint_Type)jcasType).casFeat_IsCoreferent == null)
      jcasType.jcas.throwFeatMissing("IsCoreferent", "de.uniwue.kalimachos.coref.type.BindingConstraint");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BindingConstraint_Type)jcasType).casFeatCode_IsCoreferent);}
    
  /** setter for IsCoreferent - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsCoreferent(String v) {
    if (BindingConstraint_Type.featOkTst && ((BindingConstraint_Type)jcasType).casFeat_IsCoreferent == null)
      jcasType.jcas.throwFeatMissing("IsCoreferent", "de.uniwue.kalimachos.coref.type.BindingConstraint");
    jcasType.ll_cas.ll_setStringValue(addr, ((BindingConstraint_Type)jcasType).casFeatCode_IsCoreferent, v);}    
   
    
  //*--------------*
  //* Feature: Actual

  /** getter for Actual - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getActual() {
    if (BindingConstraint_Type.featOkTst && ((BindingConstraint_Type)jcasType).casFeat_Actual == null)
      jcasType.jcas.throwFeatMissing("Actual", "de.uniwue.kalimachos.coref.type.BindingConstraint");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((BindingConstraint_Type)jcasType).casFeatCode_Actual)));}
    
  /** setter for Actual - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setActual(Annotation v) {
    if (BindingConstraint_Type.featOkTst && ((BindingConstraint_Type)jcasType).casFeat_Actual == null)
      jcasType.jcas.throwFeatMissing("Actual", "de.uniwue.kalimachos.coref.type.BindingConstraint");
    jcasType.ll_cas.ll_setRefValue(addr, ((BindingConstraint_Type)jcasType).casFeatCode_Actual, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Previous

  /** getter for Previous - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getPrevious() {
    if (BindingConstraint_Type.featOkTst && ((BindingConstraint_Type)jcasType).casFeat_Previous == null)
      jcasType.jcas.throwFeatMissing("Previous", "de.uniwue.kalimachos.coref.type.BindingConstraint");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((BindingConstraint_Type)jcasType).casFeatCode_Previous)));}
    
  /** setter for Previous - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrevious(Annotation v) {
    if (BindingConstraint_Type.featOkTst && ((BindingConstraint_Type)jcasType).casFeat_Previous == null)
      jcasType.jcas.throwFeatMissing("Previous", "de.uniwue.kalimachos.coref.type.BindingConstraint");
    jcasType.ll_cas.ll_setRefValue(addr, ((BindingConstraint_Type)jcasType).casFeatCode_Previous, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    