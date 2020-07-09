package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4d1f95f6-c1d2-11ea-b956-0ffede25a02d,imports]] */

/* End Protected Region   [[4d1f95f6-c1d2-11ea-b956-0ffede25a02d,imports]] */

public class FunctionSpace_BusinessContinuity {

  /* Begin Protected Region [[4d1f95f6-c1d2-11ea-b956-0ffede25a02d]] */
  
  /* End Protected Region   [[4d1f95f6-c1d2-11ea-b956-0ffede25a02d]] */


  public static interface IBackupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("591d8144-c1d2-11ea-b956-0ffede25a02d")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> SelectBackupBuildingBlocks();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4d1f95f6-c1d2-11ea-b956-0ffede25a02d,0K5qbIbDU4uWyuzdEwsyjKx1wZM=] */
