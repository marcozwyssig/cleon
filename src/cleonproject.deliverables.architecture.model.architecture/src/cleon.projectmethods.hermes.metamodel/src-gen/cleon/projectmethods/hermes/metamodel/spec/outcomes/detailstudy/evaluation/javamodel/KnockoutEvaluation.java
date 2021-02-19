package cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class KnockoutEvaluation extends DynamicResource implements IKnockoutEvaluation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IKnockoutEvaluation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IKnockoutEvaluation>() {
    
    @Override
    public IKnockoutEvaluation create() {
      return new KnockoutEvaluation();
    }
    
    @Override
    public IKnockoutEvaluation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new KnockoutEvaluation(resourceRepository, resource);
    }
  
  };

  public KnockoutEvaluation() {
    super(IKnockoutEvaluation.TYPE_ID);
  }
  
  public KnockoutEvaluation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IKnockoutEvaluation.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectAssessment() {
    return _getSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.Evaluation_assessment);
  }
    
  public void setAssessment(java.lang.String assessment) {
     _setSingleAttribute(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.Evaluation_assessment, assessment);
  }

  @Override
  public java.lang.Boolean selectFulfiils() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.KnockoutEvaluation_fulfiils);
  }
    
  public void setFulfiils(java.lang.Boolean fulfiils) {
     _setSingleAttribute(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.KnockoutEvaluation_fulfiils, fulfiils);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteria selectCriteria() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteria.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.KnockoutEvaluation_criteria);
  }

  public KnockoutEvaluation setCriteria(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteria criteria) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.KnockoutEvaluation_criteria, criteria);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public KnockoutEvaluation setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public KnockoutEvaluation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.Evaluation_assessment, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.KnockoutEvaluation_fulfiils, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteria.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.KnockoutEvaluation_criteria, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IKnockoutEvaluation> selectToMeCriteria(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteria object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IKnockoutEvaluation.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.KnockoutEvaluation_criteria, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2344ed45-1fa7-11e9-ac4e-716424f48a26,pqdfAAgER1rc4L1F3GkOfN+Dnt0=] */
