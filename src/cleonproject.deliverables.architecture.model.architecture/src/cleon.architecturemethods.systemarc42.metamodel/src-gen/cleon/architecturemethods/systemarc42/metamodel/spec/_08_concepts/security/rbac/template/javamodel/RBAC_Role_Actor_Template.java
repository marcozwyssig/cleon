package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RBAC_Role_Actor_Template extends DynamicResource implements IRBAC_Role_Actor_Template {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRBAC_Role_Actor_Template> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRBAC_Role_Actor_Template>() {
    
    @Override
    public IRBAC_Role_Actor_Template create() {
      return new RBAC_Role_Actor_Template();
    }
    
    @Override
    public IRBAC_Role_Actor_Template create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RBAC_Role_Actor_Template(resourceRepository, resource);
    }
  
  };

  public RBAC_Role_Actor_Template() {
    super(IRBAC_Role_Actor_Template.TYPE_ID);
  }
  
  public RBAC_Role_Actor_Template(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRBAC_Role_Actor_Template.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor selectActor() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.TemplatePackage.RBAC_aE_Role_aE_Actor_aE_Template_actor);
  }

  public RBAC_Role_Actor_Template setActor(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor actor) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.TemplatePackage.RBAC_aE_Role_aE_Actor_aE_Template_actor, actor);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Responsibility_Template selectResponsibilities() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Responsibility_Template.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.TemplatePackage.RBAC_aE_Role_aE_Actor_aE_Template_responsibilities);
  }

  public RBAC_Role_Actor_Template setResponsibilities(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Responsibility_Template responsibilities) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.TemplatePackage.RBAC_aE_Role_aE_Actor_aE_Template_responsibilities, responsibilities);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RBAC_Role_Actor_Template setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RBAC_Role_Actor_Template setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.TemplatePackage.RBAC_aE_Role_aE_Actor_aE_Template_actor, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Responsibility_Template.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.TemplatePackage.RBAC_aE_Role_aE_Actor_aE_Template_responsibilities, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Actor_Template> selectToMeActor(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Actor_Template.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.TemplatePackage.RBAC_aE_Role_aE_Actor_aE_Template_actor, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Actor_Template selectToMeResponsibilities(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Responsibility_Template object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Actor_Template.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.TemplatePackage.RBAC_aE_Role_aE_Actor_aE_Template_responsibilities, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c467126f-7fec-11ea-97af-7d8bb186ed8f,amFMy4Ob6KEajIKLcUfH1hirdgI=] */
