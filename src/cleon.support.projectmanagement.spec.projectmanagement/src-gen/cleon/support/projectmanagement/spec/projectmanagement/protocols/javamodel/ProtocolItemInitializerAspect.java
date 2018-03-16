package cleon.support.projectmanagement.spec.projectmanagement.protocols.javamodel;


import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdInitializerAspect;

public class ProtocolItemInitializerAspect extends BusinessObjectIdInitializerAspect<IProtocolItem> {

	public ProtocolItemInitializerAspect()
	{
		super(IProtocolItem.class);
	}
}