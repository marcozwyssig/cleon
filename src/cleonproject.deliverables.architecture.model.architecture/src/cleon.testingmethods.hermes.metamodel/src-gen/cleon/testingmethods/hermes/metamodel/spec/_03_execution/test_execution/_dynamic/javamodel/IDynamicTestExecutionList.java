package cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDynamicTestExecutionList extends cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution.javamodel.ITestExecution, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("25396337-90e1-11e9-b8c5-7968e3120b73");
  
  // relations
  
  public cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel.ITester selectTester();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecution> selectDynamicTestExecution();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,25396337-90e1-11e9-b8c5-7968e3120b73,SSkOGUEputTFejAC8f/Qd/w7jz0=] */
