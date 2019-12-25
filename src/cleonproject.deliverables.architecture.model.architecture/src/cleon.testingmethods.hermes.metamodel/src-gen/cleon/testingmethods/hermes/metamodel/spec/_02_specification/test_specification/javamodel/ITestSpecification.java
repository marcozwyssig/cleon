package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestSpecification extends ch.actifsource.core.javamodel.IDecorator, cleon.testingmethods.hermes.metamodel.spec._01_concept.javamodel.IAbstractTestingChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ade37916-eabe-11e5-838a-6dbe7118dd11");
  
  // relations
  
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.javamodel.ITestObject selectTestObject();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ade37916-eabe-11e5-838a-6dbe7118dd11,KomvSqBhGmzFUN9+/aHh5Qv/5bA=] */
