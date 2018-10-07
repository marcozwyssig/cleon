package cleon.initialization.projectmanagement.spec.resource.persons.roles.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoles extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5db2666a-bb5f-11e8-921b-c1cf01226512");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.resource.persons.roles.javamodel.IRolePerson> selectRoles();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5db2666a-bb5f-11e8-921b-c1cf01226512,FUAjW7+T+u3mab43a/46gdHCWX4=] */
