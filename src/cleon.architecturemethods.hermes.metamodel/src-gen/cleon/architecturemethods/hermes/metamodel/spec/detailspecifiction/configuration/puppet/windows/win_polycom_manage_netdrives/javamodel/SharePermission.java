package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SharePermission extends DynamicResource implements ISharePermission {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISharePermission> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISharePermission>() {
    
    @Override
    public ISharePermission create() {
      return new SharePermission();
    }
    
    @Override
    public ISharePermission create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SharePermission(resourceRepository, resource);
    }
  
  };

  public SharePermission() {
    super(ISharePermission.TYPE_ID);
  }
  
  public SharePermission(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISharePermission.TYPE_ID);
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

  public SharePermission setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isFull()) return visitor.visitFull();
    if (isRead()) return visitor.visitRead();
    if (isModify()) return visitor.visitModify();
    if (isExecute()) return visitor.visitExecute();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isFull()) {
      visitor.visitFull();
      return;
    }
    if (isRead()) {
      visitor.visitRead();
      return;
    }
    if (isModify()) {
      visitor.visitModify();
      return;
    }
    if (isExecute()) {
      visitor.visitExecute();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isFull() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.SharePermission_full);
  }
  
  @Override
  public boolean isRead() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.SharePermission_read);
  }
  
  @Override
  public boolean isModify() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.SharePermission_modify);
  }
  
  @Override
  public boolean isExecute() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.SharePermission_execute);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4cc987fa-0805-11f0-8081-eb3f9417daa7,w9c3ON7+4nWjBiJTKd4L0UmffZc=] */
