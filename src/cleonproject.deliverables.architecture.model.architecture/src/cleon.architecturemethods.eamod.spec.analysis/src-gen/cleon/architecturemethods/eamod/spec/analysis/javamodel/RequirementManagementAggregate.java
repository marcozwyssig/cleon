package cleon.architecturemethods.eamod.spec.analysis.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RequirementManagementAggregate extends DynamicResource implements IRequirementManagementAggregate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementManagementAggregate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementManagementAggregate>() {
    
    @Override
    public IRequirementManagementAggregate create() {
      return new RequirementManagementAggregate();
    }
    
    @Override
    public IRequirementManagementAggregate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RequirementManagementAggregate(resourceRepository, resource);
    }
  
  };

  public RequirementManagementAggregate() {
    super(IRequirementManagementAggregate.TYPE_ID);
  }
  
  public RequirementManagementAggregate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequirementManagementAggregate.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.IAbstractCriteria> selectCriterias() {
    return _getList(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.IAbstractCriteria.class, cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.CriteriasPackage.CriteriaAggregateAware_criterias);
  }

  public RequirementManagementAggregate setCriterias(java.util.List<? extends cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.IAbstractCriteria> criterias) {
    _setList(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.CriteriasPackage.CriteriaAggregateAware_criterias, criterias);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.analysis.javamodel.IPriorityWeighting> selectPriorityWeighting() {
    return _getMap(cleon.architecturemethods.eamod.spec.analysis.javamodel.IPriorityWeighting.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementManagementAggregate_priorityWeighting);
  }

  public RequirementManagementAggregate setPriorityWeighting(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.analysis.javamodel.IPriorityWeighting> priorityWeighting) {
    _setMap(cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementManagementAggregate_priorityWeighting, priorityWeighting);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagement selectRequirementsManagement() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagement.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementManagementAggregate_requirementsManagement);
  }

  public RequirementManagementAggregate setRequirementsManagement(cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagement requirementsManagement) {
    _setSingle(cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementManagementAggregate_requirementsManagement, requirementsManagement);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.analysis.javamodel.ISubjectAreaAggregate> selectSubjectAreaAggregate() {
    return _getMap(cleon.architecturemethods.eamod.spec.analysis.javamodel.ISubjectAreaAggregate.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementManagementAggregate_subjectAreaAggregate);
  }

  public RequirementManagementAggregate setSubjectAreaAggregate(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.analysis.javamodel.ISubjectAreaAggregate> subjectAreaAggregate) {
    _setMap(cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementManagementAggregate_subjectAreaAggregate, subjectAreaAggregate);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RequirementManagementAggregate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.IAbstractCriteria.class, cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.CriteriasPackage.CriteriaAggregateAware_criterias, visitor);
    _acceptMap(cleon.architecturemethods.eamod.spec.analysis.javamodel.IPriorityWeighting.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementManagementAggregate_priorityWeighting, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagement.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementManagementAggregate_requirementsManagement, visitor);
    _acceptMap(cleon.architecturemethods.eamod.spec.analysis.javamodel.ISubjectAreaAggregate.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementManagementAggregate_subjectAreaAggregate, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementManagementAggregate> selectToMeRequirementsManagement(cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagement object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementManagementAggregate.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementManagementAggregate_requirementsManagement, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementManagementAggregate selectToMePriorityWeighting(cleon.architecturemethods.eamod.spec.analysis.javamodel.IPriorityWeighting object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementManagementAggregate.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementManagementAggregate_priorityWeighting, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementManagementAggregate selectToMeSubjectAreaAggregate(cleon.architecturemethods.eamod.spec.analysis.javamodel.ISubjectAreaAggregate object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementManagementAggregate.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementManagementAggregate_subjectAreaAggregate, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,410eee3c-14be-11e9-8da6-cf576bcae0a4,2PT9MpExJzAyhOMoZA2fytvNIjA=] */
