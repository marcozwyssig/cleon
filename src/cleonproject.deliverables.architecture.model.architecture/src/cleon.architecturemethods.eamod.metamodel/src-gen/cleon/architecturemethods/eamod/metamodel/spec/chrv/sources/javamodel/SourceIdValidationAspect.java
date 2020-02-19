package cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class SourceIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<ISource> 
{
	public SourceIdValidationAspect()
	{
		super(ISource.class);
	}
}