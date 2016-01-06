package cleon.website.spec.static_content.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Layout extends DynamicResource implements ILayout {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILayout> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILayout>() {
    
    @Override
    public ILayout create() {
      return new Layout();
    }
    
    @Override
    public ILayout create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Layout(resourceRepository, resource);
    }
  
  };

  public Layout() {
    super(ILayout.TYPE_ID);
  }
  
  public Layout(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILayout.TYPE_ID);
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

  public Layout setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,22c31230-afe1-11e5-a548-13e054f2d74f,LWIUmrdH9fiHpUgOz1XdUcSiCvw=] */
