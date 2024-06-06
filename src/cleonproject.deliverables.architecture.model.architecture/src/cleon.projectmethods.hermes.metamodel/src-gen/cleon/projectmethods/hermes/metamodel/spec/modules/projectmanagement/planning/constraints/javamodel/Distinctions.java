package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Distinctions extends DynamicResource implements IDistinctions {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDistinctions> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDistinctions>() {
    
    @Override
    public IDistinctions create() {
      return new Distinctions();
    }
    
    @Override
    public IDistinctions create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Distinctions(resourceRepository, resource);
    }
  
  };

  public Distinctions() {
    super(IDistinctions.TYPE_ID);
  }
  
  public Distinctions(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDistinctions.TYPE_ID);
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

  public Distinctions setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Distinctions setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Distinctions setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.javamodel.IProjectDistinction> selectProjectDistinctions() {
    return _getMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.javamodel.IProjectDistinction.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.ConstraintsPackage.Distinctions_projectDistinctions);
  }

  public Distinctions setProjectDistinctions(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.javamodel.IProjectDistinction> projectDistinctions) {
    _setMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.ConstraintsPackage.Distinctions_projectDistinctions, projectDistinctions);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Distinctions setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.javamodel.IProjectDistinction.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.ConstraintsPackage.Distinctions_projectDistinctions, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.javamodel.IDistinctions selectToMeProjectDistinctions(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.javamodel.IProjectDistinction object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.javamodel.IDistinctions.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.ConstraintsPackage.Distinctions_projectDistinctions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,613dabdb-d437-11e6-8a1d-7fdd5d29730e,6JaX3eqCAoAHcJF86bs+NyPxrvk=] */
