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
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware SystemArc42Document();

    @IDynamicResourceExtension.MethodId("ff9ed8d0-e463-11ef-a6bd-497168f25adc")
    public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IManufactor Manufactor();

    @IDynamicResourceExtension.MethodId("29299c0d-e464-11ef-a6bd-497168f25adc")
    public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlockAware Product();

    @IDynamicResourceExtension.MethodId("3306a268-e464-11ef-a6bd-497168f25adc")
    public ch.actifsource.core.javamodel.INamedResource ProductVariant();

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
    public List<ch.actifsource.core.javamodel.IDecorator> AllInstances();

    @IDynamicResourceExtension.MethodId("0e1cc1cc-dfcd-11ef-b0be-9b4cac321140")
    public ch.actifsource.core.javamodel.INamedResource ProductVariant();

    @IDynamicResourceExtension.MethodId("dd11ddd8-dfcd-11ef-b0be-9b4cac321140")
    public List<ch.actifsource.core.javamodel.IDecorator> AllProductInstances();

  }
  
  public static interface IPerInstanceLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("dd11ddd8-dfcd-11ef-b0be-9b4cac321140")
    public List<ch.actifsource.core.javamodel.IDecorator> AllProductInstances(final cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAmountAware perInstanceLicense);

  }
  
  public static class PerInstanceLicenseFunctionsImpl implements IPerInstanceLicenseFunctionsImpl {

    public static final IPerInstanceLicenseFunctionsImpl INSTANCE = new PerInstanceLicenseFunctionsImpl();

    private PerInstanceLicenseFunctionsImpl() {}

    @Override
    public List<ch.actifsource.core.javamodel.IDecorator> AllProductInstances(final cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAmountAware perInstanceLicense) {
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

    public static List<ch.actifsource.core.javamodel.IDecorator> AllProductInstances(final cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAmountAware perInstanceLicense) {
      return DynamicResourceUtil.invoke(IPerInstanceLicenseFunctionsImpl.class, PerInstanceLicenseFunctionsImpl.INSTANCE, perInstanceLicense).AllProductInstances(perInstanceLicense);
    }

  }

  public static interface IBuildNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("385ec7fe-dfcd-11ef-b0be-9b4cac321140")
    public List<ch.actifsource.core.javamodel.IDecorator> OnlyProductVariant(final ch.actifsource.core.javamodel.INamedResource product_variant);

  }
  
  public static interface IBuildNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("385ec7fe-dfcd-11ef-b0be-9b4cac321140")
    public List<ch.actifsource.core.javamodel.IDecorator> OnlyProductVariant(final ch.actifsource.core.javamodel.INamedResource product_variant, final List<ch.actifsource.core.javamodel.IDecorator> buildNodeList);

  }
  
  public static class BuildNodeFunctionsImpl implements IBuildNodeFunctionsImpl {

    public static final IBuildNodeFunctionsImpl INSTANCE = new BuildNodeFunctionsImpl();

    private BuildNodeFunctionsImpl() {}

    @Override
    public List<ch.actifsource.core.javamodel.IDecorator> OnlyProductVariant(final ch.actifsource.core.javamodel.INamedResource product_variant, final List<ch.actifsource.core.javamodel.IDecorator> buildNodeList) {
      /* Begin Protected Region [[385ec7fe-dfcd-11ef-b0be-9b4cac321140]] */
    	return buildNodeList.stream().filter(x -> x.selectProductVariants().contains(product_variant)).toList();
      /* End Protected Region   [[385ec7fe-dfcd-11ef-b0be-9b4cac321140]] */
    }

  }
  
  public static class BuildNodeFunctions {

    private BuildNodeFunctions() {}

    public static List<ch.actifsource.core.javamodel.IDecorator> OnlyProductVariant(final ch.actifsource.core.javamodel.INamedResource product_variant, final List<ch.actifsource.core.javamodel.IDecorator> buildNodeList) {
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
    public List<ch.actifsource.core.javamodel.IDecorator> AllProductLicensing();

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

  public static interface IAbstractVirtualiuationServersLicenseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("03cbc874-e4a8-11ef-a6bd-497168f25adc")
    public java.lang.Integer TotalHosts();

  }
  
  public static interface IAbstractVirtualiuationServersLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractVirtualiuationServersLicenseFunctionsImpl implements IAbstractVirtualiuationServersLicenseFunctionsImpl {

    public static final IAbstractVirtualiuationServersLicenseFunctionsImpl INSTANCE = new AbstractVirtualiuationServersLicenseFunctionsImpl();

    private AbstractVirtualiuationServersLicenseFunctionsImpl() {}

  }
  
  public static class AbstractVirtualiuationServersLicenseFunctions {

    private AbstractVirtualiuationServersLicenseFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,279525f0-dfc2-11ef-b0be-9b4cac321140,/RZ0taXMtNrOzyRor7LlR3pe6/4=] */
