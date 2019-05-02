package cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestEnvironment extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.javamodel.ITestInfrastracture, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8dd0a331-6761-11e9-9ec9-5fbc84faaeb1");
  
  // relations
  
  public cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.javamodel.IEnvironment selectEnvironmentView();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestConnection> selectTestConnection();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8dd0a331-6761-11e9-9ec9-5fbc84faaeb1,8X66Dgt0266c0WazEF3DTrYaSHQ=] */
