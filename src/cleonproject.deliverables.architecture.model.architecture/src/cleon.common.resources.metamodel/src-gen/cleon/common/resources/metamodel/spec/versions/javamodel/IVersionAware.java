package cleon.common.resources.metamodel.spec.versions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IVersionAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0aa97623-bff9-11e8-a3d0-5394fd9291a1");
  
  // relations
  
  public cleon.common.resources.metamodel.spec.versions.javamodel.IVersion selectVersion();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0aa97623-bff9-11e8-a3d0-5394fd9291a1,Op9KCOyBOyl4PLNzVfK5b/3h0a0=] */
