package cleon.projectmethods.hermes.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITask extends cleon.common.resources.metamodel.spec.id.javamodel.IStringBusinessObjectId, ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.metamodel.spec.naming.javamodel.IDisplayName {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("df8e50c8-31ce-11e8-8a84-6f139e67278b");
  
  // attributes
  
  public java.lang.String selectPurpose();
  
  public cleon.projectmethods.hermes.metamodel.spec.javamodel.IRole selectResponsibleRole();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,df8e50c8-31ce-11e8-8a84-6f139e67278b,H7Y65ayHDwWnbcfLkJnN1Fy5iLo=] */
