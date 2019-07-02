package cleon.common.resources.spec.resources.id.javamodel;

import java.util.List;
import java.util.OptionalInt;

import ch.actifsource.core.CorePackage;
import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.AbstractInitializationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.common.resources.spec.resources.id.IdPackage;

public abstract class BusinessObjectIdInitializerAspect<T extends IIntegerBusinessObjectId> extends AbstractInitializationAspect {

	private Class<T> _classInstance;
	protected BusinessObjectIdInitializerAspect(Class<T> classInstance)
	{
		_classInstance = classInstance;
	}
	
	public void initialize(IModifiable modifiable, INode clazz, Package pkg,
			INode newInstance) {
		
		ITypeSystem typeSystem = TypeSystem.create(modifiable);
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();

		try
		{
			List<T> resources = resourceRepository.getAllResources(_classInstance);		
			OptionalInt maxOptional = resources.stream().filter(y -> y.selectIdentifier() != null).mapToInt(x -> x.selectIdentifier()).max();
			Integer max = 0;
			if( maxOptional.isPresent())
			{
				max = maxOptional.getAsInt();
			}
			
			Update.createOrModifyStatement(modifiable, pkg, newInstance, IdPackage.IntegerBusinessObjectId_identifier, LiteralUtil.create(max + 1));
		}
		catch(Exception e)
		{
			Update.createStatement(modifiable, pkg, newInstance, CorePackage.NamedResource_name, LiteralUtil.create(e.toString()));	
		}

	}
}
