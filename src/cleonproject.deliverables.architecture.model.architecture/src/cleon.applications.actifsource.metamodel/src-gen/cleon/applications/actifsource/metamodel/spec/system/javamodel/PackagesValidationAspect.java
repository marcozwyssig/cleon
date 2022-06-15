package cleon.applications.actifsource.metamodel.spec.system.javamodel;

import java.util.List;
import java.util.Objects;

import ch.actifsource.core.CorePackage;
import ch.actifsource.core.INode;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.patch.IStatementPosition;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.core.validation.quickfix.AbstractQuickFix;
import ch.actifsource.template.typesystem.impl.AllPackagesFunction;
import cleon.applications.actifsource.metamodel.spec.system.SystemPackage;

public class PackagesValidationAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> inconsistencies) {
		final var typeSystem = validationContext.getTypeSystem();
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
				final var message = String.format("Package %s doesnt exist in packages", packageName);

				final var packageRelation = Select.statementForRelationOrNull(validationContext.getReadJobExecutor(),
						SystemPackage.EclipseEcosystem_rootPackages,
						EclipseEcosystem.selectToMeRootPackages(packagesNodes).getResource());

				final AbstractQuickFix quickfix = new AbstractQuickFix("Add package", "", () -> true) {

					@Override
					protected void doApply(IModifiable modifiable) {
						final var packageNode = Update.createAndInitializeResource(modifiable,
								validationContext.getPackage(), SystemPackage.Package, validationContext.getResource(),
								SystemPackage.Packages_packages, IStatementPosition.AT_END);
						Update.createStatement(modifiable, validationContext.getPackage(), packageNode,
								CorePackage.NamedResource_name, _package);
					}

				};

				inconsistencies.add(new SingleStatementInconsistency(packageRelation, message, quickfix));
			}
		}
	}

	private void checkIfPackageNodeAreNotInPackages(ValidationContext validationContext,
			List<IResourceInconsistency> inconsistencies, final INodeSet packages, final IPackages packagesNodes) {

		packagesNodes.selectPackages().stream().forEach(packageNode -> {
			final var match = packages.contains(LiteralUtil.create(packageNode.selectName()));
			if (!match) {
				final var message = String.format(
						"Packages %s doesnt exist in packages. Remove package %s from the packages.",
						packageNode.selectName(), packageNode.selectName());
				final var packageRelation = Select.statementOrNull(validationContext.getReadJobExecutor(),
						validationContext.getResource(), SystemPackage.Packages_packages, packageNode.getResource());
				Objects.requireNonNull(packageRelation);
				inconsistencies.add(new SingleStatementInconsistency(packageRelation, message));
			}
		});
	}

}
