package cleon.common.doc.metamodel.spec.paragraph;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2fcc117b-ed42-11ec-97a2-3feebb03f72b,imports]] */

/* End Protected Region   [[2fcc117b-ed42-11ec-97a2-3feebb03f72b,imports]] */

public class FunctionSpace_Paragraph {

  /* Begin Protected Region [[2fcc117b-ed42-11ec-97a2-3feebb03f72b]] */
  
  /* End Protected Region   [[2fcc117b-ed42-11ec-97a2-3feebb03f72b]] */


  public static interface IListItemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("54f9b83f-24ef-11ef-83a6-fdf80672957b")
    public java.lang.String AllItemsPlain();

  }
  
  public static interface IListItemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ListItemFunctionsImpl implements IListItemFunctionsImpl {

    public static final IListItemFunctionsImpl INSTANCE = new ListItemFunctionsImpl();

    private ListItemFunctionsImpl() {}

  }
  
  public static class ListItemFunctions {

    private ListItemFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2fcc117b-ed42-11ec-97a2-3feebb03f72b,fd/nfcVgFsiaf+mliW5BGDKHnBY=] */
