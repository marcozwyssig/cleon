package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DocumentStage extends DynamicResource implements IDocumentStage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDocumentStage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDocumentStage>() {
    
    @Override
    public IDocumentStage create() {
      return new DocumentStage();
    }
    
    @Override
    public IDocumentStage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DocumentStage(resourceRepository, resource);
    }
  
  };

  public DocumentStage() {
    super(IDocumentStage.TYPE_ID);
  }
  
  public DocumentStage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDocumentStage.TYPE_ID);
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

  public DocumentStage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isDraft()) return visitor.visitDraft();
    if (isReview()) return visitor.visitReview();
    if (isFinal()) return visitor.visitFinal();
    if (isApproved()) return visitor.visitApproved();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isDraft()) {
      visitor.visitDraft();
      return;
    }
    if (isReview()) {
      visitor.visitReview();
      return;
    }
    if (isFinal()) {
      visitor.visitFinal();
      return;
    }
    if (isApproved()) {
      visitor.visitApproved();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isDraft() {
    return getResource().equals(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.DocumentStage_Draft);
  }
  
  @Override
  public boolean isReview() {
    return getResource().equals(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.DocumentStage_Review);
  }
  
  @Override
  public boolean isFinal() {
    return getResource().equals(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.DocumentStage_Final);
  }
  
  @Override
  public boolean isApproved() {
    return getResource().equals(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.DocumentStage_Approved);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,784a1bc2-bff7-11e8-a3d0-5394fd9291a1,s+PCfYHAtma2Z7Ws3pMsWZp+EfA=] */
