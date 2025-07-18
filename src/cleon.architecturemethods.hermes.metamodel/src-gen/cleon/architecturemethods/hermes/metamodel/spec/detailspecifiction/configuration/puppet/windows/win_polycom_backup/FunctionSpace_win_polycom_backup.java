package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_backup;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[0a84893c-631b-11f0-8f89-fba3b99d3616,imports]] */

/* End Protected Region   [[0a84893c-631b-11f0-8f89-fba3b99d3616,imports]] */

public class FunctionSpace_win_polycom_backup {

  /* Begin Protected Region [[0a84893c-631b-11f0-8f89-fba3b99d3616]] */
  
  /* End Protected Region   [[0a84893c-631b-11f0-8f89-fba3b99d3616]] */


  public static interface IScheduledBackupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0d8e45fa-631b-11f0-8f89-fba3b99d3616")
    public java.lang.String LogonAs();

  }
  
  public static interface IScheduledBackupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ScheduledBackupFunctionsImpl implements IScheduledBackupFunctionsImpl {

    public static final IScheduledBackupFunctionsImpl INSTANCE = new ScheduledBackupFunctionsImpl();

    private ScheduledBackupFunctionsImpl() {}

  }
  
  public static class ScheduledBackupFunctions {

    private ScheduledBackupFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,0a84893c-631b-11f0-8f89-fba3b99d3616,8AmAqGTBDrBB+8BeXEEa39txbU8=] */
