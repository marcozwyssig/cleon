package cleon.modelinglanguages.uml.metamodel.spec.structural.packages;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[730d9ba6-ca19-11f0-8ddf-17e5282749a1,imports]] */

/* End Protected Region   [[730d9ba6-ca19-11f0-8ddf-17e5282749a1,imports]] */

public class FunctionSpace_Packages {

  /* Begin Protected Region [[730d9ba6-ca19-11f0-8ddf-17e5282749a1]] */
  
  /* End Protected Region   [[730d9ba6-ca19-11f0-8ddf-17e5282749a1]] */


  public static interface INamedPackageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7adf8f8d-ca19-11f0-8ddf-17e5282749a1")
    public java.lang.String GetName();

  }
  
  public static interface INamedPackageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedPackageFunctionsImpl implements INamedPackageFunctionsImpl {

    public static final INamedPackageFunctionsImpl INSTANCE = new NamedPackageFunctionsImpl();

    private NamedPackageFunctionsImpl() {}

  }
  
  public static class NamedPackageFunctions {

    private NamedPackageFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,730d9ba6-ca19-11f0-8ddf-17e5282749a1,bF4ihcoFiLn9/V7v/T5VmvAaE1s=] */
