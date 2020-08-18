package cleon.common.resources.metamodel.spec.id.javamodel;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
import ch.actifsource.util.log.Logger;
import cleon.common.resources.metamodel.spec.id.IdPackage;

public abstract class BusinessObjectIdInitializerAspect<T extends IIntegerBusinessObjectId>
extends AbstractInitializationAspect {

	private final Class<T> _classInstance;

	protected BusinessObjectIdInitializerAspect(final Class<T> classInstance) {
		_classInstance = classInstance;
	}

	protected Class<T> Clazz() {
		return _classInstance;
	}

	@Override
	public void initialize(final IModifiable modifiable, final INode clazz, final Package pkg, final INode newInstance) {
		final ITypeSystem typeSystem = TypeSystem.create(modifiable);
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();

		try {
			final Integer nextId = getNextId(resourceRepository, resourceRepository.getResource(Clazz(), newInstance));
			Update.createOrModifyStatement(modifiable, pkg, newInstance, IdPackage.IntegerBusinessObjectId_identifier, LiteralUtil.create(nextId));
		} catch (final Exception e) {
			final StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			final String exceptionAsString = sw.toString();

			Update.createStatement(modifiable, pkg, newInstance, CorePackage.NamedResource_name,
					LiteralUtil.create(exceptionAsString));
		}
	}

	protected List<T> selectRessources(final IDynamicResourceRepository resourceRepository, final T newInstance) {
		return resourceRepository.getAllResources(Clazz());
	}

	protected Integer getNextId(final IDynamicResourceRepository resourceRepository, final T newInstance) {
		final List<T> resources = selectRessources(resourceRepository, newInstance);
		if( resources.isEmpty()) {
			return getStartId(newInstance);			
		}

		return findNextId(newInstance, resources);
	}

	protected Integer getStartId(final T newInstance) {
		return 1;
	}

	protected Integer findNextId(final T newInstance, final List<T> resources) {
		final List<T> sortedList = resources.stream().filter( x -> x.selectIdentifier() != null).sorted(Comparator.comparingInt(IIntegerBusinessObjectId::selectIdentifier)).collect(Collectors.toList());
		Logger.instance().logInfo("Size: " + sortedList.size());
		for(int i = 0; i < sortedList.size(); ++i) {
			final int boId = getStartId(newInstance) + i;
			final int indexId = sortedList.get(i).selectIdentifier();
			if(boId < indexId) {
				Logger.instance().logInfo("next: " + boId + " / indexId: " + indexId);
				// at this point we know this is the next id.
				// we can leave the method and return the next ID.
				return boId;
			}
		}
		// we did not leave the loop (and method), because all id's are assigned.
		final int nextId = sortedList.size() + 1;
		Logger.instance().logInfo("next id: " + nextId);
		return nextId;
	}	
}
