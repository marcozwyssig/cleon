package cleon.testingmethods.hermes.spec.hermes5._01_concept.test_objects.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestObjects extends cleon.testingmethods.hermes.spec.hermes5._01_concept.javamodel.IAbstractTestingChapter, cleon.common.doc.doc.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fcd96549-1519-11e6-a185-8f02bf3f95ba");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_objects.javamodel.IStaticTestObject> selectStaticTestObjects();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_objects.javamodel.IDynamicTestObject> selectDynamicTestObjects();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fcd96549-1519-11e6-a185-8f02bf3f95ba,2LJzykww6he6Il8pzsNTMZI1DpQ=] */
