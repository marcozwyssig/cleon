package ikt.product.documentation.spec.deployment.environment.naming.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Naming extends DynamicResource implements INaming {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INaming> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INaming>() {
    
    @Override
    public INaming create() {
      return new Naming();
    }
    
    @Override
    public INaming create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Naming(resourceRepository, resource);
    }
  
  };

  public Naming() {
    super(INaming.TYPE_ID);
  }
  
  public Naming(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INaming.TYPE_ID);
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
  public java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.deployment.environment.naming.javamodel.IDisplayName> selectDisplayName() {
    return _getMap(ikt.product.documentation.spec.deployment.environment.naming.javamodel.IDisplayName.class, ikt.product.documentation.spec.deployment.environment.naming.NamingPackage.Naming_displayName);
  }

  public Naming setDisplayName(java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.deployment.environment.naming.javamodel.IDisplayName> displayName) {
    _setMap(ikt.product.documentation.spec.deployment.environment.naming.NamingPackage.Naming_displayName, displayName);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Naming setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptMap(ikt.product.documentation.spec.deployment.environment.naming.javamodel.IDisplayName.class, ikt.product.documentation.spec.deployment.environment.naming.NamingPackage.Naming_displayName, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ikt.product.documentation.spec.deployment.environment.naming.javamodel.INaming selectToMeDisplayName(ikt.product.documentation.spec.deployment.environment.naming.javamodel.IDisplayName object) {
    return _getToMeSingle(object.getRepository(), ikt.product.documentation.spec.deployment.environment.naming.javamodel.INaming.class, ikt.product.documentation.spec.deployment.environment.naming.NamingPackage.Naming_displayName, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a750ec7a-11b2-11e9-9a7b-590a6369b499,P0owyHYX0eTf6FusKTGNQDfZuRc=] */
