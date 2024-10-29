package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestResultEnvironment extends DynamicResource implements ITestResultEnvironment {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestResultEnvironment> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestResultEnvironment>() {
    
    @Override
    public ITestResultEnvironment create() {
      return new TestResultEnvironment();
    }
    
    @Override
    public ITestResultEnvironment create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestResultEnvironment(resourceRepository, resource);
    }
  
  };

  public TestResultEnvironment() {
    super(ITestResultEnvironment.TYPE_ID);
  }
  
  public TestResultEnvironment(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestResultEnvironment.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestExpectedResultEnvironment> selectTestResult() {
    return _getMap(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestExpectedResultEnvironment.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestResultEnvironment_testResult);
  }

  public TestResultEnvironment setTestResult(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestExpectedResultEnvironment> testResult) {
    _setMap(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestResultEnvironment_testResult, testResult);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestResultEnvironment setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptMap(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestExpectedResultEnvironment.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestResultEnvironment_testResult, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestResultEnvironment selectToMeTestResult(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestExpectedResultEnvironment object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestResultEnvironment.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestResultEnvironment_testResult, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d2b61fb7-7b6b-11eb-b8e5-2d821e359a02,d/NW7rHC+TjcpCdsbWTkCeGX9L4=] */
