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
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.FunctionSpace_Access.IAccessCommunicationTypeFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.FunctionSpace_Access.IAccessConfigurationServiceFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom;
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
  	private static String HTTPS = "https";
  	private static String HTTP = "http";

  	public static void checkAndAddText(final Map<Resource, ? extends IAccessConfiguration> accessConfigurationMap,
  			final IAbstractHost src, final IAbstractHost dst, final ISourceFunctions sourceFunctions,
  			final HashMap<String, HashMap<String, List<String>>> siteTable, final boolean useProtocol) {

  		if (accessConfigurationMap.isEmpty() == false) {
  			accessConfigurationMap.values().stream().forEach(accessConfiguration -> {
  				accessConfiguration.selectAccessByService().values().stream().forEach(accessConfigurationService -> {
  					if (accessConfigurationService.selectHostAccessMode() == null || accessConfigurationService.selectHostAccessMode().isNoCluster()) {
  						if (dst instanceof ICluster) {
  							return;
  						}
  					} else if (accessConfigurationService.selectHostAccessMode().isOnlyCluster() && !(dst instanceof ICluster)) {
  						return;
  					}

  					if (sourceFunctions.CanCommunicate(src, dst, accessConfigurationService)) {
  						final var typeFunctions = accessConfiguration.selectAccessCommunicationType().extension(IAccessCommunicationTypeFunctions.class);
  						TextHelper.addAccessEntry(siteTable, dst, dst, typeFunctions.Protocol(), accessConfigurationService, useProtocol);
  					}
  				});
  			});
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
  			final ISystemConfigurationAccessFrom systemConfigurationAccessFrom) {
  		final ISystemConfigurationAccessFromFunctions accessFromFunctions = systemConfigurationAccessFrom
  				.extension(ISystemConfigurationAccessFromFunctions.class);

  		final StringBuffer stringBuffer = new StringBuffer();
  		for (final String siteName : siteTable.keySet().stream().sorted().collect(Collectors.toList())) {
  			stringBuffer.append(String.format("- name: %s\n", siteName));
  			stringBuffer.append(String.format("  children:\n"));
  			final HashMap<String, List<String>> pathTable = siteTable.get(siteName);
  			for (final String systemName : pathTable.keySet().stream().sorted().collect(Collectors.toList())) {
  				stringBuffer.append(String.format("  - name: %s\n", systemName));
  				stringBuffer.append(String.format("    children:\n"));
  				for (final String entry : pathTable.get(systemName)) {
  					stringBuffer.append(String.format("%s\n", accessFromFunctions.RenderFirefoxEntry(entry)));
  				}
  			}
  		}
  		if (stringBuffer.length() == 0) {
  			return null;
  		}
  		return stringBuffer.toString();
  	}

  	private static void addAccessEntry(final HashMap<String, HashMap<String, List<String>>> siteTable,
  			final IAbstractHost abstractHost, final IAbstractHost dst, final String protocol,
  			final IAccessConfigurationService accessConfigurationService, final boolean useProtocol) {

  		final IAbstractHostFunctions dstHostFunctions = dst.extension(
  				IAbstractHostFunctions.class);

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

  		final var accessConfigurationFunctions = accessConfigurationService
  				.extension(IAccessConfigurationServiceFunctions.class);
  		String entry;
  		if (protocol.equals(HTTP) || protocol.equals(HTTPS)) {
  			if (useProtocol) {
  				entry = String.format("%s://%s: www", protocol, accessConfigurationFunctions.Decorate(dstHostFunctions.FQDNAliasOrHostnameWithService(accessConfigurationService, accessConfigurationService.selectService())));
  			} else {
  				entry = String.format("%s://%s", protocol, accessConfigurationFunctions.Decorate(dstHostFunctions.FQDNAliasOrHostnameWithService(accessConfigurationService, accessConfigurationService.selectService())));
  			}
  		} else if (useProtocol) {
  			entry = String.format("%s: %s",
  					accessConfigurationFunctions.Decorate(dstHostFunctions.FQDNAliasOrHostname(accessConfigurationService)), protocol);
  		} else {
  			entry = String.format("%s",
  					accessConfigurationFunctions.Decorate(dstHostFunctions.FQDNAliasOrHostname(accessConfigurationService)));
  		}

  		siteTable.get(siteName).get(systemName).add(entry);
  	}
  }
  /* End Protected Region   [[b13f88ca-1e75-11eb-b08c-d72de2e3f55f]] */


  public static interface IAbstractHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7687af9c-1e76-11eb-b08c-d72de2e3f55f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyTerminals();

    @IDynamicResourceExtension.MethodId("0a7ac816-c221-11eb-abce-359bcb502761")
    public java.lang.String FQDNAliasOrHostname(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService accessConfigurationService);

    @IDynamicResourceExtension.MethodId("0a7ac820-c221-11eb-abce-359bcb502761")
    public java.lang.String FQDNAliasOrHostnameWithService(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService accessConfigurationService, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService service);

    @IDynamicResourceExtension.MethodId("7f2d3372-c221-11eb-abce-359bcb502761")
    public java.lang.String TopSiteName();

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
    public java.lang.String RenderFirefoxEntry(final java.lang.String entryName);

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
      	for (final IAccessSystemConfigurationTo accessTo : systemConfigurationAccessFrom.selectAccessTo()
      			.values()) {
      		final ISourceFunctions sourceFunctions = accessTo.selectSource().extension(ISourceFunctions.class);
      		if (sourceFunctions.Destination().selectDestinationSystemConfiguration()
      				.equals(dst.selectInstanceOf()) == false) {
      			continue;
      		}

      		if (sourceFunctions.Destination().selectDestinationSystemConfiguration()
      				.equals(dst.selectInstanceOf())) {

      			TextHelper.checkAndAddText(accessTo.selectAccessConfigurationRDP(), src, dst, sourceFunctions,
      					siteTable, true);
      			TextHelper.checkAndAddText(accessTo.selectAccessConfigurationSSH(), src, dst, sourceFunctions,
      					siteTable, true);
      			TextHelper.checkAndAddText(accessTo.selectAccessConfigurationWeb(), src, dst, sourceFunctions,
      					siteTable, true);
      		}
      	}
      }

      return TextHelper.printMobaXtermText(siteTable);
      /* End Protected Region   [[34c8bca2-2401-11eb-83b1-3d2a97975978]] */
    }

    @Override
    public java.lang.String RenderTextFirefox(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost src, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom systemConfigurationAccessFrom) {
      /* Begin Protected Region [[fba8bb9b-2443-11eb-989b-5523e93a6c25]] */
      final var abstractSiteFunctions = abstractSite.extension(IAbstractSiteFunctions.class);
      final HashMap<String, HashMap<String, List<String>>> siteTable = new HashMap<>();

      for (final IAbstractHost dst : abstractSiteFunctions.AllHostsWithAllowedManaged()) {
      	for (final IAccessSystemConfigurationTo accessTo : systemConfigurationAccessFrom.selectAccessTo()
      			.values()) {
      		final ISourceFunctions sourceFunctions = accessTo.selectSource().extension(ISourceFunctions.class);
      		if (sourceFunctions.Destination().selectDestinationSystemConfiguration()
      				.equals(dst.selectInstanceOf()) == false) {
      			continue;
      		}

      		if (sourceFunctions.Destination().selectDestinationSystemConfiguration()
      				.equals(dst.selectInstanceOf())) {
      			TextHelper.checkAndAddText(accessTo.selectAccessConfigurationWeb(), src, dst, sourceFunctions, siteTable, false);
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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b13f88ca-1e75-11eb-b08c-d72de2e3f55f,eB6pcggx76xCS9Ue9rKNhFNMomM=] */
