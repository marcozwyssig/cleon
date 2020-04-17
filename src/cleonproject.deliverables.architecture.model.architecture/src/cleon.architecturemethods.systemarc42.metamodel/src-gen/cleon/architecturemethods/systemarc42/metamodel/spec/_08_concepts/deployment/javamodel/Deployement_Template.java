package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Deployement_Template extends DynamicResource implements IDeployement_Template {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeployement_Template> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeployement_Template>() {
    
    @Override
    public IDeployement_Template create() {
      return new Deployement_Template();
    }
    
    @Override
    public IDeployement_Template create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Deployement_Template(resourceRepository, resource);
    }
  
  };

  public Deployement_Template() {
    super(IDeployement_Template.TYPE_ID);
  }
  
  public Deployement_Template(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeployement_Template.TYPE_ID);
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
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentTemplateNode> selectTemplateNode() {
    return _getMultiMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentTemplateNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.Deployement_aE_Template_templateNode);
  }

  public Deployement_Template setTemplateNode(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentTemplateNode> templateNode) {
    _setMultiMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.Deployement_aE_Template_templateNode, templateNode);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Deployement_Template setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptMultiMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentTemplateNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.Deployement_aE_Template_templateNode, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeployement_Template selectToMeTemplateNode(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentTemplateNode object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeployement_Template.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.Deployement_aE_Template_templateNode, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3d0c231d-8017-11ea-b039-9728191a5cdc,kdzpaBssOhNZ5hnKSzXYxjBp1js=] */
