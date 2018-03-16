/* See the file "LICENSE" for the full license governing this code. */

package cleon.design.actifsource.sample.importer;

import ch.actifsource.ui.wizard.importer.IImportContext;
import ch.actifsource.xml.importer.util.*;

public class ImporterSampleMapCfgImportAspect extends AbstractXMLImportWizardAspect 
{
	@Override
	protected IXMLElementHandler getRootElementHandler(IImportContext context)
	{
		return new TablesRootElementHandler();
	}
}
/* Actifsource ID=[6c71e26a-229e-11e8-88dc-0db67e3aa1a3,2468ef7d-221e-11e8-8749-cb7f4d6924d3,Hash] */
