package cleon.sda.spec.projectmanagement.planning.sprintplanning;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5bd4d1da-c4ca-11e5-8558-4b8affb7767c,imports]] */

/* End Protected Region   [[5bd4d1da-c4ca-11e5-8558-4b8affb7767c,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[5bd4d1da-c4ca-11e5-8558-4b8affb7767c]] */
  
  /* End Protected Region   [[5bd4d1da-c4ca-11e5-8558-4b8affb7767c]] */


  public static interface ISprintBacklogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bedae007-c02b-11e5-b927-b1b055d0575f")
    public java.lang.Integer SumEffort();

  }
  
  public static interface ISprintBacklogFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("bedae007-c02b-11e5-b927-b1b055d0575f")
    public java.lang.Integer SumEffort(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintBacklog sprintBacklog);

  }
  
  public static class SprintBacklogFunctionsImpl implements ISprintBacklogFunctionsImpl {

    public static final ISprintBacklogFunctionsImpl INSTANCE = new SprintBacklogFunctionsImpl();

    private SprintBacklogFunctionsImpl() {}

    @Override
    public java.lang.Integer SumEffort(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintBacklog sprintBacklog) {
      /* Begin Protected Region [[bedae007-c02b-11e5-b927-b1b055d0575f]] */
      return sprintBacklog.selectWorkItems().stream().filter(x -> x.selectEstimate() != null).mapToInt(p -> Integer.parseInt(p.selectEstimate().selectName())).sum();   
      /* End Protected Region   [[bedae007-c02b-11e5-b927-b1b055d0575f]] */
    }

  }
  
  public static class SprintBacklogFunctions {

    private SprintBacklogFunctions() {}

    public static java.lang.Integer SumEffort(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintBacklog sprintBacklog) {
      return DynamicResourceUtil.invoke(ISprintBacklogFunctionsImpl.class, SprintBacklogFunctionsImpl.INSTANCE, sprintBacklog).SumEffort(sprintBacklog);
    }

  }

  public static interface ISprintCapacityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("935a66c2-c02b-11e5-b927-b1b055d0575f")
    public java.lang.Integer SumCapacity();

  }
  
  public static interface ISprintCapacityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("935a66c2-c02b-11e5-b927-b1b055d0575f")
    public java.lang.Integer SumCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity sprintCapacity);

  }
  
  public static class SprintCapacityFunctionsImpl implements ISprintCapacityFunctionsImpl {

    public static final ISprintCapacityFunctionsImpl INSTANCE = new SprintCapacityFunctionsImpl();

    private SprintCapacityFunctionsImpl() {}

    @Override
    public java.lang.Integer SumCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
      /* Begin Protected Region [[935a66c2-c02b-11e5-b927-b1b055d0575f]] */
        return sprintCapacity.selectPersonCapacity().values().stream().mapToInt(p -> PersonCapacityFunctionsImpl.INSTANCE.SumCapacity(p)).sum();     
      /* End Protected Region   [[935a66c2-c02b-11e5-b927-b1b055d0575f]] */
    }

  }
  
  public static class SprintCapacityFunctions {

    private SprintCapacityFunctions() {}

    public static java.lang.Integer SumCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
      return DynamicResourceUtil.invoke(ISprintCapacityFunctionsImpl.class, SprintCapacityFunctionsImpl.INSTANCE, sprintCapacity).SumCapacity(sprintCapacity);
    }

  }

  public static interface IPersonCapacityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8f9bac0a-c4ca-11e5-8558-4b8affb7767c")
    public java.lang.Integer SumCapacity();

  }
  
  public static interface IPersonCapacityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8f9bac0a-c4ca-11e5-8558-4b8affb7767c")
    public java.lang.Integer SumCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.IPersonCapacity personCapacity);

  }
  
  public static class PersonCapacityFunctionsImpl implements IPersonCapacityFunctionsImpl {

    public static final IPersonCapacityFunctionsImpl INSTANCE = new PersonCapacityFunctionsImpl();

    private PersonCapacityFunctionsImpl() {}

    @Override
    public java.lang.Integer SumCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.IPersonCapacity personCapacity) {
      /* Begin Protected Region [[8f9bac0a-c4ca-11e5-8558-4b8affb7767c]] */
      return personCapacity.selectCapacityPerDay().values().stream().mapToInt(y -> y.selectCapacity()).sum();     
      /* End Protected Region   [[8f9bac0a-c4ca-11e5-8558-4b8affb7767c]] */
    }

  }
  
  public static class PersonCapacityFunctions {

    private PersonCapacityFunctions() {}

    public static java.lang.Integer SumCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.IPersonCapacity personCapacity) {
      return DynamicResourceUtil.invoke(IPersonCapacityFunctionsImpl.class, PersonCapacityFunctionsImpl.INSTANCE, personCapacity).SumCapacity(personCapacity);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5bd4d1da-c4ca-11e5-8558-4b8affb7767c,7Ax2AwF/dxbohcX/YOQYA4Yrj7E=] */
