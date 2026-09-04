package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[3a890719-2be1-11f0-9ce1-09b647a63c7b,imports]] */

/* End Protected Region   [[3a890719-2be1-11f0-9ce1-09b647a63c7b,imports]] */

public class FunctionSpace_win_polycom_operations {

  /* Begin Protected Region [[3a890719-2be1-11f0-9ce1-09b647a63c7b]] */
  
  /* End Protected Region   [[3a890719-2be1-11f0-9ce1-09b647a63c7b]] */


  public static interface ILocalUserFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("49ad85f3-2be1-11f0-9ce1-09b647a63c7b")
    public java.lang.String Password();

  }
  
  public static interface ILocalUserFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LocalUserFunctionsImpl implements ILocalUserFunctionsImpl {

    public static final ILocalUserFunctionsImpl INSTANCE = new LocalUserFunctionsImpl();

    private LocalUserFunctionsImpl() {}

  }
  
  public static class LocalUserFunctions {

    private LocalUserFunctions() {}

  }

  public static interface ICleanUpTaskFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("299c7960-9553-11f0-b879-dbe8cc612bea")
    public java.lang.String LogonAs();

  }
  
  public static interface ICleanUpTaskFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CleanUpTaskFunctionsImpl implements ICleanUpTaskFunctionsImpl {

    public static final ICleanUpTaskFunctionsImpl INSTANCE = new CleanUpTaskFunctionsImpl();

    private CleanUpTaskFunctionsImpl() {}

  }
  
  public static class CleanUpTaskFunctions {

    private CleanUpTaskFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,3a890719-2be1-11f0-9ce1-09b647a63c7b,tOOn0E3zzzq1riaF5j1/WtKqoFA=] */
