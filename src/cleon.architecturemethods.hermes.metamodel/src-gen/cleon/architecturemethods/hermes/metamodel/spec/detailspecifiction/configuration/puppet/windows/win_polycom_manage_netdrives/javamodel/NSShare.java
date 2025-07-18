package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NSShare extends DynamicResource implements INSShare {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INSShare> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INSShare>() {
    
    @Override
    public INSShare create() {
      return new NSShare();
    }
    
    @Override
    public INSShare create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NSShare(resourceRepository, resource);
    }
  
  };

  public NSShare() {
    super(INSShare.TYPE_ID);
  }
  
  public NSShare(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INSShare.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectFullShareName() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.NSShare_fullShareName);
  }
    
  public void setFullShareName(java.lang.String fullShareName) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.NSShare_fullShareName, fullShareName);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.NSShare_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.NSShare_name, name);
  }

  @Override
  public java.lang.String selectShareName() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.NSShare_shareName);
  }
    
  public void setShareName(java.lang.String shareName) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.NSShare_shareName, shareName);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel.IShare selectShare() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel.IShare.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.NSShare_share);
  }

  public NSShare setShare(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel.IShare share) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.NSShare_share, share);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public NSShare setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NSShare setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.NSShare_fullShareName, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.NSShare_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.NSShare_shareName, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel.IShare.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.NSShare_share, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.INSShare> selectToMeShare(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel.IShare object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.INSShare.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.NSShare_share, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5fcf2c59-07f5-11f0-bc12-1bbda1d7028e,AfW78e5T3hXPGzMP5UohPNZxW7s=] */
