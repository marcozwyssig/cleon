package cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Deadline extends DynamicResource implements IDeadline {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeadline> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeadline>() {
    
    @Override
    public IDeadline create() {
      return new Deadline();
    }
    
    @Override
    public IDeadline create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Deadline(resourceRepository, resource);
    }
  
  };

  public Deadline() {
    super(IDeadline.TYPE_ID);
  }
  
  public Deadline(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeadline.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public cleon.common.resources.spec.calendar.javamodel.IDay selectDeadline() {
    return _getSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.initialization.projectmanagement.spec.resource.ResourcePackage.TargetDate_deadline);
  }

  public Deadline setDeadline(cleon.common.resources.spec.calendar.javamodel.IDay deadline) {
    _setSingle(cleon.initialization.projectmanagement.spec.resource.ResourcePackage.TargetDate_deadline, deadline);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson> selectMembers() {
    return _getList(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.TargetdatesPackage.Deadline_members);
  }

  public Deadline setMembers(java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson> members) {
    _setList(cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.TargetdatesPackage.Deadline_members, members);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.TargetdatesPackage.Deadline_owner);
  }

  public Deadline setOwner(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson owner) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.TargetdatesPackage.Deadline_owner, owner);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.workstate.javamodel.IWorkState selectState() {
    return _getSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state);
  }

  public Deadline setState(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState state) {
    _setSingle(cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Deadline setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.initialization.projectmanagement.spec.resource.ResourcePackage.TargetDate_deadline, visitor);
    _acceptList(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.TargetdatesPackage.Deadline_members, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.TargetdatesPackage.Deadline_owner, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadline> selectToMeOwner(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadline.class, cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.TargetdatesPackage.Deadline_owner, object.getResource());
  }
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadline> selectToMeMembers(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadline.class, cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.TargetdatesPackage.Deadline_members, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bdf7db5a-a7d8-11e5-82dd-3b995d9c840c,Y4IB4rxnh3c4swB+2WgrNiAjib0=] */
