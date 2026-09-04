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


  public static interface INamedComponentWithPackageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("39d8dd96-52c3-11f1-b29c-1766e5efe1b4")
    public java.lang.String GetName();

  }
  
  public static interface INamedComponentWithPackageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedComponentWithPackageFunctionsImpl implements INamedComponentWithPackageFunctionsImpl {

    public static final INamedComponentWithPackageFunctionsImpl INSTANCE = new NamedComponentWithPackageFunctionsImpl();

    private NamedComponentWithPackageFunctionsImpl() {}

  }
  
  public static class NamedComponentWithPackageFunctions {

    private NamedComponentWithPackageFunctions() {}

  }

  public static interface INamedComponentCompositionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("efaea1fb-4bd5-11ed-bcee-57344264bda3")
    public java.lang.String GetName();

  }
  
  public static interface INamedComponentCompositionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedComponentCompositionFunctionsImpl implements INamedComponentCompositionFunctionsImpl {

    public static final INamedComponentCompositionFunctionsImpl INSTANCE = new NamedComponentCompositionFunctionsImpl();

    private NamedComponentCompositionFunctionsImpl() {}

  }
  
  public static class NamedComponentCompositionFunctions {

    private NamedComponentCompositionFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,86e653d3-ca19-11f0-8ddf-17e5282749a1,NFvtxnmufgzgtsOKT+F2P4B5DJA=] */
