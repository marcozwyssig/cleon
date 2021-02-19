package cleon.common.calendar.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Calendar extends DynamicResource implements ICalendar {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICalendar> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICalendar>() {
    
    @Override
    public ICalendar create() {
      return new Calendar();
    }
    
    @Override
    public ICalendar create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Calendar(resourceRepository, resource);
    }
  
  };

  public Calendar() {
    super(ICalendar.TYPE_ID);
  }
  
  public Calendar(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICalendar.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Integer selectStartYear() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.calendar.metamodel.spec.SpecPackage.Calendar_startYear);
  }
    
  public void setStartYear(java.lang.Integer startYear) {
     _setSingleAttribute(cleon.common.calendar.metamodel.spec.SpecPackage.Calendar_startYear, startYear);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Calendar setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.calendar.metamodel.spec.javamodel.IYear> selectYears() {
    return _getList(cleon.common.calendar.metamodel.spec.javamodel.IYear.class, cleon.common.calendar.metamodel.spec.SpecPackage.Calendar_years);
  }

  public Calendar setYears(java.util.List<? extends cleon.common.calendar.metamodel.spec.javamodel.IYear> years) {
    _setList(cleon.common.calendar.metamodel.spec.SpecPackage.Calendar_years, years);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.calendar.metamodel.spec.SpecPackage.Calendar_startYear, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.common.calendar.metamodel.spec.javamodel.IYear.class, cleon.common.calendar.metamodel.spec.SpecPackage.Calendar_years, visitor);
  }

  // toMeRelations
  
  public static cleon.common.calendar.metamodel.spec.javamodel.ICalendar selectToMeYears(cleon.common.calendar.metamodel.spec.javamodel.IYear object) {
    return _getToMeSingle(object.getRepository(), cleon.common.calendar.metamodel.spec.javamodel.ICalendar.class, cleon.common.calendar.metamodel.spec.SpecPackage.Calendar_years, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9f210355-c37c-11e5-9455-d97b1b986284,qg5bx2+0tUROiPzftgHxHyvFQxQ=] */
