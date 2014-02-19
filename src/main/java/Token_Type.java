
/* First created by JCasGen Fri Feb 14 21:01:45 CST 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** A word token that has a start and endIndex
 * Updated by JCasGen Fri Feb 14 21:01:50 CST 2014
 * @generated */
public class Token_Type extends Annotation_Type {
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
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Token");
 
  /** @generated */
  final Feature casFeat_startIdx;
  /** @generated */
  final int     casFeatCode_startIdx;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStartIdx(int addr) {
        if (featOkTst && casFeat_startIdx == null)
      jcas.throwFeatMissing("startIdx", "Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_startIdx);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStartIdx(int addr, int v) {
        if (featOkTst && casFeat_startIdx == null)
      jcas.throwFeatMissing("startIdx", "Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_startIdx, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endIdx;
  /** @generated */
  final int     casFeatCode_endIdx;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEndIdx(int addr) {
        if (featOkTst && casFeat_endIdx == null)
      jcas.throwFeatMissing("endIdx", "Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_endIdx);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndIdx(int addr, int v) {
        if (featOkTst && casFeat_endIdx == null)
      jcas.throwFeatMissing("endIdx", "Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_endIdx, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_startIdx = jcas.getRequiredFeatureDE(casType, "startIdx", "uima.cas.Integer", featOkTst);
    casFeatCode_startIdx  = (null == casFeat_startIdx) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startIdx).getCode();

 
    casFeat_endIdx = jcas.getRequiredFeatureDE(casType, "endIdx", "uima.cas.Integer", featOkTst);
    casFeatCode_endIdx  = (null == casFeat_endIdx) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endIdx).getCode();

  }
}



    