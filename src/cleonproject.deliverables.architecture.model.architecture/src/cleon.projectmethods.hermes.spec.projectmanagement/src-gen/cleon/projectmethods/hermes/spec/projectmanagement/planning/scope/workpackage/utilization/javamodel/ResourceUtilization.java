package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ResourceUtilization extends DynamicResource implements IResourceUtilization {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourceUtilization> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourceUtilization>() {
    
    @Override
    public IResourceUtilization create() {
      return new ResourceUtilization();
    }
    
    @Override
    public IResourceUtilization create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ResourceUtilization(resourceRepository, resource);
    }
  
  };

  public ResourceUtilization() {
    super(IResourceUtilization.TYPE_ID);
  }
  
  public ResourceUtilization(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IResourceUtilization.TYPE_ID);
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
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.AbstractChapter_chapters);
  }

  public ResourceUtilization setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.AbstractChapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ResourceUtilization setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ResourceUtilization setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IPersonUtilization> selectPersonUtilization() {
    return _getList(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IPersonUtilization.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.UtilizationPackage.ResourceUtilization_personUtilization);
  }

  public ResourceUtilization setPersonUtilization(java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IPersonUtilization> personUtilization) {
    _setList(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.UtilizationPackage.ResourceUtilization_personUtilization, personUtilization);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ResourceUtilization setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IRoleUtilization> selectUtilizateRoles() {
    return _getMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IRoleUtilization.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.UtilizationPackage.ResourceUtilization_utilizateRoles);
  }

  public ResourceUtilization setUtilizateRoles(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IRoleUtilization> utilizateRoles) {
    _setMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.UtilizationPackage.ResourceUtilization_utilizateRoles, utilizateRoles);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.AbstractChapter_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IPersonUtilization.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.UtilizationPackage.ResourceUtilization_personUtilization, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IRoleUtilization.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.UtilizationPackage.ResourceUtilization_utilizateRoles, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IResourceUtilization selectToMeUtilizateRoles(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IRoleUtilization object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IResourceUtilization.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.UtilizationPackage.ResourceUtilization_utilizateRoles, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IResourceUtilization selectToMePersonUtilization(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IPersonUtilization object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IResourceUtilization.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.UtilizationPackage.ResourceUtilization_personUtilization, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8db4bffd-bbd5-11e6-997f-d73ea5a3671c,uowKU0dMv6kZu7TdqZOYEPPeAY0=] */
