package cleon.testing.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Testing extends DynamicResource implements ITesting {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITesting> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITesting>() {
    
    @Override
    public ITesting create() {
      return new Testing();
    }
    
    @Override
    public ITesting create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Testing(resourceRepository, resource);
    }
  
  };

  public Testing() {
    super(ITesting.TYPE_ID);
  }
  
  public Testing(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITesting.TYPE_ID);
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

  public Testing setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c050d74c-d400-11e5-9dfc-cf0f3e030023,Go8mV7zb0n5TK+1FF9ITFEVKH28=] */
