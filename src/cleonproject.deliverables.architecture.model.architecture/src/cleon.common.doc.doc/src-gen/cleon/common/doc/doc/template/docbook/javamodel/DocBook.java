package cleon.common.doc.doc.template.docbook.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DocBook extends DynamicResource implements IDocBook {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDocBook> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDocBook>() {
    
    @Override
    public IDocBook create() {
      return new DocBook();
    }
    
    @Override
    public IDocBook create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DocBook(resourceRepository, resource);
    }
  
  };

  public DocBook() {
    super(IDocBook.TYPE_ID);
  }
  
  public DocBook(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDocBook.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DocBook setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a5821edc-2235-11e9-a054-db6d80fba790,i87KxE9B/PCtw56UumMcR9cFb1s=] */
