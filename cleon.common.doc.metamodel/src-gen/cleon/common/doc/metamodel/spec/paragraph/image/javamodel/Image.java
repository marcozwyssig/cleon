package cleon.common.doc.metamodel.spec.paragraph.image.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Image extends DynamicResource implements IImage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImage>() {
    
    @Override
    public IImage create() {
      return new Image();
    }
    
    @Override
    public IImage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Image(resourceRepository, resource);
    }
  
  };

  public Image() {
    super(IImage.TYPE_ID);
  }
  
  public Image(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImage.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectImg() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.paragraph.image.ImagePackage.ImgAware_img);
  }
    
  public void setImg(java.lang.String img) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.paragraph.image.ImagePackage.ImgAware_img, img);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
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
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements);
  }

  public Image setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Image setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.paragraph.image.ImagePackage.ImgAware_img, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b70b7970-15e7-11e6-b588-912e2ce0f2b0,rvV/1T+x9KUnCokpVFXZR0QSnPY=] */
