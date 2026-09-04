package cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WindowsServerHostLicensing extends DynamicResource implements IWindowsServerHostLicensing {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWindowsServerHostLicensing> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWindowsServerHostLicensing>() {
    
    @Override
    public IWindowsServerHostLicensing create() {
      return new WindowsServerHostLicensing();
    }
    
    @Override
    public IWindowsServerHostLicensing create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WindowsServerHostLicensing(resourceRepository, resource);
    }
  
  };

  public WindowsServerHostLicensing() {
    super(IWindowsServerHostLicensing.TYPE_ID);
  }
  
  public WindowsServerHostLicensing(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWindowsServerHostLicensing.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectAmount() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.MicrosoftPackage.WindowsServerHostLicensing_amount);
  }
    
  public void setAmount(java.lang.Integer amount) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.MicrosoftPackage.WindowsServerHostLicensing_amount, amount);
  }

  @Override
  public java.lang.Integer selectPhysicalCores() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractServerHostLicensing_physicalCores);
  }
    
  public void setPhysicalCores(java.lang.Integer physicalCores) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractServerHostLicensing_physicalCores, physicalCores);
  }

  @Override
  public java.lang.Integer selectVms() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractServerHostLicensing_vms);
  }
    
  public void setVms(java.lang.Integer vms) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractServerHostLicensing_vms, vms);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode selectHost() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractServerHostLicensing_host);
  }

  public WindowsServerHostLicensing setHost(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode host) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractServerHostLicensing_host, host);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftServerLicense selectMicrosoftServerLicense() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftServerLicense.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.MicrosoftPackage.WindowsServerHostLicensing_microsoftServerLicense);
  }

  public WindowsServerHostLicensing setMicrosoftServerLicense(cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftServerLicense microsoftServerLicense) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.MicrosoftPackage.WindowsServerHostLicensing_microsoftServerLicense, microsoftServerLicense);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public WindowsServerHostLicensing setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WindowsServerHostLicensing setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.MicrosoftPackage.WindowsServerHostLicensing_amount, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractServerHostLicensing_physicalCores, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractServerHostLicensing_vms, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractServerHostLicensing_host, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftServerLicense.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.MicrosoftPackage.WindowsServerHostLicensing_microsoftServerLicense, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IWindowsServerHostLicensing> selectToMeMicrosoftServerLicense(cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftServerLicense object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IWindowsServerHostLicensing.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.MicrosoftPackage.WindowsServerHostLicensing_microsoftServerLicense, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e6437b2d-dfc8-11ef-b0be-9b4cac321140,EbIT1L9xVrZ0DF2VNHy38DxnF9s=] */
