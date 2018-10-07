package cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.action.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Action extends DynamicResource implements IAction {

  // abstract implementation, only used for static method calls
  private Action() {
    super(IAction.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,79d4efa5-324c-11e6-ab4d-73a9260c8088,zO92ntge9UtZxpxSczxAGuJ45SI=] */
