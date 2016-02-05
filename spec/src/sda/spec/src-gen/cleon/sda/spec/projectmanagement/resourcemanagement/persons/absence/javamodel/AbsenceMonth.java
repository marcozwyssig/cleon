package cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel;

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
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseDay> selectAbsenseDay() {
    return _getMap(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseDay.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.AbsenceMonth_absenseDay);
  }

  public AbsenceMonth setAbsenseDay(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseDay> absenseDay) {
    _setMap(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.AbsenceMonth_absenseDay, absenseDay);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IMonth selectMonth() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IMonth.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.AbsenceMonth_month);
  }

  public AbsenceMonth setMonth(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IMonth month) {
    _setSingle(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.AbsenceMonth_month, month);
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
    _acceptMap(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseDay.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.AbsenceMonth_absenseDay, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IMonth.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.AbsenceMonth_month, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenceMonth selectToMeAbsenseDay(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseDay object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenceMonth.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.AbsenceMonth_absenseDay, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenceMonth> selectToMeMonth(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IMonth object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenceMonth.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.AbsenceMonth_month, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ce3dada8-c4c8-11e5-8558-4b8affb7767c,l4Evn8XkjjRp7gbn9Wapbp3hsuU=] */
