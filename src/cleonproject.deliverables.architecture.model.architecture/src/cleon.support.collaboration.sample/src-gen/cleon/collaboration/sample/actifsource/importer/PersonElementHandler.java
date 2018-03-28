/* See the file "LICENSE" for the full license governing this code. */

package cleon.collaboration.sample.actifsource.importer;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import ch.actifsource.core.INode;
import ch.actifsource.core.Resource;
import ch.actifsource.xml.importer.util.AbstractXMLElementHandler;
import ch.actifsource.xml.importer.util.IXMLElementContext;
import ch.actifsource.xml.importer.util.IXMLElementHandler;

public class PersonElementHandler extends AbstractXMLElementHandler {

	private String _discriminator;
	private Resource _cls;
	private Resource _rel;

	public PersonElementHandler(Resource cls)
	{
		_discriminator = null;
		_cls = cls;
		_rel = null;
	}
	
	public PersonElementHandler(Resource cls, Resource rel)
	{
		_discriminator = null;
		_cls = cls;
		_rel = rel;
	}	
	
	public PersonElementHandler(String discriminator, Resource cls, Resource rel)
	{
		_discriminator = discriminator;
		_cls = cls;
		_rel = rel;
	}

	@Override
	public INode createElement(IXMLElementContext context, String name, Attributes attributes) throws SAXException
	{
		context.getImportContext().putInfo("createElement with name '" + name + "'");
		if( name.equalsIgnoreCase("person"))
		{		
			context.getImportContext().putInfo("creating person resource with name '" + name + "' and discriminator '" + _discriminator + "'");
			String discriminatorAttribute = null;
			if( _discriminator != null )
				discriminatorAttribute = context.getMandatoryAttributeStringValue(_discriminator, attributes);
			return context.getOrCreateResourceByName(discriminatorAttribute, context.getParentResourceNotNull(), _rel, _cls);
		}
		
		context.getImportContext().putError("name doenst not equals person");
		return super.createElement(context, name, attributes);	
	}
	
	@Override
	public void setAttribute(IXMLElementContext context, String name, Attributes attributes) throws SAXException 
	{
	
		{
			String charf__S_ref = context.getOptionalAttributeStringValue("charf-ref", attributes); 
			context.getImportContext().putInfo("setting association charf-ref with ref '" + charf__S_ref + "'");
			if( charf__S_ref != null )
			{
				INode charf__S_refNode = context.getOptionalResurceByName(charf__S_ref, new Resource("926347c3-25dd-11e8-afb5-83603a67326a"), new Resource("08cc9639-26bd-11e8-a805-991f3ff583b7"));
				if( charf__S_refNode != null)
					context.setOrUpdateReference(context.getResourceNotNull(), new Resource("08cc9639-26bd-11e8-a805-991f3ff583b7"), charf__S_refNode);
				else
					context.getImportContext().putInfo("no resource found for charf-ref with ref '" + charf__S_ref + "'");
					
			}
		}
	}		

	@Override
	public IXMLElementHandler createSubElementHandler(IXMLElementContext context, String name) throws SAXException 
	{	
		
				
		throw context.createException("Create nested element '" + name + "' is not supported.");
	}
}
/* Actifsource ID=[38dbaecb-237f-11e8-85f4-376150ff5cc0,cc9f0cbe-3283-11e8-925e-0378e2266aa0,RRPaaDvN7dtjvua5YhBMP4hbF6I=] */
