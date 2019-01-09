package cleon.common.doc.spec.doc.chapter.references.javamodel;

import java.util.ArrayList;
import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.validation.ValidationContext;
import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class ReferenceIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IReference> 
{
	public ReferenceIdValidationAspect()
	{
		super(IReference.class);
	}
	
	@Override
	protected List<IReference> getResources(IDynamicResourceRepository resourceRepository, ValidationContext context) 
	{
		IReferences references = References.selectToMeReferences(getObject(resourceRepository, context));
		List<? extends IReference> list = references.selectReferences();
		return new ArrayList<IReference>(list);
	}
	
}