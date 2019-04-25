package cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[74f41492-6748-11e9-9ec9-5fbc84faaeb1,imports]] */

/* End Protected Region   [[74f41492-6748-11e9-9ec9-5fbc84faaeb1,imports]] */

public class FunctionSpace_TestInfrastructure {

  /* Begin Protected Region [[74f41492-6748-11e9-9ec9-5fbc84faaeb1]] */
  
  /* End Protected Region   [[74f41492-6748-11e9-9ec9-5fbc84faaeb1]] */


  public static interface IAbstractTestInfrastructuresFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("87a64de9-6748-11e9-9ec9-5fbc84faaeb1")
    public cleon.architecturemethods.itarc42.spec.itarc42.javamodel.IItArc42Document GetItArchitecture();

  }
  
  public static interface IAbstractTestInfrastructuresFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractTestInfrastructuresFunctionsImpl implements IAbstractTestInfrastructuresFunctionsImpl {

    public static final IAbstractTestInfrastructuresFunctionsImpl INSTANCE = new AbstractTestInfrastructuresFunctionsImpl();

    private AbstractTestInfrastructuresFunctionsImpl() {}

  }
  
  public static class AbstractTestInfrastructuresFunctions {

    private AbstractTestInfrastructuresFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,74f41492-6748-11e9-9ec9-5fbc84faaeb1,CMQfuSRuX9/CbfWnJLAsqY0XGGU=] */
