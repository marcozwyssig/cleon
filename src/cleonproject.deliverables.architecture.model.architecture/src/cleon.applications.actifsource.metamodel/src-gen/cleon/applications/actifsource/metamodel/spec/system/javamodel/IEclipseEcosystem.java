package cleon.applications.actifsource.metamodel.spec.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEclipseEcosystem extends cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISoftwareSystem, cleon.common.resources.metamodel.spec.versions.javamodel.ISemanticVersionAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7b6b4712-f986-11e5-a7fd-010f93305101");
  
  // relations
  
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.javamodel.ICategory> selectCategories();
  
  public cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackages selectRootPackages();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7b6b4712-f986-11e5-a7fd-010f93305101,Rpi8i59ruFJYNMNFwiQipQ6pcVk=] */
