/* See the file "LICENSE" for the full license governing this code. */

package cleon.initialization.projectmanagement.model.hermes;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import ch.actifsource.core.INode;
import ch.actifsource.core.Resource;
import ch.actifsource.xml.importer.util.AbstractXMLElementHandler;
import ch.actifsource.xml.importer.util.IXMLElementContext;
import ch.actifsource.xml.importer.util.IXMLElementHandler;

public class RoleElementHandler extends AbstractXMLElementHandler {

	private String _discriminator;
	private Resource _cls;
	private Resource _rel;

	public RoleElementHandler(Resource cls)
	{
		_discriminator = null;
		_cls = cls;
		_rel = null;
	}
	
	public RoleElementHandler(Resource cls, Resource rel)
	{
		_discriminator = null;
		_cls = cls;
		_rel = rel;
	}	
	
	public RoleElementHandler(String discriminator, Resource cls, Resource rel)
	{
		_discriminator = discriminator;
		_cls = cls;
		_rel = rel;
	}

	@Override
	public INode createElement(IXMLElementContext context, String name, Attributes attributes) throws SAXException
	{
		context.getImportContext().putInfo("createElement with name '" + name + "'");
		if( name.equalsIgnoreCase("role"))
		{		
			context.getImportContext().putInfo("creating role resource with name '" + name + "' and discriminator '" + _discriminator + "'");
			String discriminatorAttribute = null;
			if( _discriminator != null )
				discriminatorAttribute = context.getMandatoryAttributeStringValue(_discriminator, attributes);
			return context.getOrCreateResourceByName(discriminatorAttribute, context.getParentResourceNotNull(), _rel, _cls);
		}
		
		context.getImportContext().putError("name doenst not equals role");
		return super.createElement(context, name, attributes);	
	}
	
	@Override
	public void setAttribute(IXMLElementContext context, String name, Attributes attributes) throws SAXException 
	{
		{
			//String : id (Mandatory)
			String id = context.getMandatoryAttributeStringValue("id", attributes);
			context.getImportContext().putInfo("setting attribute String : id (Mandatory) with value '" + id + "'");
			context.setOrUpdateStringProperty(context.getResourceNotNull(), new Resource("33a55570-31cd-11e8-8a84-6f139e67278b"), id);
		}	
	
	}		

	@Override
	public IXMLElementHandler createSubElementHandler(IXMLElementContext context, String name) throws SAXException 
	{	
		
		if(name.equalsIgnoreCase("authority")) {
			return new Role_AuthorityElementHandler();
		}	
		if(name.equalsIgnoreCase("description")) {
			return new Role_DescriptionsElementHandler();
		}	
		if(name.equalsIgnoreCase("presentationName")) {
			return new Role_DisplayNameElementHandler();
		}	
		if(name.equalsIgnoreCase("responsibility")) {
			return new Role_ResponsibilityElementHandler();
		}	
		if(name.equalsIgnoreCase("skills")) {
			return new Role_SkillsElementHandler();
		}	
				
		throw context.createException("Create nested element '" + name + "' is not supported.");
	}
}
/* Actifsource ID=[38dbaecb-237f-11e8-85f4-376150ff5cc0,b48f0538-327e-11e8-925e-0378e2266aa0,m0jzlaP07kgGy6/AKpuxJ59zZPo=] */
