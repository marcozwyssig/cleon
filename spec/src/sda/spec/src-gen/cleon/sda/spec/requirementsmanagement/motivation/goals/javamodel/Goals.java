package cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Goals extends DynamicResource implements IGoals {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGoals> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGoals>() {
    
    @Override
    public IGoals create() {
      return new Goals();
    }
    
    @Override
    public IGoals create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Goals(resourceRepository, resource);
    }
  
  };

  public Goals() {
    super(IGoals.TYPE_ID);
  }
  
  public Goals(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGoals.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal> selectGoals() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal.class, cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goals_goals);
  }

  public Goals setGoals(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal> goals) {
    _setList(cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goals_goals, goals);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Goals setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal.class, cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goals_goals, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoals selectToMeGoals(cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoals.class, cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goals_goals, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,18cfe197-a951-11e5-bda2-a7fc3bd7c783,2y0XEpeTHellHlKMRpe10M3bNHg=] */
