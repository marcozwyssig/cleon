package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.manual.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class KeyValueConfiguration extends DynamicResource implements IKeyValueConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IKeyValueConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IKeyValueConfiguration>() {
    
    @Override
    public IKeyValueConfiguration create() {
      return new KeyValueConfiguration();
    }
    
    @Override
    public IKeyValueConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new KeyValueConfiguration(resourceRepository, resource);
    }
  
  };

  public KeyValueConfiguration() {
    super(IKeyValueConfiguration.TYPE_ID);
  }
  
  public KeyValueConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IKeyValueConfiguration.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.util.List<java.lang.String> selectValues() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.manual.ManualPackage.KeyValueConfiguration_values);
  }
    
  public void setValues(java.util.List<java.lang.String> values) {
     _setListAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.manual.ManualPackage.KeyValueConfiguration_values, values);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public KeyValueConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.manual.ManualPackage.KeyValueConfiguration_values, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1c079f76-112c-11f0-a4f9-b5f995a9e0fe,Sp8XTINdSsyCEsfKBFMgXJG8fk8=] */
