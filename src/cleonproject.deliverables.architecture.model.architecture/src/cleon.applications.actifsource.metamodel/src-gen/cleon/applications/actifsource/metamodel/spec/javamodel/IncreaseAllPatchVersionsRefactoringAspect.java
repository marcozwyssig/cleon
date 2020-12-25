package cleon.applications.actifsource.metamodel.spec.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.common.resources.metamodel.spec.versions.VersionsPackage;
import cleon.common.resources.metamodel.spec.versions.javamodel.ISemanticVersion;
import cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage;
import cleon.applications.actifsource.metamodel.spec.system.javamodel.IEclipseEcosystem;

public class IncreaseAllPatchVersionsRefactoringAspect extends AbstractAllInstancesRefactorerAspect {

	public IncreaseAllPatchVersionsRefactoringAspect() {
		super("1.0", 2016, 7, 5, "Increase patch version all feature building blocks", FeaturePackage.Feature);
	}

	@Override
	protected void refactor(IModifiable modifiable, Package paramPackage, INode paramINode) {
		
		ITypeSystem typeSystem = TypeSystem.create(modifiable);
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		IEclipseEcosystem zoo  = resourceRepository.getResource(IEclipseEcosystem.class, paramINode);
		ISemanticVersion version = zoo.selectVersion();
		int patch = version.selectPatch() + 1;
		try
		{
			Update.createOrModifyStatement(modifiable, paramPackage, version.getResource(), VersionsPackage.SemanticVersion_patch, LiteralUtil.create(patch));
		}
		catch(Exception e)
		{
			ch.actifsource.util.log.Logger.instance().logWarning(e);				
		}
	}	
}