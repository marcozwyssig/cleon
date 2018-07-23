package cleon.support.documentation.template.asciidoc.eamod.chrv;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[ca3949e8-bb83-11e5-b2f7-f515c847fa35,imports]] */

/* End Protected Region   [[ca3949e8-bb83-11e5-b2f7-f515c847fa35,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[ca3949e8-bb83-11e5-b2f7-f515c847fa35]] */
  
  /* End Protected Region   [[ca3949e8-bb83-11e5-b2f7-f515c847fa35]] */


  public static interface IRequirementDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1e6118a2-c029-11e5-b927-b1b055d0575f")
    public java.lang.String GetDocumentPath();

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

  public static interface IIssuesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7e23640e-ce67-11e5-8041-092cb74c72f2")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IIssuesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class IssuesFunctionsImpl implements IIssuesFunctionsImpl {

    public static final IIssuesFunctionsImpl INSTANCE = new IssuesFunctionsImpl();

    private IssuesFunctionsImpl() {}

  }
  
  public static class IssuesFunctions {

    private IssuesFunctions() {}

  }

  public static interface IProjectSubjectAreaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5e1a67ab-c90b-11e5-a64e-a5d84d8f1b45")
    public java.lang.String RenderContentElement();

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

    @IDynamicResourceExtension.MethodId("f70a0f00-c90c-11e5-a64e-a5d84d8f1b45")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("d770ab93-ffca-11e5-bd7b-8b0acf27d441")
    public java.lang.String GetFileName();

    @IDynamicResourceExtension.MethodId("6ae2843d-1230-11e8-b381-115accdaedda")
    public java.lang.String RenderChapter();

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

  public static interface ISourcesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8d704f22-c912-11e5-a64e-a5d84d8f1b45")
    public java.lang.String RenderContentElement();

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

  public static interface IGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b511455d-c912-11e5-a64e-a5d84d8f1b45")
    public java.lang.String RenderContentElement();

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

  public static interface IPrinciplesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bdefce04-c9a3-11e5-96e7-e5a5eee26591")
    public java.lang.String RenderContentElement();

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

  public static interface IDriversFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("011d6ab8-c9a5-11e5-96e7-e5a5eee26591")
    public java.lang.String RenderContentElement();

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

  public static interface IIssueGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5b24f52d-c5d6-11e5-9a6b-0bd3546aceff")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IIssueGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class IssueGroupFunctionsImpl implements IIssueGroupFunctionsImpl {

    public static final IIssueGroupFunctionsImpl INSTANCE = new IssueGroupFunctionsImpl();

    private IssueGroupFunctionsImpl() {}

  }
  
  public static class IssueGroupFunctions {

    private IssueGroupFunctions() {}

  }

  public static interface IStakeholdersFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a8de9213-0de1-11e6-a33d-238391a68770")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IStakeholdersFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class StakeholdersFunctionsImpl implements IStakeholdersFunctionsImpl {

    public static final IStakeholdersFunctionsImpl INSTANCE = new StakeholdersFunctionsImpl();

    private StakeholdersFunctionsImpl() {}

  }
  
  public static class StakeholdersFunctions {

    private StakeholdersFunctions() {}

  }

  public static interface IDestinctionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4185cb07-0e18-11e6-ae01-ef640c578b9b")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDestinctionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DestinctionFunctionsImpl implements IDestinctionFunctionsImpl {

    public static final IDestinctionFunctionsImpl INSTANCE = new DestinctionFunctionsImpl();

    private DestinctionFunctionsImpl() {}

  }
  
  public static class DestinctionFunctions {

    private DestinctionFunctions() {}

  }

  public static interface ISubjectAreaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("48643e07-15e2-11e6-b588-912e2ce0f2b0")
    public java.lang.String RenderContentElement();

  }
  
  public static interface ISubjectAreaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SubjectAreaFunctionsImpl implements ISubjectAreaFunctionsImpl {

    public static final ISubjectAreaFunctionsImpl INSTANCE = new SubjectAreaFunctionsImpl();

    private SubjectAreaFunctionsImpl() {}

  }
  
  public static class SubjectAreaFunctions {

    private SubjectAreaFunctions() {}

  }

  public static interface IRequirementsManagementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("57c59381-1d89-11e6-b329-f50056ef90a6")
    public java.lang.String RenderChapters();

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

  public static interface IGoalFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5a40bdab-15f2-11e6-be5f-0b820f273d17")
    public java.lang.String RenderContentElement();

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

  public static interface IPrincipleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ab295548-15f2-11e6-be5f-0b820f273d17")
    public java.lang.String RenderContentElement();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,ca3949e8-bb83-11e5-b2f7-f515c847fa35,N1G5oMUojYWsNrQSx3S81/PDqYs=] */