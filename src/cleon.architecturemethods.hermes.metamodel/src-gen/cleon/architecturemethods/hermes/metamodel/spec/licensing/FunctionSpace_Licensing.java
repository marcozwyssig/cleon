package cleon.architecturemethods.hermes.metamodel.spec.licensing;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[279525f0-dfc2-11ef-b0be-9b4cac321140,imports]] */

/* End Protected Region   [[279525f0-dfc2-11ef-b0be-9b4cac321140,imports]] */

public class FunctionSpace_Licensing {

  /* Begin Protected Region [[279525f0-dfc2-11ef-b0be-9b4cac321140]] */
  
  /* End Protected Region   [[279525f0-dfc2-11ef-b0be-9b4cac321140]] */


  public static interface IAbstractProductLicensingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2d0ad9e8-dfc2-11ef-b0be-9b4cac321140")
    public cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document SystemArc42Document();

    @IDynamicResourceExtension.MethodId("ff9ed8d0-e463-11ef-a6bd-497168f25adc")
    public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IManufactor Manufactor();

    @IDynamicResourceExtension.MethodId("29299c0d-e464-11ef-a6bd-497168f25adc")
    public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct Product();

    @IDynamicResourceExtension.MethodId("3306a268-e464-11ef-a6bd-497168f25adc")
    public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant ProductVariant();

  }
  
  public static interface IAbstractProductLicensingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractProductLicensingFunctionsImpl implements IAbstractProductLicensingFunctionsImpl {

    public static final IAbstractProductLicensingFunctionsImpl INSTANCE = new AbstractProductLicensingFunctionsImpl();

    private AbstractProductLicensingFunctionsImpl() {}

  }
  
  public static class AbstractProductLicensingFunctions {

    private AbstractProductLicensingFunctions() {}

  }

  public static interface IPerInstanceLicenseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b6ea85dd-dfcc-11ef-b0be-9b4cac321140")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> AllInstances();

    @IDynamicResourceExtension.MethodId("0e1cc1cc-dfcd-11ef-b0be-9b4cac321140")
    public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant ProductVariant();

    @IDynamicResourceExtension.MethodId("dd11ddd8-dfcd-11ef-b0be-9b4cac321140")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> AllProductInstances();

  }
  
  public static interface IPerInstanceLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("dd11ddd8-dfcd-11ef-b0be-9b4cac321140")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> AllProductInstances(final cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IPerInstanceLicense perInstanceLicense);

  }
  
  public static class PerInstanceLicenseFunctionsImpl implements IPerInstanceLicenseFunctionsImpl {

    public static final IPerInstanceLicenseFunctionsImpl INSTANCE = new PerInstanceLicenseFunctionsImpl();

    private PerInstanceLicenseFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> AllProductInstances(final cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IPerInstanceLicense perInstanceLicense) {
      /* Begin Protected Region [[dd11ddd8-dfcd-11ef-b0be-9b4cac321140]] */
    	final var functions = perInstanceLicense.extension(IPerInstanceLicenseFunctions.class);
    	var productVariant = perInstanceLicense.selectUseProductVariantForCalc();
    	if( productVariant == null) {
    		productVariant = functions.ProductVariant();
    	}
    	return BuildNodeFunctionsImpl.INSTANCE.OnlyProductVariant(productVariant, functions.AllInstances());
      /* End Protected Region   [[dd11ddd8-dfcd-11ef-b0be-9b4cac321140]] */
    }

  }
  
  public static class PerInstanceLicenseFunctions {

    private PerInstanceLicenseFunctions() {}

    public static List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> AllProductInstances(final cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IPerInstanceLicense perInstanceLicense) {
      return DynamicResourceUtil.invoke(IPerInstanceLicenseFunctionsImpl.class, PerInstanceLicenseFunctionsImpl.INSTANCE, perInstanceLicense).AllProductInstances(perInstanceLicense);
    }

  }

  public static interface IBuildNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("385ec7fe-dfcd-11ef-b0be-9b4cac321140")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> OnlyProductVariant(final cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant product_variant);

  }
  
  public static interface IBuildNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("385ec7fe-dfcd-11ef-b0be-9b4cac321140")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> OnlyProductVariant(final cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant product_variant, final List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> buildNodeList);

  }
  
  public static class BuildNodeFunctionsImpl implements IBuildNodeFunctionsImpl {

    public static final IBuildNodeFunctionsImpl INSTANCE = new BuildNodeFunctionsImpl();

    private BuildNodeFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> OnlyProductVariant(final cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant product_variant, final List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      /* Begin Protected Region [[385ec7fe-dfcd-11ef-b0be-9b4cac321140]] */
    	return buildNodeList.stream().filter(x -> x.selectProductVariants().contains(product_variant)).toList();
      /* End Protected Region   [[385ec7fe-dfcd-11ef-b0be-9b4cac321140]] */
    }

  }
  
  public static class BuildNodeFunctions {

    private BuildNodeFunctions() {}

    public static List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> OnlyProductVariant(final cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant product_variant, final List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNodeList).OnlyProductVariant(product_variant, buildNodeList);
    }

  }

  public static interface IAbstractServerHostLicensingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6c70f351-dfde-11ef-8b41-bffcdee4ee9e")
    public java.lang.Integer GetVMCount();

  }
  
  public static interface IAbstractServerHostLicensingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractServerHostLicensingFunctionsImpl implements IAbstractServerHostLicensingFunctionsImpl {

    public static final IAbstractServerHostLicensingFunctionsImpl INSTANCE = new AbstractServerHostLicensingFunctionsImpl();

    private AbstractServerHostLicensingFunctionsImpl() {}

  }
  
  public static class AbstractServerHostLicensingFunctions {

    private AbstractServerHostLicensingFunctions() {}

  }

  public static interface ILicensingDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6fe68173-e462-11ef-a6bd-497168f25adc")
    public List<cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractProductLicensing> AllProductLicensing();

  }
  
  public static interface ILicensingDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LicensingDocumentFunctionsImpl implements ILicensingDocumentFunctionsImpl {

    public static final ILicensingDocumentFunctionsImpl INSTANCE = new LicensingDocumentFunctionsImpl();

    private LicensingDocumentFunctionsImpl() {}

  }
  
  public static class LicensingDocumentFunctions {

    private LicensingDocumentFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,279525f0-dfc2-11ef-b0be-9b4cac321140,kk8o16k0tRwYQhgbudMjLqUzf0s=] */
