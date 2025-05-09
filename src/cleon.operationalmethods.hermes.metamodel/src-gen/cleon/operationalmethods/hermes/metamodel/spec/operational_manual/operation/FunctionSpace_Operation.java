package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[a4adb17b-1b2f-11e9-ad9a-a143a9cb74e7,imports]] */

/* End Protected Region   [[a4adb17b-1b2f-11e9-ad9a-a143a9cb74e7,imports]] */

public class FunctionSpace_Operation {

  /* Begin Protected Region [[a4adb17b-1b2f-11e9-ad9a-a143a9cb74e7]] */
  
  /* End Protected Region   [[a4adb17b-1b2f-11e9-ad9a-a143a9cb74e7]] */


  public static interface ISystemConfigurationOperationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("17ca8d9a-95ae-11ea-9744-7dd962dc1878")
    public List<ch.actifsource.core.javamodel.IResource> ChapterOrder();

  }
  
  public static interface ISystemConfigurationOperationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemConfigurationOperationFunctionsImpl implements ISystemConfigurationOperationFunctionsImpl {

    public static final ISystemConfigurationOperationFunctionsImpl INSTANCE = new SystemConfigurationOperationFunctionsImpl();

    private SystemConfigurationOperationFunctionsImpl() {}

  }
  
  public static class SystemConfigurationOperationFunctions {

    private SystemConfigurationOperationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,a4adb17b-1b2f-11e9-ad9a-a143a9cb74e7,bv5WKJ/kvMVzfHk0lFNxv2eq+sk=] */
