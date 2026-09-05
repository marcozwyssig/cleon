package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5dfa0159-343f-11e9-bf4b-0d828c9b1ad6,imports]] */

/* End Protected Region   [[5dfa0159-343f-11e9-bf4b-0d828c9b1ad6,imports]] */

public class FunctionSpace_Change {

  /* Begin Protected Region [[5dfa0159-343f-11e9-bf4b-0d828c9b1ad6]] */
  
  /* End Protected Region   [[5dfa0159-343f-11e9-bf4b-0d828c9b1ad6]] */


  public static interface IChangesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6274b357-343f-11e9-bf4b-0d828c9b1ad6")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration GetSystemConfiguration();

  }
  
  public static interface IChangesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ChangesFunctionsImpl implements IChangesFunctionsImpl {

    public static final IChangesFunctionsImpl INSTANCE = new ChangesFunctionsImpl();

    private ChangesFunctionsImpl() {}

  }
  
  public static class ChangesFunctions {

    private ChangesFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5dfa0159-343f-11e9-bf4b-0d828c9b1ad6,SztssjX7F4hCdjZGe6g7dRU5KIg=] */
