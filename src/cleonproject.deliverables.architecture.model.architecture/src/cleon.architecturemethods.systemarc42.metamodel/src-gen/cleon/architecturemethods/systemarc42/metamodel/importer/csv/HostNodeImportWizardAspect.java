package cleon.architecturemethods.systemarc42.metamodel.importer.csv;

import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.patch.IStatementPosition;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.ui.wizard.importcsv.CSVParser;
import ch.actifsource.ui.wizard.importcsv.CSVParser.Row;
import ch.actifsource.ui.wizard.importer.IImportContext;
import ch.actifsource.ui.wizard.importer.aspect.IGenericImportWizardAspect;
import cleon.architecturemethods.systemarc42.metamodel.spec.FunctionSpace_SystemArc42.ISystemArc42DocumentFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.FunctionSpace_Network.INetworkEnvironmentFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.FunctionSpace_Network.INetworkSiteFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkConcept;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkEnvironment;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.ITopologyEnvironmentFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopology;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopologyEnvironment;
import cleon.architecturemethods.systemarc42.metamodel.spec.javamodel.ISystemArc42Document;
import cleon.modelinglanguages.network.metamodel.spec.SpecPackage;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D;
import cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone;

public class HostNodeImportWizardAspect implements IGenericImportWizardAspect {

	@Override
	public void importFile(final IImportContext context, final InputStream inputStream) {

		final ITypeSystem typeSystem = TypeSystem.create(context.getWriteJobExecutor());
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		final ISystemArc42Document arc42Document = resourceRepository.getResource(ISystemArc42Document.class,
				context.getResouce());
		final ISystemArc42DocumentFunctions arc42DocumentFunctions = arc42Document
				.extension(ISystemArc42DocumentFunctions.class);
		final INetworkConcept networkConcept = arc42DocumentFunctions.Network();
		final ITopology topology = arc42DocumentFunctions.Topology();
		final INetworkEnvironment networkEnvironment = networkConcept.selectNetworkEnvironment().values().stream()
				.findFirst().get();

		final INetworkEnvironmentFunctions networkEnvironmentFunctions = networkEnvironment
				.extension(INetworkEnvironmentFunctions.class);

		final ITopologyEnvironment topologyEnvironment = topology.selectTopologyEnvironment().values().stream()
				.findFirst().get();

		final ITopologyEnvironmentFunctions topologyEnvironmentFunctions = topologyEnvironment
				.extension(ITopologyEnvironmentFunctions.class);

		final CSVParser parser = new CSVParser(';', CSVParser.RFC_QUOTE);
		try {
			boolean first = false;
			final List<Row> rows = parser.read(inputStream);
			for (final Row row : rows) {
				// Skips header in CSV
				if (!first) {
					first = true;
					continue;
				}

				final List<String> values = row.getValues();
				final String ipv4 = values.get(0);
				final String exportDNS = values.get(1);
				final String hostName = values.get(2);
				final String subzoneName = values.get(3);
				final String siteName = values.get(4);

				context.putInfo("Create/Update " + ipv4 + " in " + siteName + " with hostName " + hostName);
				final INetworkSite networkSite = networkEnvironmentFunctions.GetSite(siteName);
				if (networkSite == null) {
					context.putError("Site " + siteName + " not found");
					continue;
				}

				final INetworkSiteFunctions networkSiteFunctions = networkSite.extension(INetworkSiteFunctions.class);
				final INetworkSubZone subZone = networkSiteFunctions.GetNetworkSubZone(subzoneName);
				if (subZone == null) {
					context.putError("Subzone " + subzoneName + " not found");
					continue;
				}

				final IAbstractHost abstractHost = topologyEnvironmentFunctions.GetAbstractHost(siteName, hostName);
				if (abstractHost == null) {
					context.putError("AbtractHost " + hostName + " not found");
					continue;
				}

				final IIPv4_D ip4 = networkEnvironmentFunctions.GetIP(ipv4);
				if (ip4 == null) {
					context.putError("IP " + ip4 + " not found");
					continue;
				}

				final ch.actifsource.core.Resource hostNodeObject = Update.createAndInitializeResource(
						context.getWriteJobExecutor(), context.getPackage(), NetworkPackage.HostNode,
						subZone.getResource(), SpecPackage.AbstractPhysicalNetwork_nodes, IStatementPosition.AT_END);

				Update.createOrModifyStatement(context.getWriteJobExecutor(), context.getPackage(), hostNodeObject,
						NetworkPackage.HostNode_host, abstractHost.getResource());

				Update.createOrModifyStatement(context.getWriteJobExecutor(), context.getPackage(), hostNodeObject,
						SpecPackage.AbstractNetworkNode_iPv4_aE_D, ip4.getResource());

				Update.createOrModifyStatement(context.getWriteJobExecutor(), context.getPackage(), hostNodeObject,
						SpecPackage.AbstractNetworkNode_exportDNSRecord,
						LiteralUtil.create(Boolean.parseBoolean(exportDNS)));

				context.incrementCreateCount();
			}
		} catch (final Exception e) {
			final StringWriter sw = new StringWriter();
			final PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);

			context.putError(e.toString());
			context.putError(sw.toString());
		}

	}

}
