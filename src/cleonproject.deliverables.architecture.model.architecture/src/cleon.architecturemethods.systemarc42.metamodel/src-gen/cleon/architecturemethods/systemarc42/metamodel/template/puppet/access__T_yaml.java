package cleon.architecturemethods.systemarc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b13f88ca-1e75-11eb-b08c-d72de2e3f55f,imports]] */
import ch.actifsource.core.Resource;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.remote_access.javamodel.ITerminalServerSystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.FunctionSpace_Communication.ISourceFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.FunctionSpace_Access.IAccessConfigurationFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessTo;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.IAbstractSiteFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ICluster;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* End Protected Region   [[b13f88ca-1e75-11eb-b08c-d72de2e3f55f,imports]] */

public class access__T_yaml {

  /* Begin Protected Region [[b13f88ca-1e75-11eb-b08c-d72de2e3f55f]] */
  public static class TextHelper {
  	private static String WwW = "www";

  	public static void checkAndAddText(Map<Resource, ? extends IAccessConfiguration> accessConfigurationMap,
  			IAbstractHost src, IAbstractHost dst, ISourceFunctions sourceFunctions,
  			HashMap<String, HashMap<String, List<String>>> siteTable, String protcol, boolean useProtocol) {

  		if (accessConfigurationMap.isEmpty() == false) {
  			final IAccessConfiguration accessConfiguration = accessConfigurationMap.values().stream().findFirst()
  					.get();
  			if (accessConfiguration.selectHostAccessMode() == null
  					|| accessConfiguration.selectHostAccessMode().isNoCluster()) {
  				if (dst instanceof ICluster) {
  					return;
  				}
  			} else if (accessConfiguration.selectHostAccessMode().isOnlyCluster()) {
  				if (!(dst instanceof ICluster)) {
  					return;
  				}
  			}

  			if (sourceFunctions.CanCommunicate(src, dst, accessConfiguration)) {
  				TextHelper.addAccessEntry(siteTable, dst, dst, protcol, accessConfiguration, useProtocol);
  			}
  		}
  	}

  	public static java.lang.String printMobaXtermText(
  			final HashMap<String, HashMap<String, List<String>>> siteTable) {
  		final StringBuffer stringBuffer = new StringBuffer();
  		for (final String siteName : siteTable.keySet().stream().sorted().collect(Collectors.toList())) {
  			final HashMap<String, List<String>> pathTable = siteTable.get(siteName);
  			for (final String systemName : pathTable.keySet().stream().sorted().collect(Collectors.toList())) {
  				stringBuffer.append(String.format("  %s\\%s:\n", siteName, systemName));
  				for (final String entry : pathTable.get(systemName)) {
  					stringBuffer.append(String.format("    %s\n", entry));
  				}
  			}
  		}
  		if (stringBuffer.length() == 0) {
  			return null;
  		}
  		return stringBuffer.toString();
  	}

  	public static java.lang.String printFirefoxText(final HashMap<String, HashMap<String, List<String>>> siteTable,
  			ISystemConfigurationAccessFrom systemConfigurationAccessFrom) {
  		final ISystemConfigurationAccessFromFunctions accessFromFunctions = systemConfigurationAccessFrom
  				.extension(ISystemConfigurationAccessFromFunctions.class);

  		final StringBuffer stringBuffer = new StringBuffer();
  		for (final String siteName : siteTable.keySet().stream().sorted().collect(Collectors.toList())) {
  			final HashMap<String, List<String>> pathTable = siteTable.get(siteName);
  			for (final String systemName : pathTable.keySet().stream().sorted().collect(Collectors.toList())) {
  				final String folder = String.format("%s/%s", siteName, systemName);
  				for (final String entry : pathTable.get(systemName)) {
  					stringBuffer.append(accessFromFunctions.RenderFirefoxEntry(entry, folder) + "\n");
  				}
  			}
  		}
  		if (stringBuffer.length() == 0) {
  			return null;
  		}
  		return stringBuffer.toString();
  	}

