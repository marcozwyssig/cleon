package cleon.sda.spec.requirementsmanagement.requirements;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[6f7a099f-c90b-11e5-a64e-a5d84d8f1b45,imports]] */

/* End Protected Region   [[6f7a099f-c90b-11e5-a64e-a5d84d8f1b45,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[6f7a099f-c90b-11e5-a64e-a5d84d8f1b45]] */
  
  /* End Protected Region   [[6f7a099f-c90b-11e5-a64e-a5d84d8f1b45]] */


  public static interface IRequirementsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("775831cb-c90b-11e5-a64e-a5d84d8f1b45")
    public List<cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> GetAllRequirements();

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

    @IDynamicResourceExtension.MethodId("9a0b681e-c90b-11e5-a64e-a5d84d8f1b45")
    public List<cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> GetAllRequirements();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,6f7a099f-c90b-11e5-a64e-a5d84d8f1b45,n63F5Aaa+9Og5p5zLWHik+cd5IU=] */
