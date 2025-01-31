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


  public static interface IWindowsIOTLicenseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b6ea85dd-dfcc-11ef-b0be-9b4cac321140")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> AllWindowsInstances();

    @IDynamicResourceExtension.MethodId("0e1cc1cc-dfcd-11ef-b0be-9b4cac321140")
    public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant ProductVariant();

    @IDynamicResourceExtension.MethodId("dd11ddd8-dfcd-11ef-b0be-9b4cac321140")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> AllWindowsProductInstances();

  }
  
  public static interface IWindowsIOTLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("dd11ddd8-dfcd-11ef-b0be-9b4cac321140")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> AllWindowsProductInstances(final cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IWindowsIOTLicense windowsIOTLicense);

  }
  
  public static class WindowsIOTLicenseFunctionsImpl implements IWindowsIOTLicenseFunctionsImpl {

    public static final IWindowsIOTLicenseFunctionsImpl INSTANCE = new WindowsIOTLicenseFunctionsImpl();

    private WindowsIOTLicenseFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> AllWindowsProductInstances(final cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IWindowsIOTLicense windowsIOTLicense) {
      /* Begin Protected Region [[dd11ddd8-dfcd-11ef-b0be-9b4cac321140]] */
    	final var functions = windowsIOTLicense.extension(IWindowsIOTLicenseFunctions.class);
    	return BuildNodeFunctionsImpl.INSTANCE.OnlyProductVariant(functions.ProductVariant(), functions.AllWindowsInstances());
      /* End Protected Region   [[dd11ddd8-dfcd-11ef-b0be-9b4cac321140]] */
    }

  }
  
  public static class WindowsIOTLicenseFunctions {

    private WindowsIOTLicenseFunctions() {}

    public static List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> AllWindowsProductInstances(final cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IWindowsIOTLicense windowsIOTLicense) {
      return DynamicResourceUtil.invoke(IWindowsIOTLicenseFunctionsImpl.class, WindowsIOTLicenseFunctionsImpl.INSTANCE, windowsIOTLicense).AllWindowsProductInstances(windowsIOTLicense);
    }

  }

  public static interface IBuildNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("385ec7fe-dfcd-11ef-b0be-9b4cac321140")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> OnlyProductVariant(final cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant product_variant);

  }
  
  public static interface IBuildNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("385ec7fe-dfcd-11ef-b0be-9b4cac321140")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> OnlyProductVariant(final cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant product_variant, final List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> buildNodeList);

  }
  
  public static class BuildNodeFunctionsImpl implements IBuildNodeFunctionsImpl {

    public static final IBuildNodeFunctionsImpl INSTANCE = new BuildNodeFunctionsImpl();

    private BuildNodeFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> OnlyProductVariant(final cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant product_variant, final List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      /* Begin Protected Region [[385ec7fe-dfcd-11ef-b0be-9b4cac321140]] */
    	return buildNodeList.stream().filter(x -> x.selectProductVariants().contains(product_variant)).toList();
      /* End Protected Region   [[385ec7fe-dfcd-11ef-b0be-9b4cac321140]] */
    }

  }
  
  public static class BuildNodeFunctions {

    private BuildNodeFunctions() {}

    public static List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> OnlyProductVariant(final cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant product_variant, final List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNodeList).OnlyProductVariant(product_variant, buildNodeList);
    }

  }

  public static interface IWindowsServerHostLicensingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ce4b67f8-dfce-11ef-b0be-9b4cac321140")
    public cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftServerLicense DataCenterOrStandard();

    @IDynamicResourceExtension.MethodId("cedf3257-dfd0-11ef-b0be-9b4cac321140")
    public java.lang.Integer LicenseAmount();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b1e39890-dfcc-11ef-b0be-9b4cac321140,1ht2mtuobyXWC4brZR+ij7af5XQ=] */
