package cleon.projectmethods.hermes.spec.projectsteering.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISteering extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("08ac260a-bdf7-11e6-a3f0-c7681ee45a3f");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.javamodel.IRisknanagement selectRisks();
  
  public cleon.projectmethods.hermes.spec.projectsteering.controlling.javamodel.IControlling selectControlling();
  
  public cleon.projectmethods.hermes.spec.projectsteering.impediments.javamodel.IImpediments selectImpediments();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument selectPlanning();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,08ac260a-bdf7-11e6-a3f0-c7681ee45a3f,/v0dmhUGGMtQnZERx2X2miD085A=] */
