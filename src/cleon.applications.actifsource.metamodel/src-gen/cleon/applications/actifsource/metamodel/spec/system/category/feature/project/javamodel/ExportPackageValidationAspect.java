package cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.core.validation.quickfix.AbstractQuickFix;
import ch.actifsource.util.log.Logger;
import cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage;

public class ExportPackageValidationAspect implements IResourceValidationAspect {

    private static final boolean ENABLE_LOGGING = true;
    private static final long CACHE_TTL_MS = 30000; // 30 seconds cache TTL
    
    private static class CachedPackageResult {
        final PackageCheckResult result;
        final long timestamp;

        CachedPackageResult(PackageCheckResult result) {
            this.result = result;
            this.timestamp = System.currentTimeMillis();
        }
        
        boolean isExpired() {
            return System.currentTimeMillis() - timestamp > CACHE_TTL_MS;
        }
    }
    
    private static final Map<String, CachedPackageResult> packageCache = new ConcurrentHashMap<>();

    private static void logInfo(String message) {
        if (ENABLE_LOGGING) {
            Logger.instance().logInfo(message);
        }
    }

    private static void logInfo(Supplier<String> messageSupplier) {
        if (ENABLE_LOGGING) {
            Logger.instance().logInfo(messageSupplier.get());
        }
    }

    private static void logWarning(String message) {
        if (ENABLE_LOGGING) {
            Logger.instance().logWarning(message);
        }
    }

    private static void logWarning(Supplier<String> messageSupplier) {
        if (ENABLE_LOGGING) {
            Logger.instance().logWarning(messageSupplier.get());
        }
    }

    private static void logError(String message) {
        if (ENABLE_LOGGING) {
            Logger.instance().logError(message);
        }
    }

    private static void logError(Supplier<String> messageSupplier) {
        if (ENABLE_LOGGING) {
            Logger.instance().logError(messageSupplier.get());
        }
    }

    private static void logDebug(String message) {
        if (ENABLE_LOGGING) {
            Logger.instance().logVerbose(message);
        }
    }

    private static void logDebug(Supplier<String> messageSupplier) {
        if (ENABLE_LOGGING) {
            Logger.instance().logVerbose(messageSupplier.get());
        }
    }

    private static class AddWithJavaModelQuickFix extends AbstractQuickFix {
        private final ValidationContext context;
        private final boolean withJavaModel;
        
        AddWithJavaModelQuickFix(ValidationContext context, boolean withJavaModel) {
            super("Set withJavaModel", 
                  String.format("Set withJavaModel to '%b'", withJavaModel), 
                  () -> true);
            this.context = Objects.requireNonNull(context);
            this.withJavaModel = withJavaModel;
        }
        
        @Override
        protected void doApply(final IModifiable modifiable) {
            Update.createOrModifyStatement(modifiable, context.getPackage(), context.getResource(), 
                ProjectPackage.ExportPackage_withJavaModel, LiteralUtil.create(withJavaModel));
        }
    }
    
    @Override
    public void validate(ValidationContext validationContext, List<IResourceInconsistency> inconsistencies) {
        final var exportPackage = validationContext.getTypeSystem()
                .getResourceRepository()
                .getResource(IExportPackage.class, validationContext.getResource());
        
        final var withJavaModel = exportPackage.selectWithJavaModel();
        if (withJavaModel == null) {
            return;  // Early exit
        }

        var classLoader = Thread.currentThread().getContextClassLoader();
        var packageName = Select.simpleName(validationContext.getReadJobExecutor(), exportPackage.getResource()) + ".javamodel";
        
        // Check package availability (uses internal cache)
        PackageCheckResult result = checkPackageAvailability(classLoader, packageName);
        
        if (!result.libraryAvailable) {
            logInfo(() -> String.format("Skipping validation for %s - library not available in classloader", packageName));
            return;
        }
        
        logInfo(() -> String.format("Validating package %s (found: %s)", packageName, result.packageExists));

        final var packageRelation = Select.statementForRelationOrNull(
                validationContext.getReadJobExecutor(),
                ProjectPackage.ExportPackage_withJavaModel,
                exportPackage.getResource());

        if (withJavaModel.booleanValue()) {
            // Case 1: withJavaModel is TRUE - package SHOULD exist
            if (!result.packageExists) {
                final var message = String.format("Package %s doesn't exist but withJavaModel is enabled", packageName);
                inconsistencies.add(new SingleStatementInconsistency(packageRelation, message, 
                    new AddWithJavaModelQuickFix(validationContext, false)));
            }
        } else {
            // Case 2: withJavaModel is FALSE - package SHOULD NOT exist
            if (result.packageExists) {
                final var message = String.format("Package %s exists but withJavaModel is disabled", packageName);
                inconsistencies.add(new SingleStatementInconsistency(packageRelation, message, 
                    new AddWithJavaModelQuickFix(validationContext, true)));
            }
        }
    }
    
