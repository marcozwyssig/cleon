package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RBAC_Role_Systemcomponent_Template extends DynamicResource implements IRBAC_Role_Systemcomponent_Template {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRBAC_Role_Systemcomponent_Template> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRBAC_Role_Systemcomponent_Template>() {
    
    @Override
    public IRBAC_Role_Systemcomponent_Template create() {
      return new RBAC_Role_Systemcomponent_Template();
    }
    
    @Override
    public IRBAC_Role_Systemcomponent_Template create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RBAC_Role_Systemcomponent_Template(resourceRepository, resource);
    }
  
  };

  public RBAC_Role_Systemcomponent_Template() {
    super(IRBAC_Role_Systemcomponent_Template.TYPE_ID);
  }
  
  public RBAC_Role_Systemcomponent_Template(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRBAC_Role_Systemcomponent_Template.TYPE_ID);
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

  public RBAC_Role_Systemcomponent_Template setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cc07877e-7ff2-11ea-95c2-1d8b5d8f56b1,7vnZYm2JpuejhZwvRWh5HeDTzRg=] */
