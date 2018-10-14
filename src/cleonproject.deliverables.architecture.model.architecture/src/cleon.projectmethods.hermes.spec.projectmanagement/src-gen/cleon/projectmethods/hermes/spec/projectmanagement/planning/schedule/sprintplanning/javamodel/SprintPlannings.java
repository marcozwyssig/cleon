package cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprintplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SprintPlannings extends DynamicResource implements ISprintPlannings {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprintPlannings> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprintPlannings>() {
    
    @Override
    public ISprintPlannings create() {
      return new SprintPlannings();
    }
    
    @Override
    public ISprintPlannings create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SprintPlannings(resourceRepository, resource);
    }
  
  };

  public SprintPlannings() {
    super(ISprintPlannings.TYPE_ID);
  }
  
  public SprintPlannings(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISprintPlannings.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprintplanning.javamodel.ISprintPlanning> selectSprintplannings() {
    return _getMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprintplanning.javamodel.ISprintPlanning.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlannings_sprintplannings);
  }

  public SprintPlannings setSprintplannings(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprintplanning.javamodel.ISprintPlanning> sprintplannings) {
    _setMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlannings_sprintplannings, sprintplannings);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SprintPlannings setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprintplanning.javamodel.ISprintPlanning.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlannings_sprintplannings, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprintplanning.javamodel.ISprintPlannings selectToMeSprintplannings(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprintplanning.javamodel.ISprintPlanning object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprintplanning.javamodel.ISprintPlannings.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprintplanning.SprintplanningPackage.SprintPlannings_sprintplannings, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b643c029-c009-11e5-a165-d34765931e10,9BSf/loE3bYpfmVRgVUS18QMNEI=] */
