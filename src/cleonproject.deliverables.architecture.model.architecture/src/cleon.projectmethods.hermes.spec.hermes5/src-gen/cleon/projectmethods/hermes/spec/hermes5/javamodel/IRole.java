package cleon.projectmethods.hermes.spec.hermes5.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRole extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.spec.resources.id.javamodel.IStringBusinessObjectId, cleon.common.resources.spec.resources.naming.javamodel.IDisplayName, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("92f47870-31ca-11e8-8a84-6f139e67278b");
  
  // attributes
  
  public java.util.List<java.lang.String> selectResponsibility();
  
  public java.util.List<java.lang.String> selectAuthority();
  
  public java.util.List<java.lang.String> selectSkills();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,92f47870-31ca-11e8-8a84-6f139e67278b,/6/WZkWR7yeTXOrWjXvwQFmstMM=] */
