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
import ch.actifsource.ui.wizard.importer.IImportContext;
import ch.actifsource.ui.wizard.importer.aspect.IGenericImportWizardAspect;
import ch.actifsource.util.csv.CSVParser;
import ch.actifsource.util.csv.CSVParser.Row;
import cleon.architecturemethods.systemarc42.metamodel.spec.FunctionSpace_SystemArc42.ISystemArc42DocumentFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.FunctionSpace_Network.INetworkEnvironmentFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.FunctionSpace_Network.INetworkSiteFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkConcept;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkEnvironment;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite;
import cleon.architecturemethods.systemarc42.metamodel.spec.javamodel.ISystemArc42Document;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask;
import cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone;

public class NetworkImportWizardAspect implements IGenericImportWizardAspect {

	@Override
	public void importFile(final IImportContext context, final InputStream inputStream) {

		final ITypeSystem typeSystem = TypeSystem.create(context.getWriteJobExecutor());
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		final ISystemArc42Document arc42Document = resourceRepository.getResource(ISystemArc42Document.class,
				context.getResouce());
		final ISystemArc42DocumentFunctions arc42DocumentFunctions = arc42Document
				.extension(ISystemArc42DocumentFunctions.class);
		final INetworkConcept networkConcept = arc42DocumentFunctions.Network();
		final INetworkEnvironment networkEnvironment = networkConcept.selectNetworkEnvironment().values().stream()
				.findFirst().get();
		final INetworkEnvironmentFunctions functions = networkEnvironment.extension(INetworkEnvironmentFunctions.class);

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
				final String subzoneName = values.get(0);
				final String siteName = values.get(1);
				final String cidrName = values.get(2);
				final String[] splitCidrName = cidrName.split("/");
				if (splitCidrName.length != 2) {
					context.putError("Cidr " + cidrName + " has a length of " + splitCidrName.length);
					continue;
				}
				final String ipName = splitCidrName[0];
				final String mask = splitCidrName[1];

				context.putInfo("Create/Update " + subzoneName + " in " + siteName + " with cidr " + cidrName);
				final INetworkSite networkSite = functions.GetSite(siteName);
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
				IIPv4_Mask cidr = null;
				for (final IIPv4_Mask maskObj : subZone.selectCidr()) {
					final String ip = maskObj.selectIPv4();
					if (ipName.equals(ip)) {
						cidr = maskObj;
					}
				}

				if (cidr == null) {
					final ch.actifsource.core.Resource cidrObject = Update.createAndInitializeResource(
							context.getWriteJobExecutor(), context.getPackage(), Ipv4Package.IPv4_aE_Mask,
							subZone.getResource(), Ipv4Package.IPv4_aE_Mask_aE_Aware_cidr, IStatementPosition.AT_END);

					Update.createStatement(context.getWriteJobExecutor(), context.getPackage(), cidrObject,
							Ipv4Package.IPv4_aE_Address_aE_Aware_iPv4, LiteralUtil.create(ipName));

					Update.createOrModifyStatement(context.getWriteJobExecutor(), context.getPackage(), cidrObject,
							Ipv4Package.IPv4_aE_Mask_mask, LiteralUtil.create(Integer.valueOf(mask)));

					context.incrementCreateCount();
				}
			}
		} catch (final IOException e) {
			context.putError(e.toString());
		}

	}

}
