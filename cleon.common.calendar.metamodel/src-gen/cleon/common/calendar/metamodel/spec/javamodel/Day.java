package cleon.common.calendar.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Day extends DynamicResource implements IDay {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDay> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDay>() {
    
    @Override
    public IDay create() {
      return new Day();
    }
    
    @Override
    public IDay create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Day(resourceRepository, resource);
    }
  
  };

  public Day() {
    super(IDay.TYPE_ID);
  }
  
  public Day(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDay.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.calendar.metamodel.spec.SpecPackage.CalendarItem_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.calendar.metamodel.spec.SpecPackage.CalendarItem_identifier, identifier);
  }

  // relations
  
  @Override
  public cleon.common.calendar.metamodel.spec.javamodel.ICalendarItem selectNoMore() {
    return _getSingle(cleon.common.calendar.metamodel.spec.javamodel.ICalendarItem.class, cleon.common.calendar.metamodel.spec.SpecPackage.Day_noMore);
  }

  public Day setNoMore(cleon.common.calendar.metamodel.spec.javamodel.ICalendarItem noMore) {
    _setSingle(cleon.common.calendar.metamodel.spec.SpecPackage.Day_noMore, noMore);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.calendar.metamodel.spec.javamodel.ICalendarItem> selectSubCalendarItems() {
    return _getList(cleon.common.calendar.metamodel.spec.javamodel.ICalendarItem.class, cleon.common.calendar.metamodel.spec.SpecPackage.CalendarItem_subCalendarItems);
  }

  public Day setSubCalendarItems(java.util.List<? extends cleon.common.calendar.metamodel.spec.javamodel.ICalendarItem> subCalendarItems) {
    _setList(cleon.common.calendar.metamodel.spec.SpecPackage.CalendarItem_subCalendarItems, subCalendarItems);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Day setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.calendar.metamodel.spec.SpecPackage.CalendarItem_identifier, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.common.calendar.metamodel.spec.javamodel.IDay selectToMeNoMore(cleon.common.calendar.metamodel.spec.javamodel.ICalendarItem object) {
    return _getToMeSingle(object.getRepository(), cleon.common.calendar.metamodel.spec.javamodel.IDay.class, cleon.common.calendar.metamodel.spec.SpecPackage.Day_noMore, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5b27bd7f-c37c-11e5-9455-d97b1b986284,CndC4MmL8GTKYYDINq5VAxpjy1c=] */
