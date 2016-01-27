package cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CapacityPerDay extends DynamicResource implements ICapacityPerDay {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapacityPerDay> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapacityPerDay>() {
    
    @Override
    public ICapacityPerDay create() {
      return new CapacityPerDay();
    }
    
    @Override
    public ICapacityPerDay create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CapacityPerDay(resourceRepository, resource);
    }
  
  };

  public CapacityPerDay() {
    super(ICapacityPerDay.TYPE_ID);
  }
  
  public CapacityPerDay(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICapacityPerDay.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectCapacity() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.CapacityPerDay_capacity);
  }
    
  public void setCapacity(java.lang.Integer capacity) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.CapacityPerDay_capacity, capacity);
  }

  // relations
  
  @Override
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay selectDay() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.CapacityPerDay_day);
  }

  public CapacityPerDay setDay(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay day) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.CapacityPerDay_day, day);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public CapacityPerDay setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CapacityPerDay setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.CapacityPerDay_capacity, visitor);
    // relations
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.CapacityPerDay_day, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ICapacityPerDay> selectToMeDay(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ICapacityPerDay.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.CapacityPerDay_day, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cd28fab0-c0d5-11e5-8f91-3dfd9b379121,yfkemyAqKNa7yJ1y4pemDhAJmMU=] */
