package cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDocumentOutcome extends cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bab231a7-bfeb-11e8-a3d0-5394fd9291a1");
  
  // relations
  
  public cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IDocumentStage selectDocumentStage();
  
  public cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion selectVersion();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bab231a7-bfeb-11e8-a3d0-5394fd9291a1,xLlZr/nKbuI0bKxgS5gOquRcqxw=] */
