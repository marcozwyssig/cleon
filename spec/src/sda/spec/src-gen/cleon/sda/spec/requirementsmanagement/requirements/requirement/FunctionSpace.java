package cleon.sda.spec.requirementsmanagement.requirements.requirement;

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

  }
  
  public static interface IRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b82ce62e-c4f5-11e5-b41d-5d67443850a2")
    public java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement requirement);

  }
  
  public static class RequirementFunctionsImpl implements IRequirementFunctionsImpl {

    public static final IRequirementFunctionsImpl INSTANCE = new RequirementFunctionsImpl();

    private RequirementFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement requirement) {
      /* Begin Protected Region [[b82ce62e-c4f5-11e5-b41d-5d67443850a2]] */
      return String.format("R-%03d", requirement.selectIdentifier());
      /* End Protected Region   [[b82ce62e-c4f5-11e5-b41d-5d67443850a2]] */
    }

  }
  
  public static class RequirementFunctions {

    private RequirementFunctions() {}

    public static java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement requirement) {
      return DynamicResourceUtil.invoke(IRequirementFunctionsImpl.class, RequirementFunctionsImpl.INSTANCE, requirement).GetId(requirement);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b1aaa471-c4f5-11e5-b41d-5d67443850a2,Dh2K539XwZ01cNCu0GiseDfQaZU=] */
