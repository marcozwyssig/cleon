package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class HostAccessMode extends DynamicResource implements IHostAccessMode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHostAccessMode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHostAccessMode>() {
    
    @Override
    public IHostAccessMode create() {
      return new HostAccessMode();
    }
    
    @Override
    public IHostAccessMode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new HostAccessMode(resourceRepository, resource);
    }
  
  };

  public HostAccessMode() {
    super(IHostAccessMode.TYPE_ID);
  }
  
  public HostAccessMode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IHostAccessMode.TYPE_ID);
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

  public HostAccessMode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isAll()) return visitor.visitAll();
    if (isOnlyCluster()) return visitor.visitOnlyCluster();
    if (isNoCluster()) return visitor.visitNoCluster();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isAll()) {
      visitor.visitAll();
      return;
    }
    if (isOnlyCluster()) {
      visitor.visitOnlyCluster();
      return;
    }
    if (isNoCluster()) {
      visitor.visitNoCluster();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isAll() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.HostAccessMode_All);
  }
  
  @Override
  public boolean isOnlyCluster() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.HostAccessMode_OnlyCluster);
  }
  
  @Override
  public boolean isNoCluster() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.HostAccessMode_NoCluster);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3b5f0242-2439-11eb-83b1-3d2a97975978,iFHE2Ye7gIUGRLw+PwvPsLayLsA=] */
