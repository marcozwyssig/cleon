package cleon.architecturemethods.itarc42.metamodel.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5b71c5a3-1e3a-11e9-865e-41ef48a95f70,imports]] */

/* End Protected Region   [[5b71c5a3-1e3a-11e9-865e-41ef48a95f70,imports]] */

public class FunctionSpace_BusinessContinuity {

  /* Begin Protected Region [[5b71c5a3-1e3a-11e9-865e-41ef48a95f70]] */
  
  /* End Protected Region   [[5b71c5a3-1e3a-11e9-865e-41ef48a95f70]] */


  public static interface IAvailabilityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6005307c-1e3a-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAvailabilityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AvailabilityFunctionsImpl implements IAvailabilityFunctionsImpl {

    public static final IAvailabilityFunctionsImpl INSTANCE = new AvailabilityFunctionsImpl();

    private AvailabilityFunctionsImpl() {}

  }
  
  public static class AvailabilityFunctions {

    private AvailabilityFunctions() {}

  }

  public static interface IBackupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("90698ca7-1e3f-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IBackupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BackupFunctionsImpl implements IBackupFunctionsImpl {

    public static final IBackupFunctionsImpl INSTANCE = new BackupFunctionsImpl();

    private BackupFunctionsImpl() {}

  }
  
  public static class BackupFunctions {

    private BackupFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5b71c5a3-1e3a-11e9-865e-41ef48a95f70,CRDDGUw9BRH7r565l98xN0O0Cbg=] */
