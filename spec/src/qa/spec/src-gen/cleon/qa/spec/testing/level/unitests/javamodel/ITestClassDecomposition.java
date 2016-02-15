package cleon.qa.spec.testing.level.unitests.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestClassDecomposition extends ch.actifsource.core.javamodel.IDecorator, cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e43712cd-19f3-11e5-a57b-e324953fb3a6");
  
  // relations
  
  public cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition selectClassUnderTest();
  
  public cleon.qa.spec.testing.level.unitests.javamodel.ITestClass selectClasses();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e43712cd-19f3-11e5-a57b-e324953fb3a6,xaCm4dnomosIU6Y91TtlFSJSfuo=] */
