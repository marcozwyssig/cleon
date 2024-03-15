package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[25454e48-020d-11e9-b327-17da2da63a8f,imports]] */
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.SystemConfiguration;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.operatingsystem.javamodel.ILinuxSystemConfiguration;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.operatingsystem.javamodel.IWindowsSystemConfiguration;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.virtualization.javamodel.IVirtualMachineSystemConfiguration;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.FunctionSpace_Services.IAbstractServiceFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterface;
/* End Protected Region   [[25454e48-020d-11e9-b327-17da2da63a8f,imports]] */

public class FunctionSpace_SystemConfiguration {

  /* Begin Protected Region [[25454e48-020d-11e9-b327-17da2da63a8f]] */

  /* End Protected Region   [[25454e48-020d-11e9-b327-17da2da63a8f]] */


  public static interface IWindowsSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("862a2d8a-0ab5-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("862a2d8d-0ab5-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IWindowsSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WindowsSystemConfigurationFunctionsImpl implements IWindowsSystemConfigurationFunctionsImpl {

    public static final IWindowsSystemConfigurationFunctionsImpl INSTANCE = new WindowsSystemConfigurationFunctionsImpl();

    private WindowsSystemConfigurationFunctionsImpl() {}

  }
  
  public static class WindowsSystemConfigurationFunctions {

    private WindowsSystemConfigurationFunctions() {}

  }

  public static interface IWriteableDomainControllerSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d640244f-0aa5-11e9-8a91-633e556ac68f")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("5affc9c4-0ab2-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IWriteableDomainControllerSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WriteableDomainControllerSystemConfigurationFunctionsImpl implements IWriteableDomainControllerSystemConfigurationFunctionsImpl {

    public static final IWriteableDomainControllerSystemConfigurationFunctionsImpl INSTANCE = new WriteableDomainControllerSystemConfigurationFunctionsImpl();

    private WriteableDomainControllerSystemConfigurationFunctionsImpl() {}

  }
  
  public static class WriteableDomainControllerSystemConfigurationFunctions {

    private WriteableDomainControllerSystemConfigurationFunctions() {}

  }

  public static interface IRadiusSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4c3b9e8a-0ab3-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("4c3b9e8d-0ab3-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IRadiusSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RadiusSystemConfigurationFunctionsImpl implements IRadiusSystemConfigurationFunctionsImpl {

    public static final IRadiusSystemConfigurationFunctionsImpl INSTANCE = new RadiusSystemConfigurationFunctionsImpl();

    private RadiusSystemConfigurationFunctionsImpl() {}

  }
  
  public static class RadiusSystemConfigurationFunctions {

    private RadiusSystemConfigurationFunctions() {}

  }

  public static interface IVirtualMachineSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c76fde5e-0ab0-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

    @IDynamicResourceExtension.MethodId("de4c880b-0ab0-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

  }
  
  public static interface IVirtualMachineSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VirtualMachineSystemConfigurationFunctionsImpl implements IVirtualMachineSystemConfigurationFunctionsImpl {

    public static final IVirtualMachineSystemConfigurationFunctionsImpl INSTANCE = new VirtualMachineSystemConfigurationFunctionsImpl();

    private VirtualMachineSystemConfigurationFunctionsImpl() {}

  }
  
  public static class VirtualMachineSystemConfigurationFunctions {

    private VirtualMachineSystemConfigurationFunctions() {}

  }

  public static interface IWebServerConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1f2e4d83-0ab4-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

    @IDynamicResourceExtension.MethodId("1f2e4d86-0ab4-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

  }
  
  public static interface IWebServerConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WebServerConfigurationFunctionsImpl implements IWebServerConfigurationFunctionsImpl {

    public static final IWebServerConfigurationFunctionsImpl INSTANCE = new WebServerConfigurationFunctionsImpl();

    private WebServerConfigurationFunctionsImpl() {}

  }
  
  public static class WebServerConfigurationFunctions {

    private WebServerConfigurationFunctions() {}

  }

  public static interface IPublicKeyInfrastructureSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3769eb0c-0ab4-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

    @IDynamicResourceExtension.MethodId("3769eb0f-0ab4-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

  }
  
  public static interface IPublicKeyInfrastructureSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PublicKeyInfrastructureSystemConfigurationFunctionsImpl implements IPublicKeyInfrastructureSystemConfigurationFunctionsImpl {

    public static final IPublicKeyInfrastructureSystemConfigurationFunctionsImpl INSTANCE = new PublicKeyInfrastructureSystemConfigurationFunctionsImpl();

    private PublicKeyInfrastructureSystemConfigurationFunctionsImpl() {}

  }
  
  public static class PublicKeyInfrastructureSystemConfigurationFunctions {

    private PublicKeyInfrastructureSystemConfigurationFunctions() {}

  }

  public static interface IPublicKeyInfrastructureRootSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("48364d16-0ab4-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

    @IDynamicResourceExtension.MethodId("48364d19-0ab4-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

  }
  
  public static interface IPublicKeyInfrastructureRootSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PublicKeyInfrastructureRootSystemConfigurationFunctionsImpl implements IPublicKeyInfrastructureRootSystemConfigurationFunctionsImpl {

    public static final IPublicKeyInfrastructureRootSystemConfigurationFunctionsImpl INSTANCE = new PublicKeyInfrastructureRootSystemConfigurationFunctionsImpl();

    private PublicKeyInfrastructureRootSystemConfigurationFunctionsImpl() {}

  }
  
  public static class PublicKeyInfrastructureRootSystemConfigurationFunctions {

    private PublicKeyInfrastructureRootSystemConfigurationFunctions() {}

  }

  public static interface IVCenterSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("589b9409-0ab5-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("589b940c-0ab5-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IVCenterSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VCenterSystemConfigurationFunctionsImpl implements IVCenterSystemConfigurationFunctionsImpl {

    public static final IVCenterSystemConfigurationFunctionsImpl INSTANCE = new VCenterSystemConfigurationFunctionsImpl();

    private VCenterSystemConfigurationFunctionsImpl() {}

  }
  
  public static class VCenterSystemConfigurationFunctions {

    private VCenterSystemConfigurationFunctions() {}

  }

  public static interface ITerminalServerSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("15257583-0ab7-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("15257586-0ab7-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface ITerminalServerSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TerminalServerSystemConfigurationFunctionsImpl implements ITerminalServerSystemConfigurationFunctionsImpl {

    public static final ITerminalServerSystemConfigurationFunctionsImpl INSTANCE = new TerminalServerSystemConfigurationFunctionsImpl();

    private TerminalServerSystemConfigurationFunctionsImpl() {}

  }
  
  public static class TerminalServerSystemConfigurationFunctions {

    private TerminalServerSystemConfigurationFunctions() {}

  }

  public static interface IServerSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("df5a2044-0ab3-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("df5a4757-0ab3-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IServerSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServerSystemConfigurationFunctionsImpl implements IServerSystemConfigurationFunctionsImpl {

    public static final IServerSystemConfigurationFunctionsImpl INSTANCE = new ServerSystemConfigurationFunctionsImpl();

    private ServerSystemConfigurationFunctionsImpl() {}

  }
  
  public static class ServerSystemConfigurationFunctions {

    private ServerSystemConfigurationFunctions() {}

  }

  public static interface IReadOnlyDomainControllerSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7d9b94f0-0ab4-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("7d9b94f3-0ab4-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IReadOnlyDomainControllerSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ReadOnlyDomainControllerSystemConfigurationFunctionsImpl implements IReadOnlyDomainControllerSystemConfigurationFunctionsImpl {

    public static final IReadOnlyDomainControllerSystemConfigurationFunctionsImpl INSTANCE = new ReadOnlyDomainControllerSystemConfigurationFunctionsImpl();

    private ReadOnlyDomainControllerSystemConfigurationFunctionsImpl() {}

  }
  
  public static class ReadOnlyDomainControllerSystemConfigurationFunctions {

    private ReadOnlyDomainControllerSystemConfigurationFunctions() {}

  }

  public static interface IDhcpSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("de7c629f-0ab6-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("de7c62a2-0ab6-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IDhcpSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DhcpSystemConfigurationFunctionsImpl implements IDhcpSystemConfigurationFunctionsImpl {

    public static final IDhcpSystemConfigurationFunctionsImpl INSTANCE = new DhcpSystemConfigurationFunctionsImpl();

    private DhcpSystemConfigurationFunctionsImpl() {}

  }
  
  public static class DhcpSystemConfigurationFunctions {

    private DhcpSystemConfigurationFunctions() {}

  }

  public static interface IActiveDirectoryManagerSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b3bdcfa3-0ab5-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("b3bdcfa6-0ab5-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IActiveDirectoryManagerSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActiveDirectoryManagerSystemConfigurationFunctionsImpl implements IActiveDirectoryManagerSystemConfigurationFunctionsImpl {

    public static final IActiveDirectoryManagerSystemConfigurationFunctionsImpl INSTANCE = new ActiveDirectoryManagerSystemConfigurationFunctionsImpl();

    private ActiveDirectoryManagerSystemConfigurationFunctionsImpl() {}

  }
  
  public static class ActiveDirectoryManagerSystemConfigurationFunctions {

    private ActiveDirectoryManagerSystemConfigurationFunctions() {}

  }

  public static interface IBackupSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3412f010-0ab7-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("3412f013-0ab7-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IBackupSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BackupSystemConfigurationFunctionsImpl implements IBackupSystemConfigurationFunctionsImpl {

    public static final IBackupSystemConfigurationFunctionsImpl INSTANCE = new BackupSystemConfigurationFunctionsImpl();

    private BackupSystemConfigurationFunctionsImpl() {}

  }
  
  public static class BackupSystemConfigurationFunctions {

    private BackupSystemConfigurationFunctions() {}

  }

  public static interface IWebProxySystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("68b117ae-0ab7-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("68b117b1-0ab7-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IWebProxySystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WebProxySystemConfigurationFunctionsImpl implements IWebProxySystemConfigurationFunctionsImpl {

    public static final IWebProxySystemConfigurationFunctionsImpl INSTANCE = new WebProxySystemConfigurationFunctionsImpl();

    private WebProxySystemConfigurationFunctionsImpl() {}

  }
  
  public static class WebProxySystemConfigurationFunctions {

    private WebProxySystemConfigurationFunctions() {}

  }

  public static interface IPulseSecureApplianceSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fb5abe9a-0ab4-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("fb5abe9d-0ab4-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IPulseSecureApplianceSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PulseSecureApplianceSystemConfigurationFunctionsImpl implements IPulseSecureApplianceSystemConfigurationFunctionsImpl {

    public static final IPulseSecureApplianceSystemConfigurationFunctionsImpl INSTANCE = new PulseSecureApplianceSystemConfigurationFunctionsImpl();

    private PulseSecureApplianceSystemConfigurationFunctionsImpl() {}

  }
  
  public static class PulseSecureApplianceSystemConfigurationFunctions {

    private PulseSecureApplianceSystemConfigurationFunctions() {}

  }

  public static interface IRSASystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4263c138-0ab6-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("4263c13b-0ab6-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IRSASystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RSASystemConfigurationFunctionsImpl implements IRSASystemConfigurationFunctionsImpl {

    public static final IRSASystemConfigurationFunctionsImpl INSTANCE = new RSASystemConfigurationFunctionsImpl();

    private RSASystemConfigurationFunctionsImpl() {}

  }
  
  public static class RSASystemConfigurationFunctions {

    private RSASystemConfigurationFunctions() {}

  }

  public static interface IEndpointProtectionOrchestrationSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ef39c673-0ab5-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("ef39c676-0ab5-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IEndpointProtectionOrchestrationSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EndpointProtectionOrchestrationSystemConfigurationFunctionsImpl implements IEndpointProtectionOrchestrationSystemConfigurationFunctionsImpl {

    public static final IEndpointProtectionOrchestrationSystemConfigurationFunctionsImpl INSTANCE = new EndpointProtectionOrchestrationSystemConfigurationFunctionsImpl();

    private EndpointProtectionOrchestrationSystemConfigurationFunctionsImpl() {}

  }
  
  public static class EndpointProtectionOrchestrationSystemConfigurationFunctions {

    private EndpointProtectionOrchestrationSystemConfigurationFunctions() {}

  }

  public static interface IDfsSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("dd61e744-0ab5-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("dd61e747-0ab5-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IDfsSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DfsSystemConfigurationFunctionsImpl implements IDfsSystemConfigurationFunctionsImpl {

    public static final IDfsSystemConfigurationFunctionsImpl INSTANCE = new DfsSystemConfigurationFunctionsImpl();

    private DfsSystemConfigurationFunctionsImpl() {}

  }
  
  public static class DfsSystemConfigurationFunctions {

    private DfsSystemConfigurationFunctions() {}

  }

  public static interface IBackupStorageSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9ec6e000-0ab6-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("9ec6e003-0ab6-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IBackupStorageSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BackupStorageSystemConfigurationFunctionsImpl implements IBackupStorageSystemConfigurationFunctionsImpl {

    public static final IBackupStorageSystemConfigurationFunctionsImpl INSTANCE = new BackupStorageSystemConfigurationFunctionsImpl();

    private BackupStorageSystemConfigurationFunctionsImpl() {}

  }
  
  public static class BackupStorageSystemConfigurationFunctions {

    private BackupStorageSystemConfigurationFunctions() {}

  }

  public static interface IPrtgSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99f06ed7-0ab5-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("99f06eda-0ab5-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IPrtgSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PrtgSystemConfigurationFunctionsImpl implements IPrtgSystemConfigurationFunctionsImpl {

    public static final IPrtgSystemConfigurationFunctionsImpl INSTANCE = new PrtgSystemConfigurationFunctionsImpl();

    private PrtgSystemConfigurationFunctionsImpl() {}

  }
  
  public static class PrtgSystemConfigurationFunctions {

    private PrtgSystemConfigurationFunctions() {}

  }

  public static interface IPrtgProbeSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1d7e3f78-0c2f-11e9-83ba-4d57b06560a2")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("1d7e3f7b-0c2f-11e9-83ba-4d57b06560a2")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IPrtgProbeSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PrtgProbeSystemConfigurationFunctionsImpl implements IPrtgProbeSystemConfigurationFunctionsImpl {

    public static final IPrtgProbeSystemConfigurationFunctionsImpl INSTANCE = new PrtgProbeSystemConfigurationFunctionsImpl();

    private PrtgProbeSystemConfigurationFunctionsImpl() {}

  }
  
  public static class PrtgProbeSystemConfigurationFunctions {

    private PrtgProbeSystemConfigurationFunctions() {}

  }

  public static interface IConfigurationManagementSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ae187c43-0c39-11e9-83ba-4d57b06560a2")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("ae187c46-0c39-11e9-83ba-4d57b06560a2")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IConfigurationManagementSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ConfigurationManagementSystemConfigurationFunctionsImpl implements IConfigurationManagementSystemConfigurationFunctionsImpl {

    public static final IConfigurationManagementSystemConfigurationFunctionsImpl INSTANCE = new ConfigurationManagementSystemConfigurationFunctionsImpl();

    private ConfigurationManagementSystemConfigurationFunctionsImpl() {}

  }
  
  public static class ConfigurationManagementSystemConfigurationFunctions {

    private ConfigurationManagementSystemConfigurationFunctions() {}

  }

  public static interface IRepositorySystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2f23ea8a-0c3a-11e9-83ba-4d57b06560a2")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("2f23ea8d-0c3a-11e9-83ba-4d57b06560a2")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IRepositorySystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RepositorySystemConfigurationFunctionsImpl implements IRepositorySystemConfigurationFunctionsImpl {

    public static final IRepositorySystemConfigurationFunctionsImpl INSTANCE = new RepositorySystemConfigurationFunctionsImpl();

    private RepositorySystemConfigurationFunctionsImpl() {}

  }
  
  public static class RepositorySystemConfigurationFunctions {

    private RepositorySystemConfigurationFunctions() {}

  }

  public static interface IRedhatSatelliteSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f5bc9b18-0c3c-11e9-83ba-4d57b06560a2")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("f5bc9b1b-0c3c-11e9-83ba-4d57b06560a2")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IRedhatSatelliteSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RedhatSatelliteSystemConfigurationFunctionsImpl implements IRedhatSatelliteSystemConfigurationFunctionsImpl {

    public static final IRedhatSatelliteSystemConfigurationFunctionsImpl INSTANCE = new RedhatSatelliteSystemConfigurationFunctionsImpl();

    private RedhatSatelliteSystemConfigurationFunctionsImpl() {}

  }
  
  public static class RedhatSatelliteSystemConfigurationFunctions {

    private RedhatSatelliteSystemConfigurationFunctions() {}

  }

  public static interface IWsusSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bb8c67de-0c3d-11e9-83ba-4d57b06560a2")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("bb8c67e1-0c3d-11e9-83ba-4d57b06560a2")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IWsusSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WsusSystemConfigurationFunctionsImpl implements IWsusSystemConfigurationFunctionsImpl {

    public static final IWsusSystemConfigurationFunctionsImpl INSTANCE = new WsusSystemConfigurationFunctionsImpl();

    private WsusSystemConfigurationFunctionsImpl() {}

  }
  
  public static class WsusSystemConfigurationFunctions {

    private WsusSystemConfigurationFunctions() {}

  }

  public static interface ILinuxSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("82aabb28-1d8a-11e9-b601-db75aa6f89a4")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("82aabb2b-1d8a-11e9-b601-db75aa6f89a4")
    public java.lang.String GetIncludePath();

  }
  
  public static interface ILinuxSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LinuxSystemConfigurationFunctionsImpl implements ILinuxSystemConfigurationFunctionsImpl {

    public static final ILinuxSystemConfigurationFunctionsImpl INSTANCE = new LinuxSystemConfigurationFunctionsImpl();

    private LinuxSystemConfigurationFunctionsImpl() {}

  }
  
  public static class LinuxSystemConfigurationFunctions {

    private LinuxSystemConfigurationFunctions() {}

  }

  public static interface IHypervisorSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("10d2b9cc-0ab3-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("10d2b9cf-0ab3-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IHypervisorSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class HypervisorSystemConfigurationFunctionsImpl implements IHypervisorSystemConfigurationFunctionsImpl {

    public static final IHypervisorSystemConfigurationFunctionsImpl INSTANCE = new HypervisorSystemConfigurationFunctionsImpl();

    private HypervisorSystemConfigurationFunctionsImpl() {}

  }
  
  public static class HypervisorSystemConfigurationFunctions {

    private HypervisorSystemConfigurationFunctions() {}

  }

  public static interface IMailRelaySystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("802807b0-c81b-11e9-ba65-a5b6bc4916e7")
    public java.lang.String GetIncludePath();

    @IDynamicResourceExtension.MethodId("802807b3-c81b-11e9-ba65-a5b6bc4916e7")
    public java.lang.String GetStereotypeName();

  }
  
  public static interface IMailRelaySystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MailRelaySystemConfigurationFunctionsImpl implements IMailRelaySystemConfigurationFunctionsImpl {

    public static final IMailRelaySystemConfigurationFunctionsImpl INSTANCE = new MailRelaySystemConfigurationFunctionsImpl();

    private MailRelaySystemConfigurationFunctionsImpl() {}

  }
  
  public static class MailRelaySystemConfigurationFunctions {

    private MailRelaySystemConfigurationFunctions() {}

  }

  public static interface IDeviceSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e61322cf-2abd-11e9-a3f8-336d9e792e17")
    public java.lang.String GetMaterialTypeName();

  }
  
  public static interface IDeviceSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeviceSystemConfigurationFunctionsImpl implements IDeviceSystemConfigurationFunctionsImpl {

    public static final IDeviceSystemConfigurationFunctionsImpl INSTANCE = new DeviceSystemConfigurationFunctionsImpl();

    private DeviceSystemConfigurationFunctionsImpl() {}

  }
  
  public static class DeviceSystemConfigurationFunctions {

    private DeviceSystemConfigurationFunctions() {}

  }

  public static interface IInterfaceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f6f77375-c837-11ea-a92a-436f8b822db6")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService> SelectAllowedServices();

  }
  
