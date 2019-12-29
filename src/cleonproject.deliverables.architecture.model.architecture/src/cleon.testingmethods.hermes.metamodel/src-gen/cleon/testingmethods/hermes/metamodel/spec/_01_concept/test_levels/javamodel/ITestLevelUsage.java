package cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestLevelUsage extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a0ed7d6a-264b-11e6-ae54-e50d44645ae7");
  
  // relations
  
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevel selectTestLevel();
  
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevelGoals selectTestLevelGoals();
  
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestCriterias selectTestCriterias();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a0ed7d6a-264b-11e6-ae54-e50d44645ae7,bOsrz+a25zCyjkMXVsRb0gdjoQw=] */