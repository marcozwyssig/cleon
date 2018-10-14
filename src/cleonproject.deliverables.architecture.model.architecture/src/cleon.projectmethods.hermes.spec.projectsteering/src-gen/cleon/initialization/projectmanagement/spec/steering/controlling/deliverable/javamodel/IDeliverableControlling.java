package cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeliverableControlling extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2ad5f88a-bdfd-11e6-a3f0-c7681ee45a3f");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable();
  
  public cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableRisks selectRisks();
  
  public cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableImpediments selectImpediments();
  
  public cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp selectQuality();
  
  public cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp selectDeadline();
  
  public cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp selectRisk();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2ad5f88a-bdfd-11e6-a3f0-c7681ee45a3f,Ykgv6IkffWv78iB7K0WiH/1BD5g=] */
