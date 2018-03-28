/* See the file "LICENSE" for the full license governing this code. */

package cleon.collaboration.sample.actifsource.importer;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import ch.actifsource.core.INode;
import ch.actifsource.core.Resource;
import ch.actifsource.xml.importer.util.AbstractXMLElementHandler;
import ch.actifsource.xml.importer.util.IXMLElementContext;
import ch.actifsource.xml.importer.util.IXMLElementHandler;

public class TablesElementHandler extends AbstractXMLElementHandler {

	private String _discriminator;
	private Resource _cls;
	private Resource _rel;

	public TablesElementHandler(Resource cls)
	{
		_discriminator = null;
		_cls = cls;
		_rel = null;
	}
	
	public TablesElementHandler(Resource cls, Resource rel)
	{
		_discriminator = null;
		_cls = cls;
		_rel = rel;
	}	
	
	public TablesElementHandler(String discriminator, Resource cls, Resource rel)
	{
		_discriminator = discriminator;
		_cls = cls;
		_rel = rel;
	}

	@Override
	public INode createElement(IXMLElementContext context, String name, Attributes attributes) throws SAXException
	{
		context.getImportContext().putInfo("createElement with name '" + name + "'");
		if( name.equalsIgnoreCase("tables"))
		{		
			context.getImportContext().putInfo("creating tables resource with name '" + name + "' and discriminator '" + _discriminator + "'");
			String discriminatorAttribute = null;
			if( _discriminator != null )
				discriminatorAttribute = context.getMandatoryAttributeStringValue(_discriminator, attributes);
			return context.getOrCreateResourceByName(discriminatorAttribute, context.getParentResourceNotNull(), _rel, _cls);
		}
		
		context.getImportContext().putError("name doenst not equals tables");
		return super.createElement(context, name, attributes);	
	}
	
	@Override
	public void setAttribute(IXMLElementContext context, String name, Attributes attributes) throws SAXException 
	{
	
	}		

	@Override
	public IXMLElementHandler createSubElementHandler(IXMLElementContext context, String name) throws SAXException 
	{	
		context.getImportContext().putInfo("createSubElementHandler with name '" + name + "'");
		if(name.equalsIgnoreCase("table"))
		{
			return new TableElementHandler
			  ( "name",
			    new Resource("f51318cc-221f-11e8-8749-cb7f4d6924d3"), 
			    new Resource("d96c7ddc-23a2-11e8-9237-83e9a2871328"));
		}
		
				
		throw context.createException("Create nested element '" + name + "' is not supported.");
	}
}
/* Actifsource ID=[38dbaecb-237f-11e8-85f4-376150ff5cc0,2468ef7d-221e-11e8-8749-cb7f4d6924d3,wuC7pBsvJqfCnOToJmrhYdT0XrE=] */
