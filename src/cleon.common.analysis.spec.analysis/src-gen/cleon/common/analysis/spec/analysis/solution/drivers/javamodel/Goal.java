package cleon.common.analysis.spec.analysis.solution.drivers.javamodel;

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
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.lang.String selectDescription() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Goal_description);
  }
    
  public void setDescription(java.lang.String description) {
     _setSingleAttribute(cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Goal_description, description);
  }

  @Override
  public java.lang.String selectGoalname() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Goal_goalname);
  }
    
  public void setGoalname(java.lang.String goalname) {
     _setSingleAttribute(cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Goal_goalname, goalname);
  }

  @Override
  public java.lang.Integer selectWeighting() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Goal_weighting);
  }
    
  public void setWeighting(java.lang.Integer weighting) {
     _setSingleAttribute(cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Goal_weighting, weighting);
  }

  // relations
  
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
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Goal_description, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Goal_goalname, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Goal_weighting, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0797167b-3c15-11e5-9962-cf3035adb922,ZuQLvmp+bbdv98Gr60GQgCHUC+g=] */
