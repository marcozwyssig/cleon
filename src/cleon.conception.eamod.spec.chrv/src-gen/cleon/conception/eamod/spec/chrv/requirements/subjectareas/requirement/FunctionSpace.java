package cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b1aaa471-c4f5-11e5-b41d-5d67443850a2,imports]] */

/* End Protected Region   [[b1aaa471-c4f5-11e5-b41d-5d67443850a2,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[b1aaa471-c4f5-11e5-b41d-5d67443850a2]] */
  
  /* End Protected Region   [[b1aaa471-c4f5-11e5-b41d-5d67443850a2]] */


  public static interface IRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b82ce62e-c4f5-11e5-b41d-5d67443850a2")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("4e98d118-e609-11e5-950a-cb0c4b71716c")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("f5702103-e61b-11e5-8630-f311cd9d9999")
    public java.lang.String GetUniqueName();

    @IDynamicResourceExtension.MethodId("b2f750bb-0e00-11e6-ae01-ef640c578b9b")
    public cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement GetParent();

    @IDynamicResourceExtension.MethodId("e0f79703-0e00-11e6-ae01-ef640c578b9b")
    public List<cleon.conception.eamod.spec.chrv.motivation.goals.javamodel.IGoal> GetGoals();

    @IDynamicResourceExtension.MethodId("52c50b22-0e01-11e6-ae01-ef640c578b9b")
    public List<cleon.conception.eamod.spec.chrv.motivation.goals.javamodel.IGoal> GetAllGoals();

    @IDynamicResourceExtension.MethodId("30e9c967-2cb1-11e6-8dd6-23b9a87b3ebd")
    public cleon.conception.eamod.spec.chrv.requirements.subjectareas.javamodel.ISubjectArea GetSubjectArea();

    @IDynamicResourceExtension.MethodId("45609ac6-10a4-11e8-ab55-75346738d444")
    public java.lang.String GetPriorityName();

  }
  
  public static interface IRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b82ce62e-c4f5-11e5-b41d-5d67443850a2")
    public java.lang.String GetId(final cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement requirement);

  }
  
  public static class RequirementFunctionsImpl implements IRequirementFunctionsImpl {

    public static final IRequirementFunctionsImpl INSTANCE = new RequirementFunctionsImpl();

    private RequirementFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement requirement) {
      return String.format("AF%03d", requirement.selectIdentifier());
    }

  }
  
  public static class RequirementFunctions {

    private RequirementFunctions() {}

    public static java.lang.String GetId(final cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement requirement) {
      return DynamicResourceUtil.invoke(IRequirementFunctionsImpl.class, RequirementFunctionsImpl.INSTANCE, requirement).GetId(requirement);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b1aaa471-c4f5-11e5-b41d-5d67443850a2,dSlStJvDSqpRC4C9lDJQVZXDEao=] */
