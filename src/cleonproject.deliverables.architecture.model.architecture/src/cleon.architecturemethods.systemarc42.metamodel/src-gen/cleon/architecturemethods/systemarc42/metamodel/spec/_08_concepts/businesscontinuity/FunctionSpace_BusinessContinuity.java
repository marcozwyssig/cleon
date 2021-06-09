package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b7409aea-c93b-11eb-adc4-d18d1353eb6e,imports]] */

/* End Protected Region   [[b7409aea-c93b-11eb-adc4-d18d1353eb6e,imports]] */

public class FunctionSpace_BusinessContinuity {

  /* Begin Protected Region [[b7409aea-c93b-11eb-adc4-d18d1353eb6e]] */
  
  /* End Protected Region   [[b7409aea-c93b-11eb-adc4-d18d1353eb6e]] */


  public static interface IAvailabilityConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c1858b61-c93b-11eb-adc4-d18d1353eb6e")
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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b7409aea-c93b-11eb-adc4-d18d1353eb6e,Sp3ScGxz62mSJ07jBMl8YVvASy8=] */
