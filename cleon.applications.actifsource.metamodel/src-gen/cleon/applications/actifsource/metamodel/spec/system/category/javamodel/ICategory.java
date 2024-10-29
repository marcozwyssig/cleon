package cleon.applications.actifsource.metamodel.spec.system.category.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICategory extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.INamedComponentComposition {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("27c04263-3c6a-11e6-aafa-bd565efc0ead");
  
  // relations
  
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.javamodel.ICategoryDependency> selectHasDependency();
  
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeature> selectFeatures();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,27c04263-3c6a-11e6-aafa-bd565efc0ead,jU2w8hgHUheZnFjtEcJz69vAUvg=] */
