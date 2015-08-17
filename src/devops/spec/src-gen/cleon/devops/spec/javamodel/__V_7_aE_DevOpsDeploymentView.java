package cleon.devops.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class __V_7_aE_DevOpsDeploymentView extends DynamicResource implements I__V_7_aE_DevOpsDeploymentView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_7_aE_DevOpsDeploymentView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_7_aE_DevOpsDeploymentView>() {
    
    @Override
    public I__V_7_aE_DevOpsDeploymentView create() {
      return new __V_7_aE_DevOpsDeploymentView();
    }
    
    @Override
    public I__V_7_aE_DevOpsDeploymentView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new __V_7_aE_DevOpsDeploymentView(resourceRepository, resource);
    }
  
  };

  public __V_7_aE_DevOpsDeploymentView() {
    super(I__V_7_aE_DevOpsDeploymentView.TYPE_ID);
  }
  
  public __V_7_aE_DevOpsDeploymentView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, I__V_7_aE_DevOpsDeploymentView.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.devops.spec.build.javamodel.IBuild selectBuild() {
    return _getSingle(cleon.devops.spec.build.javamodel.IBuild.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_build);
  }

  public __V_7_aE_DevOpsDeploymentView setBuild(cleon.devops.spec.build.javamodel.IBuild build) {
    _setSingle(cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_build, build);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public __V_7_aE_DevOpsDeploymentView setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.devops.spec.code.javamodel.ICode selectCode() {
    return _getSingle(cleon.devops.spec.code.javamodel.ICode.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_code);
  }

  public __V_7_aE_DevOpsDeploymentView setCode(cleon.devops.spec.code.javamodel.ICode code) {
    _setSingle(cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_code, code);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.devops.spec.deploy.javamodel.IDeploy> selectDeploy() {
    return _getList(cleon.devops.spec.deploy.javamodel.IDeploy.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_deploy);
  }

  public __V_7_aE_DevOpsDeploymentView setDeploy(java.util.List<? extends cleon.devops.spec.deploy.javamodel.IDeploy> deploy) {
    _setList(cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_deploy, deploy);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents);
  }

  public __V_7_aE_DevOpsDeploymentView setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.Document_documents, documents);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.javamodel.IDocument selectNoDocuments() {
    return _getSingle(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments);
  }

  public __V_7_aE_DevOpsDeploymentView setNoDocuments(cleon.doc.spec.document.javamodel.IDocument noDocuments) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, noDocuments);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.devops.spec.operate.javamodel.IOperate> selectOperates() {
    return _getList(cleon.devops.spec.operate.javamodel.IOperate.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_operates);
  }

  public __V_7_aE_DevOpsDeploymentView setOperates(java.util.List<? extends cleon.devops.spec.operate.javamodel.IOperate> operates) {
    _setList(cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_operates, operates);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public __V_7_aE_DevOpsDeploymentView setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public __V_7_aE_DevOpsDeploymentView setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.devops.spec.release.javamodel.IRelease selectRelease() {
    return _getSingle(cleon.devops.spec.release.javamodel.IRelease.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_release);
  }

  public __V_7_aE_DevOpsDeploymentView setRelease(cleon.devops.spec.release.javamodel.IRelease release) {
    _setSingle(cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_release, release);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec.javamodel.IArc42_Section> selectSections() {
    return _getList(cleon.arc42.spec.javamodel.IArc42_Section.class, cleon.arc42.spec.SpecPackage.arc42_aE_SubDocument_sections);
  }

  public __V_7_aE_DevOpsDeploymentView setSections(java.util.List<? extends cleon.arc42.spec.javamodel.IArc42_Section> sections) {
    _setList(cleon.arc42.spec.SpecPackage.arc42_aE_SubDocument_sections, sections);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.devops.spec.test.javamodel.ITest> selectTest() {
    return _getList(cleon.devops.spec.test.javamodel.ITest.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_test);
  }

  public __V_7_aE_DevOpsDeploymentView setTest(java.util.List<? extends cleon.devops.spec.test.javamodel.ITest> test) {
    _setList(cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_test, test);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public __V_7_aE_DevOpsDeploymentView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public __V_7_aE_DevOpsDeploymentView setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.devops.spec.build.javamodel.IBuild.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_build, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptSingle(cleon.devops.spec.code.javamodel.ICode.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_code, visitor);
    _acceptList(cleon.devops.spec.deploy.javamodel.IDeploy.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_deploy, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents, visitor);
    _acceptSingle(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, visitor);
    _acceptList(cleon.devops.spec.operate.javamodel.IOperate.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_operates, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptSingle(cleon.devops.spec.release.javamodel.IRelease.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_release, visitor);
    _acceptList(cleon.arc42.spec.javamodel.IArc42_Section.class, cleon.arc42.spec.SpecPackage.arc42_aE_SubDocument_sections, visitor);
    _acceptList(cleon.devops.spec.test.javamodel.ITest.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_test, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView selectToMeCode(cleon.devops.spec.code.javamodel.ICode object) {
    return _getToMeSingle(object.getRepository(), cleon.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_code, object.getResource());
  }
  
  public static cleon.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView selectToMeBuild(cleon.devops.spec.build.javamodel.IBuild object) {
    return _getToMeSingle(object.getRepository(), cleon.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_build, object.getResource());
  }
  
  public static java.util.List<cleon.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView> selectToMeTest(cleon.devops.spec.test.javamodel.ITest object) {
    return _getToMeList(object.getRepository(), cleon.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_test, object.getResource());
  }
  
  public static cleon.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView selectToMeRelease(cleon.devops.spec.release.javamodel.IRelease object) {
    return _getToMeSingle(object.getRepository(), cleon.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_release, object.getResource());
  }
  
  public static java.util.List<cleon.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView> selectToMeDeploy(cleon.devops.spec.deploy.javamodel.IDeploy object) {
    return _getToMeList(object.getRepository(), cleon.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_deploy, object.getResource());
  }
  
  public static java.util.List<cleon.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView> selectToMeOperates(cleon.devops.spec.operate.javamodel.IOperate object) {
    return _getToMeList(object.getRepository(), cleon.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_operates, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a574eba1-41b4-11e5-a2b3-edc7f3343844,nQuzNDJeIOd3wU8yVrmnNM7hY7w=] */
