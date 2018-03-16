/* See the file "LICENSE" for the full license governing this code. */

package cleon.design.actifsource.sample.importer;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import ch.actifsource.core.INode;
import ch.actifsource.core.Resource;
import ch.actifsource.xml.importer.util.AbstractXMLElementHandler;
import ch.actifsource.xml.importer.util.IXMLElementContext;
import ch.actifsource.xml.importer.util.IXMLElementHandler;

public class TablesRootElementHandler extends AbstractXMLElementHandler {

	@Override
	public IXMLElementHandler createSubElementHandler(IXMLElementContext context, String name) throws SAXException
	{	
		if( name.equalsIgnoreCase("Table"))
		{		
			return new TableElementHandler
			  ( "name",
			    new Resource("f51318cc-221f-11e8-8749-cb7f4d6924d3"), 
			    new Resource("d96c7ddc-23a2-11e8-9237-83e9a2871328"));
		}
		throw context.createException("Create nested element '" + name + "' is not supported!");	
	}
}
/* Actifsource ID=[1b0585f5-23a6-11e8-9237-83e9a2871328,02ac0079-23a6-11e8-9237-83e9a2871328,Hash] */
