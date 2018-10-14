package cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel;


import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdInitializerAspect;

public class RiskInitializerAspect extends BusinessObjectIdInitializerAspect<IRisk> {

	public RiskInitializerAspect()
	{
		super(IRisk.class);
	}
}