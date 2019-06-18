package cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestDynamicTestLevelScope extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b35d2498-918e-11e9-85e6-a377d9035ee3");
  
  // relations
  
  public cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTestLevels selectDynamicTestLevels();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel.ITestDynamicGroup> selectTestDynamicGroup();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b35d2498-918e-11e9-85e6-a377d9035ee3,M1iDmTqBwJlU90cyj5BagVc1mBU=] */
