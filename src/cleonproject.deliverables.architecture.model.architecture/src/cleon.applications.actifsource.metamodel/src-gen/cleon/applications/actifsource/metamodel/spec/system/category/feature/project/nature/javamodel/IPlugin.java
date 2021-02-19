package cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPlugin extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.INature {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d5d42a4f-41a9-11e8-81d0-774e4d9334dd");
  
  public java.util.List<java.lang.String> selectAccessrules();
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage> selectExportPackages();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d5d42a4f-41a9-11e8-81d0-774e4d9334dd,tCFUtLsSnKjxswI2KmHPoR8Ty3s=] */
