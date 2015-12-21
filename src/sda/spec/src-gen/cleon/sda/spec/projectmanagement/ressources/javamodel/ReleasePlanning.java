package cleon.sda.spec.projectmanagement.ressources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ReleasePlanning extends DynamicResource implements IReleasePlanning {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IReleasePlanning> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IReleasePlanning>() {
    
    @Override
    public IReleasePlanning create() {
      return new ReleasePlanning();
    }
    
    @Override
    public IReleasePlanning create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ReleasePlanning(resourceRepository, resource);
    }
  
  };

  public ReleasePlanning() {
    super(IReleasePlanning.TYPE_ID);
  }
  
  public ReleasePlanning(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IReleasePlanning.TYPE_ID);
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

  public ReleasePlanning setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3161251a-a7d9-11e5-82dd-3b995d9c840c,1UJioPJpf3V1+wLXN4FgjW7Frkg=] */
