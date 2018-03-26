package cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class SourceIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<ISource> 
{
	public SourceIdValidationAspect()
	{
		super(ISource.class);
	}
}