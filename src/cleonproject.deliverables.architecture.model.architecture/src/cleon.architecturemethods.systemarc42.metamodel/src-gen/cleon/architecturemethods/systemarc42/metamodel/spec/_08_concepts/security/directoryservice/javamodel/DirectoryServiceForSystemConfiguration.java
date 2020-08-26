package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DirectoryServiceForSystemConfiguration extends DynamicResource implements IDirectoryServiceForSystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDirectoryServiceForSystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDirectoryServiceForSystemConfiguration>() {
    
    @Override
    public IDirectoryServiceForSystemConfiguration create() {
      return new DirectoryServiceForSystemConfiguration();
    }
    
    @Override
    public IDirectoryServiceForSystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DirectoryServiceForSystemConfiguration(resourceRepository, resource);
    }
  
  };

  public DirectoryServiceForSystemConfiguration() {
    super(IDirectoryServiceForSystemConfiguration.TYPE_ID);
  }
  
  public DirectoryServiceForSystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDirectoryServiceForSystemConfiguration.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectDirectoryServiceForSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceForSystemConfiguration_directoryServiceForSystemConfiguration);
  }

  public DirectoryServiceForSystemConfiguration setDirectoryServiceForSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration directoryServiceForSystemConfiguration) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceForSystemConfiguration_directoryServiceForSystemConfiguration, directoryServiceForSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DirectoryServiceForSystemConfiguration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DirectoryServiceForSystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceUsage> selectUsage() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceUsage.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceForSystemConfiguration_usage);
  }

  public DirectoryServiceForSystemConfiguration setUsage(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceUsage> usage) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceForSystemConfiguration_usage, usage);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceForSystemConfiguration_directoryServiceForSystemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceUsage.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceForSystemConfiguration_usage, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceForSystemConfiguration> selectToMeDirectoryServiceForSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceForSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceForSystemConfiguration_directoryServiceForSystemConfiguration, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceForSystemConfiguration selectToMeUsage(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceUsage object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceForSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceForSystemConfiguration_usage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dd9ead87-7e62-11ea-9262-7b7e0e9cb204,lVEw49ulgHoLKp58wRwfjzAzyQQ=] */
