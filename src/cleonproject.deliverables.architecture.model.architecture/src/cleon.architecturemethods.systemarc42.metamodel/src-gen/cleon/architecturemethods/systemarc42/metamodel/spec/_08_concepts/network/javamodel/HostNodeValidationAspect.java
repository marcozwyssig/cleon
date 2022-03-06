package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel;

import java.util.List;

import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.core.validation.quickfix.AbstractQuickFix;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.FunctionSpace_SystemArc42_BuildingBlockView.ISystemConfigurationFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.FunctionSpace_Network.IHostNodeFunctions;
import cleon.modelinglanguages.network.metamodel.spec.SpecPackage;

public class HostNodeValidationAspect implements IResourceValidationAspect {

	@Override
	public void validate(final ValidationContext context, final List<IResourceInconsistency> inconsistencyList) {
		final var typeSystem = TypeSystem.create(context.getReadJobExecutor());
		final var resourceRepository = typeSystem.getResourceRepository();
		final var hostNode = resourceRepository.getResource(IHostNode.class, context.getResource());
		final var hostNodeFunctions = hostNode.extension(IHostNodeFunctions.class);
		final var hostNodes = hostNodeFunctions.AllHostNodes();
		var count = 0;
		for (final IHostNode host : hostNodes) {
			if (host.selectExportDNSRecord() == null || host.selectExportDNSRecord().booleanValue()) {
				++count;
			}
		}
		if (count > 1) {
			final var errormessage = String.format("%1$s: to many exports (total %2$d)",
					Select.simpleName(context.getReadJobExecutor(), hostNode.selectHost().getResource()), count);
			inconsistencyList.add(new PredicateInconsistency(context.getPackage(), context.getResource(),
					SpecPackage.AbstractPhysicalNetwork_nodes, errormessage));
		}

		final var systemConfigurationFunction = hostNode.selectHost().selectInstanceOf()
				.extension(ISystemConfigurationFunctions.class);
		if (!(hostNodeFunctions.DNSRecordSet().equals(systemConfigurationFunction.AllowDNSRecordExport()))) {
			final var errormessage = "Exporting DNS Records is not allowed. Please disable DNS record export.";

			final AbstractQuickFix quickfix = new AbstractQuickFix("Set export DNS record to false", "", () -> true) {

				@Override
				protected void doApply(IModifiable modifiable) {
					Update.createOrModifyStatement(modifiable, context.getPackage(), context.getResource(), SpecPackage.AbstractNetworkNode_exportDNSRecord, LiteralUtil.create(false));
				}

			};

			final var attributeRelation = Select.statementForAttributeOrNull(context.getReadJobExecutor(),
					SpecPackage.AbstractNetworkNode_exportDNSRecord,
					context.getResource());
			inconsistencyList.add(new SingleStatementInconsistency(attributeRelation, errormessage, quickfix));

		}

	}
}