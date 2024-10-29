package cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class KnockoutSubjectAreaAggregate extends DynamicResource implements IKnockoutSubjectAreaAggregate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IKnockoutSubjectAreaAggregate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IKnockoutSubjectAreaAggregate>() {
    
    @Override
    public IKnockoutSubjectAreaAggregate create() {
      return new KnockoutSubjectAreaAggregate();
    }
    
    @Override
    public IKnockoutSubjectAreaAggregate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new KnockoutSubjectAreaAggregate(resourceRepository, resource);
    }
  
  };

  public KnockoutSubjectAreaAggregate() {
    super(IKnockoutSubjectAreaAggregate.TYPE_ID);
  }
  
  public KnockoutSubjectAreaAggregate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IKnockoutSubjectAreaAggregate.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.javamodel.IAbstractCriteria> selectCriterias() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.javamodel.IAbstractCriteria.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.CriteriasPackage.AbstractCriteriaAggregateAware_criterias);
  }

  public KnockoutSubjectAreaAggregate setCriterias(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.javamodel.IAbstractCriteria> criterias) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.CriteriasPackage.AbstractCriteriaAggregateAware_criterias, criterias);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteria> selectKnockoutCriterias() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteria.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.KnockoutPackage.KnockoutCriteriaAggregateAware_knockoutCriterias);
  }

  public KnockoutSubjectAreaAggregate setKnockoutCriterias(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteria> knockoutCriterias) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.KnockoutPackage.KnockoutCriteriaAggregateAware_knockoutCriterias, knockoutCriterias);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutRequirementCriteria> selectRequirementCriterias() {
    return _getMap(cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutRequirementCriteria.class, cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.KnockoutPackage.KnockoutSubjectAreaAggregate_requirementCriterias);
  }

  public KnockoutSubjectAreaAggregate setRequirementCriterias(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutRequirementCriteria> requirementCriterias) {
    _setMap(cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.KnockoutPackage.KnockoutSubjectAreaAggregate_requirementCriterias, requirementCriterias);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubSubjectArea selectSubSubjectArea() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubSubjectArea.class, cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.KnockoutPackage.KnockoutSubjectAreaAggregate_subSubjectArea);
  }

  public KnockoutSubjectAreaAggregate setSubSubjectArea(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubSubjectArea subSubjectArea) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.KnockoutPackage.KnockoutSubjectAreaAggregate_subSubjectArea, subSubjectArea);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public KnockoutSubjectAreaAggregate setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public KnockoutSubjectAreaAggregate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutRequirementCriteria.class, cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.KnockoutPackage.KnockoutSubjectAreaAggregate_requirementCriterias, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubSubjectArea.class, cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.KnockoutPackage.KnockoutSubjectAreaAggregate_subSubjectArea, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutSubjectAreaAggregate selectToMeRequirementCriterias(cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutRequirementCriteria object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutSubjectAreaAggregate.class, cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.KnockoutPackage.KnockoutSubjectAreaAggregate_requirementCriterias, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutSubjectAreaAggregate> selectToMeSubSubjectArea(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubSubjectArea object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutSubjectAreaAggregate.class, cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.KnockoutPackage.KnockoutSubjectAreaAggregate_subSubjectArea, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3abda780-202f-11e9-83b3-a16e26b4cc59,fPIw+0vh3rNhBGGzTSy+0nOHZl4=] */
