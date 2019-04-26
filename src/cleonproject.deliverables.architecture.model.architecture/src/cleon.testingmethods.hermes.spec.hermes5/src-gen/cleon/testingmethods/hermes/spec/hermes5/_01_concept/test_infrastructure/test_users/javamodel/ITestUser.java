package cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_users.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestUser extends cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.javamodel.ITestInfrastracture {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bb1bba72-6728-11e9-9ec9-5fbc84faaeb1");
  
  public java.lang.String selectPassword();
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRole> selectRole();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bb1bba72-6728-11e9-9ec9-5fbc84faaeb1,efVJ5CUCrrxHCzWz23cSR54D6dA=] */
