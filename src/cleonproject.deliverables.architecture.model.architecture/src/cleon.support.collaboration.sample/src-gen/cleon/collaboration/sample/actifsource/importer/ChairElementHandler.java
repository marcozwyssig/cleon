/* See the file "LICENSE" for the full license governing this code. */

package cleon.collaboration.sample.actifsource.importer;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import ch.actifsource.core.INode;
import ch.actifsource.core.Resource;
import ch.actifsource.xml.importer.util.AbstractXMLElementHandler;
import ch.actifsource.xml.importer.util.IXMLElementContext;
import ch.actifsource.xml.importer.util.IXMLElementHandler;

public class ChairElementHandler extends AbstractXMLElementHandler {

	private String _discriminator;
	private Resource _cls;
	private Resource _rel;

	public ChairElementHandler(Resource cls)
	{
		_discriminator = null;
		_cls = cls;
		_rel = null;
	}
	
	public ChairElementHandler(Resource cls, Resource rel)
	{
		_discriminator = null;
		_cls = cls;
		_rel = rel;
	}	
	
	public ChairElementHandler(String discriminator, Resource cls, Resource rel)
	{
		_discriminator = discriminator;
		_cls = cls;
		_rel = rel;
	}

	@Override
	public INode createElement(IXMLElementContext context, String name, Attributes attributes) throws SAXException
	{
		context.getImportContext().putInfo("createElement with name '" + name + "'");
		if( name.equalsIgnoreCase("chair"))
		{		
			context.getImportContext().putInfo("creating chair resource with name '" + name + "' and discriminator '" + _discriminator + "'");
			String discriminatorAttribute = null;
			if( _discriminator != null )
				discriminatorAttribute = context.getMandatoryAttributeStringValue(_discriminator, attributes);
			return context.getOrCreateResourceByName(discriminatorAttribute, context.getParentResourceNotNull(), _rel, _cls);
		}
		
		context.getImportContext().putError("name doenst not equals chair");
		return super.createElement(context, name, attributes);	
	}
	
	@Override
	public void setAttribute(IXMLElementContext context, String name, Attributes attributes) throws SAXException 
	{
	
	}		

	@Override
	public IXMLElementHandler createSubElementHandler(IXMLElementContext context, String name) throws SAXException 
	{	
		
				
		throw context.createException("Create nested element '" + name + "' is not supported.");
	}
}
/* Actifsource ID=[38dbaecb-237f-11e8-85f4-376150ff5cc0,c88f77bf-3283-11e8-925e-0378e2266aa0,WkKnY3Jxdqacd3qL75uaRq8rhtk=] */
