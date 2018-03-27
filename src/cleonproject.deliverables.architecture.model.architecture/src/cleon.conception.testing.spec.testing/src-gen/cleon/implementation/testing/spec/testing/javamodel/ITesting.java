package cleon.implementation.testing.spec.testing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITesting extends cleon.common.doc.spec.doc.document.javamodel.INamedDocument, cleon.implementation.testing.spec.testing.javamodel.ITestingDocument, cleon.common.resources.spec.resources.outcomes.javamodel.IDocumentation {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c050d74c-d400-11e5-9dfc-cf0f3e030023");
  
  // relations
  
  public cleon.implementation.testing.spec.testing._01_test_goals.javamodel.ITestGoals selectTestGoals();
  
  public cleon.implementation.testing.spec.testing._02_test_objects.javamodel.ITestObjects selectTestObjects();
  
  public cleon.implementation.testing.spec.testing._03_test_methods.javamodel.ITestMethods selectTestMethods();
  
  public cleon.implementation.testing.spec.testing._07_testspecification.javamodel.ITestSpecifications selectTestSpecifications();
  
  public cleon.implementation.testing.spec.testing._06_test_infrastructure.javamodel.ITestInfrastructures selectTestInfrastructures();
  
  public cleon.implementation.testing.spec.testing._09_test_execution.javamodel.ITestExecutions selectTestExecutions();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c050d74c-d400-11e5-9dfc-cf0f3e030023,cMWQCejckbLt7A9ha798CNghdfk=] */
