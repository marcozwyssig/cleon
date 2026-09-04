package cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Installation_Manual_Dependency extends DynamicResource implements IInstallation_Manual_Dependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInstallation_Manual_Dependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInstallation_Manual_Dependency>() {
    
    @Override
    public IInstallation_Manual_Dependency create() {
      return new Installation_Manual_Dependency();
    }
    
    @Override
    public IInstallation_Manual_Dependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Installation_Manual_Dependency(resourceRepository, resource);
    }
  
  };

  public Installation_Manual_Dependency() {
    super(IInstallation_Manual_Dependency.TYPE_ID);
  }
  
  public Installation_Manual_Dependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInstallation_Manual_Dependency.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectInstallationManualDependencyWithSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Installation_aE_Manual_aE_Dependency_installationManualDependencyWithSystemConfiguration);
  }

  public Installation_Manual_Dependency setInstallationManualDependencyWithSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration installationManualDependencyWithSystemConfiguration) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Installation_aE_Manual_aE_Dependency_installationManualDependencyWithSystemConfiguration, installationManualDependencyWithSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Installation_Manual_Dependency setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Installation_Manual_Dependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Installation_aE_Manual_aE_Dependency_installationManualDependencyWithSystemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IInstallation_Manual_Dependency> selectToMeInstallationManualDependencyWithSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IInstallation_Manual_Dependency.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Installation_aE_Manual_aE_Dependency_installationManualDependencyWithSystemConfiguration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,11dae4dc-9546-11ec-9b36-7d300415c806,GeQJavtesOlcX3iad+Hi4uGkjjQ=] */
