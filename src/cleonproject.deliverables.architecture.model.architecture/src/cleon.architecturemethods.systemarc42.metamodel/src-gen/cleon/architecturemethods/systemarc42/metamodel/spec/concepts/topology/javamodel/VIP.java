package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class VIP extends DynamicResource implements IVIP {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVIP> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVIP>() {
    
    @Override
    public IVIP create() {
      return new VIP();
    }
    
    @Override
    public IVIP create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new VIP(resourceRepository, resource);
    }
  
  };

  public VIP() {
    super(IVIP.TYPE_ID);
  }
  
  public VIP(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVIP.TYPE_ID);
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
  public cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration selectInstanceOf() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractHost_instanceOf);
  }

  public VIP setInstanceOf(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration instanceOf) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractHost_instanceOf, instanceOf);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public VIP setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public VIP setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractHost_instanceOf, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,aa31b116-523c-11ea-b38c-2b48248ef5b9,VEko23Pbur/Rk74E+m//M/4Q7nY=] */
