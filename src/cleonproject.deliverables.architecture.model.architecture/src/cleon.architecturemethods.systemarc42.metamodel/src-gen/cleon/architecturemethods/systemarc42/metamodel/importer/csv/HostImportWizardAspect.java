package cleon.architecturemethods.systemarc42.metamodel.importer.csv;

import java.io.IOException;
import java.io.InputStream;
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
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.ITopologyEnvironmentFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopology;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopologyEnvironment;
import cleon.architecturemethods.systemarc42.metamodel.spec.javamodel.ISystemArc42Document;
import cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage;

public class HostImportWizardAspect implements IGenericImportWizardAspect {
	private final String MBS_HOST = "MBSHost";
	private final String VIRTUAL_IP = "VirtualIP";

	private ch.actifsource.core.Resource createMBSHost(final IImportContext context, final String bbu,
			final IRN rnObject) {

		final ch.actifsource.core.Resource hostObject = Update.createAndInitializeResource(
				context.getWriteJobExecutor(), context.getPackage(), TopologyPackage.MBSHost, rnObject.getResource(),
				TopologyPackage.AbstractSiteWithHosts_hosts, IStatementPosition.AT_END);

		if (bbu.equals("A")) {
			Update.createStatement(context.getWriteJobExecutor(), context.getPackage(), hostObject,
					TopologyPackage.MBSHost_bbu, TopologyPackage.Location_A);
		}

		if (bbu.equals("B")) {
			Update.createStatement(context.getWriteJobExecutor(), context.getPackage(), hostObject,
					TopologyPackage.MBSHost_bbu, TopologyPackage.Location_B);
		}
		return hostObject;
	}

	private ch.actifsource.core.Resource createVirtualIP(final IImportContext context, final IRN rnObject) {
		return Update.createAndInitializeResource(context.getWriteJobExecutor(), context.getPackage(),
				TopologyPackage.VirtualIP, rnObject.getResource(), TopologyPackage.AbstractSiteWithHosts_hosts,
				IStatementPosition.AT_END);
	}

	@Override
	public void importFile(final IImportContext context, final InputStream inputStream) {

		final ITypeSystem typeSystem = TypeSystem.create(context.getWriteJobExecutor());
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		final ISystemArc42Document arc42Document = resourceRepository.getResource(ISystemArc42Document.class,
				context.getResouce());
		final ISystemArc42DocumentFunctions arc42DocumentFunctions = arc42Document
				.extension(ISystemArc42DocumentFunctions.class);
		final ITopology topology = arc42DocumentFunctions.Topology();
		final ITopologyEnvironment topologyEnvironment = topology.selectTopologyEnvironment().values().stream()
				.findFirst().get();
		final ITopologyEnvironmentFunctions functions = topologyEnvironment
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
				final String hostType = values.get(0);
				// final String environment = values.get(1);
				final String systemConfigurationName = values.get(2);
				final ISystemConfiguration systemConfiguration = arc42DocumentFunctions
						.GetSystemConfiguration(systemConfigurationName);
				if (systemConfiguration == null) {
					context.putError("SystemConfiguration " + systemConfigurationName + " has not been found");
					continue;
				}

				final String number = values.get(3);
				final String bbu = values.get(4);
				final String description = values.get(5);
				final String rnName = values.get(6);
				final String overrideOwner = values.get(7);

				context.putInfo("Create/Update " + hostType + " in " + rnName);
				final IRN rnObject = functions.GetRN(rnName);
				if (rnObject != null) {
					ch.actifsource.core.Resource hostObject = null;
					if (hostType.equalsIgnoreCase(MBS_HOST)) {
						hostObject = createMBSHost(context, bbu, rnObject);
					} else if (hostType.equalsIgnoreCase(VIRTUAL_IP)) {
						hostObject = createVirtualIP(context, rnObject);
					}

					if (hostObject != null) {
						Update.createStatement(context.getWriteJobExecutor(), context.getPackage(), hostObject,
								TopologyPackage.AbstractHost_instanceOf, systemConfiguration.getResource());
						Update.createStatement(context.getWriteJobExecutor(), context.getPackage(), hostObject,
								TopologyPackage.AbstractNumberedHost_number,
								LiteralUtil.create(Integer.valueOf(number)));
						Update.createStatement(context.getWriteJobExecutor(), context.getPackage(), hostObject,
								DescriptionsPackage.SimpleDescription_descriptions, LiteralUtil.create(description));

						if (overrideOwner.equalsIgnoreCase("null")) {
							Update.createStatement(context.getWriteJobExecutor(), context.getPackage(), hostObject,
									TopologyPackage.AbstractHost_overrideOwner, LiteralUtil.create(""));
						} else {
							Update.createStatement(context.getWriteJobExecutor(), context.getPackage(), hostObject,
									TopologyPackage.AbstractHost_overrideOwner, LiteralUtil.create(overrideOwner));
						}

						context.incrementCreateCount();
					}
				}
			}
		} catch (final IOException e) {
			context.putError(e.toString());
		}
	}
}
