
/* First created by JCasGen Thu Jul 06 15:37:09 CEST 2017 */
package de.salsa;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Thu Jul 06 15:39:03 CEST 2017
 * @generated */
public class token_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.salsa.token");
 
  /** @generated */
  final Feature casFeat_Word;
  /** @generated */
  final int     casFeatCode_Word;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getWord(int addr) {
        if (featOkTst && casFeat_Word == null)
      jcas.throwFeatMissing("Word", "de.salsa.token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Word);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWord(int addr, String v) {
        if (featOkTst && casFeat_Word == null)
      jcas.throwFeatMissing("Word", "de.salsa.token");
    ll_cas.ll_setStringValue(addr, casFeatCode_Word, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Morph;
  /** @generated */
  final int     casFeatCode_Morph;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMorph(int addr) {
        if (featOkTst && casFeat_Morph == null)
      jcas.throwFeatMissing("Morph", "de.salsa.token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Morph);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMorph(int addr, String v) {
        if (featOkTst && casFeat_Morph == null)
      jcas.throwFeatMissing("Morph", "de.salsa.token");
    ll_cas.ll_setStringValue(addr, casFeatCode_Morph, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Gender;
  /** @generated */
  final int     casFeatCode_Gender;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGender(int addr) {
        if (featOkTst && casFeat_Gender == null)
      jcas.throwFeatMissing("Gender", "de.salsa.token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Gender);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGender(int addr, String v) {
        if (featOkTst && casFeat_Gender == null)
      jcas.throwFeatMissing("Gender", "de.salsa.token");
    ll_cas.ll_setStringValue(addr, casFeatCode_Gender, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Case;
  /** @generated */
  final int     casFeatCode_Case;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCase(int addr) {
        if (featOkTst && casFeat_Case == null)
      jcas.throwFeatMissing("Case", "de.salsa.token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Case);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCase(int addr, String v) {
        if (featOkTst && casFeat_Case == null)
      jcas.throwFeatMissing("Case", "de.salsa.token");
    ll_cas.ll_setStringValue(addr, casFeatCode_Case, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Lemma;
  /** @generated */
  final int     casFeatCode_Lemma;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLemma(int addr) {
        if (featOkTst && casFeat_Lemma == null)
      jcas.throwFeatMissing("Lemma", "de.salsa.token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Lemma);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLemma(int addr, String v) {
        if (featOkTst && casFeat_Lemma == null)
      jcas.throwFeatMissing("Lemma", "de.salsa.token");
    ll_cas.ll_setStringValue(addr, casFeatCode_Lemma, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Id;
  /** @generated */
  final int     casFeatCode_Id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_Id == null)
      jcas.throwFeatMissing("Id", "de.salsa.token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_Id == null)
      jcas.throwFeatMissing("Id", "de.salsa.token");
    ll_cas.ll_setStringValue(addr, casFeatCode_Id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Person;
  /** @generated */
  final int     casFeatCode_Person;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPerson(int addr) {
        if (featOkTst && casFeat_Person == null)
      jcas.throwFeatMissing("Person", "de.salsa.token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Person);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPerson(int addr, String v) {
        if (featOkTst && casFeat_Person == null)
      jcas.throwFeatMissing("Person", "de.salsa.token");
    ll_cas.ll_setStringValue(addr, casFeatCode_Person, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Tense;
  /** @generated */
  final int     casFeatCode_Tense;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTense(int addr) {
        if (featOkTst && casFeat_Tense == null)
      jcas.throwFeatMissing("Tense", "de.salsa.token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Tense);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTense(int addr, String v) {
        if (featOkTst && casFeat_Tense == null)
      jcas.throwFeatMissing("Tense", "de.salsa.token");
    ll_cas.ll_setStringValue(addr, casFeatCode_Tense, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Mood;
  /** @generated */
  final int     casFeatCode_Mood;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMood(int addr) {
        if (featOkTst && casFeat_Mood == null)
      jcas.throwFeatMissing("Mood", "de.salsa.token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Mood);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMood(int addr, String v) {
        if (featOkTst && casFeat_Mood == null)
      jcas.throwFeatMissing("Mood", "de.salsa.token");
    ll_cas.ll_setStringValue(addr, casFeatCode_Mood, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Degree;
  /** @generated */
  final int     casFeatCode_Degree;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDegree(int addr) {
        if (featOkTst && casFeat_Degree == null)
      jcas.throwFeatMissing("Degree", "de.salsa.token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Degree);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDegree(int addr, String v) {
        if (featOkTst && casFeat_Degree == null)
      jcas.throwFeatMissing("Degree", "de.salsa.token");
    ll_cas.ll_setStringValue(addr, casFeatCode_Degree, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Pos;
  /** @generated */
  final int     casFeatCode_Pos;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPos(int addr) {
        if (featOkTst && casFeat_Pos == null)
      jcas.throwFeatMissing("Pos", "de.salsa.token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Pos);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPos(int addr, String v) {
        if (featOkTst && casFeat_Pos == null)
      jcas.throwFeatMissing("Pos", "de.salsa.token");
    ll_cas.ll_setStringValue(addr, casFeatCode_Pos, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Number;
  /** @generated */
  final int     casFeatCode_Number;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNumber(int addr) {
        if (featOkTst && casFeat_Number == null)
      jcas.throwFeatMissing("Number", "de.salsa.token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Number);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNumber(int addr, String v) {
        if (featOkTst && casFeat_Number == null)
      jcas.throwFeatMissing("Number", "de.salsa.token");
    ll_cas.ll_setStringValue(addr, casFeatCode_Number, v);}
    
  
 
  /** @generated */
  final Feature casFeat_none;
  /** @generated */
  final int     casFeatCode_none;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNone(int addr) {
        if (featOkTst && casFeat_none == null)
      jcas.throwFeatMissing("none", "de.salsa.token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_none);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNone(int addr, String v) {
        if (featOkTst && casFeat_none == null)
      jcas.throwFeatMissing("none", "de.salsa.token");
    ll_cas.ll_setStringValue(addr, casFeatCode_none, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Word = jcas.getRequiredFeatureDE(casType, "Word", "uima.cas.String", featOkTst);
    casFeatCode_Word  = (null == casFeat_Word) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Word).getCode();

 
    casFeat_Morph = jcas.getRequiredFeatureDE(casType, "Morph", "uima.cas.String", featOkTst);
    casFeatCode_Morph  = (null == casFeat_Morph) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Morph).getCode();

 
    casFeat_Gender = jcas.getRequiredFeatureDE(casType, "Gender", "uima.cas.String", featOkTst);
    casFeatCode_Gender  = (null == casFeat_Gender) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Gender).getCode();

 
    casFeat_Case = jcas.getRequiredFeatureDE(casType, "Case", "uima.cas.String", featOkTst);
    casFeatCode_Case  = (null == casFeat_Case) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Case).getCode();

 
    casFeat_Lemma = jcas.getRequiredFeatureDE(casType, "Lemma", "uima.cas.String", featOkTst);
    casFeatCode_Lemma  = (null == casFeat_Lemma) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Lemma).getCode();

 
    casFeat_Id = jcas.getRequiredFeatureDE(casType, "Id", "uima.cas.String", featOkTst);
    casFeatCode_Id  = (null == casFeat_Id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Id).getCode();

 
    casFeat_Person = jcas.getRequiredFeatureDE(casType, "Person", "uima.cas.String", featOkTst);
    casFeatCode_Person  = (null == casFeat_Person) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Person).getCode();

 
    casFeat_Tense = jcas.getRequiredFeatureDE(casType, "Tense", "uima.cas.String", featOkTst);
    casFeatCode_Tense  = (null == casFeat_Tense) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Tense).getCode();

 
    casFeat_Mood = jcas.getRequiredFeatureDE(casType, "Mood", "uima.cas.String", featOkTst);
    casFeatCode_Mood  = (null == casFeat_Mood) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Mood).getCode();

 
    casFeat_Degree = jcas.getRequiredFeatureDE(casType, "Degree", "uima.cas.String", featOkTst);
    casFeatCode_Degree  = (null == casFeat_Degree) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Degree).getCode();

 
    casFeat_Pos = jcas.getRequiredFeatureDE(casType, "Pos", "uima.cas.String", featOkTst);
    casFeatCode_Pos  = (null == casFeat_Pos) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Pos).getCode();

 
    casFeat_Number = jcas.getRequiredFeatureDE(casType, "Number", "uima.cas.String", featOkTst);
    casFeatCode_Number  = (null == casFeat_Number) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Number).getCode();

 
    casFeat_none = jcas.getRequiredFeatureDE(casType, "none", "uima.cas.String", featOkTst);
    casFeatCode_none  = (null == casFeat_none) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_none).getCode();

  }
}



    