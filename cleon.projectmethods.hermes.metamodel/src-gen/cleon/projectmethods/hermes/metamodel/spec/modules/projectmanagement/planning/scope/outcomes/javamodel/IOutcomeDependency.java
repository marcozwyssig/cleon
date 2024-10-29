package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOutcomeDependency extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("12cf9b7d-07d6-11e6-a579-8304ec3aa032");
  
  public java.lang.String selectReason();
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome selectTo();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,12cf9b7d-07d6-11e6-a579-8304ec3aa032,p9iQR24hd3kKgRASEHGxTLUpflo=] */
