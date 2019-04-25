package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeliverableAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8a3b3adc-4f0c-11e9-ba59-f1daaff821cc");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument selectPlanning();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8a3b3adc-4f0c-11e9-ba59-f1daaff821cc,oBttOdVj7jRTmlnQZTGyeMa2rc0=] */
