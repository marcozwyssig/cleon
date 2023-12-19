package cleon.architecturemethods.systemarc42.metamodel.importer.csv;

import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.patch.IStatementPosition;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.ui.wizard.importer.IImportContext;
import ch.actifsource.ui.wizard.importer.aspect.IGenericImportWizardAspect;
import ch.actifsource.util.csv.CSVParser;
import ch.actifsource.util.csv.CSVParser.Row;
import cleon.architecturemethods.systemarc42.metamodel.spec.FunctionSpace_SystemArc42.ISystemArc42DocumentFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.FunctionSpace_Network.INetworkEnvironmentFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.FunctionSpace_Network.INetworkSiteFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkEnvironment;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.ITopologyEnvironmentFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopologyEnvironment;
import cleon.architecturemethods.systemarc42.metamodel.spec.javamodel.ISystemArc42Document;
import cleon.modelinglanguages.network.metamodel.spec.SpecPackage;

public class HostNodeImportWizardAspect implements IGenericImportWizardAspect {

	@Override
	public void importFile(final IImportContext context, final InputStream inputStream) {
		try {
			final var typeSystem = TypeSystem.create(context.getWriteJobExecutor());
			final var resourceRepository = typeSystem.getResourceRepository();
			final var arc42Document = resourceRepository.getResource(ISystemArc42Document.class,
					context.getResouce());
			final var arc42DocumentFunctions = arc42Document
					.extension(ISystemArc42DocumentFunctions.class);
			final var networkConcept = arc42DocumentFunctions.Network();
			final var topology = arc42DocumentFunctions.Topology();
			final INetworkEnvironment networkEnvironment = networkConcept.selectNetworkEnvironment().values().stream()
					.findFirst().get();

			final var networkEnvironmentFunctions = networkEnvironment
					.extension(INetworkEnvironmentFunctions.class);

			final ITopologyEnvironment topologyEnvironment = topology.selectTopologyEnvironment().values().stream()
					.findFirst().get();

			final var topologyEnvironmentFunctions = topologyEnvironment
					.extension(ITopologyEnvironmentFunctions.class);

			final var parser = new CSVParser(';', CSVParser.RFC_QUOTE);
			
			var first = false;
			final var rows = parser.read(inputStream);
			for (final Row row : rows) {
				// Skips header in CSV
				if (!first) {
					first = true;
					continue;
				}

				final var values = row.getValues();
				final var ipv4 = values.get(0);
				final var exportDNS = values.get(1);
				final var hostName = values.get(2);
				final var subzoneName = values.get(3);
				final var siteName = values.get(4);

				context.putInfo("Create/Update " + ipv4 + " in " + siteName + " with hostName " + hostName);
				final var networkSite = networkEnvironmentFunctions.GetSite(siteName);
				if (networkSite == null) {
					context.putError("Site " + siteName + " not found");
					continue;
				}

				final var networkSiteFunctions = networkSite.extension(INetworkSiteFunctions.class);
				final var subZone = networkSiteFunctions.GetNetworkSubZone(subzoneName);
				if (subZone == null) {
					context.putError("Subzone " + subzoneName + " not found");
					continue;
				}

				final var abstractHost = topologyEnvironmentFunctions.GetAbstractHost(siteName, hostName);
				if (abstractHost == null) {
					context.putError("AbtractHost " + hostName + " not found");
					continue;
				}

				final var ip4 = networkEnvironmentFunctions.GetIP(ipv4);
				if (ip4 == null) {
					context.putError("IP " + ip4 + " not found");
					continue;
				}

				final var hostNodeObject = Update.createAndInitializeResource(
						context.getWriteJobExecutor(), context.getPackage(), NetworkPackage.NetworkHostNode,
						subZone.getResource(), SpecPackage.AbstractPhysicalNetwork_nodes, IStatementPosition.AT_END);

				Update.createOrModifyStatement(context.getWriteJobExecutor(), context.getPackage(), hostNodeObject,
						NetworkPackage.NetworkHostNode_host, abstractHost.getResource());

				Update.createOrModifyStatement(context.getWriteJobExecutor(), context.getPackage(), hostNodeObject,
						SpecPackage.AbstractNetworkNode_iPv4_aE_D, ip4.getResource());

				Update.createOrModifyStatement(context.getWriteJobExecutor(), context.getPackage(), hostNodeObject,
						SpecPackage.AbstractNetworkNode_exportDNSRecord,
						LiteralUtil.create(Boolean.parseBoolean(exportDNS)));

				context.incrementCreateCount();
			}
		} catch (final Exception e) {
			final var sw = new StringWriter();
			final var pw = new PrintWriter(sw);
			e.printStackTrace(pw);

			context.putError(e.toString());
			context.putError(sw.toString());
		}

	}

}
