package cleon.common.resources.spec.calendar.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Year extends DynamicResource implements IYear {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IYear> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IYear>() {
    
    @Override
    public IYear create() {
      return new Year();
    }
    
    @Override
    public IYear create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Year(resourceRepository, resource);
    }
  
  };

  public Year() {
    super(IYear.TYPE_ID);
  }
  
  public Year(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IYear.TYPE_ID);
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
  public java.util.List<? extends cleon.common.resources.spec.calendar.javamodel.IMonth> selectMonths() {
    return _getList(cleon.common.resources.spec.calendar.javamodel.IMonth.class, cleon.common.resources.spec.calendar.CalendarPackage.Year_months);
  }

  public Year setMonths(java.util.List<? extends cleon.common.resources.spec.calendar.javamodel.IMonth> months) {
    _setList(cleon.common.resources.spec.calendar.CalendarPackage.Year_months, months);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.resources.spec.calendar.javamodel.ICalendarItem> selectSubCalendarItems() {
    return _getList(cleon.common.resources.spec.calendar.javamodel.ICalendarItem.class, cleon.common.resources.spec.calendar.CalendarPackage.CalendarItem_subCalendarItems);
  }

  public Year setSubCalendarItems(java.util.List<? extends cleon.common.resources.spec.calendar.javamodel.ICalendarItem> subCalendarItems) {
    _setList(cleon.common.resources.spec.calendar.CalendarPackage.CalendarItem_subCalendarItems, subCalendarItems);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Year setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.calendar.CalendarPackage.CalendarItem_identifier, visitor);
    // relations
    _acceptList(cleon.common.resources.spec.calendar.javamodel.IMonth.class, cleon.common.resources.spec.calendar.CalendarPackage.Year_months, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.common.resources.spec.calendar.javamodel.IYear selectToMeMonths(cleon.common.resources.spec.calendar.javamodel.IMonth object) {
    return _getToMeSingle(object.getRepository(), cleon.common.resources.spec.calendar.javamodel.IYear.class, cleon.common.resources.spec.calendar.CalendarPackage.Year_months, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,56e29973-c37c-11e5-9455-d97b1b986284,33MuYdpw0Lhul1NWoNh/gGUnlPM=] */
