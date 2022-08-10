package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.ProcedurePackage;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.FunctionSpace_Procedure.IDeploymentProcedureConceptFunctions;

public class DeploymentProcedureConceptValidatorAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList) {
		final var start = Instant.now();
		try {


			final var typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
			final var resourceRepository = typeSystem.getResourceRepository();
			final var deploymentProcedureConcept = resourceRepository
					.getResource(IDeploymentProcedureConcept.class, validationContext.getResource());

			final var completeList = new HashMap<IDeploymentProcedureStage, List<ISystemConfiguration>>();
			final var buildingCmps = deploymentProcedureConcept.extension(IDeploymentProcedureConceptFunctions.class)
					.OnlyBuildSystemConfigurationsForInstallation();

			for (final var stage : deploymentProcedureConcept.selectDeploymentStages()) {
				completeList.put(stage, new ArrayList<>(buildingCmps));
			}

			final var deploymentProcedureFunctions = deploymentProcedureConcept.extension(IDeploymentProcedureConceptFunctions.class);

			for (final var sysCfg : buildingCmps) {
				for (final var stage : deploymentProcedureConcept.selectDeploymentStages()) {
					var count = 0;
					for (final var order : deploymentProcedureFunctions.AllDeploymentProcedureOrder()) {
						if (order.selectStages().contains(stage) && order.selectAffectedCmp().contains(sysCfg)) {
							count++;
						}
					}

					var valueToCheck = 1;
					final var usageValue = stage.selectPhaseUsageCountExceptions().getOrDefault(sysCfg.getResource(), null);
					if( usageValue != null ) {
						valueToCheck = usageValue.selectCount();
					}

					if (count > valueToCheck) {
						validationList.add(new PredicateInconsistency(validationContext.getPackage(),
								deploymentProcedureConcept.getResource(),
								ProcedurePackage.DeploymentProcedureConcept_deploymentProcedureOrderGroup,
								"component "
										+ Select.simpleName(validationContext.getReadJobExecutor(), sysCfg.getResource())
										+ " is used multiple times (" + count + ") for stage "
										+ Select.simpleName(validationContext.getReadJobExecutor(), stage.getResource())));
					}
				}
			}

			for (final var order : deploymentProcedureFunctions.AllDeploymentProcedureOrder()) {
				for (final var stage : order.selectStages()) {
					final var list = completeList.get(stage);
					list.removeAll(order.selectAffectedCmp());
				}
			}

			for (final var stage : completeList.keySet()) {
				for (final var syscfg : completeList.get(stage)) {
					validationList.add(new PredicateInconsistency(validationContext.getPackage(),
							deploymentProcedureConcept.getResource(),
							ProcedurePackage.DeploymentProcedureConcept_deploymentProcedureOrderGroup,
							"stage " + Select.simpleName(validationContext.getReadJobExecutor(), stage.getResource())
							+ " is missing for "
							+ Select.simpleName(validationContext.getReadJobExecutor(), syscfg.getResource())));
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