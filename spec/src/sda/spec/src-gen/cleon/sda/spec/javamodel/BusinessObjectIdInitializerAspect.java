package cleon.sda.spec.javamodel;

import java.util.List;
import java.util.Objects;

import cleon.sda.spec.SpecPackage;
import cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem;
import ch.actifsource.core.CorePackage;
import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResource;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.javamodel.Predicate;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.AbstractInitializationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;

public abstract class BusinessObjectIdInitializerAspect<T extends IBusinessObjectId> extends AbstractInitializationAspect {

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
			Integer max = resources.stream().filter(y -> y.selectIdentifier() != null).mapToInt(x -> x.selectIdentifier()).max().getAsInt();
					
			Update.createStatement(modifiable, pkg, newInstance, SpecPackage.BusinessObjectId_identifier, LiteralUtil.create(max + 1));			
		}
		catch(Exception e)
		{
			Update.createStatement(modifiable, pkg, newInstance, CorePackage.NamedResource_name, LiteralUtil.create(e.toString()));	
		}

	}
}
