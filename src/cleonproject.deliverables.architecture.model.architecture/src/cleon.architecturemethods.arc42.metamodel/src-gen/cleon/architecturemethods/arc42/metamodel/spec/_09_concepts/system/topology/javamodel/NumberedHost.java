package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NumberedHost extends DynamicResource implements INumberedHost {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INumberedHost> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INumberedHost>() {
    
    @Override
    public INumberedHost create() {
      return new NumberedHost();
    }
    
    @Override
    public INumberedHost create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NumberedHost(resourceRepository, resource);
    }
  
  };

  public NumberedHost() {
    super(INumberedHost.TYPE_ID);
  }
  
  public NumberedHost(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INumberedHost.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectAlias() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_alias);
  }
    
  public void setAlias(java.lang.String alias) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_alias, alias);
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
  public java.lang.Boolean selectIsTemporary() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_isTemporary);
  }
    
  public void setIsTemporary(java.lang.Boolean isTemporary) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_isTemporary, isTemporary);
  }

  @Override
  public java.lang.Boolean selectIsVirtualized() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_isVirtualized);
  }
    
  public void setIsVirtualized(java.lang.Boolean isVirtualized) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_isVirtualized, isVirtualized);
  }

  @Override
  public java.lang.Integer selectNumber() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractNumberAware_number);
  }
    
  public void setNumber(java.lang.Integer number) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractNumberAware_number, number);
  }

  @Override
  public java.lang.String selectOverrideOwner() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_overrideOwner);
  }
    
  public void setOverrideOwner(java.lang.String overrideOwner) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_overrideOwner, overrideOwner);
  }

  @Override
  public java.lang.String selectOverrideRN() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.OverrideRNAware_overrideRN);
  }
    
  public void setOverrideRN(java.lang.String overrideRN) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.OverrideRNAware_overrideRN, overrideRN);
  }

  @Override
  public java.lang.String selectOverrideShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.OverrideShortNameAware_overrideShortName);
  }
    
  public void setOverrideShortName(java.lang.String overrideShortName) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.OverrideShortNameAware_overrideShortName, overrideShortName);
  }

  @Override
  public java.lang.Boolean selectSkipBookmarkGeneration() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.SkipBookmarkAware_skipBookmarkGeneration);
  }
    
  public void setSkipBookmarkGeneration(java.lang.Boolean skipBookmarkGeneration) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.SkipBookmarkAware_skipBookmarkGeneration, skipBookmarkGeneration);
  }

  @Override
  public java.lang.Boolean selectSkipHostGeneration() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.SkipHostGenerationAware_skipHostGeneration);
  }
    
  public void setSkipHostGeneration(java.lang.Boolean skipHostGeneration) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.SkipHostGenerationAware_skipHostGeneration, skipHostGeneration);
  }

  @Override
  public java.lang.Boolean selectSkipMonitoringGeneration() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.SkipMonitoringAware_skipMonitoringGeneration);
  }
    
  public void setSkipMonitoringGeneration(java.lang.Boolean skipMonitoringGeneration) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.SkipMonitoringAware_skipMonitoringGeneration, skipMonitoringGeneration);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectInstanceOf() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_instanceOf);
  }

  public NumberedHost setInstanceOf(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration instanceOf) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_instanceOf, instanceOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> selectIps() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_ips);
  }

  public NumberedHost setIps(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> ips) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_ips, ips);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost selectMonitoringWith() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_monitoringWith);
  }

  public NumberedHost setMonitoringWith(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost monitoringWith) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_monitoringWith, monitoringWith);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public NumberedHost setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NumberedHost setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_alias, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_isTemporary, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_isVirtualized, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractNumberAware_number, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_overrideOwner, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.OverrideRNAware_overrideRN, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.OverrideShortNameAware_overrideShortName, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.SkipBookmarkAware_skipBookmarkGeneration, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.SkipHostGenerationAware_skipHostGeneration, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.SkipMonitoringAware_skipMonitoringGeneration, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_instanceOf, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_ips, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractHost_monitoringWith, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,887c437e-ca6a-11e9-83b0-559396620907,ME04EU0TFvWLeK262cs3E4FWULE=] */
