package cleon.initialization.projectmanagement.spec.resource.persons.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPersons extends cleon.initialization.projectmanagement.spec.resource.javamodel.IResources {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("68e1ab2e-a7e4-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson> selectPersons();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,68e1ab2e-a7e4-11e5-82dd-3b995d9c840c,DlvRncnTAMzFo6kXNt2iB4tYsfU=] */
