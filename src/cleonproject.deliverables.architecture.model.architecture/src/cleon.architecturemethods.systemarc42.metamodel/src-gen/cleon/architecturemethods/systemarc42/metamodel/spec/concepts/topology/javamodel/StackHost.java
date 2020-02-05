package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class StackHost extends DynamicResource implements IStackHost {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStackHost> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStackHost>() {
    
    @Override
    public IStackHost create() {
      return new StackHost();
    }
    
    @Override
    public IStackHost create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new StackHost(resourceRepository, resource);
    }
  
  };

  public StackHost() {
    super(IStackHost.TYPE_ID);
  }
  
  public StackHost(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStackHost.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectNumber() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractHost_number);
  }
    
  public void setNumber(java.lang.String number) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractHost_number, number);
  }

  @Override
  public java.lang.String selectOverrideRN() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractHost_overrideRN);
  }
    
  public void setOverrideRN(java.lang.String overrideRN) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractHost_overrideRN, overrideRN);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IHost selectHost() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IHost.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.StackHost_host);
  }

  public StackHost setHost(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IHost host) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.StackHost_host, host);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration selectInstanceOf() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractHost_instanceOf);
  }

  public StackHost setInstanceOf(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration instanceOf) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractHost_instanceOf, instanceOf);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public StackHost setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public StackHost setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractHost_number, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractHost_overrideRN, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IHost.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.StackHost_host, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractHost_instanceOf, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IStackHost> selectToMeHost(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IHost object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IStackHost.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.StackHost_host, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,28ff7b0d-ebf4-11e9-8ba8-8b1ead537e79,D0Akbs0GSefuZZq2IY4Ykplgv5E=] */
