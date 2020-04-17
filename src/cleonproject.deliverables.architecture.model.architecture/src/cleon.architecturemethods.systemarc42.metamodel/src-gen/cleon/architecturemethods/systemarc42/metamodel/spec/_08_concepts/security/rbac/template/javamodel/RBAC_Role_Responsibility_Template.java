package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RBAC_Role_Responsibility_Template extends DynamicResource implements IRBAC_Role_Responsibility_Template {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRBAC_Role_Responsibility_Template> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRBAC_Role_Responsibility_Template>() {
    
    @Override
    public IRBAC_Role_Responsibility_Template create() {
      return new RBAC_Role_Responsibility_Template();
    }
    
    @Override
    public IRBAC_Role_Responsibility_Template create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RBAC_Role_Responsibility_Template(resourceRepository, resource);
    }
  
  };

  public RBAC_Role_Responsibility_Template() {
    super(IRBAC_Role_Responsibility_Template.TYPE_ID);
  }
  
  public RBAC_Role_Responsibility_Template(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRBAC_Role_Responsibility_Template.TYPE_ID);
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
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Systemcomponent_Template> selectSystemcomponents() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Systemcomponent_Template.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.TemplatePackage.RBAC_aE_Role_aE_Responsibility_aE_Template_systemcomponents);
  }

  public RBAC_Role_Responsibility_Template setSystemcomponents(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Systemcomponent_Template> systemcomponents) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.TemplatePackage.RBAC_aE_Role_aE_Responsibility_aE_Template_systemcomponents, systemcomponents);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RBAC_Role_Responsibility_Template setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Systemcomponent_Template.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.TemplatePackage.RBAC_aE_Role_aE_Responsibility_aE_Template_systemcomponents, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Responsibility_Template selectToMeSystemcomponents(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Systemcomponent_Template object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Responsibility_Template.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.TemplatePackage.RBAC_aE_Role_aE_Responsibility_aE_Template_systemcomponents, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,286b7892-7fed-11ea-97af-7d8bb186ed8f,kxrzKKQ0ue3B51Ud677xPyRoHuw=] */
