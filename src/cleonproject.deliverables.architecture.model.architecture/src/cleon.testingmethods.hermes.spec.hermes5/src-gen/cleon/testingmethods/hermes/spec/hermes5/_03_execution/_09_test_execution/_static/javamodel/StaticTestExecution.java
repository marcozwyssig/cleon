package cleon.testingmethods.hermes.spec.hermes5._03_execution._09_test_execution._static.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class StaticTestExecution extends DynamicResource implements IStaticTestExecution {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStaticTestExecution> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStaticTestExecution>() {
    
    @Override
    public IStaticTestExecution create() {
      return new StaticTestExecution();
    }
    
    @Override
    public IStaticTestExecution create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new StaticTestExecution(resourceRepository, resource);
    }
  
  };

  public StaticTestExecution() {
    super(IStaticTestExecution.TYPE_ID);
  }
  
  public StaticTestExecution(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStaticTestExecution.TYPE_ID);
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
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public StaticTestExecution setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public StaticTestExecution setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public StaticTestExecution setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.IStaticTestSpecification selectStaticTestSpecification() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.IStaticTestSpecification.class, cleon.testingmethods.hermes.spec.hermes5._03_execution._09_test_execution._static._staticPackage.StaticTestExecution_staticTestSpecification);
  }

  public StaticTestExecution setStaticTestSpecification(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.IStaticTestSpecification staticTestSpecification) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._03_execution._09_test_execution._static._staticPackage.StaticTestExecution_staticTestSpecification, staticTestSpecification);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public StaticTestExecution setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public StaticTestExecution setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.IStaticTestSpecification.class, cleon.testingmethods.hermes.spec.hermes5._03_execution._09_test_execution._static._staticPackage.StaticTestExecution_staticTestSpecification, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._03_execution._09_test_execution._static.javamodel.IStaticTestExecution> selectToMeStaticTestSpecification(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.IStaticTestSpecification object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._03_execution._09_test_execution._static.javamodel.IStaticTestExecution.class, cleon.testingmethods.hermes.spec.hermes5._03_execution._09_test_execution._static._staticPackage.StaticTestExecution_staticTestSpecification, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4a969a6c-20d7-11e6-9368-9172b77c2cff,unJQzBZZgIb1CZTkaBZ0wOhiD8w=] */
