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

  }
  
  public static interface ISprintBacklogFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SprintBacklogFunctionsImpl implements ISprintBacklogFunctionsImpl {

    public static final ISprintBacklogFunctionsImpl INSTANCE = new SprintBacklogFunctionsImpl();

    private SprintBacklogFunctionsImpl() {}

  }
  
  public static class SprintBacklogFunctions {

    private SprintBacklogFunctions() {}

  }

  public static interface ISprintCapacityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("56b3f930-c02b-11e5-b927-b1b055d0575f")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface ISprintCapacityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SprintCapacityFunctionsImpl implements ISprintCapacityFunctionsImpl {

    public static final ISprintCapacityFunctionsImpl INSTANCE = new SprintCapacityFunctionsImpl();

    private SprintCapacityFunctionsImpl() {}

  }
  
  public static class SprintCapacityFunctions {

    private SprintCapacityFunctions() {}

  }

  public static interface IReleaseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f0113260-c030-11e5-b927-b1b055d0575f")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface IReleaseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ReleaseFunctionsImpl implements IReleaseFunctionsImpl {

    public static final IReleaseFunctionsImpl INSTANCE = new ReleaseFunctionsImpl();

    private ReleaseFunctionsImpl() {}

  }
  
  public static class ReleaseFunctions {

    private ReleaseFunctions() {}

  }

  public static interface ISprintFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f5995d93-c030-11e5-b927-b1b055d0575f")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface ISprintFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SprintFunctionsImpl implements ISprintFunctionsImpl {

    public static final ISprintFunctionsImpl INSTANCE = new SprintFunctionsImpl();

    private SprintFunctionsImpl() {}

  }
  
  public static class SprintFunctions {

    private SprintFunctions() {}

  }

  public static interface ITargetDatesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ed98271d-cb72-11e5-bc87-a1fadf56ded8")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface ITargetDatesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TargetDatesFunctionsImpl implements ITargetDatesFunctionsImpl {

    public static final ITargetDatesFunctionsImpl INSTANCE = new TargetDatesFunctionsImpl();

    private TargetDatesFunctionsImpl() {}

  }
  
  public static class TargetDatesFunctions {

    private TargetDatesFunctions() {}

  }

  public static interface ISprintGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fb9e5d45-cb75-11e5-bc87-a1fadf56ded8")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface ISprintGoalsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SprintGoalsFunctionsImpl implements ISprintGoalsFunctionsImpl {

    public static final ISprintGoalsFunctionsImpl INSTANCE = new SprintGoalsFunctionsImpl();

    private SprintGoalsFunctionsImpl() {}

  }
  
  public static class SprintGoalsFunctions {

    private SprintGoalsFunctions() {}

  }

  public static interface ICapacityPerDayFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("67f7685c-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsAFullDay();

    @IDynamicResourceExtension.MethodId("a5cc92a3-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsANoDay();

    @IDynamicResourceExtension.MethodId("aca49591-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsAHalfDay();

  }
  
  public static interface ICapacityPerDayFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("67f7685c-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsAFullDay(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ICapacityPerDay capacityPerDay);

    @IDynamicResourceExtension.MethodId("a5cc92a3-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsANoDay(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ICapacityPerDay capacityPerDay);

    @IDynamicResourceExtension.MethodId("aca49591-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsAHalfDay(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ICapacityPerDay capacityPerDay);

  }
  
  public static class CapacityPerDayFunctionsImpl implements ICapacityPerDayFunctionsImpl {

    public static final ICapacityPerDayFunctionsImpl INSTANCE = new CapacityPerDayFunctionsImpl();

    private CapacityPerDayFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsAFullDay(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return capacityPerDay.selectCapacity() >= 8;
    }

    @Override
    public java.lang.Boolean IsANoDay(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return capacityPerDay.selectCapacity() == 0;
    }

    @Override
    public java.lang.Boolean IsAHalfDay(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return capacityPerDay.selectCapacity() > 0 && capacityPerDay.selectCapacity() < 8;
    }

  }
  
  public static class CapacityPerDayFunctions {

    private CapacityPerDayFunctions() {}

    public static java.lang.Boolean IsAFullDay(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return DynamicResourceUtil.invoke(ICapacityPerDayFunctionsImpl.class, CapacityPerDayFunctionsImpl.INSTANCE, capacityPerDay).IsAFullDay(capacityPerDay);
    }

    public static java.lang.Boolean IsANoDay(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return DynamicResourceUtil.invoke(ICapacityPerDayFunctionsImpl.class, CapacityPerDayFunctionsImpl.INSTANCE, capacityPerDay).IsANoDay(capacityPerDay);
    }

    public static java.lang.Boolean IsAHalfDay(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return DynamicResourceUtil.invoke(ICapacityPerDayFunctionsImpl.class, CapacityPerDayFunctionsImpl.INSTANCE, capacityPerDay).IsAHalfDay(capacityPerDay);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,67eddf6e-c02a-11e5-b927-b1b055d0575f,kqS2MPwybbJ60cVUPqLAtvVXf7A=] */
