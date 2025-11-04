package cleon.applications.actifsource.metamodel.spec.system.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
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
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.core.validation.quickfix.AbstractQuickFix;
import ch.actifsource.template.typesystem.impl.AllPackagesFunction;
import ch.actifsource.util.log.Logger;
import cleon.applications.actifsource.metamodel.spec.system.SystemPackage;

/**
 * Optimized package validation aspect with improved performance and modularity.
 * All functionality is contained within a single class using inner classes and private methods.
 */
public class PackagesValidationAspect implements IResourceValidationAspect {
    
    private static final int LOG_THRESHOLD_MS = 100;
    
    @Override
    public void validate(final ValidationContext validationContext, 
                        final List<IResourceInconsistency> inconsistencies) {
        final Instant start = Instant.now();
        try {
            performOptimizedValidation(validationContext, inconsistencies);
        } finally {
            logExecutionTimeIfSlow(start);
        }
    }
    
    /**
     * Main validation logic with optimized data collection and processing.
     */
    private void performOptimizedValidation(final ValidationContext validationContext,
                                           final List<IResourceInconsistency> inconsistencies) {
        // Collect all data in a single pass to minimize repository calls
        final var data = collectValidationData(validationContext);
        
        // Early exit if no validation needed
        if (data.isEmpty()) {
            return;
        }
        
        // Perform validation with pre-computed sets
        validateMissingPackages(validationContext, data, inconsistencies);
        validateExcessPackages(validationContext, data, inconsistencies);
    }
    
    /**
     * Collects all required data with minimal repository calls.
     * Performance optimized to reduce I/O operations.
     */
    private ValidationData collectValidationData(final ValidationContext validationContext) {
        // Single repository call - cached and reused
        final var packagesNodes = validationContext.getTypeSystem()
                .getResourceRepository()
                .getResource(IPackages.class, validationContext.getResource());
        
        // Compute root package name once
        final var rootPackageName = computeRootPackageName(packagesNodes);
        
        // Collect system packages with optimized filtering
        final var systemPackages = collectSystemPackages(
            validationContext.getTypeSystem(), 
            rootPackageName
        );
        
        // Collect defined packages once
        final var definedPackages = packagesNodes.selectPackages().stream()
                .map(IPackage::selectName)
                .collect(Collectors.toSet());
        
        return new ValidationData(packagesNodes, systemPackages, definedPackages);
    }
    
    /**
     * Computes root package name with single call to avoid redundancy.
     */
    private String computeRootPackageName(final IPackages packagesNodes) {
        final var rootPackages = EclipseEcosystem.selectToMeRootPackages(packagesNodes);
        return (rootPackages.selectName() + ".").toLowerCase();
    }
    
    /**
     * Collects system packages with early filtering for performance.
     */
    private Set<String> collectSystemPackages(final ITypeSystem typeSystem,
                                             final String rootPackageName) {
        // Pre-size the set for better performance
        final Set<String> packages = new HashSet<>(64);
        
        // Single iteration with early filtering
        for (final INode pkg : AllPackagesFunction.getPackages(typeSystem)) {
            final String packageName = LiteralUtil.getStringValue(pkg);
            if (packageName.startsWith(rootPackageName)) {
                packages.add(packageName);
            }
        }
        
        return packages;
    }
    
    /**
     * Validates missing packages with optimized set operations.
     */
    private void validateMissingPackages(final ValidationContext validationContext,
                                        final ValidationData data,
                                        final List<IResourceInconsistency> inconsistencies) {
        // Get the package relation once for all missing packages
        final var packageRelation = Select.statementForRelationOrNull(
            validationContext.getReadJobExecutor(),
            SystemPackage.EclipseEcosystem_rootPackages,
            EclipseEcosystem.selectToMeRootPackages(data.packagesNodes).getResource()
        );
        
        if (packageRelation == null) {
            return;
        }
        
        // Process missing packages using pre-computed set
        for (final var packageName : data.getMissingPackages()) {
            final var message = String.format("Package %s doesn't exist in packages", packageName);
            final var quickFix = new AddPackageQuickFix(validationContext, packageName);
            inconsistencies.add(new SingleStatementInconsistency(packageRelation, message, quickFix));
        }
    }
    
