package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdInitializerAspect;

public class RiskInitializerAspect extends BusinessObjectIdInitializerAspect<IRisk> {

	public RiskInitializerAspect()
	{
		super(IRisk.class);
	}
}