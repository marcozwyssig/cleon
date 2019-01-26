package cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OutOfScopes extends DynamicResource implements IOutOfScopes {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOutOfScopes> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOutOfScopes>() {
    
    @Override
    public IOutOfScopes create() {
      return new OutOfScopes();
    }
    
    @Override
    public IOutOfScopes create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OutOfScopes(resourceRepository, resource);
    }
  
  };

  public OutOfScopes() {
    super(IOutOfScopes.TYPE_ID);
  }
  
  public OutOfScopes(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOutOfScopes.TYPE_ID);
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

  public OutOfScopes setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public OutOfScopes setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.javamodel.IOutOfScope> selectOutofscope() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.javamodel.IOutOfScope.class, cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.OutofscopePackage.OutOfScopes_outofscope);
  }

  public OutOfScopes setOutofscope(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.javamodel.IOutOfScope> outofscope) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.OutofscopePackage.OutOfScopes_outofscope, outofscope);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public OutOfScopes setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OutOfScopes setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.javamodel.IOutOfScope.class, cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.OutofscopePackage.OutOfScopes_outofscope, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.javamodel.IOutOfScopes selectToMeOutofscope(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.javamodel.IOutOfScope object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.javamodel.IOutOfScopes.class, cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.OutofscopePackage.OutOfScopes_outofscope, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bed31c81-0e14-11e6-ae01-ef640c578b9b,ZARjk0BfVbHEVAeR3sG2q/1lHHU=] */
