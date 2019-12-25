package cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WeightingEvaluation extends DynamicResource implements IWeightingEvaluation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWeightingEvaluation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWeightingEvaluation>() {
    
    @Override
    public IWeightingEvaluation create() {
      return new WeightingEvaluation();
    }
    
    @Override
    public IWeightingEvaluation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WeightingEvaluation(resourceRepository, resource);
    }
  
  };

  public WeightingEvaluation() {
    super(IWeightingEvaluation.TYPE_ID);
  }
  
  public WeightingEvaluation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWeightingEvaluation.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectAssessment() {
    return _getSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.Evaluation_assessment);
  }
    
  public void setAssessment(java.lang.String assessment) {
     _setSingleAttribute(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.Evaluation_assessment, assessment);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria selectCriteria() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.WeightingEvaluation_criteria);
  }

  public WeightingEvaluation setCriteria(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria criteria) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.WeightingEvaluation_criteria, criteria);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IScore selectScore() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IScore.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.WeightingEvaluation_score);
  }

  public WeightingEvaluation setScore(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IScore score) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.WeightingEvaluation_score, score);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public WeightingEvaluation setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WeightingEvaluation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.Evaluation_assessment, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.WeightingEvaluation_criteria, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IScore.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.WeightingEvaluation_score, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IWeightingEvaluation> selectToMeScore(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IScore object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IWeightingEvaluation.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.WeightingEvaluation_score, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IWeightingEvaluation> selectToMeCriteria(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IWeightingEvaluation.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.WeightingEvaluation_criteria, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7f4013d4-3c1a-11e5-9962-cf3035adb922,b6s9MTcDRvrDZZsVGw9PlMFyFeE=] */
