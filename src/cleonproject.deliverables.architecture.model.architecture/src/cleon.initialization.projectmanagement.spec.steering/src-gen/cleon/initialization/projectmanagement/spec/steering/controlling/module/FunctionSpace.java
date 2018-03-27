package cleon.initialization.projectmanagement.spec.steering.controlling.module;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[afaee166-be00-11e6-a3f0-c7681ee45a3f,imports]] */

/* End Protected Region   [[afaee166-be00-11e6-a3f0-c7681ee45a3f,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[afaee166-be00-11e6-a3f0-c7681ee45a3f]] */
  
  /* End Protected Region   [[afaee166-be00-11e6-a3f0-c7681ee45a3f]] */


  public static interface IModuleControllingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0bf0e40b-be0c-11e6-a3f0-c7681ee45a3f")
    public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklog GetBacklog();

  }
  
  public static interface IModuleControllingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ModuleControllingFunctionsImpl implements IModuleControllingFunctionsImpl {

    public static final IModuleControllingFunctionsImpl INSTANCE = new ModuleControllingFunctionsImpl();

    private ModuleControllingFunctionsImpl() {}

  }
  
  public static class ModuleControllingFunctions {

    private ModuleControllingFunctions() {}

  }

  public static interface IModulesControllingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e9b1fa92-3eb4-11e7-a89c-83d57940f0e3")
    public cleon.initialization.projectmanagement.spec.planning.javamodel.IPlanning GetPlanning();

  }
  
  public static interface IModulesControllingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ModulesControllingFunctionsImpl implements IModulesControllingFunctionsImpl {

    public static final IModulesControllingFunctionsImpl INSTANCE = new ModulesControllingFunctionsImpl();

    private ModulesControllingFunctionsImpl() {}

  }
  
  public static class ModulesControllingFunctions {

    private ModulesControllingFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,afaee166-be00-11e6-a3f0-c7681ee45a3f,aX5YWnR3idS/rGWfXLsg77juW2M=] */
