package cleon.sda.template.asciidoc.requirementsmanagement;

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
    public java.lang.String RenderDocumentContent();

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

  public static interface IRequirementsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5e1a67ab-c90b-11e5-a64e-a5d84d8f1b45")
    public java.lang.String RenderDocumentContent();

  }
  
  public static interface IRequirementsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementsFunctionsImpl implements IRequirementsFunctionsImpl {

    public static final IRequirementsFunctionsImpl INSTANCE = new RequirementsFunctionsImpl();

    private RequirementsFunctionsImpl() {}

  }
  
  public static class RequirementsFunctions {

    private RequirementsFunctions() {}

  }

  public static interface IRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f70a0f00-c90c-11e5-a64e-a5d84d8f1b45")
    public java.lang.String RenderDocumentContent();

    @IDynamicResourceExtension.MethodId("87f5fade-decb-11e5-bcfc-4385ab45a525")
    public java.lang.String GetTemplate();

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
    public java.lang.String RenderDocumentContent();

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
    public java.lang.String RenderDocumentContent();

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
    public java.lang.String RenderDocumentContent();

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
    public java.lang.String RenderDocumentContent();

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
    public java.lang.String RenderDocumentContent();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,ca3949e8-bb83-11e5-b2f7-f515c847fa35,I08kvMpCcrdLFzyT6Us9vcDOBQU=] */
