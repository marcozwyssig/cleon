package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.FunctionSpace_RBAC.IAbstractGroupFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.FunctionSpace_Role.IRoleActorResponsibilityFunctions;
import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdInitializerAspect;

public class RoleActorResponsibilityIdInitializerAspect extends BusinessObjectIdInitializerAspect<IRoleActorResponsibility> 
{
	public RoleActorResponsibilityIdInitializerAspect()
	{
		super(IRoleActorResponsibility.class);
	}
	
	protected List<IRoleActorResponsibility> selectRessources(IDynamicResourceRepository resourceRepository, IRoleActorResponsibility roleSystemComponent) {
		IRoleActorResponsibilityFunctions componentFunctions = roleSystemComponent.extension(IRoleActorResponsibilityFunctions.class); 
		return componentFunctions.AllRoleActorResponsibilityInDomain();
	}
	
	protected Integer getStartId(IRoleSystemComponent activityPermission) {
		IAbstractGroupFunctions abstractGroupFunctions = activityPermission.extension(IAbstractGroupFunctions.class);
		return abstractGroupFunctions.GetNetdomainId();
	}		
}