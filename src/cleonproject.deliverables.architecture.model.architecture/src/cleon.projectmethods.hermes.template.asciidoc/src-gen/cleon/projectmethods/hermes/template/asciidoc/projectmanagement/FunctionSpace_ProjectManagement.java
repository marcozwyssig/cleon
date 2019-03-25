package cleon.projectmethods.hermes.template.asciidoc.projectmanagement;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[9f8f1638-ca32-11e8-82ac-e1eb952f770a,imports]] */
import java.util.*;
import cleon.common.resources.spec.calendar.FunctionSpace.DayFunctions;
/* End Protected Region   [[9f8f1638-ca32-11e8-82ac-e1eb952f770a,imports]] */

public class FunctionSpace_ProjectManagement {

  /* Begin Protected Region [[9f8f1638-ca32-11e8-82ac-e1eb952f770a]] */
  
  /* End Protected Region   [[9f8f1638-ca32-11e8-82ac-e1eb952f770a]] */


  public static interface IProtocolFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8f3cf3-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("9f8f3d00-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderEnd();

    @IDynamicResourceExtension.MethodId("9f8f3d10-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String GetDocumentPath();

  }
  
  public static interface IProtocolFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProtocolFunctionsImpl implements IProtocolFunctionsImpl {

    public static final IProtocolFunctionsImpl INSTANCE = new ProtocolFunctionsImpl();

    private ProtocolFunctionsImpl() {}

  }
  
  public static class ProtocolFunctions {

    private ProtocolFunctions() {}

  }

  public static interface IAgendaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8f3d52-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAgendaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AgendaFunctionsImpl implements IAgendaFunctionsImpl {

    public static final IAgendaFunctionsImpl INSTANCE = new AgendaFunctionsImpl();

    private AgendaFunctionsImpl() {}

  }
  
  public static class AgendaFunctions {

    private AgendaFunctions() {}

  }

  public static interface IProtocolItemsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8f3dc3-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IProtocolItemsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProtocolItemsFunctionsImpl implements IProtocolItemsFunctionsImpl {

    public static final IProtocolItemsFunctionsImpl INSTANCE = new ProtocolItemsFunctionsImpl();

    private ProtocolItemsFunctionsImpl() {}

  }
  
  public static class ProtocolItemsFunctions {

    private ProtocolItemsFunctions() {}

  }

  public static interface IProtocolItemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8f3dc6-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String GetType();

  }
  
  public static interface IProtocolItemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProtocolItemFunctionsImpl implements IProtocolItemFunctionsImpl {

    public static final IProtocolItemFunctionsImpl INSTANCE = new ProtocolItemFunctionsImpl();

    private ProtocolItemFunctionsImpl() {}

  }
  
  public static class ProtocolItemFunctions {

    private ProtocolItemFunctions() {}

  }

