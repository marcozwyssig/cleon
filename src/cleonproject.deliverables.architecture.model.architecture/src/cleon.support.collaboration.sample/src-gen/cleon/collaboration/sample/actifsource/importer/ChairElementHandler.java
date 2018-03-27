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
			String discriminatorProperty = context.getMandatoryAttributeStringValue(_discriminator, attributes);
			return context.getOrCreateResourceByName(discriminatorProperty, context.getParentResourceNotNull(), _rel, _cls);
		}
		
		context.getImportContext().putError("name doenst not equals chair");
		return super.createElement(context, name, attributes);	
	}
	
	@Override
	public void setAttribute(IXMLElementContext context, String name, Attributes attributes) throws SAXException 
	{
	
	}		
	
}
/* Actifsource ID=[38dbaecb-237f-11e8-85f4-376150ff5cc0,2d3013ef-26bd-11e8-a805-991f3ff583b7,bcPkP4RBbvzhGERV8EhKlFZneGM=] */
