

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
public class DependencyParse extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DependencyParse.class);
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
  protected DependencyParse() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DependencyParse(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DependencyParse(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DependencyParse(JCas jcas, int begin, int end) {
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
  //* Feature: Headname

  /** getter for Headname - gets 
   * @generated
   * @return value of the feature 
   */
  public String getHeadname() {
    if (DependencyParse_Type.featOkTst && ((DependencyParse_Type)jcasType).casFeat_Headname == null)
      jcasType.jcas.throwFeatMissing("Headname", "de.uniwue.kalimachos.coref.type.DependencyParse");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DependencyParse_Type)jcasType).casFeatCode_Headname);}
    
  /** setter for Headname - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHeadname(String v) {
    if (DependencyParse_Type.featOkTst && ((DependencyParse_Type)jcasType).casFeat_Headname == null)
      jcasType.jcas.throwFeatMissing("Headname", "de.uniwue.kalimachos.coref.type.DependencyParse");
    jcasType.ll_cas.ll_setStringValue(addr, ((DependencyParse_Type)jcasType).casFeatCode_Headname, v);}    
   
    
  //*--------------*
  //* Feature: WordNumber

  /** getter for WordNumber - gets 
   * @generated
   * @return value of the feature 
   */
  public int getWordNumber() {
    if (DependencyParse_Type.featOkTst && ((DependencyParse_Type)jcasType).casFeat_WordNumber == null)
      jcasType.jcas.throwFeatMissing("WordNumber", "de.uniwue.kalimachos.coref.type.DependencyParse");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DependencyParse_Type)jcasType).casFeatCode_WordNumber);}
    
  /** setter for WordNumber - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWordNumber(int v) {
    if (DependencyParse_Type.featOkTst && ((DependencyParse_Type)jcasType).casFeat_WordNumber == null)
      jcasType.jcas.throwFeatMissing("WordNumber", "de.uniwue.kalimachos.coref.type.DependencyParse");
    jcasType.ll_cas.ll_setIntValue(addr, ((DependencyParse_Type)jcasType).casFeatCode_WordNumber, v);}    
   
    
  //*--------------*
  //* Feature: DependencyRelation

  /** getter for DependencyRelation - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDependencyRelation() {
    if (DependencyParse_Type.featOkTst && ((DependencyParse_Type)jcasType).casFeat_DependencyRelation == null)
      jcasType.jcas.throwFeatMissing("DependencyRelation", "de.uniwue.kalimachos.coref.type.DependencyParse");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DependencyParse_Type)jcasType).casFeatCode_DependencyRelation);}
    
  /** setter for DependencyRelation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDependencyRelation(String v) {
    if (DependencyParse_Type.featOkTst && ((DependencyParse_Type)jcasType).casFeat_DependencyRelation == null)
      jcasType.jcas.throwFeatMissing("DependencyRelation", "de.uniwue.kalimachos.coref.type.DependencyParse");
    jcasType.ll_cas.ll_setStringValue(addr, ((DependencyParse_Type)jcasType).casFeatCode_DependencyRelation, v);}    
   
    
  //*--------------*
  //* Feature: HeadAnnotation

  /** getter for HeadAnnotation - gets The Annotation where it points to !
   * @generated
   * @return value of the feature 
   */
  public Annotation getHeadAnnotation() {
    if (DependencyParse_Type.featOkTst && ((DependencyParse_Type)jcasType).casFeat_HeadAnnotation == null)
      jcasType.jcas.throwFeatMissing("HeadAnnotation", "de.uniwue.kalimachos.coref.type.DependencyParse");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DependencyParse_Type)jcasType).casFeatCode_HeadAnnotation)));}
    
  /** setter for HeadAnnotation - sets The Annotation where it points to ! 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHeadAnnotation(Annotation v) {
    if (DependencyParse_Type.featOkTst && ((DependencyParse_Type)jcasType).casFeat_HeadAnnotation == null)
      jcasType.jcas.throwFeatMissing("HeadAnnotation", "de.uniwue.kalimachos.coref.type.DependencyParse");
    jcasType.ll_cas.ll_setRefValue(addr, ((DependencyParse_Type)jcasType).casFeatCode_HeadAnnotation, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    