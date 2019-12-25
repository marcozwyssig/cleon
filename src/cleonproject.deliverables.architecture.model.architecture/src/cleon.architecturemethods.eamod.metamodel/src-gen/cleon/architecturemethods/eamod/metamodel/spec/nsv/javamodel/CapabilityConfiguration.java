package cleon.architecturemethods.eamod.metamodel.spec.nsv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CapabilityConfiguration extends DynamicResource implements ICapabilityConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapabilityConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapabilityConfiguration>() {
    
    @Override
    public ICapabilityConfiguration create() {
      return new CapabilityConfiguration();
    }
    
    @Override
    public ICapabilityConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CapabilityConfiguration(resourceRepository, resource);
    }
  
  };

  public CapabilityConfiguration() {
    super(ICapabilityConfiguration.TYPE_ID);
  }
  
  public CapabilityConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICapabilityConfiguration.TYPE_ID);
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

  public CapabilityConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,19f720d6-818c-11e7-9507-01b75489c44b,pdnbWfEfFXi+ms1FFXe0IsZXU2M=] */
