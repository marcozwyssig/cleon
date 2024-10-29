package cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestExecuteDynamicGroup extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2529ae0a-918f-11e9-85e6-a377d9035ee3");
  
  // relations
  
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup selectDynamicTestGroup();
  
  public java.util.List<? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest> selectTestDynamicTestScope();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2529ae0a-918f-11e9-85e6-a377d9035ee3,AOeWt5sDD04y17Veea0YYYqIt70=] */
