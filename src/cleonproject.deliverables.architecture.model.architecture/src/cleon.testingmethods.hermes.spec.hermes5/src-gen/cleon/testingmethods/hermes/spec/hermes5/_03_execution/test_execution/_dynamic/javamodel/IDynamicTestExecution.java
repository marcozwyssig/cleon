package cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDynamicTestExecution extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db5a1fe6-9192-11e9-85e6-a377d9035ee3");
  
  // relations
  
  public cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest selectAbstractDynamicTest();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic.javamodel.IDynamicTestStepExecution> selectTestStep();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db5a1fe6-9192-11e9-85e6-a377d9035ee3,Sbv5lUbOPahHQK8TnX6+whReGFE=] */
