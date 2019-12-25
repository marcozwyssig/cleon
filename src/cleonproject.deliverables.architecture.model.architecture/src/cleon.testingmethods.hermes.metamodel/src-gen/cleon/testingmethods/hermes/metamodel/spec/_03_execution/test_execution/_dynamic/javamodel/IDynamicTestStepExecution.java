package cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDynamicTestStepExecution extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1eed511e-9193-11e9-85e6-a377d9035ee3");
  
  // relations
  
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep selectTestStep();
  
  public cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution.javamodel.ITestResult selectTestResult();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1eed511e-9193-11e9-85e6-a377d9035ee3,7kiM1PJI+FAk0QFBg0gns3IHq0M=] */
