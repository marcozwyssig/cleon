package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ActivityGroups extends DynamicResource implements IActivityGroups {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivityGroups> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivityGroups>() {
    
    @Override
    public IActivityGroups create() {
      return new ActivityGroups();
    }
    
    @Override
    public IActivityGroups create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ActivityGroups(resourceRepository, resource);
    }
  
  };

  public ActivityGroups() {
    super(IActivityGroups.TYPE_ID);
  }
  
  public ActivityGroups(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IActivityGroups.TYPE_ID);
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
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IActivitySecurityGroup> selectActivities() {
    return _getMultiMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IActivitySecurityGroup.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.ActivityGroups_activities);
  }

  public ActivityGroups setActivities(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IActivitySecurityGroup> activities) {
    _setMultiMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.ActivityGroups_activities, activities);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public ActivityGroups setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ActivityGroups setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ActivityGroups setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISecurityGroups> selectSecurityGroups() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISecurityGroups.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.Groups_securityGroups);
  }

  public ActivityGroups setSecurityGroups(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISecurityGroups> securityGroups) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.Groups_securityGroups, securityGroups);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ActivityGroups setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMultiMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IActivitySecurityGroup.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.ActivityGroups_activities, visitor);
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISecurityGroups.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.Groups_securityGroups, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IActivityGroups selectToMeActivities(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IActivitySecurityGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IActivityGroups.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.ActivityGroups_activities, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6c451877-1d99-11e9-b601-db75aa6f89a4,j3roVLaY42urVzDr9n2UBzFsMZQ=] */
