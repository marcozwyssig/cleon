/* See the file "LICENSE" for the full license governing this code. */

package cleon.initialization.projectmanagement.model.hermes;

import ch.actifsource.core.Resource;
import ch.actifsource.ui.wizard.importer.IImportContext;
import ch.actifsource.xml.importer.util.*;

public class HermesImportWizardAspect extends AbstractXMLImportWizardAspect
{
	@Override
	protected IXMLElementHandler getRootElementHandler(IImportContext context)
	{
		return new HermesElementHandler(new Resource("fceba8cc-31c9-11e8-8a84-6f139e67278b"));
	}
}
/* Actifsource ID=[6c71e26a-229e-11e8-88dc-0db67e3aa1a3,492b1225-31d3-11e8-8891-11071a1f2fb6,Hash] */
