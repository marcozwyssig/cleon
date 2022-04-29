package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel;

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
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.ProcedurePackage;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.FunctionSpace_Procedure.IDeploymentProcedureConceptFunctions;

public class DeploymentProcedureConceptValidatorAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList) {
		final ITypeSystem typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		final IDeploymentProcedureConcept deploymentProcedureConcept = resourceRepository
				.getResource(IDeploymentProcedureConcept.class, validationContext.getResource());

		final var completeList = new HashMap<IDeploymentProcedureStage, List<ISystemConfiguration>>();
		final var buildingCmps = deploymentProcedureConcept.extension(IDeploymentProcedureConceptFunctions.class)
				.OnlyBuildSystemConfigurationsForInstallation();

		for (var stage : deploymentProcedureConcept.selectDeploymentStages()) {
			completeList.put(stage, new ArrayList<ISystemConfiguration>(buildingCmps));
		}

		for (var sysCfg : buildingCmps) {
			for (var stage : deploymentProcedureConcept.selectDeploymentStages()) {
				int count = 0;
				for (var order : deploymentProcedureConcept.selectDeploymentOrder()) {
					if (order.selectStages().contains(stage) && order.selectAffectedCmp().contains(sysCfg)) {
						count++;
					}
				}

				int valueToCheck = 1;
				final var usageValue = stage.selectPhaseUsageCountExceptions().getOrDefault(sysCfg.getResource(), null);
				if( usageValue != null ) {
					valueToCheck = usageValue.selectCount();
				}
				
				if (count > valueToCheck) {
					validationList.add(new PredicateInconsistency(validationContext.getPackage(),
							deploymentProcedureConcept.getResource(),
							ProcedurePackage.DeploymentProcedureConcept_deploymentOrder,
							"component "
									+ Select.simpleName(validationContext.getReadJobExecutor(), sysCfg.getResource())
									+ " is used multiple times (" + count + ") for stage "
									+ Select.simpleName(validationContext.getReadJobExecutor(), stage.getResource())));
				}
			}
		}

		for (var order : deploymentProcedureConcept.selectDeploymentOrder()) {
			for (var stage : order.selectStages()) {
				var list = completeList.get(stage);
				list.removeAll(order.selectAffectedCmp());
			}
		}

		for (var stage : completeList.keySet()) {
			for (var syscfg : completeList.get(stage)) {
				validationList.add(new PredicateInconsistency(validationContext.getPackage(),
						deploymentProcedureConcept.getResource(),
						ProcedurePackage.DeploymentProcedureConcept_deploymentOrder,
						"stage " + Select.simpleName(validationContext.getReadJobExecutor(), stage.getResource())
								+ " is missing for "
								+ Select.simpleName(validationContext.getReadJobExecutor(), syscfg.getResource())));
			}
		}
	}
}