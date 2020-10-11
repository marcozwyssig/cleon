package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.FunctionSpace_AuthZ_Deployment.IAbstractGroupFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.ActivityPackage;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.FunctionSpace_Activity_Deployment.IActivityNetdomainGroupFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.FunctionSpace_Activity_Deployment.IActivityRootGroupsFunctions;
import cleon.common.resources.metamodel.spec.id.IdPackage;

public class SetIdForActivities extends AbstractAllInstancesRefactorerAspect {

	public SetIdForActivities() {
		super("1.0", 2019, 6, 1, "Set id for activity permissions", IdPackage.IntegerBusinessObjectId);
	}

	@Override
	protected void refactor(IModifiable executor, Package paramPackage, INode paramINode) {
		final ITypeSystem typeSystem = TypeSystem.create(executor);
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();

		final INodeSet nodeSet = Select.instances(executor, ActivityPackage.ActivityRootGroups);

		try {
			for(final INode node : nodeSet) {
				final IActivityRootGroups groups = resourceRepository.getResource(IActivityRootGroups.class, node);
				final IActivityRootGroupsFunctions groupsFunctions = groups.extension(IActivityRootGroupsFunctions.class);

				for(final IActivityNetdomainGroup domainGroup : groupsFunctions.AllActivityNetDomaingroups()) {
					final IActivityNetdomainGroupFunctions netDomainGroupFunctions = domainGroup.extension(IActivityNetdomainGroupFunctions.class);
					final IAbstractGroupFunctions abstractGroupFunctions = domainGroup.extension(IAbstractGroupFunctions.class);

					int i = 0;
					for( final IActivityPermission activityPermission : netDomainGroupFunctions.AllActivityPermissions() ) {
						if( activityPermission.selectIdentifier() == null || activityPermission.selectIdentifier().intValue() == 0) {
							final Integer id = abstractGroupFunctions.GetNetdomainId() + i;

							Update.createOrModifyStatement(executor, activityPermission.getPackage(), activityPermission.getResource(),
									IdPackage.IntegerBusinessObjectId_identifier, LiteralUtil.create(id));
							++i;
						} else {
							if ( i < activityPermission.selectIdentifier() ) {
								i = activityPermission.selectIdentifier();
							}
						}
					}
				}
			}
		}
		catch(final Exception e) {
			ch.actifsource.util.log.Logger.instance().logError(e.toString());				
		}
	}
}
