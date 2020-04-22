package cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[48dec04d-02d8-11e9-9e58-33d596257b14,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopologyEnvironment;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithHosts;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ISite;
import ch.actifsource.util.collection.IList;
import ch.actifsource.core.job.Select;
import java.util.Iterator;
/* End Protected Region   [[48dec04d-02d8-11e9-9e58-33d596257b14,imports]] */

public class FunctionSpace_BuildNode {

  /* Begin Protected Region [[48dec04d-02d8-11e9-9e58-33d596257b14]] */
  
  /* End Protected Region   [[48dec04d-02d8-11e9-9e58-33d596257b14]] */


  public static interface IServiceBuildNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c2f54725-02d3-11e9-9e58-33d596257b14")
    public java.lang.String GetSimpleName();

    @IDynamicResourceExtension.MethodId("b2bba661-2ed3-11e9-9ca2-d7354798e154")
    public java.lang.String OnlyName();

    @IDynamicResourceExtension.MethodId("8567abfa-84cc-11ea-aadc-ada99ddb5122")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost GetHost(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration cmp, final java.lang.String site, final java.lang.String owner, final java.lang.String id);

    @IDynamicResourceExtension.MethodId("4eb6b4cb-84cd-11ea-aadc-ada99ddb5122")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopologyEnvironment GetTopologyEnvironment();

  }
  
  public static interface IServiceBuildNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8567abfa-84cc-11ea-aadc-ada99ddb5122")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost GetHost(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration cmp, final java.lang.String site, final java.lang.String owner, final java.lang.String id, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode serviceBuildNode);

  }
  
  public static class ServiceBuildNodeFunctionsImpl implements IServiceBuildNodeFunctionsImpl {

    public static final IServiceBuildNodeFunctionsImpl INSTANCE = new ServiceBuildNodeFunctionsImpl();

    private ServiceBuildNodeFunctionsImpl() {}

    @Override
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost GetHost(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration cmp, final java.lang.String site, final java.lang.String owner, final java.lang.String id, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode serviceBuildNode) {
      /* Begin Protected Region [[8567abfa-84cc-11ea-aadc-ada99ddb5122]] */
    	IServiceBuildNodeFunctions serviceBuildNodeFunctions = serviceBuildNode.extension(IServiceBuildNodeFunctions.class);
    	ITopologyEnvironment topologyEnvironment = serviceBuildNodeFunctions.GetTopologyEnvironment();
    	ISite siteObject = topologyEnvironment.selectSites().stream().filter(x -> x.selectName().equals(site)).findFirst().orElse(null);
    	if(siteObject != null && siteObject instanceof IAbstractSiteWithHosts ) {
    		IAbstractSiteWithHosts siteComposition = (IAbstractSiteWithHosts)siteObject;
    		IList<? extends IAbstractHost> abstractHosts = siteComposition.selectHosts().get(cmp.getResource());
    		Iterator<? extends IAbstractHost> iterator = abstractHosts.iterator();
    		while( iterator.hasNext() ) {
    			IAbstractHost abstractHost = iterator.next();
    			String simpleName = Select.simpleName(abstractHost.getReadJobExecutor(), abstractHost.getResource());
    			String[] strings = simpleName.split("-");
    			if( owner.equals(strings[2]) && id.equals(strings[3])) {
    				return abstractHost;
    			}    			
    		}
    	}
    	return null;
      /* End Protected Region   [[8567abfa-84cc-11ea-aadc-ada99ddb5122]] */
    }

  }
  
  public static class ServiceBuildNodeFunctions {

    private ServiceBuildNodeFunctions() {}

    public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost GetHost(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration cmp, final java.lang.String site, final java.lang.String owner, final java.lang.String id, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode serviceBuildNode) {
      return DynamicResourceUtil.invoke(IServiceBuildNodeFunctionsImpl.class, ServiceBuildNodeFunctionsImpl.INSTANCE, serviceBuildNode).GetHost(cmp, site, owner, id, serviceBuildNode);
    }

  }

  public static interface IExecutionEnvironmentBuildNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("04890c41-02d9-11e9-9e58-33d596257b14")
    public java.lang.String GetSimpleName();

    @IDynamicResourceExtension.MethodId("24d3699c-2ed4-11e9-9ca2-d7354798e154")
    public java.lang.String OnlyName();

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

    @IDynamicResourceExtension.MethodId("0adf3643-02d9-11e9-9e58-33d596257b14")
    public java.lang.String GetSimpleName();

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

    @IDynamicResourceExtension.MethodId("4de742de-7bb1-11e9-94aa-f1ea7ea33f46")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMH();

  }
  
  public static interface IBuildNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8ea2102d-2aba-11e9-a3f8-336d9e792e17")
    public java.lang.Boolean IsSupplied(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode);

    @IDynamicResourceExtension.MethodId("c2eb1394-6cef-11e9-a6d3-775c09e81e2d")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyOs(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList);

    @IDynamicResourceExtension.MethodId("4de742de-7bb1-11e9-94aa-f1ea7ea33f46")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMH(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList);

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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMH(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      return buildNodeList.stream().filter(x -> x.selectInstanceOf() instanceof cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.operatingsystem.javamodel.IHypervisorSystemConfiguration).collect(java.util.stream.Collectors.toList());
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

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMH(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNodeList).OnlyVMH(buildNodeList);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,48dec04d-02d8-11e9-9e58-33d596257b14,ZZIUZ/4YRu9sR70uppPpLr01EX0=] */
