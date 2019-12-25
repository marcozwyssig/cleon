package cleon.common.resources.metamodel.spec.priority.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class PriorityAware extends DynamicResource implements IPriorityAware {

  // abstract implementation, only used for static method calls
  private PriorityAware() {
    super(IPriorityAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.common.resources.metamodel.spec.priority.javamodel.IPriorityAware> selectToMePriority(cleon.common.resources.metamodel.spec.priority.javamodel.IPriority object) {
    return _getToMeList(object.getRepository(), cleon.common.resources.metamodel.spec.priority.javamodel.IPriorityAware.class, cleon.common.resources.metamodel.spec.priority.PriorityPackage.PriorityAware_priority, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db7fa68a-06d7-11e6-8d3e-13e5be4bd43b,3duOl1ixC/qEsagM0pGieXGShfo=] */
