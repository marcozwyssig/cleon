package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestPrecondition extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8e928c1d-516b-11e9-bb61-971a423d31e9");
  
  // relations
  
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_users.javamodel.ITestUser> selectTestUser();
  
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment> selectTestEnvironment();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8e928c1d-516b-11e9-bb61-971a423d31e9,plYXMT4J60akN5AxgvgjxYyVJN0=] */
