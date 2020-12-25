package cleon.applications.actifsource.metamodel.spec.system.javamodel;

import ch.actifsource.core.CorePackage;
import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.AbstractInitializationAspect;
import ch.actifsource.core.patch.IStatementPosition;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.template.typesystem.impl.AllPackagesFunction;
import cleon.applications.actifsource.metamodel.spec.system.SystemPackage;

public class PackagesInitializationAspect extends AbstractInitializationAspect {

	@Override
	protected void initializeAggregatedResource(IModifiable modifiable, INode clazz, Package package_, INode owner,
			INode ownerRelation, INode newInstance) {
		final var typeSystem = TypeSystem.create(modifiable);
		final var packages = AllPackagesFunction.getPackages(typeSystem);
		for (final INode _package : packages) {
			final var packageNode = Update.createAndInitializeResource(modifiable, package_, SystemPackage.Package,
					newInstance, SystemPackage.Packages_packages, IStatementPosition.AT_END);
			Update.createStatement(modifiable, package_, packageNode, CorePackage.NamedResource_name, _package);
		}
	}

}
