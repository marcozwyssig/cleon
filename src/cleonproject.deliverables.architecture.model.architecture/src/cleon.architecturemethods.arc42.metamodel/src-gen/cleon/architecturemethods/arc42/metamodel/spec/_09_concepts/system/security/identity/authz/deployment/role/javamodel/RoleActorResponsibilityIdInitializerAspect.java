package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.FunctionSpace_Role.IRoleActorResponsibilityFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.FunctionSpace_AuthZ_Deployment.IAbstractGroupFunctions;
import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdInitializerAspect;

public class RoleActorResponsibilityIdInitializerAspect extends BusinessObjectIdInitializerAspect<IRoleActorResponsibility> 
{
	public RoleActorResponsibilityIdInitializerAspect()
	{
		super(IRoleActorResponsibility.class);
	}

	@Override
	protected List<IRoleActorResponsibility> selectRessources(IDynamicResourceRepository resourceRepository, IRoleActorResponsibility roleSystemComponent) {
		final IRoleActorResponsibilityFunctions componentFunctions = roleSystemComponent.extension(IRoleActorResponsibilityFunctions.class); 
		return componentFunctions.AllRoleActorResponsibilityInDomain();
	}

	protected Integer getStartId(IRoleSystemComponent activityPermission) {
		final IAbstractGroupFunctions abstractGroupFunctions = activityPermission.extension(IAbstractGroupFunctions.class);
		return abstractGroupFunctions.GetSiteId();
	}		
}