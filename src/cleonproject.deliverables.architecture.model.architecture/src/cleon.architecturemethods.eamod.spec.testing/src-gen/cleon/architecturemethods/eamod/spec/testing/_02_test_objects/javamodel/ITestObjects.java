package cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestObjects extends cleon.architecturemethods.eamod.spec.testing.javamodel.ITestingDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fcd96549-1519-11e6-a185-8f02bf3f95ba");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObject> selectStaticTestObjects();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObject> selectDynamicTestObjects();
  
  public java.util.List<? extends cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes> selectOutcomes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fcd96549-1519-11e6-a185-8f02bf3f95ba,5P+IaqKgGViJQ1EEGsoOjiy4V7Q=] */
