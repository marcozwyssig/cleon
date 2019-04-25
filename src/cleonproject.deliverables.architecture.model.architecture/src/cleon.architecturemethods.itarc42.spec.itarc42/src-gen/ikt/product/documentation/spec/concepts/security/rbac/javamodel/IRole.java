package ikt.product.documentation.spec.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRole extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e33fb742-35e4-11e9-9d58-25409887bb2a");
  
  // relations
  
  public ikt.product.documentation.spec.buildingblock.javamodel.INamedSystemComponent selectSystemComponent();
  
  public java.util.List<? extends ikt.product.documentation.spec.concepts.security.rbac.javamodel.IActivity> selectHasActivities();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e33fb742-35e4-11e9-9d58-25409887bb2a,a6JRUj9eqvoEevU67hGUdD8bC78=] */
