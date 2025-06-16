package cleon.common.calendar.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Weekday extends DynamicResource implements IWeekday {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWeekday> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWeekday>() {
    
    @Override
    public IWeekday create() {
      return new Weekday();
    }
    
    @Override
    public IWeekday create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Weekday(resourceRepository, resource);
    }
  
  };

  public Weekday() {
    super(IWeekday.TYPE_ID);
  }
  
  public Weekday(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWeekday.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Weekday setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isMonday()) return visitor.visitMonday();
    if (isTuesday()) return visitor.visitTuesday();
    if (isWednesday()) return visitor.visitWednesday();
    if (isThursday()) return visitor.visitThursday();
    if (isFriday()) return visitor.visitFriday();
    if (isSaturday()) return visitor.visitSaturday();
    if (isSunday()) return visitor.visitSunday();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isMonday()) {
      visitor.visitMonday();
      return;
    }
    if (isTuesday()) {
      visitor.visitTuesday();
      return;
    }
    if (isWednesday()) {
      visitor.visitWednesday();
      return;
    }
    if (isThursday()) {
      visitor.visitThursday();
      return;
    }
    if (isFriday()) {
      visitor.visitFriday();
      return;
    }
    if (isSaturday()) {
      visitor.visitSaturday();
      return;
    }
    if (isSunday()) {
      visitor.visitSunday();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isMonday() {
    return getResource().equals(cleon.common.calendar.metamodel.spec.SpecPackage.Weekday_Monday);
  }
  
  @Override
  public boolean isTuesday() {
    return getResource().equals(cleon.common.calendar.metamodel.spec.SpecPackage.Weekday_Tuesday);
  }
  
  @Override
  public boolean isWednesday() {
    return getResource().equals(cleon.common.calendar.metamodel.spec.SpecPackage.Weekday_Wednesday);
  }
  
  @Override
  public boolean isThursday() {
    return getResource().equals(cleon.common.calendar.metamodel.spec.SpecPackage.Weekday_Thursday);
  }
  
  @Override
  public boolean isFriday() {
    return getResource().equals(cleon.common.calendar.metamodel.spec.SpecPackage.Weekday_Friday);
  }
  
  @Override
  public boolean isSaturday() {
    return getResource().equals(cleon.common.calendar.metamodel.spec.SpecPackage.Weekday_Saturday);
  }
  
  @Override
  public boolean isSunday() {
    return getResource().equals(cleon.common.calendar.metamodel.spec.SpecPackage.Weekday_Sunday);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,337972be-4861-11f0-ab73-2116b4504ace,e/Cwqafow/FsbIGP6rjIFay0z4s=] */
