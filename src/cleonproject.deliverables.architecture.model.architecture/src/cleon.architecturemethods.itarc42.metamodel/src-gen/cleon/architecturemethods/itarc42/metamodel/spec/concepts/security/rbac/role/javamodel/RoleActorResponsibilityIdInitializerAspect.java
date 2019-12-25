package cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.role.javamodel;

import java.util.List;
import java.util.OptionalInt;

import ch.actifsource.core.INode;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.FunctionSpace_RBAC.IAbstractGroupFunctions;
import cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.FunctionSpace_Activity.IActivityPermissionFunctions;
import cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.role.FunctionSpace_Role.IRoleActorResponsibilityFunctions;
import cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.role.FunctionSpace_Role.IRoleSystemComponentFunctions;
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