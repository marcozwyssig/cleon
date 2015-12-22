package cleon.sda.spec.analysis.solution.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Goal extends DynamicResource implements IGoal {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGoal> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGoal>() {
    
    @Override
    public IGoal create() {
      return new Goal();
    }
    
    @Override
    public IGoal create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Goal(resourceRepository, resource);
    }
  
  };

  public Goal() {
    super(IGoal.TYPE_ID);
  }
  
  public Goal(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGoal.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectGoaldescription() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_goaldescription);
  }
    
  public void setGoaldescription(java.lang.String goaldescription) {
     _setSingleAttribute(cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_goaldescription, goaldescription);
  }

  @Override
  public java.lang.String selectGoalname() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_goalname);
  }
    
  public void setGoalname(java.lang.String goalname) {
     _setSingleAttribute(cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_goalname, goalname);
  }

  // relations
  
  @Override
  public cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance selectImportance() {
    return _getSingle(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_importance);
  }

  public Goal setImportance(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance importance) {
    _setSingle(cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_importance, importance);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Goal setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_goaldescription, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_goalname, visitor);
    // relations
    _acceptSingle(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_importance, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.sda.spec.analysis.solution.drivers.javamodel.IGoal> selectToMeImportance(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.analysis.solution.drivers.javamodel.IGoal.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_importance, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0797167b-3c15-11e5-9962-cf3035adb922,IhDgPvF5FJ5mmBZ/87GutB6gN4Y=] */
