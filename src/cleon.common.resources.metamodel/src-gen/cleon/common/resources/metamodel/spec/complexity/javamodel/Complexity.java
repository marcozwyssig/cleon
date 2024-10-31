package cleon.common.resources.metamodel.spec.complexity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Complexity extends DynamicResource implements IComplexity {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComplexity> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComplexity>() {
    
    @Override
    public IComplexity create() {
      return new Complexity();
    }
    
    @Override
    public IComplexity create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Complexity(resourceRepository, resource);
    }
  
  };

  public Complexity() {
    super(IComplexity.TYPE_ID);
  }
  
  public Complexity(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComplexity.TYPE_ID);
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

  @Override
  public java.lang.Integer selectNumber() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.complexity.ComplexityPackage.Complexity_number);
  }
    
  public void setNumber(java.lang.Integer number) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.complexity.ComplexityPackage.Complexity_number, number);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Complexity setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.complexity.ComplexityPackage.Complexity_number, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isLow()) return visitor.visitLow();
    if (isMedium()) return visitor.visitMedium();
    if (isHigh()) return visitor.visitHigh();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isLow()) {
      visitor.visitLow();
      return;
    }
    if (isMedium()) {
      visitor.visitMedium();
      return;
    }
    if (isHigh()) {
      visitor.visitHigh();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isLow() {
    return getResource().equals(cleon.common.resources.metamodel.spec.complexity.ComplexityPackage.Complexity_Low);
  }
  
  @Override
  public boolean isMedium() {
    return getResource().equals(cleon.common.resources.metamodel.spec.complexity.ComplexityPackage.Complexity_Medium);
  }
  
  @Override
  public boolean isHigh() {
    return getResource().equals(cleon.common.resources.metamodel.spec.complexity.ComplexityPackage.Complexity_High);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,323a29b7-8fe7-11e8-a5b5-191902fe097a,OKIIaE93mu6wxQlePE8vjOzkqgo=] */
