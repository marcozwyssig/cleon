package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class RoleSystemComponentIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IRoleSystemComponent> {
	public RoleSystemComponentIdValidationAspect()
	{
		super(IRoleSystemComponent.class);
	}
}