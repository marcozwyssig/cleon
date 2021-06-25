package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[6f7a099f-c90b-11e5-a64e-a5d84d8f1b45,imports]] */
import java.util.stream.Collectors;
import cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.abstraction_level.javamodel.IFeatureLevelGroup;
import cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.abstraction_level.javamodel.IFunctionLevelGroup;

/* End Protected Region   [[6f7a099f-c90b-11e5-a64e-a5d84d8f1b45,imports]] */

public class FunctionSpace_Requirements {

  /* Begin Protected Region [[6f7a099f-c90b-11e5-a64e-a5d84d8f1b45]] */

  /* End Protected Region   [[6f7a099f-c90b-11e5-a64e-a5d84d8f1b45]] */


  public static interface IRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9a0b681e-c90b-11e5-a64e-a5d84d8f1b45")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> GetAllRequirements();

    @IDynamicResourceExtension.MethodId("0f54f2eb-0dd1-11e6-a33d-238391a68770")
    public java.lang.String GetRequirementType();

    @IDynamicResourceExtension.MethodId("87f5fade-decb-11e5-bcfc-4385ab45a525")
    public java.lang.String GetTemplate();

    @IDynamicResourceExtension.MethodId("4e98d118-e609-11e5-950a-cb0c4b71716c")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("f5702103-e61b-11e5-8630-f311cd9d9999")
    public java.lang.String GetUniqueName();

    @IDynamicResourceExtension.MethodId("b2f750bb-0e00-11e6-ae01-ef640c578b9b")
    public cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement GetParent();

    @IDynamicResourceExtension.MethodId("e0f79703-0e00-11e6-ae01-ef640c578b9b")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoal> GetGoals();

    @IDynamicResourceExtension.MethodId("52c50b22-0e01-11e6-ae01-ef640c578b9b")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoal> GetAllGoals();

    @IDynamicResourceExtension.MethodId("30e9c967-2cb1-11e6-8dd6-23b9a87b3ebd")
    public cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubjectArea GetSubjectArea();

    @IDynamicResourceExtension.MethodId("2ae79964-c82b-11e8-add3-695b26858127")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.stakeholder.javamodel.IStakeholder> GetAllStakeholders();

    @IDynamicResourceExtension.MethodId("416d48c7-c82b-11e8-add3-695b26858127")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.stakeholder.javamodel.IStakeholder> GetStakeholders();

    @IDynamicResourceExtension.MethodId("3d85c9e2-d243-11e8-98f7-fd7700abae04")
    public java.lang.String GetAbstractionLevel();

    @IDynamicResourceExtension.MethodId("e2eee980-d243-11e8-98f7-fd7700abae04")
    public cleon.common.resources.metamodel.spec.priority.javamodel.IPriority GetPriority();

    @IDynamicResourceExtension.MethodId("b5b4c5e5-e8e8-11e8-b810-cdb2b421fd42")
    public java.lang.Boolean HasTemplate();

    @IDynamicResourceExtension.MethodId("c26aab39-fc4a-11e8-af47-e5bdd8100025")
    public java.lang.String RenderNamespace();

    @IDynamicResourceExtension.MethodId("516e09e9-fc4c-11e8-af47-e5bdd8100025")
    public List<ch.actifsource.core.javamodel.IResource> GetNamespaces();

    @IDynamicResourceExtension.MethodId("9ac05816-1f1d-11e9-9b49-9d767b485444")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> OnlyKO();

    @IDynamicResourceExtension.MethodId("1a77e308-1fa5-11e9-ac4e-716424f48a26")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> NotKO();

    @IDynamicResourceExtension.MethodId("197d42aa-7e00-11e9-94cc-311930c9ea85")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> OnlyApprovedAndOnlySpecific();

    @IDynamicResourceExtension.MethodId("bb5e2826-72b1-11eb-860a-33696a010e76")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> OnlyRestricted();

