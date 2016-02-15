package cleon.testing.spec.level.unitests.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestPackage extends cleon.uml.spec.structural.packages.javamodel.IPackage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8faff353-9a2f-11e3-8bcf-e973a9ae2871");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testing.spec.level.unitests.javamodel.ITestPackageDecomposition> selectTestPackages();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testing.spec.level.unitests.javamodel.ITestClassDecomposition> selectTestClasses();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8faff353-9a2f-11e3-8bcf-e973a9ae2871,69oJ/T5mp4I/ecrBBKJPVy4Sd2s=] */
