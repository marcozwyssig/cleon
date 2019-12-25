package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel;

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
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsenceMonth> selectAbsenseMonth() {
    return _getMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsenceMonth.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.AbsencePackage.AbsenseYear_absenseMonth);
  }

  public AbsenseYear setAbsenseMonth(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsenceMonth> absenseMonth) {
    _setMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.AbsencePackage.AbsenseYear_absenseMonth, absenseMonth);
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
  public cleon.common.calendar.metamodel.spec.javamodel.IYear selectYear() {
    return _getSingle(cleon.common.calendar.metamodel.spec.javamodel.IYear.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.AbsencePackage.AbsenseYear_year);
  }

  public AbsenseYear setYear(cleon.common.calendar.metamodel.spec.javamodel.IYear year) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.AbsencePackage.AbsenseYear_year, year);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsenceMonth.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.AbsencePackage.AbsenseYear_absenseMonth, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.common.calendar.metamodel.spec.javamodel.IYear.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.AbsencePackage.AbsenseYear_year, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsenseYear> selectToMeYear(cleon.common.calendar.metamodel.spec.javamodel.IYear object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsenseYear.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.AbsencePackage.AbsenseYear_year, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsenseYear selectToMeAbsenseMonth(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsenceMonth object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsenseYear.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.AbsencePackage.AbsenseYear_absenseMonth, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c661b9c8-c4c6-11e5-8558-4b8affb7767c,snFzrITiHEpnI0o8exLtlzE+kfk=] */
