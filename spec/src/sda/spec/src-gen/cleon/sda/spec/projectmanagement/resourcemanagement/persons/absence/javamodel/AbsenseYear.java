package cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AbsenseYear extends DynamicResource implements IAbsenseYear {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAbsenseYear> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAbsenseYear>() {
    
    @Override
    public IAbsenseYear create() {
      return new AbsenseYear();
    }
    
    @Override
    public IAbsenseYear create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AbsenseYear(resourceRepository, resource);
    }
  
  };

  public AbsenseYear() {
    super(IAbsenseYear.TYPE_ID);
  }
  
  public AbsenseYear(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAbsenseYear.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenceMonth> selectAbsenseMonth() {
    return _getMap(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenceMonth.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.AbsenseYear_absenseMonth);
  }

  public AbsenseYear setAbsenseMonth(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenceMonth> absenseMonth) {
    _setMap(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.AbsenseYear_absenseMonth, absenseMonth);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public AbsenseYear setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AbsenseYear setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IYear selectYear() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IYear.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.AbsenseYear_year);
  }

  public AbsenseYear setYear(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IYear year) {
    _setSingle(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.AbsenseYear_year, year);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenceMonth.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.AbsenseYear_absenseMonth, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IYear.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.AbsenseYear_year, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseYear> selectToMeYear(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IYear object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseYear.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.AbsenseYear_year, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseYear selectToMeAbsenseMonth(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenceMonth object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseYear.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.AbsenseYear_absenseMonth, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c661b9c8-c4c6-11e5-8558-4b8affb7767c,WyoO4Otlq28gXmcYuJAcCqfRFbI=] */
