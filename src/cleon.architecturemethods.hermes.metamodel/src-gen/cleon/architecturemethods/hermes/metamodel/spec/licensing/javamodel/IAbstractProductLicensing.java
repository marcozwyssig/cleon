package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractProductLicensing extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapterPath {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("de7849ee-dfbe-11ef-b0be-9b4cac321140");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant selectLicenseForProductVariant();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,de7849ee-dfbe-11ef-b0be-9b4cac321140,cZD7lWChuQcHg0DdPz7JD60QQW0=] */
