package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeployView extends DynamicResource implements IDeployView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeployView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeployView>() {
    
    @Override
    public IDeployView create() {
      return new DeployView();
    }
    
    @Override
    public IDeployView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeployView(resourceRepository, resource);
    }
  
  };

  public DeployView() {
    super(IDeployView.TYPE_ID);
  }
  
  public DeployView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeployView.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, chapterPath);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public DeployView setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public DeployView setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment> selectEnvironments() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.DeployviewPackage.DeployView_environments);
  }

  public DeployView setEnvironments(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment> environments) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.DeployviewPackage.DeployView_environments, environments);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DeployView setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeployView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.DeployviewPackage.DeployView_environments, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IDeployView selectToMeEnvironments(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IDeployView.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.DeployviewPackage.DeployView_environments, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f642a2f1-9991-11e8-b347-dd2314b02086,LUtSlqMRtdLVTdC9WSwxistqFsA=] */
