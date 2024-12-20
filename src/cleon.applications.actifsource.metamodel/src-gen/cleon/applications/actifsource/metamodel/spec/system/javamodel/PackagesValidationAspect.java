package cleon.applications.actifsource.metamodel.spec.system.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

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
import ch.actifsource.util.log.Logger;
import cleon.applications.actifsource.metamodel.spec.system.SystemPackage;

public class PackagesValidationAspect implements IResourceValidationAspect {
    private static final int LOG_THRESHOLD_MS = 100;
    
    @Override
    public void validate(final ValidationContext validationContext, final List<IResourceInconsistency> inconsistencies) {
    	final var start = Instant.now();
    	try {
            final var typeSystem = validationContext.getTypeSystem();
            final var rootPackageName = getRootPackageName(validationContext);

            final Set<String> allPackageNames = new HashSet<>();
            for (final INode pkg : AllPackagesFunction.getPackages(typeSystem)) {
                final String packageName = LiteralUtil.getStringValue(pkg);
                if (packageName.startsWith(rootPackageName)) {
                    allPackageNames.add(packageName);
                }
            }

            final var packagesNodes = getPackagesNodes(validationContext);
            validatePackages(validationContext, inconsistencies, allPackageNames, packagesNodes);    		
        } finally {
            logExecutionTime(start);
        }

    }
    
    private void logExecutionTime(final Instant start) {
    	final var elapsed = Duration.between(start, Instant.now()).toMillis();
        if (elapsed > LOG_THRESHOLD_MS) {
            Logger.instance().logInfo(String.format("Validation time for %s took %d ms",
                    this.getClass().getSimpleName(), elapsed));
        }
    }    

    private String getRootPackageName(final ValidationContext validationContext) {
        final var rootPackages = EclipseEcosystem.selectToMeRootPackages(getPackagesNodes(validationContext));
        return (rootPackages.selectName() + ".").toLowerCase();
    }

    private IPackages getPackagesNodes(final ValidationContext validationContext) {
        return validationContext.getTypeSystem()
                .getResourceRepository()
                .getResource(IPackages.class, validationContext.getResource());
    }

    private void validatePackages(final ValidationContext validationContext,
                                  final List<IResourceInconsistency> inconsistencies,
                                  final Set<String> allPackageNames,
                                  final IPackages packagesNodes) {
        final var definedPackageNames = packagesNodes.selectPackages().stream()
                .map(IPackage::selectName)
                .collect(Collectors.toSet());

        // Check for missing packages
        allPackageNames.stream()
                .filter(packageName -> !definedPackageNames.contains(packageName))
                .forEach(packageName -> addMissingPackageInconsistency(validationContext, inconsistencies, packageName));

        // Check for excess packages
        definedPackageNames.stream()
                .filter(packageName -> !allPackageNames.contains(packageName))
                .forEach(packageName -> addExcessPackageInconsistency(validationContext, inconsistencies, packageName));
    }

    private void addMissingPackageInconsistency(final ValidationContext validationContext,
                                                final List<IResourceInconsistency> inconsistencies,
                                                final String packageName) {
        final var message = String.format("Package %s doesn't exist in packages", packageName);
        final var quickFix = createAddPackageQuickFix(validationContext, packageName);

        final var packageRelation = Select.statementForRelationOrNull(
                validationContext.getReadJobExecutor(),
                SystemPackage.EclipseEcosystem_rootPackages,
                EclipseEcosystem.selectToMeRootPackages(getPackagesNodes(validationContext)).getResource());

        Objects.requireNonNull(packageRelation);
        inconsistencies.add(new SingleStatementInconsistency(packageRelation, message, quickFix));
    }

    private AbstractQuickFix createAddPackageQuickFix(final ValidationContext validationContext, final String packageName) {
        return new AbstractQuickFix("Add package", "", () -> true) {
            @Override
            protected void doApply(final IModifiable modifiable) {
                final var packageNode = Update.createAndInitializeResource(modifiable,
                        validationContext.getPackage(), SystemPackage.Package, validationContext.getResource(),
                        SystemPackage.Packages_packages, IStatementPosition.AT_END);
                Update.createStatement(modifiable, validationContext.getPackage(), packageNode,
                        CorePackage.NamedResource_name, LiteralUtil.create(packageName));
            }
        };
    }

    private void addExcessPackageInconsistency(final ValidationContext validationContext,
                                               final List<IResourceInconsistency> inconsistencies,
                                               final String packageName) {
        final var message = String.format("Package %s doesn't exist in system. Remove package from the packages.", packageName);
        final var packageRelation = Select.statementOrNull(validationContext.getReadJobExecutor(),
                validationContext.getResource(), SystemPackage.Packages_packages, LiteralUtil.create(packageName));

        Objects.requireNonNull(packageRelation);
        inconsistencies.add(new SingleStatementInconsistency(packageRelation, message));
    }
}