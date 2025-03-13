package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class GenericAttrValue extends DynamicResource implements IGenericAttrValue {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGenericAttrValue> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGenericAttrValue>() {
    
    @Override
    public IGenericAttrValue create() {
      return new GenericAttrValue();
    }
    
    @Override
    public IGenericAttrValue create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new GenericAttrValue(resourceRepository, resource);
    }
  
  };

  public GenericAttrValue() {
    super(IGenericAttrValue.TYPE_ID);
  }
  
  public GenericAttrValue(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGenericAttrValue.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectAttribute() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.GenericPackage.GenericAttrValue_attribute);
  }
    
  public void setAttribute(java.lang.String attribute) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.GenericPackage.GenericAttrValue_attribute, attribute);
  }

  @Override
  public java.lang.String selectValue() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.GenericPackage.GenericAttrValue_value);
  }
    
  public void setValue(java.lang.String value) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.GenericPackage.GenericAttrValue_value, value);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public GenericAttrValue setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.GenericPackage.GenericAttrValue_attribute, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.generic.GenericPackage.GenericAttrValue_value, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b448b479-ef3c-11e8-be8a-b748ff8f0a75,Ef2frlv11x3dM1xnYkVTWTqwVfM=] */
