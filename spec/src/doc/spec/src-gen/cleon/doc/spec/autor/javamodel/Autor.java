package cleon.doc.spec.autor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Autor extends DynamicResource implements IAutor {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAutor> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAutor>() {
    
    @Override
    public IAutor create() {
      return new Autor();
    }
    
    @Override
    public IAutor create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Autor(resourceRepository, resource);
    }
  
  };

  public Autor() {
    super(IAutor.TYPE_ID);
  }
  
  public Autor(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAutor.TYPE_ID);
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

  public Autor setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7869d054-c589-11e5-aeea-1db9268c0ee9,5UWuHVREmbROp6oZB4KdpSpQMDc=] */