    private record PackageCheckResult(boolean libraryAvailable, boolean packageExists) {}
    
    /**
     * Check package availability with time-based caching.
     */
    private PackageCheckResult checkPackageAvailability(ClassLoader classLoader, String packageName) {
        // Check cache first
        var cached = getCachedResult(packageName);
        if (cached != null) {
            return cached;
        }
        
        // Try strategies in order
        var result = checkAsResource(classLoader, packageName)
            .or(() -> checkDefinedPackage(classLoader, packageName))
            .or(() -> checkPackageInfo(classLoader, packageName))
            .or(() -> checkParentPackage(classLoader, packageName))
            .orElse(new PackageCheckResult(false, false));
        
        cacheResult(packageName, result);
        return result;
    }

    private Optional<PackageCheckResult> checkAsResource(ClassLoader classLoader, String packageName) {
        try {
            var packagePath = packageName.replace('.', '/') + "/";
            var url = classLoader.getResource(packagePath);
            if (url != null) {
                logDebug(() -> String.format("Package %s found as resource at %s", packageName, url));
                return Optional.of(new PackageCheckResult(true, true));
            }
        } catch (Exception e) {
            logError(() -> String.format("Error checking package path: %s, %s", packageName, e));
        }
        return Optional.empty();
    }

    private Optional<PackageCheckResult> checkDefinedPackage(ClassLoader classLoader, String packageName) {
        var pkg = classLoader.getDefinedPackage(packageName);
        if (pkg != null) {
            logDebug(() -> String.format("Package %s is already defined", packageName));
            return Optional.of(new PackageCheckResult(true, true));
        }
        return Optional.empty();
    }

    private Optional<PackageCheckResult> checkPackageInfo(ClassLoader classLoader, String packageName) {
        try {
            Class.forName(packageName + ".package-info", false, classLoader);
            logDebug(() -> String.format("Package %s loaded via package-info", packageName));
            return Optional.of(new PackageCheckResult(true, true));
        } catch (ClassNotFoundException e) {
            return Optional.empty();
        }
    }

    private Optional<PackageCheckResult> checkParentPackage(ClassLoader classLoader, String packageName) {
        var parentPackage = getParentPackage(packageName);
        if (parentPackage.isEmpty()) {
            return Optional.empty();
        }
        
        String parent = parentPackage.get();
        
        // Check parent cache first
        var parentCached = getCachedResult(parent);
        if (parentCached != null && parentCached.packageExists) {
            logDebug(() -> String.format("Parent package %s found, library available", parent));
            return Optional.of(new PackageCheckResult(true, false));
        }
        
        // Check parent existence
        return checkAsResource(classLoader, parent)
            .or(() -> checkDefinedPackage(classLoader, parent))
            .map(parentResult -> {
                if (parentResult.packageExists) {
                    cacheResult(parent, parentResult);
                    return new PackageCheckResult(true, false);
                }
                return null;
            });
    }

    private Optional<String> getParentPackage(String packageName) {
        int lastDot = packageName.lastIndexOf('.');
        return lastDot > 0 
            ? Optional.of(packageName.substring(0, lastDot))
            : Optional.empty();
    }
    
    private PackageCheckResult getCachedResult(String packageName) {
        var cached = packageCache.get(packageName);
        if (cached != null && !cached.isExpired()) {
            logInfo(() -> String.format("Cache hit for package %s (age: %dms)", 
                packageName, System.currentTimeMillis() - cached.timestamp));
            return cached.result;
        }
        return null;
    }

    private void cacheResult(String packageName, PackageCheckResult result) {
        packageCache.put(packageName, new CachedPackageResult(result));
        logDebug(() -> String.format("Cached result for %s: %s", packageName, result));
    }    
}