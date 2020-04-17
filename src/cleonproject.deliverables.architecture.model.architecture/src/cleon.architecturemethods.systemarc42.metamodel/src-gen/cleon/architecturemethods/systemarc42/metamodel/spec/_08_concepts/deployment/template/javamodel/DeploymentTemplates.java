package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentTemplates extends DynamicResource implements IDeploymentTemplates {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentTemplates> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentTemplates>() {
    
    @Override
    public IDeploymentTemplates create() {
      return new DeploymentTemplates();
    }
    
    @Override
    public IDeploymentTemplates create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentTemplates(resourceRepository, resource);
    }
  
  };

  public DeploymentTemplates() {
    super(IDeploymentTemplates.TYPE_ID);
  }
  
  public DeploymentTemplates(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentTemplates.TYPE_ID);
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
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel.IDeploymentTemplate> selectTemplates() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel.IDeploymentTemplate.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.TemplatePackage.DeploymentTemplates_templates);
  }

  public DeploymentTemplates setTemplates(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel.IDeploymentTemplate> templates) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.TemplatePackage.DeploymentTemplates_templates, templates);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentTemplates setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel.IDeploymentTemplate.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.TemplatePackage.DeploymentTemplates_templates, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel.IDeploymentTemplates selectToMeTemplates(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel.IDeploymentTemplate object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel.IDeploymentTemplates.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.TemplatePackage.DeploymentTemplates_templates, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d22d41df-800e-11ea-915d-8592596896f8,haDIdYZf9MLz15OKa+bprYnIVuU=] */
