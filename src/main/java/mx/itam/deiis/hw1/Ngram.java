

/* First created by JCasGen Wed Feb 19 10:20:06 CST 2014 */
package mx.itam.deiis.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** Represents a set of consecutive tokens, useful for text retrieval analisys. This Ngram class supports 1-grams, 2-grams and 3-grams.
 * Updated by JCasGen Wed Feb 19 10:20:06 CST 2014
 * XML source: /home/perez/ITAM/DEIIS/workspace/hw1-114297/src/main/resources/hw1-114297-typesystem.xml
 * @generated */
public class Ngram extends PipelineAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Ngram.class);
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
  protected Ngram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Ngram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Ngram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Ngram(JCas jcas, int begin, int end) {
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
  //* Feature: n

  /** getter for n - gets Number of tokens that contains this n-gram
   * @generated
   * @return value of the feature 
   */
  public int getN() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "mx.itam.deiis.hw1.Ngram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_n);}
    
  /** setter for n - sets Number of tokens that contains this n-gram 
   * @generated
   * @param v value to set into the feature 
   */
  public void setN(int v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "mx.itam.deiis.hw1.Ngram");
    jcasType.ll_cas.ll_setIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_n, v);}    
   
    
  //*--------------*
  //* Feature: tokens

  /** getter for tokens - gets The tokens that forms this n-gram, sorted by appareance order. This array can contain up to 3 tokens
   * @generated
   * @return value of the feature 
   */
  public FSArray getTokens() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "mx.itam.deiis.hw1.Ngram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets The tokens that forms this n-gram, sorted by appareance order. This array can contain up to 3 tokens 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokens(FSArray v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "mx.itam.deiis.hw1.Ngram");
    jcasType.ll_cas.ll_setRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokens - gets an indexed value - The tokens that forms this n-gram, sorted by appareance order. This array can contain up to 3 tokens
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Token getTokens(int i) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "mx.itam.deiis.hw1.Ngram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_tokens), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_tokens), i)));}

  /** indexed setter for tokens - sets an indexed value - The tokens that forms this n-gram, sorted by appareance order. This array can contain up to 3 tokens
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setTokens(int i, Token v) { 
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "mx.itam.deiis.hw1.Ngram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_tokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_tokens), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    