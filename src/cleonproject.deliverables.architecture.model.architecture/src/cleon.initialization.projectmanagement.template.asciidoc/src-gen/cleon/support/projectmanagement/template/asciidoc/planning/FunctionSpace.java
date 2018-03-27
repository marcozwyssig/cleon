package cleon.support.projectmanagement.template.asciidoc.planning;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[67eddf6e-c02a-11e5-b927-b1b055d0575f,imports]] */
import cleon.common.resources.spec.calendar.FunctionSpace.DayFunctions;
/* End Protected Region   [[67eddf6e-c02a-11e5-b927-b1b055d0575f,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[67eddf6e-c02a-11e5-b927-b1b055d0575f]] */
  
  /* End Protected Region   [[67eddf6e-c02a-11e5-b927-b1b055d0575f]] */


  public static interface ISprintBacklogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("765eecaa-c02a-11e5-b927-b1b055d0575f")
    public java.lang.String RenderContentElement();

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
    public java.lang.String RenderContentElement();

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
    public java.lang.String RenderContentElement();

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
    public java.lang.String RenderContentElement();

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

  public static interface IDeadlinesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ed98271d-cb72-11e5-bc87-a1fadf56ded8")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDeadlinesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeadlinesFunctionsImpl implements IDeadlinesFunctionsImpl {

    public static final IDeadlinesFunctionsImpl INSTANCE = new DeadlinesFunctionsImpl();

    private DeadlinesFunctionsImpl() {}

  }
  
  public static class DeadlinesFunctions {

    private DeadlinesFunctions() {}

  }

  public static interface ISprintGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fb9e5d45-cb75-11e5-bc87-a1fadf56ded8")
    public java.lang.String RenderContentElement();

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

    @IDynamicResourceExtension.MethodId("f0ba8e2d-0d63-11e6-9f44-9d0000bae4df")
    public java.lang.Boolean IsWeekend();

  }
  
  public static interface ICapacityPerDayFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("67f7685c-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsAFullDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay);

    @IDynamicResourceExtension.MethodId("a5cc92a3-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsANoDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay);

    @IDynamicResourceExtension.MethodId("aca49591-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsAHalfDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay);

    @IDynamicResourceExtension.MethodId("f0ba8e2d-0d63-11e6-9f44-9d0000bae4df")
    public java.lang.Boolean IsWeekend(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay);

  }
  
  public static class CapacityPerDayFunctionsImpl implements ICapacityPerDayFunctionsImpl {

    public static final ICapacityPerDayFunctionsImpl INSTANCE = new CapacityPerDayFunctionsImpl();

    private CapacityPerDayFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsAFullDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return capacityPerDay.selectCapacity() >= 8;
    }

    @Override
    public java.lang.Boolean IsANoDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return capacityPerDay.selectCapacity() == 0 && !DayFunctions.IsWeekend(capacityPerDay.selectDay());
    }

    @Override
    public java.lang.Boolean IsAHalfDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return capacityPerDay.selectCapacity() > 0 && capacityPerDay.selectCapacity() < 8;
    }

    @Override
    public java.lang.Boolean IsWeekend(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return capacityPerDay.selectCapacity() == 0 && DayFunctions.IsWeekend(capacityPerDay.selectDay());
    }

  }
  
  public static class CapacityPerDayFunctions {

    private CapacityPerDayFunctions() {}

    public static java.lang.Boolean IsAFullDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return DynamicResourceUtil.invoke(ICapacityPerDayFunctionsImpl.class, CapacityPerDayFunctionsImpl.INSTANCE, capacityPerDay).IsAFullDay(capacityPerDay);
    }

    public static java.lang.Boolean IsANoDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return DynamicResourceUtil.invoke(ICapacityPerDayFunctionsImpl.class, CapacityPerDayFunctionsImpl.INSTANCE, capacityPerDay).IsANoDay(capacityPerDay);
    }

    public static java.lang.Boolean IsAHalfDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return DynamicResourceUtil.invoke(ICapacityPerDayFunctionsImpl.class, CapacityPerDayFunctionsImpl.INSTANCE, capacityPerDay).IsAHalfDay(capacityPerDay);
    }

    public static java.lang.Boolean IsWeekend(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return DynamicResourceUtil.invoke(ICapacityPerDayFunctionsImpl.class, CapacityPerDayFunctionsImpl.INSTANCE, capacityPerDay).IsWeekend(capacityPerDay);
    }

  }

  public static interface IScheduleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d292d695-0f69-11e6-8304-d77c15116091")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IScheduleFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ScheduleFunctionsImpl implements IScheduleFunctionsImpl {

    public static final IScheduleFunctionsImpl INSTANCE = new ScheduleFunctionsImpl();

    private ScheduleFunctionsImpl() {}

  }
  
  public static class ScheduleFunctions {

    private ScheduleFunctions() {}

  }

  public static interface IMonthFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("03fc3482-0f71-11e6-8304-d77c15116091")
    public java.lang.String renderMissingSeparator();

  }
  
  public static interface IMonthFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("03fc3482-0f71-11e6-8304-d77c15116091")
    public java.lang.String renderMissingSeparator(final cleon.common.resources.spec.calendar.javamodel.IMonth month);

  }
  
  public static class MonthFunctionsImpl implements IMonthFunctionsImpl {

    public static final IMonthFunctionsImpl INSTANCE = new MonthFunctionsImpl();

    private MonthFunctionsImpl() {}

    @Override
    public java.lang.String renderMissingSeparator(final cleon.common.resources.spec.calendar.javamodel.IMonth month) {
      /* Begin Protected Region [[03fc3482-0f71-11e6-8304-d77c15116091]] */
      int max = month.selectDays().stream().mapToInt(x -> x.selectIdentifier()).max().getAsInt();
      int mod = 5 - Math.floorMod(max, 5);
      String result = "";
      for(int i = 0; i<mod; ++i)
      {
    	  result += "|";
      }
      return result;
      /* End Protected Region   [[03fc3482-0f71-11e6-8304-d77c15116091]] */
    }

  }
  
  public static class MonthFunctions {

    private MonthFunctions() {}

    public static java.lang.String renderMissingSeparator(final cleon.common.resources.spec.calendar.javamodel.IMonth month) {
      return DynamicResourceUtil.invoke(IMonthFunctionsImpl.class, MonthFunctionsImpl.INSTANCE, month).renderMissingSeparator(month);
    }

  }

  public static interface ISprintPlanningFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4bdd7fb5-312f-11e6-b049-b7e2a4d7c48e")
    public java.lang.String RenderChapters();

  }
  
  public static interface ISprintPlanningFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SprintPlanningFunctionsImpl implements ISprintPlanningFunctionsImpl {

    public static final ISprintPlanningFunctionsImpl INSTANCE = new SprintPlanningFunctionsImpl();

    private SprintPlanningFunctionsImpl() {}

  }
  
  public static class SprintPlanningFunctions {

    private SprintPlanningFunctions() {}

  }

  public static interface IReleasesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5437c39d-33b0-11e6-94cd-fbf6c8ccd08d")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IReleasesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ReleasesFunctionsImpl implements IReleasesFunctionsImpl {

    public static final IReleasesFunctionsImpl INSTANCE = new ReleasesFunctionsImpl();

    private ReleasesFunctionsImpl() {}

  }
  
  public static class ReleasesFunctions {

    private ReleasesFunctions() {}

  }

  public static interface IPlanningFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3523ef5f-c1ce-11e6-bd27-4740c1c9b441")
    public java.lang.String RenderChapters();

  }
  
  public static interface IPlanningFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PlanningFunctionsImpl implements IPlanningFunctionsImpl {

    public static final IPlanningFunctionsImpl INSTANCE = new PlanningFunctionsImpl();

    private PlanningFunctionsImpl() {}

  }
  
  public static class PlanningFunctions {

    private PlanningFunctions() {}

  }

  public static interface IModuleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("eefa8d32-b540-11e5-bc0c-f35b68c3609a")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IModuleFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ModuleFunctionsImpl implements IModuleFunctionsImpl {

    public static final IModuleFunctionsImpl INSTANCE = new ModuleFunctionsImpl();

    private ModuleFunctionsImpl() {}

  }
  
  public static class ModuleFunctions {

    private ModuleFunctions() {}

  }

  public static interface IBacklogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("98424cb2-bdff-11e5-bc2e-0b46afe7c3c9")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IBacklogFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BacklogFunctionsImpl implements IBacklogFunctionsImpl {

    public static final IBacklogFunctionsImpl INSTANCE = new BacklogFunctionsImpl();

    private BacklogFunctionsImpl() {}

  }
  
  public static class BacklogFunctions {

    private BacklogFunctions() {}

  }

  public static interface IModuleUtilizationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bf1fd1c3-c6c1-11e6-8242-2f0ed6756d77")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IModuleUtilizationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ModuleUtilizationFunctionsImpl implements IModuleUtilizationFunctionsImpl {

    public static final IModuleUtilizationFunctionsImpl INSTANCE = new ModuleUtilizationFunctionsImpl();

    private ModuleUtilizationFunctionsImpl() {}

  }
  
  public static class ModuleUtilizationFunctions {

    private ModuleUtilizationFunctions() {}

  }

  public static interface IWorkpackageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ee95411a-1e08-11e7-882a-cdd93aa926f8")
    public java.lang.String RenderChapters();

  }
  
  public static interface IWorkpackageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WorkpackageFunctionsImpl implements IWorkpackageFunctionsImpl {

    public static final IWorkpackageFunctionsImpl INSTANCE = new WorkpackageFunctionsImpl();

    private WorkpackageFunctionsImpl() {}

  }
  
  public static class WorkpackageFunctions {

    private WorkpackageFunctions() {}

  }

  public static interface IWorkspaceGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("07ecd5f8-1e09-11e7-882a-cdd93aa926f8")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IWorkspaceGoalsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WorkspaceGoalsFunctionsImpl implements IWorkspaceGoalsFunctionsImpl {

    public static final IWorkspaceGoalsFunctionsImpl INSTANCE = new WorkspaceGoalsFunctionsImpl();

    private WorkspaceGoalsFunctionsImpl() {}

  }
  
  public static class WorkspaceGoalsFunctions {

    private WorkspaceGoalsFunctions() {}

  }

  public static interface IScopeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8f4c58ee-3eb4-11e7-a89c-83d57940f0e3")
    public java.lang.String RenderChapters();

  }
  
  public static interface IScopeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ScopeFunctionsImpl implements IScopeFunctionsImpl {

    public static final IScopeFunctionsImpl INSTANCE = new ScopeFunctionsImpl();

    private ScopeFunctionsImpl() {}

  }
  
  public static class ScopeFunctions {

    private ScopeFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,67eddf6e-c02a-11e5-b927-b1b055d0575f,pau5QkcGPtsrt8NcI0y/8WedJco=] */
