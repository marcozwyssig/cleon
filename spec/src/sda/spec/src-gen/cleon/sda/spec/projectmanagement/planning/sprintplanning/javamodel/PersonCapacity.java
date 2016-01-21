package cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel;

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
  public java.lang.Integer selectCapacity() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.PersonCapacity_capacity);
  }
    
  public void setCapacity(java.lang.Integer capacity) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.PersonCapacity_capacity, capacity);
  }

  // relations
  
  @Override
  public cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson selectPerson() {
    return _getSingle(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.PersonCapacity_person);
  }

  public PersonCapacity setPerson(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson person) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.PersonCapacity_person, person);
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
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.PersonCapacity_capacity, visitor);
    // relations
    _acceptSingle(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.PersonCapacity_person, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.IPersonCapacity> selectToMePerson(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.IPersonCapacity.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.PersonCapacity_person, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1d4b698d-c00c-11e5-a165-d34765931e10,FQbCqsxoocSY9/0yfy1YpHVRA2w=] */
