package cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WeightingSubjectAreaAggregate extends DynamicResource implements IWeightingSubjectAreaAggregate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWeightingSubjectAreaAggregate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWeightingSubjectAreaAggregate>() {
    
    @Override
    public IWeightingSubjectAreaAggregate create() {
      return new WeightingSubjectAreaAggregate();
    }
    
    @Override
    public IWeightingSubjectAreaAggregate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WeightingSubjectAreaAggregate(resourceRepository, resource);
    }
  
  };

  public WeightingSubjectAreaAggregate() {
    super(IWeightingSubjectAreaAggregate.TYPE_ID);
  }
  
  public WeightingSubjectAreaAggregate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWeightingSubjectAreaAggregate.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.javamodel.IAbstractCriteria> selectCriterias() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.javamodel.IAbstractCriteria.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.CriteriasPackage.AbstractCriteriaAggregateAware_criterias);
  }

  public WeightingSubjectAreaAggregate setCriterias(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.javamodel.IAbstractCriteria> criterias) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.CriteriasPackage.AbstractCriteriaAggregateAware_criterias, criterias);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementCriteria> selectRequirementCriterias() {
    return _getMap(cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementCriteria.class, cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingSubjectAreaAggregate_requirementCriterias);
  }

  public WeightingSubjectAreaAggregate setRequirementCriterias(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementCriteria> requirementCriterias) {
    _setMap(cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingSubjectAreaAggregate_requirementCriterias, requirementCriterias);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubSubjectArea selectSubSubjectArea() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubSubjectArea.class, cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingSubjectAreaAggregate_subSubjectArea);
  }

  public WeightingSubjectAreaAggregate setSubSubjectArea(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubSubjectArea subSubjectArea) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingSubjectAreaAggregate_subSubjectArea, subSubjectArea);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public WeightingSubjectAreaAggregate setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WeightingSubjectAreaAggregate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria> selectWeightingCriterias() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.WeightingPackage.WeightingCriteriaAggregateAware_weightingCriterias);
  }

  public WeightingSubjectAreaAggregate setWeightingCriterias(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria> weightingCriterias) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.WeightingPackage.WeightingCriteriaAggregateAware_weightingCriterias, weightingCriterias);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementCriteria.class, cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingSubjectAreaAggregate_requirementCriterias, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubSubjectArea.class, cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingSubjectAreaAggregate_subSubjectArea, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingSubjectAreaAggregate selectToMeRequirementCriterias(cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementCriteria object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingSubjectAreaAggregate.class, cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingSubjectAreaAggregate_requirementCriterias, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingSubjectAreaAggregate> selectToMeSubSubjectArea(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubSubjectArea object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingSubjectAreaAggregate.class, cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingSubjectAreaAggregate_subSubjectArea, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1e2f32b0-a6f8-11e8-9c81-8bd68c62e435,Mb/VxPxIJWNl07H2NgpnIIRN980=] */
