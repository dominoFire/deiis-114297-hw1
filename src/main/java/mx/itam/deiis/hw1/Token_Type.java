
/* First created by JCasGen Wed Feb 19 10:20:06 CST 2014 */
package mx.itam.deiis.hw1;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Represents a token from a sentence. This token has two indices: the indices inherited from uima.cas.Annotation class, which it points to the absolute reference of the SofA, and the local indices, that points to the indices that a sentence belongs to
 * Updated by JCasGen Wed Feb 19 10:20:06 CST 2014
 * @generated */
public class Token_Type extends PipelineAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Token_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Token_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Token(addr, Token_Type.this);
  			   Token_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Token(addr, Token_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("mx.itam.deiis.hw1.Token");
 
  /** @generated */
  final Feature casFeat_localStartIdx;
  /** @generated */
  final int     casFeatCode_localStartIdx;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLocalStartIdx(int addr) {
        if (featOkTst && casFeat_localStartIdx == null)
      jcas.throwFeatMissing("localStartIdx", "mx.itam.deiis.hw1.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_localStartIdx);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLocalStartIdx(int addr, int v) {
        if (featOkTst && casFeat_localStartIdx == null)
      jcas.throwFeatMissing("localStartIdx", "mx.itam.deiis.hw1.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_localStartIdx, v);}
    
  
 
  /** @generated */
  final Feature casFeat_localStartEnd;
  /** @generated */
  final int     casFeatCode_localStartEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLocalStartEnd(int addr) {
        if (featOkTst && casFeat_localStartEnd == null)
      jcas.throwFeatMissing("localStartEnd", "mx.itam.deiis.hw1.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_localStartEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLocalStartEnd(int addr, int v) {
        if (featOkTst && casFeat_localStartEnd == null)
      jcas.throwFeatMissing("localStartEnd", "mx.itam.deiis.hw1.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_localStartEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sentence;
  /** @generated */
  final int     casFeatCode_sentence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSentence(int addr) {
        if (featOkTst && casFeat_sentence == null)
      jcas.throwFeatMissing("sentence", "mx.itam.deiis.hw1.Token");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sentence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentence(int addr, int v) {
        if (featOkTst && casFeat_sentence == null)
      jcas.throwFeatMissing("sentence", "mx.itam.deiis.hw1.Token");
    ll_cas.ll_setRefValue(addr, casFeatCode_sentence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ngrams;
  /** @generated */
  final int     casFeatCode_ngrams;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getNgrams(int addr) {
        if (featOkTst && casFeat_ngrams == null)
      jcas.throwFeatMissing("ngrams", "mx.itam.deiis.hw1.Token");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ngrams);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNgrams(int addr, int v) {
        if (featOkTst && casFeat_ngrams == null)
      jcas.throwFeatMissing("ngrams", "mx.itam.deiis.hw1.Token");
    ll_cas.ll_setRefValue(addr, casFeatCode_ngrams, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_localStartIdx = jcas.getRequiredFeatureDE(casType, "localStartIdx", "uima.cas.Integer", featOkTst);
    casFeatCode_localStartIdx  = (null == casFeat_localStartIdx) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_localStartIdx).getCode();

 
    casFeat_localStartEnd = jcas.getRequiredFeatureDE(casType, "localStartEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_localStartEnd  = (null == casFeat_localStartEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_localStartEnd).getCode();

 
    casFeat_sentence = jcas.getRequiredFeatureDE(casType, "sentence", "mx.itam.deiis.hw1.Sentence", featOkTst);
    casFeatCode_sentence  = (null == casFeat_sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentence).getCode();

 
    casFeat_ngrams = jcas.getRequiredFeatureDE(casType, "ngrams", "uima.cas.FSList", featOkTst);
    casFeatCode_ngrams  = (null == casFeat_ngrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ngrams).getCode();

  }
}



    