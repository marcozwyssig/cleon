package cleon.slides.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Slides extends DynamicResource implements ISlides {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISlides> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISlides>() {
    
    @Override
    public ISlides create() {
      return new Slides();
    }
    
    @Override
    public ISlides create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Slides(resourceRepository, resource);
    }
  
  };

  public Slides() {
    super(ISlides.TYPE_ID);
  }
  
  public Slides(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISlides.TYPE_ID);
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

  public Slides setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d0034f80-4074-11e5-b5f0-5b1ce9c3de3e,j429RiAxe3CHWtgY3HpXsmKbCUk=] */
