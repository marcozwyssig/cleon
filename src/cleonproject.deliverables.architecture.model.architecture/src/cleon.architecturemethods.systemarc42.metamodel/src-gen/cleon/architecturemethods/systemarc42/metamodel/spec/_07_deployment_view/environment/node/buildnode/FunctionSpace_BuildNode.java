package cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[48dec04d-02d8-11e9-9e58-33d596257b14,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopologyEnvironment;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.FunctionSpace_Node.INodeFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.FunctionSpace_BuildingBlock.ICoreFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.FunctionSpace_BuildingBlock.IDiskFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.FunctionSpace_BuildingBlock.IMemoryFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.javamodel.CPU;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.javamodel.ICore;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.javamodel.IDisk;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.javamodel.IMemory;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.ITopologyEnvironmentFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithHosts;
import ch.actifsource.util.collection.IList;
import ch.actifsource.util.log.Logger;
import ch.actifsource.core.job.Select;
import java.util.Iterator;
/* End Protected Region   [[48dec04d-02d8-11e9-9e58-33d596257b14,imports]] */

public class FunctionSpace_BuildNode {

  /* Begin Protected Region [[48dec04d-02d8-11e9-9e58-33d596257b14]] */
public static class HelperFunctionClass {
	public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost GetHost(
			final String site, final IAbstractSiteWithHosts siteObject, final ISystemConfiguration cmp, final String owner, final String id) {
		Logger.instance().logInfo("Found site for " + site);
		final IAbstractSiteWithHosts siteComposition = siteObject;
		final IList<? extends IAbstractHost> abstractHosts = siteComposition.selectHosts().get(cmp.getResource());
		final Iterator<? extends IAbstractHost> iterator = abstractHosts.iterator();
		while (iterator.hasNext()) {
			final IAbstractHost abstractHost = iterator.next();
			final String simpleName = Select.simpleName(abstractHost.getReadJobExecutor(), abstractHost.getResource());
			final String[] strings = simpleName.split("-");
			Logger.instance().logInfo("Check owner " + owner + " / " + strings[2]);
			if (owner.equals(strings[2])) {
				Logger.instance().logInfo("Check id " + id + " / " + strings[3]);
				if (id.startsWith(strings[3])) {
					return abstractHost;
				}
			}
		}
		return null;
	}

}
  /* End Protected Region   [[48dec04d-02d8-11e9-9e58-33d596257b14]] */


  public static interface IServiceBuildNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8567abfa-84cc-11ea-aadc-ada99ddb5122")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost GetHost(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration cmp, final java.lang.String site, final java.lang.String owner, final java.lang.String id);

    @IDynamicResourceExtension.MethodId("4eb6b4cb-84cd-11ea-aadc-ada99ddb5122")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopologyEnvironment GetTopologyEnvironment();

    @IDynamicResourceExtension.MethodId("88b738ac-5dfa-11ee-aa0e-795a14516714")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode> NoWDC();

  }
  
  public static interface IServiceBuildNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8567abfa-84cc-11ea-aadc-ada99ddb5122")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost GetHost(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration cmp, final java.lang.String site, final java.lang.String owner, final java.lang.String id, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode serviceBuildNode);

    @IDynamicResourceExtension.MethodId("88b738ac-5dfa-11ee-aa0e-795a14516714")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode> NoWDC(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode> serviceBuildNodeList);

  }
  
  public static class ServiceBuildNodeFunctionsImpl implements IServiceBuildNodeFunctionsImpl {

    public static final IServiceBuildNodeFunctionsImpl INSTANCE = new ServiceBuildNodeFunctionsImpl();

    private ServiceBuildNodeFunctionsImpl() {}

    @Override
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost GetHost(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration cmp, final java.lang.String site, final java.lang.String owner, final java.lang.String id, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode serviceBuildNode) {
      /* Begin Protected Region [[8567abfa-84cc-11ea-aadc-ada99ddb5122]] */
    	final IServiceBuildNodeFunctions serviceBuildNodeFunctions = serviceBuildNode.extension(IServiceBuildNodeFunctions.class);
    	final ITopologyEnvironment topologyEnvironment = serviceBuildNodeFunctions.GetTopologyEnvironment();
    	final ITopologyEnvironmentFunctions environmentFunctions = topologyEnvironment.extension(ITopologyEnvironmentFunctions.class);
		IAbstractSiteWithHosts siteObject = environmentFunctions.AllAbstractSiteHosts().stream()
				.filter(x -> x.selectName().equalsIgnoreCase(site)).findFirst().orElse(null);
    	if( siteObject != null ) {
    		final IAbstractHost abstractHost = HelperFunctionClass.GetHost(site, siteObject, cmp, owner, id);
    		if( abstractHost != null ) {
    			return abstractHost;
    		}
    	}
		siteObject = environmentFunctions.AllAbstractSiteHosts().stream()
				.filter(x -> x.selectName().equalsIgnoreCase(site.replace('x', '6'))).findFirst().orElse(null);
		if( siteObject != null ) {
    		final IAbstractHost abstractHost = HelperFunctionClass.GetHost(site, siteObject, cmp, owner, id);
    		if( abstractHost != null ) {
    			return abstractHost;
    		}
		}

		siteObject = environmentFunctions.AllAbstractSiteHosts().stream()
				.filter(x -> x.selectName().equalsIgnoreCase(site.replace('x', '1'))).findFirst().orElse(null);
		if( siteObject != null ) {
    		final IAbstractHost abstractHost = HelperFunctionClass.GetHost(site, siteObject, cmp, owner, id);
    		if( abstractHost != null ) {
    			return abstractHost;
    		}
		}

    	return null;
      /* End Protected Region   [[8567abfa-84cc-11ea-aadc-ada99ddb5122]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode> NoWDC(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode> serviceBuildNodeList) {
      /* Begin Protected Region [[88b738ac-5dfa-11ee-aa0e-795a14516714]] */
    	return serviceBuildNodeList.stream().filter(x -> (x.selectInstanceOf() instanceof cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.security.iam.javamodel.IWriteableDomainControllerSystemConfiguration == false)).collect(java.util.stream.Collectors.toList());   
      /* End Protected Region   [[88b738ac-5dfa-11ee-aa0e-795a14516714]] */
    }

  }
  
  public static class ServiceBuildNodeFunctions {

    private ServiceBuildNodeFunctions() {}

    public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost GetHost(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration cmp, final java.lang.String site, final java.lang.String owner, final java.lang.String id, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode serviceBuildNode) {
      return DynamicResourceUtil.invoke(IServiceBuildNodeFunctionsImpl.class, ServiceBuildNodeFunctionsImpl.INSTANCE, serviceBuildNode).GetHost(cmp, site, owner, id, serviceBuildNode);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode> NoWDC(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode> serviceBuildNodeList) {
      return DynamicResourceUtil.invoke(IServiceBuildNodeFunctionsImpl.class, ServiceBuildNodeFunctionsImpl.INSTANCE, serviceBuildNodeList).NoWDC(serviceBuildNodeList);
    }

  }

  public static interface IExecutionEnvironmentBuildNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("04890c41-02d9-11e9-9e58-33d596257b14")
    public java.lang.String GetSimpleName();

  }
  
  public static interface IExecutionEnvironmentBuildNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ExecutionEnvironmentBuildNodeFunctionsImpl implements IExecutionEnvironmentBuildNodeFunctionsImpl {

    public static final IExecutionEnvironmentBuildNodeFunctionsImpl INSTANCE = new ExecutionEnvironmentBuildNodeFunctionsImpl();

    private ExecutionEnvironmentBuildNodeFunctionsImpl() {}

  }
  
  public static class ExecutionEnvironmentBuildNodeFunctions {

    private ExecutionEnvironmentBuildNodeFunctions() {}

  }

  public static interface IBuildNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bd89444b-0aa2-11e9-8a91-633e556ac68f")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("c18d533d-0e8e-11e9-9f19-6d15636f4ecc")
    public java.lang.String GetTypeName();

    @IDynamicResourceExtension.MethodId("8ea2102d-2aba-11e9-a3f8-336d9e792e17")
    public java.lang.Boolean IsSupplied();

    @IDynamicResourceExtension.MethodId("8900e24b-2abe-11e9-a3f8-336d9e792e17")
    public java.lang.String GetMaterialTypeName();

    @IDynamicResourceExtension.MethodId("c2eb1394-6cef-11e9-a6d3-775c09e81e2d")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyOs();

    @IDynamicResourceExtension.MethodId("008ab45f-a433-11ec-a02c-0578282f8413")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyWindows();

    @IDynamicResourceExtension.MethodId("4de742de-7bb1-11e9-94aa-f1ea7ea33f46")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMH();

    @IDynamicResourceExtension.MethodId("3cb6a8f3-dff4-11eb-93d3-9f230e4bb32b")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMs();

    @IDynamicResourceExtension.MethodId("73a99824-8555-11ea-a579-31bf00957a06")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> Dependencies();

    @IDynamicResourceExtension.MethodId("e4d0cc56-e070-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer BruttoMHz_Server();

    @IDynamicResourceExtension.MethodId("04240e23-e071-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer NettoMHz_Server();

    @IDynamicResourceExtension.MethodId("401f2e96-e076-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer TotalNettoMGHz_VM();

    @IDynamicResourceExtension.MethodId("5756ac01-e077-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer ReserveNettoMGHz();

    @IDynamicResourceExtension.MethodId("068105b1-e07b-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer TotalNettoMemoryGB_VM();

    @IDynamicResourceExtension.MethodId("068105b3-e07b-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer ReserveNettoMemoryGB();

    @IDynamicResourceExtension.MethodId("032dcf9b-e088-11eb-9584-9144fca99be9")
    public java.lang.Integer TotalNettoDiskGB_Server();

    @IDynamicResourceExtension.MethodId("6dd6f21d-e084-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer TotalNettoDiskGB_VM();

    @IDynamicResourceExtension.MethodId("83c4f8c6-e088-11eb-9584-9144fca99be9")
    public java.lang.Integer ReserveNettoDiskGB();

  }
  
  public static interface IBuildNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8ea2102d-2aba-11e9-a3f8-336d9e792e17")
    public java.lang.Boolean IsSupplied(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode);

    @IDynamicResourceExtension.MethodId("c2eb1394-6cef-11e9-a6d3-775c09e81e2d")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyOs(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList);

    @IDynamicResourceExtension.MethodId("008ab45f-a433-11ec-a02c-0578282f8413")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyWindows(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList);

    @IDynamicResourceExtension.MethodId("4de742de-7bb1-11e9-94aa-f1ea7ea33f46")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMH(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList);

    @IDynamicResourceExtension.MethodId("3cb6a8f3-dff4-11eb-93d3-9f230e4bb32b")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMs(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList);

    @IDynamicResourceExtension.MethodId("e4d0cc56-e070-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer BruttoMHz_Server(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode);

    @IDynamicResourceExtension.MethodId("04240e23-e071-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer NettoMHz_Server(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode);

    @IDynamicResourceExtension.MethodId("401f2e96-e076-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer TotalNettoMGHz_VM(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode);

    @IDynamicResourceExtension.MethodId("5756ac01-e077-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer ReserveNettoMGHz(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode);

    @IDynamicResourceExtension.MethodId("068105b1-e07b-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer TotalNettoMemoryGB_VM(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode);

    @IDynamicResourceExtension.MethodId("068105b3-e07b-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer ReserveNettoMemoryGB(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode);

    @IDynamicResourceExtension.MethodId("032dcf9b-e088-11eb-9584-9144fca99be9")
    public java.lang.Integer TotalNettoDiskGB_Server(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode);

    @IDynamicResourceExtension.MethodId("6dd6f21d-e084-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer TotalNettoDiskGB_VM(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode);

    @IDynamicResourceExtension.MethodId("83c4f8c6-e088-11eb-9584-9144fca99be9")
    public java.lang.Integer ReserveNettoDiskGB(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode);

  }
  
  public static class BuildNodeFunctionsImpl implements IBuildNodeFunctionsImpl {

    public static final IBuildNodeFunctionsImpl INSTANCE = new BuildNodeFunctionsImpl();

    private BuildNodeFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsSupplied(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      return false;
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyOs(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      return buildNodeList.stream().filter(x -> x.selectInstanceOf() instanceof cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.operatingsystem.javamodel.IOperatingSystemConfiguration).collect(java.util.stream.Collectors.toList());
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyWindows(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      return buildNodeList.stream().filter(x -> x.selectInstanceOf() instanceof cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.operatingsystem.javamodel.IWindowsSystemConfiguration).collect(java.util.stream.Collectors.toList());
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMH(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      return buildNodeList.stream().filter(x -> x.selectInstanceOf() instanceof cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.operatingsystem.javamodel.IHypervisorSystemConfiguration).collect(java.util.stream.Collectors.toList());
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMs(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      return buildNodeList.stream().filter(x -> x.selectInstanceOf() instanceof cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.virtualization.javamodel.IVirtualMachineSystemConfiguration).collect(java.util.stream.Collectors.toList());
    }

    @Override
    public java.lang.Integer BruttoMHz_Server(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      /* Begin Protected Region [[e4d0cc56-e070-11eb-85ea-9f2d155d4de3]] */
    	int cpuCount = 0;
		var cpus = buildNode.selectCpu();
		for( var cpu : cpus.values()) {
			cpuCount = CPU.selectToMeCores(cpu.selectCore()).selectAmount();
			break;
		}

    	return cpuCount * 2000;
      /* End Protected Region   [[e4d0cc56-e070-11eb-85ea-9f2d155d4de3]] */
    }

    @Override
    public java.lang.Integer NettoMHz_Server(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      /* Begin Protected Region [[04240e23-e071-11eb-85ea-9f2d155d4de3]] */
    	Double netto = BruttoMHz_Server(buildNode) * 0.12;
    	return netto.intValue();
      /* End Protected Region   [[04240e23-e071-11eb-85ea-9f2d155d4de3]] */
    }

    @Override
    public java.lang.Integer TotalNettoMGHz_VM(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      /* Begin Protected Region [[401f2e96-e076-11eb-85ea-9f2d155d4de3]] */
    	var buildNodeFunctions = buildNode.extension(INodeFunctions.class);
		int vmCount = OnlyVMs(buildNodeFunctions.GetAllNestedBuildNodes()).size();
		return NettoMHz_Server(buildNode) * vmCount;
      /* End Protected Region   [[401f2e96-e076-11eb-85ea-9f2d155d4de3]] */
    }

    @Override
    public java.lang.Integer ReserveNettoMGHz(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      /* Begin Protected Region [[5756ac01-e077-11eb-85ea-9f2d155d4de3]] */
    	ICore core = null;
		var cpus = buildNode.selectCpu();
		for( var cpuConfig : cpus.values()) {
			core = cpuConfig.selectCore();
			break;
		}
    	
		return core.extension(ICoreFunctions.class).NettoTotalMHz() - TotalNettoMGHz_VM(buildNode);
      /* End Protected Region   [[5756ac01-e077-11eb-85ea-9f2d155d4de3]] */
    }

    @Override
    public java.lang.Integer TotalNettoMemoryGB_VM(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      /* Begin Protected Region [[068105b1-e07b-11eb-85ea-9f2d155d4de3]] */
    	var buildNodeFunctions = buildNode.extension(INodeFunctions.class);
		int total = 0;
    	for(var vm : OnlyVMs(buildNodeFunctions.GetAllNestedBuildNodes())) {
        	IMemory memory = null;
    		var memories = vm.selectMemory();
    		for( var memoryConfig : memories.values()) {
    			memory = memoryConfig.selectMemory();
    			break;
    		}
    		
			var memoryTotal = memory.extension(IMemoryFunctions.class).NettoTotalGB();
			total += memoryTotal; 
		}
		
    	return total;
      /* End Protected Region   [[068105b1-e07b-11eb-85ea-9f2d155d4de3]] */
    }

    @Override
    public java.lang.Integer ReserveNettoMemoryGB(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      /* Begin Protected Region [[068105b3-e07b-11eb-85ea-9f2d155d4de3]] */
    	IMemory memory = null;
		var memories = buildNode.selectMemory();
		for( var memoryConfig : memories.values()) {
			memory = memoryConfig.selectMemory();
			break;
		}
    	
		return memory.extension(IMemoryFunctions.class).NettoTotalGB() - TotalNettoMemoryGB_VM(buildNode);
      /* End Protected Region   [[068105b3-e07b-11eb-85ea-9f2d155d4de3]] */
    }

    @Override
    public java.lang.Integer TotalNettoDiskGB_Server(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      /* Begin Protected Region [[032dcf9b-e088-11eb-9584-9144fca99be9]] */
		int total = 0;
		var disks = buildNode.selectDisks();
		for( var diskConfigKey : disks.keyIterable()) {
			for( var diskConfig : disks.get(diskConfigKey) ) {
    			var disk = diskConfig.selectDisk();
    			total += disk.selectCapacityGB();     			
			}    			
		}

    	Double totalDouble = total * 0.6;
    	return totalDouble.intValue();
      /* End Protected Region   [[032dcf9b-e088-11eb-9584-9144fca99be9]] */
    }

    @Override
    public java.lang.Integer TotalNettoDiskGB_VM(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      /* Begin Protected Region [[6dd6f21d-e084-11eb-85ea-9f2d155d4de3]] */
    	var buildNodeFunctions = buildNode.extension(INodeFunctions.class);
		int total = 0;
    	for(var vm : OnlyVMs(buildNodeFunctions.GetAllNestedBuildNodes())) {
    		var disks = vm.selectDisks();
    		for( var diskConfigKey : disks.keyIterable()) {
    			for( var diskConfig : disks.get(diskConfigKey) ) {
        			var disk = diskConfig.selectDisk();
        			total += disk.selectCapacityGB();     			
    			}    			
    		}
		}

    	Double totalDouble = total * 0.6;
    	return totalDouble.intValue();
      /* End Protected Region   [[6dd6f21d-e084-11eb-85ea-9f2d155d4de3]] */
    }

    @Override
    public java.lang.Integer ReserveNettoDiskGB(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      /* Begin Protected Region [[83c4f8c6-e088-11eb-9584-9144fca99be9]] */
    	return TotalNettoDiskGB_Server(buildNode) - TotalNettoDiskGB_VM(buildNode);
      /* End Protected Region   [[83c4f8c6-e088-11eb-9584-9144fca99be9]] */
    }

  }
  
  public static class BuildNodeFunctions {

    private BuildNodeFunctions() {}

    public static java.lang.Boolean IsSupplied(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNode).IsSupplied(buildNode);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyOs(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNodeList).OnlyOs(buildNodeList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyWindows(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNodeList).OnlyWindows(buildNodeList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMH(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNodeList).OnlyVMH(buildNodeList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMs(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNodeList).OnlyVMs(buildNodeList);
    }

    public static java.lang.Integer BruttoMHz_Server(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNode).BruttoMHz_Server(buildNode);
    }

    public static java.lang.Integer NettoMHz_Server(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNode).NettoMHz_Server(buildNode);
    }

    public static java.lang.Integer TotalNettoMGHz_VM(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNode).TotalNettoMGHz_VM(buildNode);
    }

    public static java.lang.Integer ReserveNettoMGHz(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNode).ReserveNettoMGHz(buildNode);
    }

    public static java.lang.Integer TotalNettoMemoryGB_VM(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNode).TotalNettoMemoryGB_VM(buildNode);
    }

    public static java.lang.Integer ReserveNettoMemoryGB(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNode).ReserveNettoMemoryGB(buildNode);
    }

    public static java.lang.Integer TotalNettoDiskGB_Server(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNode).TotalNettoDiskGB_Server(buildNode);
    }

    public static java.lang.Integer TotalNettoDiskGB_VM(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNode).TotalNettoDiskGB_VM(buildNode);
    }

    public static java.lang.Integer ReserveNettoDiskGB(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNode).ReserveNettoDiskGB(buildNode);
    }

  }

  public static interface IApplicationBuildNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("104621ba-84da-11ea-ade9-0f308d716192")
    public java.lang.String GetSimpleName();

    @IDynamicResourceExtension.MethodId("1bedfd33-84da-11ea-ade9-0f308d716192")
    public java.lang.String OnlyName();

  }
  
  public static interface IApplicationBuildNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("104621ba-84da-11ea-ade9-0f308d716192")
    public java.lang.String GetSimpleName(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IApplicationBuildNode applicationBuildNode);

    @IDynamicResourceExtension.MethodId("1bedfd33-84da-11ea-ade9-0f308d716192")
    public java.lang.String OnlyName(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IApplicationBuildNode applicationBuildNode);

  }
  
  public static class ApplicationBuildNodeFunctionsImpl implements IApplicationBuildNodeFunctionsImpl {

    public static final IApplicationBuildNodeFunctionsImpl INSTANCE = new ApplicationBuildNodeFunctionsImpl();

    private ApplicationBuildNodeFunctionsImpl() {}

    @Override
    public java.lang.String GetSimpleName(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IApplicationBuildNode applicationBuildNode) {
      return null;
    }

    @Override
    public java.lang.String OnlyName(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IApplicationBuildNode applicationBuildNode) {
      return null;
    }

  }
  
  public static class ApplicationBuildNodeFunctions {

    private ApplicationBuildNodeFunctions() {}

    public static java.lang.String GetSimpleName(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IApplicationBuildNode applicationBuildNode) {
      return DynamicResourceUtil.invoke(IApplicationBuildNodeFunctionsImpl.class, ApplicationBuildNodeFunctionsImpl.INSTANCE, applicationBuildNode).GetSimpleName(applicationBuildNode);
    }

    public static java.lang.String OnlyName(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IApplicationBuildNode applicationBuildNode) {
      return DynamicResourceUtil.invoke(IApplicationBuildNodeFunctionsImpl.class, ApplicationBuildNodeFunctionsImpl.INSTANCE, applicationBuildNode).OnlyName(applicationBuildNode);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,48dec04d-02d8-11e9-9e58-33d596257b14,wCo8HrQU2/xam9ufUugUbUWBpAc=] */
