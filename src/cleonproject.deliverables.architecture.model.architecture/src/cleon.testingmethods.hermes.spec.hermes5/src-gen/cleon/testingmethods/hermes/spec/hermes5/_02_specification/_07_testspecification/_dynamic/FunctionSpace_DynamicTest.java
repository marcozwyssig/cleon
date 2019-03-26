package cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5353461a-4f8d-11e9-ad5d-977b17aab907,imports]] */

/* End Protected Region   [[5353461a-4f8d-11e9-ad5d-977b17aab907,imports]] */

public class FunctionSpace_DynamicTest {

  /* Begin Protected Region [[5353461a-4f8d-11e9-ad5d-977b17aab907]] */
  
  /* End Protected Region   [[5353461a-4f8d-11e9-ad5d-977b17aab907]] */


  public static interface IFunctionalDynamicTestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8aef9268-4f8d-11e9-ad5d-977b17aab907")
    public java.lang.String GetName();

  }
  
  public static interface IFunctionalDynamicTestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FunctionalDynamicTestFunctionsImpl implements IFunctionalDynamicTestFunctionsImpl {

    public static final IFunctionalDynamicTestFunctionsImpl INSTANCE = new FunctionalDynamicTestFunctionsImpl();

    private FunctionalDynamicTestFunctionsImpl() {}

  }
  
  public static class FunctionalDynamicTestFunctions {

    private FunctionalDynamicTestFunctions() {}

  }

  public static interface IQualityDynamicTestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b7a66937-4f8d-11e9-ad5d-977b17aab907")
    public java.lang.String GetName();

  }
  
  public static interface IQualityDynamicTestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class QualityDynamicTestFunctionsImpl implements IQualityDynamicTestFunctionsImpl {

    public static final IQualityDynamicTestFunctionsImpl INSTANCE = new QualityDynamicTestFunctionsImpl();

    private QualityDynamicTestFunctionsImpl() {}

  }
  
  public static class QualityDynamicTestFunctions {

    private QualityDynamicTestFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5353461a-4f8d-11e9-ad5d-977b17aab907,D9e/tDhHaViu4ZBmO/8mcyMXiYk=] */
