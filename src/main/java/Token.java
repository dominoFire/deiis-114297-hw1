

/* First created by JCasGen Fri Feb 14 21:01:45 CST 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** A word token that has a start and endIndex
 * Updated by JCasGen Fri Feb 14 21:01:50 CST 2014
 * XML source: /home/perez/ITAM/DEIIS/workspace/hw1-114297/src/main/resources/hw1-114297-typesystem.xml
 * @generated */
public class Token extends Annotation {
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
  //* Feature: startIdx

  /** getter for startIdx - gets The index the token starts in the text
   * @generated
   * @return value of the feature 
   */
  public int getStartIdx() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_startIdx == null)
      jcasType.jcas.throwFeatMissing("startIdx", "Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_startIdx);}
    
  /** setter for startIdx - sets The index the token starts in the text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartIdx(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_startIdx == null)
      jcasType.jcas.throwFeatMissing("startIdx", "Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_startIdx, v);}    
   
    
  //*--------------*
  //* Feature: endIdx

  /** getter for endIdx - gets The index the token ends in the text
   * @generated
   * @return value of the feature 
   */
  public int getEndIdx() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_endIdx == null)
      jcasType.jcas.throwFeatMissing("endIdx", "Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_endIdx);}
    
  /** setter for endIdx - sets The index the token ends in the text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndIdx(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_endIdx == null)
      jcasType.jcas.throwFeatMissing("endIdx", "Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_endIdx, v);}    
  }

    