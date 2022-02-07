package cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[41a52ff4-0b73-11e9-a136-69d076e48ed1,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.operatingsystem.javamodel.IHypervisorSystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.operatingsystem.javamodel.IOperatingSystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.virtualization.javamodel.IVirtualMachineSystemConfiguration;

import java.util.stream.Collectors;
/* End Protected Region   [[41a52ff4-0b73-11e9-a136-69d076e48ed1,imports]] */

public class FunctionSpace_Node {

  /* Begin Protected Region [[41a52ff4-0b73-11e9-a136-69d076e48ed1]] */
  
  /* End Protected Region   [[41a52ff4-0b73-11e9-a136-69d076e48ed1]] */


  public static interface INodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("da40902b-02d3-11e9-9e58-33d596257b14")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode GetParent();

    @IDynamicResourceExtension.MethodId("66093688-02d5-11e9-9e58-33d596257b14")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.ISupplyAndBuildNodeDecomposite> GetParents();

    @IDynamicResourceExtension.MethodId("8dd02a63-02d5-11e9-9e58-33d596257b14")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplySiteNode GetSubnetNode();

    @IDynamicResourceExtension.MethodId("bef20cb3-0e2a-11e9-8b4c-f9aec93d8b56")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyDataCenter GetLocationNode();

    @IDynamicResourceExtension.MethodId("985b3d0d-c943-11eb-adc4-d18d1353eb6e")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode GetEnvironment();

    @IDynamicResourceExtension.MethodId("983747a2-0aa2-11e9-8a91-633e556ac68f")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("e5e91a24-0ab8-11e9-a8f9-abf1763bbc53")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> GetAllNestedNodes();

    @IDynamicResourceExtension.MethodId("088bcb98-0b71-11e9-a136-69d076e48ed1")
    public java.lang.String GetTypeName();

    @IDynamicResourceExtension.MethodId("29a7694e-1da4-11e9-b601-db75aa6f89a4")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplySiteNode> GetAllNestedSiteNodes();

    @IDynamicResourceExtension.MethodId("58f6e61c-2aba-11e9-a3f8-336d9e792e17")
    public java.lang.Boolean IsSupplied();

    @IDynamicResourceExtension.MethodId("0491d663-2abe-11e9-a3f8-336d9e792e17")
    public java.lang.String GetMaterialTypeName();

    @IDynamicResourceExtension.MethodId("9e96171b-6d92-11e9-b84d-d319514e887f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> GetAllNestedBuildNodes();

    @IDynamicResourceExtension.MethodId("73b6c2b1-b25a-11eb-84da-a358b37bb644")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode> GetAllNestedServiceBuildNodes();

    @IDynamicResourceExtension.MethodId("d9a8e4f8-7ba7-11e9-94aa-f1ea7ea33f46")
    public cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode NetworkNode();

    @IDynamicResourceExtension.MethodId("b5680fde-7f14-11e9-9a52-07d4b074defc")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemComponent> GetAllUsedSystemComponent();

    @IDynamicResourceExtension.MethodId("f7c1ba46-7f15-11e9-9a52-07d4b074defc")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> GetAllUsedSystemConfiguration();

    @IDynamicResourceExtension.MethodId("8808b193-cdc3-11eb-9255-4575b555e23e")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode GetNestedNode();

    @IDynamicResourceExtension.MethodId("b12ac911-cdc3-11eb-9255-4575b555e23e")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode GetNestedBuildNode();

    @IDynamicResourceExtension.MethodId("c674c46c-cdc3-11eb-9255-4575b555e23e")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> GetNestedBuildNodes();

    @IDynamicResourceExtension.MethodId("68da6b3e-87f3-11ec-894d-7968efa38b99")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyHyperVisorComponents();

    @IDynamicResourceExtension.MethodId("fadb5261-87f4-11ec-894d-7968efa38b99")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMComponents();

    @IDynamicResourceExtension.MethodId("77892a21-8803-11ec-894d-7968efa38b99")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyOSComponents();

  }
  
  public static interface INodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("68da6b3e-87f3-11ec-894d-7968efa38b99")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyHyperVisorComponents(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodeList);

    @IDynamicResourceExtension.MethodId("fadb5261-87f4-11ec-894d-7968efa38b99")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMComponents(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodeList);

    @IDynamicResourceExtension.MethodId("77892a21-8803-11ec-894d-7968efa38b99")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyOSComponents(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodeList);

  }
  
  public static class NodeFunctionsImpl implements INodeFunctionsImpl {

    public static final INodeFunctionsImpl INSTANCE = new NodeFunctionsImpl();

    private NodeFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyHyperVisorComponents(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodeList) {
      /* Begin Protected Region [[68da6b3e-87f3-11ec-894d-7968efa38b99]] */
        return nodeList.stream()
          		.filter(s -> s instanceof IBuildNode )
          		.map(IBuildNode.class::cast)
          		.filter(build -> build.selectInstanceOf() instanceof IHypervisorSystemConfiguration)
          		.collect(Collectors.toList());   
      /* End Protected Region   [[68da6b3e-87f3-11ec-894d-7968efa38b99]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMComponents(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodeList) {
      /* Begin Protected Region [[fadb5261-87f4-11ec-894d-7968efa38b99]] */
        return nodeList.stream()
          		.filter(s -> s instanceof IBuildNode )
          		.map(IBuildNode.class::cast)
          		.filter(build -> build.selectInstanceOf() instanceof IVirtualMachineSystemConfiguration)
          		.collect(Collectors.toList());      
      /* End Protected Region   [[fadb5261-87f4-11ec-894d-7968efa38b99]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyOSComponents(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodeList) {
      /* Begin Protected Region [[77892a21-8803-11ec-894d-7968efa38b99]] */
        return nodeList.stream()
          		.filter(s -> s instanceof IBuildNode )
          		.map(IBuildNode.class::cast)
          		.filter(build -> build.selectInstanceOf() instanceof IOperatingSystemConfiguration)
          		.collect(Collectors.toList());      
      /* End Protected Region   [[77892a21-8803-11ec-894d-7968efa38b99]] */
    }

  }
  
  public static class NodeFunctions {

    private NodeFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyHyperVisorComponents(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodeList) {
      return DynamicResourceUtil.invoke(INodeFunctionsImpl.class, NodeFunctionsImpl.INSTANCE, nodeList).OnlyHyperVisorComponents(nodeList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMComponents(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodeList) {
      return DynamicResourceUtil.invoke(INodeFunctionsImpl.class, NodeFunctionsImpl.INSTANCE, nodeList).OnlyVMComponents(nodeList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyOSComponents(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodeList) {
      return DynamicResourceUtil.invoke(INodeFunctionsImpl.class, NodeFunctionsImpl.INSTANCE, nodeList).OnlyOSComponents(nodeList);
    }

  }

  public static interface ISystemEnvironmentNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d8ba71df-7ddb-11ec-be69-ab0911f63a77")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode GetEnvironment();

  }
  
  public static interface ISystemEnvironmentNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemEnvironmentNodeFunctionsImpl implements ISystemEnvironmentNodeFunctionsImpl {

    public static final ISystemEnvironmentNodeFunctionsImpl INSTANCE = new SystemEnvironmentNodeFunctionsImpl();

    private SystemEnvironmentNodeFunctionsImpl() {}

  }
  
  public static class SystemEnvironmentNodeFunctions {

    private SystemEnvironmentNodeFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,41a52ff4-0b73-11e9-a136-69d076e48ed1,h1IjCTV4ISNlkuRkqkNzUyREfKY=] */
