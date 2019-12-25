package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.controlling.deliverable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeliverableControlling extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2ad5f88a-bdfd-11e6-a3f0-c7681ee45a3f");
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.controlling.deliverable.javamodel.IDeliverableRisks selectRisks();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.controlling.deliverable.javamodel.IDeliverableImpediments selectImpediments();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.controlling.deliverable.javamodel.IDeliverableLamp selectQuality();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.controlling.deliverable.javamodel.IDeliverableLamp selectDeadline();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.controlling.deliverable.javamodel.IDeliverableLamp selectRisk();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2ad5f88a-bdfd-11e6-a3f0-c7681ee45a3f,YjTTnulhcPVpugkfNkTRQAH8VSM=] */
