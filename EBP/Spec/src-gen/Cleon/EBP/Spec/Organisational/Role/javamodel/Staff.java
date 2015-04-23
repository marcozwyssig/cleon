package Cleon.EBP.Spec.Organisational.Role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Staff extends DynamicResource implements IStaff {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStaff> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStaff>() {
    
    @Override
    public IStaff create() {
      return new Staff();
    }
    
    @Override
    public IStaff create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Staff(resourceRepository, resource);
    }
  
  };

  public Staff() {
    super(IStaff.TYPE_ID);
  }
  
  public Staff(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStaff.TYPE_ID);
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

  public Staff setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bb5e2c5c-bb6c-11e3-bf59-6b10d9dd6d36,qWyDvKInEIDqozllMR5Q7RAny9o=] */
