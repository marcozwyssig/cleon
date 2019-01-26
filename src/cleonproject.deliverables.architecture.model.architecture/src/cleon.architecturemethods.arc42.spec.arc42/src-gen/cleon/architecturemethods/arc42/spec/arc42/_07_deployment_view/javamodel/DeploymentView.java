package cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentView extends DynamicResource implements IDeploymentView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentView>() {
    
    @Override
    public IDeploymentView create() {
      return new DeploymentView();
    }
    
    @Override
    public IDeploymentView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentView(resourceRepository, resource);
    }
  
  };

  public DeploymentView() {
    super(IDeploymentView.TYPE_ID);
  }
  
  public DeploymentView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentView.TYPE_ID);
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
  public cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IBuildView selectBuildView() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IBuildView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_buildView);
  }

  public DeploymentView setBuildView(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IBuildView buildView) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_buildView, buildView);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public DeploymentView setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.deployview.javamodel.IDeployView selectDeployView() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.deployview.javamodel.IDeployView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_deployView);
  }

  public DeploymentView setDeployView(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.deployview.javamodel.IDeployView deployView) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_deployView, deployView);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public DeploymentView setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IMonitorView selectMonitorView() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IMonitorView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_monitorView);
  }

  public DeploymentView setMonitorView(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IMonitorView monitorView) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_monitorView, monitorView);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IPackageView selectPackageView() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IPackageView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_packageView);
  }

  public DeploymentView setPackageView(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IPackageView packageView) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_packageView, packageView);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DeploymentView setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.ITestView selectTestView() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.ITestView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_testView);
  }

  public DeploymentView setTestView(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.ITestView testView) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_testView, testView);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IBuildView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_buildView, visitor);
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.deployview.javamodel.IDeployView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_deployView, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IMonitorView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_monitorView, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IPackageView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_packageView, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.ITestView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_testView, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView selectToMeBuildView(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IBuildView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_buildView, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView selectToMePackageView(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IPackageView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_packageView, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView selectToMeDeployView(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.deployview.javamodel.IDeployView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_deployView, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView selectToMeTestView(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.ITestView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_testView, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView selectToMeMonitorView(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IMonitorView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.DeploymentView_monitorView, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b47acb73-314c-11e5-bd99-eda9ce254b0b,L+j1r/S6FHQNdr6ZSyi2GzvRM1A=] */
