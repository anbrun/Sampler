
/* First created by JCasGen Thu Jul 06 15:37:09 CEST 2017 */
package de.idsma.rw.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** A sample from this text
 * Updated by JCasGen Thu Jul 06 15:39:03 CEST 2017
 * @generated */
public class Sample_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sample.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.idsma.rw.types.Sample");
 
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "de.idsma.rw.types.Sample");
    return ll_cas.ll_getIntValue(addr, casFeatCode_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, int v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "de.idsma.rw.types.Sample");
    ll_cas.ll_setIntValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tok;
  /** @generated */
  final int     casFeatCode_tok;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTok(int addr) {
        if (featOkTst && casFeat_tok == null)
      jcas.throwFeatMissing("tok", "de.idsma.rw.types.Sample");
    return ll_cas.ll_getIntValue(addr, casFeatCode_tok);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTok(int addr, int v) {
        if (featOkTst && casFeat_tok == null)
      jcas.throwFeatMissing("tok", "de.idsma.rw.types.Sample");
    ll_cas.ll_setIntValue(addr, casFeatCode_tok, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Sample_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.Integer", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_tok = jcas.getRequiredFeatureDE(casType, "tok", "uima.cas.Integer", featOkTst);
    casFeatCode_tok  = (null == casFeat_tok) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tok).getCode();

  }
}



    