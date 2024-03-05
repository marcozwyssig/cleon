package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity;

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


  public static interface IBackupConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("591d8144-c1d2-11ea-b956-0ffede25a02d")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> SelectBackupBuildingBlocks();

  }
  
  public static interface IBackupConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BackupConceptFunctionsImpl implements IBackupConceptFunctionsImpl {

    public static final IBackupConceptFunctionsImpl INSTANCE = new BackupConceptFunctionsImpl();

    private BackupConceptFunctionsImpl() {}

  }
  
  public static class BackupConceptFunctions {

    private BackupConceptFunctions() {}

  }

  public static interface IAvailabilityConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5d2dadda-c93b-11eb-adc4-d18d1353eb6e")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> AllComponents();

  }
  
  public static interface IAvailabilityConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AvailabilityConceptFunctionsImpl implements IAvailabilityConceptFunctionsImpl {

    public static final IAvailabilityConceptFunctionsImpl INSTANCE = new AvailabilityConceptFunctionsImpl();

    private AvailabilityConceptFunctionsImpl() {}

  }
  
  public static class AvailabilityConceptFunctions {

    private AvailabilityConceptFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4d1f95f6-c1d2-11ea-b956-0ffede25a02d,ndKGYtPxTfGgfXhcQnTrhzMvS2g=] */
