package cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestDynamicSpecificationScope extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.doc.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5af877e5-918d-11e9-85e6-a377d9035ee3");
  
  // relations
  
  public cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTestSpecification selectDynamicTestSpecification();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel.ITestDynamicTestLevelScope> selectTestDynamicTestLevelScope();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5af877e5-918d-11e9-85e6-a377d9035ee3,pGKUBC7+zKxMQIxfp/P3D0zwsjc=] */
