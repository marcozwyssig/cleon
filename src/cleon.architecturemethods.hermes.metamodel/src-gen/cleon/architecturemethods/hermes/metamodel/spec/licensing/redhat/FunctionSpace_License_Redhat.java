package cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[6273c58f-dfdf-11ef-8b41-bffcdee4ee9e,imports]] */
import cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat.javamodel.RhelLicenseType;
/* End Protected Region   [[6273c58f-dfdf-11ef-8b41-bffcdee4ee9e,imports]] */

public class FunctionSpace_License_Redhat {

  /* Begin Protected Region [[6273c58f-dfdf-11ef-8b41-bffcdee4ee9e]] */
  
  /* End Protected Region   [[6273c58f-dfdf-11ef-8b41-bffcdee4ee9e]] */


  public static interface IRhelHostLicensingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6273c593-dfdf-11ef-8b41-bffcdee4ee9e")
    public java.lang.Integer LicenseAmount();

    @IDynamicResourceExtension.MethodId("6273c59e-dfdf-11ef-8b41-bffcdee4ee9e")
    public java.lang.Integer GetVMCount();

    @IDynamicResourceExtension.MethodId("c08cc9db-dfed-11ef-8b41-bffcdee4ee9e")
    public cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat.javamodel.IRhelLicenseType HostOrVMBased();

  }
  
  public static interface IRhelHostLicensingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("6273c593-dfdf-11ef-8b41-bffcdee4ee9e")
    public java.lang.Integer LicenseAmount(final cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat.javamodel.IRhelHostLicensing rhelHostLicensing);

    @IDynamicResourceExtension.MethodId("c08cc9db-dfed-11ef-8b41-bffcdee4ee9e")
    public cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat.javamodel.IRhelLicenseType HostOrVMBased(final cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat.javamodel.IRhelHostLicensing rhelHostLicensing);

  }
  
  public static class RhelHostLicensingFunctionsImpl implements IRhelHostLicensingFunctionsImpl {

    public static final IRhelHostLicensingFunctionsImpl INSTANCE = new RhelHostLicensingFunctionsImpl();

    private RhelHostLicensingFunctionsImpl() {}

    @Override
    public java.lang.Integer LicenseAmount(final cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat.javamodel.IRhelHostLicensing rhelHostLicensing) {
      /* Begin Protected Region [[6273c593-dfdf-11ef-8b41-bffcdee4ee9e]] */
    	final var calculator = new RhelLicenseCalculator(rhelHostLicensing.selectPhysicalCores(), rhelHostLicensing.selectVms());
    	return calculator.getAmount();   
      /* End Protected Region   [[6273c593-dfdf-11ef-8b41-bffcdee4ee9e]] */
    }

    @Override
    public cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat.javamodel.IRhelLicenseType HostOrVMBased(final cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat.javamodel.IRhelHostLicensing rhelHostLicensing) {
      /* Begin Protected Region [[c08cc9db-dfed-11ef-8b41-bffcdee4ee9e]] */
    	final var calculator = new RhelLicenseCalculator(rhelHostLicensing.selectPhysicalCores(), rhelHostLicensing.selectVms() );
    	if (calculator.isUseHost() ) {
    		return RhelLicenseType.FACTORY.create(rhelHostLicensing.getRepository(), RedhatPackage.RhelLicenseType_Host__S_Based);
    	} else {
        	return RhelLicenseType.FACTORY.create(rhelHostLicensing.getRepository(), RedhatPackage.RhelLicenseType_VM__S_Based);    		
    	}  
      /* End Protected Region   [[c08cc9db-dfed-11ef-8b41-bffcdee4ee9e]] */
    }

  }
  
  public static class RhelHostLicensingFunctions {

    private RhelHostLicensingFunctions() {}

    public static java.lang.Integer LicenseAmount(final cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat.javamodel.IRhelHostLicensing rhelHostLicensing) {
      return DynamicResourceUtil.invoke(IRhelHostLicensingFunctionsImpl.class, RhelHostLicensingFunctionsImpl.INSTANCE, rhelHostLicensing).LicenseAmount(rhelHostLicensing);
    }

    public static cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat.javamodel.IRhelLicenseType HostOrVMBased(final cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat.javamodel.IRhelHostLicensing rhelHostLicensing) {
      return DynamicResourceUtil.invoke(IRhelHostLicensingFunctionsImpl.class, RhelHostLicensingFunctionsImpl.INSTANCE, rhelHostLicensing).HostOrVMBased(rhelHostLicensing);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,6273c58f-dfdf-11ef-8b41-bffcdee4ee9e,3ng5qINP4xT15Bxk1RtZWXBttOk=] */