  public static interface IDecisionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8f3dca-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String GetType();

  }
  
  public static interface IDecisionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DecisionFunctionsImpl implements IDecisionFunctionsImpl {

    public static final IDecisionFunctionsImpl INSTANCE = new DecisionFunctionsImpl();

    private DecisionFunctionsImpl() {}

  }
  
  public static class DecisionFunctions {

    private DecisionFunctions() {}

  }

  public static interface ITaskFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8f3dce-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("9f8f3dd0-ca32-11e8-82ac-e1eb952f770a")
    public <T extends cleon.projectmethods.hermes.spec.projectmanagement.protocols.protocolsitems.javamodel.ITask> List<T> SortByDate();

  }
  
  public static interface ITaskFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9f8f3dd0-ca32-11e8-82ac-e1eb952f770a")
    public <T extends cleon.projectmethods.hermes.spec.projectmanagement.protocols.protocolsitems.javamodel.ITask> List<T> SortByDate(final List<T> taskList);

  }
  
  public static class TaskFunctionsImpl implements ITaskFunctionsImpl {

    public static final ITaskFunctionsImpl INSTANCE = new TaskFunctionsImpl();

    private TaskFunctionsImpl() {}

    @Override
    public <T extends cleon.projectmethods.hermes.spec.projectmanagement.protocols.protocolsitems.javamodel.ITask> List<T> SortByDate(final List<T> taskList) {
      /* Begin Protected Region [[9f8f3dd0-ca32-11e8-82ac-e1eb952f770a]] */
		ArrayList<T> taskSortedList = new ArrayList<>(taskList);
		Collections.sort(taskSortedList, new java.util.Comparator<T>() {
			public int compare(T o1, T o2)
			{
				Date deadline1 = DayFunctions.GetDate(o1.selectDeadline());
				Date deadline2 = DayFunctions.GetDate(o2.selectDeadline());
				return deadline1.compareTo(deadline2);
			}
		});
		
		return taskSortedList;
      /* End Protected Region   [[9f8f3dd0-ca32-11e8-82ac-e1eb952f770a]] */
    }

  }
  
  public static class TaskFunctions {

    private TaskFunctions() {}

    public static <T extends cleon.projectmethods.hermes.spec.projectmanagement.protocols.protocolsitems.javamodel.ITask> List<T> SortByDate(final List<T> taskList) {
      return DynamicResourceUtil.invoke(ITaskFunctionsImpl.class, TaskFunctionsImpl.INSTANCE, taskList).SortByDate(taskList);
    }

  }

  public static interface IInformationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8f3dd4-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String GetType();

  }
  
  public static interface IInformationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InformationFunctionsImpl implements IInformationFunctionsImpl {

    public static final IInformationFunctionsImpl INSTANCE = new InformationFunctionsImpl();

    private InformationFunctionsImpl() {}

  }
  
  public static class InformationFunctions {

    private InformationFunctions() {}

  }

  public static interface IProtocolsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8f645e-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("9f8f6463-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String GetDocumentName();

  }
  
  public static interface IProtocolsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProtocolsFunctionsImpl implements IProtocolsFunctionsImpl {

    public static final IProtocolsFunctionsImpl INSTANCE = new ProtocolsFunctionsImpl();

    private ProtocolsFunctionsImpl() {}

  }
  
  public static class ProtocolsFunctions {

    private ProtocolsFunctions() {}

  }

  public static interface IScheduleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8f6467-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String GetDocumentName();

    @IDynamicResourceExtension.MethodId("9f8ddde5-ca32-11e8-82ac-e1eb952f770a")
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

  public static interface ISprintBacklogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8cf242-ca32-11e8-82ac-e1eb952f770a")
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

    @IDynamicResourceExtension.MethodId("9f8d417c-ca32-11e8-82ac-e1eb952f770a")
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

    @IDynamicResourceExtension.MethodId("9f8d41a8-ca32-11e8-82ac-e1eb952f770a")
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

    @IDynamicResourceExtension.MethodId("9f8d41ca-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("9f8dde14-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderChapters();

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

    @IDynamicResourceExtension.MethodId("9f8db5c6-ca32-11e8-82ac-e1eb952f770a")
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

    @IDynamicResourceExtension.MethodId("9f8ddd0e-ca32-11e8-82ac-e1eb952f770a")
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

  public static interface IMonthFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8ddde8-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String renderMissingSeparator();

  }
  
  public static interface IMonthFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9f8ddde8-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String renderMissingSeparator(final cleon.common.resources.spec.calendar.javamodel.IMonth month);

  }
  
  public static class MonthFunctionsImpl implements IMonthFunctionsImpl {

    public static final IMonthFunctionsImpl INSTANCE = new MonthFunctionsImpl();

    private MonthFunctionsImpl() {}

    @Override
    public java.lang.String renderMissingSeparator(final cleon.common.resources.spec.calendar.javamodel.IMonth month) {
      /* Begin Protected Region [[9f8ddde8-ca32-11e8-82ac-e1eb952f770a]] */
        int max = month.selectDays().stream().mapToInt(x -> x.selectIdentifier()).max().getAsInt();
        int mod = 5 - Math.floorMod(max, 5);
        String result = "";
        for(int i = 0; i<mod; ++i)
        {
      	  result += "|";
        }
        return result;     
      /* End Protected Region   [[9f8ddde8-ca32-11e8-82ac-e1eb952f770a]] */
    }

  }
  
  public static class MonthFunctions {

    private MonthFunctions() {}

    public static java.lang.String renderMissingSeparator(final cleon.common.resources.spec.calendar.javamodel.IMonth month) {
      return DynamicResourceUtil.invoke(IMonthFunctionsImpl.class, MonthFunctionsImpl.INSTANCE, month).renderMissingSeparator(month);
    }

  }

  public static interface IReleasesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8dde22-ca32-11e8-82ac-e1eb952f770a")
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

  public static interface IPlanningDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8e037a-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderChapters();

  }
  
  public static interface IPlanningDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PlanningDocumentFunctionsImpl implements IPlanningDocumentFunctionsImpl {

    public static final IPlanningDocumentFunctionsImpl INSTANCE = new PlanningDocumentFunctionsImpl();

    private PlanningDocumentFunctionsImpl() {}

  }
  
  public static class PlanningDocumentFunctions {

    private PlanningDocumentFunctions() {}

  }

  public static interface IOutcomeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8e03d6-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IOutcomeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OutcomeFunctionsImpl implements IOutcomeFunctionsImpl {

    public static final IOutcomeFunctionsImpl INSTANCE = new OutcomeFunctionsImpl();

    private OutcomeFunctionsImpl() {}

  }
  
  public static class OutcomeFunctions {

    private OutcomeFunctions() {}

  }

  public static interface IBacklogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8e2bbf-ca32-11e8-82ac-e1eb952f770a")
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

  public static interface IResourceUtilizationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8e2c14-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IResourceUtilizationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ResourceUtilizationFunctionsImpl implements IResourceUtilizationFunctionsImpl {

    public static final IResourceUtilizationFunctionsImpl INSTANCE = new ResourceUtilizationFunctionsImpl();

    private ResourceUtilizationFunctionsImpl() {}

  }
  
  public static class ResourceUtilizationFunctions {

    private ResourceUtilizationFunctions() {}

  }

  public static interface IWorkpackageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8e5250-ca32-11e8-82ac-e1eb952f770a")
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

    @IDynamicResourceExtension.MethodId("9f8f15d9-ca32-11e8-82ac-e1eb952f770a")
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

    @IDynamicResourceExtension.MethodId("9f8f15f7-ca32-11e8-82ac-e1eb952f770a")
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

  public static interface IDeliverablesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8f1636-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDeliverablesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeliverablesFunctionsImpl implements IDeliverablesFunctionsImpl {

    public static final IDeliverablesFunctionsImpl INSTANCE = new DeliverablesFunctionsImpl();

    private DeliverablesFunctionsImpl() {}

  }
  
  public static class DeliverablesFunctions {

    private DeliverablesFunctions() {}

  }

  public static interface ISkillsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8f8af6-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

  }
  
  public static interface ISkillsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SkillsFunctionsImpl implements ISkillsFunctionsImpl {

    public static final ISkillsFunctionsImpl INSTANCE = new SkillsFunctionsImpl();

    private SkillsFunctionsImpl() {}

  }
  
  public static class SkillsFunctions {

    private SkillsFunctions() {}

  }

  public static interface IPersonFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8f8b2f-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IPersonFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PersonFunctionsImpl implements IPersonFunctionsImpl {

    public static final IPersonFunctionsImpl INSTANCE = new PersonFunctionsImpl();

    private PersonFunctionsImpl() {}

  }
  
  public static class PersonFunctions {

    private PersonFunctions() {}

  }

  public static interface IAbsencesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8f8b5e-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAbsencesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbsencesFunctionsImpl implements IAbsencesFunctionsImpl {

    public static final IAbsencesFunctionsImpl INSTANCE = new AbsencesFunctionsImpl();

    private AbsencesFunctionsImpl() {}

  }
  
  public static class AbsencesFunctions {

    private AbsencesFunctions() {}

  }

  public static interface IExperiencesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8f8b8b-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IExperiencesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ExperiencesFunctionsImpl implements IExperiencesFunctionsImpl {

    public static final IExperiencesFunctionsImpl INSTANCE = new ExperiencesFunctionsImpl();

    private ExperiencesFunctionsImpl() {}

  }
  
  public static class ExperiencesFunctions {

    private ExperiencesFunctions() {}

  }

  public static interface ITeamFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f8f8bbf-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

  }
  
  public static interface ITeamFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TeamFunctionsImpl implements ITeamFunctionsImpl {

    public static final ITeamFunctionsImpl INSTANCE = new TeamFunctionsImpl();

    private TeamFunctionsImpl() {}

  }
  
  public static class TeamFunctions {

    private TeamFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,9f8f1638-ca32-11e8-82ac-e1eb952f770a,NswjLponM31eByOashfhs4wtLW8=] */
