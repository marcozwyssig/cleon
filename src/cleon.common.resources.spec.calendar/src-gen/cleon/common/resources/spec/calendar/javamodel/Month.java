package cleon.common.resources.spec.calendar.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Month extends DynamicResource implements IMonth {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMonth> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMonth>() {
    
    @Override
    public IMonth create() {
      return new Month();
    }
    
    @Override
    public IMonth create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Month(resourceRepository, resource);
    }
  
  };

  public Month() {
    super(IMonth.TYPE_ID);
  }
  
  public Month(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMonth.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.calendar.CalendarPackage.CalendarItem_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.calendar.CalendarPackage.CalendarItem_identifier, identifier);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.resources.spec.calendar.javamodel.IDay> selectDays() {
    return _getList(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.common.resources.spec.calendar.CalendarPackage.Month_days);
  }

  public Month setDays(java.util.List<? extends cleon.common.resources.spec.calendar.javamodel.IDay> days) {
    _setList(cleon.common.resources.spec.calendar.CalendarPackage.Month_days, days);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.resources.spec.calendar.javamodel.ICalendarItem> selectSubCalendarItems() {
    return _getList(cleon.common.resources.spec.calendar.javamodel.ICalendarItem.class, cleon.common.resources.spec.calendar.CalendarPackage.CalendarItem_subCalendarItems);
  }

  public Month setSubCalendarItems(java.util.List<? extends cleon.common.resources.spec.calendar.javamodel.ICalendarItem> subCalendarItems) {
    _setList(cleon.common.resources.spec.calendar.CalendarPackage.CalendarItem_subCalendarItems, subCalendarItems);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Month setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.calendar.CalendarPackage.CalendarItem_identifier, visitor);
    // relations
    _acceptList(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.common.resources.spec.calendar.CalendarPackage.Month_days, visitor);
    _acceptList(cleon.common.resources.spec.calendar.javamodel.ICalendarItem.class, cleon.common.resources.spec.calendar.CalendarPackage.CalendarItem_subCalendarItems, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.common.resources.spec.calendar.javamodel.IMonth selectToMeDays(cleon.common.resources.spec.calendar.javamodel.IDay object) {
    return _getToMeSingle(object.getRepository(), cleon.common.resources.spec.calendar.javamodel.IMonth.class, cleon.common.resources.spec.calendar.CalendarPackage.Month_days, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,59aa44e4-c37c-11e5-9455-d97b1b986284,yaDMpP0vgWbZUgcZXc0N5a4pxxc=] */
