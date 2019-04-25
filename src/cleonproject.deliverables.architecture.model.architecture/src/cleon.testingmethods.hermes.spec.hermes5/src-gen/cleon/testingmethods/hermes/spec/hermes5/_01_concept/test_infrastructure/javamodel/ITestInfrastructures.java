package cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestInfrastructures extends cleon.testingmethods.hermes.spec.hermes5._01_concept.javamodel.IAbstractTestingChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b2de291a-20d7-11e6-9368-9172b77c2cff");
  
  // relations
  
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_users.javamodel.ITestUsers selectTestUsers();
  
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironments selectTestEnvironments();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b2de291a-20d7-11e6-9368-9172b77c2cff,f3D+/yMVXCHzgThFC4srqPQ5hAk=] */
