package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NoRealmConfiguration extends DynamicResource implements INoRealmConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INoRealmConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INoRealmConfiguration>() {
    
    @Override
    public INoRealmConfiguration create() {
      return new NoRealmConfiguration();
    }
    
    @Override
    public INoRealmConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NoRealmConfiguration(resourceRepository, resource);
    }
  
  };

  public NoRealmConfiguration() {
    super(INoRealmConfiguration.TYPE_ID);
  }
  
  public NoRealmConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INoRealmConfiguration.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.util.List<java.lang.String> selectMandatoryDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions);
  }
    
  public void setMandatoryDescriptions(java.util.List<java.lang.String> mandatoryDescriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, mandatoryDescriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.util.List<java.lang.String> selectStandardDescription() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.AuthnPackage.RealmConfiguration_standardDescription);
  }
    
  public void setStandardDescription(java.util.List<java.lang.String> standardDescription) {
     _setListAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.AuthnPackage.RealmConfiguration_standardDescription, standardDescription);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NoRealmConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.AuthnPackage.RealmConfiguration_standardDescription, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1fd34918-fd76-11ea-ab46-e355b3ca0d5e,lxLHnLfKmwfrVa9UrsFIoF5ltPg=] */
