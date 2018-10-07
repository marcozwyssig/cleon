package cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Obsolete extends DynamicResource implements IObsolete {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IObsolete> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IObsolete>() {
    
    @Override
    public IObsolete create() {
      return new Obsolete();
    }
    
    @Override
    public IObsolete create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Obsolete(resourceRepository, resource);
    }
  
  };

  public Obsolete() {
    super(IObsolete.TYPE_ID);
  }
  
  public Obsolete(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IObsolete.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectIsObsolete() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Obsolete_isObsolete);
  }
    
  public void setIsObsolete(java.lang.Boolean isObsolete) {
     _setSingleAttribute(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Obsolete_isObsolete, isObsolete);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Obsolete setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Obsolete_isObsolete, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,30ee3914-356e-11e3-974d-d19f8c167114,Ag9dLRf3nhuh6glbtkFn7hEkfw0=] */
