package cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RequirementCoverageDescription extends DynamicResource implements IRequirementCoverageDescription {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementCoverageDescription> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementCoverageDescription>() {
    
    @Override
    public IRequirementCoverageDescription create() {
      return new RequirementCoverageDescription();
    }
    
    @Override
    public IRequirementCoverageDescription create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RequirementCoverageDescription(resourceRepository, resource);
    }
  
  };

  public RequirementCoverageDescription() {
    super(IRequirementCoverageDescription.TYPE_ID);
  }
  
  public RequirementCoverageDescription(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequirementCoverageDescription.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCoverage selectRequirementCoverage() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCoverage.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.CoveragePackage.RequirementCoverageDescription_requirementCoverage);
  }

  public RequirementCoverageDescription setRequirementCoverage(cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCoverage requirementCoverage) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.CoveragePackage.RequirementCoverageDescription_requirementCoverage, requirementCoverage);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RequirementCoverageDescription setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RequirementCoverageDescription setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCoverage.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.CoveragePackage.RequirementCoverageDescription_requirementCoverage, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCoverageDescription> selectToMeRequirementCoverage(cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCoverage object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCoverageDescription.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.CoveragePackage.RequirementCoverageDescription_requirementCoverage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0562087c-01e5-11e9-9c9d-8d52d6745026,d3K/K79ZXmfkI8t2tZcCywVobk4=] */
