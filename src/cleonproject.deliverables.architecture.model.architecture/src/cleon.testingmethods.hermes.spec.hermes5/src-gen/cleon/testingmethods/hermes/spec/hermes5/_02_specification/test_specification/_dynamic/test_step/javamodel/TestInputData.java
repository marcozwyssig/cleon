package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestInputData extends DynamicResource implements ITestInputData {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInputData> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInputData>() {
    
    @Override
    public ITestInputData create() {
      return new TestInputData();
    }
    
    @Override
    public ITestInputData create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestInputData(resourceRepository, resource);
    }
  
  };

  public TestInputData() {
    super(ITestInputData.TYPE_ID);
  }
  
  public TestInputData(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestInputData.TYPE_ID);
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
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.javamodel.ITestData selectTestData() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.javamodel.ITestData.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestInputData_testData);
  }

  public TestInputData setTestData(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.javamodel.ITestData testData) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestInputData_testData, testData);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestInputData setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.javamodel.ITestData.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestInputData_testData, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestInputData> selectToMeTestData(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.javamodel.ITestData object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestInputData.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestInputData_testData, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ffc72fa2-6727-11e9-9ec9-5fbc84faaeb1,1rwVI1oFL6jbQI3Oz1H7UZ+CzJw=] */
