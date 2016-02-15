package cleon.testing.spec.level.unitests.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestPackageDecomposition extends cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6a1dc86a-18fc-11e5-b505-7b16b1341920");
  
  // relations
  
  public cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition selectPackageUnderTest();
  
  public cleon.testing.spec.level.unitests.javamodel.ITestPackage selectTestPackages();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6a1dc86a-18fc-11e5-b505-7b16b1341920,tiUUrgUwa2MuOn4UxRYyHby+s+I=] */
