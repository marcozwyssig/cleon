package cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Assessment extends DynamicResource implements IAssessment {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAssessment> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAssessment>() {
    
    @Override
    public IAssessment create() {
      return new Assessment();
    }
    
    @Override
    public IAssessment create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Assessment(resourceRepository, resource);
    }
  
  };

  public Assessment() {
    super(IAssessment.TYPE_ID);
  }
  
  public Assessment(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAssessment.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.action.javamodel.IAction selectActions() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.action.javamodel.IAction.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_actions);
  }

  public Assessment setActions(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.action.javamodel.IAction actions) {
    _setSingle(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_actions, actions);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis selectAnalysis() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_analysis);
  }

  public Assessment setAnalysis(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis analysis) {
    _setSingle(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_analysis, analysis);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisk selectRisk() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisk.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_risk);
  }

  public Assessment setRisk(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisk risk) {
    _setSingle(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_risk, risk);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Assessment setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Assessment setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.action.javamodel.IAction.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_actions, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_analysis, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisk.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_risk, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.javamodel.IAssessment> selectToMeRisk(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisk object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.javamodel.IAssessment.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_risk, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.javamodel.IAssessment selectToMeAnalysis(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.javamodel.IAssessment.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_analysis, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.javamodel.IAssessment selectToMeActions(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.action.javamodel.IAction object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.javamodel.IAssessment.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_actions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2b557b98-324a-11e6-ab4d-73a9260c8088,kKc3O59EBqOaCwuTR4M1/lJrSQI=] */
