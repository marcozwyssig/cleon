package cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel;

import java.util.List;

import ch.actifsource.core.INode;
import ch.actifsource.core.Statement;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.model.aspects.IResourcePlacement;
import ch.actifsource.core.model.aspects.IUseRangeRestrictionAspect;
import ch.actifsource.core.model.aspects.impl.AbstractStatelessAspectImpl;
import ch.actifsource.core.select.ISelectable;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.util.collection.IOrderedSet;
import ch.actifsource.util.filter.Filter;
import ch.actifsource.util.filter.IFilter;
import cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem;
import cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemState;

public class SprintBacklogWorkItemRangeRestrictionAspect extends AbstractStatelessAspectImpl
		implements IUseRangeRestrictionAspect {

	public IFilter<INode> allowedObjectsFilter(ISelectable readExecutor, INode subject, INode predicate) {
  	  	ITypeSystem typeSystem = TypeSystem.create(readExecutor);
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		return new IFilter<INode>()
	    {
	      public boolean include(INode element)
	      {
	    	  IWorkItem workItem = resourceRepository.getResource(IWorkItem.class, element);
	    	  IWorkItemState workItemState = workItem.selectState();
	    	  if( workItemState == null)
	    		  return false;
	    	  
	    	  return !(workItemState.isDone());
	      }
	    };
	}

	public IFilter<INode> allowedTypeFilter(IReadJobExecutor readExecutor, INode subject, INode predicate) {
		return Filter.includeAll();
	}

	public void validate(ValidationContext context, Statement statement,
			List<IResourceInconsistency> inconsistencyList) {
	}

	public IOrderedSet<IResourcePlacement> getPossibleNewObjectPlacements(IReadJobExecutor executor, INode subject,
			INode predicate, INode type) {
		return null;
	}
}