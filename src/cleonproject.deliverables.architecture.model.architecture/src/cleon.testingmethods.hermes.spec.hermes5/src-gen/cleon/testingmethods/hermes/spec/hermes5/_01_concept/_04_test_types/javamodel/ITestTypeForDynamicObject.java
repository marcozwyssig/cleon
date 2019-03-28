package cleon.testingmethods.hermes.spec.hermes5._01_concept._04_test_types.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestTypeForDynamicObject extends cleon.testingmethods.hermes.spec.hermes5._01_concept._04_test_types.javamodel.ITestTypeForObject {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("90ed9e98-4fd9-11e9-96a9-f9ba7cff2393");
  
  // relations
  
  public cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel.ITestObject selectTestObject();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._01_concept._04_test_types.javamodel.ITestLevelForDynamicObject> selectTestLevelForDynamicObject();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,90ed9e98-4fd9-11e9-96a9-f9ba7cff2393,0VpLWsYQzkkReEDnUXYesSprHjM=] */
