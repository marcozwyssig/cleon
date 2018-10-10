package cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[27696b33-67d3-11e7-afcc-6df3a81a4d17,imports]] */

/* End Protected Region   [[27696b33-67d3-11e7-afcc-6df3a81a4d17,imports]] */

public class ProductCatalogFunctionSpace {

  /* Begin Protected Region [[27696b33-67d3-11e7-afcc-6df3a81a4d17]] */
  
  /* End Protected Region   [[27696b33-67d3-11e7-afcc-6df3a81a4d17]] */


  public static interface IInfrastructureProductCatalogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2cf51903-67d3-11e7-afcc-6df3a81a4d17")
    public cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct AllInfrastructureProducts();

  }
  
  public static interface IInfrastructureProductCatalogFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InfrastructureProductCatalogFunctionsImpl implements IInfrastructureProductCatalogFunctionsImpl {

    public static final IInfrastructureProductCatalogFunctionsImpl INSTANCE = new InfrastructureProductCatalogFunctionsImpl();

    private InfrastructureProductCatalogFunctionsImpl() {}

  }
  
  public static class InfrastructureProductCatalogFunctions {

    private InfrastructureProductCatalogFunctions() {}

  }

  public static interface IInfrastructureProductFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3b33568e-67d3-11e7-afcc-6df3a81a4d17")
    public cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct AllInfrastructureProducts();

  }
  
  public static interface IInfrastructureProductFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InfrastructureProductFunctionsImpl implements IInfrastructureProductFunctionsImpl {

    public static final IInfrastructureProductFunctionsImpl INSTANCE = new InfrastructureProductFunctionsImpl();

    private InfrastructureProductFunctionsImpl() {}

  }
  
  public static class InfrastructureProductFunctions {

    private InfrastructureProductFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,27696b33-67d3-11e7-afcc-6df3a81a4d17,yV0ufCJW+a9r3iNDA0Ux3RCLplA=] */