    @IDynamicResourceExtension.MethodId("deff6a54-75a0-11eb-99f7-05e0e09fe318")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> OnlyDesignedOrImplementedOrFullfilledAndSpecific();

  }
  
  public static interface IRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9ac05816-1f1d-11e9-9b49-9d767b485444")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> OnlyKO(final List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirementList);

    @IDynamicResourceExtension.MethodId("1a77e308-1fa5-11e9-ac4e-716424f48a26")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> NotKO(final List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirementList);

    @IDynamicResourceExtension.MethodId("197d42aa-7e00-11e9-94cc-311930c9ea85")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> OnlyApprovedAndOnlySpecific(final List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirementList);

    @IDynamicResourceExtension.MethodId("bb5e2826-72b1-11eb-860a-33696a010e76")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> OnlyRestricted(final List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirementList);

    @IDynamicResourceExtension.MethodId("deff6a54-75a0-11eb-99f7-05e0e09fe318")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> OnlyDesignedOrImplementedOrFullfilledAndSpecific(final List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirementList);

  }
  
  public static class RequirementFunctionsImpl implements IRequirementFunctionsImpl {

    public static final IRequirementFunctionsImpl INSTANCE = new RequirementFunctionsImpl();

    private RequirementFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> OnlyKO(final List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirementList) {
      /* Begin Protected Region [[9ac05816-1f1d-11e9-9b49-9d767b485444]] */
      return requirementList.stream().filter(x -> {
      	final var func = x.extension(IRequirementFunctions.class);
      	final var prio = func.GetPriority();
      	if( prio != null)
      	{
      		final var prioFunc =
      				prio.extension(cleon.common.resources.metamodel.spec.priority.FunctionSpace_Priority.IPriorityFunctions.class);
      		return prioFunc.IsKO();
      	}
      	return true;
      }).collect(Collectors.toList());
      /* End Protected Region   [[9ac05816-1f1d-11e9-9b49-9d767b485444]] */
    }

    @Override
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> NotKO(final List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirementList) {
      /* Begin Protected Region [[1a77e308-1fa5-11e9-ac4e-716424f48a26]] */
      return requirementList.stream().filter(x -> {
      	final var func = x.extension(IRequirementFunctions.class);
      	final var prio = func.GetPriority();
      	if( prio != null)
      	{
      		final var prioFunc =
      				prio.extension(cleon.common.resources.metamodel.spec.priority.FunctionSpace_Priority.IPriorityFunctions.class);
      		return !prioFunc.IsKO();
      	}
      	return true;
      }).collect(Collectors.toList());
      /* End Protected Region   [[1a77e308-1fa5-11e9-ac4e-716424f48a26]] */
    }

    @Override
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> OnlyApprovedAndOnlySpecific(final List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirementList) {
      /* Begin Protected Region [[197d42aa-7e00-11e9-94cc-311930c9ea85]] */
      return requirementList.stream().filter(x -> {
      	final var state = x.selectState();
      	return (state.isApproved() || state.isDesigned() || state.isFulfilled() || state.isImplemented()) && (x.selectAbstractionLevel() instanceof IFeatureLevelGroup || x.selectAbstractionLevel() instanceof IFunctionLevelGroup );
      }).collect(Collectors.toList());
      /* End Protected Region   [[197d42aa-7e00-11e9-94cc-311930c9ea85]] */
    }

    @Override
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> OnlyRestricted(final List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirementList) {
      /* Begin Protected Region [[bb5e2826-72b1-11eb-860a-33696a010e76]] */
      return requirementList.stream().filter(x -> {
      	final var state = x.selectState();
      	return (state.isRejected() || state.isRejected__F___N_QS__O_());
      }).collect(Collectors.toList());
      /* End Protected Region   [[bb5e2826-72b1-11eb-860a-33696a010e76]] */
    }

    @Override
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> OnlyDesignedOrImplementedOrFullfilledAndSpecific(final List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirementList) {
      /* Begin Protected Region [[deff6a54-75a0-11eb-99f7-05e0e09fe318]] */
      return requirementList.stream().filter(x -> {
      	final var state = x.selectState();
      	return (state.isImplemented() || state.isDesigned() || state.isFulfilled()) && (x.selectAbstractionLevel() instanceof IFeatureLevelGroup || x.selectAbstractionLevel() instanceof IFunctionLevelGroup );
      }).collect(Collectors.toList());

      /* End Protected Region   [[deff6a54-75a0-11eb-99f7-05e0e09fe318]] */
    }

  }
  
  public static class RequirementFunctions {

    private RequirementFunctions() {}

    public static List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> OnlyKO(final List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirementList) {
      return DynamicResourceUtil.invoke(IRequirementFunctionsImpl.class, RequirementFunctionsImpl.INSTANCE, requirementList).OnlyKO(requirementList);
    }

    public static List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> NotKO(final List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirementList) {
      return DynamicResourceUtil.invoke(IRequirementFunctionsImpl.class, RequirementFunctionsImpl.INSTANCE, requirementList).NotKO(requirementList);
    }

    public static List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> OnlyApprovedAndOnlySpecific(final List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirementList) {
      return DynamicResourceUtil.invoke(IRequirementFunctionsImpl.class, RequirementFunctionsImpl.INSTANCE, requirementList).OnlyApprovedAndOnlySpecific(requirementList);
    }

    public static List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> OnlyRestricted(final List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirementList) {
      return DynamicResourceUtil.invoke(IRequirementFunctionsImpl.class, RequirementFunctionsImpl.INSTANCE, requirementList).OnlyRestricted(requirementList);
    }

    public static List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> OnlyDesignedOrImplementedOrFullfilledAndSpecific(final List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirementList) {
      return DynamicResourceUtil.invoke(IRequirementFunctionsImpl.class, RequirementFunctionsImpl.INSTANCE, requirementList).OnlyDesignedOrImplementedOrFullfilledAndSpecific(requirementList);
    }

  }

  public static interface IFormalFunctionalRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("40854325-0dd1-11e6-a33d-238391a68770")
    public java.lang.String GetRequirementType();

    @IDynamicResourceExtension.MethodId("555eef5e-e8f0-11e8-b810-cdb2b421fd42")
    public java.lang.Boolean HasTemplate();

  }
  
  public static interface IFormalFunctionalRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("555eef5e-e8f0-11e8-b810-cdb2b421fd42")
    public java.lang.Boolean HasTemplate(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IFormalFunctionalRequirement formalFunctionalRequirement);

  }
  
  public static class FormalFunctionalRequirementFunctionsImpl implements IFormalFunctionalRequirementFunctionsImpl {

    public static final IFormalFunctionalRequirementFunctionsImpl INSTANCE = new FormalFunctionalRequirementFunctionsImpl();

    private FormalFunctionalRequirementFunctionsImpl() {}

    @Override
    public java.lang.Boolean HasTemplate(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IFormalFunctionalRequirement formalFunctionalRequirement) {
      return formalFunctionalRequirement.selectTemplate() != null;
    }

  }
  
  public static class FormalFunctionalRequirementFunctions {

    private FormalFunctionalRequirementFunctions() {}

    public static java.lang.Boolean HasTemplate(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IFormalFunctionalRequirement formalFunctionalRequirement) {
      return DynamicResourceUtil.invoke(IFormalFunctionalRequirementFunctionsImpl.class, FormalFunctionalRequirementFunctionsImpl.INSTANCE, formalFunctionalRequirement).HasTemplate(formalFunctionalRequirement);
    }

  }

  public static interface IUserStoryFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("64d252c1-0dd1-11e6-a33d-238391a68770")
    public java.lang.String GetRequirementType();

    @IDynamicResourceExtension.MethodId("c52744a7-e8f0-11e8-b810-cdb2b421fd42")
    public java.lang.Boolean HasTemplate();

  }
  
  public static interface IUserStoryFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("c52744a7-e8f0-11e8-b810-cdb2b421fd42")
    public java.lang.Boolean HasTemplate(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IUserStory userStory);

  }
  
  public static class UserStoryFunctionsImpl implements IUserStoryFunctionsImpl {

    public static final IUserStoryFunctionsImpl INSTANCE = new UserStoryFunctionsImpl();

    private UserStoryFunctionsImpl() {}

    @Override
    public java.lang.Boolean HasTemplate(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IUserStory userStory) {
      return false;
    }

  }
  
  public static class UserStoryFunctions {

    private UserStoryFunctions() {}

    public static java.lang.Boolean HasTemplate(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IUserStory userStory) {
      return DynamicResourceUtil.invoke(IUserStoryFunctionsImpl.class, UserStoryFunctionsImpl.INSTANCE, userStory).HasTemplate(userStory);
    }

  }

  public static interface ISimpleFunctionalRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6d6aa41a-0dd1-11e6-a33d-238391a68770")
    public java.lang.String GetRequirementType();

    @IDynamicResourceExtension.MethodId("d9d17644-e8e8-11e8-b810-cdb2b421fd42")
    public java.lang.Boolean HasTemplate();

  }
  
  public static interface ISimpleFunctionalRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d9d17644-e8e8-11e8-b810-cdb2b421fd42")
    public java.lang.Boolean HasTemplate(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.ISimpleFunctionalRequirement simpleFunctionalRequirement);

  }
  
  public static class SimpleFunctionalRequirementFunctionsImpl implements ISimpleFunctionalRequirementFunctionsImpl {

    public static final ISimpleFunctionalRequirementFunctionsImpl INSTANCE = new SimpleFunctionalRequirementFunctionsImpl();

    private SimpleFunctionalRequirementFunctionsImpl() {}

    @Override
    public java.lang.Boolean HasTemplate(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.ISimpleFunctionalRequirement simpleFunctionalRequirement) {
      return false;
    }

  }
  
  public static class SimpleFunctionalRequirementFunctions {

    private SimpleFunctionalRequirementFunctions() {}

    public static java.lang.Boolean HasTemplate(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.ISimpleFunctionalRequirement simpleFunctionalRequirement) {
      return DynamicResourceUtil.invoke(ISimpleFunctionalRequirementFunctionsImpl.class, SimpleFunctionalRequirementFunctionsImpl.INSTANCE, simpleFunctionalRequirement).HasTemplate(simpleFunctionalRequirement);
    }

  }

  public static interface ITechnologyRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("787925cd-0dd1-11e6-a33d-238391a68770")
    public java.lang.String GetRequirementType();

  }
  
  public static interface ITechnologyRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TechnologyRequirementFunctionsImpl implements ITechnologyRequirementFunctionsImpl {

    public static final ITechnologyRequirementFunctionsImpl INSTANCE = new TechnologyRequirementFunctionsImpl();

    private TechnologyRequirementFunctionsImpl() {}

  }
  
  public static class TechnologyRequirementFunctions {

    private TechnologyRequirementFunctions() {}

  }

  public static interface IConstraintRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("83707576-0dd1-11e6-a33d-238391a68770")
    public java.lang.String GetRequirementType();

  }
  
  public static interface IConstraintRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ConstraintRequirementFunctionsImpl implements IConstraintRequirementFunctionsImpl {

    public static final IConstraintRequirementFunctionsImpl INSTANCE = new ConstraintRequirementFunctionsImpl();

    private ConstraintRequirementFunctionsImpl() {}

  }
  
  public static class ConstraintRequirementFunctions {

    private ConstraintRequirementFunctions() {}

  }

  public static interface IQualityRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8d307dfe-0dd1-11e6-a33d-238391a68770")
    public java.lang.String GetRequirementType();

  }
  
  public static interface IQualityRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class QualityRequirementFunctionsImpl implements IQualityRequirementFunctionsImpl {

    public static final IQualityRequirementFunctionsImpl INSTANCE = new QualityRequirementFunctionsImpl();

    private QualityRequirementFunctionsImpl() {}

  }
  
  public static class QualityRequirementFunctions {

    private QualityRequirementFunctions() {}

  }

  public static interface ISecurityRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("991477f1-0dd1-11e6-a33d-238391a68770")
    public java.lang.String GetRequirementType();

  }
  
  public static interface ISecurityRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SecurityRequirementFunctionsImpl implements ISecurityRequirementFunctionsImpl {

    public static final ISecurityRequirementFunctionsImpl INSTANCE = new SecurityRequirementFunctionsImpl();

    private SecurityRequirementFunctionsImpl() {}

  }
  
  public static class SecurityRequirementFunctions {

    private SecurityRequirementFunctions() {}

  }

  public static interface IRequirementStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("74bc6aa9-3d28-11e6-ae46-774fb9bfeae7")
    public java.lang.String GetStateName();

  }
  
  public static interface IRequirementStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("74bc6aa9-3d28-11e6-ae46-774fb9bfeae7")
    public java.lang.String GetStateName(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState requirementState);

  }
  
  public static class RequirementStateFunctionsImpl implements IRequirementStateFunctionsImpl {

    public static final IRequirementStateFunctionsImpl INSTANCE = new RequirementStateFunctionsImpl();

    private RequirementStateFunctionsImpl() {}

    @Override
    public java.lang.String GetStateName(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState requirementState) {
      if(requirementState.isRejected__F___N_QS__O_()) {
          		return "Rejected";
          	}
          	if (requirementState.isApproved__F___N_By__F_Supplier__O_()) {
          		return "Approved";
          	}
          	return requirementState.selectName();
    }

  }
  
  public static class RequirementStateFunctions {

    private RequirementStateFunctions() {}

    public static java.lang.String GetStateName(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState requirementState) {
      return DynamicResourceUtil.invoke(IRequirementStateFunctionsImpl.class, RequirementStateFunctionsImpl.INSTANCE, requirementState).GetStateName(requirementState);
    }

  }

  public static interface IPriorityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b8a7bd03-3d2a-11e6-ae46-774fb9bfeae7")
    public java.lang.String GetPriorityName();

  }
  
  public static interface IPriorityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b8a7bd03-3d2a-11e6-ae46-774fb9bfeae7")
    public java.lang.String GetPriorityName(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority);

  }
  
  public static class PriorityFunctionsImpl implements IPriorityFunctionsImpl {

    public static final IPriorityFunctionsImpl INSTANCE = new PriorityFunctionsImpl();

    private PriorityFunctionsImpl() {}

    @Override
    public java.lang.String GetPriorityName(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
       if(priority.isWon__M_t__F_have()) {
         return "";
       }
       return priority.selectName();
    }

  }
  
  public static class PriorityFunctions {

    private PriorityFunctions() {}

    public static java.lang.String GetPriorityName(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
      return DynamicResourceUtil.invoke(IPriorityFunctionsImpl.class, PriorityFunctionsImpl.INSTANCE, priority).GetPriorityName(priority);
    }

  }

  public static interface IAbstractRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b82ce62e-c4f5-11e5-b41d-5d67443850a2")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("d43d29ee-d243-11e8-98f7-fd7700abae04")
    public cleon.common.resources.metamodel.spec.priority.javamodel.IPriority GetPriority();

    @IDynamicResourceExtension.MethodId("66df8035-e0f6-11e8-8499-a3b0fb3cad90")
    public java.lang.String GetName();

  }
  
  public static interface IAbstractRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b82ce62e-c4f5-11e5-b41d-5d67443850a2")
    public java.lang.String GetId(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement abstractRequirement);

  }
  
  public static class AbstractRequirementFunctionsImpl implements IAbstractRequirementFunctionsImpl {

    public static final IAbstractRequirementFunctionsImpl INSTANCE = new AbstractRequirementFunctionsImpl();

    private AbstractRequirementFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement abstractRequirement) {
      return String.format("AF-%03d", abstractRequirement.selectIdentifier());
    }

  }
  
  public static class AbstractRequirementFunctions {

    private AbstractRequirementFunctions() {}

    public static java.lang.String GetId(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement abstractRequirement) {
      return DynamicResourceUtil.invoke(IAbstractRequirementFunctionsImpl.class, AbstractRequirementFunctionsImpl.INSTANCE, abstractRequirement).GetId(abstractRequirement);
    }

  }

  public static interface IRequirementAspectFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5aa95ad5-d243-11e8-98f7-fd7700abae04")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("efaf87c7-d243-11e8-98f7-fd7700abae04")
    public cleon.common.resources.metamodel.spec.priority.javamodel.IPriority GetPriority();

  }
  
  public static interface IRequirementAspectFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementAspectFunctionsImpl implements IRequirementAspectFunctionsImpl {

    public static final IRequirementAspectFunctionsImpl INSTANCE = new RequirementAspectFunctionsImpl();

    private RequirementAspectFunctionsImpl() {}

  }
  
  public static class RequirementAspectFunctions {

    private RequirementAspectFunctions() {}

  }

  public static interface INonFunctionalRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("97329637-e8f0-11e8-b810-cdb2b421fd42")
    public java.lang.Boolean HasTemplate();

  }
  
  public static interface INonFunctionalRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("97329637-e8f0-11e8-b810-cdb2b421fd42")
    public java.lang.Boolean HasTemplate(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.INonFunctionalRequirement nonFunctionalRequirement);

  }
  
  public static class NonFunctionalRequirementFunctionsImpl implements INonFunctionalRequirementFunctionsImpl {

    public static final INonFunctionalRequirementFunctionsImpl INSTANCE = new NonFunctionalRequirementFunctionsImpl();

    private NonFunctionalRequirementFunctionsImpl() {}

    @Override
    public java.lang.Boolean HasTemplate(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.INonFunctionalRequirement nonFunctionalRequirement) {
      return nonFunctionalRequirement.selectTemplate() != null;
    }

  }
  
  public static class NonFunctionalRequirementFunctions {

    private NonFunctionalRequirementFunctions() {}

    public static java.lang.Boolean HasTemplate(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.INonFunctionalRequirement nonFunctionalRequirement) {
      return DynamicResourceUtil.invoke(INonFunctionalRequirementFunctionsImpl.class, NonFunctionalRequirementFunctionsImpl.INSTANCE, nonFunctionalRequirement).HasTemplate(nonFunctionalRequirement);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,6f7a099f-c90b-11e5-a64e-a5d84d8f1b45,b+l+X1LiBTdFOvU/vjTlduRPGr0=] */
