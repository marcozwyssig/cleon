package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class ActivityPermissionIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IActivityPermission> 
{
	public ActivityPermissionIdValidationAspect()
	{
		super(IActivityPermission.class);
	}
}