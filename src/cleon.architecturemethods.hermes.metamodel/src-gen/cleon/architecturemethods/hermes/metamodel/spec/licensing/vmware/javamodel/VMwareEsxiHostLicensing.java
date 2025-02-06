package cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class VMwareEsxiHostLicensing extends DynamicResource implements IVMwareEsxiHostLicensing {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVMwareEsxiHostLicensing> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVMwareEsxiHostLicensing>() {
    
    @Override
    public IVMwareEsxiHostLicensing create() {
      return new VMwareEsxiHostLicensing();
    }
    
    @Override
    public IVMwareEsxiHostLicensing create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new VMwareEsxiHostLicensing(resourceRepository, resource);
    }
  
  };

  public VMwareEsxiHostLicensing() {
    super(IVMwareEsxiHostLicensing.TYPE_ID);
  }
  
  public VMwareEsxiHostLicensing(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVMwareEsxiHostLicensing.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectAmount() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.VmwarePackage.VMwareEsxiHostLicensing_amount);
  }
    
  public void setAmount(java.lang.Integer amount) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.VmwarePackage.VMwareEsxiHostLicensing_amount, amount);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public VMwareEsxiHostLicensing setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVMwarevSphereLicense selectVmWareLicenseType() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVMwarevSphereLicense.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.VmwarePackage.VMwareEsxiHostLicensing_vmWareLicenseType);
  }

  public VMwareEsxiHostLicensing setVmWareLicenseType(cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVMwarevSphereLicense vmWareLicenseType) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.VmwarePackage.VMwareEsxiHostLicensing_vmWareLicenseType, vmWareLicenseType);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.VmwarePackage.VMwareEsxiHostLicensing_amount, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVMwarevSphereLicense.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.VmwarePackage.VMwareEsxiHostLicensing_vmWareLicenseType, visitor);
  }

  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVMwareEsxiHostLicensing> selectToMeVmWareLicenseType(cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVMwarevSphereLicense object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVMwareEsxiHostLicensing.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.VmwarePackage.VMwareEsxiHostLicensing_vmWareLicenseType, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,53756815-e4a3-11ef-a6bd-497168f25adc,4+kd/ny8kfaNvV2IUpU5mryU028=] */
