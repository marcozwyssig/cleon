package cleon.initialization.projectmanagement.spec.resource.teams.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITeam extends cleon.common.doc.spec.doc.chapter.javamodel.INamedChapter, cleon.initialization.projectmanagement.spec.resource.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7303e9c7-2eea-11e6-8bd9-a77b8d2a3a0e");
  
  // relations
  
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson> selectPersons();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7303e9c7-2eea-11e6-8bd9-a77b8d2a3a0e,QdMHLB4FF51pMlaH5Fgsg5ETOQI=] */
