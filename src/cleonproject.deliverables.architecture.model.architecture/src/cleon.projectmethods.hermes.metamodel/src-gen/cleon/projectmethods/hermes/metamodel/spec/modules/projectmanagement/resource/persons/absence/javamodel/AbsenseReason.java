package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AbsenseReason extends DynamicResource implements IAbsenseReason {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAbsenseReason> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAbsenseReason>() {
    
    @Override
    public IAbsenseReason create() {
      return new AbsenseReason();
    }
    
    @Override
    public IAbsenseReason create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AbsenseReason(resourceRepository, resource);
    }
  
  };

  public AbsenseReason() {
    super(IAbsenseReason.TYPE_ID);
  }
  
  public AbsenseReason(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAbsenseReason.TYPE_ID);
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

  public AbsenseReason setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isVacation()) return visitor.visitVacation();
    if (isEducation()) return visitor.visitEducation();
    if (isFree()) return visitor.visitFree();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isVacation()) {
      visitor.visitVacation();
      return;
    }
    if (isEducation()) {
      visitor.visitEducation();
      return;
    }
    if (isFree()) {
      visitor.visitFree();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isVacation() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.AbsencePackage.AbsenseReason_Vacation);
  }
  
  @Override
  public boolean isEducation() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.AbsencePackage.AbsenseReason_Education);
  }
  
  @Override
  public boolean isFree() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.AbsencePackage.AbsenseReason_Free);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9314d460-c4c7-11e5-8558-4b8affb7767c,17PiIaT64rTHtNaVpGS0o4QEckI=] */
