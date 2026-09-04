package cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IManufactor extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.common.resources.metamodel.spec.naming.javamodel.IShortName {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2371f6a6-d0b1-11e8-b005-f7630e4c29c0");
  
  public java.lang.Integer selectIana();
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct> selectProducts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2371f6a6-d0b1-11e8-b005-f7630e4c29c0,Mx7LZ3dSRFfHYoSqdmXj9Z8jkhk=] */
