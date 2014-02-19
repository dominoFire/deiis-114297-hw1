

/* First created by JCasGen Wed Feb 19 10:20:06 CST 2014 */
package mx.itam.deiis.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;


/** Represents a Question, which it consists of one Sentence
 * Updated by JCasGen Wed Feb 19 10:20:06 CST 2014
 * XML source: /home/perez/ITAM/DEIIS/workspace/hw1-114297/src/main/resources/hw1-114297-typesystem.xml
 * @generated */
public class Question extends PipelineAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Question(JCas jcas, int begin, int end) {
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
  //* Feature: numAnswers

  /** getter for numAnswers - gets Number of answers found for this question, without taking in consideration whether or not they are correct
   * @generated
   * @return value of the feature 
   */
  public int getNumAnswers() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_numAnswers == null)
      jcasType.jcas.throwFeatMissing("numAnswers", "mx.itam.deiis.hw1.Question");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Question_Type)jcasType).casFeatCode_numAnswers);}
    
  /** setter for numAnswers - sets Number of answers found for this question, without taking in consideration whether or not they are correct 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNumAnswers(int v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_numAnswers == null)
      jcasType.jcas.throwFeatMissing("numAnswers", "mx.itam.deiis.hw1.Question");
    jcasType.ll_cas.ll_setIntValue(addr, ((Question_Type)jcasType).casFeatCode_numAnswers, v);}    
   
    
  //*--------------*
  //* Feature: precisionAtN

  /** getter for precisionAtN - gets The precition@N score indicates the proportion of correct answers from N retrieved answers for this question
   * @generated
   * @return value of the feature 
   */
  public double getPrecisionAtN() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_precisionAtN == null)
      jcasType.jcas.throwFeatMissing("precisionAtN", "mx.itam.deiis.hw1.Question");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Question_Type)jcasType).casFeatCode_precisionAtN);}
    
  /** setter for precisionAtN - sets The precition@N score indicates the proportion of correct answers from N retrieved answers for this question 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrecisionAtN(double v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_precisionAtN == null)
      jcasType.jcas.throwFeatMissing("precisionAtN", "mx.itam.deiis.hw1.Question");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Question_Type)jcasType).casFeatCode_precisionAtN, v);}    
   
    
  //*--------------*
  //* Feature: sentence

  /** getter for sentence - gets The sentence that forms the question
   * @generated
   * @return value of the feature 
   */
  public Sentence getSentence() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "mx.itam.deiis.hw1.Question");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_sentence)));}
    
  /** setter for sentence - sets The sentence that forms the question 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentence(Sentence v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "mx.itam.deiis.hw1.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_sentence, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: answers

  /** getter for answers - gets List of possible answers for this question, correct or incorrect
   * @generated
   * @return value of the feature 
   */
  public FSList getAnswers() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "mx.itam.deiis.hw1.Question");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answers)));}
    
  /** setter for answers - sets List of possible answers for this question, correct or incorrect 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnswers(FSList v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "mx.itam.deiis.hw1.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_answers, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    