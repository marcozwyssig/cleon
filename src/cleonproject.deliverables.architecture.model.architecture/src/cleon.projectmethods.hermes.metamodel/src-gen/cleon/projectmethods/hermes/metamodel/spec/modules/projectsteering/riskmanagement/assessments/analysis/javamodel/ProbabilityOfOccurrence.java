package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ProbabilityOfOccurrence extends DynamicResource implements IProbabilityOfOccurrence {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProbabilityOfOccurrence> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProbabilityOfOccurrence>() {
    
    @Override
    public IProbabilityOfOccurrence create() {
      return new ProbabilityOfOccurrence();
    }
    
    @Override
    public IProbabilityOfOccurrence create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ProbabilityOfOccurrence(resourceRepository, resource);
    }
  
  };

  public ProbabilityOfOccurrence() {
    super(IProbabilityOfOccurrence.TYPE_ID);
  }
  
  public ProbabilityOfOccurrence(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProbabilityOfOccurrence.TYPE_ID);
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

  public ProbabilityOfOccurrence setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (is__0_()) return visitor.visit__0_();
    if (is__1_()) return visitor.visit__1_();
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
    if (is__0_()) {
      visitor.visit__0_();
      return;
    }
    if (is__1_()) {
      visitor.visit__1_();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean is__W_() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.AnalysisPackage.ProbabilityOfOccurrence___W_);
  }
  
  @Override
  public boolean is__X_() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.AnalysisPackage.ProbabilityOfOccurrence___X_);
  }
  
  @Override
  public boolean is__Y_() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.AnalysisPackage.ProbabilityOfOccurrence___Y_);
  }
  
  @Override
  public boolean is__Z_() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.AnalysisPackage.ProbabilityOfOccurrence___Z_);
  }
  
  @Override
  public boolean is__0_() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.AnalysisPackage.ProbabilityOfOccurrence___0_);
  }
  
  @Override
  public boolean is__1_() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.AnalysisPackage.ProbabilityOfOccurrence___1_);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9957e084-2eff-11e6-8bd9-a77b8d2a3a0e,VWoDFoaQpD3B7OOT3NiHqyLUvSM=] */
