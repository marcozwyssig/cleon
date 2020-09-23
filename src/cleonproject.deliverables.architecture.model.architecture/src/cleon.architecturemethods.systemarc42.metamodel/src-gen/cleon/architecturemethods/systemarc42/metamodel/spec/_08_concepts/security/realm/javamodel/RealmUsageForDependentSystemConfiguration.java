package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RealmUsageForDependentSystemConfiguration extends DynamicResource implements IRealmUsageForDependentSystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRealmUsageForDependentSystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRealmUsageForDependentSystemConfiguration>() {
    
    @Override
    public IRealmUsageForDependentSystemConfiguration create() {
      return new RealmUsageForDependentSystemConfiguration();
    }
    
    @Override
    public IRealmUsageForDependentSystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RealmUsageForDependentSystemConfiguration(resourceRepository, resource);
    }
  
  };

  public RealmUsageForDependentSystemConfiguration() {
    super(IRealmUsageForDependentSystemConfiguration.TYPE_ID);
  }
  
  public RealmUsageForDependentSystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRealmUsageForDependentSystemConfiguration.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectRealmForDependentSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.RealmPackage.AbstractRealmForDependentSystemConfiguration_realmForDependentSystemConfiguration);
  }

  public RealmUsageForDependentSystemConfiguration setRealmForDependentSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration realmForDependentSystemConfiguration) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.RealmPackage.AbstractRealmForDependentSystemConfiguration_realmForDependentSystemConfiguration, realmForDependentSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RealmUsageForDependentSystemConfiguration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RealmUsageForDependentSystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmConfigurationUsage> selectUsage() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmConfigurationUsage.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.RealmPackage.RealmUsageForDependentSystemConfiguration_usage);
  }

  public RealmUsageForDependentSystemConfiguration setUsage(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmConfigurationUsage> usage) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.RealmPackage.RealmUsageForDependentSystemConfiguration_usage, usage);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.RealmPackage.AbstractRealmForDependentSystemConfiguration_realmForDependentSystemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmConfigurationUsage.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.RealmPackage.RealmUsageForDependentSystemConfiguration_usage, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmUsageForDependentSystemConfiguration selectToMeUsage(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmConfigurationUsage object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmUsageForDependentSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.RealmPackage.RealmUsageForDependentSystemConfiguration_usage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9ea1f053-fd82-11ea-b638-e1cc8a02b192,49C8WMWZGUSDvABUXBFCNNLJ0gE=] */
