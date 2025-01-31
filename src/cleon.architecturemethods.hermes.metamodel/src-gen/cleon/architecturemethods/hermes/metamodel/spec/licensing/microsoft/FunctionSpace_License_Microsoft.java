package cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b1e39890-dfcc-11ef-b0be-9b4cac321140,imports]] */
import cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.MicrosoftServerLicense;
/* End Protected Region   [[b1e39890-dfcc-11ef-b0be-9b4cac321140,imports]] */

public class FunctionSpace_License_Microsoft {

  /* Begin Protected Region [[b1e39890-dfcc-11ef-b0be-9b4cac321140]] */
  
  /* End Protected Region   [[b1e39890-dfcc-11ef-b0be-9b4cac321140]] */


  public static interface IWindowsServerHostLicensingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ce4b67f8-dfce-11ef-b0be-9b4cac321140")
    public cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftServerLicense DataCenterOrStandard();

    @IDynamicResourceExtension.MethodId("cedf3257-dfd0-11ef-b0be-9b4cac321140")
    public java.lang.Integer LicenseAmount();

    @IDynamicResourceExtension.MethodId("83c93536-dfde-11ef-8b41-bffcdee4ee9e")
    public java.lang.Integer GetVMCount();

  }
  
  public static interface IWindowsServerHostLicensingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("ce4b67f8-dfce-11ef-b0be-9b4cac321140")
    public cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftServerLicense DataCenterOrStandard(final cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IWindowsServerHostLicensing windowsServerHostLicensing);

    @IDynamicResourceExtension.MethodId("cedf3257-dfd0-11ef-b0be-9b4cac321140")
    public java.lang.Integer LicenseAmount(final cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IWindowsServerHostLicensing windowsServerHostLicensing);

  }
  
  public static class WindowsServerHostLicensingFunctionsImpl implements IWindowsServerHostLicensingFunctionsImpl {

    public static final IWindowsServerHostLicensingFunctionsImpl INSTANCE = new WindowsServerHostLicensingFunctionsImpl();

    private WindowsServerHostLicensingFunctionsImpl() {}

    @Override
    public cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftServerLicense DataCenterOrStandard(final cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IWindowsServerHostLicensing windowsServerHostLicensing) {
      /* Begin Protected Region [[ce4b67f8-dfce-11ef-b0be-9b4cac321140]] */
    	final var calculator = new MicrosoftServerLicenseCalculator(windowsServerHostLicensing.selectPhysicalCores(), windowsServerHostLicensing.selectVms() );
    	if (calculator.isUseDatacenter() ) {
    		return MicrosoftServerLicense.FACTORY.create(windowsServerHostLicensing.getRepository(), MicrosoftPackage.MicrosoftServerLicense_Datacenter);
    	} else {
        	return MicrosoftServerLicense.FACTORY.create(windowsServerHostLicensing.getRepository(), MicrosoftPackage.MicrosoftServerLicense_Standard);    		
    	}
      /* End Protected Region   [[ce4b67f8-dfce-11ef-b0be-9b4cac321140]] */
    }

    @Override
    public java.lang.Integer LicenseAmount(final cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IWindowsServerHostLicensing windowsServerHostLicensing) {
      /* Begin Protected Region [[cedf3257-dfd0-11ef-b0be-9b4cac321140]] */
    	final var calculator = new MicrosoftServerLicenseCalculator(windowsServerHostLicensing.selectPhysicalCores(), windowsServerHostLicensing.selectVms() );
    	if( calculator.isUseDatacenter()) {
    		return 0;
    	}
    	return calculator.getStandardLicenses();   
      /* End Protected Region   [[cedf3257-dfd0-11ef-b0be-9b4cac321140]] */
    }

  }
  
  public static class WindowsServerHostLicensingFunctions {

    private WindowsServerHostLicensingFunctions() {}

    public static cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftServerLicense DataCenterOrStandard(final cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IWindowsServerHostLicensing windowsServerHostLicensing) {
      return DynamicResourceUtil.invoke(IWindowsServerHostLicensingFunctionsImpl.class, WindowsServerHostLicensingFunctionsImpl.INSTANCE, windowsServerHostLicensing).DataCenterOrStandard(windowsServerHostLicensing);
    }

    public static java.lang.Integer LicenseAmount(final cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IWindowsServerHostLicensing windowsServerHostLicensing) {
      return DynamicResourceUtil.invoke(IWindowsServerHostLicensingFunctionsImpl.class, WindowsServerHostLicensingFunctionsImpl.INSTANCE, windowsServerHostLicensing).LicenseAmount(windowsServerHostLicensing);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b1e39890-dfcc-11ef-b0be-9b4cac321140,r8vu1xGzM20GeQz2NKS4WlBf124=] */
