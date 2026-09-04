package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.manual.share.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ManualShareConfiguration extends DynamicResource implements IManualShareConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManualShareConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManualShareConfiguration>() {
    
    @Override
    public IManualShareConfiguration create() {
      return new ManualShareConfiguration();
    }
    
    @Override
    public IManualShareConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ManualShareConfiguration(resourceRepository, resource);
    }
  
  };

  public ManualShareConfiguration() {
    super(IManualShareConfiguration.TYPE_ID);
  }
  
  public ManualShareConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IManualShareConfiguration.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel.IShare selectShare() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel.IShare.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.manual.share.SharePackage.ManualShareConfiguration_share);
  }

  public ManualShareConfiguration setShare(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel.IShare share) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.manual.share.SharePackage.ManualShareConfiguration_share, share);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ManualShareConfiguration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ManualShareConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel.IShare.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.manual.share.SharePackage.ManualShareConfiguration_share, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.manual.share.javamodel.IManualShareConfiguration> selectToMeShare(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel.IShare object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.manual.share.javamodel.IManualShareConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.manual.share.SharePackage.ManualShareConfiguration_share, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,24a1cf87-112d-11f0-a4f9-b5f995a9e0fe,WTFFdnGOQB3VwZZwx0gxC/lXcxY=] */
