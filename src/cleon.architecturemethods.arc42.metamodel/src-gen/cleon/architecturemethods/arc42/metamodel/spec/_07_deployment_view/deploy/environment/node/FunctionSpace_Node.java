package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[41a52ff4-0b73-11e9-a136-69d076e48ed1,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.operatingsystem.javamodel.IGeneralPurposeOperatingSystem;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.operatingsystem.javamodel.IHypervisorSystemConfiguration;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.operatingsystem.javamodel.IOperatingSystemConfiguration;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.virtualization.javamodel.IVirtualMachineSystemConfiguration;

import java.util.stream.Collectors;
/* End Protected Region   [[41a52ff4-0b73-11e9-a136-69d076e48ed1,imports]] */

public class FunctionSpace_Node {

  /* Begin Protected Region [[41a52ff4-0b73-11e9-a136-69d076e48ed1]] */

  /* End Protected Region   [[41a52ff4-0b73-11e9-a136-69d076e48ed1]] */


  public static interface INodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9e96171b-6d92-11e9-b84d-d319514e887f")
    public List<ch.actifsource.core.javamodel.IDecorator> GetAllNestedBuildNodes();

    @IDynamicResourceExtension.MethodId("e5e91a24-0ab8-11e9-a8f9-abf1763bbc53")
    public List<ch.actifsource.core.javamodel.IResource> GetAllNestedNodes();

    @IDynamicResourceExtension.MethodId("73b6c2b1-b25a-11eb-84da-a358b37bb644")
    public List<ch.actifsource.core.javamodel.IDecorator> GetAllNestedServiceBuildNodes();

    @IDynamicResourceExtension.MethodId("29a7694e-1da4-11e9-b601-db75aa6f89a4")
    public List<ch.actifsource.core.javamodel.IResource> GetAllNestedSiteNodes();

    @IDynamicResourceExtension.MethodId("b5680fde-7f14-11e9-9a52-07d4b074defc")
    public List<ch.actifsource.core.javamodel.IResource> GetAllUsedSystemComponent();

    @IDynamicResourceExtension.MethodId("f7c1ba46-7f15-11e9-9a52-07d4b074defc")
    public List<ch.actifsource.core.javamodel.INamedResource> GetAllUsedSystemConfiguration();

    @IDynamicResourceExtension.MethodId("985b3d0d-c943-11eb-adc4-d18d1353eb6e")
    public ch.actifsource.core.javamodel.INamedResource GetEnvironment();

    @IDynamicResourceExtension.MethodId("bef20cb3-0e2a-11e9-8b4c-f9aec93d8b56")
    public ch.actifsource.core.javamodel.IResource GetLocationNode();

    @IDynamicResourceExtension.MethodId("0491d663-2abe-11e9-a3f8-336d9e792e17")
    public java.lang.String GetMaterialTypeName();

    @IDynamicResourceExtension.MethodId("b12ac911-cdc3-11eb-9255-4575b555e23e")
    public ch.actifsource.core.javamodel.IDecorator GetNestedBuildNode();

    @IDynamicResourceExtension.MethodId("c674c46c-cdc3-11eb-9255-4575b555e23e")
    public List<ch.actifsource.core.javamodel.IDecorator> GetNestedBuildNodes();

    @IDynamicResourceExtension.MethodId("8808b193-cdc3-11eb-9255-4575b555e23e")
    public ch.actifsource.core.javamodel.IResource GetNestedNode();

    @IDynamicResourceExtension.MethodId("ee45483f-001b-11f0-945c-87b19aec41f4")
    public List<ch.actifsource.core.javamodel.IResource> GetNestedNodes();

    @IDynamicResourceExtension.MethodId("926f258b-dfca-11ef-b0be-9b4cac321140")
    public ch.actifsource.core.javamodel.IDecorator GetParentBuildNode();

    @IDynamicResourceExtension.MethodId("c590e9e5-e4a5-11ef-a6bd-497168f25adc")
    public List<ch.actifsource.core.javamodel.IDecorator> GetParentBuildNodes();

    @IDynamicResourceExtension.MethodId("da40902b-02d3-11e9-9e58-33d596257b14")
    public ch.actifsource.core.javamodel.IResource GetParent();

    @IDynamicResourceExtension.MethodId("66093688-02d5-11e9-9e58-33d596257b14")
    public List<ch.actifsource.core.javamodel.IResource> GetParents();

    @IDynamicResourceExtension.MethodId("983747a2-0aa2-11e9-8a91-633e556ac68f")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("8dd02a63-02d5-11e9-9e58-33d596257b14")
    public ch.actifsource.core.javamodel.IResource GetSubnetNode();

    @IDynamicResourceExtension.MethodId("088bcb98-0b71-11e9-a136-69d076e48ed1")
    public java.lang.String GetTypeName();

    @IDynamicResourceExtension.MethodId("58f6e61c-2aba-11e9-a3f8-336d9e792e17")
    public java.lang.Boolean IsSupplied();

    @IDynamicResourceExtension.MethodId("d9a8e4f8-7ba7-11e9-94aa-f1ea7ea33f46")
    public ch.actifsource.core.javamodel.IDecorator NetworkNode();

    @IDynamicResourceExtension.MethodId("68da6b3e-87f3-11ec-894d-7968efa38b99")
    public List<ch.actifsource.core.javamodel.IDecorator> OnlyHyperVisorComponents();

    @IDynamicResourceExtension.MethodId("77892a21-8803-11ec-894d-7968efa38b99")
    public List<ch.actifsource.core.javamodel.IDecorator> OnlyOSComponents();

    @IDynamicResourceExtension.MethodId("15821b36-00a4-11f0-945c-87b19aec41f4")
    public List<ch.actifsource.core.javamodel.IDecorator> OnlyGeneralPurposeOSComponents();

    @IDynamicResourceExtension.MethodId("fadb5261-87f4-11ec-894d-7968efa38b99")
    public List<ch.actifsource.core.javamodel.IDecorator> OnlyVMComponents();

  }
  
  public static interface INodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("68da6b3e-87f3-11ec-894d-7968efa38b99")
    public List<ch.actifsource.core.javamodel.IDecorator> OnlyHyperVisorComponents(final List<ch.actifsource.core.javamodel.IResource> nodeList);

    @IDynamicResourceExtension.MethodId("77892a21-8803-11ec-894d-7968efa38b99")
    public List<ch.actifsource.core.javamodel.IDecorator> OnlyOSComponents(final List<ch.actifsource.core.javamodel.IResource> nodeList);

    @IDynamicResourceExtension.MethodId("15821b36-00a4-11f0-945c-87b19aec41f4")
    public List<ch.actifsource.core.javamodel.IDecorator> OnlyGeneralPurposeOSComponents(final List<ch.actifsource.core.javamodel.IResource> nodeList);

    @IDynamicResourceExtension.MethodId("fadb5261-87f4-11ec-894d-7968efa38b99")
    public List<ch.actifsource.core.javamodel.IDecorator> OnlyVMComponents(final List<ch.actifsource.core.javamodel.IResource> nodeList);

  }
  
  public static class NodeFunctionsImpl implements INodeFunctionsImpl {

    public static final INodeFunctionsImpl INSTANCE = new NodeFunctionsImpl();

    private NodeFunctionsImpl() {}

    @Override
    public List<ch.actifsource.core.javamodel.IDecorator> OnlyHyperVisorComponents(final List<ch.actifsource.core.javamodel.IResource> nodeList) {
      /* Begin Protected Region [[68da6b3e-87f3-11ec-894d-7968efa38b99]] */
      return nodeList.stream()
      		.filter(IBuildNode.class::isInstance )
      		.map(IBuildNode.class::cast)
      		.filter(build -> build.selectInstanceOf() instanceof IHypervisorSystemConfiguration)
      		.collect(Collectors.toList());
      /* End Protected Region   [[68da6b3e-87f3-11ec-894d-7968efa38b99]] */
    }

    @Override
    public List<ch.actifsource.core.javamodel.IDecorator> OnlyOSComponents(final List<ch.actifsource.core.javamodel.IResource> nodeList) {
      /* Begin Protected Region [[77892a21-8803-11ec-894d-7968efa38b99]] */
      return nodeList.stream()
      		.filter(IBuildNode.class::isInstance )
      		.map(IBuildNode.class::cast)
      		.filter(build -> build.selectInstanceOf() instanceof IOperatingSystemConfiguration)
      		.collect(Collectors.toList());
      /* End Protected Region   [[77892a21-8803-11ec-894d-7968efa38b99]] */
    }

    @Override
    public List<ch.actifsource.core.javamodel.IDecorator> OnlyGeneralPurposeOSComponents(final List<ch.actifsource.core.javamodel.IResource> nodeList) {
      /* Begin Protected Region [[15821b36-00a4-11f0-945c-87b19aec41f4]] */
        return nodeList.stream()
          		.filter(IBuildNode.class::isInstance )
          		.map(IBuildNode.class::cast)
          		.filter(build -> build.selectInstanceOf() instanceof IGeneralPurposeOperatingSystem)
          		.collect(Collectors.toList());
      /* End Protected Region   [[15821b36-00a4-11f0-945c-87b19aec41f4]] */
    }

    @Override
    public List<ch.actifsource.core.javamodel.IDecorator> OnlyVMComponents(final List<ch.actifsource.core.javamodel.IResource> nodeList) {
      /* Begin Protected Region [[fadb5261-87f4-11ec-894d-7968efa38b99]] */
      return nodeList.stream()
      		.filter(IBuildNode.class::isInstance )
      		.map(IBuildNode.class::cast)
      		.filter(build -> build.selectInstanceOf() instanceof IVirtualMachineSystemConfiguration)
      		.collect(Collectors.toList());
      /* End Protected Region   [[fadb5261-87f4-11ec-894d-7968efa38b99]] */
    }

  }
  
  public static class NodeFunctions {

    private NodeFunctions() {}

    public static List<ch.actifsource.core.javamodel.IDecorator> OnlyHyperVisorComponents(final List<ch.actifsource.core.javamodel.IResource> nodeList) {
      return DynamicResourceUtil.invoke(INodeFunctionsImpl.class, NodeFunctionsImpl.INSTANCE, nodeList).OnlyHyperVisorComponents(nodeList);
    }

    public static List<ch.actifsource.core.javamodel.IDecorator> OnlyOSComponents(final List<ch.actifsource.core.javamodel.IResource> nodeList) {
      return DynamicResourceUtil.invoke(INodeFunctionsImpl.class, NodeFunctionsImpl.INSTANCE, nodeList).OnlyOSComponents(nodeList);
    }

    public static List<ch.actifsource.core.javamodel.IDecorator> OnlyGeneralPurposeOSComponents(final List<ch.actifsource.core.javamodel.IResource> nodeList) {
      return DynamicResourceUtil.invoke(INodeFunctionsImpl.class, NodeFunctionsImpl.INSTANCE, nodeList).OnlyGeneralPurposeOSComponents(nodeList);
    }

    public static List<ch.actifsource.core.javamodel.IDecorator> OnlyVMComponents(final List<ch.actifsource.core.javamodel.IResource> nodeList) {
      return DynamicResourceUtil.invoke(INodeFunctionsImpl.class, NodeFunctionsImpl.INSTANCE, nodeList).OnlyVMComponents(nodeList);
    }

  }

  public static interface IServiceBuildNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0e3bf3d3-df12-11ef-b7b6-ed2cdfbf6428")
    public ch.actifsource.core.javamodel.IDecorator NetworkNode();

  }
  
  public static interface IServiceBuildNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceBuildNodeFunctionsImpl implements IServiceBuildNodeFunctionsImpl {

    public static final IServiceBuildNodeFunctionsImpl INSTANCE = new ServiceBuildNodeFunctionsImpl();

    private ServiceBuildNodeFunctionsImpl() {}

  }
  
  public static class ServiceBuildNodeFunctions {

    private ServiceBuildNodeFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,41a52ff4-0b73-11e9-a136-69d076e48ed1,SRsCCLAb7QntYj3avjiA06dBSpg=] */
