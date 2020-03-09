package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[25454e48-020d-11e9-b327-17da2da63a8f,imports]] */

/* End Protected Region   [[25454e48-020d-11e9-b327-17da2da63a8f,imports]] */

public class FunctionSpace_SystemConfiguration {

  /* Begin Protected Region [[25454e48-020d-11e9-b327-17da2da63a8f]] */
  
  /* End Protected Region   [[25454e48-020d-11e9-b327-17da2da63a8f]] */


  public static interface ISystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("30b54ff7-020d-11e9-b327-17da2da63a8f")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("3364ecb7-021d-11e9-b327-17da2da63a8f")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("3d777d38-0ab5-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

    @IDynamicResourceExtension.MethodId("0ea917ac-0e91-11e9-9f19-6d15636f4ecc")
    public java.lang.String GetSimpleName();

    @IDynamicResourceExtension.MethodId("16d2f46d-2abd-11e9-a3f8-336d9e792e17")
    public java.lang.String GetMaterialTypeName();

  }
  
  public static interface ISystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("3d777d38-0ab5-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration);

  }
  
  public static class SystemConfigurationFunctionsImpl implements ISystemConfigurationFunctionsImpl {

    public static final ISystemConfigurationFunctionsImpl INSTANCE = new SystemConfigurationFunctionsImpl();

    private SystemConfigurationFunctionsImpl() {}

    @Override
    public java.lang.String GetIncludePath(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration) {
      return null;
    }

  }
  
  public static class SystemConfigurationFunctions {

    private SystemConfigurationFunctions() {}

    public static java.lang.String GetIncludePath(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration) {
      return DynamicResourceUtil.invoke(ISystemConfigurationFunctionsImpl.class, SystemConfigurationFunctionsImpl.INSTANCE, systemConfiguration).GetIncludePath(systemConfiguration);
    }

  }

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

  public static interface IMasterActiveDirectorySystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d640244f-0aa5-11e9-8a91-633e556ac68f")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("5affc9c4-0ab2-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IMasterActiveDirectorySystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MasterActiveDirectorySystemConfigurationFunctionsImpl implements IMasterActiveDirectorySystemConfigurationFunctionsImpl {

    public static final IMasterActiveDirectorySystemConfigurationFunctionsImpl INSTANCE = new MasterActiveDirectorySystemConfigurationFunctionsImpl();

    private MasterActiveDirectorySystemConfigurationFunctionsImpl() {}

  }
  
  public static class MasterActiveDirectorySystemConfigurationFunctions {

    private MasterActiveDirectorySystemConfigurationFunctions() {}

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

    @IDynamicResourceExtension.MethodId("39f8e143-02c7-11e9-9e58-33d596257b14")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("39f8e146-02c7-11e9-9e58-33d596257b14")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("ac6a40b2-02c8-11e9-9e58-33d596257b14")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("ac6a40b5-02c8-11e9-9e58-33d596257b14")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("d56b0d06-02cb-11e9-9e58-33d596257b14")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("d56b0d09-02cb-11e9-9e58-33d596257b14")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("e4bf4ec0-02cb-11e9-9e58-33d596257b14")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("e4bf4ec3-02cb-11e9-9e58-33d596257b14")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("abd4ba7e-02cc-11e9-9e58-33d596257b14")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("abd4ba81-02cc-11e9-9e58-33d596257b14")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("abdbca05-02cd-11e9-9e58-33d596257b14")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("abdbca08-02cd-11e9-9e58-33d596257b14")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("4ce96921-02d7-11e9-9e58-33d596257b14")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("4ce96924-02d7-11e9-9e58-33d596257b14")
    public java.lang.String GetName();

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

  public static interface ISlaveActiveDirectorySystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0e5e8266-09eb-11e9-abef-3d869859c931")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("0e5e8269-09eb-11e9-abef-3d869859c931")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("7d9b94f0-0ab4-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("7d9b94f3-0ab4-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface ISlaveActiveDirectorySystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SlaveActiveDirectorySystemConfigurationFunctionsImpl implements ISlaveActiveDirectorySystemConfigurationFunctionsImpl {

    public static final ISlaveActiveDirectorySystemConfigurationFunctionsImpl INSTANCE = new SlaveActiveDirectorySystemConfigurationFunctionsImpl();

    private SlaveActiveDirectorySystemConfigurationFunctionsImpl() {}

  }
  
  public static class SlaveActiveDirectorySystemConfigurationFunctions {

    private SlaveActiveDirectorySystemConfigurationFunctions() {}

  }

  public static interface IDhcpSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("dccf5d98-09ec-11e9-abef-3d869859c931")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("dccf5d9b-09ec-11e9-abef-3d869859c931")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("26eb768a-09ef-11e9-abef-3d869859c931")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("26eb768d-09ef-11e9-abef-3d869859c931")
    public java.lang.String GetName();

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

