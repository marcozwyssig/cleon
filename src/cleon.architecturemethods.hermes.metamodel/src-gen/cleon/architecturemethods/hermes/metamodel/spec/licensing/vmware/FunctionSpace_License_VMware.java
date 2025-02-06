package cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c5e74e74-e4a2-11ef-a6bd-497168f25adc,imports]] */

/* End Protected Region   [[c5e74e74-e4a2-11ef-a6bd-497168f25adc,imports]] */

public class FunctionSpace_License_VMware {

  /* Begin Protected Region [[c5e74e74-e4a2-11ef-a6bd-497168f25adc]] */
  
  /* End Protected Region   [[c5e74e74-e4a2-11ef-a6bd-497168f25adc]] */


  public static interface IVMwareEsxiHostLicensingFunctions extends IDynamicResourceExtension {

  }
  
  public static interface IVMwareEsxiHostLicensingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VMwareEsxiHostLicensingFunctionsImpl implements IVMwareEsxiHostLicensingFunctionsImpl {

    public static final IVMwareEsxiHostLicensingFunctionsImpl INSTANCE = new VMwareEsxiHostLicensingFunctionsImpl();

    private VMwareEsxiHostLicensingFunctionsImpl() {}

  }
  
  public static class VMwareEsxiHostLicensingFunctions {

    private VMwareEsxiHostLicensingFunctions() {}

  }

  public static interface IVmwareEsxiServerLicenseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8c890ac4-e4a6-11ef-a6bd-497168f25adc")
    public List<java.lang.Integer> TotalCores();

    @IDynamicResourceExtension.MethodId("a807c400-e4a6-11ef-a6bd-497168f25adc")
    public java.lang.Integer SumTotalCore();

    @IDynamicResourceExtension.MethodId("03cbc874-e4a8-11ef-a6bd-497168f25adc")
    public java.lang.Integer TotalHosts();

    @IDynamicResourceExtension.MethodId("a0f9042b-e4a7-11ef-a6bd-497168f25adc")
    public java.lang.String RecommendedLicense();

    @IDynamicResourceExtension.MethodId("a7f90260-e4a7-11ef-a6bd-497168f25adc")
    public java.lang.Integer RequiredLicenses();

  }
  
  public static interface IVmwareEsxiServerLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("a0f9042b-e4a7-11ef-a6bd-497168f25adc")
    public java.lang.String RecommendedLicense(final cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVmwareEsxiServerLicense vmwareEsxiServerLicense);

    @IDynamicResourceExtension.MethodId("a7f90260-e4a7-11ef-a6bd-497168f25adc")
    public java.lang.Integer RequiredLicenses(final cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVmwareEsxiServerLicense vmwareEsxiServerLicense);

  }
  
  public static class VmwareEsxiServerLicenseFunctionsImpl implements IVmwareEsxiServerLicenseFunctionsImpl {

    public static final IVmwareEsxiServerLicenseFunctionsImpl INSTANCE = new VmwareEsxiServerLicenseFunctionsImpl();

    private VmwareEsxiServerLicenseFunctionsImpl() {}

    @Override
    public java.lang.String RecommendedLicense(final cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVmwareEsxiServerLicense vmwareEsxiServerLicense) {
      /* Begin Protected Region [[a0f9042b-e4a7-11ef-a6bd-497168f25adc]] */
    	final var functions = vmwareEsxiServerLicense.extension(IVmwareEsxiServerLicenseFunctions.class);
    	return new VMWareEsxiLicenseCalculator(functions.TotalHosts(), functions.SumTotalCore()).getRecommendedLicense(); 
      /* End Protected Region   [[a0f9042b-e4a7-11ef-a6bd-497168f25adc]] */
    }

    @Override
    public java.lang.Integer RequiredLicenses(final cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVmwareEsxiServerLicense vmwareEsxiServerLicense) {
      /* Begin Protected Region [[a7f90260-e4a7-11ef-a6bd-497168f25adc]] */
    	final var functions = vmwareEsxiServerLicense.extension(IVmwareEsxiServerLicenseFunctions.class);
    	return new VMWareEsxiLicenseCalculator(functions.TotalHosts(), functions.SumTotalCore()).getRequiredLicenses(); 
      /* End Protected Region   [[a7f90260-e4a7-11ef-a6bd-497168f25adc]] */
    }

  }
  
  public static class VmwareEsxiServerLicenseFunctions {

    private VmwareEsxiServerLicenseFunctions() {}

    public static java.lang.String RecommendedLicense(final cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVmwareEsxiServerLicense vmwareEsxiServerLicense) {
      return DynamicResourceUtil.invoke(IVmwareEsxiServerLicenseFunctionsImpl.class, VmwareEsxiServerLicenseFunctionsImpl.INSTANCE, vmwareEsxiServerLicense).RecommendedLicense(vmwareEsxiServerLicense);
    }

    public static java.lang.Integer RequiredLicenses(final cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVmwareEsxiServerLicense vmwareEsxiServerLicense) {
      return DynamicResourceUtil.invoke(IVmwareEsxiServerLicenseFunctionsImpl.class, VmwareEsxiServerLicenseFunctionsImpl.INSTANCE, vmwareEsxiServerLicense).RequiredLicenses(vmwareEsxiServerLicense);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c5e74e74-e4a2-11ef-a6bd-497168f25adc,NDlimHkUnlIQ8GHTugp+PputfVo=] */
