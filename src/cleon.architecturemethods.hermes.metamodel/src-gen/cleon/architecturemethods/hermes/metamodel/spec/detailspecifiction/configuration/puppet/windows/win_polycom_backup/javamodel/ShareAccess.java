package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ShareAccess extends DynamicResource implements IShareAccess {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IShareAccess> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IShareAccess>() {
    
    @Override
    public IShareAccess create() {
      return new ShareAccess();
    }
    
    @Override
    public IShareAccess create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ShareAccess(resourceRepository, resource);
    }
  
  };

  public ShareAccess() {
    super(IShareAccess.TYPE_ID);
  }
  
  public ShareAccess(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IShareAccess.TYPE_ID);
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

  public ShareAccess setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isCluster()) return visitor.visitCluster();
    if (isMember()) return visitor.visitMember();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isCluster()) {
      visitor.visitCluster();
      return;
    }
    if (isMember()) {
      visitor.visitMember();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isCluster() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_backup.Win_polycom_backupPackage.ShareAccess_Cluster);
  }
  
  @Override
  public boolean isMember() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_backup.Win_polycom_backupPackage.ShareAccess_Member);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,eb4222c0-688e-11f0-a9ba-bb94c358e981,Bhxdcmyl2lLbrZXo3CE26vudgVw=] */
