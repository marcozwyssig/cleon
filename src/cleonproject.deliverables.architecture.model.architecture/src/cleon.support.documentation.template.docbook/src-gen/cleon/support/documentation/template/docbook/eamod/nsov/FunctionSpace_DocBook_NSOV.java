package cleon.support.documentation.template.docbook.eamod.nsov;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5dc2ae63-c1e5-11e6-84f4-db6ef89bc9ce,imports]] */

/* End Protected Region   [[5dc2ae63-c1e5-11e6-84f4-db6ef89bc9ce,imports]] */

public class FunctionSpace_DocBook_NSOV {

  /* Begin Protected Region [[5dc2ae63-c1e5-11e6-84f4-db6ef89bc9ce]] */
  
  /* End Protected Region   [[5dc2ae63-c1e5-11e6-84f4-db6ef89bc9ce]] */


  public static interface IServiceUsageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b3d54a2c-c1e5-11e6-84f4-db6ef89bc9ce")
    public java.lang.String RenderDeliverableContent();

  }
  
  public static interface IServiceUsageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceUsageFunctionsImpl implements IServiceUsageFunctionsImpl {

    public static final IServiceUsageFunctionsImpl INSTANCE = new ServiceUsageFunctionsImpl();

    private ServiceUsageFunctionsImpl() {}

  }
  
  public static class ServiceUsageFunctions {

    private ServiceUsageFunctions() {}

  }

  public static interface IAbstractGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("78240a51-c1e8-11e6-84f4-db6ef89bc9ce")
    public java.lang.String RenderCapabilities();

  }
  
  public static interface IAbstractGoalsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractGoalsFunctionsImpl implements IAbstractGoalsFunctionsImpl {

    public static final IAbstractGoalsFunctionsImpl INSTANCE = new AbstractGoalsFunctionsImpl();

    private AbstractGoalsFunctionsImpl() {}

  }
  
  public static class AbstractGoalsFunctions {

    private AbstractGoalsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5dc2ae63-c1e5-11e6-84f4-db6ef89bc9ce,CxnIDrsRf9xUMWsqcnwlQ1hUXG0=] */
