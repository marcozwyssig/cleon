package cleon.architecturemethods.arc42.metamodel.spec._13_product_view;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c7ff55e1-112f-11f0-a4f9-b5f995a9e0fe,imports]] */

/* End Protected Region   [[c7ff55e1-112f-11f0-a4f9-b5f995a9e0fe,imports]] */

public class FunctionSpace_Product_View {

  /* Begin Protected Region [[c7ff55e1-112f-11f0-a4f9-b5f995a9e0fe]] */
  
  /* End Protected Region   [[c7ff55e1-112f-11f0-a4f9-b5f995a9e0fe]] */


  public static interface IProductVariantFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cb8d85f7-112f-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String ProductName();

  }
  
  public static interface IProductVariantFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProductVariantFunctionsImpl implements IProductVariantFunctionsImpl {

    public static final IProductVariantFunctionsImpl INSTANCE = new ProductVariantFunctionsImpl();

    private ProductVariantFunctionsImpl() {}

  }
  
  public static class ProductVariantFunctions {

    private ProductVariantFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c7ff55e1-112f-11f0-a4f9-b5f995a9e0fe,/3jV6uLOtwLAGYt9lrKVoly9RCY=] */
