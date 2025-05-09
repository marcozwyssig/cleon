package cleon.architecturemethods.hermes.metamodel.spec.licensing.veeam;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7fb6fac6-e4bb-11ef-a6bd-497168f25adc,imports]] */

/* End Protected Region   [[7fb6fac6-e4bb-11ef-a6bd-497168f25adc,imports]] */

public class FunctionSpace_License_Veeam {

  /* Begin Protected Region [[7fb6fac6-e4bb-11ef-a6bd-497168f25adc]] */
  
  /* End Protected Region   [[7fb6fac6-e4bb-11ef-a6bd-497168f25adc]] */


  public static interface IVeeamAvailabilitySuiteLicenseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8c966b29-e4bb-11ef-a6bd-497168f25adc")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware> AllSystemConfigurationWhereMustBeBackuped();

    @IDynamicResourceExtension.MethodId("e05d41b5-e4bb-11ef-a6bd-497168f25adc")
    public List<ch.actifsource.core.javamodel.IDecorator> GetAllVMsWhereMustBeBackups();

    @IDynamicResourceExtension.MethodId("155a03c9-e4bc-11ef-a6bd-497168f25adc")
    public List<ch.actifsource.core.javamodel.IDecorator> GetAllHosts(final ch.actifsource.core.javamodel.INamedResource systemEnvironment);

    @IDynamicResourceExtension.MethodId("5f326fd5-e4bc-11ef-a6bd-497168f25adc")
    public List<ch.actifsource.core.javamodel.IDecorator> GetAllVMs(final ch.actifsource.core.javamodel.INamedResource systemEnvironment);

    @IDynamicResourceExtension.MethodId("a60a1da8-e4bc-11ef-a6bd-497168f25adc")
    public ch.actifsource.core.javamodel.INamedResource Environment();

    @IDynamicResourceExtension.MethodId("23b135ac-e4be-11ef-a6bd-497168f25adc")
    public java.lang.String RecommendedLicense();

    @IDynamicResourceExtension.MethodId("23b135ae-e4be-11ef-a6bd-497168f25adc")
    public java.lang.Integer RequiredLicenses();

    @IDynamicResourceExtension.MethodId("4c0f1d02-e4bf-11ef-a6bd-497168f25adc")
    public List<java.lang.Integer> TotalSockets();

    @IDynamicResourceExtension.MethodId("4c0f1d11-e4bf-11ef-a6bd-497168f25adc")
    public java.lang.Integer SumTotalSockets();

  }
  
  public static interface IVeeamAvailabilitySuiteLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("e05d41b5-e4bb-11ef-a6bd-497168f25adc")
    public List<ch.actifsource.core.javamodel.IDecorator> GetAllVMsWhereMustBeBackups(final ch.actifsource.core.javamodel.IDecorator veeamAvailabilitySuiteLicense);

    @IDynamicResourceExtension.MethodId("23b135ac-e4be-11ef-a6bd-497168f25adc")
    public java.lang.String RecommendedLicense(final ch.actifsource.core.javamodel.IDecorator veeamAvailabilitySuiteLicense);

    @IDynamicResourceExtension.MethodId("23b135ae-e4be-11ef-a6bd-497168f25adc")
    public java.lang.Integer RequiredLicenses(final ch.actifsource.core.javamodel.IDecorator veeamAvailabilitySuiteLicense);

  }
  
  public static class VeeamAvailabilitySuiteLicenseFunctionsImpl implements IVeeamAvailabilitySuiteLicenseFunctionsImpl {

    public static final IVeeamAvailabilitySuiteLicenseFunctionsImpl INSTANCE = new VeeamAvailabilitySuiteLicenseFunctionsImpl();

    private VeeamAvailabilitySuiteLicenseFunctionsImpl() {}

    @Override
    public List<ch.actifsource.core.javamodel.IDecorator> GetAllVMsWhereMustBeBackups(final ch.actifsource.core.javamodel.IDecorator veeamAvailabilitySuiteLicense) {
      /* Begin Protected Region [[e05d41b5-e4bb-11ef-a6bd-497168f25adc]] */
    	final var functions = veeamAvailabilitySuiteLicense.extension(IVeeamAvailabilitySuiteLicenseFunctions.class);
    	return veeamAvailabilitySuiteLicense.extension(IVeeamAvailabilitySuiteLicenseFunctions.class).GetAllVMs(functions.Environment());
      /* End Protected Region   [[e05d41b5-e4bb-11ef-a6bd-497168f25adc]] */
    }

    @Override
    public java.lang.String RecommendedLicense(final ch.actifsource.core.javamodel.IDecorator veeamAvailabilitySuiteLicense) {
      /* Begin Protected Region [[23b135ac-e4be-11ef-a6bd-497168f25adc]] */
    	return new VeeamLicenseCalculator( veeamAvailabilitySuiteLicense.selectTotalSockets(), veeamAvailabilitySuiteLicense.selectVmsToBackup().size()).getRecommendedLicense();   
      /* End Protected Region   [[23b135ac-e4be-11ef-a6bd-497168f25adc]] */
    }

    @Override
    public java.lang.Integer RequiredLicenses(final ch.actifsource.core.javamodel.IDecorator veeamAvailabilitySuiteLicense) {
      /* Begin Protected Region [[23b135ae-e4be-11ef-a6bd-497168f25adc]] */
    	return new VeeamLicenseCalculator( veeamAvailabilitySuiteLicense.selectTotalSockets(), veeamAvailabilitySuiteLicense.selectVmsToBackup().size()).getRequiredLicenses();
  
      /* End Protected Region   [[23b135ae-e4be-11ef-a6bd-497168f25adc]] */
    }

  }
  
  public static class VeeamAvailabilitySuiteLicenseFunctions {

    private VeeamAvailabilitySuiteLicenseFunctions() {}

    public static List<ch.actifsource.core.javamodel.IDecorator> GetAllVMsWhereMustBeBackups(final ch.actifsource.core.javamodel.IDecorator veeamAvailabilitySuiteLicense) {
      return DynamicResourceUtil.invoke(IVeeamAvailabilitySuiteLicenseFunctionsImpl.class, VeeamAvailabilitySuiteLicenseFunctionsImpl.INSTANCE, veeamAvailabilitySuiteLicense).GetAllVMsWhereMustBeBackups(veeamAvailabilitySuiteLicense);
    }

    public static java.lang.String RecommendedLicense(final ch.actifsource.core.javamodel.IDecorator veeamAvailabilitySuiteLicense) {
      return DynamicResourceUtil.invoke(IVeeamAvailabilitySuiteLicenseFunctionsImpl.class, VeeamAvailabilitySuiteLicenseFunctionsImpl.INSTANCE, veeamAvailabilitySuiteLicense).RecommendedLicense(veeamAvailabilitySuiteLicense);
    }

    public static java.lang.Integer RequiredLicenses(final ch.actifsource.core.javamodel.IDecorator veeamAvailabilitySuiteLicense) {
      return DynamicResourceUtil.invoke(IVeeamAvailabilitySuiteLicenseFunctionsImpl.class, VeeamAvailabilitySuiteLicenseFunctionsImpl.INSTANCE, veeamAvailabilitySuiteLicense).RequiredLicenses(veeamAvailabilitySuiteLicense);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7fb6fac6-e4bb-11ef-a6bd-497168f25adc,KIXgTMpjV/iWQuL1Uz5xl1xDcUs=] */
