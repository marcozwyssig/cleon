package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EvaluationRequirement extends DynamicResource implements IEvaluationRequirement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEvaluationRequirement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEvaluationRequirement>() {
    
    @Override
    public IEvaluationRequirement create() {
      return new EvaluationRequirement();
    }
    
    @Override
    public IEvaluationRequirement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EvaluationRequirement(resourceRepository, resource);
    }
  
  };

  public EvaluationRequirement() {
    super(IEvaluationRequirement.TYPE_ID);
  }
  
  public EvaluationRequirement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEvaluationRequirement.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectFullfilled() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.EvaluationPackage.EvaluationRequirement_fullfilled);
  }

  public EvaluationRequirement setFullfilled(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> fullfilled) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.EvaluationPackage.EvaluationRequirement_fullfilled, fullfilled);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirement selectRequirement() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirement.class, cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.EvaluationPackage.EvaluationRequirement_requirement);
  }

  public EvaluationRequirement setRequirement(cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirement requirement) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.EvaluationPackage.EvaluationRequirement_requirement, requirement);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public EvaluationRequirement setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EvaluationRequirement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.EvaluationPackage.EvaluationRequirement_fullfilled, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirement.class, cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.EvaluationPackage.EvaluationRequirement_requirement, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel.IEvaluationRequirement> selectToMeRequirement(cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirement object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel.IEvaluationRequirement.class, cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.EvaluationPackage.EvaluationRequirement_requirement, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel.IEvaluationRequirement> selectToMeFullfilled(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel.IEvaluationRequirement.class, cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.EvaluationPackage.EvaluationRequirement_fullfilled, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7b37266c-e244-11ef-a500-cb425fc4109d,F5ihRkPH8O3TTGW6nkbd9/4T/ZA=] */
