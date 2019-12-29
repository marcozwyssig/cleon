package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.role.javamodel;

import java.util.List;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.javamodel.IResource;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.util.collection.ICollection;
import ch.actifsource.util.collection.IList;
import cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.FunctionSpace_RBAC.IAbstractGroupFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.role.FunctionSpace_Role.IRoleNetDomainGroupFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.role.FunctionSpace_Role.IRoleRootGroupsFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.role.RolePackage;
import cleon.common.resources.metamodel.spec.id.IdPackage;
import cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId;
import cleon.common.resources.metamodel.spec.id.javamodel.IntegerBusinessObjectId;

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
						
					verifyAndSetId(executor, netDomainGroupFunctions.AllRoleSystemComponents(), abstractGroupFunctions);
					verifyAndSetId(executor, netDomainGroupFunctions.AllRoleActorResponsiblities(), abstractGroupFunctions);					
				}
			}
		}
		catch(Exception e) {
			ch.actifsource.util.log.Logger.instance().logError(e.toString());				
		}
	}

	private void verifyAndSetId(IModifiable executor, java.util.List<? extends IIntegerBusinessObjectId> objects, IAbstractGroupFunctions abstractGroupFunctions) {
		int i = 0;
		for( IIntegerBusinessObjectId identifier : objects) {
			if( identifier.selectIdentifier() == null || identifier.selectIdentifier().intValue() == 0) {
				Integer id = abstractGroupFunctions.GetNetdomainId() + i;
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
