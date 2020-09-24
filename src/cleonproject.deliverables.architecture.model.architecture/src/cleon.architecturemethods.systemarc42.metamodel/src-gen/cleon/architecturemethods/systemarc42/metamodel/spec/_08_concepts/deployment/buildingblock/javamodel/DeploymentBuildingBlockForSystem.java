package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentBuildingBlockForSystem extends DynamicResource implements IDeploymentBuildingBlockForSystem {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentBuildingBlockForSystem> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentBuildingBlockForSystem>() {
    
    @Override
    public IDeploymentBuildingBlockForSystem create() {
      return new DeploymentBuildingBlockForSystem();
    }
    
    @Override
    public IDeploymentBuildingBlockForSystem create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentBuildingBlockForSystem(resourceRepository, resource);
    }
  
  };

  public DeploymentBuildingBlockForSystem() {
    super(IDeploymentBuildingBlockForSystem.TYPE_ID);
  }
  
  public DeploymentBuildingBlockForSystem(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentBuildingBlockForSystem.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public DeploymentBuildingBlockForSystem setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystem selectDeploymentBuildingBlockForSystem() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.BuildingblockPackage.DeploymentBuildingBlockForSystem_deploymentBuildingBlockForSystem);
  }

  public DeploymentBuildingBlockForSystem setDeploymentBuildingBlockForSystem(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystem deploymentBuildingBlockForSystem) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.BuildingblockPackage.DeploymentBuildingBlockForSystem_deploymentBuildingBlockForSystem, deploymentBuildingBlockForSystem);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeploymentBuildingBlockForSystemConfiguration> selectDeploymentBuildingBlockForSystemConfigurations() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeploymentBuildingBlockForSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.BuildingblockPackage.DeploymentBuildingBlockForSystem_deploymentBuildingBlockForSystemConfigurations);
  }

  public DeploymentBuildingBlockForSystem setDeploymentBuildingBlockForSystemConfigurations(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeploymentBuildingBlockForSystemConfiguration> deploymentBuildingBlockForSystemConfigurations) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.BuildingblockPackage.DeploymentBuildingBlockForSystem_deploymentBuildingBlockForSystemConfigurations, deploymentBuildingBlockForSystemConfigurations);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public DeploymentBuildingBlockForSystem setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DeploymentBuildingBlockForSystem setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DeploymentBuildingBlockForSystem setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentBuildingBlockForSystem setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.BuildingblockPackage.DeploymentBuildingBlockForSystem_deploymentBuildingBlockForSystem, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeploymentBuildingBlockForSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.BuildingblockPackage.DeploymentBuildingBlockForSystem_deploymentBuildingBlockForSystemConfigurations, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeploymentBuildingBlockForSystem> selectToMeDeploymentBuildingBlockForSystem(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystem object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeploymentBuildingBlockForSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.BuildingblockPackage.DeploymentBuildingBlockForSystem_deploymentBuildingBlockForSystem, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeploymentBuildingBlockForSystem selectToMeDeploymentBuildingBlockForSystemConfigurations(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeploymentBuildingBlockForSystemConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeploymentBuildingBlockForSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.BuildingblockPackage.DeploymentBuildingBlockForSystem_deploymentBuildingBlockForSystemConfigurations, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5918a15b-fe4b-11ea-892b-df291bae18c5,FCMP15tH5nPfkHsVSJsH+83ksF8=] */
