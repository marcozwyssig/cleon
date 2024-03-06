package cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestUser extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.IAbstractTestInfrastracture, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bb1bba72-6728-11e9-9ec9-5fbc84faaeb1");
  
  public java.lang.String selectPassword();
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> selectRoles();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bb1bba72-6728-11e9-9ec9-5fbc84faaeb1,PNCzLxCRtNN23sUnhmRd8tHs+bE=] */
