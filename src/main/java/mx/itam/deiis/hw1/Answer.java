

/* First created by JCasGen Wed Feb 19 10:20:06 CST 2014 */
package mx.itam.deiis.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** A possible answer that responds to a specific question
 * Updated by JCasGen Wed Feb 19 10:20:06 CST 2014
 * XML source: /home/perez/ITAM/DEIIS/workspace/hw1-114297/src/main/resources/hw1-114297-typesystem.xml
 * @generated */
public class Answer extends PipelineAnnotation {
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

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: isCorrect

  /** getter for isCorrect - gets Indicates if this answer is correct for a specific cuestion
   * @generated
   * @return value of the feature 
   */
  public boolean getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "mx.itam.deiis.hw1.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect);}
    
  /** setter for isCorrect - sets Indicates if this answer is correct for a specific cuestion 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "mx.itam.deiis.hw1.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect, v);}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets A special score that indicates the possible degree of certainty that answer a specific question
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "mx.itam.deiis.hw1.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets A special score that indicates the possible degree of certainty that answer a specific question 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "mx.itam.deiis.hw1.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: sentence

  /** getter for sentence - gets The sentence that forms the answer
   * @generated
   * @return value of the feature 
   */
  public Sentence getSentence() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "mx.itam.deiis.hw1.Answer");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_sentence)));}
    
  /** setter for sentence - sets The sentence that forms the answer 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentence(Sentence v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "mx.itam.deiis.hw1.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_sentence, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: question

  /** getter for question - gets The question that this answer belongs to
   * @generated
   * @return value of the feature 
   */
  public Question getQuestion() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "mx.itam.deiis.hw1.Answer");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_question)));}
    
  /** setter for question - sets The question that this answer belongs to 
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuestion(Question v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "mx.itam.deiis.hw1.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_question, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    