package cleon.architecturemethods.hermes.metamodel.template.xml.licensing;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[e2cb080d-e45e-11ef-962f-1d8cbb5022ed,imports]] */

/* End Protected Region   [[e2cb080d-e45e-11ef-962f-1d8cbb5022ed,imports]] */

public class FunctionSpace_Xml_Licensing {

  /* Begin Protected Region [[e2cb080d-e45e-11ef-962f-1d8cbb5022ed]] */
  
  /* End Protected Region   [[e2cb080d-e45e-11ef-962f-1d8cbb5022ed]] */


  public static interface IAbstractProductLicensingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("207f8d7c-e463-11ef-a6bd-497168f25adc")
    public java.lang.String RenderLicense();

  }
  
  public static interface IAbstractProductLicensingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractProductLicensingFunctionsImpl implements IAbstractProductLicensingFunctionsImpl {

    public static final IAbstractProductLicensingFunctionsImpl INSTANCE = new AbstractProductLicensingFunctionsImpl();

    private AbstractProductLicensingFunctionsImpl() {}

  }
  
  public static class AbstractProductLicensingFunctions {

    private AbstractProductLicensingFunctions() {}

  }

  public static interface IOpenSourceLicenseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("54c92c50-e463-11ef-a6bd-497168f25adc")
    public java.lang.String RenderLicense();

  }
  
  public static interface IOpenSourceLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OpenSourceLicenseFunctionsImpl implements IOpenSourceLicenseFunctionsImpl {

    public static final IOpenSourceLicenseFunctionsImpl INSTANCE = new OpenSourceLicenseFunctionsImpl();

    private OpenSourceLicenseFunctionsImpl() {}

  }
  
  public static class OpenSourceLicenseFunctions {

    private OpenSourceLicenseFunctions() {}

  }

  public static interface IOpenMicrosoftLicenseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cf8d090-e463-11ef-a6bd-497168f25adc")
    public java.lang.String RenderLicense();

  }
  
  public static interface IOpenMicrosoftLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OpenMicrosoftLicenseFunctionsImpl implements IOpenMicrosoftLicenseFunctionsImpl {

    public static final IOpenMicrosoftLicenseFunctionsImpl INSTANCE = new OpenMicrosoftLicenseFunctionsImpl();

    private OpenMicrosoftLicenseFunctionsImpl() {}

  }
  
  public static class OpenMicrosoftLicenseFunctions {

    private OpenMicrosoftLicenseFunctions() {}

  }

  public static interface IOpenVmwareLicenseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5e1b7ee8-e463-11ef-a6bd-497168f25adc")
    public java.lang.String RenderLicense();

  }
  
  public static interface IOpenVmwareLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OpenVmwareLicenseFunctionsImpl implements IOpenVmwareLicenseFunctionsImpl {

    public static final IOpenVmwareLicenseFunctionsImpl INSTANCE = new OpenVmwareLicenseFunctionsImpl();

    private OpenVmwareLicenseFunctionsImpl() {}

  }
  
  public static class OpenVmwareLicenseFunctions {

    private OpenVmwareLicenseFunctions() {}

  }

  public static interface INoLicenseRequiredFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("94aaf799-e49f-11ef-a6bd-497168f25adc")
    public java.lang.String RenderLicense();

  }
  
  public static interface INoLicenseRequiredFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NoLicenseRequiredFunctionsImpl implements INoLicenseRequiredFunctionsImpl {

    public static final INoLicenseRequiredFunctionsImpl INSTANCE = new NoLicenseRequiredFunctionsImpl();

    private NoLicenseRequiredFunctionsImpl() {}

  }
  
  public static class NoLicenseRequiredFunctions {

    private NoLicenseRequiredFunctions() {}

  }

  public static interface IProductLicensingForEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1567ac02-e465-11ef-a6bd-497168f25adc")
    public java.lang.String RenderLicense();

    @IDynamicResourceExtension.MethodId("ea2a8696-e465-11ef-a6bd-497168f25adc")
    public java.lang.String RenderProductEnvironmentLicense();

  }
  
  public static interface IProductLicensingForEnvironmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProductLicensingForEnvironmentFunctionsImpl implements IProductLicensingForEnvironmentFunctionsImpl {

    public static final IProductLicensingForEnvironmentFunctionsImpl INSTANCE = new ProductLicensingForEnvironmentFunctionsImpl();

    private ProductLicensingForEnvironmentFunctionsImpl() {}

  }
  
  public static class ProductLicensingForEnvironmentFunctions {

    private ProductLicensingForEnvironmentFunctions() {}

  }

  public static interface IAbstractProductEnvironmentLicensingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b1465104-e465-11ef-a6bd-497168f25adc")
    public java.lang.String RenderLicense(final cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IProductLicensingForEnvironment productLicensingForEnvironment);

  }
  
  public static interface IAbstractProductEnvironmentLicensingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractProductEnvironmentLicensingFunctionsImpl implements IAbstractProductEnvironmentLicensingFunctionsImpl {

    public static final IAbstractProductEnvironmentLicensingFunctionsImpl INSTANCE = new AbstractProductEnvironmentLicensingFunctionsImpl();

    private AbstractProductEnvironmentLicensingFunctionsImpl() {}

  }
  
  public static class AbstractProductEnvironmentLicensingFunctions {

    private AbstractProductEnvironmentLicensingFunctions() {}

  }

  public static interface IUserLicenseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1840ed3c-e466-11ef-a6bd-497168f25adc")
    public java.lang.String RenderLicense(final cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IProductLicensingForEnvironment productLicensingForEnvironment);

  }
  
  public static interface IUserLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class UserLicenseFunctionsImpl implements IUserLicenseFunctionsImpl {

    public static final IUserLicenseFunctionsImpl INSTANCE = new UserLicenseFunctionsImpl();

    private UserLicenseFunctionsImpl() {}

  }
  
  public static class UserLicenseFunctions {

    private UserLicenseFunctions() {}

  }

  public static interface IPerInstanceLicenseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8b41d85b-e466-11ef-a6bd-497168f25adc")
    public java.lang.String RenderLicense(final cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IProductLicensingForEnvironment productLicensingForEnvironment);

  }
  
  public static interface IPerInstanceLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PerInstanceLicenseFunctionsImpl implements IPerInstanceLicenseFunctionsImpl {

    public static final IPerInstanceLicenseFunctionsImpl INSTANCE = new PerInstanceLicenseFunctionsImpl();

    private PerInstanceLicenseFunctionsImpl() {}

  }
  
  public static class PerInstanceLicenseFunctions {

    private PerInstanceLicenseFunctions() {}

  }

  public static interface IWindowsServerLicenseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2fff27bc-e467-11ef-a6bd-497168f25adc")
    public java.lang.String RenderLicense(final cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IProductLicensingForEnvironment productLicensingForEnvironment);

  }
  
  public static interface IWindowsServerLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WindowsServerLicenseFunctionsImpl implements IWindowsServerLicenseFunctionsImpl {

    public static final IWindowsServerLicenseFunctionsImpl INSTANCE = new WindowsServerLicenseFunctionsImpl();

    private WindowsServerLicenseFunctionsImpl() {}

  }
  
  public static class WindowsServerLicenseFunctions {

    private WindowsServerLicenseFunctions() {}

  }

  public static interface IRhelServerLicenseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("10a5fd47-e468-11ef-a6bd-497168f25adc")
    public java.lang.String RenderLicense(final cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IProductLicensingForEnvironment productLicensingForEnvironment);

  }
  
  public static interface IRhelServerLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RhelServerLicenseFunctionsImpl implements IRhelServerLicenseFunctionsImpl {

    public static final IRhelServerLicenseFunctionsImpl INSTANCE = new RhelServerLicenseFunctionsImpl();

    private RhelServerLicenseFunctionsImpl() {}

  }
  
  public static class RhelServerLicenseFunctions {

    private RhelServerLicenseFunctions() {}

  }

  public static interface IVmwareEsxiServerLicenseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ed1e85ab-e4a2-11ef-a6bd-497168f25adc")
    public java.lang.String RenderLicense(final cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IProductLicensingForEnvironment productLicensingForEnvironment);

  }
  
  public static interface IVmwareEsxiServerLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VmwareEsxiServerLicenseFunctionsImpl implements IVmwareEsxiServerLicenseFunctionsImpl {

    public static final IVmwareEsxiServerLicenseFunctionsImpl INSTANCE = new VmwareEsxiServerLicenseFunctionsImpl();

    private VmwareEsxiServerLicenseFunctionsImpl() {}

  }
  
  public static class VmwareEsxiServerLicenseFunctions {

    private VmwareEsxiServerLicenseFunctions() {}

  }

  public static interface IVeeamAvailabilitySuiteLicenseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("665de6ee-e4b8-11ef-a6bd-497168f25adc")
    public java.lang.String RenderLicense(final cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IProductLicensingForEnvironment productLicensingForEnvironment);

  }
  
  public static interface IVeeamAvailabilitySuiteLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VeeamAvailabilitySuiteLicenseFunctionsImpl implements IVeeamAvailabilitySuiteLicenseFunctionsImpl {

    public static final IVeeamAvailabilitySuiteLicenseFunctionsImpl INSTANCE = new VeeamAvailabilitySuiteLicenseFunctionsImpl();

    private VeeamAvailabilitySuiteLicenseFunctionsImpl() {}

  }
  
  public static class VeeamAvailabilitySuiteLicenseFunctions {

    private VeeamAvailabilitySuiteLicenseFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,e2cb080d-e45e-11ef-962f-1d8cbb5022ed,auRmLpSTxHE4L+E3nOuwrzu1Cl8=] */
