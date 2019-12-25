package cleon.testingmethods.hermes.metamodel.spec._03_execution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestExecutionDocument extends cleon.common.doc.metamodel.spec.document.javamodel.INamedDocument, cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAboutAware, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware, cleon.common.glossary.metamodel.spec.javamodel.IGlossaryAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e85c9091-4f02-11e9-ba59-f1daaff821cc");
  
  // relations
  
  public cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.javamodel.ITestPlan selectTestPlan();
  
  public cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution.javamodel.ITestExecutions selectTestExecutions();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e85c9091-4f02-11e9-ba59-f1daaff821cc,rHtUtm4qG/2MlD60kFTYktLhM7Q=] */
