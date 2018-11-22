package cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[251bbe8a-27f3-11e6-b263-9db62e053e59,imports]] */

/* End Protected Region   [[251bbe8a-27f3-11e6-b263-9db62e053e59,imports]] */

public class FunctionSpace_System_and_Scope {

  /* Begin Protected Region [[251bbe8a-27f3-11e6-b263-9db62e053e59]] */
  
  /* End Protected Region   [[251bbe8a-27f3-11e6-b263-9db62e053e59]] */


  public static interface IFlowFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2c318d8e-27f3-11e6-b263-9db62e053e59")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("0a1c5b35-27f5-11e6-b263-9db62e053e59")
    public java.lang.String GetDirection();

  }
  
  public static interface IFlowFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FlowFunctionsImpl implements IFlowFunctionsImpl {

    public static final IFlowFunctionsImpl INSTANCE = new FlowFunctionsImpl();

    private FlowFunctionsImpl() {}

  }
  
  public static class FlowFunctions {

    private FlowFunctions() {}

  }

  public static interface ISystem_Scope_and_ContextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c21cdca8-4a71-11e6-b2ea-f94c9b140b76")
    public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem GetSystem();

  }
  
  public static interface ISystem_Scope_and_ContextFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class System_Scope_and_ContextFunctionsImpl implements ISystem_Scope_and_ContextFunctionsImpl {

    public static final ISystem_Scope_and_ContextFunctionsImpl INSTANCE = new System_Scope_and_ContextFunctionsImpl();

    private System_Scope_and_ContextFunctionsImpl() {}

  }
  
  public static class System_Scope_and_ContextFunctions {

    private System_Scope_and_ContextFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,251bbe8a-27f3-11e6-b263-9db62e053e59,mTGx1QVFDfU0UqQqQGkT2Qmc2nY=] */
