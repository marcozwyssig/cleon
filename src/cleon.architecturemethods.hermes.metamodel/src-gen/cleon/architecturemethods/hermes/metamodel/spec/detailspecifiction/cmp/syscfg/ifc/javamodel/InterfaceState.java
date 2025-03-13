package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InterfaceState extends DynamicResource implements IInterfaceState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInterfaceState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInterfaceState>() {
    
    @Override
    public IInterfaceState create() {
      return new InterfaceState();
    }
    
    @Override
    public IInterfaceState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InterfaceState(resourceRepository, resource);
    }
  
  };

  public InterfaceState() {
    super(IInterfaceState.TYPE_ID);
  }
  
  public InterfaceState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInterfaceState.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InterfaceState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isPresent()) return visitor.visitPresent();
    if (isAbsent()) return visitor.visitAbsent();
    if (isShutdown()) return visitor.visitShutdown();
    if (isNo_shutdown()) return visitor.visitNo_shutdown();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isPresent()) {
      visitor.visitPresent();
      return;
    }
    if (isAbsent()) {
      visitor.visitAbsent();
      return;
    }
    if (isShutdown()) {
      visitor.visitShutdown();
      return;
    }
    if (isNo_shutdown()) {
      visitor.visitNo_shutdown();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isPresent() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceState_present);
  }
  
  @Override
  public boolean isAbsent() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceState_absent);
  }
  
  @Override
  public boolean isShutdown() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceState_shutdown);
  }
  
  @Override
  public boolean isNo_shutdown() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceState_no_aE_shutdown);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,40f81c53-f180-11e8-b3e7-15e2dd8d9b05,NGUTvMBguL+a7IOD91Acwb5iE68=] */
