package cleon.common.knowledge.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WWW extends DynamicResource implements IWWW {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWWW> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWWW>() {
    
    @Override
    public IWWW create() {
      return new WWW();
    }
    
    @Override
    public IWWW create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WWW(resourceRepository, resource);
    }
  
  };

  public WWW() {
    super(IWWW.TYPE_ID);
  }
  
  public WWW(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWWW.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.net.URL selectUrl() {
    return _getSingleAttribute(java.net.URL.class, cleon.common.knowledge.metamodel.spec.SpecPackage.WWW_url);
  }
    
  public void setUrl(java.net.URL url) {
     _setSingleAttribute(cleon.common.knowledge.metamodel.spec.SpecPackage.WWW_url, url);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WWW setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.net.URL.class, cleon.common.knowledge.metamodel.spec.SpecPackage.WWW_url, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,caf61b68-b797-11e6-85e2-39e149963066,4FPzx87BlQkcQgc38feAZirZseQ=] */
