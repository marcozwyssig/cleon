package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[86892e72-8b00-11eb-82c2-f3f196623a8b,imports]] */

/* End Protected Region   [[86892e72-8b00-11eb-82c2-f3f196623a8b,imports]] */

public class FunctionSpace_SnmpCustomAdvanced {

  /* Begin Protected Region [[86892e72-8b00-11eb-82c2-f3f196623a8b]] */
  
  /* End Protected Region   [[86892e72-8b00-11eb-82c2-f3f196623a8b]] */


  public static interface ISnmpCustomAdvancedChannelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8dfd9895-8b00-11eb-82c2-f3f196623a8b")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.javamodel.ISnmpCustomAdvancedChannel> AllChannels();

  }
  
  public static interface ISnmpCustomAdvancedChannelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SnmpCustomAdvancedChannelFunctionsImpl implements ISnmpCustomAdvancedChannelFunctionsImpl {

    public static final ISnmpCustomAdvancedChannelFunctionsImpl INSTANCE = new SnmpCustomAdvancedChannelFunctionsImpl();

    private SnmpCustomAdvancedChannelFunctionsImpl() {}

  }
  
  public static class SnmpCustomAdvancedChannelFunctions {

    private SnmpCustomAdvancedChannelFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,86892e72-8b00-11eb-82c2-f3f196623a8b,rUWWASw3EDG9ITguDGsJ16FCRss=] */
