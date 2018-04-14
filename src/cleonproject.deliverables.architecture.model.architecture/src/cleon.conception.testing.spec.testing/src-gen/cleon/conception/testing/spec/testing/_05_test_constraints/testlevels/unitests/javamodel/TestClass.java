package cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestClass extends DynamicResource implements ITestClass {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestClass> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestClass>() {
    
    @Override
    public ITestClass create() {
      return new TestClass();
    }
    
    @Override
    public ITestClass create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestClass(resourceRepository, resource);
    }
  
  };

  public TestClass() {
    super(ITestClass.TYPE_ID);
  }
  
  public TestClass(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestClass.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.classes.method.javamodel.IMethod> selectMethods() {
    return _getList(cleon.conception.architecture.spec.uml.structural.classes.method.javamodel.IMethod.class, cleon.conception.architecture.spec.uml.structural.classes.method.MethodPackage.MethodClass_methods);
  }

  public TestClass setMethods(java.util.List<? extends cleon.conception.architecture.spec.uml.structural.classes.method.javamodel.IMethod> methods) {
    _setList(cleon.conception.architecture.spec.uml.structural.classes.method.MethodPackage.MethodClass_methods, methods);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestMethod> selectTestMethods() {
    return _getMultiMap(cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestMethod.class, cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClass_testMethods);
  }

  public TestClass setTestMethods(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestMethod> testMethods) {
    _setMultiMap(cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClass_testMethods, testMethods);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestProperty> selectTestProperties() {
    return _getMultiMap(cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestProperty.class, cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClass_testProperties);
  }

  public TestClass setTestProperties(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestProperty> testProperties) {
    _setMultiMap(cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClass_testProperties, testProperties);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestClass setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.conception.architecture.spec.uml.structural.classes.method.javamodel.IMethod.class, cleon.conception.architecture.spec.uml.structural.classes.method.MethodPackage.MethodClass_methods, visitor);
    _acceptMultiMap(cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestMethod.class, cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClass_testMethods, visitor);
    _acceptMultiMap(cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestProperty.class, cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClass_testProperties, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClass selectToMeTestMethods(cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestMethod object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClass.class, cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClass_testMethods, object.getResource());
  }
  
  public static cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClass selectToMeTestProperties(cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestProperty object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClass.class, cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClass_testProperties, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c17728d0-df47-11e2-b229-cd1bd4a07953,GyIve82UVMv2NtYjpPwlETPdxG0=] */
