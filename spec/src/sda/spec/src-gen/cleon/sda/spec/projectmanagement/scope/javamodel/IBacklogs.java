package cleon.sda.spec.projectmanagement.scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBacklogs extends cleon.doc.spec.document.javamodel.ISubDocument, cleon.doc.spec.document.javamodel.INoSubDocuments, cleon.sda.spec.projectmanagement.javamodel.IProjectDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("451dafb7-b9c4-11e5-a5dc-db9071475fc6");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.scope.javamodel.IBacklogForOutcome> selectBacklogForOutcome();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,451dafb7-b9c4-11e5-a5dc-db9071475fc6,KA4dh1WkBQszWaPS/feCVwDN+z0=] */
