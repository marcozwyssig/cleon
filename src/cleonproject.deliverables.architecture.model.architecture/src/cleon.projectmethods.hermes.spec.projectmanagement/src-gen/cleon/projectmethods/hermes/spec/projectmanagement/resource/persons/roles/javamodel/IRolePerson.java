package cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.roles.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRolePerson extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("464eda4e-bb5f-11e8-921b-c1cf01226512");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.roles.javamodel.IRole selectRole();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,464eda4e-bb5f-11e8-921b-c1cf01226512,I0ThHdrge9IuM996wkvpiYkgs4Y=] */
