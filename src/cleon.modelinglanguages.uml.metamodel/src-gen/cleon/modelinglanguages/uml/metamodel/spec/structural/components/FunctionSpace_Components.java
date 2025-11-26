package cleon.modelinglanguages.uml.metamodel.spec.structural.components;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[86e653d3-ca19-11f0-8ddf-17e5282749a1,imports]] */

/* End Protected Region   [[86e653d3-ca19-11f0-8ddf-17e5282749a1,imports]] */

public class FunctionSpace_Components {

  /* Begin Protected Region [[86e653d3-ca19-11f0-8ddf-17e5282749a1]] */
  
  /* End Protected Region   [[86e653d3-ca19-11f0-8ddf-17e5282749a1]] */


  public static interface INamedComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("86e653db-ca19-11f0-8ddf-17e5282749a1")
    public java.lang.String GetName();

  }
  
  public static interface INamedComponentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedComponentFunctionsImpl implements INamedComponentFunctionsImpl {

    public static final INamedComponentFunctionsImpl INSTANCE = new NamedComponentFunctionsImpl();

    private NamedComponentFunctionsImpl() {}

  }
  
  public static class NamedComponentFunctions {

    private NamedComponentFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,86e653d3-ca19-11f0-8ddf-17e5282749a1,tizsJsITmX4/BLjY38hkQnvsmrc=] */
