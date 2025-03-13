package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.windowsfeature.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WindowsFeatureResource extends DynamicResource implements IWindowsFeatureResource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWindowsFeatureResource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWindowsFeatureResource>() {
    
    @Override
    public IWindowsFeatureResource create() {
      return new WindowsFeatureResource();
    }
    
    @Override
    public IWindowsFeatureResource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WindowsFeatureResource(resourceRepository, resource);
    }
  
  };

  public WindowsFeatureResource() {
    super(IWindowsFeatureResource.TYPE_ID);
  }
  
  public WindowsFeatureResource(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWindowsFeatureResource.TYPE_ID);
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
  public java.lang.Boolean selectInstallmanagementtools() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.windowsfeature.WindowsfeaturePackage.WindowsFeatureResource_installmanagementtools);
  }
    
  public void setInstallmanagementtools(java.lang.Boolean installmanagementtools) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.windowsfeature.WindowsfeaturePackage.WindowsFeatureResource_installmanagementtools, installmanagementtools);
  }

  @Override
  public java.lang.Boolean selectInstallsubfeatures() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.windowsfeature.WindowsfeaturePackage.WindowsFeatureResource_installsubfeatures);
  }
    
  public void setInstallsubfeatures(java.lang.Boolean installsubfeatures) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.windowsfeature.WindowsfeaturePackage.WindowsFeatureResource_installsubfeatures, installsubfeatures);
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
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.windowsfeature.WindowsfeaturePackage.WindowsFeatureResource_ensure);
  }

  public WindowsFeatureResource setEnsure(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState ensure) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.windowsfeature.WindowsfeaturePackage.WindowsFeatureResource_ensure, ensure);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WindowsFeatureResource setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.windowsfeature.WindowsfeaturePackage.WindowsFeatureResource_installmanagementtools, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.windowsfeature.WindowsfeaturePackage.WindowsFeatureResource_installsubfeatures, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.windowsfeature.WindowsfeaturePackage.WindowsFeatureResource_ensure, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.windowsfeature.javamodel.IWindowsFeatureResource> selectToMeEnsure(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.windowsfeature.javamodel.IWindowsFeatureResource.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.windowsfeature.WindowsfeaturePackage.WindowsFeatureResource_ensure, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,49801248-f18e-11e8-b3e7-15e2dd8d9b05,grMKdC5ezdIumFdibv44mZrMdek=] */
