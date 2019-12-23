package cleon.applications.actifsource.spec.actifsource.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IZoo extends cleon.architecturemethods.arc42.spec.arc42.javamodel.ISoftwareSystem, cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersionAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7b6b4712-f986-11e5-a7fd-010f93305101");
  
  // relations
  
  public java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategory> selectCategories();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7b6b4712-f986-11e5-a7fd-010f93305101,JTyY44Mv4sPf1sgrgoTIZfGK8+U=] */
