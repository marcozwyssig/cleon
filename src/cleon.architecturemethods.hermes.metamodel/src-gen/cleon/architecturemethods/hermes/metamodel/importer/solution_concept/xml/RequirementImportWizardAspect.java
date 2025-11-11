package cleon.architecturemethods.hermes.metamodel.importer.solution_concept.xml;

import java.io.InputStream;

import ch.actifsource.ui.wizard.importer.IImportContext;
import ch.actifsource.ui.wizard.importer.aspect.IGenericImportWizardAspect;

public class RequirementImportWizardAspect implements IGenericImportWizardAspect {

	@Override
	public void importFile(final IImportContext context, final InputStream inputStream) {
		try {
			final var requirementsXml = Requirements.fromInputStream(inputStream);
			requirementsXml.persist(context.getResouce(), context);

		} catch (final Exception e) {
			context.putError(e.toString());
		}

	}

}
