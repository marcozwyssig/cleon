package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemComponent extends DynamicResource implements ISystemComponent {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemComponent> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemComponent>() {
    
    @Override
    public ISystemComponent create() {
      return new SystemComponent();
    }
    
    @Override
    public ISystemComponent create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemComponent(resourceRepository, resource);
    }
  
  };

  public SystemComponent() {
    super(ISystemComponent.TYPE_ID);
  }
  
  public SystemComponent(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemComponent.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public SystemComponent setDecompose(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite> selectDecomposeComponent() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent);
  }

  public SystemComponent setDecomposeComponent(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite> decomposeComponent) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, decomposeComponent);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfigurationDecomposite> selectDecomposeSystemConfiguration() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfigurationDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_decomposeSystemConfiguration);
  }

  public SystemComponent setDecomposeSystemConfiguration(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfigurationDecomposite> decomposeSystemConfiguration) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_decomposeSystemConfiguration, decomposeSystemConfiguration);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponentDependency> selectHasDependency() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponentDependency.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_hasDependency);
  }

  public SystemComponent setHasDependency(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponentDependency> hasDependency) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._13_productView.javamodel.IProduct> selectProduct() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._13_productView.javamodel.IProduct.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_product);
  }

  public SystemComponent setProduct(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._13_productView.javamodel.IProduct> product) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_product, product);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IRequirementCoverageDescription> selectRequirementCoverageDescription() {
    return _getMap(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IRequirementCoverageDescription.class, cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage._12_requirements_coveragePackage.BuildingBlockRequirementCoverage_requirementCoverageDescription);
  }

  public SystemComponent setRequirementCoverageDescription(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IRequirementCoverageDescription> requirementCoverageDescription) {
    _setMap(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage._12_requirements_coveragePackage.BuildingBlockRequirementCoverage_requirementCoverageDescription, requirementCoverageDescription);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemComponent setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfigurationDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_decomposeSystemConfiguration, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponentDependency.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_hasDependency, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._13_productView.javamodel.IProduct.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_product, visitor);
    _acceptMap(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IRequirementCoverageDescription.class, cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage._12_requirements_coveragePackage.BuildingBlockRequirementCoverage_requirementCoverageDescription, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponent> selectToMeProduct(cleon.architecturemethods.itarc42.spec.itarc42._13_productView.javamodel.IProduct object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponent.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_product, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponent selectToMeDecomposeSystemConfiguration(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfigurationDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponent.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_decomposeSystemConfiguration, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponent selectToMeHasDependency(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponentDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponent.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemComponent_hasDependency, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c0436bff-d0b2-11e8-b005-f7630e4c29c0,qaOEwuB2yfdIuFG0FXgNFj12lY4=] */
