

/* First created by JCasGen Fri Feb 14 21:01:45 CST 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Fri Feb 14 21:01:50 CST 2014
 * XML source: /home/perez/ITAM/DEIIS/workspace/hw1-114297/src/main/resources/hw1-114297-typesystem.xml
 * @generated */
public class Question extends TOP {
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

  /** getter for numAnswers - gets 
   * @generated
   * @return value of the feature 
   */
  public int getNumAnswers() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_numAnswers == null)
      jcasType.jcas.throwFeatMissing("numAnswers", "Question");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Question_Type)jcasType).casFeatCode_numAnswers);}
    
  /** setter for numAnswers - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNumAnswers(int v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_numAnswers == null)
      jcasType.jcas.throwFeatMissing("numAnswers", "Question");
    jcasType.ll_cas.ll_setIntValue(addr, ((Question_Type)jcasType).casFeatCode_numAnswers, v);}    
   
    
  //*--------------*
  //* Feature: answers

  /** getter for answers - gets The lists of answers that this question have
   * @generated
   * @return value of the feature 
   */
  public FSArray getAnswers() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "Question");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answers)));}
    
  /** setter for answers - sets The lists of answers that this question have 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnswers(FSArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_answers, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answers - gets an indexed value - The lists of answers that this question have
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Answer getAnswers(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answers), i);
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answers), i)));}

  /** indexed setter for answers - sets an indexed value - The lists of answers that this question have
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAnswers(int i, Answer v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answers), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answers), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    