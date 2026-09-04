package cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class LinkedEclipseResource extends DynamicResource implements ILinkedEclipseResource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILinkedEclipseResource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILinkedEclipseResource>() {
    
    @Override
    public ILinkedEclipseResource create() {
      return new LinkedEclipseResource();
    }
    
    @Override
    public ILinkedEclipseResource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new LinkedEclipseResource(resourceRepository, resource);
    }
  
  };

  public LinkedEclipseResource() {
    super(ILinkedEclipseResource.TYPE_ID);
  }
  
  public LinkedEclipseResource(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILinkedEclipseResource.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectLocationURI() {
    return _getSingleAttribute(java.lang.String.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.ResourcePackage.LinkedEclipseResource_locationURI);
  }
    
  public void setLocationURI(java.lang.String locationURI) {
     _setSingleAttribute(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.ResourcePackage.LinkedEclipseResource_locationURI, locationURI);
  }

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

  public LinkedEclipseResource setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.ResourcePackage.LinkedEclipseResource_locationURI, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,af35c6ed-5201-11e5-89ac-35d4069568da,4NB+ZnxigHtuVSAlT3XN3SkDxnU=] */
