package cleon.common.resources.metamodel.spec.importance.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Importance extends DynamicResource implements IImportance {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImportance> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImportance>() {
    
    @Override
    public IImportance create() {
      return new Importance();
    }
    
    @Override
    public IImportance create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Importance(resourceRepository, resource);
    }
  
  };

  public Importance() {
    super(IImportance.TYPE_ID);
  }
  
  public Importance(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImportance.TYPE_ID);
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

  public Importance setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (is__0_()) return visitor.visit__0_();
    if (is__Y_()) return visitor.visit__Y_();
    if (is__W_()) return visitor.visit__W_();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (is__0_()) {
      visitor.visit__0_();
      return;
    }
    if (is__Y_()) {
      visitor.visit__Y_();
      return;
    }
    if (is__W_()) {
      visitor.visit__W_();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean is__0_() {
    return getResource().equals(cleon.common.resources.metamodel.spec.importance.ImportancePackage.Importance___0_);
  }
  
  @Override
  public boolean is__Y_() {
    return getResource().equals(cleon.common.resources.metamodel.spec.importance.ImportancePackage.Importance___Y_);
  }
  
  @Override
  public boolean is__W_() {
    return getResource().equals(cleon.common.resources.metamodel.spec.importance.ImportancePackage.Importance___W_);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,948ee30d-3cfe-11e5-871f-6beac6a7c24b,8nPOlFUmEO7lKxQd5t4gTwMApdY=] */
