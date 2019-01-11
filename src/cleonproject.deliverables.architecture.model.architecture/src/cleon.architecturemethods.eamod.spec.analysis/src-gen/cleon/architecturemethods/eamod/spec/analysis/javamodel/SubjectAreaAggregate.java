package cleon.architecturemethods.eamod.spec.analysis.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SubjectAreaAggregate extends DynamicResource implements ISubjectAreaAggregate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISubjectAreaAggregate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISubjectAreaAggregate>() {
    
    @Override
    public ISubjectAreaAggregate create() {
      return new SubjectAreaAggregate();
    }
    
    @Override
    public ISubjectAreaAggregate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SubjectAreaAggregate(resourceRepository, resource);
    }
  
  };

  public SubjectAreaAggregate() {
    super(ISubjectAreaAggregate.TYPE_ID);
  }
  
  public SubjectAreaAggregate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISubjectAreaAggregate.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.IAbstractCriteria> selectCriterias() {
    return _getList(cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.IAbstractCriteria.class, cleon.projectmethods.hermes.spec.detailstudy.drivers.DriversPackage.CriteriaAggregateAware_criterias);
  }

  public SubjectAreaAggregate setCriterias(java.util.List<? extends cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.IAbstractCriteria> criterias) {
    _setList(cleon.projectmethods.hermes.spec.detailstudy.drivers.DriversPackage.CriteriaAggregateAware_criterias, criterias);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria> selectRequirementCriterias() {
    return _getMap(cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.SubjectAreaAggregate_requirementCriterias);
  }

  public SubjectAreaAggregate setRequirementCriterias(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria> requirementCriterias) {
    _setMap(cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.SubjectAreaAggregate_requirementCriterias, requirementCriterias);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea selectSubSubjectArea() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.SubjectAreaAggregate_subSubjectArea);
  }

  public SubjectAreaAggregate setSubSubjectArea(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea subSubjectArea) {
    _setSingle(cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.SubjectAreaAggregate_subSubjectArea, subSubjectArea);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SubjectAreaAggregate setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SubjectAreaAggregate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.IAbstractCriteria.class, cleon.projectmethods.hermes.spec.detailstudy.drivers.DriversPackage.CriteriaAggregateAware_criterias, visitor);
    _acceptMap(cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.SubjectAreaAggregate_requirementCriterias, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.SubjectAreaAggregate_subSubjectArea, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.analysis.javamodel.ISubjectAreaAggregate selectToMeRequirementCriterias(cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.analysis.javamodel.ISubjectAreaAggregate.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.SubjectAreaAggregate_requirementCriterias, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.analysis.javamodel.ISubjectAreaAggregate> selectToMeSubSubjectArea(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.analysis.javamodel.ISubjectAreaAggregate.class, cleon.architecturemethods.eamod.spec.analysis.AnalysisPackage.SubjectAreaAggregate_subSubjectArea, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1e2f32b0-a6f8-11e8-9c81-8bd68c62e435,nR45a4RhFTQtz7TM+X/hwPWiJ18=] */
