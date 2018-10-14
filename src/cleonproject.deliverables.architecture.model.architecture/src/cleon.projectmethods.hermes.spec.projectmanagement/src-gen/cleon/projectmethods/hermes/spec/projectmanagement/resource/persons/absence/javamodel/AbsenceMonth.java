package cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AbsenceMonth extends DynamicResource implements IAbsenceMonth {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAbsenceMonth> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAbsenceMonth>() {
    
    @Override
    public IAbsenceMonth create() {
      return new AbsenceMonth();
    }
    
    @Override
    public IAbsenceMonth create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AbsenceMonth(resourceRepository, resource);
    }
  
  };

  public AbsenceMonth() {
    super(IAbsenceMonth.TYPE_ID);
  }
  
  public AbsenceMonth(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAbsenceMonth.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel.IAbsenseDay> selectAbsenseDay() {
    return _getMap(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel.IAbsenseDay.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.AbsencePackage.AbsenceMonth_absenseDay);
  }

  public AbsenceMonth setAbsenseDay(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel.IAbsenseDay> absenseDay) {
    _setMap(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.AbsencePackage.AbsenceMonth_absenseDay, absenseDay);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.calendar.javamodel.IMonth selectMonth() {
    return _getSingle(cleon.common.resources.spec.calendar.javamodel.IMonth.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.AbsencePackage.AbsenceMonth_month);
  }

  public AbsenceMonth setMonth(cleon.common.resources.spec.calendar.javamodel.IMonth month) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.AbsencePackage.AbsenceMonth_month, month);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public AbsenceMonth setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AbsenceMonth setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel.IAbsenseDay.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.AbsencePackage.AbsenceMonth_absenseDay, visitor);
    _acceptSingle(cleon.common.resources.spec.calendar.javamodel.IMonth.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.AbsencePackage.AbsenceMonth_month, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel.IAbsenceMonth selectToMeAbsenseDay(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel.IAbsenseDay object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel.IAbsenceMonth.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.AbsencePackage.AbsenceMonth_absenseDay, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel.IAbsenceMonth> selectToMeMonth(cleon.common.resources.spec.calendar.javamodel.IMonth object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel.IAbsenceMonth.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.AbsencePackage.AbsenceMonth_month, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ce3dada8-c4c8-11e5-8558-4b8affb7767c,Req037/Ww01yJ+zAoUvxI7vXLNQ=] */
