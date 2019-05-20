package cleon.modelinglanguages.network.spec.network;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2ef7e101-7aca-11e9-a70f-4dc03941a024,imports]] */

/* End Protected Region   [[2ef7e101-7aca-11e9-a70f-4dc03941a024,imports]] */

public class FunctionSpace_Network {

  /* Begin Protected Region [[2ef7e101-7aca-11e9-a70f-4dc03941a024]] */
  
  /* End Protected Region   [[2ef7e101-7aca-11e9-a70f-4dc03941a024]] */


  public static interface IAbstractNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("37ecf846-7aca-11e9-a70f-4dc03941a024")
    public List<cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkAware> GetParents();

    @IDynamicResourceExtension.MethodId("8c46e672-7aca-11e9-a70f-4dc03941a024")
    public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPRange GetIPRange();

  }
  
  public static interface IAbstractNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractNetworkFunctionsImpl implements IAbstractNetworkFunctionsImpl {

    public static final IAbstractNetworkFunctionsImpl INSTANCE = new AbstractNetworkFunctionsImpl();

    private AbstractNetworkFunctionsImpl() {}

  }
  
  public static class AbstractNetworkFunctions {

    private AbstractNetworkFunctions() {}

  }

  public static interface IAbstractPhysicalNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ba66d8e3-7acc-11e9-a70f-4dc03941a024")
    public List<cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkAware> GetParents();

  }
  
  public static interface IAbstractPhysicalNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractPhysicalNetworkFunctionsImpl implements IAbstractPhysicalNetworkFunctionsImpl {

    public static final IAbstractPhysicalNetworkFunctionsImpl INSTANCE = new AbstractPhysicalNetworkFunctionsImpl();

    private AbstractPhysicalNetworkFunctionsImpl() {}

  }
  
  public static class AbstractPhysicalNetworkFunctions {

    private AbstractPhysicalNetworkFunctions() {}

  }

  public static interface IAbstractNetworkAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fdfe289e-7acc-11e9-a70f-4dc03941a024")
    public List<cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkAware> GetParents();

  }
  
  public static interface IAbstractNetworkAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractNetworkAwareFunctionsImpl implements IAbstractNetworkAwareFunctionsImpl {

    public static final IAbstractNetworkAwareFunctionsImpl INSTANCE = new AbstractNetworkAwareFunctionsImpl();

    private AbstractNetworkAwareFunctionsImpl() {}

  }
  
  public static class AbstractNetworkAwareFunctions {

    private AbstractNetworkAwareFunctions() {}

  }

  public static interface IAbstractLogicalNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d5cce544-7acd-11e9-a70f-4dc03941a024")
    public List<cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkAware> GetParents();

  }
  
  public static interface IAbstractLogicalNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractLogicalNetworkFunctionsImpl implements IAbstractLogicalNetworkFunctionsImpl {

    public static final IAbstractLogicalNetworkFunctionsImpl INSTANCE = new AbstractLogicalNetworkFunctionsImpl();

    private AbstractLogicalNetworkFunctionsImpl() {}

  }
  
  public static class AbstractLogicalNetworkFunctions {

    private AbstractLogicalNetworkFunctions() {}

  }

  public static interface IAbstractNetworksFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f1e03dad-7acd-11e9-a70f-4dc03941a024")
    public List<cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkAware> GetParents();

  }
  
  public static interface IAbstractNetworksFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractNetworksFunctionsImpl implements IAbstractNetworksFunctionsImpl {

    public static final IAbstractNetworksFunctionsImpl INSTANCE = new AbstractNetworksFunctionsImpl();

    private AbstractNetworksFunctionsImpl() {}

  }
  
  public static class AbstractNetworksFunctions {

    private AbstractNetworksFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2ef7e101-7aca-11e9-a70f-4dc03941a024,9LKA06/2Gf5x7SHXu9kJTM3b/Sw=] */
