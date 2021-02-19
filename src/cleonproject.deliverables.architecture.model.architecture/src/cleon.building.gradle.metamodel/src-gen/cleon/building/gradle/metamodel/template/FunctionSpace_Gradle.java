package cleon.building.gradle.metamodel.template;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[58f2a26b-c0b1-11e7-9af7-bb81e9802ff6,imports]] */

/* End Protected Region   [[58f2a26b-c0b1-11e7-9af7-bb81e9802ff6,imports]] */

public class FunctionSpace_Gradle {

  /* Begin Protected Region [[58f2a26b-c0b1-11e7-9af7-bb81e9802ff6]] */
  
  /* End Protected Region   [[58f2a26b-c0b1-11e7-9af7-bb81e9802ff6]] */


  public static interface IPluginFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4a2fe80e-c0b0-11e7-9af7-bb81e9802ff6")
    public java.lang.String PluginName();

    @IDynamicResourceExtension.MethodId("244a4149-c0b1-11e7-9af7-bb81e9802ff6")
    public java.lang.String Location();

    @IDynamicResourceExtension.MethodId("0bbb427b-c0b3-11e7-9af7-bb81e9802ff6")
    public java.lang.String Main();

    @IDynamicResourceExtension.MethodId("e351585f-c0b2-11e7-9af7-bb81e9802ff6")
    public java.lang.String Src();

    @IDynamicResourceExtension.MethodId("fa6d53df-c0b2-11e7-9af7-bb81e9802ff6")
    public java.lang.String Resources();

    @IDynamicResourceExtension.MethodId("ec10c3d5-c0b3-11e7-9af7-bb81e9802ff6")
    public java.lang.String Namespace();

    @IDynamicResourceExtension.MethodId("1cfd315c-c0b8-11e7-9af7-bb81e9802ff6")
    public java.lang.String FQNName();

    @IDynamicResourceExtension.MethodId("438f5c0f-c383-11e7-82c1-65e81e9048a7")
    public java.lang.String ImplemntationClass();

  }
  
  public static interface IPluginFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PluginFunctionsImpl implements IPluginFunctionsImpl {

    public static final IPluginFunctionsImpl INSTANCE = new PluginFunctionsImpl();

    private PluginFunctionsImpl() {}

  }
  
  public static class PluginFunctions {

    private PluginFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,58f2a26b-c0b1-11e7-9af7-bb81e9802ff6,g4DgiskzrDMe/P1ln7PXHaAm++c=] */
