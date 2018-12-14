package cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Constraints extends DynamicResource implements IConstraints {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConstraints> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConstraints>() {
    
    @Override
    public IConstraints create() {
      return new Constraints();
    }
    
    @Override
    public IConstraints create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Constraints(resourceRepository, resource);
    }
  
  };

  public Constraints() {
    super(IConstraints.TYPE_ID);
  }
  
  public Constraints(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IConstraints.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters);
  }

  public Constraints setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IDependencies selectDependencies() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IDependencies.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.ConstraintsPackage.Constraints_dependencies);
  }

  public Constraints setDependencies(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IDependencies dependencies) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.ConstraintsPackage.Constraints_dependencies, dependencies);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IDistinctions selectDistinctions() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IDistinctions.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.ConstraintsPackage.Constraints_distinctions);
  }

  public Constraints setDistinctions(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IDistinctions distinctions) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.ConstraintsPackage.Constraints_distinctions, distinctions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Constraints setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_paragraphs);
  }

  public Constraints setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Constraints setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IDependencies.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.ConstraintsPackage.Constraints_dependencies, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IDistinctions.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.ConstraintsPackage.Constraints_distinctions, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IConstraints selectToMeDependencies(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IDependencies object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IConstraints.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.ConstraintsPackage.Constraints_dependencies, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IConstraints selectToMeDistinctions(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IDistinctions object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IConstraints.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.ConstraintsPackage.Constraints_distinctions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f8f6cf2c-d42d-11e6-8a1d-7fdd5d29730e,8AgKfczchFDlUIJ87UuLSzsuHbY=] */
