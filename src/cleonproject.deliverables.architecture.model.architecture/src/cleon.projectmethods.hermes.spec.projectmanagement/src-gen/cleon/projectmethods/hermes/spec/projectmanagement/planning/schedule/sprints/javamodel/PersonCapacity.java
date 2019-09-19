package cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PersonCapacity extends DynamicResource implements IPersonCapacity {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPersonCapacity> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPersonCapacity>() {
    
    @Override
    public IPersonCapacity create() {
      return new PersonCapacity();
    }
    
    @Override
    public IPersonCapacity create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PersonCapacity(resourceRepository, resource);
    }
  
  };

  public PersonCapacity() {
    super(IPersonCapacity.TYPE_ID);
  }
  
  public PersonCapacity(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPersonCapacity.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectProductivity() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.PersonCapacity_productivity);
  }
    
  public void setProductivity(java.lang.Integer productivity) {
     _setSingleAttribute(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.PersonCapacity_productivity, productivity);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay> selectCapacityPerDay() {
    return _getMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.PersonCapacity_capacityPerDay);
  }

  public PersonCapacity setCapacityPerDay(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay> capacityPerDay) {
    _setMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.PersonCapacity_capacityPerDay, capacityPerDay);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson selectPerson() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.PersonCapacity_person);
  }

  public PersonCapacity setPerson(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson person) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.PersonCapacity_person, person);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public PersonCapacity setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PersonCapacity setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.PersonCapacity_productivity, visitor);
    // relations
    _acceptMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.PersonCapacity_capacityPerDay, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.PersonCapacity_person, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.IPersonCapacity> selectToMePerson(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.IPersonCapacity.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.PersonCapacity_person, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.IPersonCapacity selectToMeCapacityPerDay(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.IPersonCapacity.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.PersonCapacity_capacityPerDay, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1d4b698d-c00c-11e5-a165-d34765931e10,cxX8mcQ8B0Hlb1OLym76T13i6yo=] */
