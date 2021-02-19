package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TargetDate extends DynamicResource implements ITargetDate {

  // abstract implementation, only used for static method calls
  private TargetDate() {
    super(ITargetDate.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.javamodel.ITargetDate> selectToMeDeadline(cleon.common.calendar.metamodel.spec.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.javamodel.ITargetDate.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.ResourcePackage.TargetDate_deadline, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2ed622a1-20ba-11e6-9bb5-2b7a5dccc043,QUkRmrf11ZjyJjxp1ZQoGlvy7yo=] */
