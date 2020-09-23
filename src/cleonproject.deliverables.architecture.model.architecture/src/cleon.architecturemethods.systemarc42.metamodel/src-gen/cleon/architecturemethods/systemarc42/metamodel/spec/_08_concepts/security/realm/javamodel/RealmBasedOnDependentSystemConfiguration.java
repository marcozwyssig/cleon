package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RealmBasedOnDependentSystemConfiguration extends DynamicResource implements IRealmBasedOnDependentSystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRealmBasedOnDependentSystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRealmBasedOnDependentSystemConfiguration>() {
    
    @Override
    public IRealmBasedOnDependentSystemConfiguration create() {
      return new RealmBasedOnDependentSystemConfiguration();
    }
    
    @Override
    public IRealmBasedOnDependentSystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RealmBasedOnDependentSystemConfiguration(resourceRepository, resource);
    }
  
  };

  public RealmBasedOnDependentSystemConfiguration() {
    super(IRealmBasedOnDependentSystemConfiguration.TYPE_ID);
  }
  
  public RealmBasedOnDependentSystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRealmBasedOnDependentSystemConfiguration.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmUsageForDependentSystemConfiguration selectBasedOn() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmUsageForDependentSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.RealmPackage.RealmBasedOnDependentSystemConfiguration_basedOn);
  }

  public RealmBasedOnDependentSystemConfiguration setBasedOn(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmUsageForDependentSystemConfiguration basedOn) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.RealmPackage.RealmBasedOnDependentSystemConfiguration_basedOn, basedOn);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectRealmForDependentSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.RealmPackage.AbstractRealmForDependentSystemConfiguration_realmForDependentSystemConfiguration);
  }

  public RealmBasedOnDependentSystemConfiguration setRealmForDependentSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration realmForDependentSystemConfiguration) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.RealmPackage.AbstractRealmForDependentSystemConfiguration_realmForDependentSystemConfiguration, realmForDependentSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RealmBasedOnDependentSystemConfiguration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RealmBasedOnDependentSystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmUsageForDependentSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.RealmPackage.RealmBasedOnDependentSystemConfiguration_basedOn, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.RealmPackage.AbstractRealmForDependentSystemConfiguration_realmForDependentSystemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmBasedOnDependentSystemConfiguration> selectToMeBasedOn(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmUsageForDependentSystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmBasedOnDependentSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.RealmPackage.RealmBasedOnDependentSystemConfiguration_basedOn, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,de1dc42e-fd8d-11ea-8a95-19b98046e6db,OwK5M0vKEHSNEc2z7HwDVv7Wgsg=] */
