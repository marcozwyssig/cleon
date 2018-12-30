package cleon.architecturemethods.eamod.spec.analysis.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPriorityWeighting extends ch.actifsource.core.javamodel.IDecorator, cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.IWeightingAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("02e39a6b-a6fc-11e8-9c81-8bd68c62e435");
  
  // relations
  
  public cleon.common.resources.spec.resources.priority.javamodel.IPriority selectPriority();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,02e39a6b-a6fc-11e8-9c81-8bd68c62e435,R0gRdAdRiAXlcd/qHXLmEjwJtVE=] */
