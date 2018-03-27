package cleon.initialization.projectmanagement.spec.resource.persons.absence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AbsenseDay extends DynamicResource implements IAbsenseDay {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAbsenseDay> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAbsenseDay>() {
    
    @Override
    public IAbsenseDay create() {
      return new AbsenseDay();
    }
    
    @Override
    public IAbsenseDay create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AbsenseDay(resourceRepository, resource);
    }
  
  };

  public AbsenseDay() {
    super(IAbsenseDay.TYPE_ID);
  }
  
  public AbsenseDay(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAbsenseDay.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.resources.spec.calendar.javamodel.IDay selectDay() {
    return _getSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.initialization.projectmanagement.spec.resource.persons.absence.AbsencePackage.AbsenseDay_day);
  }

  public AbsenseDay setDay(cleon.common.resources.spec.calendar.javamodel.IDay day) {
    _setSingle(cleon.initialization.projectmanagement.spec.resource.persons.absence.AbsencePackage.AbsenseDay_day, day);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.resource.persons.absence.javamodel.IAbsenseReason selectReason() {
    return _getSingle(cleon.initialization.projectmanagement.spec.resource.persons.absence.javamodel.IAbsenseReason.class, cleon.initialization.projectmanagement.spec.resource.persons.absence.AbsencePackage.AbsenseDay_reason);
  }

  public AbsenseDay setReason(cleon.initialization.projectmanagement.spec.resource.persons.absence.javamodel.IAbsenseReason reason) {
    _setSingle(cleon.initialization.projectmanagement.spec.resource.persons.absence.AbsencePackage.AbsenseDay_reason, reason);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public AbsenseDay setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AbsenseDay setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.initialization.projectmanagement.spec.resource.persons.absence.AbsencePackage.AbsenseDay_day, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.resource.persons.absence.javamodel.IAbsenseReason.class, cleon.initialization.projectmanagement.spec.resource.persons.absence.AbsencePackage.AbsenseDay_reason, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.resource.persons.absence.javamodel.IAbsenseDay> selectToMeReason(cleon.initialization.projectmanagement.spec.resource.persons.absence.javamodel.IAbsenseReason object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.resource.persons.absence.javamodel.IAbsenseDay.class, cleon.initialization.projectmanagement.spec.resource.persons.absence.AbsencePackage.AbsenseDay_reason, object.getResource());
  }
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.resource.persons.absence.javamodel.IAbsenseDay> selectToMeDay(cleon.common.resources.spec.calendar.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.resource.persons.absence.javamodel.IAbsenseDay.class, cleon.initialization.projectmanagement.spec.resource.persons.absence.AbsencePackage.AbsenseDay_day, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d157be88-c4c8-11e5-8558-4b8affb7767c,8D1TUYirt2SgsiHgO72fOPKWBRA=] */
