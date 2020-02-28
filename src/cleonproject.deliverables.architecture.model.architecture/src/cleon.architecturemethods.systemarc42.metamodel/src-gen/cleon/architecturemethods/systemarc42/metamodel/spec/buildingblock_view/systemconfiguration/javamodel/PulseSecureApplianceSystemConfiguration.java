package cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PulseSecureApplianceSystemConfiguration extends DynamicResource implements IPulseSecureApplianceSystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPulseSecureApplianceSystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPulseSecureApplianceSystemConfiguration>() {
    
    @Override
    public IPulseSecureApplianceSystemConfiguration create() {
      return new PulseSecureApplianceSystemConfiguration();
    }
    
    @Override
    public IPulseSecureApplianceSystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PulseSecureApplianceSystemConfiguration(resourceRepository, resource);
    }
  
  };

  public PulseSecureApplianceSystemConfiguration() {
    super(IPulseSecureApplianceSystemConfiguration.TYPE_ID);
  }
  
  public PulseSecureApplianceSystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPulseSecureApplianceSystemConfiguration.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.naming.NamingPackage.RequiredShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.naming.NamingPackage.RequiredShortName_shortName, shortName);
  }

  @Override
  public java.lang.Boolean selectSkipGenerate() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_skipGenerate);
  }
    
  public void setSkipGenerate(java.lang.Boolean skipGenerate) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_skipGenerate, skipGenerate);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> selectDecompose() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose);
  }

  public PulseSecureApplianceSystemConfiguration setDecompose(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> decompose) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage> selectDecomposePackages() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages);
  }

  public PulseSecureApplianceSystemConfiguration setDecomposePackages(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage> decomposePackages) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, decomposePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfigurationDependency> selectHasDependency() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfigurationDependency.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_hasDependency);
  }

  public PulseSecureApplianceSystemConfiguration setHasDependency(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfigurationDependency> hasDependency) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> selectInSubZone() {
    return _getList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_inSubZone);
  }

  public PulseSecureApplianceSystemConfiguration setInSubZone(java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> inSubZone) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_inSubZone, inSubZone);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration> selectInheritServices() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_inheritServices);
  }

  public PulseSecureApplianceSystemConfiguration setInheritServices(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration> inheritServices) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_inheritServices, inheritServices);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> selectInteracts() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IInteraction.class, cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts);
  }

  public PulseSecureApplianceSystemConfiguration setInteracts(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> interacts) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts, interacts);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.javamodel.IInterface> selectInterface() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.javamodel.IInterface.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_interface);
  }

  public PulseSecureApplianceSystemConfiguration setInterface(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.javamodel.IInterface> interface_) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_interface, interface_);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage selectNoPackages() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.Component_noPackages);
  }

  public PulseSecureApplianceSystemConfiguration setNoPackages(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage noPackages) {
    _setSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.Component_noPackages, noPackages);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> selectPorts_In() {
    return _getMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In);
  }

  public PulseSecureApplianceSystemConfiguration setPorts_In(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> ports_In) {
    _setMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, ports_In);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> selectPorts_Out() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out);
  }

  public PulseSecureApplianceSystemConfiguration setPorts_Out(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> ports_Out) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, ports_Out);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IAbstractService> selectProvides() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IAbstractService.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_provides);
  }

  public PulseSecureApplianceSystemConfiguration setProvides(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IAbstractService> provides) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_provides, provides);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PulseSecureApplianceSystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct> selectUsingProducts() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.ProductAware_usingProducts);
  }

  public PulseSecureApplianceSystemConfiguration setUsingProducts(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct> usingProducts) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.ProductAware_usingProducts, usingProducts);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.naming.NamingPackage.RequiredShortName_shortName, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_skipGenerate, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfigurationDependency.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_hasDependency, visitor);
    _acceptList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_inSubZone, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_inheritServices, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.javamodel.IInterface.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_interface, visitor);
    _acceptMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IAbstractService.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_provides, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.ProductAware_usingProducts, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,67e55025-0a7a-11e9-a59d-d7a0c53e291c,gbWIphzJ7f1YLohYkcbOlyNIJKU=] */
