package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestInputUser extends DynamicResource implements ITestInputUser {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInputUser> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInputUser>() {
    
    @Override
    public ITestInputUser create() {
      return new TestInputUser();
    }
    
    @Override
    public ITestInputUser create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestInputUser(resourceRepository, resource);
    }
  
  };

  public TestInputUser() {
    super(ITestInputUser.TYPE_ID);
  }
  
  public TestInputUser(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestInputUser.TYPE_ID);
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
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_users.javamodel.ITestUser selectTestUser() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_users.javamodel.ITestUser.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestInputUser_testUser);
  }

  public TestInputUser setTestUser(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_users.javamodel.ITestUser testUser) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestInputUser_testUser, testUser);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestInputUser setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_users.javamodel.ITestUser.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestInputUser_testUser, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestInputUser> selectToMeTestUser(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_users.javamodel.ITestUser object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestInputUser.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestInputUser_testUser, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4dc43ad2-6724-11e9-9ec9-5fbc84faaeb1,F/U7wfKk2HDfLjRCexYtmuVF3KY=] */
