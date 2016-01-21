package cleon.sda.template.asciidoc.project.planning;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[67eddf6e-c02a-11e5-b927-b1b055d0575f,imports]] */

/* End Protected Region   [[67eddf6e-c02a-11e5-b927-b1b055d0575f,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[67eddf6e-c02a-11e5-b927-b1b055d0575f]] */
  
  /* End Protected Region   [[67eddf6e-c02a-11e5-b927-b1b055d0575f]] */


  public static interface ISprintBacklogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("765eecaa-c02a-11e5-b927-b1b055d0575f")
    public java.lang.String RenderChapterContent();

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
    	return sprintBacklog.selectWorkItems().stream().mapToInt(p -> p.selectEstimate()).sum();
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

    @IDynamicResourceExtension.MethodId("56b3f930-c02b-11e5-b927-b1b055d0575f")
    public java.lang.String RenderChapterContent();

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
       	return sprintCapacity.selectPersonCapacity().values().stream().mapToInt(p -> p.selectCapacity()).sum();
      /* End Protected Region   [[935a66c2-c02b-11e5-b927-b1b055d0575f]] */
    }

  }
  
  public static class SprintCapacityFunctions {

    private SprintCapacityFunctions() {}

    public static java.lang.Integer SumCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
      return DynamicResourceUtil.invoke(ISprintCapacityFunctionsImpl.class, SprintCapacityFunctionsImpl.INSTANCE, sprintCapacity).SumCapacity(sprintCapacity);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,67eddf6e-c02a-11e5-b927-b1b055d0575f,dqoCEzNq9WnNovck7LIeYP/bmkM=] */
