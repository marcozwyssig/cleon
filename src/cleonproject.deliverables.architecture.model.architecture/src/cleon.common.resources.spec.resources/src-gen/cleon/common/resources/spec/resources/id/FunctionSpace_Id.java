package cleon.common.resources.spec.resources.id;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b13eb1c7-a551-11e8-8163-815a23011093,imports]] */

/* End Protected Region   [[b13eb1c7-a551-11e8-8163-815a23011093,imports]] */

public class FunctionSpace_Id {

  /* Begin Protected Region [[b13eb1c7-a551-11e8-8163-815a23011093]] */
  
  /* End Protected Region   [[b13eb1c7-a551-11e8-8163-815a23011093]] */


  public static interface IIntegerBusinessObjectIdFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b7ffd23e-a551-11e8-8163-815a23011093")
    public java.lang.String GetId();

  }
  
  public static interface IIntegerBusinessObjectIdFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class IntegerBusinessObjectIdFunctionsImpl implements IIntegerBusinessObjectIdFunctionsImpl {

    public static final IIntegerBusinessObjectIdFunctionsImpl INSTANCE = new IntegerBusinessObjectIdFunctionsImpl();

    private IntegerBusinessObjectIdFunctionsImpl() {}

  }
  
  public static class IntegerBusinessObjectIdFunctions {

    private IntegerBusinessObjectIdFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b13eb1c7-a551-11e8-8163-815a23011093,9XKLEjq6cr5IB7pF/AKoSQXFq74=] */
