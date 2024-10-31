package cleon.common.resources.metamodel.spec.image.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ImageType extends DynamicResource implements IImageType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImageType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImageType>() {
    
    @Override
    public IImageType create() {
      return new ImageType();
    }
    
    @Override
    public IImageType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ImageType(resourceRepository, resource);
    }
  
  };

  public ImageType() {
    super(IImageType.TYPE_ID);
  }
  
  public ImageType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImageType.TYPE_ID);
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

  public ImageType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isGIF()) return visitor.visitGIF();
    if (isSVG()) return visitor.visitSVG();
    if (isPNG()) return visitor.visitPNG();
    if (isJPG()) return visitor.visitJPG();
    if (isBMP()) return visitor.visitBMP();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isGIF()) {
      visitor.visitGIF();
      return;
    }
    if (isSVG()) {
      visitor.visitSVG();
      return;
    }
    if (isPNG()) {
      visitor.visitPNG();
      return;
    }
    if (isJPG()) {
      visitor.visitJPG();
      return;
    }
    if (isBMP()) {
      visitor.visitBMP();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isGIF() {
    return getResource().equals(cleon.common.resources.metamodel.spec.image.ImagePackage.ImageType_GIF);
  }
  
  @Override
  public boolean isSVG() {
    return getResource().equals(cleon.common.resources.metamodel.spec.image.ImagePackage.ImageType_SVG);
  }
  
  @Override
  public boolean isPNG() {
    return getResource().equals(cleon.common.resources.metamodel.spec.image.ImagePackage.ImageType_PNG);
  }
  
  @Override
  public boolean isJPG() {
    return getResource().equals(cleon.common.resources.metamodel.spec.image.ImagePackage.ImageType_JPG);
  }
  
  @Override
  public boolean isBMP() {
    return getResource().equals(cleon.common.resources.metamodel.spec.image.ImagePackage.ImageType_BMP);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,afb720af-afdf-11e5-a548-13e054f2d74f,iMwHnZU9T+GMiDp+8SSuxx6geAA=] */
