package cleon.initialization.projectmanagement.model.hermes;

import javax.annotation.CheckForNull;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import ch.actifsource.core.INode;
import ch.actifsource.core.PackagedResource;
import ch.actifsource.core.Resource;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.util.log.Logger;
import ch.actifsource.xml.importer.util.AbstractXMLElementHandler;
import ch.actifsource.xml.importer.util.IXMLElementContext;

public class Role_DisplayNameElementHandler extends AbstractXMLElementHandler {


	@Override
	public INode createElement(IXMLElementContext context, String name, Attributes attributes) throws SAXException
	{
		Logger.instance().logInfo("createElement: " + name + attributes.getLength());	
		return super.createElement(context, name, attributes);	
	}
	
	private void setOrUpdateStringProperty(IXMLElementContext context, INode resource, INode property, @CheckForNull String value) {
		if (value != null) {
			PackagedResource resourceAsPackagedResource = Select.asPackagedResource(context.getImportContext().getReadJobExecutor(), resource);
			context.getImportContext().incrementCreateCount();
			Update.createStatement(context.getImportContext().getWriteJobExecutor(), resourceAsPackagedResource.getPackage(), resource, property, LiteralUtil.create(value));
		}
	}	
	
	
	@Override
	public void setCharacters(IXMLElementContext context, char[] ch, int start, int length) throws SAXException {
		String value = new String(ch, start, length);
		// String : presentationName (Mandatory)
		context.getImportContext().putInfo("setting attribute String : presentationName (Mandatory)");
		setOrUpdateStringProperty(context, context.getParentResourceNotNull(), new Resource("71a7cc3e-4d0b-11e6-9043-01b29b61e580"), value); 
	}	
}

/* Actifsource ID=[33d860ec-3293-11e8-925e-0378e2266aa0,0f8c637a-3293-11e8-925e-0378e2266aa0,X9nU8j6h/5yCCURLWEbePQThTAk=] */
