package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BuiltinRole extends DynamicResource implements IBuiltinRole {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuiltinRole> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuiltinRole>() {
    
    @Override
    public IBuiltinRole create() {
      return new BuiltinRole();
    }
    
    @Override
    public IBuiltinRole create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BuiltinRole(resourceRepository, resource);
    }
  
  };

  public BuiltinRole() {
    super(IBuiltinRole.TYPE_ID);
  }
  
  public BuiltinRole(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBuiltinRole.TYPE_ID);
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

  public BuiltinRole setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,93efa9df-a1ae-11ea-886d-354b9ee6fb2d,3vqvTd0XR5rLsYy1C3SmpL5e5bI=] */
