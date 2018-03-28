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

public class Role_SkillsElementHandler extends AbstractXMLElementHandler {


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
		// String : skills (Mandatory)
		context.getImportContext().putInfo("setting attribute String : skills (Mandatory)");
		setOrUpdateStringProperty(context, context.getParentResourceNotNull(), new Resource("6ea7e1d7-31ce-11e8-8a84-6f139e67278b"), value); 
	}	
}

/* Actifsource ID=[33d860ec-3293-11e8-925e-0378e2266aa0,1d035c01-3297-11e8-925e-0378e2266aa0,SgB6lOCplSVRNH/5Wq64KyTVTys=] */
