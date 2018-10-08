package cleon.applications.actifsource.spec.actifsource.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IZoo extends cleon.conception.architecture.spec.arc42.javamodel.ISoftwareSystem, cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersionAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7b6b4712-f986-11e5-a7fd-010f93305101");
  
  // relations
  
  public java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategoryAggregateDecomposite> selectCategories();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7b6b4712-f986-11e5-a7fd-010f93305101,oqh0KA7UdPIF6Q0xQXSRqBg+Reo=] */
