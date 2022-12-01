package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedHost extends DynamicResource implements INamedHost {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedHost> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedHost>() {
    
    @Override
    public INamedHost create() {
      return new NamedHost();
    }
    
    @Override
    public INamedHost create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedHost(resourceRepository, resource);
    }
  
  };

  public NamedHost() {
    super(INamedHost.TYPE_ID);
  }
  
  public NamedHost(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedHost.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectAlias() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_alias);
  }
    
  public void setAlias(java.lang.String alias) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_alias, alias);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsTemporary() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_isTemporary);
  }
    
  public void setIsTemporary(java.lang.Boolean isTemporary) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_isTemporary, isTemporary);
  }

  @Override
  public java.lang.Boolean selectIsVirtualized() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_isVirtualized);
  }
    
  public void setIsVirtualized(java.lang.Boolean isVirtualized) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_isVirtualized, isVirtualized);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectOverrideOwner() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_overrideOwner);
  }
    
  public void setOverrideOwner(java.lang.String overrideOwner) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_overrideOwner, overrideOwner);
  }

  @Override
  public java.lang.String selectOverrideRN() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.OverrideRNAware_overrideRN);
  }
    
  public void setOverrideRN(java.lang.String overrideRN) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.OverrideRNAware_overrideRN, overrideRN);
  }

  @Override
  public java.lang.Boolean selectSkipHostGeneration() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.SkipHostGenerationAware_skipHostGeneration);
  }
    
  public void setSkipHostGeneration(java.lang.Boolean skipHostGeneration) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.SkipHostGenerationAware_skipHostGeneration, skipHostGeneration);
  }

  @Override
  public java.lang.Boolean selectSkipMonitoringGeneration() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.SkipMonitoringAware_skipMonitoringGeneration);
  }
    
  public void setSkipMonitoringGeneration(java.lang.Boolean skipMonitoringGeneration) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.SkipMonitoringAware_skipMonitoringGeneration, skipMonitoringGeneration);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectInstanceOf() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_instanceOf);
  }

  public NamedHost setInstanceOf(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration instanceOf) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_instanceOf, instanceOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost selectMonitoringWith() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_monitoringWith);
  }

  public NamedHost setMonitoringWith(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost monitoringWith) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_monitoringWith, monitoringWith);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public NamedHost setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedHost setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_alias, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_isTemporary, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_isVirtualized, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_overrideOwner, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.OverrideRNAware_overrideRN, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.SkipHostGenerationAware_skipHostGeneration, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.SkipMonitoringAware_skipMonitoringGeneration, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_instanceOf, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractHost_monitoringWith, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9004db0d-570d-11ea-9b24-23fcad029119,VQilzfcAi5lQ3+U1mqAiQYUDF+I=] */
