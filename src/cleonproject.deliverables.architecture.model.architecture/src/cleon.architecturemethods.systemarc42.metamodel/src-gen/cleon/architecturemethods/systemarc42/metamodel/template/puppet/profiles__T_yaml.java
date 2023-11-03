package cleon.architecturemethods.systemarc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[e4b3c6b7-cce7-11ea-8b73-6b1c6b53a7a6,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.javamodel.Snmpcustomadvanced;
import cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.javamodel.Snmpcustomtable;

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

  public static interface INamedSensorFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e2183739-f3fb-11ea-ade2-eb32c9704a85")
    public java.lang.String RenderSensor();

    @IDynamicResourceExtension.MethodId("0656ee55-f3fc-11ea-ade2-eb32c9704a85")
    public java.lang.String RenderSpecificSensor();

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

  public static interface IwmidiskspaceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ba313464-6539-11eb-bf13-ade897aac2eb")
    public java.lang.String RenderSensor();

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

  public static interface IexeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("88287c35-d625-11ea-96bb-39ddde1b696a")
    public java.lang.String RenderSpecificSensor();

  }
  
  public static interface IexeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class exeFunctionsImpl implements IexeFunctionsImpl {

    public static final IexeFunctionsImpl INSTANCE = new exeFunctionsImpl();

    private exeFunctionsImpl() {}

  }
  
  public static class exeFunctions {

    private exeFunctions() {}

  }

  public static interface IrestcustomFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c6554aeb-dc89-11ea-a169-cb4c6ff66798")
    public java.lang.String RenderSpecificSensor();

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

  public static interface IhttpFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5092f817-dc98-11ea-b5f8-77c3980a1d0a")
    public java.lang.String RenderSensor();

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

  public static interface IesxserverhealthsensorexternFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("26a3f4fa-e3bb-11ea-84e3-5dbec94345a4")
    public java.lang.String RenderSensor();

  }
  
  public static interface IesxserverhealthsensorexternFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class esxserverhealthsensorexternFunctionsImpl implements IesxserverhealthsensorexternFunctionsImpl {

    public static final IesxserverhealthsensorexternFunctionsImpl INSTANCE = new esxserverhealthsensorexternFunctionsImpl();

    private esxserverhealthsensorexternFunctionsImpl() {}

  }
  
  public static class esxserverhealthsensorexternFunctions {

    private esxserverhealthsensorexternFunctions() {}

  }

  public static interface IhttpdataadvancedFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("30693b8b-e6c5-11ea-92fa-2db17cc89b0c")
    public java.lang.String RenderSpecificSensor();

  }
  
  public static interface IhttpdataadvancedFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class httpdataadvancedFunctionsImpl implements IhttpdataadvancedFunctionsImpl {

    public static final IhttpdataadvancedFunctionsImpl INSTANCE = new httpdataadvancedFunctionsImpl();

    private httpdataadvancedFunctionsImpl() {}

  }
  
  public static class httpdataadvancedFunctions {

    private httpdataadvancedFunctions() {}

  }

  public static interface IwmishareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("10dc285d-1cf9-11eb-acd1-95299b344117")
    public java.lang.String RenderSensor();

    @IDynamicResourceExtension.MethodId("6dddd1c9-1cf9-11eb-acd1-95299b344117")
    public java.lang.String ShareName();

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

  public static interface IsnmpcustomadvancedFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f4fb4a2c-8af2-11eb-82c2-f3f196623a8b")
    public java.lang.String RenderSpecificSensor();

  }
  
  public static interface IsnmpcustomadvancedFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class snmpcustomadvancedFunctionsImpl implements IsnmpcustomadvancedFunctionsImpl {

    public static final IsnmpcustomadvancedFunctionsImpl INSTANCE = new snmpcustomadvancedFunctionsImpl();

    private snmpcustomadvancedFunctionsImpl() {}

  }
  
  public static class snmpcustomadvancedFunctions {

    private snmpcustomadvancedFunctions() {}

  }

  public static interface ISnmpCustomAdvancedChannelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("44bd1e5b-8af4-11eb-82c2-f3f196623a8b")
    public java.lang.Integer Position();

  }
  
  public static interface ISnmpCustomAdvancedChannelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("44bd1e5b-8af4-11eb-82c2-f3f196623a8b")
    public java.lang.Integer Position(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.javamodel.ISnmpCustomAdvancedChannel snmpCustomAdvancedChannel);

  }
  
  public static class SnmpCustomAdvancedChannelFunctionsImpl implements ISnmpCustomAdvancedChannelFunctionsImpl {

    public static final ISnmpCustomAdvancedChannelFunctionsImpl INSTANCE = new SnmpCustomAdvancedChannelFunctionsImpl();

    private SnmpCustomAdvancedChannelFunctionsImpl() {}

    @Override
    public java.lang.Integer Position(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.javamodel.ISnmpCustomAdvancedChannel snmpCustomAdvancedChannel) {
      /* Begin Protected Region [[44bd1e5b-8af4-11eb-82c2-f3f196623a8b]] */
    	var functions = snmpCustomAdvancedChannel.extension(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.FunctionSpace_SnmpCustomAdvanced.ISnmpCustomAdvancedChannelFunctions.class); 
    	int i = 0;
    	for( var channelIter : functions.AllChannels()) {
    		++i;
    		if( channelIter.equals(snmpCustomAdvancedChannel)) {
    			return i;
    		}
    	}
    	return -1;
      /* End Protected Region   [[44bd1e5b-8af4-11eb-82c2-f3f196623a8b]] */
    }

  }
  
  public static class SnmpCustomAdvancedChannelFunctions {

    private SnmpCustomAdvancedChannelFunctions() {}

    public static java.lang.Integer Position(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.javamodel.ISnmpCustomAdvancedChannel snmpCustomAdvancedChannel) {
      return DynamicResourceUtil.invoke(ISnmpCustomAdvancedChannelFunctionsImpl.class, SnmpCustomAdvancedChannelFunctionsImpl.INSTANCE, snmpCustomAdvancedChannel).Position(snmpCustomAdvancedChannel);
    }

  }

  public static interface IsnmpcustomstringFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("64cd6fc0-0c98-11ec-a707-cfc3a993d4d5")
    public java.lang.String RenderSpecificSensor();

  }
  
  public static interface IsnmpcustomstringFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class snmpcustomstringFunctionsImpl implements IsnmpcustomstringFunctionsImpl {

    public static final IsnmpcustomstringFunctionsImpl INSTANCE = new snmpcustomstringFunctionsImpl();

    private snmpcustomstringFunctionsImpl() {}

  }
  
  public static class snmpcustomstringFunctions {

    private snmpcustomstringFunctions() {}

  }

  public static interface IsnmpcustomFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1788a400-7a35-11ee-911b-27377c0d1919")
    public java.lang.String RenderSpecificSensor();

  }
  
  public static interface IsnmpcustomFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class snmpcustomFunctionsImpl implements IsnmpcustomFunctionsImpl {

    public static final IsnmpcustomFunctionsImpl INSTANCE = new snmpcustomFunctionsImpl();

    private snmpcustomFunctionsImpl() {}

  }
  
  public static class snmpcustomFunctions {

    private snmpcustomFunctions() {}

  }

  public static interface ISnmpcustomtableFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f5785ac3-1ba2-11ec-b0bc-a9ea4d75c042")
    public java.lang.String RenderSpecificSensor();

  }
  
  public static interface ISnmpcustomtableFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SnmpcustomtableFunctionsImpl implements ISnmpcustomtableFunctionsImpl {

    public static final ISnmpcustomtableFunctionsImpl INSTANCE = new SnmpcustomtableFunctionsImpl();

    private SnmpcustomtableFunctionsImpl() {}

  }
  
  public static class SnmpcustomtableFunctions {

    private SnmpcustomtableFunctions() {}

  }

  public static interface ISnmpCustomTableChannelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("14c0ee78-1ba3-11ec-b0bc-a9ea4d75c042")
    public java.lang.Integer Position();

  }
  
  public static interface ISnmpCustomTableChannelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("14c0ee78-1ba3-11ec-b0bc-a9ea4d75c042")
    public java.lang.Integer Position(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.javamodel.ISnmpCustomTableChannel snmpCustomTableChannel);

  }
  
  public static class SnmpCustomTableChannelFunctionsImpl implements ISnmpCustomTableChannelFunctionsImpl {

    public static final ISnmpCustomTableChannelFunctionsImpl INSTANCE = new SnmpCustomTableChannelFunctionsImpl();

    private SnmpCustomTableChannelFunctionsImpl() {}

    @Override
    public java.lang.Integer Position(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.javamodel.ISnmpCustomTableChannel snmpCustomTableChannel) {
      /* Begin Protected Region [[14c0ee78-1ba3-11ec-b0bc-a9ea4d75c042]] */
    	var parent = Snmpcustomtable.selectToMeSnmpCustomTableChannels(snmpCustomTableChannel);
    	int i = 1;
    	for( var channel : parent.selectSnmpCustomTableChannels()) {
    		if( channel.equals(snmpCustomTableChannel)) {
    			 return i;
    		}
    		++i;
    	}
    	return -1;
      /* End Protected Region   [[14c0ee78-1ba3-11ec-b0bc-a9ea4d75c042]] */
    }

  }
  
  public static class SnmpCustomTableChannelFunctions {

    private SnmpCustomTableChannelFunctions() {}

    public static java.lang.Integer Position(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.javamodel.ISnmpCustomTableChannel snmpCustomTableChannel) {
      return DynamicResourceUtil.invoke(ISnmpCustomTableChannelFunctionsImpl.class, SnmpCustomTableChannelFunctionsImpl.INSTANCE, snmpCustomTableChannel).Position(snmpCustomTableChannel);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,e4b3c6b7-cce7-11ea-8b73-6b1c6b53a7a6,3f2Sb/ROj9oS5uKIHV4BjG7xGx4=] */
