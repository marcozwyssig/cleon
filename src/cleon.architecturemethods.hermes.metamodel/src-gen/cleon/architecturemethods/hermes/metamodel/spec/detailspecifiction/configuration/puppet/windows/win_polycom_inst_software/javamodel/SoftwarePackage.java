package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SoftwarePackage extends DynamicResource implements ISoftwarePackage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISoftwarePackage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISoftwarePackage>() {
    
    @Override
    public ISoftwarePackage create() {
      return new SoftwarePackage();
    }
    
    @Override
    public ISoftwarePackage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SoftwarePackage(resourceRepository, resource);
    }
  
  };

  public SoftwarePackage() {
    super(ISoftwarePackage.TYPE_ID);
  }
  
  public SoftwarePackage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISoftwarePackage.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectEnsureProcessNotRunning() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_ensureProcessNotRunning);
  }
    
  public void setEnsureProcessNotRunning(java.lang.String ensureProcessNotRunning) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_ensureProcessNotRunning, ensureProcessNotRunning);
  }

  @Override
  public java.lang.String selectProductDisplayName() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_productDisplayName);
  }
    
  public void setProductDisplayName(java.lang.String productDisplayName) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_productDisplayName, productDisplayName);
  }

  @Override
  public java.lang.String selectProductKey() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_productKey);
  }
    
  public void setProductKey(java.lang.String productKey) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_productKey, productKey);
  }

  @Override
  public java.lang.String selectProductName() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_productName);
  }
    
  public void setProductName(java.lang.String productName) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_productName, productName);
  }

  @Override
  public java.lang.String selectProductVersion() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_productVersion);
  }
    
  public void setProductVersion(java.lang.String productVersion) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_productVersion, productVersion);
  }

  @Override
  public java.lang.String selectSetupFullPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_setupFullPath);
  }
    
  public void setSetupFullPath(java.lang.String setupFullPath) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_setupFullPath, setupFullPath);
  }

  @Override
  public java.util.List<java.lang.String> selectSetupParams() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_setupParams);
  }
    
  public void setSetupParams(java.util.List<java.lang.String> setupParams) {
     _setListAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_setupParams, setupParams);
  }

  @Override
  public java.lang.String selectSetupPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_setupPath);
  }
    
  public void setSetupPath(java.lang.String setupPath) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_setupPath, setupPath);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SoftwarePackage setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SoftwarePackage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant selectUsedProduct() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_usedProduct);
  }

  public SoftwarePackage setUsedProduct(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant usedProduct) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_usedProduct, usedProduct);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_ensureProcessNotRunning, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_productDisplayName, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_productKey, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_productName, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_productVersion, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_setupFullPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_setupParams, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_setupPath, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_usedProduct, visitor);
  }

  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.javamodel.ISoftwarePackage> selectToMeUsedProduct(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.javamodel.ISoftwarePackage.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.SoftwarePackage_usedProduct, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f2dd69fc-112e-11f0-a4f9-b5f995a9e0fe,8gBe/WDu91CdZw6pLL+ZBj4Uvh8=] */
