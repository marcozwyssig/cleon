package cleon.sda.spec.analysis.solution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SolutionAnalysis extends DynamicResource implements ISolutionAnalysis {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionAnalysis> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionAnalysis>() {
    
    @Override
    public ISolutionAnalysis create() {
      return new SolutionAnalysis();
    }
    
    @Override
    public ISolutionAnalysis create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SolutionAnalysis(resourceRepository, resource);
    }
  
  };

  public SolutionAnalysis() {
    super(ISolutionAnalysis.TYPE_ID);
  }
  
  public SolutionAnalysis(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISolutionAnalysis.TYPE_ID);
  }

  // attributes
  
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
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public SolutionAnalysis setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public SolutionAnalysis setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public cleon.sda.spec.analysis.solution.drivers.javamodel.IDrivers selectDrivers() {
    return _getSingle(cleon.sda.spec.analysis.solution.drivers.javamodel.IDrivers.class, cleon.sda.spec.analysis.solution.SolutionPackage.SolutionAnalysis_drivers);
  }

  public SolutionAnalysis setDrivers(cleon.sda.spec.analysis.solution.drivers.javamodel.IDrivers drivers) {
    _setSingle(cleon.sda.spec.analysis.solution.SolutionPackage.SolutionAnalysis_drivers, drivers);
    return this;
  }
    
  @Override
  public cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluations selectEvaluation() {
    return _getSingle(cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluations.class, cleon.sda.spec.analysis.solution.SolutionPackage.SolutionAnalysis_evaluation);
  }

  public SolutionAnalysis setEvaluation(cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluations evaluation) {
    _setSingle(cleon.sda.spec.analysis.solution.SolutionPackage.SolutionAnalysis_evaluation, evaluation);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public SolutionAnalysis setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public SolutionAnalysis setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public SolutionAnalysis setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.sda.spec.analysis.solution.solutions.javamodel.ISolutions selectSolution() {
    return _getSingle(cleon.sda.spec.analysis.solution.solutions.javamodel.ISolutions.class, cleon.sda.spec.analysis.solution.SolutionPackage.SolutionAnalysis_solution);
  }

  public SolutionAnalysis setSolution(cleon.sda.spec.analysis.solution.solutions.javamodel.ISolutions solution) {
    _setSingle(cleon.sda.spec.analysis.solution.SolutionPackage.SolutionAnalysis_solution, solution);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style);
  }

  public SolutionAnalysis setStyle(cleon.doc.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SolutionAnalysis setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public SolutionAnalysis setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptSingle(cleon.sda.spec.analysis.solution.drivers.javamodel.IDrivers.class, cleon.sda.spec.analysis.solution.SolutionPackage.SolutionAnalysis_drivers, visitor);
    _acceptSingle(cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluations.class, cleon.sda.spec.analysis.solution.SolutionPackage.SolutionAnalysis_evaluation, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.sda.spec.analysis.solution.solutions.javamodel.ISolutions.class, cleon.sda.spec.analysis.solution.SolutionPackage.SolutionAnalysis_solution, visitor);
    _acceptSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis selectToMeDrivers(cleon.sda.spec.analysis.solution.drivers.javamodel.IDrivers object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis.class, cleon.sda.spec.analysis.solution.SolutionPackage.SolutionAnalysis_drivers, object.getResource());
  }
  
  public static cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis selectToMeSolution(cleon.sda.spec.analysis.solution.solutions.javamodel.ISolutions object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis.class, cleon.sda.spec.analysis.solution.SolutionPackage.SolutionAnalysis_solution, object.getResource());
  }
  
  public static cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis selectToMeEvaluation(cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluations object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis.class, cleon.sda.spec.analysis.solution.SolutionPackage.SolutionAnalysis_evaluation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c647eff4-3c0e-11e5-9962-cf3035adb922,CiaQtMrK31OFsgCHhXfc2vf3a8k=] */
