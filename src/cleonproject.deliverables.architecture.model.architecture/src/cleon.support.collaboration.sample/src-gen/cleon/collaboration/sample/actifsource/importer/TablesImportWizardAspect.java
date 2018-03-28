/* See the file "LICENSE" for the full license governing this code. */

package cleon.collaboration.sample.actifsource.importer;

import ch.actifsource.core.Resource;
import ch.actifsource.ui.wizard.importer.IImportContext;
import ch.actifsource.xml.importer.util.*;

public class TablesImportWizardAspect extends AbstractXMLImportWizardAspect
{
	@Override
	protected IXMLElementHandler getRootElementHandler(IImportContext context)
	{
		return new TablesElementHandler(new Resource("d96c7dda-23a2-11e8-9237-83e9a2871328"));
	}
}
/* Actifsource ID=[6c71e26a-229e-11e8-88dc-0db67e3aa1a3,2468ef7d-221e-11e8-8749-cb7f4d6924d3,Hash] */
