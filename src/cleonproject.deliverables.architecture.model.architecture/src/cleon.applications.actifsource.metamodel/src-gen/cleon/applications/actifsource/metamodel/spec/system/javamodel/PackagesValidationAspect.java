package cleon.applications.actifsource.metamodel.spec.system.javamodel;

import java.util.List;
import java.util.Objects;

import ch.actifsource.core.INode;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.template.typesystem.impl.AllPackagesFunction;
import cleon.applications.actifsource.metamodel.spec.system.SystemPackage;

public class PackagesValidationAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> inconsistencies) {
		final var typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
		final var dynamicResourceRepository = typeSystem.getResourceRepository();
		final var packages = AllPackagesFunction.getPackages(typeSystem);
		final var packagesNodes = dynamicResourceRepository.getResource(IPackages.class,
				validationContext.getResource());

		checkIfAllPackagesAreInPackageNode(validationContext, inconsistencies, packages, packagesNodes);
		checkIfPackageNodeAreNotInPackages(validationContext, inconsistencies, packages, packagesNodes);

	}

	private void checkIfAllPackagesAreInPackageNode(ValidationContext validationContext,
			List<IResourceInconsistency> inconsistencies, final INodeSet packages, final IPackages packagesNodes) {
		for (final INode _package : packages) {
			final var packageName = LiteralUtil.getStringValue(_package);
			final var match = packagesNodes.selectPackages().stream().map(IPackage::selectName)
					.anyMatch(x -> x.equals(packageName));
			if (!match) {
				final var message = String.format("Packages %s doesnt exist. Add the package to the packages.",
						packageName);
				final var packageRelation = Select.relationStatementOrNull(validationContext.getReadJobExecutor(),
						SystemPackage.Packages_packages, validationContext.getResource());
				Objects.requireNonNull(packageRelation);
				inconsistencies.add(new SingleStatementInconsistency(packageRelation, message));
			}
		}
	}

	private void checkIfPackageNodeAreNotInPackages(ValidationContext validationContext,
			List<IResourceInconsistency> inconsistencies, final INodeSet packages, final IPackages packagesNodes) {

		packagesNodes.selectPackages().stream().forEach(packageNode -> {
			final var match = packages.contains(LiteralUtil.create(packageNode.selectName()));
			if (!match) {
				final var message = String.format("Packages %s doesnt exist. Remove the package from the packages.",
						packageNode.selectName());
				final var packageRelation = Select.statementOrNull(validationContext.getReadJobExecutor(),
						validationContext.getResource(), SystemPackage.Packages_packages, packageNode.getResource());
				Objects.requireNonNull(packageRelation);
				inconsistencies.add(new SingleStatementInconsistency(packageRelation, message));
			}
		});
	}

}
