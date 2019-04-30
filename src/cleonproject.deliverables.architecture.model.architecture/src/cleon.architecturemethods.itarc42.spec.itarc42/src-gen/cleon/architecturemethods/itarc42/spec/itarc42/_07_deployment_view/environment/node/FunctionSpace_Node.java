package cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[41a52ff4-0b73-11e9-a136-69d076e48ed1,imports]] */

/* End Protected Region   [[41a52ff4-0b73-11e9-a136-69d076e48ed1,imports]] */

public class FunctionSpace_Node {

  /* Begin Protected Region [[41a52ff4-0b73-11e9-a136-69d076e48ed1]] */
  
  /* End Protected Region   [[41a52ff4-0b73-11e9-a136-69d076e48ed1]] */


  public static interface INodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("da40902b-02d3-11e9-9e58-33d596257b14")
    public cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode GetParent();

    @IDynamicResourceExtension.MethodId("66093688-02d5-11e9-9e58-33d596257b14")
    public List<cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.ISupplyAndBuildNodeDecomposite> GetParents();

    @IDynamicResourceExtension.MethodId("8dd02a63-02d5-11e9-9e58-33d596257b14")
    public cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode GetSubnetNode();

    @IDynamicResourceExtension.MethodId("bef20cb3-0e2a-11e9-8b4c-f9aec93d8b56")
    public cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.javamodel.ISupplyLocationNode GetLocationNode();

    @IDynamicResourceExtension.MethodId("983747a2-0aa2-11e9-8a91-633e556ac68f")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("e5e91a24-0ab8-11e9-a8f9-abf1763bbc53")
    public List<cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode> GetAllNestedNodes();

    @IDynamicResourceExtension.MethodId("088bcb98-0b71-11e9-a136-69d076e48ed1")
    public java.lang.String GetTypeName();

    @IDynamicResourceExtension.MethodId("29a7694e-1da4-11e9-b601-db75aa6f89a4")
    public List<cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode> GetAllNestedSubnetNodes();

    @IDynamicResourceExtension.MethodId("58f6e61c-2aba-11e9-a3f8-336d9e792e17")
    public java.lang.Boolean IsSupplied();

    @IDynamicResourceExtension.MethodId("0491d663-2abe-11e9-a3f8-336d9e792e17")
    public java.lang.String GetMaterialTypeName();

    @IDynamicResourceExtension.MethodId("5f385eb7-2ace-11e9-a3f8-336d9e792e17")
    public cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.naming.javamodel.IDisplayNameStrategy GetDisplayNameStrategy();

    @IDynamicResourceExtension.MethodId("563016fc-2ed3-11e9-9ca2-d7354798e154")
    public java.lang.String OnlyName();

    @IDynamicResourceExtension.MethodId("a0a503db-6b52-11e9-bd30-87fcf852dea7")
    public cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.javamodel.ICustomer GetCustomer();

  }
  
  public static interface INodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NodeFunctionsImpl implements INodeFunctionsImpl {

    public static final INodeFunctionsImpl INSTANCE = new NodeFunctionsImpl();

    private NodeFunctionsImpl() {}

  }
  
  public static class NodeFunctions {

    private NodeFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,41a52ff4-0b73-11e9-a136-69d076e48ed1,ckevGyhcqx1naoMIH+Urr0SiAIA=] */
