package cleon.tdd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestPackage extends ch.actifsource.core.javamodel.IDecorator, cleon.arc42.spec._05_buildingblockview.javamodel.IOwnBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8faff353-9a2f-11e3-8bcf-e973a9ae2871");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.tdd.spec.javamodel.ITestClass> selectTestClasses();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.tdd.spec.javamodel.ITestPackage> selectTestPackage();
  
  public cleon.uml.spec.structural.packages.javamodel.IPackage selectPackage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8faff353-9a2f-11e3-8bcf-e973a9ae2871,Lh1H81o1G8AUIBqu4dto3B3sKRI=] */
