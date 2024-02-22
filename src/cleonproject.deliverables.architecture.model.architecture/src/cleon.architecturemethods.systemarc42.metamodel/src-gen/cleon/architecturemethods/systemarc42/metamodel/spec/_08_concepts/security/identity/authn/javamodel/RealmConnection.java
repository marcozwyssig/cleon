package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RealmConnection extends DynamicResource implements IRealmConnection {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRealmConnection> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRealmConnection>() {
    
    @Override
    public IRealmConnection create() {
      return new RealmConnection();
    }
    
    @Override
    public IRealmConnection create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RealmConnection(resourceRepository, resource);
    }
  
  };

  public RealmConnection() {
    super(IRealmConnection.TYPE_ID);
  }
  
  public RealmConnection(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRealmConnection.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration selectRealmForComponent() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.AbstractRealmHandlers_realmForComponent);
  }

  public RealmConnection setRealmForComponent(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration realmForComponent) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.AbstractRealmHandlers_realmForComponent, realmForComponent);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RealmConnection setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RealmConnection setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConfigurationUsage> selectUsage() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConfigurationUsage.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.RealmConnection_usage);
  }

  public RealmConnection setUsage(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConfigurationUsage> usage) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.RealmConnection_usage, usage);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.AbstractRealmHandlers_realmForComponent, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConfigurationUsage.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.RealmConnection_usage, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConnection selectToMeUsage(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConfigurationUsage object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConnection.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.RealmConnection_usage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9ea1f053-fd82-11ea-b638-e1cc8a02b192,MtbheXPEm0vBRWo+EfdaCbMOnXw=] */
