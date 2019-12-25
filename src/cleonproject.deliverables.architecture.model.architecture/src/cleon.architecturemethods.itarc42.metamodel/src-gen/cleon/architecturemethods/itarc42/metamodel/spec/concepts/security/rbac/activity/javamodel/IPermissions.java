package cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPermissions extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a1b6bd66-8099-11e9-8e65-f3f639e40a34");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IPermission> selectPermissions();
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IPermissions> selectBasedOn();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a1b6bd66-8099-11e9-8e65-f3f639e40a34,tH+onFFAH1tKrHZw3ayh0LFkF5M=] */