  	private static void addAccessEntry(final HashMap<String, HashMap<String, List<String>>> siteTable,
  			final IAbstractHost abstractHost, IAbstractHost dst, String protocol,
  			IAccessConfiguration accessConfiguration, boolean useProtocol) {

  		final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.IAbstractHostFunctions dstHostFunctions = dst
  				.extension(
  						cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.IAbstractHostFunctions.class);
  		final String siteName = dstHostFunctions.TopSiteName();

  		if (!siteTable.containsKey(siteName)) {
  			siteTable.put(siteName, new HashMap<>());
  		}

  		final ISystemConfiguration configuration = abstractHost.selectInstanceOf();
  		final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.FunctionSpace_SystemArc42_BuildingBlockView.ISystemConfigurationFunctions systemConfigurationFunctions = configuration
  				.extension(
  						cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.FunctionSpace_SystemArc42_BuildingBlockView.ISystemConfigurationFunctions.class);

  		final String systemName = systemConfigurationFunctions.SystemName();

  		if (!siteTable.get(siteName).containsKey(systemName)) {
  			siteTable.get(siteName).put(systemName, new ArrayList<>());
  		}

  		final IAccessConfigurationFunctions accessConfigurationFunctions = accessConfiguration
  				.extension(IAccessConfigurationFunctions.class);
  		String entry;
  		if (protocol.equals(WwW)) {
  			if (useProtocol) {
  				entry = String.format("https://%s: %s",
  						accessConfigurationFunctions.Decorate(dstHostFunctions.AliasOrSimpleName()), protocol);
  			} else {
  				entry = String.format("https://%s",
  						accessConfigurationFunctions.Decorate(dstHostFunctions.AliasOrSimpleName()));
  			}

  		} else {
  			if (useProtocol) {
  				entry = String.format("%s: %s",
  						accessConfigurationFunctions.Decorate(dstHostFunctions.AliasOrSimpleName()), protocol);
  			} else {
  				entry = String.format("%s",
  						accessConfigurationFunctions.Decorate(dstHostFunctions.AliasOrSimpleName()));
  			}
  		}

  		siteTable.get(siteName).get(systemName).add(entry);
  	}
  }
  /* End Protected Region   [[b13f88ca-1e75-11eb-b08c-d72de2e3f55f]] */