  public static interface IVeeamBackupManagementSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("37bcd34a-09f5-11e9-abef-3d869859c931")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("37bcd34d-09f5-11e9-abef-3d869859c931")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("616320ce-0ab7-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("616320d1-0ab7-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IVeeamBackupManagementSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VeeamBackupManagementSystemConfigurationFunctionsImpl implements IVeeamBackupManagementSystemConfigurationFunctionsImpl {

    public static final IVeeamBackupManagementSystemConfigurationFunctionsImpl INSTANCE = new VeeamBackupManagementSystemConfigurationFunctionsImpl();

    private VeeamBackupManagementSystemConfigurationFunctionsImpl() {}

  }
  
  public static class VeeamBackupManagementSystemConfigurationFunctions {

    private VeeamBackupManagementSystemConfigurationFunctions() {}

  }

  public static interface IVeeamBackupProxySystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8b1347-09f5-11e9-abef-3d869859c931")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("9f8b134a-09f5-11e9-abef-3d869859c931")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("5fe3d3ac-0ab7-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("5fe3d3af-0ab7-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IVeeamBackupProxySystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VeeamBackupProxySystemConfigurationFunctionsImpl implements IVeeamBackupProxySystemConfigurationFunctionsImpl {

    public static final IVeeamBackupProxySystemConfigurationFunctionsImpl INSTANCE = new VeeamBackupProxySystemConfigurationFunctionsImpl();

    private VeeamBackupProxySystemConfigurationFunctionsImpl() {}

  }
  
  public static class VeeamBackupProxySystemConfigurationFunctions {

    private VeeamBackupProxySystemConfigurationFunctions() {}

  }

  public static interface IVeeamBackupRepositorySystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("caba11f9-09f5-11e9-abef-3d869859c931")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("caba11fc-09f5-11e9-abef-3d869859c931")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("3412f010-0ab7-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("3412f013-0ab7-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IVeeamBackupRepositorySystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VeeamBackupRepositorySystemConfigurationFunctionsImpl implements IVeeamBackupRepositorySystemConfigurationFunctionsImpl {

    public static final IVeeamBackupRepositorySystemConfigurationFunctionsImpl INSTANCE = new VeeamBackupRepositorySystemConfigurationFunctionsImpl();

    private VeeamBackupRepositorySystemConfigurationFunctionsImpl() {}

  }
  
  public static class VeeamBackupRepositorySystemConfigurationFunctions {

    private VeeamBackupRepositorySystemConfigurationFunctions() {}

  }

  public static interface IProxySystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("43f32f3b-09fc-11e9-abef-3d869859c931")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("43f32f3e-09fc-11e9-abef-3d869859c931")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("68b117ae-0ab7-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("68b117b1-0ab7-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IProxySystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProxySystemConfigurationFunctionsImpl implements IProxySystemConfigurationFunctionsImpl {

    public static final IProxySystemConfigurationFunctionsImpl INSTANCE = new ProxySystemConfigurationFunctionsImpl();

    private ProxySystemConfigurationFunctionsImpl() {}

  }
  
  public static class ProxySystemConfigurationFunctions {

    private ProxySystemConfigurationFunctions() {}

  }

  public static interface IPulseSecureApplianceSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("78a8fff2-0a7a-11e9-a59d-d7a0c53e291c")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("78a8fff5-0a7a-11e9-a59d-d7a0c53e291c")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("27b5a1d8-0a7f-11e9-a59d-d7a0c53e291c")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("27b5a1db-0a7f-11e9-a59d-d7a0c53e291c")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("3dd00cc9-0a7f-11e9-a59d-d7a0c53e291c")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("3dd00ccc-0a7f-11e9-a59d-d7a0c53e291c")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("402db23d-0a87-11e9-a59d-d7a0c53e291c")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("402db240-0a87-11e9-a59d-d7a0c53e291c")
    public java.lang.String GetName();

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

  public static interface IStorageSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0e1f8f25-0a88-11e9-a59d-d7a0c53e291c")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("0e1f8f28-0a88-11e9-a59d-d7a0c53e291c")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("9ec6e000-0ab6-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("9ec6e003-0ab6-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IStorageSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class StorageSystemConfigurationFunctionsImpl implements IStorageSystemConfigurationFunctionsImpl {

    public static final IStorageSystemConfigurationFunctionsImpl INSTANCE = new StorageSystemConfigurationFunctionsImpl();

    private StorageSystemConfigurationFunctionsImpl() {}

  }
  
  public static class StorageSystemConfigurationFunctions {

    private StorageSystemConfigurationFunctions() {}

  }

  public static interface IPrtgSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("606be97d-0a8a-11e9-a59d-d7a0c53e291c")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("606be980-0a8a-11e9-a59d-d7a0c53e291c")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("1d7e3f72-0c2f-11e9-83ba-4d57b06560a2")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("1d7e3f75-0c2f-11e9-83ba-4d57b06560a2")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("ae187c3d-0c39-11e9-83ba-4d57b06560a2")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("ae187c40-0c39-11e9-83ba-4d57b06560a2")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("2f23ea84-0c3a-11e9-83ba-4d57b06560a2")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("2f23ea87-0c3a-11e9-83ba-4d57b06560a2")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("f5bc9b12-0c3c-11e9-83ba-4d57b06560a2")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("f5bc9b15-0c3c-11e9-83ba-4d57b06560a2")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("bb8c67d8-0c3d-11e9-83ba-4d57b06560a2")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("bb8c67db-0c3d-11e9-83ba-4d57b06560a2")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("82aabb22-1d8a-11e9-b601-db75aa6f89a4")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("82aabb25-1d8a-11e9-b601-db75aa6f89a4")
    public java.lang.String GetName();

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

    @IDynamicResourceExtension.MethodId("0184c8b4-02bb-11e9-9e58-33d596257b14")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("0184c8b7-02bb-11e9-9e58-33d596257b14")
    public java.lang.String GetName();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,25454e48-020d-11e9-b327-17da2da63a8f,KHq1JWmszgMj3u7JRUr7A0juF7s=] */
