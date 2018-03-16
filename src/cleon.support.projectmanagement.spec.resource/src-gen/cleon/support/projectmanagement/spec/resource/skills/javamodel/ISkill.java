package cleon.support.projectmanagement.spec.resource.skills.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISkill extends cleon.support.projectmanagement.spec.resource.javamodel.IResource, ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("76d12317-a7d8-11e5-82dd-3b995d9c840c");
  
  // attributes
  
  public java.lang.String selectDescription();
  
  public cleon.common.resources.spec.resources.importance.javamodel.IImportance selectImportance();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,76d12317-a7d8-11e5-82dd-3b995d9c840c,3+1+jR9FlCBR8iOGsNPuzM74+j4=] */
