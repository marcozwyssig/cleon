package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDynamicTest extends ch.actifsource.core.javamodel.INamedResource, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification.javamodel.ITest, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IGlobalPreconditionsAware, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPreconditionAwareList {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bded44f4-4f8c-11e9-ad5d-977b17aab907");
  
  // attributes
  
  public java.lang.String selectTestGoal();
  
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep> selectTestSteps();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bded44f4-4f8c-11e9-ad5d-977b17aab907,umHXER2K8n/b1r14gSMfPjv+F4Q=] */
