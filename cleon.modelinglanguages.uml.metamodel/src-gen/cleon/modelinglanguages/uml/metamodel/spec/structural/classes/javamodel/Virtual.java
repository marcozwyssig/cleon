package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Virtual extends DynamicResource implements IVirtual {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVirtual> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVirtual>() {
    
    @Override
    public IVirtual create() {
      return new Virtual();
    }
    
    @Override
    public IVirtual create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Virtual(resourceRepository, resource);
    }
  
  };

  public Virtual() {
    super(IVirtual.TYPE_ID);
  }
  
  public Virtual(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVirtual.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectIsVirtual() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.Virtual_isVirtual);
  }
    
  public void setIsVirtual(java.lang.Boolean isVirtual) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.Virtual_isVirtual, isVirtual);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Virtual setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.Virtual_isVirtual, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6c5468ca-356f-11e3-974d-d19f8c167114,FicwfAUyy7ntuaijITapnNCot8g=] */
