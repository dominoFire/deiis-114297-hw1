

/* First created by JCasGen Fri Feb 14 21:01:45 CST 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Fri Feb 14 21:01:49 CST 2014
 * XML source: /home/perez/ITAM/DEIIS/workspace/hw1-114297/src/main/resources/hw1-114297-typesystem.xml
 * @generated */
public class Answer extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Answer(JCas jcas) {
    super(jcas);
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
  //* Feature: isCorrect

  /** getter for isCorrect - gets Determines wheter this answers is correct for the question it references
   * @generated
   * @return value of the feature 
   */
  public boolean getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect);}
    
  /** setter for isCorrect - sets Determines wheter this answers is correct for the question it references 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect, v);}    
   
    
  //*--------------*
  //* Feature: question

  /** getter for question - gets The question this answer belongs to
   * @generated
   * @return value of the feature 
   */
  public Question getQuestion() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "Answer");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_question)));}
    
  /** setter for question - sets The question this answer belongs to 
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuestion(Question v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_question, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    