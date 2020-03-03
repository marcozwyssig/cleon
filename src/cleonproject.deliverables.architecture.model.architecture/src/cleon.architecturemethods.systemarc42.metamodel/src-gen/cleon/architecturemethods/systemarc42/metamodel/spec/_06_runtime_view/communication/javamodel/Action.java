package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Action extends DynamicResource implements IAction {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAction> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAction>() {
    
    @Override
    public IAction create() {
      return new Action();
    }
    
    @Override
    public IAction create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Action(resourceRepository, resource);
    }
  
  };

  public Action() {
    super(IAction.TYPE_ID);
  }
  
  public Action(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAction.TYPE_ID);
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

  public Action setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isAccept()) return visitor.visitAccept();
    if (isDrop()) return visitor.visitDrop();
    if (isReject()) return visitor.visitReject();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isAccept()) {
      visitor.visitAccept();
      return;
    }
    if (isDrop()) {
      visitor.visitDrop();
      return;
    }
    if (isReject()) {
      visitor.visitReject();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isAccept() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Action_Accept);
  }
  
  @Override
  public boolean isDrop() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Action_Drop);
  }
  
  @Override
  public boolean isReject() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Action_Reject);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e7b78922-dfaa-11e9-9827-a1514ee8d06a,Gl89viQmHO61V49RrU9pQvO47Vs=] */
