package cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7d0236d1-0b7f-11e9-a136-69d076e48ed1,imports]] */

/* End Protected Region   [[7d0236d1-0b7f-11e9-a136-69d076e48ed1,imports]] */

public class FunctionSpace_SupplyNode {

  /* Begin Protected Region [[7d0236d1-0b7f-11e9-a136-69d076e48ed1]] */
  
  /* End Protected Region   [[7d0236d1-0b7f-11e9-a136-69d076e48ed1]] */


  public static interface ISupplyDataCenterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("34593e54-0aab-11e9-8a91-633e556ac68f")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("1f972920-2ab8-11e9-a3f8-336d9e792e17")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyDataCenter GetLocationNode();

  }
  
  public static interface ISupplyDataCenterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SupplyDataCenterFunctionsImpl implements ISupplyDataCenterFunctionsImpl {

    public static final ISupplyDataCenterFunctionsImpl INSTANCE = new SupplyDataCenterFunctionsImpl();

    private SupplyDataCenterFunctionsImpl() {}

  }
  
  public static class SupplyDataCenterFunctions {

    private SupplyDataCenterFunctions() {}

  }

  public static interface ISupplySiteNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0fbb539b-0aaf-11e9-a8f9-abf1763bbc53")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("56fd4b1c-2ab8-11e9-a3f8-336d9e792e17")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplySiteNode GetSubnetNode();

  }
  
  public static interface ISupplySiteNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SupplySiteNodeFunctionsImpl implements ISupplySiteNodeFunctionsImpl {

    public static final ISupplySiteNodeFunctionsImpl INSTANCE = new SupplySiteNodeFunctionsImpl();

    private SupplySiteNodeFunctionsImpl() {}

  }
  
  public static class SupplySiteNodeFunctions {

    private SupplySiteNodeFunctions() {}

  }

  public static interface ISupplyNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("74e81056-2aba-11e9-a3f8-336d9e792e17")
    public java.lang.Boolean IsSupplied();

    @IDynamicResourceExtension.MethodId("2bd7b413-2abe-11e9-a3f8-336d9e792e17")
    public java.lang.String GetMaterialTypeName();

    @IDynamicResourceExtension.MethodId("82c47128-2ed3-11e9-9ca2-d7354798e154")
    public java.lang.String OnlyName();

  }
  
  public static interface ISupplyNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("74e81056-2aba-11e9-a3f8-336d9e792e17")
    public java.lang.Boolean IsSupplied(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode supplyNode);

  }
  
  public static class SupplyNodeFunctionsImpl implements ISupplyNodeFunctionsImpl {

    public static final ISupplyNodeFunctionsImpl INSTANCE = new SupplyNodeFunctionsImpl();

    private SupplyNodeFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsSupplied(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode supplyNode) {
      return true;
    }

  }
  
  public static class SupplyNodeFunctions {

    private SupplyNodeFunctions() {}

    public static java.lang.Boolean IsSupplied(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode supplyNode) {
      return DynamicResourceUtil.invoke(ISupplyNodeFunctionsImpl.class, SupplyNodeFunctionsImpl.INSTANCE, supplyNode).IsSupplied(supplyNode);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7d0236d1-0b7f-11e9-a136-69d076e48ed1,B+bJw+dhObwe/uQS5tVbpBOzVdY=] */
