package cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProductVariant extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4026c4e3-2acf-11e9-b83f-8be423c00623");
  
  // attributes
  
  public java.lang.String selectItemNumber();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductVariantOptions> selectProductVariantOptions();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4026c4e3-2acf-11e9-b83f-8be423c00623,fbH0oB9r/jFUJ/ngR1EZQ/NxwUY=] */
