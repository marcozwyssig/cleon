package cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DynamicTestExecution extends DynamicResource implements IDynamicTestExecution {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDynamicTestExecution> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDynamicTestExecution>() {
    
    @Override
    public IDynamicTestExecution create() {
      return new DynamicTestExecution();
    }
    
    @Override
    public IDynamicTestExecution create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DynamicTestExecution(resourceRepository, resource);
    }
  
  };

  public DynamicTestExecution() {
    super(IDynamicTestExecution.TYPE_ID);
  }
  
  public DynamicTestExecution(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDynamicTestExecution.TYPE_ID);
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

  public DynamicTestExecution setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public DynamicTestExecution setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DynamicTestExecution setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.IStaticTestSpecification selectStaticTestSpecification() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.IStaticTestSpecification.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecution_staticTestSpecification);
  }

  public DynamicTestExecution setStaticTestSpecification(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.IStaticTestSpecification staticTestSpecification) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecution_staticTestSpecification, staticTestSpecification);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DynamicTestExecution setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DynamicTestExecution setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.IStaticTestSpecification.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecution_staticTestSpecification, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecution> selectToMeStaticTestSpecification(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.IStaticTestSpecification object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecution.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecution_staticTestSpecification, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,25396337-90e1-11e9-b8c5-7968e3120b73,3p5OOUr0gf9fvHpBI7aSQfgi+DA=] */