  public static interface IInterfaceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f6f77375-c837-11ea-a92a-436f8b822db6")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService> SelectAllowedServices(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterface interface_);

  }
  
  public static class InterfaceFunctionsImpl implements IInterfaceFunctionsImpl {

    public static final IInterfaceFunctionsImpl INSTANCE = new InterfaceFunctionsImpl();

    private InterfaceFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService> SelectAllowedServices(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterface interface_) {
      /* Begin Protected Region [[f6f77375-c837-11ea-a92a-436f8b822db6]] */
      final Set<IAbstractService> services = new HashSet<>();
      for( final IAbstractService service : interface_.selectProvidesService()) {
      	services.addAll(service.extension(IAbstractServiceFunctions.class).All());
      }

      final var sysCfg = SystemConfiguration.selectToMeInterface(interface_);
      final var dependsOn = sysCfg.extension(ISystemConfigurationFunctions.class).GetAllDependsOn();

      final var selectInterfaceInSecuritySubZone = interface_.selectInterfaceInSecuritySubZone().getResource();

      for( final ISystemConfiguration dependsOnSysCfg : dependsOn ) {
      	if( dependsOnSysCfg.selectInterface().containsKey(selectInterfaceInSecuritySubZone)) {
      		final IInterface dependsOnInterface = dependsOnSysCfg.selectInterface().get(selectInterfaceInSecuritySubZone);
      		for( final IAbstractService service : dependsOnInterface.selectProvidesService()) {
      			services.addAll(service.extension(IAbstractServiceFunctions.class).All());
      		}
      	}

      }

      return services.stream().collect(Collectors.toList());
      /* End Protected Region   [[f6f77375-c837-11ea-a92a-436f8b822db6]] */
    }

  }
  
  public static class InterfaceFunctions {

    private InterfaceFunctions() {}

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService> SelectAllowedServices(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterface interface_) {
      return DynamicResourceUtil.invoke(IInterfaceFunctionsImpl.class, InterfaceFunctionsImpl.INSTANCE, interface_).SelectAllowedServices(interface_);
    }

  }

  public static interface ISystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("672a1eb2-a9aa-11eb-80cf-abd0e6d5d574")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.machine.javamodel.IMachineSystemConfiguration> AllDependsOnMachineConfiguration();

    @IDynamicResourceExtension.MethodId("b9754de0-c769-11ee-88de-bb28abfdee0c")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> AllDependsOnSystemConfiguration();

    @IDynamicResourceExtension.MethodId("4c54396f-c784-11ea-b0b6-e5df79e86bc2")
    public java.lang.String AllHostGroupName(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode env, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

    @IDynamicResourceExtension.MethodId("b1e03eb1-a990-11eb-8f9b-01c801f6a12b")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> AllHostsWithEnvironment(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironment);

    @IDynamicResourceExtension.MethodId("eb2a2ff7-05ed-11ea-9b1e-558d1275d95e")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts> AllUsedTNsDistinctWithEnvironment(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment);

    @IDynamicResourceExtension.MethodId("b38a2bca-de1f-11e9-b0cf-dd86691e664c")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts> AllUsedTNsDistinct();

    @IDynamicResourceExtension.MethodId("10e575cf-05ee-11ea-9b1e-558d1275d95e")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts> AllUsedTNsWithEnvironment(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment);

    @IDynamicResourceExtension.MethodId("ae3f2508-dec8-11e9-b714-478bec98e62d")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts> AllUsedTNs();

    @IDynamicResourceExtension.MethodId("f1883319-9b95-11ec-8985-9dc243cc3ec6")
    public java.lang.Boolean AllowDNSRecordExport();

    @IDynamicResourceExtension.MethodId("1a231684-0675-11ec-b623-f16d27d7978c")
    public java.lang.Boolean IsDependsOnLinux();

    @IDynamicResourceExtension.MethodId("9cdb6899-d18e-11ee-b624-ff4effe3da71")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.operatingsystem.javamodel.ILinuxSystemConfiguration GetDependsOnLinux();

    @IDynamicResourceExtension.MethodId("211eb015-c9ef-11ee-953e-1bc687172a5b")
    public java.lang.Boolean IsDependsOnLinuxOrWindows();

    @IDynamicResourceExtension.MethodId("492b3b22-14d9-11ea-a57d-f9a0d62ee07e")
    public java.lang.Boolean IsDependsOnWindows();

    @IDynamicResourceExtension.MethodId("d3733cda-d18e-11ee-b624-ff4effe3da71")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.operatingsystem.javamodel.IWindowsSystemConfiguration GetDependsOnWindows();

    @IDynamicResourceExtension.MethodId("f156a455-c767-11ee-88de-bb28abfdee0c")
    public java.lang.Boolean IsDependsOnVM();

    @IDynamicResourceExtension.MethodId("c723b319-d192-11ee-b624-ff4effe3da71")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.virtualization.javamodel.IVirtualMachineSystemConfiguration GetDependsOnVM();

    @IDynamicResourceExtension.MethodId("a01bd4a6-332f-11eb-bba8-618171a64c64")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration GetDependsToSystemConfiguration();

    @IDynamicResourceExtension.MethodId("5548ffce-c780-11ea-b0b6-e5df79e86bc2")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetAllDependsFromWithSelfOnlyConcrete();

    @IDynamicResourceExtension.MethodId("a340ae54-b200-11e9-b89e-1728aee30149")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetAllDependsFromWithSelf();

    @IDynamicResourceExtension.MethodId("5e4b2dd6-b200-11e9-b89e-1728aee30149")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetAllDependsFrom();

    @IDynamicResourceExtension.MethodId("53f316dd-a93d-11e9-bf83-7bacdb6991f7")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetAllDependsOnWithSelf();

    @IDynamicResourceExtension.MethodId("661c4575-879b-11e9-bb4b-c57da735262b")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetAllDependsOn();

    @IDynamicResourceExtension.MethodId("691c183c-92b7-11e9-b2b4-f340ae70802c")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetAllRequires();

    @IDynamicResourceExtension.MethodId("0432a013-e076-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ICommunicationSystem> GetCommunicationsDistinct();

    @IDynamicResourceExtension.MethodId("6e5748b2-e075-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ICommunicationSystem> GetCommunications();

    @IDynamicResourceExtension.MethodId("d5b40877-bb98-11ea-aec8-5d01276af4ef")
    public java.lang.String GetIncludePath();

    @IDynamicResourceExtension.MethodId("16d2f46d-2abd-11e9-a3f8-336d9e792e17")
    public java.lang.String GetMaterialTypeName();

    @IDynamicResourceExtension.MethodId("3364ecb7-021d-11e9-b327-17da2da63a8f")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("74b26bdc-09fc-11ea-baed-218c3e076b56")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration GetOnlyDependsFrom();

    @IDynamicResourceExtension.MethodId("0ea917ac-0e91-11e9-9f19-6d15636f4ecc")
    public java.lang.String GetShortname();

    @IDynamicResourceExtension.MethodId("d5b4087a-bb98-11ea-aec8-5d01276af4ef")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("afece5a6-b9e8-11e9-828c-091526d036b6")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> GetSubzonesAllDependsFromWithSelf();

    @IDynamicResourceExtension.MethodId("30b54ff7-020d-11e9-b327-17da2da63a8f")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("014a8f50-deae-11e9-b714-478bec98e62d")
    public java.lang.String GroupName(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode env);

    @IDynamicResourceExtension.MethodId("c09a443e-c783-11ea-b0b6-e5df79e86bc2")
    public java.lang.String HostGroupName(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts hosts, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

    @IDynamicResourceExtension.MethodId("861a0366-f167-11ec-ac33-079e260f3153")
    public java.lang.String HostGroupName(final java.lang.String groupName, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

    @IDynamicResourceExtension.MethodId("2a51e529-df6d-11e9-9827-a1514ee8d06a")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterface InterfaceType(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subzone);

    @IDynamicResourceExtension.MethodId("4dd43ac6-6441-11ee-9870-a3a9b6fe8f95")
    public java.lang.Boolean IsConcrete();

    @IDynamicResourceExtension.MethodId("2b39227b-c77f-11ea-b0b6-e5df79e86bc2")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> OnlyConcrete();

    @IDynamicResourceExtension.MethodId("1e2f66c0-06bd-11ea-8f17-2da21adc8e34")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> OnlyToGenerate();

    @IDynamicResourceExtension.MethodId("9381f3e4-fc07-11eb-a6b7-7fdf11ecb5f7")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> SecuritySubZones();

    @IDynamicResourceExtension.MethodId("c98353c7-f441-11ea-9b47-d76de0587caf")
    public java.lang.String ShortnameOrOverride();

    @IDynamicResourceExtension.MethodId("544e68a6-1db6-11eb-9d1c-a7ed1ac99c53")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent SystemComponent();

    @IDynamicResourceExtension.MethodId("6b20030a-4e0b-11ed-a85e-ff0e1a36b8ae")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfigurationProperty> SystemConfigurationProperties();

    @IDynamicResourceExtension.MethodId("b2b63790-2403-11eb-83b1-3d2a97975978")
    public java.lang.String SystemName();

    @IDynamicResourceExtension.MethodId("a30c72d2-883f-11e9-80ce-fbaba21c141b")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystem System();

    @IDynamicResourceExtension.MethodId("cc7b2d08-678f-11ea-b072-516c5e04c87a")
    public java.lang.String TypeName(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

    @IDynamicResourceExtension.MethodId("9227704f-e2da-11ee-bcaf-bf4e173adc8d")
    public java.lang.String TypeNameFromInterface(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

  }
  
  public static interface ISystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("1a231684-0675-11ec-b623-f16d27d7978c")
    public java.lang.Boolean IsDependsOnLinux(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration);

    @IDynamicResourceExtension.MethodId("9cdb6899-d18e-11ee-b624-ff4effe3da71")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.operatingsystem.javamodel.ILinuxSystemConfiguration GetDependsOnLinux(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration);

    @IDynamicResourceExtension.MethodId("492b3b22-14d9-11ea-a57d-f9a0d62ee07e")
    public java.lang.Boolean IsDependsOnWindows(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration);

    @IDynamicResourceExtension.MethodId("d3733cda-d18e-11ee-b624-ff4effe3da71")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.operatingsystem.javamodel.IWindowsSystemConfiguration GetDependsOnWindows(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration);

    @IDynamicResourceExtension.MethodId("f156a455-c767-11ee-88de-bb28abfdee0c")
    public java.lang.Boolean IsDependsOnVM(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration);

    @IDynamicResourceExtension.MethodId("c723b319-d192-11ee-b624-ff4effe3da71")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.virtualization.javamodel.IVirtualMachineSystemConfiguration GetDependsOnVM(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration);

    @IDynamicResourceExtension.MethodId("2a51e529-df6d-11e9-9827-a1514ee8d06a")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterface InterfaceType(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subzone, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration);

    @IDynamicResourceExtension.MethodId("4dd43ac6-6441-11ee-9870-a3a9b6fe8f95")
    public java.lang.Boolean IsConcrete(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration);

    @IDynamicResourceExtension.MethodId("2b39227b-c77f-11ea-b0b6-e5df79e86bc2")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> OnlyConcrete(final List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> systemConfigurationList);

    @IDynamicResourceExtension.MethodId("1e2f66c0-06bd-11ea-8f17-2da21adc8e34")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> OnlyToGenerate(final List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> systemConfigurationList);

    @IDynamicResourceExtension.MethodId("9227704f-e2da-11ee-bcaf-bf4e173adc8d")
    public java.lang.String TypeNameFromInterface(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration);

  }
  
  public static class SystemConfigurationFunctionsImpl implements ISystemConfigurationFunctionsImpl {

    public static final ISystemConfigurationFunctionsImpl INSTANCE = new SystemConfigurationFunctionsImpl();

    private SystemConfigurationFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsDependsOnLinux(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      /* Begin Protected Region [[1a231684-0675-11ec-b623-f16d27d7978c]] */
      return systemConfiguration.extension(ISystemConfigurationFunctions.class).AllDependsOnSystemConfiguration().stream().anyMatch(ILinuxSystemConfiguration.class::isInstance);
      /* End Protected Region   [[1a231684-0675-11ec-b623-f16d27d7978c]] */
    }

    @Override
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.operatingsystem.javamodel.ILinuxSystemConfiguration GetDependsOnLinux(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      /* Begin Protected Region [[9cdb6899-d18e-11ee-b624-ff4effe3da71]] */
      return systemConfiguration.extension(ISystemConfigurationFunctions.class).AllDependsOnSystemConfiguration().stream().filter(ILinuxSystemConfiguration.class::isInstance).map(ILinuxSystemConfiguration.class::cast).findFirst().orElse(null);
      /* End Protected Region   [[9cdb6899-d18e-11ee-b624-ff4effe3da71]] */
    }

    @Override
    public java.lang.Boolean IsDependsOnWindows(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      /* Begin Protected Region [[492b3b22-14d9-11ea-a57d-f9a0d62ee07e]] */
      return systemConfiguration.extension(ISystemConfigurationFunctions.class).AllDependsOnSystemConfiguration().stream().anyMatch(IWindowsSystemConfiguration.class::isInstance);
      /* End Protected Region   [[492b3b22-14d9-11ea-a57d-f9a0d62ee07e]] */
    }

    @Override
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.operatingsystem.javamodel.IWindowsSystemConfiguration GetDependsOnWindows(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      /* Begin Protected Region [[d3733cda-d18e-11ee-b624-ff4effe3da71]] */
      return systemConfiguration.extension(ISystemConfigurationFunctions.class).AllDependsOnSystemConfiguration().stream().filter(IWindowsSystemConfiguration.class::isInstance).map(IWindowsSystemConfiguration.class::cast).findFirst().orElse(null);
      /* End Protected Region   [[d3733cda-d18e-11ee-b624-ff4effe3da71]] */
    }

    @Override
    public java.lang.Boolean IsDependsOnVM(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      /* Begin Protected Region [[f156a455-c767-11ee-88de-bb28abfdee0c]] */
      return systemConfiguration.extension(ISystemConfigurationFunctions.class).AllDependsOnSystemConfiguration().stream().anyMatch(IVirtualMachineSystemConfiguration.class::isInstance);
      /* End Protected Region   [[f156a455-c767-11ee-88de-bb28abfdee0c]] */
    }

    @Override
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.virtualization.javamodel.IVirtualMachineSystemConfiguration GetDependsOnVM(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      /* Begin Protected Region [[c723b319-d192-11ee-b624-ff4effe3da71]] */
      return systemConfiguration.extension(ISystemConfigurationFunctions.class).AllDependsOnSystemConfiguration().stream().filter(IVirtualMachineSystemConfiguration.class::isInstance).map(IVirtualMachineSystemConfiguration.class::cast).findFirst().orElse(null);
      /* End Protected Region   [[c723b319-d192-11ee-b624-ff4effe3da71]] */
    }

    @Override
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterface InterfaceType(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subzone, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      /* Begin Protected Region [[2a51e529-df6d-11e9-9827-a1514ee8d06a]] */
      return systemConfiguration.selectInterface().values().stream().filter(x -> x.selectInterfaceInSecuritySubZone().equals(subzone)).findFirst().orElse(null);

      /* End Protected Region   [[2a51e529-df6d-11e9-9827-a1514ee8d06a]] */
    }

    @Override
    public java.lang.Boolean IsConcrete(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      /* Begin Protected Region [[4dd43ac6-6441-11ee-9870-a3a9b6fe8f95]] */
      return SystemConfiguration.selectToMeInheritServices(systemConfiguration).isEmpty();
      /* End Protected Region   [[4dd43ac6-6441-11ee-9870-a3a9b6fe8f95]] */
    }

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> OnlyConcrete(final List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> systemConfigurationList) {
      /* Begin Protected Region [[2b39227b-c77f-11ea-b0b6-e5df79e86bc2]] */
      return systemConfigurationList.stream().filter(this::IsConcrete).collect(Collectors.toList());
      /* End Protected Region   [[2b39227b-c77f-11ea-b0b6-e5df79e86bc2]] */
    }

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> OnlyToGenerate(final List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> systemConfigurationList) {
      /* Begin Protected Region [[1e2f66c0-06bd-11ea-8f17-2da21adc8e34]] */
      return systemConfigurationList.stream().filter(x -> (x.selectSkipHostGeneration() == null || !x.selectSkipHostGeneration().booleanValue())).collect(Collectors.toList());

      /* End Protected Region   [[1e2f66c0-06bd-11ea-8f17-2da21adc8e34]] */
    }

    @Override
    public java.lang.String TypeNameFromInterface(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      /* Begin Protected Region [[9227704f-e2da-11ee-bcaf-bf4e173adc8d]] */
    	final var ifc = systemConfiguration.selectInterface().get(securitySubZone.getResource());
    	if( ifc != null ) {
    		var shortName = ifc.selectOverrideShortName();
    		if (shortName != null ) {
    			return shortName;
    		}
    	}
    	final var sysCfg = systemConfiguration.extension(ISystemConfigurationFunctions.class);
    	return sysCfg.GetShortname();  
      /* End Protected Region   [[9227704f-e2da-11ee-bcaf-bf4e173adc8d]] */
    }

  }
  
  public static class SystemConfigurationFunctions {

    private SystemConfigurationFunctions() {}

    public static java.lang.Boolean IsDependsOnLinux(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      return DynamicResourceUtil.invoke(ISystemConfigurationFunctionsImpl.class, SystemConfigurationFunctionsImpl.INSTANCE, systemConfiguration).IsDependsOnLinux(systemConfiguration);
    }

    public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.operatingsystem.javamodel.ILinuxSystemConfiguration GetDependsOnLinux(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      return DynamicResourceUtil.invoke(ISystemConfigurationFunctionsImpl.class, SystemConfigurationFunctionsImpl.INSTANCE, systemConfiguration).GetDependsOnLinux(systemConfiguration);
    }

    public static java.lang.Boolean IsDependsOnWindows(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      return DynamicResourceUtil.invoke(ISystemConfigurationFunctionsImpl.class, SystemConfigurationFunctionsImpl.INSTANCE, systemConfiguration).IsDependsOnWindows(systemConfiguration);
    }

    public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.operatingsystem.javamodel.IWindowsSystemConfiguration GetDependsOnWindows(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      return DynamicResourceUtil.invoke(ISystemConfigurationFunctionsImpl.class, SystemConfigurationFunctionsImpl.INSTANCE, systemConfiguration).GetDependsOnWindows(systemConfiguration);
    }

    public static java.lang.Boolean IsDependsOnVM(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      return DynamicResourceUtil.invoke(ISystemConfigurationFunctionsImpl.class, SystemConfigurationFunctionsImpl.INSTANCE, systemConfiguration).IsDependsOnVM(systemConfiguration);
    }

    public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.virtualization.javamodel.IVirtualMachineSystemConfiguration GetDependsOnVM(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      return DynamicResourceUtil.invoke(ISystemConfigurationFunctionsImpl.class, SystemConfigurationFunctionsImpl.INSTANCE, systemConfiguration).GetDependsOnVM(systemConfiguration);
    }

    public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterface InterfaceType(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subzone, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      return DynamicResourceUtil.invoke(ISystemConfigurationFunctionsImpl.class, SystemConfigurationFunctionsImpl.INSTANCE, systemConfiguration).InterfaceType(subzone, systemConfiguration);
    }

    public static java.lang.Boolean IsConcrete(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      return DynamicResourceUtil.invoke(ISystemConfigurationFunctionsImpl.class, SystemConfigurationFunctionsImpl.INSTANCE, systemConfiguration).IsConcrete(systemConfiguration);
    }

    public static List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> OnlyConcrete(final List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> systemConfigurationList) {
      return DynamicResourceUtil.invoke(ISystemConfigurationFunctionsImpl.class, SystemConfigurationFunctionsImpl.INSTANCE, systemConfigurationList).OnlyConcrete(systemConfigurationList);
    }

    public static List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> OnlyToGenerate(final List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> systemConfigurationList) {
      return DynamicResourceUtil.invoke(ISystemConfigurationFunctionsImpl.class, SystemConfigurationFunctionsImpl.INSTANCE, systemConfigurationList).OnlyToGenerate(systemConfigurationList);
    }

    public static java.lang.String TypeNameFromInterface(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration) {
      return DynamicResourceUtil.invoke(ISystemConfigurationFunctionsImpl.class, SystemConfigurationFunctionsImpl.INSTANCE, systemConfiguration).TypeNameFromInterface(securitySubZone, systemConfiguration);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,25454e48-020d-11e9-b327-17da2da63a8f,xuJQfZRgCcKhtcY2c/kiIg4yXuw=] */
