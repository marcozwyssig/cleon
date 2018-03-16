package cleon.common.resources.spec.resources.confidentiality.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ConfidentialityClassification extends DynamicResource implements IConfidentialityClassification {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConfidentialityClassification> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConfidentialityClassification>() {
    
    @Override
    public IConfidentialityClassification create() {
      return new ConfidentialityClassification();
    }
    
    @Override
    public IConfidentialityClassification create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ConfidentialityClassification(resourceRepository, resource);
    }
  
  };

  public ConfidentialityClassification() {
    super(IConfidentialityClassification.TYPE_ID);
  }
  
  public ConfidentialityClassification(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IConfidentialityClassification.TYPE_ID);
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

  public ConfidentialityClassification setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isSK0()) return visitor.visitSK0();
    if (isSK1()) return visitor.visitSK1();
    if (isSK2()) return visitor.visitSK2();
    if (isSK3()) return visitor.visitSK3();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isSK0()) {
      visitor.visitSK0();
      return;
    }
    if (isSK1()) {
      visitor.visitSK1();
      return;
    }
    if (isSK2()) {
      visitor.visitSK2();
      return;
    }
    if (isSK3()) {
      visitor.visitSK3();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isSK0() {
    return getResource().equals(cleon.common.resources.spec.resources.confidentiality.ConfidentialityPackage.ConfidentialityClassification_SK0);
  }
  
  @Override
  public boolean isSK1() {
    return getResource().equals(cleon.common.resources.spec.resources.confidentiality.ConfidentialityPackage.ConfidentialityClassification_SK1);
  }
  
  @Override
  public boolean isSK2() {
    return getResource().equals(cleon.common.resources.spec.resources.confidentiality.ConfidentialityPackage.ConfidentialityClassification_SK2);
  }
  
  @Override
  public boolean isSK3() {
    return getResource().equals(cleon.common.resources.spec.resources.confidentiality.ConfidentialityPackage.ConfidentialityClassification_SK3);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,58a88265-c10e-11e6-8f58-ad3c6ee7602f,Jfqd+jf6ddA02FNR3Ixmv7pdkuU=] */
