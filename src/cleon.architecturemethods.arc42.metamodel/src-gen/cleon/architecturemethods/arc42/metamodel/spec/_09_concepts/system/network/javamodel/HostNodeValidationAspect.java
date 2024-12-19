package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel;

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
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleResourceInconsistency;
import ch.actifsource.core.validation.quickfix.AbstractQuickFix;
import ch.actifsource.util.inconsistency.InconsistencyType;
import ch.actifsource.util.log.Logger;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.FunctionSpace_SystemConfiguration.ISystemConfigurationFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.FunctionSpace_Network.INetworkHostNodeFunctions;
import cleon.modelinglanguages.network.metamodel.spec.SpecPackage;

public class HostNodeValidationAspect implements IResourceValidationAspect {

    private static final int LOG_THRESHOLD_MS = 100;

    @Override
    public void validate(final ValidationContext context, final List<IResourceInconsistency> inconsistencyList) {
        final var start = Instant.now();
        try {
            final var typeSystem = TypeSystem.create(context.getReadJobExecutor());
            final var resourceRepository = typeSystem.getResourceRepository();
            final var hostNode = resourceRepository.getResource(INetworkHostNode.class, context.getResource());
            final var hostNodeFunctions = hostNode.extension(INetworkHostNodeFunctions.class);
            final var hostNodes = hostNodeFunctions.AllNetworkHostNodes();

            final var dnsExportCount = hostNodes.stream()
                .filter(host -> host.selectExportDNSRecord() == null || host.selectExportDNSRecord())
                .count();

            if (dnsExportCount > 1) {
                handleExcessiveDNSExports(context, inconsistencyList, hostNode, dnsExportCount);
            } else {
                validateDNSRecordExport(context, inconsistencyList, hostNodeFunctions, hostNode);
            }
        } finally {
            logExecutionTime(start);
        }
    }

    private void handleExcessiveDNSExports(final ValidationContext context,
            final List<IResourceInconsistency> inconsistencyList,
            final INetworkHostNode hostNode,
            final long count) {
		final var errorMessage = String.format(
				"The host node '%s' has too many DNS exports configured (total: %d). Only one DNS export is allowed per network.",
				Select.simpleName(context.getReadJobExecutor(), hostNode.selectHost().getResource()), count);
		
		inconsistencyList.add(new PredicateInconsistency(context.getPackage(), context.getResource(),
		SpecPackage.AbstractPhysicalNetwork_nodes, errorMessage));
    }

    private void validateDNSRecordExport(final ValidationContext context,
            final List<IResourceInconsistency> inconsistencyList,
            final INetworkHostNodeFunctions hostNodeFunctions,
            final INetworkHostNode hostNode) {
		final var systemConfigurationFunction = hostNode.selectHost().selectInstanceOf()
		.extension(ISystemConfigurationFunctions.class);
		
		if (hostNodeFunctions.DNSRecordSet() && !systemConfigurationFunction.AllowDNSRecordExport()) {
			final var errorMessage = "The system configuration does not permit exporting DNS records. Please disable DNS record export for this host node.";
			final var quickfix = createDNSRecordExportQuickFix(context);			
			inconsistencyList.add(new SingleResourceInconsistency(context.getPackage(), context.getResource(), IResourceInconsistency.NodeRole.Object, errorMessage, InconsistencyType.Error, quickfix));
		}
    }
    
    private AbstractQuickFix createDNSRecordExportQuickFix(final ValidationContext context) {
        return new AbstractQuickFix("Set export DNS record to false", "", () -> true) {
            @Override
            protected void doApply(IModifiable modifiable) {
                Update.createOrModifyStatement(modifiable, context.getPackage(), context.getResource(),
                        SpecPackage.AbstractNetworkNode_exportDNSRecord, LiteralUtil.create(false));
            }
        };
    }

    private void logExecutionTime(final Instant start) {
    	final var elapsed = Duration.between(start, Instant.now()).toMillis();
        if (elapsed > LOG_THRESHOLD_MS) {
            Logger.instance().logInfo(String.format("Validation time for %s took %d ms",
                    this.getClass().getSimpleName(), elapsed));
        }
    }
}