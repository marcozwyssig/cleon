package cleon.analysis.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Analysis extends DynamicResource implements IAnalysis {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAnalysis> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAnalysis>() {
    
    @Override
    public IAnalysis create() {
      return new Analysis();
    }
    
    @Override
    public IAnalysis create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Analysis(resourceRepository, resource);
    }
  
  };

  public Analysis() {
    super(IAnalysis.TYPE_ID);
  }
  
  public Analysis(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAnalysis.TYPE_ID);
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
  public java.util.List<java.lang.String> selectDescription() {
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.chapter.ChapterPackage.Description_description);
  }
    
  public void setDescription(java.util.List<java.lang.String> description) {
     _setListAttribute(cleon.doc.spec.chapter.ChapterPackage.Description_description, description);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public Analysis setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents);
  }

  public Analysis setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.Document_documents, documents);
    return this;
  }
    
  @Override
  public cleon.analysis.spec.drivers.javamodel.IDrivers selectDrivers() {
    return _getSingle(cleon.analysis.spec.drivers.javamodel.IDrivers.class, cleon.analysis.spec.SpecPackage.Analysis_drivers);
  }

  public Analysis setDrivers(cleon.analysis.spec.drivers.javamodel.IDrivers drivers) {
    _setSingle(cleon.analysis.spec.SpecPackage.Analysis_drivers, drivers);
    return this;
  }
    
  @Override
  public cleon.analysis.spec.evaluation.javamodel.IEvaluations selectEvaluation() {
    return _getSingle(cleon.analysis.spec.evaluation.javamodel.IEvaluations.class, cleon.analysis.spec.SpecPackage.Analysis_evaluation);
  }

  public Analysis setEvaluation(cleon.analysis.spec.evaluation.javamodel.IEvaluations evaluation) {
    _setSingle(cleon.analysis.spec.SpecPackage.Analysis_evaluation, evaluation);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.document.DocumentPackage.NoChaptersInDocument_noChapters);
  }

  public Analysis setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.NoChaptersInDocument_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Analysis setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public Analysis setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.analysis.spec.solutions.javamodel.ISolutions selectSolution() {
    return _getSingle(cleon.analysis.spec.solutions.javamodel.ISolutions.class, cleon.analysis.spec.SpecPackage.Analysis_solution);
  }

  public Analysis setSolution(cleon.analysis.spec.solutions.javamodel.ISolutions solution) {
    _setSingle(cleon.analysis.spec.SpecPackage.Analysis_solution, solution);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Analysis setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public Analysis setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.chapter.ChapterPackage.Description_description, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents, visitor);
    _acceptSingle(cleon.analysis.spec.drivers.javamodel.IDrivers.class, cleon.analysis.spec.SpecPackage.Analysis_drivers, visitor);
    _acceptSingle(cleon.analysis.spec.evaluation.javamodel.IEvaluations.class, cleon.analysis.spec.SpecPackage.Analysis_evaluation, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.document.DocumentPackage.NoChaptersInDocument_noChapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptSingle(cleon.analysis.spec.solutions.javamodel.ISolutions.class, cleon.analysis.spec.SpecPackage.Analysis_solution, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.analysis.spec.javamodel.IAnalysis selectToMeDrivers(cleon.analysis.spec.drivers.javamodel.IDrivers object) {
    return _getToMeSingle(object.getRepository(), cleon.analysis.spec.javamodel.IAnalysis.class, cleon.analysis.spec.SpecPackage.Analysis_drivers, object.getResource());
  }
  
  public static cleon.analysis.spec.javamodel.IAnalysis selectToMeSolution(cleon.analysis.spec.solutions.javamodel.ISolutions object) {
    return _getToMeSingle(object.getRepository(), cleon.analysis.spec.javamodel.IAnalysis.class, cleon.analysis.spec.SpecPackage.Analysis_solution, object.getResource());
  }
  
  public static cleon.analysis.spec.javamodel.IAnalysis selectToMeEvaluation(cleon.analysis.spec.evaluation.javamodel.IEvaluations object) {
    return _getToMeSingle(object.getRepository(), cleon.analysis.spec.javamodel.IAnalysis.class, cleon.analysis.spec.SpecPackage.Analysis_evaluation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c647eff4-3c0e-11e5-9962-cf3035adb922,xfVqrV/N5MDCO/bt/iGcklRBXLI=] */
