package cleon.architecturemethods.systemarc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5a5e3d83-da22-11ea-ae00-5518e944c256,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.MonitoringBuildingBlock;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.IPrtgProbeSystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost;
import ch.actifsource.core.job.Select;
import java.util.stream.Collectors;
import java.util.ArrayList;
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
      	if( x.selectInstanceOf() instanceof IPrtgProbeSystemConfiguration ) {
      		return false;
      	}
      	return MonitoringBuildingBlock.selectToMeBuildingblockToMonitor(x.selectInstanceOf())!= null;
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
      final HashMap<String, HashMap<String, List<String>>> hashtable = new HashMap<>();
      for( final IAbstractHost abstractHost : abstractHostList) { 
      	final IAbstractHostFunctions abstractHostFunctions = abstractHost.extension(IAbstractHostFunctions.class);
      	final String probeName =  abstractHostFunctions.GetProbeName(site);
      	if (!hashtable.containsKey(probeName)) {
      		hashtable.put(probeName, new HashMap<>());
      	}
      	final String pathName = abstractHostFunctions.GetPath();
      	if(!hashtable.get(probeName).containsKey(pathName)) {
      		hashtable.get(probeName).put(pathName, new ArrayList<>());
      	}
      	hashtable.get(probeName).get(pathName).add(abstractHostFunctions.Entry());
      }
      final String siteName = Select.simpleName(EnvironmentPlugin.getGlobalReadJobExecutor(), site.getResource()); 

      final StringBuffer stringBuffer = new StringBuffer();
      for( final String probe : hashtable.keySet() ) {
      	final HashMap<String, List<String>> pathTable = hashtable.get(probe);
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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5a5e3d83-da22-11ea-ae00-5518e944c256,ZA8TX7PJ2dgNSIH9Krc8QYpxUWk=] */
