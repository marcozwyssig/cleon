package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.property.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Property extends DynamicResource implements IProperty {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProperty> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProperty>() {
    
    @Override
    public IProperty create() {
      return new Property();
    }
    
    @Override
    public IProperty create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Property(resourceRepository, resource);
    }
  
  };

  public Property() {
    super(IProperty.TYPE_ID);
  }
  
  public Property(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProperty.TYPE_ID);
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

  public Property setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6e5e3bcd-d574-11e5-89ea-2d8d86e9ef89,6Tofxnfqiof9r8cM21g5tGd50SI=] */
