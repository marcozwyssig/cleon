package cleon.initialization.projectmanagement.spec.steering.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISteering extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("08ac260a-bdf7-11e6-a3f0-c7681ee45a3f");
  
  // relations
  
  public cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRisknanagement selectRisks();
  
  public cleon.initialization.projectmanagement.spec.steering.controlling.javamodel.IControlling selectControlling();
  
  public cleon.initialization.projectmanagement.spec.steering.impediments.javamodel.IImpediments selectImpediments();
  
  public cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning selectPlanning();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,08ac260a-bdf7-11e6-a3f0-c7681ee45a3f,TP5dR7UkcgUdO8jto1EyEVB/r+I=] */
