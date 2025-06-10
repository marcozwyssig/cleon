package cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2c5ea9ef-67cc-11e7-afcc-6df3a81a4d17,imports]] */

/* End Protected Region   [[2c5ea9ef-67cc-11e7-afcc-6df3a81a4d17,imports]] */

public class ProductFunctionSpace {

  /* Begin Protected Region [[2c5ea9ef-67cc-11e7-afcc-6df3a81a4d17]] */
  
  /* End Protected Region   [[2c5ea9ef-67cc-11e7-afcc-6df3a81a4d17]] */


  public static interface IBaseProductFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("35685a5f-67cc-11e7-afcc-6df3a81a4d17")
    public cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IProduct NotAllowedProduct();

  }
  
  public static interface IBaseProductFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BaseProductFunctionsImpl implements IBaseProductFunctionsImpl {

    public static final IBaseProductFunctionsImpl INSTANCE = new BaseProductFunctionsImpl();

    private BaseProductFunctionsImpl() {}

  }
  
  public static class BaseProductFunctions {

    private BaseProductFunctions() {}

  }

  public static interface IInfrastructureProductFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5d09d95a-778d-11e7-9604-cb27385e129c")
    public cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.javamodel.IOffering SelectOffering();

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

  public static interface IProductGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8720d825-778d-11e7-9604-cb27385e129c")
    public cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.javamodel.ICatalog SelectCatalog();

  }
  
  public static interface IProductGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProductGroupFunctionsImpl implements IProductGroupFunctionsImpl {

    public static final IProductGroupFunctionsImpl INSTANCE = new ProductGroupFunctionsImpl();

    private ProductGroupFunctionsImpl() {}

  }
  
  public static class ProductGroupFunctions {

    private ProductGroupFunctions() {}

  }

  public static interface ICatalogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a929001b-778d-11e7-9604-cb27385e129c")
    public cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.javamodel.IOffering SelectOffering();

  }
  
  public static interface ICatalogFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CatalogFunctionsImpl implements ICatalogFunctionsImpl {

    public static final ICatalogFunctionsImpl INSTANCE = new CatalogFunctionsImpl();

    private CatalogFunctionsImpl() {}

  }
  
  public static class CatalogFunctions {

    private CatalogFunctions() {}

  }

  public static interface IInfrastructureProductCatalogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ba2c2aad-778d-11e7-9604-cb27385e129c")
    public cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.javamodel.IOffering SelectOffering();

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

  public static interface IBaseProductCatalogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c4cea300-778d-11e7-9604-cb27385e129c")
    public cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.javamodel.IOffering SelectOffering();

  }
  
  public static interface IBaseProductCatalogFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BaseProductCatalogFunctionsImpl implements IBaseProductCatalogFunctionsImpl {

    public static final IBaseProductCatalogFunctionsImpl INSTANCE = new BaseProductCatalogFunctionsImpl();

    private BaseProductCatalogFunctionsImpl() {}

  }
  
  public static class BaseProductCatalogFunctions {

    private BaseProductCatalogFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2c5ea9ef-67cc-11e7-afcc-6df3a81a4d17,t2yGH+9btBCPEwMhL4b1bgy6x0U=] */
