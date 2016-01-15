package cleon.arc42.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Arc42 extends DynamicResource implements IArc42 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArc42> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArc42>() {
    
    @Override
    public IArc42 create() {
      return new Arc42();
    }
    
    @Override
    public IArc42 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Arc42(resourceRepository, resource);
    }
  
  };

  public Arc42() {
    super(IArc42.TYPE_ID);
  }
  
  public Arc42(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IArc42.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.arc42.spec._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals select__V_1_aE_introduction_aE_and_aE_goals() {
    return _getSingle(cleon.arc42.spec._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals.class, cleon.arc42.spec.SpecPackage.arc42___V_1_aE_introduction_aE_and_aE_goals);
  }

  public Arc42 set__V_1_aE_introduction_aE_and_aE_goals(cleon.arc42.spec._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals __V_1_aE_introduction_aE_and_aE_goals) {
    _setSingle(cleon.arc42.spec.SpecPackage.arc42___V_1_aE_introduction_aE_and_aE_goals, __V_1_aE_introduction_aE_and_aE_goals);
    return this;
  }
    
  @Override
  public cleon.arc42.spec._05_buildingblockview.javamodel.I__V_5_aE_BuildingBlockView select__V_5_aE_buildingblockview() {
    return _getSingle(cleon.arc42.spec._05_buildingblockview.javamodel.I__V_5_aE_BuildingBlockView.class, cleon.arc42.spec.SpecPackage.arc42___V_5_aE_buildingblockview);
  }

  public Arc42 set__V_5_aE_buildingblockview(cleon.arc42.spec._05_buildingblockview.javamodel.I__V_5_aE_BuildingBlockView __V_5_aE_buildingblockview) {
    _setSingle(cleon.arc42.spec.SpecPackage.arc42___V_5_aE_buildingblockview, __V_5_aE_buildingblockview);
    return this;
  }
    
  @Override
  public cleon.arc42.spec._07_deployment_view.javamodel.I__V_7_aE_DeploymentView select__V_7_aE_deploymentview() {
    return _getSingle(cleon.arc42.spec._07_deployment_view.javamodel.I__V_7_aE_DeploymentView.class, cleon.arc42.spec.SpecPackage.arc42___V_7_aE_deploymentview);
  }

  public Arc42 set__V_7_aE_deploymentview(cleon.arc42.spec._07_deployment_view.javamodel.I__V_7_aE_DeploymentView __V_7_aE_deploymentview) {
    _setSingle(cleon.arc42.spec.SpecPackage.arc42___V_7_aE_deploymentview, __V_7_aE_deploymentview);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Arc42 setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public Arc42 setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public Arc42 setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public cleon.doc.spec.paragraph.javamodel.IParagraph selectNoParagraph() {
    return _getSingle(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph);
  }

  public Arc42 setNoParagraph(cleon.doc.spec.paragraph.javamodel.IParagraph noParagraph) {
    _setSingle(cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph, noParagraph);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Arc42 setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Arc42 setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style);
  }

  public Arc42 setStyle(cleon.doc.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Arc42 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public Arc42 setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.arc42.spec._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals.class, cleon.arc42.spec.SpecPackage.arc42___V_1_aE_introduction_aE_and_aE_goals, visitor);
    _acceptSingle(cleon.arc42.spec._05_buildingblockview.javamodel.I__V_5_aE_BuildingBlockView.class, cleon.arc42.spec.SpecPackage.arc42___V_5_aE_buildingblockview, visitor);
    _acceptSingle(cleon.arc42.spec._07_deployment_view.javamodel.I__V_7_aE_DeploymentView.class, cleon.arc42.spec.SpecPackage.arc42___V_7_aE_deploymentview, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptSingle(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.arc42.spec.javamodel.IArc42 selectToMe__V_1_aE_introduction_aE_and_aE_goals(cleon.arc42.spec._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.arc42.spec.javamodel.IArc42.class, cleon.arc42.spec.SpecPackage.arc42___V_1_aE_introduction_aE_and_aE_goals, object.getResource());
  }
  
  public static cleon.arc42.spec.javamodel.IArc42 selectToMe__V_5_aE_buildingblockview(cleon.arc42.spec._05_buildingblockview.javamodel.I__V_5_aE_BuildingBlockView object) {
    return _getToMeSingle(object.getRepository(), cleon.arc42.spec.javamodel.IArc42.class, cleon.arc42.spec.SpecPackage.arc42___V_5_aE_buildingblockview, object.getResource());
  }
  
  public static cleon.arc42.spec.javamodel.IArc42 selectToMe__V_7_aE_deploymentview(cleon.arc42.spec._07_deployment_view.javamodel.I__V_7_aE_DeploymentView object) {
    return _getToMeSingle(object.getRepository(), cleon.arc42.spec.javamodel.IArc42.class, cleon.arc42.spec.SpecPackage.arc42___V_7_aE_deploymentview, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2cbcf671-ffcc-11e4-ac0a-959b440f987f,qUBhFefvgNAfiMFdpgoaDZHoS8M=] */
