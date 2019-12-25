package cleon.common.resources.metamodel.spec.versions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Version extends DynamicResource implements IVersion {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVersion> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVersion>() {
    
    @Override
    public IVersion create() {
      return new Version();
    }
    
    @Override
    public IVersion create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Version(resourceRepository, resource);
    }
  
  };

  public Version() {
    super(IVersion.TYPE_ID);
  }
  
  public Version(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVersion.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectVersion() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.Version_version);
  }
    
  public void setVersion(java.lang.String version) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.versions.VersionsPackage.Version_version, version);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Version setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.Version_version, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6a0f54e6-2d72-11e6-959f-d1cef44ff5fd,/ws52tu3UuGMKojtnx/5wflnXKU=] */
