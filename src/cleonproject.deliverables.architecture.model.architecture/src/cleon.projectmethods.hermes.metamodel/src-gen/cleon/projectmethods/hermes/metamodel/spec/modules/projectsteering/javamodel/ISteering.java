package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISteering extends cleon.common.doc.metamodel.spec.document.javamodel.INamedDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("08ac260a-bdf7-11e6-a3f0-c7681ee45a3f");
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.javamodel.IRiskManagement selectRisks();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.controlling.javamodel.IControlling selectControlling();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.impediments.javamodel.IImpediments selectImpediments();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanningDocument selectPlanning();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,08ac260a-bdf7-11e6-a3f0-c7681ee45a3f,6RqiH38utqckMkG5Vbe7nIoaoZY=] */
