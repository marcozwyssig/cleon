package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Constraint extends DynamicResource implements IConstraint {

  // abstract implementation, only used for static method calls
  private Constraint() {
    super(IConstraint.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.javamodel.IConstraint> selectToMeProject(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.javamodel.IConstraint.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.ConstraintsPackage.Constraint_project, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,531b7044-d42e-11e6-8a1d-7fdd5d29730e,yQ/q4eR/lNdrcKqEDTX5379Az68=] */
