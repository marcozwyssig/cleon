package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.remotedesktop.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RemoteDesktopResource extends DynamicResource implements IRemoteDesktopResource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRemoteDesktopResource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRemoteDesktopResource>() {
    
    @Override
    public IRemoteDesktopResource create() {
      return new RemoteDesktopResource();
    }
    
    @Override
    public IRemoteDesktopResource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RemoteDesktopResource(resourceRepository, resource);
    }
  
  };

  public RemoteDesktopResource() {
    super(IRemoteDesktopResource.TYPE_ID);
  }
  
  public RemoteDesktopResource(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRemoteDesktopResource.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectTitle() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title);
  }
    
  public void setTitle(java.lang.String title) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title, title);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState selectEnsure() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.remotedesktop.RemotedesktopPackage.RemoteDesktopResource_ensure);
  }

  public RemoteDesktopResource setEnsure(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState ensure) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.remotedesktop.RemotedesktopPackage.RemoteDesktopResource_ensure, ensure);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState selectNla() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.remotedesktop.RemotedesktopPackage.RemoteDesktopResource_nla);
  }

  public RemoteDesktopResource setNla(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState nla) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.remotedesktop.RemotedesktopPackage.RemoteDesktopResource_nla, nla);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RemoteDesktopResource setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.remotedesktop.RemotedesktopPackage.RemoteDesktopResource_ensure, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.remotedesktop.RemotedesktopPackage.RemoteDesktopResource_nla, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.remotedesktop.javamodel.IRemoteDesktopResource> selectToMeEnsure(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.remotedesktop.javamodel.IRemoteDesktopResource.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.remotedesktop.RemotedesktopPackage.RemoteDesktopResource_ensure, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.remotedesktop.javamodel.IRemoteDesktopResource> selectToMeNla(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.remotedesktop.javamodel.IRemoteDesktopResource.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.remotedesktop.RemotedesktopPackage.RemoteDesktopResource_nla, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b989c3c9-f6e4-11e8-89f5-5f608c9bcdaf,ZectlFb8qRlebuzXPP0XGuNLeS4=] */
