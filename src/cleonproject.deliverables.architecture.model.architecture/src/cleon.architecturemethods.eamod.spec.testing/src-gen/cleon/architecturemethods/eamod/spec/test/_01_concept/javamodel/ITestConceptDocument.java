package cleon.architecturemethods.eamod.spec.test._01_concept.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestConceptDocument extends cleon.common.doc.spec.doc.document.javamodel.INamedDocument, cleon.architecturemethods.eamod.spec.test._01_concept.javamodel.IAbstractTestingChapter, cleon.common.resources.spec.resources.outcomes.javamodel.IDocumentation {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c050d74c-d400-11e5-9dfc-cf0f3e030023");
  
  // relations
  
  public cleon.architecturemethods.eamod.spec.test._01_concept._01_test_goals.javamodel.ITestGoals selectTestGoals();
  
  public cleon.architecturemethods.eamod.spec.test._01_concept._02_test_objects.javamodel.ITestObjects selectTestObjects();
  
  public cleon.architecturemethods.eamod.spec.test._01_concept._03_test_methods.javamodel.ITestMethods selectTestMethods();
  
  public cleon.architecturemethods.eamod.spec.test._01_concept._06_test_infrastructure.javamodel.ITestInfrastructures selectTestInfrastructures();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument selectPlanningDocument();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c050d74c-d400-11e5-9dfc-cf0f3e030023,I6xu8NKfGaX0GAuguX31Wf84FA0=] */
