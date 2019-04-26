package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestPrecondition extends DynamicResource implements ITestPrecondition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestPrecondition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestPrecondition>() {
    
    @Override
    public ITestPrecondition create() {
      return new TestPrecondition();
    }
    
    @Override
    public ITestPrecondition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestPrecondition(resourceRepository, resource);
    }
  
  };

  public TestPrecondition() {
    super(ITestPrecondition.TYPE_ID);
  }
  
  public TestPrecondition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestPrecondition.TYPE_ID);
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

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment> selectTestEnvironment() {
    return _getList(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.TestPrecondition_testEnvironment);
  }

  public TestPrecondition setTestEnvironment(java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment> testEnvironment) {
    _setList(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.TestPrecondition_testEnvironment, testEnvironment);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_users.javamodel.ITestUser> selectTestUser() {
    return _getList(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_users.javamodel.ITestUser.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.TestPrecondition_testUser);
  }

  public TestPrecondition setTestUser(java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_users.javamodel.ITestUser> testUser) {
    _setList(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.TestPrecondition_testUser, testUser);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestPrecondition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.TestPrecondition_testEnvironment, visitor);
    _acceptList(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_users.javamodel.ITestUser.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.TestPrecondition_testUser, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition> selectToMeTestUser(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_users.javamodel.ITestUser object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.TestPrecondition_testUser, object.getResource());
  }
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition> selectToMeTestEnvironment(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.TestPrecondition_testEnvironment, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8e928c1d-516b-11e9-bb61-971a423d31e9,kWHxU6HZgMyqEi8Z/kGNjxZsmq8=] */
