package cleon.sda.spec.manuals.readme.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Readme extends DynamicResource implements IReadme {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IReadme> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IReadme>() {
    
    @Override
    public IReadme create() {
      return new Readme();
    }
    
    @Override
    public IReadme create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Readme(resourceRepository, resource);
    }
  
  };

  public Readme() {
    super(IReadme.TYPE_ID);
  }
  
  public Readme(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IReadme.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Readme setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.sda.spec.manuals.readme.javamodel.ICopyright selectCopyright() {
    return _getSingle(cleon.sda.spec.manuals.readme.javamodel.ICopyright.class, cleon.sda.spec.manuals.readme.ReadmePackage.Readme_copyright);
  }

  public Readme setCopyright(cleon.sda.spec.manuals.readme.javamodel.ICopyright copyright) {
    _setSingle(cleon.sda.spec.manuals.readme.ReadmePackage.Readme_copyright, copyright);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public Readme setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public cleon.sda.spec.manuals.readme.javamodel.IGettingStarted selectGettingStarted() {
    return _getSingle(cleon.sda.spec.manuals.readme.javamodel.IGettingStarted.class, cleon.sda.spec.manuals.readme.ReadmePackage.Readme_gettingStarted);
  }

  public Readme setGettingStarted(cleon.sda.spec.manuals.readme.javamodel.IGettingStarted gettingStarted) {
    _setSingle(cleon.sda.spec.manuals.readme.ReadmePackage.Readme_gettingStarted, gettingStarted);
    return this;
  }
    
  @Override
  public cleon.sda.spec.manuals.readme.javamodel.IIntroduction selectIntroduction() {
    return _getSingle(cleon.sda.spec.manuals.readme.javamodel.IIntroduction.class, cleon.sda.spec.manuals.readme.ReadmePackage.Readme_introduction);
  }

  public Readme setIntroduction(cleon.sda.spec.manuals.readme.javamodel.IIntroduction introduction) {
    _setSingle(cleon.sda.spec.manuals.readme.ReadmePackage.Readme_introduction, introduction);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Readme setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Readme setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.sda.spec.manuals.readme.javamodel.IRequirements selectRequirements() {
    return _getSingle(cleon.sda.spec.manuals.readme.javamodel.IRequirements.class, cleon.sda.spec.manuals.readme.ReadmePackage.Readme_requirements);
  }

  public Readme setRequirements(cleon.sda.spec.manuals.readme.javamodel.IRequirements requirements) {
    _setSingle(cleon.sda.spec.manuals.readme.ReadmePackage.Readme_requirements, requirements);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style);
  }

  public Readme setStyle(cleon.doc.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Readme setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public Readme setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptSingle(cleon.sda.spec.manuals.readme.javamodel.ICopyright.class, cleon.sda.spec.manuals.readme.ReadmePackage.Readme_copyright, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptSingle(cleon.sda.spec.manuals.readme.javamodel.IGettingStarted.class, cleon.sda.spec.manuals.readme.ReadmePackage.Readme_gettingStarted, visitor);
    _acceptSingle(cleon.sda.spec.manuals.readme.javamodel.IIntroduction.class, cleon.sda.spec.manuals.readme.ReadmePackage.Readme_introduction, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.sda.spec.manuals.readme.javamodel.IRequirements.class, cleon.sda.spec.manuals.readme.ReadmePackage.Readme_requirements, visitor);
    _acceptSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.manuals.readme.javamodel.IReadme selectToMeIntroduction(cleon.sda.spec.manuals.readme.javamodel.IIntroduction object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.manuals.readme.javamodel.IReadme.class, cleon.sda.spec.manuals.readme.ReadmePackage.Readme_introduction, object.getResource());
  }
  
  public static cleon.sda.spec.manuals.readme.javamodel.IReadme selectToMeRequirements(cleon.sda.spec.manuals.readme.javamodel.IRequirements object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.manuals.readme.javamodel.IReadme.class, cleon.sda.spec.manuals.readme.ReadmePackage.Readme_requirements, object.getResource());
  }
  
  public static cleon.sda.spec.manuals.readme.javamodel.IReadme selectToMeGettingStarted(cleon.sda.spec.manuals.readme.javamodel.IGettingStarted object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.manuals.readme.javamodel.IReadme.class, cleon.sda.spec.manuals.readme.ReadmePackage.Readme_gettingStarted, object.getResource());
  }
  
  public static cleon.sda.spec.manuals.readme.javamodel.IReadme selectToMeCopyright(cleon.sda.spec.manuals.readme.javamodel.ICopyright object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.manuals.readme.javamodel.IReadme.class, cleon.sda.spec.manuals.readme.ReadmePackage.Readme_copyright, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7f35fd79-4e6b-11e5-b08e-673a0d02fb08,1PH6nbwUM/JcPM5wbr6v2LMtciQ=] */
