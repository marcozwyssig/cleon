/* See the file "LICENSE" for the full license governing this code. */

package cleon.collaboration.sample.actifsource.importer;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import ch.actifsource.core.INode;
import ch.actifsource.core.Resource;
import ch.actifsource.xml.importer.util.AbstractXMLElementHandler;
import ch.actifsource.xml.importer.util.IXMLElementContext;
import ch.actifsource.xml.importer.util.IXMLElementHandler;

public class TableElementHandler extends AbstractXMLElementHandler {

	private String _discriminator;
	private Resource _cls;
	private Resource _rel;
	
	public TableElementHandler(String discriminator, Resource cls, Resource rel)
	{
		_discriminator = discriminator;
		_cls = cls;
		_rel = rel;
	}

	@Override
	public INode createElement(IXMLElementContext context, String name, Attributes attributes) throws SAXException
	{
		context.getImportContext().putInfo("createElement with name '" + name + "'");
		if( name.equalsIgnoreCase("table"))
		{		
			context.getImportContext().putInfo("creating table resource with name '" + name + "' and discriminator '" + _discriminator + "'");
			String discriminatorProperty = context.getMandatoryAttributeStringValue(_discriminator, attributes);
			return context.getOrCreateResourceByName(discriminatorProperty, context.getParentResourceNotNull(), _rel, _cls);
		}
		
		context.getImportContext().putError("name doenst not equals table");
		return super.createElement(context, name, attributes);	
	}
	
	@Override
	public void setAttribute(IXMLElementContext context, String name, Attributes attributes) throws SAXException 
	{
		{
			// String : description (Mandatory)
			String description = context.getMandatoryAttributeStringValue("description", attributes);
			context.getImportContext().putInfo("setting attribute String : description (Mandatory) with value '" + description + "'");
			context.setOrUpdateStringProperty(context.getResourceNotNull(), new Resource("d5f8659c-25ee-11e8-afb5-83603a67326a"), description);
			// String : size (Mandatory)
			String size = context.getMandatoryAttributeStringValue("size", attributes);
			context.getImportContext().putInfo("setting attribute String : size (Mandatory) with value '" + size + "'");
			context.setOrUpdateStringProperty(context.getResourceNotNull(), new Resource("dd7a7215-221f-11e8-8749-cb7f4d6924d3"), size);
		}	
	
	}		
	
	@Override
	public IXMLElementHandler createSubElementHandler(IXMLElementContext context, String name) throws SAXException 
	{
		context.getImportContext().putInfo("createSubElementHandler with name '" + name + "'");
		if(name.equalsIgnoreCase("chair"))
		{
			return new ChairElementHandler
			  ( "name",
			    new Resource("fb9da58f-26bc-11e8-a805-991f3ff583b7"), 
			    new Resource("f34b37c9-26bc-11e8-a805-991f3ff583b7"));
		}	
		if(name.equalsIgnoreCase("person"))
		{
			return new PersonElementHandler
			  ( "name",
			    new Resource("dd7a7214-221f-11e8-8749-cb7f4d6924d3"), 
			    new Resource("0cbcfca0-2220-11e8-8749-cb7f4d6924d3"));
		}	
		throw context.createException("Create nested element '" + name + "' is not supported.");
	}	
}
/* Actifsource ID=[38dbaecb-237f-11e8-85f4-376150ff5cc0,d815f19f-23a6-11e8-9237-83e9a2871328,xBy5AkUfJTCOWM+CU621TQ2h6xQ=] */
