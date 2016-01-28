package cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IStory extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem, ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("461882c1-ff9c-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson selectRequestedBy();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,461882c1-ff9c-11e4-ac0a-959b440f987f,xkDXAIpo5VTMuJC476yjKFNx9IM=] */
