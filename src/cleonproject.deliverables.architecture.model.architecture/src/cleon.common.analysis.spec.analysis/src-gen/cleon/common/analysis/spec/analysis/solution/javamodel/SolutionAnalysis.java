package cleon.common.analysis.spec.analysis.solution.javamodel;

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

  @Override
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public cleon.common.doc.spec.doc.chapter.about.javamodel.IAbout selectAbout() {
    return _getSingle(cleon.common.doc.spec.doc.chapter.about.javamodel.IAbout.class, cleon.common.doc.spec.doc.chapter.about.AboutPackage.AboutAware_about);
  }

  public SolutionAnalysis setAbout(cleon.common.doc.spec.doc.chapter.about.javamodel.IAbout about) {
    _setSingle(cleon.common.doc.spec.doc.chapter.about.AboutPackage.AboutAware_about, about);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.AbstractChapter_chapters);
  }

  public SolutionAnalysis setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.AbstractChapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public SolutionAnalysis setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers selectDrivers() {
    return _getSingle(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers.class, cleon.common.analysis.spec.analysis.solution.SolutionPackage.SolutionAnalysis_drivers);
  }

  public SolutionAnalysis setDrivers(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers drivers) {
    _setSingle(cleon.common.analysis.spec.analysis.solution.SolutionPackage.SolutionAnalysis_drivers, drivers);
    return this;
  }
    
  @Override
  public cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IEvaluations selectEvaluation() {
    return _getSingle(cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IEvaluations.class, cleon.common.analysis.spec.analysis.solution.SolutionPackage.SolutionAnalysis_evaluation);
  }

  public SolutionAnalysis setEvaluation(cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IEvaluations evaluation) {
    _setSingle(cleon.common.analysis.spec.analysis.solution.SolutionPackage.SolutionAnalysis_evaluation, evaluation);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_noParagraphs);
  }

  public SolutionAnalysis setNoParagraphs(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SolutionAnalysis setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public SolutionAnalysis setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.common.analysis.spec.analysis.solution.solutions.javamodel.ISolutions selectSolution() {
    return _getSingle(cleon.common.analysis.spec.analysis.solution.solutions.javamodel.ISolutions.class, cleon.common.analysis.spec.analysis.solution.SolutionPackage.SolutionAnalysis_solution);
  }

  public SolutionAnalysis setSolution(cleon.common.analysis.spec.analysis.solution.solutions.javamodel.ISolutions solution) {
    _setSingle(cleon.common.analysis.spec.analysis.solution.SolutionPackage.SolutionAnalysis_solution, solution);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public SolutionAnalysis setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
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
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.common.doc.spec.doc.chapter.about.javamodel.IAbout.class, cleon.common.doc.spec.doc.chapter.about.AboutPackage.AboutAware_about, visitor);
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.AbstractChapter_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers.class, cleon.common.analysis.spec.analysis.solution.SolutionPackage.SolutionAnalysis_drivers, visitor);
    _acceptSingle(cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IEvaluations.class, cleon.common.analysis.spec.analysis.solution.SolutionPackage.SolutionAnalysis_evaluation, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_noParagraphs, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.common.analysis.spec.analysis.solution.solutions.javamodel.ISolutions.class, cleon.common.analysis.spec.analysis.solution.SolutionPackage.SolutionAnalysis_solution, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.common.analysis.spec.analysis.solution.javamodel.ISolutionAnalysis selectToMeDrivers(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers object) {
    return _getToMeSingle(object.getRepository(), cleon.common.analysis.spec.analysis.solution.javamodel.ISolutionAnalysis.class, cleon.common.analysis.spec.analysis.solution.SolutionPackage.SolutionAnalysis_drivers, object.getResource());
  }
  
  public static cleon.common.analysis.spec.analysis.solution.javamodel.ISolutionAnalysis selectToMeSolution(cleon.common.analysis.spec.analysis.solution.solutions.javamodel.ISolutions object) {
    return _getToMeSingle(object.getRepository(), cleon.common.analysis.spec.analysis.solution.javamodel.ISolutionAnalysis.class, cleon.common.analysis.spec.analysis.solution.SolutionPackage.SolutionAnalysis_solution, object.getResource());
  }
  
  public static cleon.common.analysis.spec.analysis.solution.javamodel.ISolutionAnalysis selectToMeEvaluation(cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IEvaluations object) {
    return _getToMeSingle(object.getRepository(), cleon.common.analysis.spec.analysis.solution.javamodel.ISolutionAnalysis.class, cleon.common.analysis.spec.analysis.solution.SolutionPackage.SolutionAnalysis_evaluation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c647eff4-3c0e-11e5-9962-cf3035adb922,cIfH6/YkjYIcFipOBYDWYgHE0d8=] */
