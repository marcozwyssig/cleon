package cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Product extends DynamicResource implements IProduct {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProduct> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProduct>() {
    
    @Override
    public IProduct create() {
      return new Product();
    }
    
    @Override
    public IProduct create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Product(resourceRepository, resource);
    }
  
  };

  public Product() {
    super(IProduct.TYPE_ID);
  }
  
  public Product(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProduct.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectVersion() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.versions.VersionsPackage.Version_version);
  }
    
  public void setVersion(java.lang.String version) {
     _setSingleAttribute(cleon.common.resources.spec.resources.versions.VersionsPackage.Version_version, version);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Product setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.versions.VersionsPackage.Version_version, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,352e36c6-d0b1-11e8-b005-f7630e4c29c0,b8LjdLH+D+dVOQPkqYCcuxR2V5M=] */
