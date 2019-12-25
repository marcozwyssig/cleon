package cleon.modelinglanguages.network.metamodel.template.nwdiag;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2c349734-054f-11e9-b814-a133e521728c,imports]] */

/* End Protected Region   [[2c349734-054f-11e9-b814-a133e521728c,imports]] */

public class nwdiag__T_diag {

  /* Begin Protected Region [[2c349734-054f-11e9-b814-a133e521728c]] */
  
  /* End Protected Region   [[2c349734-054f-11e9-b814-a133e521728c]] */


  public static interface IGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0f23336f-09b0-11e9-8c40-11db3668c0c9")
    public java.lang.String RenderGroup();

  }
  
  public static interface IGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GroupFunctionsImpl implements IGroupFunctionsImpl {

    public static final IGroupFunctionsImpl INSTANCE = new GroupFunctionsImpl();

    private GroupFunctionsImpl() {}

  }
  
  public static class GroupFunctions {

    private GroupFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2c349734-054f-11e9-b814-a133e521728c,igugvshWsbj0dVEQsLY8U6WTgNc=] */
