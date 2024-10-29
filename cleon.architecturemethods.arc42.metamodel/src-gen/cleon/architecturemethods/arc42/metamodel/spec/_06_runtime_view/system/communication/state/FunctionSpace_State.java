package cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.state;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[625697c4-1770-11eb-aff5-dd5c3dd3a631,imports]] */

/* End Protected Region   [[625697c4-1770-11eb-aff5-dd5c3dd3a631,imports]] */

public class FunctionSpace_State {

  /* Begin Protected Region [[625697c4-1770-11eb-aff5-dd5c3dd3a631]] */
  
  /* End Protected Region   [[625697c4-1770-11eb-aff5-dd5c3dd3a631]] */


  public static interface IImplementedStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6d832881-1770-11eb-aff5-dd5c3dd3a631")
    public java.lang.String RefId();

  }
  
  public static interface IImplementedStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ImplementedStateFunctionsImpl implements IImplementedStateFunctionsImpl {

    public static final IImplementedStateFunctionsImpl INSTANCE = new ImplementedStateFunctionsImpl();

    private ImplementedStateFunctionsImpl() {}

  }
  
  public static class ImplementedStateFunctions {

    private ImplementedStateFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,625697c4-1770-11eb-aff5-dd5c3dd3a631,EVanv4SqVSFPOHAtquo3Dwm1Wy0=] */
