package cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IFlow extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.spec.resources.descriptions.javamodel.IMandatoryDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("eff51cbc-2803-11e6-b263-9db62e053e59");
  
  public java.lang.Boolean selectDirectionTo();
  
  // relations
  
  public cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.IMember selectFrom();
  
  public cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.IMember selectTo();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,eff51cbc-2803-11e6-b263-9db62e053e59,pccGYJqL75wf1TeYkNDI6SNKiZM=] */
