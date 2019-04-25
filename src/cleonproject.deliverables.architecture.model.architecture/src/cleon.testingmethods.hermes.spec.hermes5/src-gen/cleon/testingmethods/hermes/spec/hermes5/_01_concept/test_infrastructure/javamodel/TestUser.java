package cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestUser extends DynamicResource implements ITestUser {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestUser> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestUser>() {
    
    @Override
    public ITestUser create() {
      return new TestUser();
    }
    
    @Override
    public ITestUser create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestUser(resourceRepository, resource);
    }
  
  };

  public TestUser() {
    super(ITestUser.TYPE_ID);
  }
  
  public TestUser(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestUser.TYPE_ID);
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

  public TestUser setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,597bea7c-6748-11e9-9ec9-5fbc84faaeb1,ephRCJzYM7a4ith4R7qUqPXqTkA=] */
