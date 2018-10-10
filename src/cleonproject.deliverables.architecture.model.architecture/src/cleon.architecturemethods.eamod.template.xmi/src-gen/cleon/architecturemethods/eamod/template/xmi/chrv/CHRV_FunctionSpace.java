package cleon.architecturemethods.eamod.template.xmi.chrv;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7a85e1e6-2991-11e6-bcff-d1d3ee74e69a,imports]] */

/* End Protected Region   [[7a85e1e6-2991-11e6-bcff-d1d3ee74e69a,imports]] */

public class CHRV_FunctionSpace {

  /* Begin Protected Region [[7a85e1e6-2991-11e6-bcff-d1d3ee74e69a]] */
  
  /* End Protected Region   [[7a85e1e6-2991-11e6-bcff-d1d3ee74e69a]] */


  public static interface IPrinciplesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("84ff4ffa-2991-11e6-bcff-d1d3ee74e69a")
    public java.lang.String RenderXmi();

  }
  
  public static interface IPrinciplesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PrinciplesFunctionsImpl implements IPrinciplesFunctionsImpl {

    public static final IPrinciplesFunctionsImpl INSTANCE = new PrinciplesFunctionsImpl();

    private PrinciplesFunctionsImpl() {}

  }
  
  public static class PrinciplesFunctions {

    private PrinciplesFunctions() {}

  }

  public static interface IRequirementDocumentFunctions extends IDynamicResourceExtension {

  }
  
  public static interface IRequirementDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementDocumentFunctionsImpl implements IRequirementDocumentFunctionsImpl {

    public static final IRequirementDocumentFunctionsImpl INSTANCE = new RequirementDocumentFunctionsImpl();

    private RequirementDocumentFunctionsImpl() {}

  }
  
  public static class RequirementDocumentFunctions {

    private RequirementDocumentFunctions() {}

  }

  public static interface IMotivationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bfc738d0-2991-11e6-bcff-d1d3ee74e69a")
    public java.lang.String RenderXmi();

    @IDynamicResourceExtension.MethodId("3f65c895-29a0-11e6-bcff-d1d3ee74e69a")
    public java.lang.String RenderCHMM();

  }
  
  public static interface IMotivationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MotivationFunctionsImpl implements IMotivationFunctionsImpl {

    public static final IMotivationFunctionsImpl INSTANCE = new MotivationFunctionsImpl();

    private MotivationFunctionsImpl() {}

  }
  
  public static class MotivationFunctions {

    private MotivationFunctions() {}

  }

  public static interface IRequirementsManagementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d837541a-2991-11e6-bcff-d1d3ee74e69a")
    public java.lang.String RenderXmi();

    @IDynamicResourceExtension.MethodId("27bf8d9f-29a0-11e6-bcff-d1d3ee74e69a")
    public java.lang.String RenderCHMM();

  }
  
  public static interface IRequirementsManagementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementsManagementFunctionsImpl implements IRequirementsManagementFunctionsImpl {

    public static final IRequirementsManagementFunctionsImpl INSTANCE = new RequirementsManagementFunctionsImpl();

    private RequirementsManagementFunctionsImpl() {}

  }
  
  public static class RequirementsManagementFunctions {

    private RequirementsManagementFunctions() {}

  }

  public static interface IProjectSubjectAreaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bf3e5d60-2995-11e6-bcff-d1d3ee74e69a")
    public java.lang.String RenderXmi();

    @IDynamicResourceExtension.MethodId("0ee30413-29a5-11e6-bcff-d1d3ee74e69a")
    public java.lang.String RenderCHMM();

  }
  
  public static interface IProjectSubjectAreaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProjectSubjectAreaFunctionsImpl implements IProjectSubjectAreaFunctionsImpl {

    public static final IProjectSubjectAreaFunctionsImpl INSTANCE = new ProjectSubjectAreaFunctionsImpl();

    private ProjectSubjectAreaFunctionsImpl() {}

  }
  
  public static class ProjectSubjectAreaFunctions {

    private ProjectSubjectAreaFunctions() {}

  }

  public static interface IRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("18d50689-2c92-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderToAggregation();

    @IDynamicResourceExtension.MethodId("aa38f500-2c94-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderFromAggregation();

    @IDynamicResourceExtension.MethodId("5d000f9f-2cb0-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderGoalDependency();

    @IDynamicResourceExtension.MethodId("0fad7c0a-2cb1-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderSubjectAreaDependency();

    @IDynamicResourceExtension.MethodId("28069a27-2cb6-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderGoalDependencyCHMM();

    @IDynamicResourceExtension.MethodId("2c28cc3e-2cb6-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderSubjectAreaDependencyCHMM();

    @IDynamicResourceExtension.MethodId("891362c8-2cc4-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderToAggregationCHMM();

    @IDynamicResourceExtension.MethodId("c0b83b03-2cc4-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderAbstrationCHMM();

  }
  
  public static interface IRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementFunctionsImpl implements IRequirementFunctionsImpl {

    public static final IRequirementFunctionsImpl INSTANCE = new RequirementFunctionsImpl();

    private RequirementFunctionsImpl() {}

  }
  
  public static class RequirementFunctions {

    private RequirementFunctions() {}

  }

  public static interface IPrincipleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e1e238fa-2c94-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderToAggregation();

    @IDynamicResourceExtension.MethodId("e1e26062-2c94-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderFromAggregation();

    @IDynamicResourceExtension.MethodId("a9be26d7-2cb6-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderToAggregationCHMM();

  }
  
  public static interface IPrincipleFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PrincipleFunctionsImpl implements IPrincipleFunctionsImpl {

    public static final IPrincipleFunctionsImpl INSTANCE = new PrincipleFunctionsImpl();

    private PrincipleFunctionsImpl() {}

  }
  
  public static class PrincipleFunctions {

    private PrincipleFunctions() {}

  }

  public static interface ISourcesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("dd72f742-2c9f-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderXmi();

  }
  
  public static interface ISourcesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourcesFunctionsImpl implements ISourcesFunctionsImpl {

    public static final ISourcesFunctionsImpl INSTANCE = new SourcesFunctionsImpl();

    private SourcesFunctionsImpl() {}

  }
  
  public static class SourcesFunctions {

    private SourcesFunctions() {}

  }

  public static interface ISourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("05473110-2ca0-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderToAggregation();

    @IDynamicResourceExtension.MethodId("05473168-2ca0-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderFromAggregation();

    @IDynamicResourceExtension.MethodId("1b128f7a-2cb6-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderToAggregationCHMM();

    /**
     * Function gets sourcename
     */
    @IDynamicResourceExtension.MethodId("e60e9b62-3d25-11e6-ae46-774fb9bfeae7")
    public java.lang.String GetSourceName();

  }
  
  public static interface ISourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceFunctionsImpl implements ISourceFunctionsImpl {

    public static final ISourceFunctionsImpl INSTANCE = new SourceFunctionsImpl();

    private SourceFunctionsImpl() {}

  }
  
  public static class SourceFunctions {

    private SourceFunctions() {}

  }

  public static interface ISourceAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fd30ce90-2cac-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderSourceDependency();

    @IDynamicResourceExtension.MethodId("d93005b7-2cb3-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderSourceDependencyCHMM();

  }
  
  public static interface ISourceAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceAwareFunctionsImpl implements ISourceAwareFunctionsImpl {

    public static final ISourceAwareFunctionsImpl INSTANCE = new SourceAwareFunctionsImpl();

    private SourceAwareFunctionsImpl() {}

  }
  
  public static class SourceAwareFunctions {

    private SourceAwareFunctions() {}

  }

  public static interface IDriversFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3d68c72c-2cad-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderXmi();

  }
  
  public static interface IDriversFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DriversFunctionsImpl implements IDriversFunctionsImpl {

    public static final IDriversFunctionsImpl INSTANCE = new DriversFunctionsImpl();

    private DriversFunctionsImpl() {}

  }
  
  public static class DriversFunctions {

    private DriversFunctions() {}

  }

  public static interface IGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("623a2192-2cad-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderXmi();

  }
  
  public static interface IGoalsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GoalsFunctionsImpl implements IGoalsFunctionsImpl {

    public static final IGoalsFunctionsImpl INSTANCE = new GoalsFunctionsImpl();

    private GoalsFunctionsImpl() {}

  }
  
  public static class GoalsFunctions {

    private GoalsFunctions() {}

  }

  public static interface IGoalFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2697c195-2cae-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderToAggregation(final cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.goals.javamodel.IGoal goal);

    @IDynamicResourceExtension.MethodId("2697c1ed-2cae-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderFromAggregation(final cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.goals.javamodel.IGoal goal);

    @IDynamicResourceExtension.MethodId("1e1186ca-2cb0-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderDriverDependency();

    @IDynamicResourceExtension.MethodId("428390f0-2cb5-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderToAggregationCHMM();

    @IDynamicResourceExtension.MethodId("db3cb45c-2cb5-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String RenderDriverDependencyCHMM();

  }
  
  public static interface IGoalFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GoalFunctionsImpl implements IGoalFunctionsImpl {

    public static final IGoalFunctionsImpl INSTANCE = new GoalFunctionsImpl();

    private GoalFunctionsImpl() {}

  }
  
  public static class GoalFunctions {

    private GoalFunctions() {}

  }

  public static interface ISourceReferenceFunctions extends IDynamicResourceExtension {

    /**
     * Function gets sourcename
     */
    @IDynamicResourceExtension.MethodId("2f0f6b8f-3d26-11e6-ae46-774fb9bfeae7")
    public java.lang.String GetSourceName();

  }
  
  public static interface ISourceReferenceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceReferenceFunctionsImpl implements ISourceReferenceFunctionsImpl {

    public static final ISourceReferenceFunctionsImpl INSTANCE = new SourceReferenceFunctionsImpl();

    private SourceReferenceFunctionsImpl() {}

  }
  
  public static class SourceReferenceFunctions {

    private SourceReferenceFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7a85e1e6-2991-11e6-bcff-d1d3ee74e69a,Nhd4aWd+ATE4OVnqCQTuAKeoWJ4=] */
