package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency.NodeRole;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleResourceInconsistency;
import ch.actifsource.core.validation.quickfix.AbstractQuickFix;
import ch.actifsource.util.inconsistency.InconsistencyType;
import ch.actifsource.util.log.Logger;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.FunctionSpace_SystemArc42_BuildingBlockView.ISystemConfigurationFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.FunctionSpace_Network.INetworkHostNodeFunctions;
import cleon.modelinglanguages.network.metamodel.spec.SpecPackage;

public class HostNodeValidationAspect implements IResourceValidationAspect {

	@Override
	public void validate(final ValidationContext context, final List<IResourceInconsistency> inconsistencyList) {
		final var start = Instant.now();
		try {
			final var typeSystem = TypeSystem.create(context.getReadJobExecutor());
			final var resourceRepository = typeSystem.getResourceRepository();
			final var hostNode = resourceRepository.getResource(INetworkHostNode.class, context.getResource());
			final var hostNodeFunctions = hostNode.extension(INetworkHostNodeFunctions.class);
			final var hostNodes = hostNodeFunctions.AllNetworkHostNodes();
			var count = 0;
			for (final var host : hostNodes) {
				if (host.selectExportDNSRecord() == null || host.selectExportDNSRecord().booleanValue()) {
					++count;
				}
			}
			if (count > 1) {
				final var errormessage = String.format("%1$s: to many exports (total %2$d)",
						Select.simpleName(context.getReadJobExecutor(), hostNode.selectHost().getResource()), count);
				inconsistencyList.add(new PredicateInconsistency(context.getPackage(), context.getResource(),
						SpecPackage.AbstractPhysicalNetwork_nodes, errormessage));
			} else {
				final var systemConfigurationFunction = hostNode.selectHost().selectInstanceOf()
						.extension(ISystemConfigurationFunctions.class);


				if ( hostNodeFunctions.DNSRecordSet() && !systemConfigurationFunction.AllowDNSRecordExport()) {
					final var errormessage = "Exporting DNS Records is not allowed. Please disable DNS record export.";

					final AbstractQuickFix quickfix = new AbstractQuickFix("Set export DNS record to false", "", () -> true) {

						@Override
						protected void doApply(IModifiable modifiable) {
							Update.createOrModifyStatement(modifiable, context.getPackage(), context.getResource(), SpecPackage.AbstractNetworkNode_exportDNSRecord, LiteralUtil.create(false));
						}
					};

					// final var attributeRelation = Select.statementForAttributeOrNull(context.getReadJobExecutor(),
					// SpecPackage.AbstractNetworkNode_exportDNSRecord,
					// context.getResource());
					inconsistencyList.add(new SingleResourceInconsistency(context.getPackage(), context.getResource(), NodeRole.Object, errormessage, InconsistencyType.Error, quickfix ));
					//inconsistencyList.add(new SingleStatementInconsistency(attributeRelation, errormessage, quickfix));
				}
			}
		} finally {
			final var finish = Instant.now();
			final var timeElapsed = Duration.between(start, finish).toMillis();
			if( timeElapsed > 100 ) {
				Logger.instance().logInfo(String.format("Validation time for %s took %d ms", this.getClass().getSimpleName(), timeElapsed));
			}

		}
	}
}