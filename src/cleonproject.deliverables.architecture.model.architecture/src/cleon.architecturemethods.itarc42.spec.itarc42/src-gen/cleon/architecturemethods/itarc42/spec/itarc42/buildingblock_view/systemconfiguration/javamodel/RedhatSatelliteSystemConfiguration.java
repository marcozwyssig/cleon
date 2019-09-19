package cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RedhatSatelliteSystemConfiguration extends DynamicResource implements IRedhatSatelliteSystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRedhatSatelliteSystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRedhatSatelliteSystemConfiguration>() {
    
    @Override
    public IRedhatSatelliteSystemConfiguration create() {
      return new RedhatSatelliteSystemConfiguration();
    }
    
    @Override
    public IRedhatSatelliteSystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RedhatSatelliteSystemConfiguration(resourceRepository, resource);
    }
  
  };

  public RedhatSatelliteSystemConfiguration() {
    super(IRedhatSatelliteSystemConfiguration.TYPE_ID);
  }
  
  public RedhatSatelliteSystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRedhatSatelliteSystemConfiguration.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public RedhatSatelliteSystemConfiguration setDecompose(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition> selectDecomposePackages() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages);
  }

  public RedhatSatelliteSystemConfiguration setDecomposePackages(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition> decomposePackages) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, decomposePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfigurationDependency> selectHasDependency() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfigurationDependency.class, cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_hasDependency);
  }

  public RedhatSatelliteSystemConfiguration setHasDependency(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfigurationDependency> hasDependency) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IInteraction> selectInteracts() {
    return _getList(cleon.common.modularity.spec.buildingblock.javamodel.IInteraction.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.InteractiveBuildingBlock_interacts);
  }

  public RedhatSatelliteSystemConfiguration setInteracts(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IInteraction> interacts) {
    _setList(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.InteractiveBuildingBlock_interacts, interacts);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition selectNoPackages() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.Component_noPackages);
  }

  public RedhatSatelliteSystemConfiguration setNoPackages(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition noPackages) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.Component_noPackages, noPackages);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required> selectPorts_In() {
    return _getMultiMap(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In);
  }

  public RedhatSatelliteSystemConfiguration setPorts_In(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required> ports_In) {
    _setMultiMap(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, ports_In);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider> selectPorts_Out() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out);
  }

  public RedhatSatelliteSystemConfiguration setPorts_Out(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider> ports_Out) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, ports_Out);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RedhatSatelliteSystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProduct> selectUsingProducts() {
    return _getList(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProduct.class, cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductAware_usingProducts);
  }

  public RedhatSatelliteSystemConfiguration setUsingProducts(java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProduct> usingProducts) {
    _setList(cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductAware_usingProducts, usingProducts);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    // relations
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfigurationDependency.class, cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_hasDependency, visitor);
    _acceptMultiMap(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProduct.class, cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductAware_usingProducts, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dd53d2f6-0c3c-11e9-83ba-4d57b06560a2,0iyX4DHfZW+BcrXvUDClk5zmRgI=] */
