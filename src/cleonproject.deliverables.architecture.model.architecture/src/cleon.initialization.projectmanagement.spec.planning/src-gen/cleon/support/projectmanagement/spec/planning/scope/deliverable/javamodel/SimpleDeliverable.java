package cleon.support.projectmanagement.spec.planning.scope.deliverable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SimpleDeliverable extends DynamicResource implements ISimpleDeliverable {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISimpleDeliverable> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISimpleDeliverable>() {
    
    @Override
    public ISimpleDeliverable create() {
      return new SimpleDeliverable();
    }
    
    @Override
    public ISimpleDeliverable create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SimpleDeliverable(resourceRepository, resource);
    }
  
  };

  public SimpleDeliverable() {
    super(ISimpleDeliverable.TYPE_ID);
  }
  
  public SimpleDeliverable(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISimpleDeliverable.TYPE_ID);
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

  public SimpleDeliverable setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bd486ba5-bc89-11e6-b169-a12bde5a1c7c,JVfSROxo8NUpqKzeOtjuW61qDG4=] */
