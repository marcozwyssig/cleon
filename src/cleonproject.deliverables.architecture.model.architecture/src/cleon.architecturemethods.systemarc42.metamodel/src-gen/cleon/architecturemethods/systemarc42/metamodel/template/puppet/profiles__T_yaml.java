package cleon.architecturemethods.systemarc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[e4b3c6b7-cce7-11ea-8b73-6b1c6b53a7a6,imports]] */

/* End Protected Region   [[e4b3c6b7-cce7-11ea-8b73-6b1c6b53a7a6,imports]] */

public class profiles__T_yaml {

  /* Begin Protected Region [[e4b3c6b7-cce7-11ea-8b73-6b1c6b53a7a6]] */

  /* End Protected Region   [[e4b3c6b7-cce7-11ea-8b73-6b1c6b53a7a6]] */


  public static interface ISensorFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0a33e205-cce9-11ea-8b73-6b1c6b53a7a6")
    public java.lang.String RenderSensor();

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

    @IDynamicResourceExtension.MethodId("4c21efbd-cce9-11ea-8b73-6b1c6b53a7a6")
    public java.lang.String RenderSensor();

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

  public static interface IexexmlFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("88287c35-d625-11ea-96bb-39ddde1b696a")
    public java.lang.String RenderSensor();

  }
  
  public static interface IexexmlFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class exexmlFunctionsImpl implements IexexmlFunctionsImpl {

    public static final IexexmlFunctionsImpl INSTANCE = new exexmlFunctionsImpl();

    private exexmlFunctionsImpl() {}

  }
  
  public static class exexmlFunctions {

    private exexmlFunctions() {}

  }

  public static interface IrestcustomFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c6554aeb-dc89-11ea-a169-cb4c6ff66798")
    public java.lang.String RenderSensor();

  }
  
  public static interface IrestcustomFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class restcustomFunctionsImpl implements IrestcustomFunctionsImpl {

    public static final IrestcustomFunctionsImpl INSTANCE = new restcustomFunctionsImpl();

    private restcustomFunctionsImpl() {}

  }
  
  public static class restcustomFunctions {

    private restcustomFunctions() {}

  }

  public static interface IRequestMethodFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0ee7c813-dc8a-11ea-a169-cb4c6ff66798")
    public java.lang.Integer value();

  }
  
  public static interface IRequestMethodFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("0ee7c813-dc8a-11ea-a169-cb4c6ff66798")
    public java.lang.Integer value(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IRequestMethod requestMethod);

  }
  
  public static class RequestMethodFunctionsImpl implements IRequestMethodFunctionsImpl {

    public static final IRequestMethodFunctionsImpl INSTANCE = new RequestMethodFunctionsImpl();

    private RequestMethodFunctionsImpl() {}

    @Override
    public java.lang.Integer value(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IRequestMethod requestMethod) {
      /* Begin Protected Region [[0ee7c813-dc8a-11ea-a169-cb4c6ff66798]] */
      if( requestMethod.isGET()) {
      	return 0;
      }
      return 1;
      /* End Protected Region   [[0ee7c813-dc8a-11ea-a169-cb4c6ff66798]] */
    }

  }
  
  public static class RequestMethodFunctions {

    private RequestMethodFunctions() {}

    public static java.lang.Integer value(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IRequestMethod requestMethod) {
      return DynamicResourceUtil.invoke(IRequestMethodFunctionsImpl.class, RequestMethodFunctionsImpl.INSTANCE, requestMethod).value(requestMethod);
    }

  }

  public static interface IRequestProtocolFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("712cf256-dc8a-11ea-a169-cb4c6ff66798")
    public java.lang.Integer value();

  }
  
  public static interface IRequestProtocolFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("712cf256-dc8a-11ea-a169-cb4c6ff66798")
    public java.lang.Integer value(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IRequestProtocol requestProtocol);

  }
  
  public static class RequestProtocolFunctionsImpl implements IRequestProtocolFunctionsImpl {

    public static final IRequestProtocolFunctionsImpl INSTANCE = new RequestProtocolFunctionsImpl();

    private RequestProtocolFunctionsImpl() {}

    @Override
    public java.lang.Integer value(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IRequestProtocol requestProtocol) {
      /* Begin Protected Region [[712cf256-dc8a-11ea-a169-cb4c6ff66798]] */
      if (requestProtocol.isHttp() ) {
      	return 0;
      }
      return 1;
      /* End Protected Region   [[712cf256-dc8a-11ea-a169-cb4c6ff66798]] */
    }

  }
  
  public static class RequestProtocolFunctions {

    private RequestProtocolFunctions() {}

    public static java.lang.Integer value(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IRequestProtocol requestProtocol) {
      return DynamicResourceUtil.invoke(IRequestProtocolFunctionsImpl.class, RequestProtocolFunctionsImpl.INSTANCE, requestProtocol).value(requestProtocol);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,e4b3c6b7-cce7-11ea-8b73-6b1c6b53a7a6,RLFCanWeJ9ncuEZr8m81GaWocUE=] */
