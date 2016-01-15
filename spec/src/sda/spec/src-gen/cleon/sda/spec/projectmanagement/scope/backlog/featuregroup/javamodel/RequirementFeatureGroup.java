package cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RequirementFeatureGroup extends DynamicResource implements IRequirementFeatureGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementFeatureGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementFeatureGroup>() {
    
    @Override
    public IRequirementFeatureGroup create() {
      return new RequirementFeatureGroup();
    }
    
    @Override
    public IRequirementFeatureGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RequirementFeatureGroup(resourceRepository, resource);
    }
  
  };

  public RequirementFeatureGroup() {
    super(IRequirementFeatureGroup.TYPE_ID);
  }
  
  public RequirementFeatureGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequirementFeatureGroup.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Integer selectPlannedEstimate() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_plannedEstimate);
  }
    
  public void setPlannedEstimate(java.lang.Integer plannedEstimate) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_plannedEstimate, plannedEstimate);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public RequirementFeatureGroup setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public RequirementFeatureGroup setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public RequirementFeatureGroup setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup> selectSubfeatureGroup() {
    return _getList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_subfeatureGroup);
  }

  public RequirementFeatureGroup setSubfeatureGroup(java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup> subfeatureGroup) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_subfeatureGroup, subfeatureGroup);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RequirementFeatureGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem> selectWorkItems() {
    return _getList(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_workItems);
  }

  public RequirementFeatureGroup setWorkItems(java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem> workItems) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_workItems, workItems);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_plannedEstimate, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_subfeatureGroup, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_workItems, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,27c5167e-375a-11e5-95d9-2b04d7ab02d9,WwZpPTxMG1A+v7gphKm3JwHqpP8=] */
