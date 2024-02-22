package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RealmDependent extends DynamicResource implements IRealmDependent {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRealmDependent> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRealmDependent>() {
    
    @Override
    public IRealmDependent create() {
      return new RealmDependent();
    }
    
    @Override
    public IRealmDependent create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RealmDependent(resourceRepository, resource);
    }
  
  };

  public RealmDependent() {
    super(IRealmDependent.TYPE_ID);
  }
  
  public RealmDependent(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRealmDependent.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConnection selectBasedOn() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConnection.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.RealmDependent_basedOn);
  }

  public RealmDependent setBasedOn(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConnection basedOn) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.RealmDependent_basedOn, basedOn);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration selectRealmForComponent() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.AbstractRealmHandlers_realmForComponent);
  }

  public RealmDependent setRealmForComponent(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration realmForComponent) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.AbstractRealmHandlers_realmForComponent, realmForComponent);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RealmDependent setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RealmDependent setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConnection.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.RealmDependent_basedOn, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.AbstractRealmHandlers_realmForComponent, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmDependent> selectToMeBasedOn(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConnection object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmDependent.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage.RealmDependent_basedOn, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,de1dc42e-fd8d-11ea-8a95-19b98046e6db,5LopxKZXsGsjytFYIeQ08c3vFOk=] */