  public static interface IAbstractHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7687af9c-1e76-11eb-b08c-d72de2e3f55f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyTerminals();

  }
  
  public static interface IAbstractHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7687af9c-1e76-11eb-b08c-d72de2e3f55f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyTerminals(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList);

  }
  
  public static class AbstractHostFunctionsImpl implements IAbstractHostFunctionsImpl {

    public static final IAbstractHostFunctionsImpl INSTANCE = new AbstractHostFunctionsImpl();

    private AbstractHostFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyTerminals(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList) {
      /* Begin Protected Region [[7687af9c-1e76-11eb-b08c-d72de2e3f55f]] */
      return abstractHostList.stream()
      		.filter(x -> x.selectInstanceOf() instanceof ITerminalServerSystemConfiguration)
      		.collect(Collectors.toList());
      /* End Protected Region   [[7687af9c-1e76-11eb-b08c-d72de2e3f55f]] */
    }

  }
  
  public static class AbstractHostFunctions {

    private AbstractHostFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyTerminals(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList) {
      return DynamicResourceUtil.invoke(IAbstractHostFunctionsImpl.class, AbstractHostFunctionsImpl.INSTANCE, abstractHostList).OnlyTerminals(abstractHostList);
    }

  }

  public static interface ISystemConfigurationAccessFromFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("34c8bca2-2401-11eb-83b1-3d2a97975978")
    public java.lang.String RenderTextMobaxterm(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost src);

    @IDynamicResourceExtension.MethodId("fba8bb9b-2443-11eb-989b-5523e93a6c25")
    public java.lang.String RenderTextFirefox(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost src);

    @IDynamicResourceExtension.MethodId("26973923-2445-11eb-989b-5523e93a6c25")
    public java.lang.String RenderFirefoxEntry(final java.lang.String entryName, final java.lang.String folderName);

  }
  
  public static interface ISystemConfigurationAccessFromFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("34c8bca2-2401-11eb-83b1-3d2a97975978")
    public java.lang.String RenderTextMobaxterm(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost src, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom systemConfigurationAccessFrom);

    @IDynamicResourceExtension.MethodId("fba8bb9b-2443-11eb-989b-5523e93a6c25")
    public java.lang.String RenderTextFirefox(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost src, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom systemConfigurationAccessFrom);

  }
  
  public static class SystemConfigurationAccessFromFunctionsImpl implements ISystemConfigurationAccessFromFunctionsImpl {

    public static final ISystemConfigurationAccessFromFunctionsImpl INSTANCE = new SystemConfigurationAccessFromFunctionsImpl();

    private SystemConfigurationAccessFromFunctionsImpl() {}

    @Override
    public java.lang.String RenderTextMobaxterm(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost src, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom systemConfigurationAccessFrom) {
      /* Begin Protected Region [[34c8bca2-2401-11eb-83b1-3d2a97975978]] */
      final IAbstractSiteFunctions abstractSiteFunctions = abstractSite.extension(IAbstractSiteFunctions.class);
      final HashMap<String, HashMap<String, List<String>>> siteTable = new HashMap<>();

      for (final IAbstractHost dst : abstractSiteFunctions.AllHostsWithAllowedManaged()) {
      	for (final ISystemConfigurationAccessTo accessTo : systemConfigurationAccessFrom.selectAccessTo()
      			.values()) {
      		final ISourceFunctions sourceFunctions = accessTo.selectSource().extension(ISourceFunctions.class);
      		if (sourceFunctions.Destination().selectDestinationSystemConfiguration()
      				.equals(dst.selectInstanceOf()) == false) {
      			continue;
      		}

      		if (sourceFunctions.Destination().selectDestinationSystemConfiguration()
      				.equals(dst.selectInstanceOf())) {

      			TextHelper.checkAndAddText(accessTo.selectAccessConfigurationRDP(), src, dst, sourceFunctions,
      					siteTable, "rdp", true);
      			TextHelper.checkAndAddText(accessTo.selectAccessConfigurationSSH(), src, dst, sourceFunctions,
      					siteTable, "ssh", true);
      			TextHelper.checkAndAddText(accessTo.selectAccessConfigurationWeb(), src, dst, sourceFunctions,
      					siteTable, TextHelper.WwW, true);
      		}
      	}
      }

      return TextHelper.printMobaXtermText(siteTable);
      /* End Protected Region   [[34c8bca2-2401-11eb-83b1-3d2a97975978]] */
    }

    @Override
    public java.lang.String RenderTextFirefox(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost src, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom systemConfigurationAccessFrom) {
      /* Begin Protected Region [[fba8bb9b-2443-11eb-989b-5523e93a6c25]] */
      final IAbstractSiteFunctions abstractSiteFunctions = abstractSite.extension(IAbstractSiteFunctions.class);
      final HashMap<String, HashMap<String, List<String>>> siteTable = new HashMap<>();

      for (final IAbstractHost dst : abstractSiteFunctions.AllHostsWithAllowedManaged()) {
      	for (final ISystemConfigurationAccessTo accessTo : systemConfigurationAccessFrom.selectAccessTo()
      			.values()) {
      		final ISourceFunctions sourceFunctions = accessTo.selectSource().extension(ISourceFunctions.class);
      		if (sourceFunctions.Destination().selectDestinationSystemConfiguration()
      				.equals(dst.selectInstanceOf()) == false) {
      			continue;
      		}

      		if (sourceFunctions.Destination().selectDestinationSystemConfiguration()
      				.equals(dst.selectInstanceOf())) {

      			TextHelper.checkAndAddText(accessTo.selectAccessConfigurationWeb(), src, dst, sourceFunctions,
      					siteTable, TextHelper.WwW, false);
      		}
      	}
      }

      return TextHelper.printFirefoxText(siteTable, systemConfigurationAccessFrom);
      /* End Protected Region   [[fba8bb9b-2443-11eb-989b-5523e93a6c25]] */
    }

  }
  
  public static class SystemConfigurationAccessFromFunctions {

    private SystemConfigurationAccessFromFunctions() {}

    public static java.lang.String RenderTextMobaxterm(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost src, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom systemConfigurationAccessFrom) {
      return DynamicResourceUtil.invoke(ISystemConfigurationAccessFromFunctionsImpl.class, SystemConfigurationAccessFromFunctionsImpl.INSTANCE, systemConfigurationAccessFrom).RenderTextMobaxterm(abstractSite, src, systemConfigurationAccessFrom);
    }

    public static java.lang.String RenderTextFirefox(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost src, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom systemConfigurationAccessFrom) {
      return DynamicResourceUtil.invoke(ISystemConfigurationAccessFromFunctionsImpl.class, SystemConfigurationAccessFromFunctionsImpl.INSTANCE, systemConfigurationAccessFrom).RenderTextFirefox(abstractSite, src, systemConfigurationAccessFrom);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b13f88ca-1e75-11eb-b08c-d72de2e3f55f,UhEk/C9XcSgJjFE5+Leg8DJBgYU=] */
