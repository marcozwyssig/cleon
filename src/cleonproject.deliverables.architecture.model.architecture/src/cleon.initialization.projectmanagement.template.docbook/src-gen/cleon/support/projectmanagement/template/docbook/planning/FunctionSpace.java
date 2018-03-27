package cleon.support.projectmanagement.template.docbook.planning;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2cf3f1a9-c1d8-11e6-8517-1bc2821627a9,imports]] */

/* End Protected Region   [[2cf3f1a9-c1d8-11e6-8517-1bc2821627a9,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[2cf3f1a9-c1d8-11e6-8517-1bc2821627a9]] */
  
  /* End Protected Region   [[2cf3f1a9-c1d8-11e6-8517-1bc2821627a9]] */


  public static interface IPlanningFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2cf46810-c1d8-11e6-8517-1bc2821627a9")
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

  public static interface IWorkpackageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1e6fb480-c1d9-11e6-8517-1bc2821627a9")
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

  public static interface IDeliverableFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6e59d083-c1e5-11e6-84f4-db6ef89bc9ce")
    public java.lang.String RenderDeliverableContent();

  }
  
  public static interface IDeliverableFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeliverableFunctionsImpl implements IDeliverableFunctionsImpl {

    public static final IDeliverableFunctionsImpl INSTANCE = new DeliverableFunctionsImpl();

    private DeliverableFunctionsImpl() {}

  }
  
  public static class DeliverableFunctions {

    private DeliverableFunctions() {}

  }

  public static interface ISimpleDeliverableFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7cfff75c-c1e5-11e6-84f4-db6ef89bc9ce")
    public java.lang.String RenderDeliverableContent();

  }
  
  public static interface ISimpleDeliverableFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SimpleDeliverableFunctionsImpl implements ISimpleDeliverableFunctionsImpl {

    public static final ISimpleDeliverableFunctionsImpl INSTANCE = new SimpleDeliverableFunctionsImpl();

    private SimpleDeliverableFunctionsImpl() {}

  }
  
  public static class SimpleDeliverableFunctions {

    private SimpleDeliverableFunctions() {}

  }

  public static interface IWorkspaceGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f3f79cbc-c203-11e6-84f4-db6ef89bc9ce")
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

  public static interface IDeliverablesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c1d5c9e2-c204-11e6-84f4-db6ef89bc9ce")
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

  public static interface IModuleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cff76242-c205-11e6-84f4-db6ef89bc9ce")
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

  public static interface IModuleUtilizationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("19fc0b5b-c296-11e6-ba8e-05f5391bcda8")
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

  public static interface IScheduleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9eea52fe-d6ff-11e6-87ca-c1bc9022f1b5")
    public java.lang.String RenderDocument();

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

  public static interface IBacklogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bf79a65e-2588-11e7-aaee-75b173fba756")
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

  public static interface IScopeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3fbbee08-3eb6-11e7-a89c-83d57940f0e3")
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

  public static interface IAbstractGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e9c99a49-c1df-11e6-8517-1bc2821627a9")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("61a73499-c1e8-11e6-84f4-db6ef89bc9ce")
    public java.lang.String RenderCapabilities();

    @IDynamicResourceExtension.MethodId("80c3049b-c1e3-11e6-8517-1bc2821627a9")
    public List<cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable> GetAllDeliverables();

    @IDynamicResourceExtension.MethodId("f5c6615e-2127-11e8-8246-67c1f1659098")
    public cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoals GetGoals();

  }
  
  public static interface IAbstractGoalsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractGoalsFunctionsImpl implements IAbstractGoalsFunctionsImpl {

    public static final IAbstractGoalsFunctionsImpl INSTANCE = new AbstractGoalsFunctionsImpl();

    private AbstractGoalsFunctionsImpl() {}

  }
  
  public static class AbstractGoalsFunctions {

    private AbstractGoalsFunctions() {}

  }

  public static interface IProjectGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0edd1bad-2128-11e8-8246-67c1f1659098")
    public cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoals GetGoals();

  }
  
  public static interface IProjectGoalsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProjectGoalsFunctionsImpl implements IProjectGoalsFunctionsImpl {

    public static final IProjectGoalsFunctionsImpl INSTANCE = new ProjectGoalsFunctionsImpl();

    private ProjectGoalsFunctionsImpl() {}

  }
  
  public static class ProjectGoalsFunctions {

    private ProjectGoalsFunctions() {}

  }

  public static interface ISystemGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1b771f26-2128-11e8-8246-67c1f1659098")
    public cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoals GetGoals();

  }
  
  public static interface ISystemGoalsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemGoalsFunctionsImpl implements ISystemGoalsFunctionsImpl {

    public static final ISystemGoalsFunctionsImpl INSTANCE = new SystemGoalsFunctionsImpl();

    private SystemGoalsFunctionsImpl() {}

  }
  
  public static class SystemGoalsFunctions {

    private SystemGoalsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2cf3f1a9-c1d8-11e6-8517-1bc2821627a9,qtbc+ad/E0opO31RCvRC+MjX0X8=] */
