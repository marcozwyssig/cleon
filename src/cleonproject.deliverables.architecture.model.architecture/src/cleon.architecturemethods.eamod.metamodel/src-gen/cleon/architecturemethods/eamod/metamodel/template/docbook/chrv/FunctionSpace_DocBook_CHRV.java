package cleon.architecturemethods.eamod.metamodel.template.docbook.chrv;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[58aa1a04-3e05-11e6-9bf8-29c5fda07fa3,imports]] */

/* End Protected Region   [[58aa1a04-3e05-11e6-9bf8-29c5fda07fa3,imports]] */

public class FunctionSpace_DocBook_CHRV {

  /* Begin Protected Region [[58aa1a04-3e05-11e6-9bf8-29c5fda07fa3]] */
  
  /* End Protected Region   [[58aa1a04-3e05-11e6-9bf8-29c5fda07fa3]] */


  public static interface IRequirementsDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6a0834b7-3e05-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderChapters();

  }
  
  public static interface IRequirementsDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementsDocumentFunctionsImpl implements IRequirementsDocumentFunctionsImpl {

    public static final IRequirementsDocumentFunctionsImpl INSTANCE = new RequirementsDocumentFunctionsImpl();

    private RequirementsDocumentFunctionsImpl() {}

  }
  
  public static class RequirementsDocumentFunctions {

    private RequirementsDocumentFunctions() {}

  }

  public static interface IRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8c34ea43-3e07-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("a59ef479-3e12-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderElementName();

    @IDynamicResourceExtension.MethodId("8a8cb15a-3808-11e8-a088-c32925c50d0b")
    public java.lang.String RenderDescriptions();

  }
  
  public static interface IRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8a8cb15a-3808-11e8-a088-c32925c50d0b")
    public java.lang.String RenderDescriptions(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement requirement);

  }
  
  public static class RequirementFunctionsImpl implements IRequirementFunctionsImpl {

    public static final IRequirementFunctionsImpl INSTANCE = new RequirementFunctionsImpl();

    private RequirementFunctionsImpl() {}

    @Override
    public java.lang.String RenderDescriptions(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement requirement) {
      return null;
    }

  }
  
  public static class RequirementFunctions {

    private RequirementFunctions() {}

    public static java.lang.String RenderDescriptions(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement requirement) {
      return DynamicResourceUtil.invoke(IRequirementFunctionsImpl.class, RequirementFunctionsImpl.INSTANCE, requirement).RenderDescriptions(requirement);
    }

  }

  public static interface IDriverFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d0380aa7-3f61-11e6-85d8-3328a679e82b")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("59275c16-a523-11e8-a2c4-7500fc0b7ba9")
    public java.lang.String RenderDescriptions();

  }
  
  public static interface IDriverFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("59275c16-a523-11e8-a2c4-7500fc0b7ba9")
    public java.lang.String RenderDescriptions(final cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.drivers.javamodel.IDriver driver);

  }
  
  public static class DriverFunctionsImpl implements IDriverFunctionsImpl {

    public static final IDriverFunctionsImpl INSTANCE = new DriverFunctionsImpl();

    private DriverFunctionsImpl() {}

    @Override
    public java.lang.String RenderDescriptions(final cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.drivers.javamodel.IDriver driver) {
      return null;
    }

  }
  
  public static class DriverFunctions {

    private DriverFunctions() {}

    public static java.lang.String RenderDescriptions(final cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.drivers.javamodel.IDriver driver) {
      return DynamicResourceUtil.invoke(IDriverFunctionsImpl.class, DriverFunctionsImpl.INSTANCE, driver).RenderDescriptions(driver);
    }

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

    @IDynamicResourceExtension.MethodId("c6be5c8a-380b-11e8-a088-c32925c50d0b")
    public java.lang.String RenderDescriptions();

  }
  
  public static interface IGoalFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("c6be5c8a-380b-11e8-a088-c32925c50d0b")
    public java.lang.String RenderDescriptions(final cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.javamodel.IGoal goal);

  }
  
  public static class GoalFunctionsImpl implements IGoalFunctionsImpl {

    public static final IGoalFunctionsImpl INSTANCE = new GoalFunctionsImpl();

    private GoalFunctionsImpl() {}

    @Override
    public java.lang.String RenderDescriptions(final cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.javamodel.IGoal goal) {
      return null;
    }

  }
  
  public static class GoalFunctions {

    private GoalFunctions() {}

    public static java.lang.String RenderDescriptions(final cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.javamodel.IGoal goal) {
      return DynamicResourceUtil.invoke(IGoalFunctionsImpl.class, GoalFunctionsImpl.INSTANCE, goal).RenderDescriptions(goal);
    }

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

    @IDynamicResourceExtension.MethodId("caedd5b9-380b-11e8-a088-c32925c50d0b")
    public java.lang.String RenderDescriptions();

  }
  
  public static interface IPrincipleFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("caedd5b9-380b-11e8-a088-c32925c50d0b")
    public java.lang.String RenderDescriptions(final cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.principles.javamodel.IPrinciple principle);

  }
  
  public static class PrincipleFunctionsImpl implements IPrincipleFunctionsImpl {

    public static final IPrincipleFunctionsImpl INSTANCE = new PrincipleFunctionsImpl();

    private PrincipleFunctionsImpl() {}

    @Override
    public java.lang.String RenderDescriptions(final cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.principles.javamodel.IPrinciple principle) {
      return null;
    }

  }
  
  public static class PrincipleFunctions {

    private PrincipleFunctions() {}

    public static java.lang.String RenderDescriptions(final cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.principles.javamodel.IPrinciple principle) {
      return DynamicResourceUtil.invoke(IPrincipleFunctionsImpl.class, PrincipleFunctionsImpl.INSTANCE, principle).RenderDescriptions(principle);
    }

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

  public static interface IProjectSubjectAreaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ad245de1-e8e0-11e8-b810-cdb2b421fd42")
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

  public static interface IGlossaryFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("24049f94-e8d9-11e8-b810-cdb2b421fd42")
    public java.lang.String RenderElementName();

  }
  
  public static interface IGlossaryFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GlossaryFunctionsImpl implements IGlossaryFunctionsImpl {

    public static final IGlossaryFunctionsImpl INSTANCE = new GlossaryFunctionsImpl();

    private GlossaryFunctionsImpl() {}

  }
  
  public static class GlossaryFunctions {

    private GlossaryFunctions() {}

  }

  public static interface IEAModMethodFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("29a04aac-09b2-11e9-8c40-11db3668c0c9")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IEAModMethodFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EAModMethodFunctionsImpl implements IEAModMethodFunctionsImpl {

    public static final IEAModMethodFunctionsImpl INSTANCE = new EAModMethodFunctionsImpl();

    private EAModMethodFunctionsImpl() {}

  }
  
  public static class EAModMethodFunctions {

    private EAModMethodFunctions() {}

  }

  public static interface ISubjectAreaCoverageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("203a109f-ee3a-11e8-9756-27a593be2ffb")
    public java.lang.String RenderContentElement();

  }
  
  public static interface ISubjectAreaCoverageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SubjectAreaCoverageFunctionsImpl implements ISubjectAreaCoverageFunctionsImpl {

    public static final ISubjectAreaCoverageFunctionsImpl INSTANCE = new SubjectAreaCoverageFunctionsImpl();

    private SubjectAreaCoverageFunctionsImpl() {}

  }
  
  public static class SubjectAreaCoverageFunctions {

    private SubjectAreaCoverageFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,58aa1a04-3e05-11e6-9bf8-29c5fda07fa3,feD5hapAjqcznAYwXG5ClvxyjEs=] */
