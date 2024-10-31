package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ch.actifsource.core.Resource;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.SubnetUtils;

public class AbstractPhysicalNetworkValidatorAspect implements IResourceValidationAspect {
	private final int LOW = 32;

	@Override
	public void validate(final ValidationContext validationContext, final List<IResourceInconsistency> validationList) {
		final var typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
		final var resourceRepository = typeSystem.getResourceRepository();
		final var abstractPhysicalNetwork = resourceRepository
				.getResource(IAbstractPhysicalNetwork.class, validationContext.getResource());

		validate(validationContext, validationList, abstractPhysicalNetwork);
	}

	private void validate(final ValidationContext validationContext, final List<IResourceInconsistency> validationList,
			final IAbstractPhysicalNetwork abstractPhysicalNetwork) {
		final var start = Instant.now();
		try {

			final java.util.Map<Resource, ? extends IAbstractNetworkNode> nodeMap = abstractPhysicalNetwork.selectNodes();
			if (nodeMap == null) {
				return;
			}

			final List<? extends IIPv4_Mask> cidrs = abstractPhysicalNetwork.selectCidrs();
			final Collection<? extends IAbstractNetworkNode> nodes = nodeMap.values();
			final var toFixedList = new ArrayList<IAbstractNetworkNode>();
			for (final IAbstractNetworkNode node : nodes) {
				var isInRange = false;
				for (final IIPv4_Mask cidr : cidrs) {
					final var ip = Select.simpleName(validationContext.getReadJobExecutor(),
							node.selectIp().getResource());
					if (cidr.selectMask() == LOW) {
						isInRange = cidr.selectIPv4().equals(ip);

					} else {
						final var subnet = new SubnetUtils(
								Select.simpleName(validationContext.getReadJobExecutor(), cidr.getResource()));
						isInRange = subnet.getInfo().isInRange(ip);
					}
					if (isInRange) {
						break;
					}
				}
				if (!isInRange) {
					toFixedList.add(node);
				}
			}

			if (!toFixedList.isEmpty()) {

				// Add quick fix
				final var fixMissingIP = new FixIPAddressQuickFix(abstractPhysicalNetwork, toFixedList,
						() -> true);

				for (final IAbstractNetworkNode node : toFixedList) {
					final var ip = Select.simpleName(validationContext.getReadJobExecutor(),
							node.selectIp().getResource());

					final var nodeNetwork = Select.relationStatementOrNull(
							validationContext.getReadJobExecutor(),
							cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractPhysicalNetwork_nodes,
							abstractPhysicalNetwork.getResource());

					final var message = String.format("IP address %s is valid and can maybe be moved", ip);
					validationList.add(new SingleStatementInconsistency(nodeNetwork, message, fixMissingIP));
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
