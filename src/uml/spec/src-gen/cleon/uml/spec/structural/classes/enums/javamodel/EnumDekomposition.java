package cleon.uml.spec.structural.classes.enums.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EnumDekomposition extends DynamicResource implements IEnumDekomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnumDekomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnumDekomposition>() {
    
    @Override
    public IEnumDekomposition create() {
      return new EnumDekomposition();
    }
    
    @Override
    public IEnumDekomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EnumDekomposition(resourceRepository, resource);
    }
  
  };

  public EnumDekomposition() {
    super(IEnumDekomposition.TYPE_ID);
  }
  
  public EnumDekomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEnumDekomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public EnumDekomposition setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph> selectDescription() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph.class, cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description);
  }

  public EnumDekomposition setDescription(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph> description) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description, description);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.enums.javamodel.IEnum selectInto() {
    return _getSingle(cleon.uml.spec.structural.classes.enums.javamodel.IEnum.class, cleon.uml.spec.structural.classes.enums.EnumsPackage.EnumDekomposition_into);
  }

  public EnumDekomposition setInto(cleon.uml.spec.structural.classes.enums.javamodel.IEnum into) {
    _setSingle(cleon.uml.spec.structural.classes.enums.EnumsPackage.EnumDekomposition_into, into);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public EnumDekomposition setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public EnumDekomposition setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public EnumDekomposition setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EnumDekomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph.class, cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.enums.javamodel.IEnum.class, cleon.uml.spec.structural.classes.enums.EnumsPackage.EnumDekomposition_into, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.uml.spec.structural.classes.enums.javamodel.IEnumDekomposition selectToMeInto(cleon.uml.spec.structural.classes.enums.javamodel.IEnum object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.structural.classes.enums.javamodel.IEnumDekomposition.class, cleon.uml.spec.structural.classes.enums.EnumsPackage.EnumDekomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,42edd90e-266e-11e5-95dc-8f1cdbd9db54,XMFRnBJsUq8OhBOr1BUARxLd9/c=] */
