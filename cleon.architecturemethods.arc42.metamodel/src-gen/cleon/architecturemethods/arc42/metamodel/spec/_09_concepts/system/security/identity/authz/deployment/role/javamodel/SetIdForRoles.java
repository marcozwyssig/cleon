package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel;

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
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.FunctionSpace_Role.IRoleRootGroupsFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.FunctionSpace_Role.IRoleSiteGroupFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.FunctionSpace_AuthZ_Deployment.IAbstractGroupFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage;
import cleon.common.resources.metamodel.spec.id.IdPackage;
import cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId;

public class SetIdForRoles extends AbstractAllInstancesRefactorerAspect {

	public SetIdForRoles() {
		super("1.0", 2019, 6, 1, "Set id for roles", IdPackage.IntegerBusinessObjectId);
	}

	@Override
	protected void refactor(IModifiable executor, Package paramPackage, INode paramINode) {
		final ITypeSystem typeSystem = TypeSystem.create(executor);
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();

		final INodeSet nodeSet = Select.instances(executor, RolePackage.RoleRootGroups);

		try {
			for(final INode node : nodeSet) {
				final IRoleRootGroups groups = resourceRepository.getResource(IRoleRootGroups.class, node);
				final IRoleRootGroupsFunctions groupsFunctions = groups.extension(IRoleRootGroupsFunctions.class);

				for(final IRoleSiteGroup domainGroup : groupsFunctions.AllRoleNetDomaingroups()) {
					final IRoleSiteGroupFunctions netDomainGroupFunctions = domainGroup.extension(IRoleSiteGroupFunctions.class);
					final IAbstractGroupFunctions abstractGroupFunctions = domainGroup.extension(IAbstractGroupFunctions.class);

					verifyAndSetId(executor, netDomainGroupFunctions.AllRoleActorResponsiblities(), abstractGroupFunctions);					
				}
			}
		}
		catch(final Exception e) {
			ch.actifsource.util.log.Logger.instance().logError(e.toString());				
		}
	}

	private void verifyAndSetId(IModifiable executor, java.util.List<? extends IIntegerBusinessObjectId> objects, IAbstractGroupFunctions abstractGroupFunctions) {
		int i = 0;
		for( final IIntegerBusinessObjectId identifier : objects) {
			if( identifier.selectIdentifier() == null || identifier.selectIdentifier().intValue() == 0) {
				final Integer id = abstractGroupFunctions.GetSiteId() + i;
				Update.createOrModifyStatement(executor, identifier.getPackage(), identifier.getResource(),
						IdPackage.IntegerBusinessObjectId_identifier, LiteralUtil.create(id));
				++i;
			} else {
				if ( i <= identifier.selectIdentifier() ) {
					i = identifier.selectIdentifier();
				}
			}
		}
	}
}
