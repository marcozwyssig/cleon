package cleon.common.resources.metamodel.spec.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AvailabilityClassification extends DynamicResource implements IAvailabilityClassification {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAvailabilityClassification> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAvailabilityClassification>() {
    
    @Override
    public IAvailabilityClassification create() {
      return new AvailabilityClassification();
    }
    
    @Override
    public IAvailabilityClassification create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AvailabilityClassification(resourceRepository, resource);
    }
  
  };

  public AvailabilityClassification() {
    super(IAvailabilityClassification.TYPE_ID);
  }
  
  public AvailabilityClassification(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAvailabilityClassification.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

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

  public AvailabilityClassification setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isVK0()) return visitor.visitVK0();
    if (isVK1()) return visitor.visitVK1();
    if (isVK2()) return visitor.visitVK2();
    if (isVK3()) return visitor.visitVK3();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isVK0()) {
      visitor.visitVK0();
      return;
    }
    if (isVK1()) {
      visitor.visitVK1();
      return;
    }
    if (isVK2()) {
      visitor.visitVK2();
      return;
    }
    if (isVK3()) {
      visitor.visitVK3();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isVK0() {
    return getResource().equals(cleon.common.resources.metamodel.spec.availability.AvailabilityPackage.AvailabilityClassification_VK0);
  }
  
  @Override
  public boolean isVK1() {
    return getResource().equals(cleon.common.resources.metamodel.spec.availability.AvailabilityPackage.AvailabilityClassification_VK1);
  }
  
  @Override
  public boolean isVK2() {
    return getResource().equals(cleon.common.resources.metamodel.spec.availability.AvailabilityPackage.AvailabilityClassification_VK2);
  }
  
  @Override
  public boolean isVK3() {
    return getResource().equals(cleon.common.resources.metamodel.spec.availability.AvailabilityPackage.AvailabilityClassification_VK3);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9534ff15-c10e-11e6-8f58-ad3c6ee7602f,cS9qIu7lsFIogYmDxknYkzIXl0s=] */
