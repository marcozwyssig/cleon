package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RealmConfigurationUsage extends DynamicResource implements IRealmConfigurationUsage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRealmConfigurationUsage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRealmConfigurationUsage>() {
    
    @Override
    public IRealmConfigurationUsage create() {
      return new RealmConfigurationUsage();
    }
    
    @Override
    public IRealmConfigurationUsage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RealmConfigurationUsage(resourceRepository, resource);
    }
  
  };

  public RealmConfigurationUsage() {
    super(IRealmConfigurationUsage.TYPE_ID);
  }
  
  public RealmConfigurationUsage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRealmConfigurationUsage.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConfiguration selectDirectoryService() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.RealmConfigurationUsage_directoryService);
  }

  public RealmConfigurationUsage setDirectoryService(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConfiguration directoryService) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.RealmConfigurationUsage_directoryService, directoryService);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RealmConfigurationUsage setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RealmConfigurationUsage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.RealmConfigurationUsage_directoryService, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConfigurationUsage> selectToMeDirectoryService(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConfigurationUsage.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.RealmConfigurationUsage_directoryService, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,67bf2569-e6c4-11ea-92fa-2db17cc89b0c,kcAyVuTcjYFfipwQbFntRg0LNw4=] */
