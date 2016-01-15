package cleon.sda.spec.projectmanagement.resourcemanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ResourceManagement extends DynamicResource implements IResourceManagement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourceManagement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourceManagement>() {
    
    @Override
    public IResourceManagement create() {
      return new ResourceManagement();
    }
    
    @Override
    public IResourceManagement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ResourceManagement(resourceRepository, resource);
    }
  
  };

  public ResourceManagement() {
    super(IResourceManagement.TYPE_ID);
  }
  
  public ResourceManagement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IResourceManagement.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public ResourceManagement setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public ResourceManagement setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.javamodel.ISubDocument selectNoDocuments() {
    return _getSingle(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments);
  }

  public ResourceManagement setNoDocuments(cleon.doc.spec.document.javamodel.ISubDocument noDocuments) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, noDocuments);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public ResourceManagement setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public ResourceManagement setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPersons selectPersons() {
    return _getSingle(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPersons.class, cleon.sda.spec.projectmanagement.resourcemanagement.ResourcemanagementPackage.ResourceManagement_persons);
  }

  public ResourceManagement setPersons(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPersons persons) {
    _setSingle(cleon.sda.spec.projectmanagement.resourcemanagement.ResourcemanagementPackage.ResourceManagement_persons, persons);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel.ISkills selectSkills() {
    return _getSingle(cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel.ISkills.class, cleon.sda.spec.projectmanagement.resourcemanagement.ResourcemanagementPackage.ResourceManagement_skills);
  }

  public ResourceManagement setSkills(cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel.ISkills skills) {
    _setSingle(cleon.sda.spec.projectmanagement.resourcemanagement.ResourcemanagementPackage.ResourceManagement_skills, skills);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ResourceManagement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public ResourceManagement setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptSingle(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPersons.class, cleon.sda.spec.projectmanagement.resourcemanagement.ResourcemanagementPackage.ResourceManagement_persons, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel.ISkills.class, cleon.sda.spec.projectmanagement.resourcemanagement.ResourcemanagementPackage.ResourceManagement_skills, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.resourcemanagement.javamodel.IResourceManagement selectToMeSkills(cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel.ISkills object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.resourcemanagement.javamodel.IResourceManagement.class, cleon.sda.spec.projectmanagement.resourcemanagement.ResourcemanagementPackage.ResourceManagement_skills, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.resourcemanagement.javamodel.IResourceManagement selectToMePersons(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPersons object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.resourcemanagement.javamodel.IResourceManagement.class, cleon.sda.spec.projectmanagement.resourcemanagement.ResourcemanagementPackage.ResourceManagement_persons, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a143e996-a7e5-11e5-82dd-3b995d9c840c,VtVg1KajLnRuVMQ7wVotG7Yw3XI=] */
