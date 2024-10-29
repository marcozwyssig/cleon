package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.supplynode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Stao extends DynamicResource implements IStao {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStao> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStao>() {
    
    @Override
    public IStao create() {
      return new Stao();
    }
    
    @Override
    public IStao create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Stao(resourceRepository, resource);
    }
  
  };

  public Stao() {
    super(IStao.TYPE_ID);
  }
  
  public Stao(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStao.TYPE_ID);
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

  public Stao setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isA()) return visitor.visitA();
    if (isB()) return visitor.visitB();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isA()) {
      visitor.visitA();
      return;
    }
    if (isB()) {
      visitor.visitB();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isA() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.supplynode.SupplynodePackage.Stao_A);
  }
  
  @Override
  public boolean isB() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.supplynode.SupplynodePackage.Stao_B);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2a148fc4-e28d-11ed-99b7-d1ac0e4a4893,G1tjLIxDmbMvh8EmVD+P39Xj0nY=] */
