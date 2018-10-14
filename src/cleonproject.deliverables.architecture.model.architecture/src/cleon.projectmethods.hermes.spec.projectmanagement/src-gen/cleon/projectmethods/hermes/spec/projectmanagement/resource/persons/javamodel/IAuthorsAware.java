package cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAuthorsAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bce16132-bff1-11e7-9dcc-23cb45d05890");
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson> selectAuthors();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bce16132-bff1-11e7-9dcc-23cb45d05890,oEiYTYvTm4E64QQDFE/7XhllbrM=] */
