package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentTemplate extends DynamicResource implements IDeploymentTemplate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentTemplate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentTemplate>() {
    
    @Override
    public IDeploymentTemplate create() {
      return new DeploymentTemplate();
    }
    
    @Override
    public IDeploymentTemplate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentTemplate(resourceRepository, resource);
    }
  
  };

  public DeploymentTemplate() {
    super(IDeploymentTemplate.TYPE_ID);
  }
  
  public DeploymentTemplate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentTemplate.TYPE_ID);
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
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel.IDeploymentTemplateNode> selectTemplateNodes() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel.IDeploymentTemplateNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.TemplatePackage.DeploymentTemplate_templateNodes);
  }

  public DeploymentTemplate setTemplateNodes(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel.IDeploymentTemplateNode> templateNodes) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.TemplatePackage.DeploymentTemplate_templateNodes, templateNodes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentTemplate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel.IDeploymentTemplateNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.TemplatePackage.DeploymentTemplate_templateNodes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel.IDeploymentTemplate selectToMeTemplateNodes(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel.IDeploymentTemplateNode object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel.IDeploymentTemplate.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.TemplatePackage.DeploymentTemplate_templateNodes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d8e75caa-800e-11ea-915d-8592596896f8,gqDcC84YYaysjsDymTFgT942qx0=] */
