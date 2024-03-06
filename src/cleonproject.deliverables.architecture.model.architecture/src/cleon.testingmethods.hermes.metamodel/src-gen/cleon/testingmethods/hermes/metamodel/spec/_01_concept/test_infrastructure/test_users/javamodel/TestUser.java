package cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.javamodel;

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
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectPassword() {
    return _getSingleAttribute(java.lang.String.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.Test_usersPackage.TestUser_password);
  }
    
  public void setPassword(java.lang.String password) {
     _setSingleAttribute(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.Test_usersPackage.TestUser_password, password);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> selectRoles() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.Test_usersPackage.TestUser_roles);
  }

  public TestUser setRoles(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> roles) {
    _setList(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.Test_usersPackage.TestUser_roles, roles);
    return this;
  }
    
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
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.Test_usersPackage.TestUser_password, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.Test_usersPackage.TestUser_roles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.javamodel.ITestUser> selectToMeRoles(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.javamodel.ITestUser.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.Test_usersPackage.TestUser_roles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bb1bba72-6728-11e9-9ec9-5fbc84faaeb1,nYyi3R7bIFq6/oCqMq7hjLIxbns=] */
