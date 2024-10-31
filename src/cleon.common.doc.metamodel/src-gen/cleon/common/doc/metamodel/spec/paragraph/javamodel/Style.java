package cleon.common.doc.metamodel.spec.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Style extends DynamicResource implements IStyle {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStyle> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStyle>() {
    
    @Override
    public IStyle create() {
      return new Style();
    }
    
    @Override
    public IStyle create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Style(resourceRepository, resource);
    }
  
  };

  public Style() {
    super(IStyle.TYPE_ID);
  }
  
  public Style(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStyle.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Style setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isBold()) return visitor.visitBold();
    if (isItalic()) return visitor.visitItalic();
    if (isUnderline()) return visitor.visitUnderline();
    if (isStriketrough()) return visitor.visitStriketrough();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isBold()) {
      visitor.visitBold();
      return;
    }
    if (isItalic()) {
      visitor.visitItalic();
      return;
    }
    if (isUnderline()) {
      visitor.visitUnderline();
      return;
    }
    if (isStriketrough()) {
      visitor.visitStriketrough();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isBold() {
    return getResource().equals(cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.Style_Bold);
  }
  
  @Override
  public boolean isItalic() {
    return getResource().equals(cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.Style_Italic);
  }
  
  @Override
  public boolean isUnderline() {
    return getResource().equals(cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.Style_Underline);
  }
  
  @Override
  public boolean isStriketrough() {
    return getResource().equals(cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.Style_Striketrough);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6d04db3c-dcb4-11ea-b5f8-77c3980a1d0a,lGBhK/y03rb/tUtZJsQ7naYNuPU=] */
