package cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestType extends DynamicResource implements ITestType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestType>() {
    
    @Override
    public ITestType create() {
      return new TestType();
    }
    
    @Override
    public ITestType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestType(resourceRepository, resource);
    }
  
  };

  public TestType() {
    super(ITestType.TYPE_ID);
  }
  
  public TestType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestType.TYPE_ID);
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

  public TestType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,08fdd270-4fc3-11e9-bb71-93c81cf66db8,nAFoiMcGLbEPgkyVjhFfNUIoGh8=] */
