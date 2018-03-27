package cleon.initialization.projectmanagement.spec.planning.constraints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Constraint extends DynamicResource implements IConstraint {

  // abstract implementation, only used for static method calls
  private Constraint() {
    super(IConstraint.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.planning.constraints.javamodel.IConstraint> selectToMeProject(cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.constraints.javamodel.IConstraint.class, cleon.initialization.projectmanagement.spec.planning.constraints.ConstraintsPackage.Constraint_project, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,531b7044-d42e-11e6-8a1d-7fdd5d29730e,GGV+1aOJCsp+nGId8XeP+zd16F4=] */
