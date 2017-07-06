

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
public class nonterminal extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(nonterminal.class);
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
  protected nonterminal() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public nonterminal(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public nonterminal(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public nonterminal(JCas jcas, int begin, int end) {
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
  //* Feature: edges

  /** getter for edges - gets An array of edges, each entry consists out of 2 parts
            1. an id of a token ( or a nonterminal itself )
            2. syntatctic
            category of that edge

            both are stored as 1 string with those 2
            attributes separated by a
            colon ':'
   * @generated
   * @return value of the feature 
   */
  public StringArray getEdges() {
    if (nonterminal_Type.featOkTst && ((nonterminal_Type)jcasType).casFeat_edges == null)
      jcasType.jcas.throwFeatMissing("edges", "de.salsa.nonterminal");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((nonterminal_Type)jcasType).casFeatCode_edges)));}
    
  /** setter for edges - sets An array of edges, each entry consists out of 2 parts
            1. an id of a token ( or a nonterminal itself )
            2. syntatctic
            category of that edge

            both are stored as 1 string with those 2
            attributes separated by a
            colon ':' 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEdges(StringArray v) {
    if (nonterminal_Type.featOkTst && ((nonterminal_Type)jcasType).casFeat_edges == null)
      jcasType.jcas.throwFeatMissing("edges", "de.salsa.nonterminal");
    jcasType.ll_cas.ll_setRefValue(addr, ((nonterminal_Type)jcasType).casFeatCode_edges, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for edges - gets an indexed value - An array of edges, each entry consists out of 2 parts
						1. an id of a token ( or a nonterminal itself )
						2. syntatctic
						category of that edge

						both are stored as 1 string with those 2
						attributes separated by a
						colon ':'
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getEdges(int i) {
    if (nonterminal_Type.featOkTst && ((nonterminal_Type)jcasType).casFeat_edges == null)
      jcasType.jcas.throwFeatMissing("edges", "de.salsa.nonterminal");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((nonterminal_Type)jcasType).casFeatCode_edges), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((nonterminal_Type)jcasType).casFeatCode_edges), i);}

  /** indexed setter for edges - sets an indexed value - An array of edges, each entry consists out of 2 parts
						1. an id of a token ( or a nonterminal itself )
						2. syntatctic
						category of that edge

						both are stored as 1 string with those 2
						attributes separated by a
						colon ':'
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setEdges(int i, String v) { 
    if (nonterminal_Type.featOkTst && ((nonterminal_Type)jcasType).casFeat_edges == null)
      jcasType.jcas.throwFeatMissing("edges", "de.salsa.nonterminal");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((nonterminal_Type)jcasType).casFeatCode_edges), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((nonterminal_Type)jcasType).casFeatCode_edges), i, v);}
   
    
  //*--------------*
  //* Feature: Id

  /** getter for Id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (nonterminal_Type.featOkTst && ((nonterminal_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "de.salsa.nonterminal");
    return jcasType.ll_cas.ll_getStringValue(addr, ((nonterminal_Type)jcasType).casFeatCode_Id);}
    
  /** setter for Id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (nonterminal_Type.featOkTst && ((nonterminal_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "de.salsa.nonterminal");
    jcasType.ll_cas.ll_setStringValue(addr, ((nonterminal_Type)jcasType).casFeatCode_Id, v);}    
   
    
  //*--------------*
  //* Feature: Category

  /** getter for Category - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCategory() {
    if (nonterminal_Type.featOkTst && ((nonterminal_Type)jcasType).casFeat_Category == null)
      jcasType.jcas.throwFeatMissing("Category", "de.salsa.nonterminal");
    return jcasType.ll_cas.ll_getStringValue(addr, ((nonterminal_Type)jcasType).casFeatCode_Category);}
    
  /** setter for Category - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategory(String v) {
    if (nonterminal_Type.featOkTst && ((nonterminal_Type)jcasType).casFeat_Category == null)
      jcasType.jcas.throwFeatMissing("Category", "de.salsa.nonterminal");
    jcasType.ll_cas.ll_setStringValue(addr, ((nonterminal_Type)jcasType).casFeatCode_Category, v);}    
  }

    