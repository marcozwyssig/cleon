package cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel;

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
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.AbstractChapter_chapters);
  }

  public Readme setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.AbstractChapter_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.ICopyright selectCopyright() {
    return _getSingle(cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.ICopyright.class, cleon.publishing.collaboration.spec.sda.manuals.readme.ReadmePackage.Readme_copyright);
  }

  public Readme setCopyright(cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.ICopyright copyright) {
    _setSingle(cleon.publishing.collaboration.spec.sda.manuals.readme.ReadmePackage.Readme_copyright, copyright);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Readme setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IGettingStarted selectGettingStarted() {
    return _getSingle(cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IGettingStarted.class, cleon.publishing.collaboration.spec.sda.manuals.readme.ReadmePackage.Readme_gettingStarted);
  }

  public Readme setGettingStarted(cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IGettingStarted gettingStarted) {
    _setSingle(cleon.publishing.collaboration.spec.sda.manuals.readme.ReadmePackage.Readme_gettingStarted, gettingStarted);
    return this;
  }
    
  @Override
  public cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IIntroduction selectIntroduction() {
    return _getSingle(cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IIntroduction.class, cleon.publishing.collaboration.spec.sda.manuals.readme.ReadmePackage.Readme_introduction);
  }

  public Readme setIntroduction(cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IIntroduction introduction) {
    _setSingle(cleon.publishing.collaboration.spec.sda.manuals.readme.ReadmePackage.Readme_introduction, introduction);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_noParagraphs);
  }

  public Readme setNoParagraphs(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Readme setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public Readme setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IRequirements selectRequirements() {
    return _getSingle(cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IRequirements.class, cleon.publishing.collaboration.spec.sda.manuals.readme.ReadmePackage.Readme_requirements);
  }

  public Readme setRequirements(cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IRequirements requirements) {
    _setSingle(cleon.publishing.collaboration.spec.sda.manuals.readme.ReadmePackage.Readme_requirements, requirements);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public Readme setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
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
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.AbstractChapter_chapters, visitor);
    _acceptSingle(cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.ICopyright.class, cleon.publishing.collaboration.spec.sda.manuals.readme.ReadmePackage.Readme_copyright, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IGettingStarted.class, cleon.publishing.collaboration.spec.sda.manuals.readme.ReadmePackage.Readme_gettingStarted, visitor);
    _acceptSingle(cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IIntroduction.class, cleon.publishing.collaboration.spec.sda.manuals.readme.ReadmePackage.Readme_introduction, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_noParagraphs, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IRequirements.class, cleon.publishing.collaboration.spec.sda.manuals.readme.ReadmePackage.Readme_requirements, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IReadme selectToMeIntroduction(cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IIntroduction object) {
    return _getToMeSingle(object.getRepository(), cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IReadme.class, cleon.publishing.collaboration.spec.sda.manuals.readme.ReadmePackage.Readme_introduction, object.getResource());
  }
  
  public static cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IReadme selectToMeRequirements(cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IRequirements object) {
    return _getToMeSingle(object.getRepository(), cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IReadme.class, cleon.publishing.collaboration.spec.sda.manuals.readme.ReadmePackage.Readme_requirements, object.getResource());
  }
  
  public static cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IReadme selectToMeGettingStarted(cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IGettingStarted object) {
    return _getToMeSingle(object.getRepository(), cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IReadme.class, cleon.publishing.collaboration.spec.sda.manuals.readme.ReadmePackage.Readme_gettingStarted, object.getResource());
  }
  
  public static cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IReadme selectToMeCopyright(cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.ICopyright object) {
    return _getToMeSingle(object.getRepository(), cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IReadme.class, cleon.publishing.collaboration.spec.sda.manuals.readme.ReadmePackage.Readme_copyright, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7f35fd79-4e6b-11e5-b08e-673a0d02fb08,wCZL7R4NRwD79rS4xPJuMUTcbxc=] */
