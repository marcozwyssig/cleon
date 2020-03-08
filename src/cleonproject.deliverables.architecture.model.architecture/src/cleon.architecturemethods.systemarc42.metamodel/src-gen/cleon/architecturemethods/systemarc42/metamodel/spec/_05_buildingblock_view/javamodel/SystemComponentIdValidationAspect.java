package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class SystemComponentIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<ISystemComponent> 
{
	public SystemComponentIdValidationAspect()
	{
		super(ISystemComponent.class);
	}
}