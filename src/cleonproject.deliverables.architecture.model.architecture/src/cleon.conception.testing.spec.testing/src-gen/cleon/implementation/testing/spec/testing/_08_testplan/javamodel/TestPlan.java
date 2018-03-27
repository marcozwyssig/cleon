package cleon.implementation.testing.spec.testing._08_testplan.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestPlan extends DynamicResource implements ITestPlan {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestPlan> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestPlan>() {
    
    @Override
    public ITestPlan create() {
      return new TestPlan();
    }
    
    @Override
    public ITestPlan create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestPlan(resourceRepository, resource);
    }
  
  };

  public TestPlan() {
    super(ITestPlan.TYPE_ID);
  }
  
  public TestPlan(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestPlan.TYPE_ID);
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

  public TestPlan setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8bf93951-eabe-11e5-838a-6dbe7118dd11,NJhq2BJ7+6VmQBdEr/uHTcKxB7M=] */
