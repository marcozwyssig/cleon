package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.FunctionSpace_RBAC.IAbstractGroupFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.ActivityPackage;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.FunctionSpace_Activity.IActivityNetdomainGroupFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.FunctionSpace_Activity.IActivityRootGroupsFunctions;
import cleon.common.resources.metamodel.spec.id.IdPackage;

public class SetIdForActivities extends AbstractAllInstancesRefactorerAspect {

	public SetIdForActivities() {
		super("1.0", 2019, 6, 1, "Set id for activity permissions", IdPackage.IntegerBusinessObjectId);
	}

	@Override
	protected void refactor(IModifiable executor, Package paramPackage, INode paramINode) {
		ITypeSystem typeSystem = TypeSystem.create(executor);
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		
		INodeSet nodeSet = Select.instances(executor, ActivityPackage.ActivityRootGroups);
		
		try {
			for(INode node : nodeSet) {
				IActivityRootGroups groups = resourceRepository.getResource(IActivityRootGroups.class, node);
				IActivityRootGroupsFunctions groupsFunctions = groups.extension(IActivityRootGroupsFunctions.class);

				for(IActivityNetdomainGroup domainGroup : groupsFunctions.AllActivityNetDomaingroups()) {
					IActivityNetdomainGroupFunctions netDomainGroupFunctions = domainGroup.extension(IActivityNetdomainGroupFunctions.class);
					IAbstractGroupFunctions abstractGroupFunctions = domainGroup.extension(IAbstractGroupFunctions.class);
						
					int i = 0;
					for( IActivityPermission activityPermission : netDomainGroupFunctions.AllActivityPermissions() ) {
						if( activityPermission.selectIdentifier() == null || activityPermission.selectIdentifier().intValue() == 0) {
							Integer id = abstractGroupFunctions.GetNetdomainId() + i;
							
							Update.createOrModifyStatement(executor, activityPermission.getPackage(), activityPermission.getResource(),
									IdPackage.IntegerBusinessObjectId_identifier, LiteralUtil.create(id));
							++i;
						} else {
							if ( i < activityPermission.selectIdentifier() ) {
								i = activityPermission.selectIdentifier();
							}
						}
					}
				}
			}
		}
		catch(Exception e) {
			ch.actifsource.util.log.Logger.instance().logError(e.toString());				
		}
	}
}
