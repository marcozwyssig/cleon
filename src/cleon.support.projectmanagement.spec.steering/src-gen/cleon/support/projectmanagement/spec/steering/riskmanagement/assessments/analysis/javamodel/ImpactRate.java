package cleon.support.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ImpactRate extends DynamicResource implements IImpactRate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImpactRate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImpactRate>() {
    
    @Override
    public IImpactRate create() {
      return new ImpactRate();
    }
    
    @Override
    public IImpactRate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ImpactRate(resourceRepository, resource);
    }
  
  };

  public ImpactRate() {
    super(IImpactRate.TYPE_ID);
  }
  
  public ImpactRate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImpactRate.TYPE_ID);
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

  public ImpactRate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (is__W_()) return visitor.visit__W_();
    if (is__X_()) return visitor.visit__X_();
    if (is__Y_()) return visitor.visit__Y_();
    if (is__Z_()) return visitor.visit__Z_();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (is__W_()) {
      visitor.visit__W_();
      return;
    }
    if (is__X_()) {
      visitor.visit__X_();
      return;
    }
    if (is__Y_()) {
      visitor.visit__Y_();
      return;
    }
    if (is__Z_()) {
      visitor.visit__Z_();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean is__W_() {
    return getResource().equals(cleon.support.projectmanagement.spec.steering.riskmanagement.assessments.analysis.AnalysisPackage.ImpactRate___W_);
  }
  
  @Override
  public boolean is__X_() {
    return getResource().equals(cleon.support.projectmanagement.spec.steering.riskmanagement.assessments.analysis.AnalysisPackage.ImpactRate___X_);
  }
  
  @Override
  public boolean is__Y_() {
    return getResource().equals(cleon.support.projectmanagement.spec.steering.riskmanagement.assessments.analysis.AnalysisPackage.ImpactRate___Y_);
  }
  
  @Override
  public boolean is__Z_() {
    return getResource().equals(cleon.support.projectmanagement.spec.steering.riskmanagement.assessments.analysis.AnalysisPackage.ImpactRate___Z_);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,68e06d85-2f01-11e6-8bd9-a77b8d2a3a0e,vhjhaiuQcQWE7JQR62yl56eNez4=] */