    /**
     * Validates excess packages efficiently.
     */
    private void validateExcessPackages(final ValidationContext validationContext,
                                       final ValidationData data,
                                       final List<IResourceInconsistency> inconsistencies) {
        // Process excess packages using pre-computed set
        for (final var packageName : data.getExcessPackages()) {
            final var message = String.format(
                "Package %s doesn't exist in system. Remove package from the packages.", 
                packageName
            );
            
            final var packageRelation = Select.statementOrNull(
                validationContext.getReadJobExecutor(),
                validationContext.getResource(), 
                SystemPackage.Packages_packages, 
                LiteralUtil.create(packageName)
            );
            
            if (packageRelation != null) {
                inconsistencies.add(new SingleStatementInconsistency(packageRelation, message));
            }
        }
    }
    
    /**
     * Logs execution time if it exceeds the threshold.
     */
    private void logExecutionTimeIfSlow(final Instant start) {
        final long elapsed = Duration.between(start, Instant.now()).toMillis();
        if (elapsed > LOG_THRESHOLD_MS) {
            Logger.instance().logInfo(
                String.format("Validation time for %s took %d ms",
                    this.getClass().getSimpleName(), elapsed)
            );
        }
    }
    
    /**
     * Optimized set difference operation.
     */
    private static Set<String> setDifference(final Set<String> set1, final Set<String> set2) {
        if (set1.isEmpty()) {
            return Collections.emptySet();
        }
        if (set2.isEmpty()) {
            return new HashSet<>(set1);
        }
        
        // Pre-size based on maximum possible size
        final Set<String> result = new HashSet<>(set1.size());
        for (final var element : set1) {
            if (!set2.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }
    
    /**
     * Immutable data container for validation.
     * Holds all data needed for validation to avoid redundant repository calls.
     */
    private static class ValidationData {
        private final IPackages packagesNodes;
        private final Set<String> systemPackageNames;
        private final Set<String> definedPackageNames;
        private final Set<String> missingPackages;
        private final Set<String> excessPackages;
        
        ValidationData(IPackages packagesNodes,
                      Set<String> systemPackageNames,
                      Set<String> definedPackageNames) {
            this.packagesNodes = packagesNodes;
            // Make sets unmodifiable for safety and performance
            this.systemPackageNames = Collections.unmodifiableSet(systemPackageNames);
            this.definedPackageNames = Collections.unmodifiableSet(definedPackageNames);
            // Pre-compute differences for performance
            this.missingPackages = setDifference(systemPackageNames, definedPackageNames);
            this.excessPackages = setDifference(definedPackageNames, systemPackageNames);
        }
        
        boolean isEmpty() {
            return systemPackageNames.isEmpty() && definedPackageNames.isEmpty();
        }
        
        Set<String> getMissingPackages() {
            return missingPackages;
        }
        
        Set<String> getExcessPackages() {
            return excessPackages;
        }
    }
    
    /**
     * Quick fix for adding missing packages.
     */
    private static class AddPackageQuickFix extends AbstractQuickFix {
        private final ValidationContext context;
        private final String packageName;
        
        AddPackageQuickFix(ValidationContext context, String packageName) {
            super("Add package", 
                  String.format("Add missing package '%s' to the package definition", packageName), 
                  () -> true);
            this.context = Objects.requireNonNull(context);
            this.packageName = Objects.requireNonNull(packageName);
        }
        
        @Override
        protected void doApply(final IModifiable modifiable) {
            // Create the package node
            final var packageNode = Update.createAndInitializeResource(
                modifiable,
                context.getPackage(),
                SystemPackage.Package,
                context.getResource(),
                SystemPackage.Packages_packages,
                IStatementPosition.AT_END
            );
            
            // Set the package name
            Update.createStatement(
                modifiable,
                context.getPackage(),
                packageNode,
                CorePackage.NamedResource_name,
                LiteralUtil.create(packageName)
            );
        }
    }
}