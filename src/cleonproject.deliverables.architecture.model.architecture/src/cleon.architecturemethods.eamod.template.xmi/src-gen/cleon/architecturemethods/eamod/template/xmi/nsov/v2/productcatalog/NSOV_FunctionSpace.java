package cleon.architecturemethods.eamod.template.xmi.nsov.v2.productcatalog;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[6597f854-67d6-11e7-afcc-6df3a81a4d17,imports]] */

/* End Protected Region   [[6597f854-67d6-11e7-afcc-6df3a81a4d17,imports]] */

public class NSOV_FunctionSpace {

  /* Begin Protected Region [[6597f854-67d6-11e7-afcc-6df3a81a4d17]] */
  
  /* End Protected Region   [[6597f854-67d6-11e7-afcc-6df3a81a4d17]] */


  public static interface IOfferingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1d017a68-6b6e-11e7-a77c-e16d0c706067")
    public java.lang.String RenderXmi();

    @IDynamicResourceExtension.MethodId("1d017a85-6b6e-11e7-a77c-e16d0c706067")
    public java.lang.String RenderMetadata();

  }
  
  public static interface IOfferingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OfferingFunctionsImpl implements IOfferingFunctionsImpl {

    public static final IOfferingFunctionsImpl INSTANCE = new OfferingFunctionsImpl();

    private OfferingFunctionsImpl() {}

  }
  
  public static class OfferingFunctions {

    private OfferingFunctions() {}

  }

  public static interface ICatalogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bae1bd03-6b6e-11e7-a77c-e16d0c706067")
    public java.lang.String RenderXmi();

    @IDynamicResourceExtension.MethodId("859031c1-6b73-11e7-a77c-e16d0c706067")
    public java.lang.String RenderMetadata();

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

  public static interface IProductGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("065b2d5f-6b6f-11e7-a77c-e16d0c706067")
    public java.lang.String RenderXmi();

    @IDynamicResourceExtension.MethodId("8740044d-6b73-11e7-a77c-e16d0c706067")
    public java.lang.String RenderMetadata();

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

  public static interface IProductFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2f5af010-6b6f-11e7-a77c-e16d0c706067")
    public java.lang.String RenderXmi();

    @IDynamicResourceExtension.MethodId("890ef79a-6b73-11e7-a77c-e16d0c706067")
    public java.lang.String RenderMetadata();

    @IDynamicResourceExtension.MethodId("3c7ec9f5-6b74-11e7-a77c-e16d0c706067")
    public java.lang.Void RenderXmiVariety();

  }
  
  public static interface IProductFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProductFunctionsImpl implements IProductFunctionsImpl {

    public static final IProductFunctionsImpl INSTANCE = new ProductFunctionsImpl();

    private ProductFunctionsImpl() {}

  }
  
  public static class ProductFunctions {

    private ProductFunctions() {}

  }

  public static interface IVarietyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fdb39dd1-6b72-11e7-a77c-e16d0c706067")
    public java.lang.String RenderXmi();

    @IDynamicResourceExtension.MethodId("8ae31c10-6b73-11e7-a77c-e16d0c706067")
    public java.lang.String RenderMetadata();

  }
  
  public static interface IVarietyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VarietyFunctionsImpl implements IVarietyFunctionsImpl {

    public static final IVarietyFunctionsImpl INSTANCE = new VarietyFunctionsImpl();

    private VarietyFunctionsImpl() {}

  }
  
  public static class VarietyFunctions {

    private VarietyFunctions() {}

  }

  public static interface IBaseProductFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("59b9b3ca-6b74-11e7-a77c-e16d0c706067")
    public java.lang.String RenderXmiVariety();

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

    @IDynamicResourceExtension.MethodId("618ae398-6b74-11e7-a77c-e16d0c706067")
    public java.lang.String RenderXmiVariety();

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

  public static interface IXmiAggregationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2b0b5490-6bcd-11e7-a77c-e16d0c706067")
    public java.lang.String RenderOwnedAttribute();

    @IDynamicResourceExtension.MethodId("de54ae8f-6c7e-11e7-acfe-cd993eb63ee2")
    public java.lang.String RenderAggregation();

  }
  
  public static interface IXmiAggregationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class XmiAggregationFunctionsImpl implements IXmiAggregationFunctionsImpl {

    public static final IXmiAggregationFunctionsImpl INSTANCE = new XmiAggregationFunctionsImpl();

    private XmiAggregationFunctionsImpl() {}

  }
  
  public static class XmiAggregationFunctions {

    private XmiAggregationFunctions() {}

  }

  public static interface IXmiClassFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cc7e43a0-6c80-11e7-acfe-cd993eb63ee2")
    public java.lang.String GetRelationId(final cleon.common.xml.spec.xmi.javamodel.IXmiClass dst);

  }
  
  public static interface IXmiClassFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class XmiClassFunctionsImpl implements IXmiClassFunctionsImpl {

    public static final IXmiClassFunctionsImpl INSTANCE = new XmiClassFunctionsImpl();

    private XmiClassFunctionsImpl() {}

  }
  
  public static class XmiClassFunctions {

    private XmiClassFunctions() {}

  }

  public static interface IXmiCompositeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3544a955-6c8d-11e7-8bc1-2fb13127901b")
    public java.lang.String RenderOwnedAttribute();

    @IDynamicResourceExtension.MethodId("3544cfa7-6c8d-11e7-8bc1-2fb13127901b")
    public java.lang.String RenderComposites();

  }
  
  public static interface IXmiCompositeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class XmiCompositeFunctionsImpl implements IXmiCompositeFunctionsImpl {

    public static final IXmiCompositeFunctionsImpl INSTANCE = new XmiCompositeFunctionsImpl();

    private XmiCompositeFunctionsImpl() {}

  }
  
  public static class XmiCompositeFunctions {

    private XmiCompositeFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,6597f854-67d6-11e7-afcc-6df3a81a4d17,x/sMAU/8RzTZUOurV/KFXB75MlI=] */
