package cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RiskAnalysis extends DynamicResource implements IRiskAnalysis {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRiskAnalysis> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRiskAnalysis>() {
    
    @Override
    public IRiskAnalysis create() {
      return new RiskAnalysis();
    }
    
    @Override
    public IRiskAnalysis create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RiskAnalysis(resourceRepository, resource);
    }
  
  };

  public RiskAnalysis() {
    super(IRiskAnalysis.TYPE_ID);
  }
  
  public RiskAnalysis(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRiskAnalysis.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IImpactRate selectImpactRate() {
    return _getSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IImpactRate.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.AnalysisPackage.RiskAnalysis_impactRate);
  }

  public RiskAnalysis setImpactRate(cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IImpactRate impactRate) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.AnalysisPackage.RiskAnalysis_impactRate, impactRate);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IProbabilityOfOccurrence selectProbability() {
    return _getSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IProbabilityOfOccurrence.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.AnalysisPackage.RiskAnalysis_probability);
  }

  public RiskAnalysis setProbability(cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IProbabilityOfOccurrence probability) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.AnalysisPackage.RiskAnalysis_probability, probability);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RiskAnalysis setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IImpactRate.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.AnalysisPackage.RiskAnalysis_impactRate, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IProbabilityOfOccurrence.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.AnalysisPackage.RiskAnalysis_probability, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis> selectToMeProbability(cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IProbabilityOfOccurrence object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.AnalysisPackage.RiskAnalysis_probability, object.getResource());
  }
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis> selectToMeImpactRate(cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IImpactRate object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.AnalysisPackage.RiskAnalysis_impactRate, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6bb1d559-2f04-11e6-8bd9-a77b8d2a3a0e,MbEex9onCN/pIE+t6cByqQWVnug=] */
