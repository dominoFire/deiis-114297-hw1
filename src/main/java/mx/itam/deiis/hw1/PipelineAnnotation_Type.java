
/* First created by JCasGen Wed Feb 19 10:20:06 CST 2014 */
package mx.itam.deiis.hw1;

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

/** This Type stores the name of the annotator that generates the annotation. 
Also, this type has a slot (attribute) for storing the confidence evaluated by the creating annotator.
All classes from Homework 1 must inherit this Type.
 * Updated by JCasGen Wed Feb 19 10:20:06 CST 2014
 * @generated */
public class PipelineAnnotation_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (PipelineAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = PipelineAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new PipelineAnnotation(addr, PipelineAnnotation_Type.this);
  			   PipelineAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new PipelineAnnotation(addr, PipelineAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = PipelineAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("mx.itam.deiis.hw1.PipelineAnnotation");
 
  /** @generated */
  final Feature casFeat_pipelineCreator;
  /** @generated */
  final int     casFeatCode_pipelineCreator;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPipelineCreator(int addr) {
        if (featOkTst && casFeat_pipelineCreator == null)
      jcas.throwFeatMissing("pipelineCreator", "mx.itam.deiis.hw1.PipelineAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pipelineCreator);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPipelineCreator(int addr, String v) {
        if (featOkTst && casFeat_pipelineCreator == null)
      jcas.throwFeatMissing("pipelineCreator", "mx.itam.deiis.hw1.PipelineAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_pipelineCreator, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidenceScore;
  /** @generated */
  final int     casFeatCode_confidenceScore;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getConfidenceScore(int addr) {
        if (featOkTst && casFeat_confidenceScore == null)
      jcas.throwFeatMissing("confidenceScore", "mx.itam.deiis.hw1.PipelineAnnotation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidenceScore);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidenceScore(int addr, double v) {
        if (featOkTst && casFeat_confidenceScore == null)
      jcas.throwFeatMissing("confidenceScore", "mx.itam.deiis.hw1.PipelineAnnotation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidenceScore, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public PipelineAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_pipelineCreator = jcas.getRequiredFeatureDE(casType, "pipelineCreator", "uima.cas.String", featOkTst);
    casFeatCode_pipelineCreator  = (null == casFeat_pipelineCreator) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pipelineCreator).getCode();

 
    casFeat_confidenceScore = jcas.getRequiredFeatureDE(casType, "confidenceScore", "uima.cas.Double", featOkTst);
    casFeatCode_confidenceScore  = (null == casFeat_confidenceScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidenceScore).getCode();

  }
}



    