package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.FunctionSpace_Network.IHostNodeFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.RolePackage;

public class HostNodeValidationAspect implements IResourceValidationAspect 
{

	@Override
	public void validate(final ValidationContext context, final List<IResourceInconsistency> inconsistencyList) {
		final ITypeSystem typeSystem = TypeSystem.create(context.getReadJobExecutor());
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		final IHostNode hostNode = resourceRepository.getResource(IHostNode.class, context.getResource());
		final IHostNodeFunctions hostNodeFunctions = hostNode.extension(IHostNodeFunctions.class);
		final List<IHostNode> hostNodes = hostNodeFunctions.AllHostNodes();
		int count = 0;
		for( final IHostNode host : hostNodes ) {
			if( host.selectExportDNSRecord() == null || host.selectExportDNSRecord().booleanValue() ) {
				++count;
			}
		}
		if (count > 1) {
			final String errormessage = String.format("%1$s: to many exports (total %2$d)", Select.simpleName(context.getReadJobExecutor(), hostNode.selectHost().getResource()), count);
			inconsistencyList.add(new PredicateInconsistency(context.getPackage(), context.getResource(), RolePackage.RoleActorResponsibility, errormessage));
		}
	}	
}