package cleon.doc.spec.chapter.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OrderedList extends DynamicResource implements IOrderedList {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrderedList> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrderedList>() {
    
    @Override
    public IOrderedList create() {
      return new OrderedList();
    }
    
    @Override
    public IOrderedList create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OrderedList(resourceRepository, resource);
    }
  
  };

  public OrderedList() {
    super(IOrderedList.TYPE_ID);
  }
  
  public OrderedList(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOrderedList.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public OrderedList setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.paragraph.ParagraphPackage.OrderedList_paragraphs);
  }

  public OrderedList setParagraphs(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.doc.spec.chapter.paragraph.ParagraphPackage.OrderedList_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OrderedList setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.paragraph.ParagraphPackage.OrderedList_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.doc.spec.chapter.paragraph.javamodel.IOrderedList selectToMeParagraphs(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.chapter.paragraph.javamodel.IOrderedList.class, cleon.doc.spec.chapter.paragraph.ParagraphPackage.OrderedList_paragraphs, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1042ee35-d881-11e4-a5d6-b92b0ce88839,bVMEGSdD5QBrF7O5Fij3Dnvr9z4=] */
