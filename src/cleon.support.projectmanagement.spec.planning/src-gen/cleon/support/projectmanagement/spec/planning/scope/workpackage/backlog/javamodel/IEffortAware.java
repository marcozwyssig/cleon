package cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEffortAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a2ffdac0-e6d4-11e5-a502-93f18d5742dc");
  
  // relations
  
  public cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort selectEstimate();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a2ffdac0-e6d4-11e5-a502-93f18d5742dc,+f5BD3OjNr43yKoGYD3UnWq4DLk=] */
