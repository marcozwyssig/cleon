package cleon.testingmethods.hermes.spec.hermes5._01_concept.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestConceptDocument extends cleon.common.doc.spec.doc.document.javamodel.INamedDocument, cleon.testingmethods.hermes.spec.hermes5._01_concept.javamodel.IAbstractTestingChapter, cleon.common.doc.spec.doc.chapter.about.javamodel.IAboutAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c050d74c-d400-11e5-9dfc-cf0f3e030023");
  
  // relations
  
  public cleon.testingmethods.hermes.spec.hermes5._01_concept._01_test_goals.javamodel.ITestGoals selectTestGoals();
  
  public cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel.ITestObjects selectTestObjects();
  
  public cleon.testingmethods.hermes.spec.hermes5._01_concept._03_test_levels.javamodel.ITestLevels selectTestLevels();
  
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept._04_test_types.javamodel.ITestTypes> selectTestTypes();
  
  public cleon.testingmethods.hermes.spec.hermes5._01_concept._06_test_infrastructure.javamodel.ITestInfrastructures selectTestInfrastructures();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument selectPlanningDocument();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c050d74c-d400-11e5-9dfc-cf0f3e030023,9IqsrwA2GYodq4kD4jwx94dseLQ=] */
