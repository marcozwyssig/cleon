package cleon.architecturemethods.eamod.metamodel.spec.nsv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FunctionalResource extends DynamicResource implements IFunctionalResource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunctionalResource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunctionalResource>() {
    
    @Override
    public IFunctionalResource create() {
      return new FunctionalResource();
    }
    
    @Override
    public IFunctionalResource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FunctionalResource(resourceRepository, resource);
    }
  
  };

  public FunctionalResource() {
    super(IFunctionalResource.TYPE_ID);
  }
  
  public FunctionalResource(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFunctionalResource.TYPE_ID);
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

  public FunctionalResource setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b4f5b02e-81a0-11e7-953b-0d27a7d546ad,f+RQ3eqIr/9AKwOOVKs84NXK2oE=] */