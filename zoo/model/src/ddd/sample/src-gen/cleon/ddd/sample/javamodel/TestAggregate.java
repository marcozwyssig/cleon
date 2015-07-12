package cleon.ddd.sample.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestAggregate extends DynamicResource implements ITestAggregate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestAggregate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestAggregate>() {
    
    @Override
    public ITestAggregate create() {
      return new TestAggregate();
    }
    
    @Override
    public ITestAggregate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestAggregate(resourceRepository, resource);
    }
  
  };

  public TestAggregate() {
    super(ITestAggregate.TYPE_ID);
  }
  
  public TestAggregate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestAggregate.TYPE_ID);
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

  public TestAggregate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dec177e4-266d-11e5-95dc-8f1cdbd9db54,nGxisT3GlBKoTyh59PWfeSF1r0M=] */
