package cleon.conception.architecture.spec.eamod.chrv.issues.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Category extends DynamicResource implements ICategory {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICategory> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICategory>() {
    
    @Override
    public ICategory create() {
      return new Category();
    }
    
    @Override
    public ICategory create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Category(resourceRepository, resource);
    }
  
  };

  public Category() {
    super(ICategory.TYPE_ID);
  }
  
  public Category(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICategory.TYPE_ID);
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

  public Category setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b72d6e8b-e609-11e5-950a-cb0c4b71716c,dXVZdbYNANDqjHgq1dwgCqA196g=] */
