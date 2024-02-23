package cleon.architecturemethods.eamod.metamodel.spec.chrv.about.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EAMod_About extends DynamicResource implements IEAMod_About {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEAMod_About> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEAMod_About>() {
    
    @Override
    public IEAMod_About create() {
      return new EAMod_About();
    }
    
    @Override
    public IEAMod_About create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EAMod_About(resourceRepository, resource);
    }
  
  };

  public EAMod_About() {
    super(IEAMod_About.TYPE_ID);
  }
  
  public EAMod_About(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEAMod_About.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, chapterPath);
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
  public cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAudiences selectAudiences() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAudiences.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_audiences);
  }

  public EAMod_About setAudiences(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAudiences audiences) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_audiences, audiences);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public EAMod_About setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.about.javamodel.IDependencies selectDependencies() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IDependencies.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_dependencies);
  }

  public EAMod_About setDependencies(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IDependencies dependencies) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_dependencies, dependencies);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.about.javamodel.IDistinction selectDistinction() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IDistinction.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_distinction);
  }

  public EAMod_About setDistinction(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IDistinction distinction) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_distinction, distinction);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public EAMod_About setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.about.javamodel.ILayout selectLayout() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.ILayout.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_layout);
  }

  public EAMod_About setLayout(cleon.common.doc.metamodel.spec.chapter.about.javamodel.ILayout layout) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_layout, layout);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.about.javamodel.IEAModMethod selectMethod() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.about.javamodel.IEAModMethod.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.about.AboutPackage.EAMod_aE_About_method);
  }

  public EAMod_About setMethod(cleon.architecturemethods.eamod.metamodel.spec.chrv.about.javamodel.IEAModMethod method) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.about.AboutPackage.EAMod_aE_About_method, method);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public EAMod_About setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.about.javamodel.IPurpose selectPurpose() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IPurpose.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_purpose);
  }

  public EAMod_About setPurpose(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IPurpose purpose) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_purpose, purpose);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.references.javamodel.IReferences selectReferences() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.references.javamodel.IReferences.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_references);
  }

  public EAMod_About setReferences(cleon.common.doc.metamodel.spec.chapter.references.javamodel.IReferences references) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_references, references);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.about.javamodel.ITask selectTask() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.ITask.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_task);
  }

  public EAMod_About setTask(cleon.common.doc.metamodel.spec.chapter.about.javamodel.ITask task) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_task, task);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EAMod_About setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAudiences.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_audiences, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IDependencies.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_dependencies, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IDistinction.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_distinction, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.ILayout.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_layout, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.about.javamodel.IEAModMethod.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.about.AboutPackage.EAMod_aE_About_method, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IPurpose.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_purpose, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.references.javamodel.IReferences.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_references, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.ITask.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.About_task, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.about.javamodel.IEAMod_About selectToMeMethod(cleon.architecturemethods.eamod.metamodel.spec.chrv.about.javamodel.IEAModMethod object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.about.javamodel.IEAMod_About.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.about.AboutPackage.EAMod_aE_About_method, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,06d0ff23-1406-11e9-a836-9d144e5bc2a5,Qen6xooJ3cOe6IMXv66u9LoF9YA=] */
