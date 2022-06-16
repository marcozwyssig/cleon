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


  public static interface INumberedListFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3ed0368c-ed42-11ec-97a2-3feebb03f72b")
    public List<java.lang.String> AllItems();

  }
  
  public static interface INumberedListFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NumberedListFunctionsImpl implements INumberedListFunctionsImpl {

    public static final INumberedListFunctionsImpl INSTANCE = new NumberedListFunctionsImpl();

    private NumberedListFunctionsImpl() {}

  }
  
  public static class NumberedListFunctions {

    private NumberedListFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2fcc117b-ed42-11ec-97a2-3feebb03f72b,MXP25gndn4Oj26ILCVd13vO+bZo=] */
