package cleon.support.documentation.template.docbook.eamod.chrv;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[58aa1a04-3e05-11e6-9bf8-29c5fda07fa3,imports]] */

/* End Protected Region   [[58aa1a04-3e05-11e6-9bf8-29c5fda07fa3,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[58aa1a04-3e05-11e6-9bf8-29c5fda07fa3]] */
  
  /* End Protected Region   [[58aa1a04-3e05-11e6-9bf8-29c5fda07fa3]] */


  public static interface IRequirementsManagementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6a0834b7-3e05-11e6-9bf8-29c5fda07fa3")
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

  public static interface IRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8c34ea43-3e07-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("a790eef1-3e09-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderAttributes();

    @IDynamicResourceExtension.MethodId("a59ef479-3e12-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderElementName();

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

  public static interface ISubjectAreaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f99b0ba5-3e12-11e6-9bf8-29c5fda07fa3")
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

  public static interface IDriverFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d0380aa7-3f61-11e6-85d8-3328a679e82b")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("6334a805-3f69-11e6-85d8-3328a679e82b")
    public java.lang.String RenderAttributes();

  }
  
  public static interface IDriverFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DriverFunctionsImpl implements IDriverFunctionsImpl {

    public static final IDriverFunctionsImpl INSTANCE = new DriverFunctionsImpl();

    private DriverFunctionsImpl() {}

  }
  
  public static class DriverFunctions {

    private DriverFunctions() {}

  }

  public static interface IDriversFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9a9392cf-3f68-11e6-85d8-3328a679e82b")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("8c322d43-101b-11e8-aa81-af810fce42df")
    public java.lang.String RenderElementName();

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

    @IDynamicResourceExtension.MethodId("38af61c2-3f6a-11e6-85d8-3328a679e82b")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("8bb58328-101b-11e8-aa81-af810fce42df")
    public java.lang.String RenderElementName();

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

    @IDynamicResourceExtension.MethodId("4c5a2c11-3f6a-11e6-85d8-3328a679e82b")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("4c5a2cdd-3f6a-11e6-85d8-3328a679e82b")
    public java.lang.String RenderAttributes();

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

  public static interface ISourcesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("23291a44-3f6d-11e6-85d8-3328a679e82b")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("9683ee2b-101b-11e8-aa81-af810fce42df")
    public java.lang.String RenderElementName();

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

  public static interface IPrinciplesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("673c5bb2-3f6e-11e6-85d8-3328a679e82b")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("8814b5e0-101b-11e8-aa81-af810fce42df")
    public java.lang.String RenderElementName();

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

  public static interface IPrincipleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6eef565e-3f6e-11e6-85d8-3328a679e82b")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("6eef5750-3f6e-11e6-85d8-3328a679e82b")
    public java.lang.String RenderAttributes();

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

  public static interface ISubSubjectAreaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a0621c43-3f70-11e6-85d8-3328a679e82b")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("12ac7c84-3f7b-11e6-85d8-3328a679e82b")
    public java.lang.String RenderElementName();

  }
  
  public static interface ISubSubjectAreaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SubSubjectAreaFunctionsImpl implements ISubSubjectAreaFunctionsImpl {

    public static final ISubSubjectAreaFunctionsImpl INSTANCE = new SubSubjectAreaFunctionsImpl();

    private SubSubjectAreaFunctionsImpl() {}

  }
  
  public static class SubSubjectAreaFunctions {

    private SubSubjectAreaFunctions() {}

  }

  public static interface IStakeholdersFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0447c491-3f7e-11e6-85d8-3328a679e82b")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("5716a9da-1019-11e8-aa81-af810fce42df")
    public java.lang.String RenderElementName();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,58aa1a04-3e05-11e6-9bf8-29c5fda07fa3,1b2JwMOKh1p2Q4m2/aNjhcEkvmg=] */
