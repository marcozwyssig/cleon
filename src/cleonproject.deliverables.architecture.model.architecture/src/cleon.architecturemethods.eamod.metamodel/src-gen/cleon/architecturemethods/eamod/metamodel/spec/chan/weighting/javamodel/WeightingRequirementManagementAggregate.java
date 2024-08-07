package cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WeightingRequirementManagementAggregate extends DynamicResource implements IWeightingRequirementManagementAggregate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWeightingRequirementManagementAggregate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWeightingRequirementManagementAggregate>() {
    
    @Override
    public IWeightingRequirementManagementAggregate create() {
      return new WeightingRequirementManagementAggregate();
    }
    
    @Override
    public IWeightingRequirementManagementAggregate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WeightingRequirementManagementAggregate(resourceRepository, resource);
    }
  
  };

  public WeightingRequirementManagementAggregate() {
    super(IWeightingRequirementManagementAggregate.TYPE_ID);
  }
  
  public WeightingRequirementManagementAggregate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWeightingRequirementManagementAggregate.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.javamodel.IAbstractCriteria> selectCriterias() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.javamodel.IAbstractCriteria.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.CriteriasPackage.AbstractCriteriaAggregateAware_criterias);
  }

  public WeightingRequirementManagementAggregate setCriterias(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.javamodel.IAbstractCriteria> criterias) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.CriteriasPackage.AbstractCriteriaAggregateAware_criterias, criterias);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingPriority> selectPriorityWeighting() {
    return _getMap(cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingPriority.class, cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingRequirementManagementAggregate_priorityWeighting);
  }

  public WeightingRequirementManagementAggregate setPriorityWeighting(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingPriority> priorityWeighting) {
    _setMap(cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingRequirementManagementAggregate_priorityWeighting, priorityWeighting);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument selectRequirementsManagement() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingRequirementManagementAggregate_requirementsManagement);
  }

  public WeightingRequirementManagementAggregate setRequirementsManagement(cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument requirementsManagement) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingRequirementManagementAggregate_requirementsManagement, requirementsManagement);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingSubjectAreaAggregate> selectSubjectAreaAggregate() {
    return _getMap(cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingSubjectAreaAggregate.class, cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingRequirementManagementAggregate_subjectAreaAggregate);
  }

  public WeightingRequirementManagementAggregate setSubjectAreaAggregate(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingSubjectAreaAggregate> subjectAreaAggregate) {
    _setMap(cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingRequirementManagementAggregate_subjectAreaAggregate, subjectAreaAggregate);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WeightingRequirementManagementAggregate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria> selectWeightingCriterias() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.WeightingPackage.WeightingCriteriaAggregateAware_weightingCriterias);
  }

  public WeightingRequirementManagementAggregate setWeightingCriterias(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria> weightingCriterias) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.WeightingPackage.WeightingCriteriaAggregateAware_weightingCriterias, weightingCriterias);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingPriority.class, cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingRequirementManagementAggregate_priorityWeighting, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingRequirementManagementAggregate_requirementsManagement, visitor);
    _acceptMap(cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingSubjectAreaAggregate.class, cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingRequirementManagementAggregate_subjectAreaAggregate, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementManagementAggregate> selectToMeRequirementsManagement(cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementManagementAggregate.class, cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingRequirementManagementAggregate_requirementsManagement, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementManagementAggregate selectToMePriorityWeighting(cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingPriority object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementManagementAggregate.class, cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingRequirementManagementAggregate_priorityWeighting, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementManagementAggregate selectToMeSubjectAreaAggregate(cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingSubjectAreaAggregate object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementManagementAggregate.class, cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.WeightingPackage.WeightingRequirementManagementAggregate_subjectAreaAggregate, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,410eee3c-14be-11e9-8da6-cf576bcae0a4,KDlDMSpxtYr6Peb/Y9In9E+uuvE=] */
