package cleon.conception.actifsource.spec.actifsource.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IZoo extends cleon.conception.applications.spec.arc42.javamodel.ISoftwareSystem, cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersionAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7b6b4712-f986-11e5-a7fd-010f93305101");
  
  // relations
  
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource.system.category.javamodel.ICategoryAggregateDecomposite> selectCategories();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7b6b4712-f986-11e5-a7fd-010f93305101,J6qAFF5pHwGdSy7HD0KWP0sF2U0=] */
