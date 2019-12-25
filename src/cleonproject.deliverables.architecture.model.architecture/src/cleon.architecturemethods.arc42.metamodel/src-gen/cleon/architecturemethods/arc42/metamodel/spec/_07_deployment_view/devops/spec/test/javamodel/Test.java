package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.test.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Test extends DynamicResource implements ITest {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITest> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITest>() {
    
    @Override
    public ITest create() {
      return new Test();
    }
    
    @Override
    public ITest create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Test(resourceRepository, resource);
    }
  
  };

  public Test() {
    super(ITest.TYPE_ID);
  }
  
  public Test(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITest.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Test setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cebd70c5-406e-11e5-b5f0-5b1ce9c3de3e,xjqtIGT/ynj4GN+j1XTv46jmrCQ=] */
