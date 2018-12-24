package cleon.common.doc.spec.doc.chapter.references.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class ReferenceIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IReference> 
{
	public ReferenceIdValidationAspect()
	{
		super(IReference.class);
	}
}