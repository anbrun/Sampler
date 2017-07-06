

/* First created by JCasGen Thu Jul 06 15:37:09 CEST 2017 */
package de.uniwue.dw.segmentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Jul 06 15:39:03 CEST 2017
 * XML source: D:/Github/Sampler/resources/RWProjektTypeSystem.xml
 * @generated */
public class SectionG extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SectionG.class);
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
  protected SectionG() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SectionG(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SectionG(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SectionG(JCas jcas, int begin, int end) {
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
  //* Feature: category

  /** getter for category - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCategory() {
    if (SectionG_Type.featOkTst && ((SectionG_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "de.uniwue.dw.segmentation.SectionG");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SectionG_Type)jcasType).casFeatCode_category);}
    
  /** setter for category - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategory(String v) {
    if (SectionG_Type.featOkTst && ((SectionG_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "de.uniwue.dw.segmentation.SectionG");
    jcasType.ll_cas.ll_setStringValue(addr, ((SectionG_Type)jcasType).casFeatCode_category, v);}    
  }

    