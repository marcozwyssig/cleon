package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[77a132eb-dff0-11eb-93d3-9f230e4bb32b,imports]] */

/* End Protected Region   [[77a132eb-dff0-11eb-93d3-9f230e4bb32b,imports]] */

public class FunctionSpace_Resource_Planning {

  /* Begin Protected Region [[77a132eb-dff0-11eb-93d3-9f230e4bb32b]] */
  
  /* End Protected Region   [[77a132eb-dff0-11eb-93d3-9f230e4bb32b]] */


  public static interface IResourcePlanningEnvironmentConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("83701dea-dff0-11eb-93d3-9f230e4bb32b")
    public List<ch.actifsource.core.javamodel.IDecorator> AllBuildNodes();

  }
  
  public static interface IResourcePlanningEnvironmentConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ResourcePlanningEnvironmentConceptFunctionsImpl implements IResourcePlanningEnvironmentConceptFunctionsImpl {

    public static final IResourcePlanningEnvironmentConceptFunctionsImpl INSTANCE = new ResourcePlanningEnvironmentConceptFunctionsImpl();

    private ResourcePlanningEnvironmentConceptFunctionsImpl() {}

  }
  
  public static class ResourcePlanningEnvironmentConceptFunctions {

    private ResourcePlanningEnvironmentConceptFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,77a132eb-dff0-11eb-93d3-9f230e4bb32b,03Z+IKFrD/hs8OalK1rBjXGXhuk=] */
