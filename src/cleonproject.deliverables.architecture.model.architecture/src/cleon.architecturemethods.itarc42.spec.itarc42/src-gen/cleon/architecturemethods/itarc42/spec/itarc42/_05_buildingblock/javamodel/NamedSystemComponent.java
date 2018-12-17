package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedSystemComponent extends DynamicResource implements INamedSystemComponent {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedSystemComponent> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedSystemComponent>() {
    
    @Override
    public INamedSystemComponent create() {
      return new NamedSystemComponent();
    }
    
    @Override
    public INamedSystemComponent create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedSystemComponent(resourceRepository, resource);
    }
  
  };

  public NamedSystemComponent() {
    super(INamedSystemComponent.TYPE_ID);
  }
  
  public NamedSystemComponent(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedSystemComponent.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public NamedSystemComponent setDecompose(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite> selectDecomposeComponent() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent);
  }

  public NamedSystemComponent setDecomposeComponent(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite> decomposeComponent) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, decomposeComponent);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfigurationDecomposite> selectDecomposeSystemConfiguration() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfigurationDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_decomposeSystemConfiguration);
  }

  public NamedSystemComponent setDecomposeSystemConfiguration(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfigurationDecomposite> decomposeSystemConfiguration) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_decomposeSystemConfiguration, decomposeSystemConfiguration);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponentDependency> selectHasDependency() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponentDependency.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_hasDependency);
  }

  public NamedSystemComponent setHasDependency(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponentDependency> hasDependency) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._13_productView.javamodel.IProduct> selectProduct() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._13_productView.javamodel.IProduct.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_product);
  }

  public NamedSystemComponent setProduct(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._13_productView.javamodel.IProduct> product) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_product, product);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IRequirementCoverageDescription> selectRequirementCoverageDescription() {
    return _getMap(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IRequirementCoverageDescription.class, cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage._12_requirements_coveragePackage.BuildingBlockRequirementCoverage_requirementCoverageDescription);
  }

  public NamedSystemComponent setRequirementCoverageDescription(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IRequirementCoverageDescription> requirementCoverageDescription) {
    _setMap(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage._12_requirements_coveragePackage.BuildingBlockRequirementCoverage_requirementCoverageDescription, requirementCoverageDescription);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedSystemComponent setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfigurationDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_decomposeSystemConfiguration, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponentDependency.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_hasDependency, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._13_productView.javamodel.IProduct.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_product, visitor);
    _acceptMap(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IRequirementCoverageDescription.class, cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage._12_requirements_coveragePackage.BuildingBlockRequirementCoverage_requirementCoverageDescription, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3b794e8f-01d8-11e9-9c9d-8d52d6745026,nw8G7C9jR8P84hI3ls5zWsQIjUQ=] */
