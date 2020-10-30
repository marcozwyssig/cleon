package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemConfigurationAccessTo extends DynamicResource implements ISystemConfigurationAccessTo {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemConfigurationAccessTo> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemConfigurationAccessTo>() {
    
    @Override
    public ISystemConfigurationAccessTo create() {
      return new SystemConfigurationAccessTo();
    }
    
    @Override
    public ISystemConfigurationAccessTo create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemConfigurationAccessTo(resourceRepository, resource);
    }
  
  };

  public SystemConfigurationAccessTo() {
    super(ISystemConfigurationAccessTo.TYPE_ID);
  }
  
  public SystemConfigurationAccessTo(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemConfigurationAccessTo.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration> selectAccessConfiguration() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.SystemConfigurationAccessTo_accessConfiguration);
  }

  public SystemConfigurationAccessTo setAccessConfiguration(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration> accessConfiguration) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.SystemConfigurationAccessTo_accessConfiguration, accessConfiguration);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource selectSource() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.SystemConfigurationAccessTo_source);
  }

  public SystemConfigurationAccessTo setSource(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.SystemConfigurationAccessTo_source, source);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SystemConfigurationAccessTo setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemConfigurationAccessTo setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.SystemConfigurationAccessTo_accessConfiguration, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.SystemConfigurationAccessTo_source, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessTo> selectToMeSource(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessTo.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.SystemConfigurationAccessTo_source, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessTo selectToMeAccessConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessTo.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.SystemConfigurationAccessTo_accessConfiguration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,885b4821-19c4-11eb-8585-65084a06c07f,tWAGFGIdeQF09Y+SKxPmUSBR9Fs=] */
