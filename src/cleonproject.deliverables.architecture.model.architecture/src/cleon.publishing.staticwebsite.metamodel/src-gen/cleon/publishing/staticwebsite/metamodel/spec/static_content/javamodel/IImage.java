package cleon.publishing.staticwebsite.metamodel.spec.static_content.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IImage extends cleon.publishing.staticwebsite.metamodel.spec.static_content.javamodel.IStaticContent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c844cab0-afde-11e5-a548-13e054f2d74f");
  
  // relations
  
  public cleon.common.resources.metamodel.spec.image.javamodel.IImageType selectType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c844cab0-afde-11e5-a548-13e054f2d74f,ErktHV9rZFVuBV4RgbBF6hNOH8Y=] */
