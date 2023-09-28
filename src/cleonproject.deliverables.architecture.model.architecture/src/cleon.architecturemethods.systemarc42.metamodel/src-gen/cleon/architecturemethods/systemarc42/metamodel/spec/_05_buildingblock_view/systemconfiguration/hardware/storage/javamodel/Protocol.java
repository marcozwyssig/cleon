package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Protocol extends DynamicResource implements IProtocol {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProtocol> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProtocol>() {
    
    @Override
    public IProtocol create() {
      return new Protocol();
    }
    
    @Override
    public IProtocol create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Protocol(resourceRepository, resource);
    }
  
  };

  public Protocol() {
    super(IProtocol.TYPE_ID);
  }
  
  public Protocol(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProtocol.TYPE_ID);
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

  public Protocol setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isCifs()) return visitor.visitCifs();
    if (isNfs()) return visitor.visitNfs();
    if (isSMB()) return visitor.visitSMB();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isCifs()) {
      visitor.visitCifs();
      return;
    }
    if (isNfs()) {
      visitor.visitNfs();
      return;
    }
    if (isSMB()) {
      visitor.visitSMB();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isCifs() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.StoragePackage.Protocol_Cifs);
  }
  
  @Override
  public boolean isNfs() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.StoragePackage.Protocol_Nfs);
  }
  
  @Override
  public boolean isSMB() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.StoragePackage.Protocol_SMB);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,21d2d137-8c92-11eb-a9c0-c3b95abf3470,umiMr933asjHoTDwapW7sprgDQ8=] */
