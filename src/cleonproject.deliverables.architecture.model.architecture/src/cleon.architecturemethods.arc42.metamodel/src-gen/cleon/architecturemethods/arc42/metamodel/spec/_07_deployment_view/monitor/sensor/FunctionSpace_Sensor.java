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

    @IDynamicResourceExtension.MethodId("95b58b77-d8f2-11eb-b083-d9bf2ecd74ec")
    public java.lang.Integer Interval_aE__aA_s_aC_();

    @IDynamicResourceExtension.MethodId("32ba9ca3-da3e-11eb-8ffa-d7727a940bcf")
    public java.util.UUID ImplGuid();

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

  public static interface INamedSensorFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("52490832-f3fb-11ea-ade2-eb32c9704a85")
    public java.lang.String SimpleName();

  }
  
  public static interface INamedSensorFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedSensorFunctionsImpl implements INamedSensorFunctionsImpl {

    public static final INamedSensorFunctionsImpl INSTANCE = new NamedSensorFunctionsImpl();

    private NamedSensorFunctionsImpl() {}

  }
  
  public static class NamedSensorFunctions {

    private NamedSensorFunctions() {}

  }

  public static interface IhttpFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d4ad97d4-dc97-11ea-b5f8-77c3980a1d0a")
    public java.lang.String SimpleName();

  }
  
  public static interface IhttpFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class httpFunctionsImpl implements IhttpFunctionsImpl {

    public static final IhttpFunctionsImpl INSTANCE = new httpFunctionsImpl();

    private httpFunctionsImpl() {}

  }
  
  public static class httpFunctions {

    private httpFunctions() {}

  }

  public static interface IwmishareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f60cdd2b-1cf7-11eb-acd1-95299b344117")
    public java.lang.String SimpleName();

  }
  
  public static interface IwmishareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class wmishareFunctionsImpl implements IwmishareFunctionsImpl {

    public static final IwmishareFunctionsImpl INSTANCE = new wmishareFunctionsImpl();

    private wmishareFunctionsImpl() {}

  }
  
  public static class wmishareFunctions {

    private wmishareFunctions() {}

  }

  public static interface IwmidiskspaceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("009f865c-b966-11ec-a408-4ba6a2d760ef")
    public java.lang.String Drive();

    @IDynamicResourceExtension.MethodId("c245602e-b963-11ec-a408-4ba6a2d760ef")
    public java.lang.String Name();

  }
  
  public static interface IwmidiskspaceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class wmidiskspaceFunctionsImpl implements IwmidiskspaceFunctionsImpl {

    public static final IwmidiskspaceFunctionsImpl INSTANCE = new wmidiskspaceFunctionsImpl();

    private wmidiskspaceFunctionsImpl() {}

  }
  
  public static class wmidiskspaceFunctions {

    private wmidiskspaceFunctions() {}

  }

  public static interface ISensorClassFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("70061dc5-cd41-11ec-85c9-011c467ea292")
    public cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings LanguageSettings();

  }
  
  public static interface ISensorClassFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SensorClassFunctionsImpl implements ISensorClassFunctionsImpl {

    public static final ISensorClassFunctionsImpl INSTANCE = new SensorClassFunctionsImpl();

    private SensorClassFunctionsImpl() {}

  }
  
  public static class SensorClassFunctions {

    private SensorClassFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,ceab5078-d00c-11ea-b5a9-731249efa1a3,wtDbDhTdoT8V1T1MIy49ZwU/69I=] */
