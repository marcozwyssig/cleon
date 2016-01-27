package cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbsences extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8e22ec09-c4c6-11e5-8558-4b8affb7767c");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseYear> selectAbsenseYear();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8e22ec09-c4c6-11e5-8558-4b8affb7767c,Ew6CyS3Fm7fRVnSzIJpZQMeF56U=] */
