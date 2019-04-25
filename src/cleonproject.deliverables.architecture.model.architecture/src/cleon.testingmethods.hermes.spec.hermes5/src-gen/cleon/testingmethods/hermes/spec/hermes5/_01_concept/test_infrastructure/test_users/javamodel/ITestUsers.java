package cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_users.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestUsers extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.javamodel.IAbstractTestInfrastructures {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c90a6dfe-20d7-11e6-9368-9172b77c2cff");
  
  // relations
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_users.javamodel.ITestUser> selectTestUser();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c90a6dfe-20d7-11e6-9368-9172b77c2cff,mSfJNOPKtEbZbuSJTCkt1p2WhaU=] */
