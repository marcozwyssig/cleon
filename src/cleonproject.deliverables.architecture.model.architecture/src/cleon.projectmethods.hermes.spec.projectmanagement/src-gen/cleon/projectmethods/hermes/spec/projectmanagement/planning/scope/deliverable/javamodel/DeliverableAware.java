package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DeliverableAware extends DynamicResource implements IDeliverableAware {

  // abstract implementation, only used for static method calls
  private DeliverableAware() {
    super(IDeliverableAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware> selectToMeAlikeDeliverable(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_alikeDeliverable, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8a3b3adc-4f0c-11e9-ba59-f1daaff821cc,bWKday8B9y5hmMj6jRcHhP4W/gU=] */
