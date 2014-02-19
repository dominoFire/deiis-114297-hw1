

/* First created by JCasGen Fri Feb 14 21:01:45 CST 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** It's composed in tokens
 * Updated by JCasGen Fri Feb 14 21:01:50 CST 2014
 * XML source: /home/perez/ITAM/DEIIS/workspace/hw1-114297/src/main/resources/hw1-114297-typesystem.xml
 * @generated */
public class NGram extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public NGram(JCas jcas, int begin, int end) {
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
  //* Feature: tokens

  /** getter for tokens - gets The tokens that composes tis n-gram
   * @generated
   * @return value of the feature 
   */
  public FSArray getTokens() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "NGram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets The tokens that composes tis n-gram 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokens(FSArray v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokens - gets an indexed value - The tokens that composes tis n-gram
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Token getTokens(int i) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens), i)));}

  /** indexed setter for tokens - sets an indexed value - The tokens that composes tis n-gram
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setTokens(int i, Token v) { 
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: n

  /** getter for n - gets The number of tokens that defines the N-gram

   * @generated
   * @return value of the feature 
   */
  public int getN() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "NGram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGram_Type)jcasType).casFeatCode_n);}
    
  /** setter for n - sets The number of tokens that defines the N-gram
 
   * @generated
   * @param v value to set into the feature 
   */
  public void setN(int v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "NGram");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGram_Type)jcasType).casFeatCode_n, v);}    
  }

    