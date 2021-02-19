package cleon.common.doc.metamodel.spec.paragraph.table;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[3420b414-25a2-11eb-b9ae-4df44b18aa9b,imports]] */

/* End Protected Region   [[3420b414-25a2-11eb-b9ae-4df44b18aa9b,imports]] */

public class FunctionSpace_Table {

  /* Begin Protected Region [[3420b414-25a2-11eb-b9ae-4df44b18aa9b]] */
  
  /* End Protected Region   [[3420b414-25a2-11eb-b9ae-4df44b18aa9b]] */


  public static interface IRowFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3e679f91-25a2-11eb-b9ae-4df44b18aa9b")
    public java.lang.String First();

  }
  
  public static interface IRowFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RowFunctionsImpl implements IRowFunctionsImpl {

    public static final IRowFunctionsImpl INSTANCE = new RowFunctionsImpl();

    private RowFunctionsImpl() {}

  }
  
  public static class RowFunctions {

    private RowFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,3420b414-25a2-11eb-b9ae-4df44b18aa9b,QLK3mywFAL+H3M/8pIlerYZvc3s=] */
