package cleon.common.resources.metamodel.spec.priority.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Priority extends DynamicResource implements IPriority {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPriority> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPriority>() {
    
    @Override
    public IPriority create() {
      return new Priority();
    }
    
    @Override
    public IPriority create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Priority(resourceRepository, resource);
    }
  
  };

  public Priority() {
    super(IPriority.TYPE_ID);
  }
  
  public Priority(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPriority.TYPE_ID);
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
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.priority.PriorityPackage.Priority_number);
  }
    
  public void setNumber(java.lang.Integer number) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.priority.PriorityPackage.Priority_number, number);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Priority setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.priority.PriorityPackage.Priority_number, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isMust__F_have()) return visitor.visitMust__F_have();
    if (isShould__F_have()) return visitor.visitShould__F_have();
    if (isNice__F_to__F_have()) return visitor.visitNice__F_to__F_have();
    if (isWon__M_t__F_have()) return visitor.visitWon__M_t__F_have();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isMust__F_have()) {
      visitor.visitMust__F_have();
      return;
    }
    if (isShould__F_have()) {
      visitor.visitShould__F_have();
      return;
    }
    if (isNice__F_to__F_have()) {
      visitor.visitNice__F_to__F_have();
      return;
    }
    if (isWon__M_t__F_have()) {
      visitor.visitWon__M_t__F_have();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isMust__F_have() {
    return getResource().equals(cleon.common.resources.metamodel.spec.priority.PriorityPackage.Priority_Must__F_have);
  }
  
  @Override
  public boolean isShould__F_have() {
    return getResource().equals(cleon.common.resources.metamodel.spec.priority.PriorityPackage.Priority_Should__F_have);
  }
  
  @Override
  public boolean isNice__F_to__F_have() {
    return getResource().equals(cleon.common.resources.metamodel.spec.priority.PriorityPackage.Priority_Nice__F_to__F_have);
  }
  
  @Override
  public boolean isWon__M_t__F_have() {
    return getResource().equals(cleon.common.resources.metamodel.spec.priority.PriorityPackage.Priority_Won__M_t__F_have);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,43a964fa-c4f3-11e5-b41d-5d67443850a2,97gD0/SUQltxiF212a6jpl28CZA=] */
