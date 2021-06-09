package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[8d626070-c93b-11eb-adc4-d18d1353eb6e,imports]] */

/* End Protected Region   [[8d626070-c93b-11eb-adc4-d18d1353eb6e,imports]] */

public class FunctionSpace_BusinessContinuity {

  /* Begin Protected Region [[8d626070-c93b-11eb-adc4-d18d1353eb6e]] */
  
  /* End Protected Region   [[8d626070-c93b-11eb-adc4-d18d1353eb6e]] */


  public static interface IBackupConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8d62607c-c93b-11eb-adc4-d18d1353eb6e")
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

    @IDynamicResourceExtension.MethodId("8d626089-c93b-11eb-adc4-d18d1353eb6e")
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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,8d626070-c93b-11eb-adc4-d18d1353eb6e,MabO+V4zB7EEXOGn6GOG8tTCrlo=] */
