package cleon.projectmethods.hermes.spec.projectmanagement.resource.teams.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITeam extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractNamedChapter, cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7303e9c7-2eea-11e6-8bd9-a77b8d2a3a0e");
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson> selectPersons();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7303e9c7-2eea-11e6-8bd9-a77b8d2a3a0e,hT45DSh5JdIoL3XKbXxSaIwId3w=] */
