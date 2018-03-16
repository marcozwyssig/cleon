package cleon.implementation.testing.spec.testing._05_test_constraints._02_failureclass.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FailureClass extends DynamicResource implements IFailureClass {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFailureClass> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFailureClass>() {
    
    @Override
    public IFailureClass create() {
      return new FailureClass();
    }
    
    @Override
    public IFailureClass create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FailureClass(resourceRepository, resource);
    }
  
  };

  public FailureClass() {
    super(IFailureClass.TYPE_ID);
  }
  
  public FailureClass(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFailureClass.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, identifier);
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

  public FailureClass setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (is__W___F___S___F_Unwesentlicher__F_Mangel()) return visitor.visit__W___F___S___F_Unwesentlicher__F_Mangel();
    if (is__X___F___S___F_Leichter__F_Mangel()) return visitor.visit__X___F___S___F_Leichter__F_Mangel();
    if (is__Y___F___S___F_Schwerer__F_Mangel()) return visitor.visit__Y___F___S___F_Schwerer__F_Mangel();
    if (is__Z___F___S___F_Kritischer__F_Mangel()) return visitor.visit__Z___F___S___F_Kritischer__F_Mangel();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (is__W___F___S___F_Unwesentlicher__F_Mangel()) {
      visitor.visit__W___F___S___F_Unwesentlicher__F_Mangel();
      return;
    }
    if (is__X___F___S___F_Leichter__F_Mangel()) {
      visitor.visit__X___F___S___F_Leichter__F_Mangel();
      return;
    }
    if (is__Y___F___S___F_Schwerer__F_Mangel()) {
      visitor.visit__Y___F___S___F_Schwerer__F_Mangel();
      return;
    }
    if (is__Z___F___S___F_Kritischer__F_Mangel()) {
      visitor.visit__Z___F___S___F_Kritischer__F_Mangel();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean is__W___F___S___F_Unwesentlicher__F_Mangel() {
    return getResource().equals(cleon.implementation.testing.spec.testing._05_test_constraints._02_failureclass._02_failureclassPackage.FailureClass___W___F___S___F_Unwesentlicher__F_Mangel);
  }
  
  @Override
  public boolean is__X___F___S___F_Leichter__F_Mangel() {
    return getResource().equals(cleon.implementation.testing.spec.testing._05_test_constraints._02_failureclass._02_failureclassPackage.FailureClass___X___F___S___F_Leichter__F_Mangel);
  }
  
  @Override
  public boolean is__Y___F___S___F_Schwerer__F_Mangel() {
    return getResource().equals(cleon.implementation.testing.spec.testing._05_test_constraints._02_failureclass._02_failureclassPackage.FailureClass___Y___F___S___F_Schwerer__F_Mangel);
  }
  
  @Override
  public boolean is__Z___F___S___F_Kritischer__F_Mangel() {
    return getResource().equals(cleon.implementation.testing.spec.testing._05_test_constraints._02_failureclass._02_failureclassPackage.FailureClass___Z___F___S___F_Kritischer__F_Mangel);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,882921f6-1db2-11e6-974b-630b7f5d3b95,+VbEJbcxMIQk2DJJ1/ZYpQmtego=] */
