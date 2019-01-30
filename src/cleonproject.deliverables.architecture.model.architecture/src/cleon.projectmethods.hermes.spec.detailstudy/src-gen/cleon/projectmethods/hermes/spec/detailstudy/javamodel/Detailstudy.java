package cleon.projectmethods.hermes.spec.detailstudy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Detailstudy extends DynamicResource implements IDetailstudy {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDetailstudy> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDetailstudy>() {
    
    @Override
    public IDetailstudy create() {
      return new Detailstudy();
    }
    
    @Override
    public IDetailstudy create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Detailstudy(resourceRepository, resource);
    }
  
  };

  public Detailstudy() {
    super(IDetailstudy.TYPE_ID);
  }
  
  public Detailstudy(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDetailstudy.TYPE_ID);
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

  public Detailstudy setAbout(cleon.common.doc.spec.doc.chapter.about.javamodel.IAbout about) {
    _setSingle(cleon.common.doc.spec.doc.chapter.about.AboutPackage.AboutAware_about, about);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public Detailstudy setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Detailstudy setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage> selectDocumentLanguage() {
    return _getList(cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage);
  }

  public Detailstudy setDocumentLanguage(java.util.List<? extends cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage> documentLanguage) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage, documentLanguage);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.IDrivers selectDrivers() {
    return _getSingle(cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.IDrivers.class, cleon.projectmethods.hermes.spec.detailstudy.DetailstudyPackage.Detailstudy_drivers);
  }

  public Detailstudy setDrivers(cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.IDrivers drivers) {
    _setSingle(cleon.projectmethods.hermes.spec.detailstudy.DetailstudyPackage.Detailstudy_drivers, drivers);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluations selectEvaluation() {
    return _getSingle(cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluations.class, cleon.projectmethods.hermes.spec.detailstudy.DetailstudyPackage.Detailstudy_evaluation);
  }

  public Detailstudy setEvaluation(cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluations evaluation) {
    _setSingle(cleon.projectmethods.hermes.spec.detailstudy.DetailstudyPackage.Detailstudy_evaluation, evaluation);
    return this;
  }
    
  @Override
  public cleon.common.glossary.spec.glossary.javamodel.IGlossary selectGlossary() {
    return _getSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary);
  }

  public Detailstudy setGlossary(cleon.common.glossary.spec.glossary.javamodel.IGlossary glossary) {
    _setSingle(cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, glossary);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Detailstudy setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public Detailstudy setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.detailstudy.solutions.javamodel.ISolutions selectSolution() {
    return _getSingle(cleon.projectmethods.hermes.spec.detailstudy.solutions.javamodel.ISolutions.class, cleon.projectmethods.hermes.spec.detailstudy.DetailstudyPackage.Detailstudy_solution);
  }

  public Detailstudy setSolution(cleon.projectmethods.hermes.spec.detailstudy.solutions.javamodel.ISolutions solution) {
    _setSingle(cleon.projectmethods.hermes.spec.detailstudy.DetailstudyPackage.Detailstudy_solution, solution);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public Detailstudy setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Detailstudy setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.IDrivers.class, cleon.projectmethods.hermes.spec.detailstudy.DetailstudyPackage.Detailstudy_drivers, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluations.class, cleon.projectmethods.hermes.spec.detailstudy.DetailstudyPackage.Detailstudy_evaluation, visitor);
    _acceptSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.detailstudy.solutions.javamodel.ISolutions.class, cleon.projectmethods.hermes.spec.detailstudy.DetailstudyPackage.Detailstudy_solution, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.detailstudy.javamodel.IDetailstudy selectToMeDrivers(cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.IDrivers object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.detailstudy.javamodel.IDetailstudy.class, cleon.projectmethods.hermes.spec.detailstudy.DetailstudyPackage.Detailstudy_drivers, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.detailstudy.javamodel.IDetailstudy selectToMeSolution(cleon.projectmethods.hermes.spec.detailstudy.solutions.javamodel.ISolutions object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.detailstudy.javamodel.IDetailstudy.class, cleon.projectmethods.hermes.spec.detailstudy.DetailstudyPackage.Detailstudy_solution, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.detailstudy.javamodel.IDetailstudy selectToMeEvaluation(cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluations object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.detailstudy.javamodel.IDetailstudy.class, cleon.projectmethods.hermes.spec.detailstudy.DetailstudyPackage.Detailstudy_evaluation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c647eff4-3c0e-11e5-9962-cf3035adb922,RgSNFL/e2DuWGvKth1XhYDgfqeg=] */
