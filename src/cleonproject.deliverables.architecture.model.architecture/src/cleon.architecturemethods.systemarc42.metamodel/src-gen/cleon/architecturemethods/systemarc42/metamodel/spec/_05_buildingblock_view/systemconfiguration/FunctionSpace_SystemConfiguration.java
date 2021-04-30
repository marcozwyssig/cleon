package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[25454e48-020d-11e9-b327-17da2da63a8f,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.SystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.IInterface;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.FunctionSpace_Services.IAbstractServiceFunctions;
import ch.actifsource.core.Resource;
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

  public static interface IRootCASystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("48364d16-0ab4-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

    @IDynamicResourceExtension.MethodId("48364d19-0ab4-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

  }
  
  public static interface IRootCASystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RootCASystemConfigurationFunctionsImpl implements IRootCASystemConfigurationFunctionsImpl {

    public static final IRootCASystemConfigurationFunctionsImpl INSTANCE = new RootCASystemConfigurationFunctionsImpl();

    private RootCASystemConfigurationFunctionsImpl() {}

  }
  
  public static class RootCASystemConfigurationFunctions {

    private RootCASystemConfigurationFunctions() {}

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

  public static interface IReadOnlyDomainControllerFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7d9b94f0-0ab4-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("7d9b94f3-0ab4-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IReadOnlyDomainControllerFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ReadOnlyDomainControllerFunctionsImpl implements IReadOnlyDomainControllerFunctionsImpl {

    public static final IReadOnlyDomainControllerFunctionsImpl INSTANCE = new ReadOnlyDomainControllerFunctionsImpl();

    private ReadOnlyDomainControllerFunctionsImpl() {}

  }
  
  public static class ReadOnlyDomainControllerFunctions {

    private ReadOnlyDomainControllerFunctions() {}

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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> SelectAllowedServices();

  }
  
  public static interface IInterfaceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f6f77375-c837-11ea-a92a-436f8b822db6")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> SelectAllowedServices(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.IInterface interface_);

  }
  
  public static class InterfaceFunctionsImpl implements IInterfaceFunctionsImpl {

    public static final IInterfaceFunctionsImpl INSTANCE = new InterfaceFunctionsImpl();

    private InterfaceFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> SelectAllowedServices(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.IInterface interface_) {
      /* Begin Protected Region [[f6f77375-c837-11ea-a92a-436f8b822db6]] */
      final Set<IAbstractService> services = new HashSet<>();
      for( final IAbstractService service : interface_.selectProvidesService()) {
      	services.addAll(service.extension(IAbstractServiceFunctions.class).All());
      }

      final ISystemConfiguration sysCfg = SystemConfiguration.selectToMeInterface(interface_);
      final List<ISystemConfiguration> dependsOn = sysCfg.extension(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.FunctionSpace_SystemArc42_BuildingBlockView.ISystemConfigurationFunctions.class).GetAllDependsOn();

      final Resource selectInterfaceInSecuritySubZone = interface_.selectInterfaceInSecuritySubZone().getResource();

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

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> SelectAllowedServices(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.IInterface interface_) {
      return DynamicResourceUtil.invoke(IInterfaceFunctionsImpl.class, InterfaceFunctionsImpl.INSTANCE, interface_).SelectAllowedServices(interface_);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,25454e48-020d-11e9-b327-17da2da63a8f,sz4h/TPjfheRnwi8ATi9rIq54HM=] */
