package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel;

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
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.FunctionSpace_RBAC.IAbstractGroupFunctions;
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.FunctionSpace_Role.IRoleNetDomainGroupFunctions;
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.FunctionSpace_Role.IRoleRootGroupsFunctions;
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage;
import cleon.common.resources.spec.resources.id.IdPackage;

public class SetIdForRoles extends AbstractAllInstancesRefactorerAspect {

	public SetIdForRoles() {
		super("1.0", 2019, 6, 1, "Set id for roles", IdPackage.IntegerBusinessObjectId);
	}

	@Override
	protected void refactor(IModifiable executor, Package paramPackage, INode paramINode) {
		ITypeSystem typeSystem = TypeSystem.create(executor);
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		
		INodeSet nodeSet = Select.instances(executor, RolePackage.RoleRootGroups);
		
		try {
			for(INode node : nodeSet) {
				IRoleRootGroups groups = resourceRepository.getResource(IRoleRootGroups.class, node);
				IRoleRootGroupsFunctions groupsFunctions = groups.extension(IRoleRootGroupsFunctions.class);

				for(IRoleNetDomainGroup domainGroup : groupsFunctions.AllRoleNetDomaingroups()) {
					IRoleNetDomainGroupFunctions netDomainGroupFunctions = domainGroup.extension(IRoleNetDomainGroupFunctions.class);
					IAbstractGroupFunctions abstractGroupFunctions = domainGroup.extension(IAbstractGroupFunctions.class);
						
					int i = 0;
					for( IRoleSystemComponent roleSystemComponent : netDomainGroupFunctions.AllRoleSystemComponents()) {
						Integer id = abstractGroupFunctions.GetNetdomainId() + i;
						Update.createOrModifyStatement(executor, roleSystemComponent.getPackage(), roleSystemComponent.getResource(),
								IdPackage.IntegerBusinessObjectId_identifier, LiteralUtil.create(id));
						++i;
					}
				}
			}
		}
		catch(Exception e) {
			ch.actifsource.util.log.Logger.instance().logError(e.toString());				
		}
	}
}
