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
import ch.actifsource.core.set.NodeSet;
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
		final var packagesNodes = getPackagesNodes(validationContext);
		final var rootPackageName = (EclipseEcosystem.selectToMeRootPackages(packagesNodes).selectName() + ".").toLowerCase();
		final var filterPackageNodes = new NodeSet();

		final var packages = AllPackagesFunction.getPackages(typeSystem);
		for( final var _package : packages) {
			final var packageName = LiteralUtil.getStringValue(_package);
			if( packageName.startsWith(rootPackageName)) {
				filterPackageNodes.add(_package);
			}
		}

		validatePackages(validationContext, inconsistencies, filterPackageNodes, packagesNodes);
	}

	private IPackages getPackagesNodes(ValidationContext validationContext) {
		final var dynamicResourceRepository = validationContext.getTypeSystem().getResourceRepository();
		return dynamicResourceRepository.getResource(IPackages.class, validationContext.getResource());
	}

	private void validatePackages(ValidationContext validationContext,
			List<IResourceInconsistency> inconsistencies,
			INodeSet packages, IPackages packagesNodes) {
		checkMissingPackages(validationContext, inconsistencies, packages, packagesNodes);
		checkExcessPackages(validationContext, inconsistencies, packages, packagesNodes);
	}

	private void checkMissingPackages(ValidationContext validationContext,
			List<IResourceInconsistency> inconsistencies,
			INodeSet packages, IPackages packagesNodes) {
		for (final INode _package : packages) {
			final var packageName = LiteralUtil.getStringValue(_package);
			if (!isPackageInNodes(packagesNodes, packageName)) {
				addMissingPackageInconsistency(validationContext, inconsistencies, _package, packagesNodes, packageName);
			}
		}
	}

	private void checkExcessPackages(ValidationContext validationContext,
			List<IResourceInconsistency> inconsistencies,
			INodeSet packages, IPackages packagesNodes) {
		packagesNodes.selectPackages().forEach(packageNode -> {
			final var packageName = packageNode.selectName();
			if (!packages.contains(LiteralUtil.create(packageName))) {
				addExcessPackageInconsistency(validationContext, inconsistencies, packageNode, packageName);
			}
		});
	}

	private boolean isPackageInNodes(IPackages packagesNodes, String packageName) {
		return packagesNodes.selectPackages().stream().map(IPackage::selectName).anyMatch(packageName::equals);
	}

	private void addMissingPackageInconsistency(ValidationContext validationContext,
			List<IResourceInconsistency> inconsistencies,
			INode packageNode, IPackages packagesNodes, String packageName) {
		final var message = String.format("Package %s doesn't exist in packages", packageName);
		final AbstractQuickFix quickfix = new AbstractQuickFix("Add package", "", () -> true) {
			@Override
			protected void doApply(IModifiable modifiable) {
				final var packageNode = Update.createAndInitializeResource(modifiable,
						validationContext.getPackage(), SystemPackage.Package, validationContext.getResource(),
						SystemPackage.Packages_packages, IStatementPosition.AT_END);
				Update.createStatement(modifiable, validationContext.getPackage(), packageNode,
						CorePackage.NamedResource_name, LiteralUtil.create(packageName));
			}

		};
		final var packageRelation = Select.statementForRelationOrNull(validationContext.getReadJobExecutor(),
				SystemPackage.EclipseEcosystem_rootPackages,
				EclipseEcosystem.selectToMeRootPackages(packagesNodes).getResource());

		Objects.requireNonNull(packageRelation);
		Objects.requireNonNull(message);
		Objects.requireNonNull(quickfix);
		inconsistencies.add(new SingleStatementInconsistency(packageRelation, message, quickfix));
	}

	private void addExcessPackageInconsistency(ValidationContext validationContext,
			List<IResourceInconsistency> inconsistencies,
			IPackage packageNode, String packageName) {
		final var message = String.format("Package %s doesn't exist in system. Remove package from the packages.", packageName);
		final var packageRelation = Select.statementOrNull(validationContext.getReadJobExecutor(),
				validationContext.getResource(), SystemPackage.Packages_packages, packageNode.getResource());
		Objects.requireNonNull(packageRelation);
		inconsistencies.add(new SingleStatementInconsistency(packageRelation, message));
	}

}
