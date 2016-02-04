package cleon.sda.spec.projectmanagement.planning.targetdates.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TargetDate extends DynamicResource implements ITargetDate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITargetDate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITargetDate>() {
    
    @Override
    public ITargetDate create() {
      return new TargetDate();
    }
    
    @Override
    public ITargetDate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TargetDate(resourceRepository, resource);
    }
  
  };

  public TargetDate() {
    super(ITargetDate.TYPE_ID);
  }
  
  public TargetDate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITargetDate.TYPE_ID);
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
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay selectDeadline() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.planning.targetdates.TargetdatesPackage.TargetDate_deadline);
  }

  public TargetDate setDeadline(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay deadline) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.targetdates.TargetdatesPackage.TargetDate_deadline, deadline);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson> selectMembers() {
    return _getList(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.planning.targetdates.TargetdatesPackage.TargetDate_members);
  }

  public TargetDate setMembers(java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson> members) {
    _setList(cleon.sda.spec.projectmanagement.planning.targetdates.TargetdatesPackage.TargetDate_members, members);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.planning.targetdates.TargetdatesPackage.TargetDate_owner);
  }

  public TargetDate setOwner(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson owner) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.targetdates.TargetdatesPackage.TargetDate_owner, owner);
    return this;
  }
    
  @Override
  public cleon.sda.spec.javamodel.IWorkState selectState() {
    return _getSingle(cleon.sda.spec.javamodel.IWorkState.class, cleon.sda.spec.projectmanagement.planning.targetdates.TargetdatesPackage.TargetDate_state);
  }

  public TargetDate setState(cleon.sda.spec.javamodel.IWorkState state) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.targetdates.TargetdatesPackage.TargetDate_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TargetDate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.planning.targetdates.TargetdatesPackage.TargetDate_deadline, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.planning.targetdates.TargetdatesPackage.TargetDate_members, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.planning.targetdates.TargetdatesPackage.TargetDate_owner, visitor);
    _acceptSingle(cleon.sda.spec.javamodel.IWorkState.class, cleon.sda.spec.projectmanagement.planning.targetdates.TargetdatesPackage.TargetDate_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.planning.targetdates.javamodel.ITargetDate> selectToMeOwner(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.planning.targetdates.javamodel.ITargetDate.class, cleon.sda.spec.projectmanagement.planning.targetdates.TargetdatesPackage.TargetDate_owner, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.planning.targetdates.javamodel.ITargetDate> selectToMeDeadline(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.planning.targetdates.javamodel.ITargetDate.class, cleon.sda.spec.projectmanagement.planning.targetdates.TargetdatesPackage.TargetDate_deadline, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.planning.targetdates.javamodel.ITargetDate> selectToMeMembers(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.planning.targetdates.javamodel.ITargetDate.class, cleon.sda.spec.projectmanagement.planning.targetdates.TargetdatesPackage.TargetDate_members, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.planning.targetdates.javamodel.ITargetDate> selectToMeState(cleon.sda.spec.javamodel.IWorkState object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.planning.targetdates.javamodel.ITargetDate.class, cleon.sda.spec.projectmanagement.planning.targetdates.TargetdatesPackage.TargetDate_state, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bdf7db5a-a7d8-11e5-82dd-3b995d9c840c,N2DQ78H5V870eAuphVSH4YU2N1M=] */
