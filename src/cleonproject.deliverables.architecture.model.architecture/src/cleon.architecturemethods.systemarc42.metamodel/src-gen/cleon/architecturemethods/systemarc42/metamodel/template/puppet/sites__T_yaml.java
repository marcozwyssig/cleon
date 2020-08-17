package cleon.architecturemethods.systemarc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5a5e3d83-da22-11ea-ae00-5518e944c256,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.MonitoringBuildingBlock;
import cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSingleHost;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ICluster;
import ch.actifsource.core.job.Select;
import java.util.stream.Collectors;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashMap;
import ch.actifsource.environment.EnvironmentPlugin;
/* End Protected Region   [[5a5e3d83-da22-11ea-ae00-5518e944c256,imports]] */

public class sites__T_yaml {

  /* Begin Protected Region [[5a5e3d83-da22-11ea-ae00-5518e944c256]] */

  /* End Protected Region   [[5a5e3d83-da22-11ea-ae00-5518e944c256]] */


  public static interface IAbstractHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1b0e67d4-da27-11ea-ae00-5518e944c256")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyMonitored();

    @IDynamicResourceExtension.MethodId("26e3b499-da2a-11ea-ae00-5518e944c256")
    public java.lang.String GetPath();

    @IDynamicResourceExtension.MethodId("318d7935-da2d-11ea-ae00-5518e944c256")
    public java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site);

    @IDynamicResourceExtension.MethodId("c0109767-dcb7-11ea-b5f8-77c3980a1d0a")
    public java.lang.String RenderToText(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site);

    @IDynamicResourceExtension.MethodId("012a2be1-dcba-11ea-b5f8-77c3980a1d0a")
    public java.lang.String Entry();

  }
  
  public static interface IAbstractHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("1b0e67d4-da27-11ea-ae00-5518e944c256")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyMonitored(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList);

    @IDynamicResourceExtension.MethodId("318d7935-da2d-11ea-ae00-5518e944c256")
    public java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost abstractHost);

    @IDynamicResourceExtension.MethodId("c0109767-dcb7-11ea-b5f8-77c3980a1d0a")
    public java.lang.String RenderToText(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList);

  }
  
  public static class AbstractHostFunctionsImpl implements IAbstractHostFunctionsImpl {

    public static final IAbstractHostFunctionsImpl INSTANCE = new AbstractHostFunctionsImpl();

    private AbstractHostFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyMonitored(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList) {
      /* Begin Protected Region [[1b0e67d4-da27-11ea-ae00-5518e944c256]] */
      return abstractHostList.stream().filter(x -> {
      	if( x.selectSkipMonitoringGeneration() != null && x.selectSkipMonitoringGeneration().booleanValue()) {
      		return false;
      	}

      	final IMonitoringBuildingBlock buildingBlock = MonitoringBuildingBlock.selectToMeBuildingblockToMonitor(x.selectInstanceOf());
      	if( buildingBlock == null ) {
      		return false;
      	}

      	if( x instanceof IAbstractSingleHost) {
      		return true;
      	}
      	if (x instanceof ICluster) {
      		return buildingBlock.selectCluster() != null;
      	}
      	return false;
      }).collect(Collectors.toList());
      /* End Protected Region   [[1b0e67d4-da27-11ea-ae00-5518e944c256]] */
    }

    @Override
    public java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost abstractHost) {
      /* Begin Protected Region [[318d7935-da2d-11ea-ae00-5518e944c256]] */
      if( site.selectName().equalsIgnoreCase("NMS")) {
      	return "Cluster Probe";
      }

      final String hostName = Select.simpleName(EnvironmentPlugin.getGlobalReadJobExecutor(), abstractHost.getResource()); 
      final char firstLetter = hostName.charAt(hostName.length() - 2);
      final String siteName = site.selectName().toUpperCase().replace('X', '6');

      if(firstLetter == '0') {
      	return "PRP-" + siteName + "-BABS-00";
      } else {
      	return "PRP-" + siteName + "-BABS-10";
      }
      /* End Protected Region   [[318d7935-da2d-11ea-ae00-5518e944c256]] */
    }

    @Override
    public java.lang.String RenderToText(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList) {
      /* Begin Protected Region [[c0109767-dcb7-11ea-b5f8-77c3980a1d0a]] */
      final HashMap<String, HashMap<String, SortedSet<String>>> hashtable = new HashMap<>();
      for( final IAbstractHost abstractHost : abstractHostList) { 
      	final IAbstractHostFunctions abstractHostFunctions = abstractHost.extension(IAbstractHostFunctions.class);
      	final String probeName =  abstractHostFunctions.GetProbeName(site);
      	if (!hashtable.containsKey(probeName)) {
      		hashtable.put(probeName, new HashMap<>());
      	}
      	final String pathName = abstractHostFunctions.GetPath();
      	if( pathName.contains("IP2.0")) {
      		continue;
      	}
      	if(!hashtable.get(probeName).containsKey(pathName)) {
      		hashtable.get(probeName).put(pathName, new TreeSet<>());
      	}
      	hashtable.get(probeName).get(pathName).add(abstractHostFunctions.Entry());
      }

      final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.IAbstractSiteFunctions abstractSiteFunctions = site.extension(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.IAbstractSiteFunctions.class);
      final String siteName = abstractSiteFunctions.MonitoringSiteName();

      final StringBuffer stringBuffer = new StringBuffer();
      for( final String probe : hashtable.keySet() ) {
      	final HashMap<String, SortedSet<String>> pathTable = hashtable.get(probe);
      	for( final String path : pathTable.keySet()) {
      		stringBuffer.append(String.format("  %s|%s|%s:\n", probe, siteName, path));
      		stringBuffer.append("    Profile: pf_grp_ikt\n");
      		stringBuffer.append("    Devices:\n");
      		for( final String entry : pathTable.get(path)) {
      			stringBuffer.append(String.format("      %s\n",entry));						
      		}
      		stringBuffer.append("\n");
      	}
      }
      if (stringBuffer.length() == 0) {
      	return null;
      }
      return stringBuffer.toString(); 
      /* End Protected Region   [[c0109767-dcb7-11ea-b5f8-77c3980a1d0a]] */
    }

  }
  
  public static class AbstractHostFunctions {

    private AbstractHostFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyMonitored(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList) {
      return DynamicResourceUtil.invoke(IAbstractHostFunctionsImpl.class, AbstractHostFunctionsImpl.INSTANCE, abstractHostList).OnlyMonitored(abstractHostList);
    }

    public static java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost abstractHost) {
      return DynamicResourceUtil.invoke(IAbstractHostFunctionsImpl.class, AbstractHostFunctionsImpl.INSTANCE, abstractHost).GetProbeName(site, abstractHost);
    }

    public static java.lang.String RenderToText(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList) {
      return DynamicResourceUtil.invoke(IAbstractHostFunctionsImpl.class, AbstractHostFunctionsImpl.INSTANCE, abstractHostList).RenderToText(site, abstractHostList);
    }

  }

  public static interface IAbstractComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7e2f1dd3-da2a-11ea-ae00-5518e944c256")
    public java.lang.String GetPath();

  }
  
  public static interface IAbstractComponentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractComponentFunctionsImpl implements IAbstractComponentFunctionsImpl {

    public static final IAbstractComponentFunctionsImpl INSTANCE = new AbstractComponentFunctionsImpl();

    private AbstractComponentFunctionsImpl() {}

  }
  
  public static class AbstractComponentFunctions {

    private AbstractComponentFunctions() {}

  }

  public static interface IAbstractSiteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4bb9aa40-dd81-11ea-9383-71e9cf1c59dd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> OnlyToGenerate();

  }
  
  public static interface IAbstractSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4bb9aa40-dd81-11ea-9383-71e9cf1c59dd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> OnlyToGenerate(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> abstractSiteList);

  }
  
  public static class AbstractSiteFunctionsImpl implements IAbstractSiteFunctionsImpl {

    public static final IAbstractSiteFunctionsImpl INSTANCE = new AbstractSiteFunctionsImpl();

    private AbstractSiteFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> OnlyToGenerate(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> abstractSiteList) {
      /* Begin Protected Region [[4bb9aa40-dd81-11ea-9383-71e9cf1c59dd]] */
      return abstractSiteList.stream().filter(x -> x.selectSkipMonitoringGeneration() == null || !x.selectSkipMonitoringGeneration().booleanValue()).collect(Collectors.toList());
      /* End Protected Region   [[4bb9aa40-dd81-11ea-9383-71e9cf1c59dd]] */
    }

  }
  
  public static class AbstractSiteFunctions {

    private AbstractSiteFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> OnlyToGenerate(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> abstractSiteList) {
      return DynamicResourceUtil.invoke(IAbstractSiteFunctionsImpl.class, AbstractSiteFunctionsImpl.INSTANCE, abstractSiteList).OnlyToGenerate(abstractSiteList);
    }

  }

  public static interface IAbstractSingleHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("be045e1b-e089-11ea-bb83-59933a3fa779")
    public java.lang.String Entry();

  }
  
  public static interface IAbstractSingleHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractSingleHostFunctionsImpl implements IAbstractSingleHostFunctionsImpl {

    public static final IAbstractSingleHostFunctionsImpl INSTANCE = new AbstractSingleHostFunctionsImpl();

    private AbstractSingleHostFunctionsImpl() {}

  }
  
  public static class AbstractSingleHostFunctions {

    private AbstractSingleHostFunctions() {}

  }

  public static interface IClusterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2bbd5be6-e08a-11ea-bb83-59933a3fa779")
    public java.lang.String Entry();

  }
  
  public static interface IClusterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ClusterFunctionsImpl implements IClusterFunctionsImpl {

    public static final IClusterFunctionsImpl INSTANCE = new ClusterFunctionsImpl();

    private ClusterFunctionsImpl() {}

  }
  
  public static class ClusterFunctions {

    private ClusterFunctions() {}

  }

  public static interface IAbstractClusterHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6e8b5641-e08c-11ea-bb83-59933a3fa779")
    public java.lang.String Entry();

  }
  
  public static interface IAbstractClusterHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("6e8b5641-e08c-11ea-bb83-59933a3fa779")
    public java.lang.String Entry(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractClusterHost abstractClusterHost);

  }
  
  public static class AbstractClusterHostFunctionsImpl implements IAbstractClusterHostFunctionsImpl {

    public static final IAbstractClusterHostFunctionsImpl INSTANCE = new AbstractClusterHostFunctionsImpl();

    private AbstractClusterHostFunctionsImpl() {}

    @Override
    public java.lang.String Entry(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractClusterHost abstractClusterHost) {
      return null;
    }

  }
  
  public static class AbstractClusterHostFunctions {

    private AbstractClusterHostFunctions() {}

    public static java.lang.String Entry(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractClusterHost abstractClusterHost) {
      return DynamicResourceUtil.invoke(IAbstractClusterHostFunctionsImpl.class, AbstractClusterHostFunctionsImpl.INSTANCE, abstractClusterHost).Entry(abstractClusterHost);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5a5e3d83-da22-11ea-ae00-5518e944c256,jNLqWE2Mz+r6qNwJ6tlhTukDHBY=] */
