package cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestSuccess extends DynamicResource implements ITestSuccess {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSuccess> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSuccess>() {
    
    @Override
    public ITestSuccess create() {
      return new TestSuccess();
    }
    
    @Override
    public ITestSuccess create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestSuccess(resourceRepository, resource);
    }
  
  };

  public TestSuccess() {
    super(ITestSuccess.TYPE_ID);
  }
  
  public TestSuccess(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestSuccess.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestSuccess setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c05894b0-1cf3-11e6-aaba-9db7fdc64d7e,vHMrOYbS3BEw1xwJu2KG/Q9LUKg=] */
