package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Schedule extends DynamicResource implements ISchedule {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISchedule> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISchedule>() {
    
    @Override
    public ISchedule create() {
      return new Schedule();
    }
    
    @Override
    public ISchedule create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Schedule(resourceRepository, resource);
    }
  
  };

  public Schedule() {
    super(ISchedule.TYPE_ID);
  }
  
  public Schedule(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISchedule.TYPE_ID);
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

  public Schedule setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isDaily()) return visitor.visitDaily();
    if (isWeekly()) return visitor.visitWeekly();
    if (isMonthly()) return visitor.visitMonthly();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isDaily()) {
      visitor.visitDaily();
      return;
    }
    if (isWeekly()) {
      visitor.visitWeekly();
      return;
    }
    if (isMonthly()) {
      visitor.visitMonthly();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isDaily() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.Schedule_Daily);
  }
  
  @Override
  public boolean isWeekly() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.Schedule_Weekly);
  }
  
  @Override
  public boolean isMonthly() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.Schedule_Monthly);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,68bd338d-1e44-11e9-865e-41ef48a95f70,RGjloUxjth6E808s87U1GgcTeSE=] */
