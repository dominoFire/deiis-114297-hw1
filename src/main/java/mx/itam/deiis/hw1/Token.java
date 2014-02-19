

/* First created by JCasGen Wed Feb 19 10:20:06 CST 2014 */
package mx.itam.deiis.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;


/** Represents a token from a sentence. This token has two indices: the indices inherited from uima.cas.Annotation class, which it points to the absolute reference of the SofA, and the local indices, that points to the indices that a sentence belongs to
 * Updated by JCasGen Wed Feb 19 10:20:06 CST 2014
 * XML source: /home/perez/ITAM/DEIIS/workspace/hw1-114297/src/main/resources/hw1-114297-typesystem.xml
 * @generated */
public class Token extends PipelineAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Token(JCas jcas, int begin, int end) {
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
  //* Feature: localStartIdx

  /** getter for localStartIdx - gets The index that indicates where the token begins in the sentence
   * @generated
   * @return value of the feature 
   */
  public int getLocalStartIdx() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_localStartIdx == null)
      jcasType.jcas.throwFeatMissing("localStartIdx", "mx.itam.deiis.hw1.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_localStartIdx);}
    
  /** setter for localStartIdx - sets The index that indicates where the token begins in the sentence 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLocalStartIdx(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_localStartIdx == null)
      jcasType.jcas.throwFeatMissing("localStartIdx", "mx.itam.deiis.hw1.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_localStartIdx, v);}    
   
    
  //*--------------*
  //* Feature: localStartEnd

  /** getter for localStartEnd - gets The index that indicates where the token ends in the sentence
   * @generated
   * @return value of the feature 
   */
  public int getLocalStartEnd() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_localStartEnd == null)
      jcasType.jcas.throwFeatMissing("localStartEnd", "mx.itam.deiis.hw1.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_localStartEnd);}
    
  /** setter for localStartEnd - sets The index that indicates where the token ends in the sentence 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLocalStartEnd(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_localStartEnd == null)
      jcasType.jcas.throwFeatMissing("localStartEnd", "mx.itam.deiis.hw1.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_localStartEnd, v);}    
   
    
  //*--------------*
  //* Feature: sentence

  /** getter for sentence - gets The sentence that this token belongs to
   * @generated
   * @return value of the feature 
   */
  public Sentence getSentence() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "mx.itam.deiis.hw1.Token");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Token_Type)jcasType).casFeatCode_sentence)));}
    
  /** setter for sentence - sets The sentence that this token belongs to 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentence(Sentence v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "mx.itam.deiis.hw1.Token");
    jcasType.ll_cas.ll_setRefValue(addr, ((Token_Type)jcasType).casFeatCode_sentence, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: ngrams

  /** getter for ngrams - gets List of n-grams that references to this token
   * @generated
   * @return value of the feature 
   */
  public FSList getNgrams() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "mx.itam.deiis.hw1.Token");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Token_Type)jcasType).casFeatCode_ngrams)));}
    
  /** setter for ngrams - sets List of n-grams that references to this token 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNgrams(FSList v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "mx.itam.deiis.hw1.Token");
    jcasType.ll_cas.ll_setRefValue(addr, ((Token_Type)jcasType).casFeatCode_ngrams, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    