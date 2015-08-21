package cleon.doc.spec.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NumberedList extends DynamicResource implements INumberedList {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INumberedList> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INumberedList>() {
    
    @Override
    public INumberedList create() {
      return new NumberedList();
    }
    
    @Override
    public INumberedList create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NumberedList(resourceRepository, resource);
    }
  
  };

  public NumberedList() {
    super(INumberedList.TYPE_ID);
  }
  
  public NumberedList(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INumberedList.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public NumberedList setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.NumberedList_paragraphs);
  }

  public NumberedList setParagraphs(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.NumberedList_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NumberedList setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.NumberedList_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.doc.spec.paragraph.javamodel.INumberedList selectToMeParagraphs(cleon.doc.spec.paragraph.javamodel.IParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.paragraph.javamodel.INumberedList.class, cleon.doc.spec.paragraph.ParagraphPackage.NumberedList_paragraphs, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1042ee35-d881-11e4-a5d6-b92b0ce88839,E2UA+L4lrb/QsCep41LMoEM+fP4=] */
