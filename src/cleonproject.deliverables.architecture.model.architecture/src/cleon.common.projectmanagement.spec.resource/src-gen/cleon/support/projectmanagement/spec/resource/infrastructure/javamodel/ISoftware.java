package cleon.support.projectmanagement.spec.resource.infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISoftware extends cleon.support.projectmanagement.spec.resource.infrastructure.javamodel.IAsset {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("052b13bf-a7e0-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public cleon.common.resources.spec.calendar.javamodel.IDay selectPurchaseDate();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,052b13bf-a7e0-11e5-82dd-3b995d9c840c,dWwuHBWYLcDhtiYctCUcdo4A5+M=] */
