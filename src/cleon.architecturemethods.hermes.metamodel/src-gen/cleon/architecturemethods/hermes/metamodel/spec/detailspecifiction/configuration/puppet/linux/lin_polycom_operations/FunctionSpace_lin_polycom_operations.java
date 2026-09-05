package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[9060dfe3-4d22-11f0-954b-b579526ae084,imports]] */

/* End Protected Region   [[9060dfe3-4d22-11f0-954b-b579526ae084,imports]] */

public class FunctionSpace_lin_polycom_operations {

  /* Begin Protected Region [[9060dfe3-4d22-11f0-954b-b579526ae084]] */
  
  /* End Protected Region   [[9060dfe3-4d22-11f0-954b-b579526ae084]] */


  public static interface ICertificatesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("94116530-4d22-11f0-954b-b579526ae084")
    public java.lang.String LogonAs();

  }
  
  public static interface ICertificatesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CertificatesFunctionsImpl implements ICertificatesFunctionsImpl {

    public static final ICertificatesFunctionsImpl INSTANCE = new CertificatesFunctionsImpl();

    private CertificatesFunctionsImpl() {}

  }
  
  public static class CertificatesFunctions {

    private CertificatesFunctions() {}

  }

  public static interface ISatelliteRegistrationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7c31ce03-ba3f-11f0-9349-73cfbb54b949")
    public java.lang.String ca_rpm_url();

  }
  
  public static interface ISatelliteRegistrationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SatelliteRegistrationFunctionsImpl implements ISatelliteRegistrationFunctionsImpl {

    public static final ISatelliteRegistrationFunctionsImpl INSTANCE = new SatelliteRegistrationFunctionsImpl();

    private SatelliteRegistrationFunctionsImpl() {}

  }
  
  public static class SatelliteRegistrationFunctions {

    private SatelliteRegistrationFunctions() {}

  }

  public static interface IInstallRootCAFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("250ff300-ba44-11f0-9349-73cfbb54b949")
    public java.lang.String smb_share();

  }
  
  public static interface IInstallRootCAFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InstallRootCAFunctionsImpl implements IInstallRootCAFunctionsImpl {

    public static final IInstallRootCAFunctionsImpl INSTANCE = new InstallRootCAFunctionsImpl();

    private InstallRootCAFunctionsImpl() {}

  }
  
  public static class InstallRootCAFunctions {

    private InstallRootCAFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,9060dfe3-4d22-11f0-954b-b579526ae084,5VLBESR3HKQcnNpWmpOaDQaLohM=] */
