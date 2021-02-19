package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestInputUser extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.IAbstractTestInput, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestUserAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4dc43ad2-6724-11e9-9ec9-5fbc84faaeb1");
  
  public java.lang.String selectActivityName();
  
  // relations
  
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.javamodel.ITestUser selectTestUser();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4dc43ad2-6724-11e9-9ec9-5fbc84faaeb1,ntz/0Jc4icmjzcVOwMXzYgTOgyE=] */
