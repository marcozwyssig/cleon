package cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestPlan extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8bf93951-eabe-11e5-838a-6dbe7118dd11");
  
  // relations
  
  public cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel.ITestScope selectTestScope();
  
  public cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scheduling.javamodel.ITestScheduling selectTestScheduling();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8bf93951-eabe-11e5-838a-6dbe7118dd11,0LoVBASRUdNYs+7Wutfnu8Nktno=] */
