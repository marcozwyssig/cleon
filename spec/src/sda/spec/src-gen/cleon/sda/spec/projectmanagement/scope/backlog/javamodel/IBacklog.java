package cleon.sda.spec.projectmanagement.scope.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBacklog extends cleon.doc.spec.document.javamodel.ISubDocument, cleon.doc.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("28af8502-ff9c-11e4-ac0a-959b440f987f");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup> selectFeatureGroups();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,28af8502-ff9c-11e4-ac0a-959b440f987f,KpJifv7CwN9XM+tCObee74k63zU=] */