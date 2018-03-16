/* See the file "LICENSE" for the full license governing this code. */

package cleon.design.actifsource.sample.importer;

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
			String discriminatorProperty = context.getMandatoryAttributeStringValue(_discriminator, attributes);
			return context.getOrCreateResourceByName(discriminatorProperty, context.getParentResourceNotNull(), _rel, _cls);
		}
		
		context.getImportContext().putError("name doenst not equals person");
		return super.createElement(context, name, attributes);	
	}
	
	@Override
	public void setAttribute(IXMLElementContext context, String name, Attributes attributes) throws SAXException 
	{
		{
			// Integer : age (Optional)
			Integer age = context.getOptionalAttributeIntegerValue("age", attributes);
			context.getImportContext().putInfo("setting attribute Integer : age (Optional) with value '" + age + "'");
			context.setOrUpdateIntegerProperty(context.getResourceNotNull(), new Resource("f51318cd-221f-11e8-8749-cb7f4d6924d3"), age);
		}	
	
		{
			String chair__S_ref__S_name = context.getOptionalAttributeStringValue("chair-ref-name", attributes); 
			context.getImportContext().putInfo("setting association chair-ref-name with ref '" + chair__S_ref__S_name + "'");
			if( chair__S_ref__S_name != null )
			{
				INode chair__S_ref__S_nameNode = context.getOptionalResurceByName(chair__S_ref__S_name, new Resource("29994200-25dd-11e8-afb5-83603a67326a"), new Resource("f34b37c9-26bc-11e8-a805-991f3ff583b7"));
				if( chair__S_ref__S_nameNode != null)
					context.setOrUpdateReference(context.getResourceNotNull(), new Resource("08cc9639-26bd-11e8-a805-991f3ff583b7"), chair__S_ref__S_nameNode);
				else
					context.getImportContext().putInfo("no resource found for chair-ref-name with ref '" + chair__S_ref__S_name + "'");
					
			}
		}
	}		
	
}
/* Actifsource ID=[38dbaecb-237f-11e8-85f4-376150ff5cc0,e6c51b28-25dc-11e8-afb5-83603a67326a,9SFLGWTPcxCSSbkVTi6N00TG39c=] */
