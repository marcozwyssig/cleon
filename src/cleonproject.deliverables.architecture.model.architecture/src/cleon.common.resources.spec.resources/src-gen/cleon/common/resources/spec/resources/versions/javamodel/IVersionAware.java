package cleon.common.resources.spec.resources.versions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IVersionAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0aa97623-bff9-11e8-a3d0-5394fd9291a1");
  
  // relations
  
  public cleon.common.resources.spec.resources.versions.javamodel.IVersion selectVersion();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0aa97623-bff9-11e8-a3d0-5394fd9291a1,ta7JiLGoj60fX/RGoWDXBXXY/nI=] */
