

/* First created by JCasGen Wed Feb 19 10:20:06 CST 2014 */
package mx.itam.deiis.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** This Type stores the name of the annotator that generates the annotation. 
Also, this type has a slot (attribute) for storing the confidence evaluated by the creating annotator.
All classes from Homework 1 must inherit this Type.
 * Updated by JCasGen Wed Feb 19 10:20:06 CST 2014
 * XML source: /home/perez/ITAM/DEIIS/workspace/hw1-114297/src/main/resources/hw1-114297-typesystem.xml
 * @generated */
public class PipelineAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PipelineAnnotation.class);
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
  protected PipelineAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public PipelineAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public PipelineAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public PipelineAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: pipelineCreator

  /** getter for pipelineCreator - gets Name of the annotator that generates this annotation
   * @generated
   * @return value of the feature 
   */
  public String getPipelineCreator() {
    if (PipelineAnnotation_Type.featOkTst && ((PipelineAnnotation_Type)jcasType).casFeat_pipelineCreator == null)
      jcasType.jcas.throwFeatMissing("pipelineCreator", "mx.itam.deiis.hw1.PipelineAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PipelineAnnotation_Type)jcasType).casFeatCode_pipelineCreator);}
    
  /** setter for pipelineCreator - sets Name of the annotator that generates this annotation 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPipelineCreator(String v) {
    if (PipelineAnnotation_Type.featOkTst && ((PipelineAnnotation_Type)jcasType).casFeat_pipelineCreator == null)
      jcasType.jcas.throwFeatMissing("pipelineCreator", "mx.itam.deiis.hw1.PipelineAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((PipelineAnnotation_Type)jcasType).casFeatCode_pipelineCreator, v);}    
   
    
  //*--------------*
  //* Feature: confidenceScore

  /** getter for confidenceScore - gets the confidence score assigned to the annotation by the component that generates this annotation.
   * @generated
   * @return value of the feature 
   */
  public double getConfidenceScore() {
    if (PipelineAnnotation_Type.featOkTst && ((PipelineAnnotation_Type)jcasType).casFeat_confidenceScore == null)
      jcasType.jcas.throwFeatMissing("confidenceScore", "mx.itam.deiis.hw1.PipelineAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((PipelineAnnotation_Type)jcasType).casFeatCode_confidenceScore);}
    
  /** setter for confidenceScore - sets the confidence score assigned to the annotation by the component that generates this annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidenceScore(double v) {
    if (PipelineAnnotation_Type.featOkTst && ((PipelineAnnotation_Type)jcasType).casFeat_confidenceScore == null)
      jcasType.jcas.throwFeatMissing("confidenceScore", "mx.itam.deiis.hw1.PipelineAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((PipelineAnnotation_Type)jcasType).casFeatCode_confidenceScore, v);}    
  }

    