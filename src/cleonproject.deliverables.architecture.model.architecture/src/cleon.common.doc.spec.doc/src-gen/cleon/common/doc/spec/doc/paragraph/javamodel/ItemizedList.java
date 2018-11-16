package cleon.common.doc.spec.doc.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ItemizedList extends DynamicResource implements IItemizedList {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IItemizedList> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IItemizedList>() {
    
    @Override
    public IItemizedList create() {
      return new ItemizedList();
    }
    
    @Override
    public IItemizedList create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ItemizedList(resourceRepository, resource);
    }
  
  };

  public ItemizedList() {
    super(IItemizedList.TYPE_ID);
  }
  
  public ItemizedList(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IItemizedList.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ItemizedList setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ItemizedList setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f18903b6-e8f5-11e8-b810-cdb2b421fd42,Rbr8O0xLa6pYbp9AMGp2/CzH90s=] */