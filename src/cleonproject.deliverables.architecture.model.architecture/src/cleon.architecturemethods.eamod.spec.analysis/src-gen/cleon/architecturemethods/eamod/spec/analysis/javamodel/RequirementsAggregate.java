package cleon.architecturemethods.eamod.spec.analysis.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RequirementsAggregate extends DynamicResource implements IRequirementsAggregate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementsAggregate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementsAggregate>() {
    
    @Override
    public IRequirementsAggregate create() {
      return new RequirementsAggregate();
    }
    
    @Override
    public IRequirementsAggregate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RequirementsAggregate(resourceRepository, resource);
    }
  
  };

  public RequirementsAggregate() {
    super(IRequirementsAggregate.TYPE_ID);
  }
  
  public RequirementsAggregate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequirementsAggregate.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IAbstractCriteria> selectCriterias() {
    return _getList(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IAbstractCriteria.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.CriteriaAggregateAware_criterias);
  }

  public RequirementsAggregate setCriterias(java.util.List<? extends cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IAbstractCriteria> criterias) {
    _setList(cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.CriteriaAggregateAware_criterias, criterias);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.analysis.javamodel.IPriorityWeighting> selectPriorityWeighting() {
    return _getMap(cleon.architecturemethods.eamod.spec.analysis.javamodel.IPriorityWeighting.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementsAggregate_priorityWeighting);
  }

  public RequirementsAggregate setPriorityWeighting(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.analysis.javamodel.IPriorityWeighting> priorityWeighting) {
    _setMap(cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementsAggregate_priorityWeighting, priorityWeighting);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria> selectRequirementCriterias() {
    return _getMap(cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementsAggregate_requirementCriterias);
  }

  public RequirementsAggregate setRequirementCriterias(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria> requirementCriterias) {
    _setMap(cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementsAggregate_requirementCriterias, requirementCriterias);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea selectSubjectArea() {
    return _getSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementsAggregate_subjectArea);
  }

  public RequirementsAggregate setSubjectArea(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea subjectArea) {
    _setSingle(cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementsAggregate_subjectArea, subjectArea);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RequirementsAggregate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IAbstractCriteria.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.CriteriaAggregateAware_criterias, visitor);
    _acceptMap(cleon.architecturemethods.eamod.spec.analysis.javamodel.IPriorityWeighting.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementsAggregate_priorityWeighting, visitor);
    _acceptMap(cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementsAggregate_requirementCriterias, visitor);
    _acceptSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementsAggregate_subjectArea, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementsAggregate selectToMePriorityWeighting(cleon.architecturemethods.eamod.spec.analysis.javamodel.IPriorityWeighting object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementsAggregate.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementsAggregate_priorityWeighting, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementsAggregate> selectToMeSubjectArea(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementsAggregate.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementsAggregate_subjectArea, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementsAggregate selectToMeRequirementCriterias(cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementsAggregate.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.RequirementsAggregate_requirementCriterias, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1e2f32b0-a6f8-11e8-9c81-8bd68c62e435,WG6IEoiNnnFYjQumILgsdNwwra0=] */
