package cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemComponentRequirementCoverage extends DynamicResource implements ISystemComponentRequirementCoverage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemComponentRequirementCoverage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemComponentRequirementCoverage>() {
    
    @Override
    public ISystemComponentRequirementCoverage create() {
      return new SystemComponentRequirementCoverage();
    }
    
    @Override
    public ISystemComponentRequirementCoverage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemComponentRequirementCoverage(resourceRepository, resource);
    }
  
  };

  public SystemComponentRequirementCoverage() {
    super(ISystemComponentRequirementCoverage.TYPE_ID);
  }
  
  public SystemComponentRequirementCoverage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemComponentRequirementCoverage.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement> selectCoveredRequirements() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement.class, cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage._13_requirements_coveragePackage.SystemComponentRequirementCoverage_coveredRequirements);
  }

  public SystemComponentRequirementCoverage setCoveredRequirements(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement> coveredRequirements) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage._13_requirements_coveragePackage.SystemComponentRequirementCoverage_coveredRequirements, coveredRequirements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponent selectSystemComponent() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponent.class, cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage._13_requirements_coveragePackage.SystemComponentRequirementCoverage_systemComponent);
  }

  public SystemComponentRequirementCoverage setSystemComponent(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponent systemComponent) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage._13_requirements_coveragePackage.SystemComponentRequirementCoverage_systemComponent, systemComponent);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SystemComponentRequirementCoverage setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemComponentRequirementCoverage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement.class, cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage._13_requirements_coveragePackage.SystemComponentRequirementCoverage_coveredRequirements, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponent.class, cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage._13_requirements_coveragePackage.SystemComponentRequirementCoverage_systemComponent, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage.javamodel.ISystemComponentRequirementCoverage> selectToMeSystemComponent(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponent object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage.javamodel.ISystemComponentRequirementCoverage.class, cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage._13_requirements_coveragePackage.SystemComponentRequirementCoverage_systemComponent, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage.javamodel.ISystemComponentRequirementCoverage> selectToMeCoveredRequirements(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage.javamodel.ISystemComponentRequirementCoverage.class, cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage._13_requirements_coveragePackage.SystemComponentRequirementCoverage_coveredRequirements, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,362a8306-e102-11e8-8499-a3b0fb3cad90,qn9F2W8e8ljK37jniM9lesYvd50=] */
