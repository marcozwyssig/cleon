package cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class KnockoutRequirementManagementAggregate extends DynamicResource implements IKnockoutRequirementManagementAggregate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IKnockoutRequirementManagementAggregate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IKnockoutRequirementManagementAggregate>() {
    
    @Override
    public IKnockoutRequirementManagementAggregate create() {
      return new KnockoutRequirementManagementAggregate();
    }
    
    @Override
    public IKnockoutRequirementManagementAggregate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new KnockoutRequirementManagementAggregate(resourceRepository, resource);
    }
  
  };

  public KnockoutRequirementManagementAggregate() {
    super(IKnockoutRequirementManagementAggregate.TYPE_ID);
  }
  
  public KnockoutRequirementManagementAggregate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IKnockoutRequirementManagementAggregate.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.javamodel.IAbstractCriteria> selectCriterias() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.javamodel.IAbstractCriteria.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.CriteriasPackage.AbstractCriteriaAggregateAware_criterias);
  }

  public KnockoutRequirementManagementAggregate setCriterias(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.javamodel.IAbstractCriteria> criterias) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.CriteriasPackage.AbstractCriteriaAggregateAware_criterias, criterias);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteria> selectKnockoutCriterias() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteria.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.KnockoutPackage.KnockoutCriteriaAggregateAware_knockoutCriterias);
  }

  public KnockoutRequirementManagementAggregate setKnockoutCriterias(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteria> knockoutCriterias) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.KnockoutPackage.KnockoutCriteriaAggregateAware_knockoutCriterias, knockoutCriterias);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument selectRequirementsManagement() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.KnockoutPackage.KnockoutRequirementManagementAggregate_requirementsManagement);
  }

  public KnockoutRequirementManagementAggregate setRequirementsManagement(cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument requirementsManagement) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.KnockoutPackage.KnockoutRequirementManagementAggregate_requirementsManagement, requirementsManagement);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutSubjectAreaAggregate> selectSubjectAreaAggregate() {
    return _getMap(cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutSubjectAreaAggregate.class, cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.KnockoutPackage.KnockoutRequirementManagementAggregate_subjectAreaAggregate);
  }

  public KnockoutRequirementManagementAggregate setSubjectAreaAggregate(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutSubjectAreaAggregate> subjectAreaAggregate) {
    _setMap(cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.KnockoutPackage.KnockoutRequirementManagementAggregate_subjectAreaAggregate, subjectAreaAggregate);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public KnockoutRequirementManagementAggregate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.KnockoutPackage.KnockoutRequirementManagementAggregate_requirementsManagement, visitor);
    _acceptMap(cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutSubjectAreaAggregate.class, cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.KnockoutPackage.KnockoutRequirementManagementAggregate_subjectAreaAggregate, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutRequirementManagementAggregate> selectToMeRequirementsManagement(cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutRequirementManagementAggregate.class, cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.KnockoutPackage.KnockoutRequirementManagementAggregate_requirementsManagement, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutRequirementManagementAggregate selectToMeSubjectAreaAggregate(cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutSubjectAreaAggregate object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.javamodel.IKnockoutRequirementManagementAggregate.class, cleon.architecturemethods.eamod.metamodel.spec.chan.knockout.KnockoutPackage.KnockoutRequirementManagementAggregate_subjectAreaAggregate, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3abda764-202f-11e9-83b3-a16e26b4cc59,il0FTy38fDeUVeCRjK5269YEUPE=] */
