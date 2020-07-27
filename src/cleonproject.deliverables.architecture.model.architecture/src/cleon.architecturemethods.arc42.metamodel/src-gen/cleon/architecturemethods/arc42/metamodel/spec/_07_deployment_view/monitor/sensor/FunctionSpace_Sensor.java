package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[ceab5078-d00c-11ea-b5a9-731249efa1a3,imports]] */

/* End Protected Region   [[ceab5078-d00c-11ea-b5a9-731249efa1a3,imports]] */

public class FunctionSpace_Sensor {

  /* Begin Protected Region [[ceab5078-d00c-11ea-b5a9-731249efa1a3]] */
  
  /* End Protected Region   [[ceab5078-d00c-11ea-b5a9-731249efa1a3]] */


  public static interface ISensorFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d6496308-d00c-11ea-b5a9-731249efa1a3")
    public java.lang.String SimpleName();

  }
  
  public static interface ISensorFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SensorFunctionsImpl implements ISensorFunctionsImpl {

    public static final ISensorFunctionsImpl INSTANCE = new SensorFunctionsImpl();

    private SensorFunctionsImpl() {}

  }
  
  public static class SensorFunctions {

    private SensorFunctions() {}

  }

  public static interface IwmiserviceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0f2d98d2-d00d-11ea-b5a9-731249efa1a3")
    public java.lang.String SimpleName();

  }
  
  public static interface IwmiserviceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class wmiserviceFunctionsImpl implements IwmiserviceFunctionsImpl {

    public static final IwmiserviceFunctionsImpl INSTANCE = new wmiserviceFunctionsImpl();

    private wmiserviceFunctionsImpl() {}

  }
  
  public static class wmiserviceFunctions {

    private wmiserviceFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,ceab5078-d00c-11ea-b5a9-731249efa1a3,uYH9D/IwMNIdTvcbEfVlwku6tTY=] */
