package cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ActivityFeatureGroup extends DynamicResource implements IActivityFeatureGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivityFeatureGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivityFeatureGroup>() {
    
    @Override
    public IActivityFeatureGroup create() {
      return new ActivityFeatureGroup();
    }
    
    @Override
    public IActivityFeatureGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ActivityFeatureGroup(resourceRepository, resource);
    }
  
  };

  public ActivityFeatureGroup() {
    super(IActivityFeatureGroup.TYPE_ID);
  }
  
  public ActivityFeatureGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IActivityFeatureGroup.TYPE_ID);
  }

  // attributes
  
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
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IActivity> selectActivities() {
    return _getList(cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IActivity.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.ActivityFeatureGroup_activities);
  }

  public ActivityFeatureGroup setActivities(java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IActivity> activities) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.ActivityFeatureGroup_activities, activities);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public ActivityFeatureGroup setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public ActivityFeatureGroup setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.javamodel.ISubDocument selectNoDocuments() {
    return _getSingle(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments);
  }

  public ActivityFeatureGroup setNoDocuments(cleon.doc.spec.document.javamodel.ISubDocument noDocuments) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, noDocuments);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public ActivityFeatureGroup setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public ActivityFeatureGroup setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup> selectSubfeatureGroup() {
    return _getList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_subfeatureGroup);
  }

  public ActivityFeatureGroup setSubfeatureGroup(java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup> subfeatureGroup) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_subfeatureGroup, subfeatureGroup);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ActivityFeatureGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public ActivityFeatureGroup setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem> selectWorkItems() {
    return _getList(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_workItems);
  }

  public ActivityFeatureGroup setWorkItems(java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem> workItems) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_workItems, workItems);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_plannedEstimate, visitor);
    // relations
    _acceptList(cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IActivity.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.ActivityFeatureGroup_activities, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptSingle(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_subfeatureGroup, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_workItems, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IActivityFeatureGroup selectToMeActivities(cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IActivity object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IActivityFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.ActivityFeatureGroup_activities, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,98e4deb9-b9c5-11e5-a5dc-db9071475fc6,MJTVVIDLfLY+2bhAHBt1uwH1vBU=] */
