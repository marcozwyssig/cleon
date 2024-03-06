package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel;

import java.util.List;

import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;

public class NetworkSiteValidatorAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList) {
//		ITypeSystem typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
//		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
//		INetworkSite networkSite = resourceRepository.getResource(INetworkSite.class, validationContext.getResource());
//		INetworkSiteFunctions networkSiteFunctions = networkSite.extension(INetworkSiteFunctions.class);
//		int functionId = networkSiteFunctions.FunctionId();
//		if( functionId == 0) {
//			return;
//		}
//		
//		IIPv4_Mask cidr = networkSite.selectCidr();
//		if (cidr == null)
//			return;
//		
//		INetworkEnvironment networkEnvironment = NetworkEnvironment.selectToMeNetworkSite(networkSite);
//		IIPv4_Mask cidrEnvironment = networkEnvironment.selectCidr();
//		
//		int calcFunctionId = functionId / 32;
//		
//		StringTokenizer tok = new StringTokenizer(cidrEnvironment.selectIPv4(), ".");
//
//		if (tok.countTokens() != 4) {
//			throw new IllegalArgumentException("IP address must be in the format 'xxx.xxx.xxx.xxx'");
//		}
//		
//		tok.nextToken(); // skip first ip
//		int startsubnet = Integer.parseInt(tok.nextToken()); 
//		int calcsubnet = startsubnet + calcFunctionId;
//		
//
//		ArrayList<INetworkSubZone> toFixedList = new ArrayList<INetworkSubZone>();
//		
//		for( Resource subzone : networkSite.selectNetworkSubZone().keyIterable() ) {
//			for(INetworkSubZone networkSubzone : networkSite.selectNetworkSubZone().get(subzone)) {
//				int vlan = networkSubzone.selectSecuritySubZone().selectVLAN_No();
//				int calcVlan = vlan - 2000;
//				
//				
//			}
//			
//		}
		
//
//		Collection<? extends IAbstractNetworkNode> nodes = nodeMap.values();

//		for (IAbstractNetworkNode node : nodes) {			
//			boolean isInRange = subnet.getInfo().isInRange(
//					Select.simpleName(validationContext.getReadJobExecutor(), node.selectIPv4_D().getResource()));
//			if (!isInRange) {
//				toFixedList.add(node);
//			}
//		}
//
//		if (!toFixedList.isEmpty()) {
//			
//			// Add quick fix
//			FixIPAddressQuickFix fixMissingIP = new FixIPAddressQuickFix(abstractPhysicalNetwork, toFixedList,
//					new IInconsistencyEnablement() {
//						@Override
//						public boolean isEnabled() {
//							return true;
//						}
//					});
//
//			for (IAbstractNetworkNode node : toFixedList) {
//				String ip = Select.simpleName(validationContext.getReadJobExecutor(), node.selectIPv4_D().getResource());
//				
//				ch.actifsource.core.Statement nodeNetwork = Select.relationStatementOrNull(
//						validationContext.getReadJobExecutor(),
//						cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractPhysicalNetwork_nodes,
//						abstractPhysicalNetwork.getResource());
//
//				String message = String.format("IP address %s is valid and can maybe be moved", ip);
//
//				validationList.add(new SingleStatementInconsistency(nodeNetwork, message, fixMissingIP));
//
//			}
//		}
	}
}
