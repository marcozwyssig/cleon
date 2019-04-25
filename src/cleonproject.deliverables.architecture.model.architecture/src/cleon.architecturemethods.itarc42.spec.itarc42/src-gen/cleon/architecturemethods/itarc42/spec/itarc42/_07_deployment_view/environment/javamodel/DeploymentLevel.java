package cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentLevel extends DynamicResource implements IDeploymentLevel {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentLevel> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentLevel>() {
    
    @Override
    public IDeploymentLevel create() {
      return new DeploymentLevel();
    }
    
    @Override
    public IDeploymentLevel create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentLevel(resourceRepository, resource);
    }
  
  };

  public DeploymentLevel() {
    super(IDeploymentLevel.TYPE_ID);
  }
  
  public DeploymentLevel(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentLevel.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public DeploymentLevel setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public DeploymentLevel setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode selectNode() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.EnvironmentPackage.DeploymentLevel_node);
  }

  public DeploymentLevel setNode(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode node) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.EnvironmentPackage.DeploymentLevel_node, node);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DeploymentLevel setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DeploymentLevel setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentLevel setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.EnvironmentPackage.DeploymentLevel_node, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.javamodel.IDeploymentLevel> selectToMeNode(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.EnvironmentPackage.DeploymentLevel_node, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3c812d28-0b6d-11e9-a136-69d076e48ed1,oQMoPCZspTwQQR4eLAUaRnbRy3o=] */
