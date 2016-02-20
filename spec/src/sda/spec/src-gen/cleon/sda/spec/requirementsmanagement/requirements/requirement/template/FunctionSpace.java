package cleon.sda.spec.requirementsmanagement.requirements.requirement.template;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b6e93918-d56c-11e5-89ea-2d8d86e9ef89,imports]] */

/* End Protected Region   [[b6e93918-d56c-11e5-89ea-2d8d86e9ef89,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[b6e93918-d56c-11e5-89ea-2d8d86e9ef89]] */
  
  /* End Protected Region   [[b6e93918-d56c-11e5-89ea-2d8d86e9ef89]] */


  public static interface IFunctionTemplateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c221b01e-d56c-11e5-89ea-2d8d86e9ef89")
    public java.lang.String GetName();

  }
  
  public static interface IFunctionTemplateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FunctionTemplateFunctionsImpl implements IFunctionTemplateFunctionsImpl {

    public static final IFunctionTemplateFunctionsImpl INSTANCE = new FunctionTemplateFunctionsImpl();

    private FunctionTemplateFunctionsImpl() {}

  }
  
  public static class FunctionTemplateFunctions {

    private FunctionTemplateFunctions() {}

  }

  public static interface IPropertyTemplateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f3c4f822-d575-11e5-89ea-2d8d86e9ef89")
    public java.lang.String GetName();

  }
  
  public static interface IPropertyTemplateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PropertyTemplateFunctionsImpl implements IPropertyTemplateFunctionsImpl {

    public static final IPropertyTemplateFunctionsImpl INSTANCE = new PropertyTemplateFunctionsImpl();

    private PropertyTemplateFunctionsImpl() {}

  }
  
  public static class PropertyTemplateFunctions {

    private PropertyTemplateFunctions() {}

  }

  public static interface IEnvironmentTemplateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ab6c0c8d-d654-11e5-beff-c5494779b7d9")
    public java.lang.String GetName();

  }
  
  public static interface IEnvironmentTemplateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EnvironmentTemplateFunctionsImpl implements IEnvironmentTemplateFunctionsImpl {

    public static final IEnvironmentTemplateFunctionsImpl INSTANCE = new EnvironmentTemplateFunctionsImpl();

    private EnvironmentTemplateFunctionsImpl() {}

  }
  
  public static class EnvironmentTemplateFunctions {

    private EnvironmentTemplateFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b6e93918-d56c-11e5-89ea-2d8d86e9ef89,BIXIHJu6YM7g57eJoZuChlaXNv4=] */
