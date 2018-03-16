package cleon.common.doc.spec.doc.document.style.javamodel;

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
  public java.lang.String selectContent() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.style.StylePackage.Style_content);
  }
    
  public void setContent(java.lang.String content) {
     _setSingleAttribute(cleon.common.doc.spec.doc.document.style.StylePackage.Style_content, content);
  }

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
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.style.StylePackage.Style_content, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4fd40595-47f6-11e5-a18e-994cfeeeb1be,YU+WgQrSumuL+iahJKE7vG9LeuM=] */
