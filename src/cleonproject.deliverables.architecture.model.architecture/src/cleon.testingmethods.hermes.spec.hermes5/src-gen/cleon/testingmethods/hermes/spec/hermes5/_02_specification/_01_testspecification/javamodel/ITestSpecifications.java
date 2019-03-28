package cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestSpecifications extends cleon.testingmethods.hermes.spec.hermes5._01_concept.javamodel.IAbstractTestingChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1c345fe2-1db1-11e6-974b-630b7f5d3b95");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._static.javamodel.IStaticTestSpecification> selectStaticTestSpecifications();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.IDynamicTestSpecification> selectDynamicTestSpecifications();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1c345fe2-1db1-11e6-974b-630b7f5d3b95,C45Vpt/1jpqZj2McIwz8cOdssJ4=] */
