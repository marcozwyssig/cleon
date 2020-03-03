package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel;

import java.util.List;
import java.util.OptionalInt;

import ch.actifsource.core.INode;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.FunctionSpace_RBAC.IAbstractGroupFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.FunctionSpace_Activity.IActivityPermissionFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.FunctionSpace_Role.IRoleSystemComponentFunctions;
import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdInitializerAspect;

public class RoleSystemComponentIdInitializerAspect extends BusinessObjectIdInitializerAspect<IRoleSystemComponent> 
{
	public RoleSystemComponentIdInitializerAspect()
	{
		super(IRoleSystemComponent.class);
	}
	
	protected List<IRoleSystemComponent> selectRessources(IDynamicResourceRepository resourceRepository, IRoleSystemComponent roleSystemComponent) {
		IRoleSystemComponentFunctions componentFunctions = roleSystemComponent.extension(IRoleSystemComponentFunctions.class); 
		return componentFunctions.AllRoleSystemComponentInDomain();
	}
	
	protected Integer getStartId(IRoleSystemComponent activityPermission) {
		IAbstractGroupFunctions abstractGroupFunctions = activityPermission.extension(IAbstractGroupFunctions.class);
		return abstractGroupFunctions.GetNetdomainId();
	}		
}