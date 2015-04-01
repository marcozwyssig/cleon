package cleon.doc.spec.javamodel;

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
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public OrderedList setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.doc.spec.javamodel.IParagraph.class, cleon.doc.spec.SpecPackage.OrderedList_paragraphs);
  }

  public OrderedList setParagraphs(java.util.List<? extends cleon.doc.spec.javamodel.IParagraph> paragraphs) {
    _setList(cleon.doc.spec.SpecPackage.OrderedList_paragraphs, paragraphs);
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
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.doc.spec.javamodel.IParagraph.class, cleon.doc.spec.SpecPackage.OrderedList_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.doc.spec.javamodel.IOrderedList selectToMeParagraphs(cleon.doc.spec.javamodel.IParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.javamodel.IOrderedList.class, cleon.doc.spec.SpecPackage.OrderedList_paragraphs, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1042ee35-d881-11e4-a5d6-b92b0ce88839,XIQSqRr1lWSpsBTAUtM6jdFTB8M=] */
