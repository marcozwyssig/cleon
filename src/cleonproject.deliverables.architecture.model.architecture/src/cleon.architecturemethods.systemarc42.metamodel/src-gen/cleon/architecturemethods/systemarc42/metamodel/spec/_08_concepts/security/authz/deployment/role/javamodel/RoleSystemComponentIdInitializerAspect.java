package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.FunctionSpace_AuthZ_Deployment.IAbstractGroupFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.FunctionSpace_Role.IRoleSystemComponentFunctions;
import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdInitializerAspect;

public class RoleSystemComponentIdInitializerAspect extends BusinessObjectIdInitializerAspect<IRoleSystemComponent> 
{
	public RoleSystemComponentIdInitializerAspect()
	{
		super(IRoleSystemComponent.class);
	}

	@Override
	protected List<IRoleSystemComponent> selectRessources(IDynamicResourceRepository resourceRepository, IRoleSystemComponent roleSystemComponent) {
		final IRoleSystemComponentFunctions componentFunctions = roleSystemComponent.extension(IRoleSystemComponentFunctions.class); 
		return componentFunctions.AllRoleSystemComponentInDomain();
	}

	@Override
	protected Integer getStartId(IRoleSystemComponent activityPermission) {
		final IAbstractGroupFunctions abstractGroupFunctions = activityPermission.extension(IAbstractGroupFunctions.class);
		return abstractGroupFunctions.GetSiteId();
	}		
}