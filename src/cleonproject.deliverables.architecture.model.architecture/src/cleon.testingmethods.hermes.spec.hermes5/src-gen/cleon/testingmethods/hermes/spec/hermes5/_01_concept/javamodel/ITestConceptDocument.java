package cleon.testingmethods.hermes.spec.hermes5._01_concept.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestConceptDocument extends cleon.common.doc.doc.spec.document.javamodel.INamedDocument, cleon.testingmethods.hermes.spec.hermes5._01_concept.javamodel.IAbstractTestingChapter, cleon.common.doc.doc.spec.chapter.about.javamodel.IAboutAware, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c050d74c-d400-11e5-9dfc-cf0f3e030023");
  
  // relations
  
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_goals.javamodel.ITestGoals selectTestGoals();
  
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_objects.javamodel.ITestObjects selectTestObjects();
  
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestLevels selectTestLevels();
  
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel.ITestTypes selectTestTypes();
  
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.javamodel.ITestInfrastructures selectTestInfrastructures();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c050d74c-d400-11e5-9dfc-cf0f3e030023,0mVoUEctV1DpyUWr6OSsZlaRjn4=] */
