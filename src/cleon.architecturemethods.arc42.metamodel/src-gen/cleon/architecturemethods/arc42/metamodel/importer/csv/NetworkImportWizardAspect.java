package cleon.architecturemethods.arc42.metamodel.importer.csv;

import java.io.IOException;
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
import cleon.architecturemethods.arc42.metamodel.spec.FunctionSpace_SystemArc42.ISystemArc42DocumentFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.FunctionSpace_Network.INetworkEnvironmentFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.FunctionSpace_Network.INetworkSiteFunctions;
import cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask;

public class NetworkImportWizardAspect implements IGenericImportWizardAspect {

	@Override
	public void importFile(final IImportContext context, final InputStream inputStream) {

		final var typeSystem = TypeSystem.create(context.getWriteJobExecutor());
		final var resourceRepository = typeSystem.getResourceRepository();
		final var arc42Document = resourceRepository.getResource(ISystemArc42Document.class,
				context.getResouce());
		final var arc42DocumentFunctions = arc42Document
				.extension(ISystemArc42DocumentFunctions.class);
		final var networkConcept = arc42DocumentFunctions.Network();
		final var networkEnvironment = networkConcept.selectNetworkEnvironment().values().stream()
				.findFirst().get();
		final var functions = networkEnvironment.extension(INetworkEnvironmentFunctions.class);

		final var parser = new CSVParser(';', CSVParser.RFC_QUOTE);
		try {
			var first = false;
			final var rows = parser.read(inputStream);
			for (final Row row : rows) {
				// Skips header in CSV
				if (!first) {
					first = true;
					continue;
				}

				final var values = row.getValues();
				final var subzoneName = values.get(0);
				final var siteName = values.get(1);
				final var cidrName = values.get(2);
				final var splitCidrName = cidrName.split("/");
				if (splitCidrName.length != 2) {
					context.putError("Cidr " + cidrName + " has a length of " + splitCidrName.length);
					continue;
				}
				final var ipName = splitCidrName[0];
				final var mask = splitCidrName[1];

				context.putInfo("Create/Update " + subzoneName + " in " + siteName + " with cidr " + cidrName);
				final var networkSite = functions.GetSite(siteName);
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
				IIPv4_Mask cidr = null;
				for (final var maskObj : subZone.selectCidrs()) {
					final var ip = maskObj.selectIPv4();
					if (ipName.equals(ip)) {
						cidr = maskObj;
					}
				}

				if (cidr == null) {
					final var cidrObject = Update.createAndInitializeResource(
							context.getWriteJobExecutor(), context.getPackage(), Ipv4Package.IPv4_aE_Mask,
							subZone.getResource(), Ipv4Package.IPv4_aE_Mask_aE_Aware_cidrs, IStatementPosition.AT_END);

					Update.createStatement(context.getWriteJobExecutor(), context.getPackage(), cidrObject,
							Ipv4Package.IPv4_aE_Address_aE_Aware_iPv4, LiteralUtil.create(ipName));

					Update.createOrModifyStatement(context.getWriteJobExecutor(), context.getPackage(), cidrObject,
							Ipv4Package.IPv4_aE_Mask_mask, LiteralUtil.create(Integer.parseInt(mask)));

					context.incrementCreateCount();
				}
			}
		} catch (final IOException e) {
			final var sw = new StringWriter();
			final var pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			final var sStackTrace = sw.toString(); // stack trace as a string


			context.putError(e.toString() + " Stracktrace: " + sStackTrace);
		}

	}

}
