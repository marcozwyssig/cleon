package cleon.architecturemethods.arc42.metamodel.importer.xml;

import java.io.InputStream;

import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.ui.wizard.importer.IImportContext;
import ch.actifsource.ui.wizard.importer.aspect.IGenericImportWizardAspect;
import cleon.architecturemethods.arc42.metamodel.spec.FunctionSpace_SystemArc42.ISystemArc42DocumentFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.FunctionSpace_Topology.ITopologyEnvironmentFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment;
import cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document;


public class VMImportWizard implements IGenericImportWizardAspect {
	@Override
	public void importFile(final IImportContext context, final InputStream inputStream) {

		final var typeSystem = TypeSystem.create(context.getWriteJobExecutor());
		final var resourceRepository = typeSystem.getResourceRepository();
		final var arc42Document = resourceRepository.getResource(ISystemArc42Document.class,
				context.getResouce());
		final var arc42DocumentFunctions = arc42Document
				.extension(ISystemArc42DocumentFunctions.class);
		final var topology = arc42DocumentFunctions.Topology();
		final ITopologyEnvironment topologyEnvironment = topology.selectTopologyEnvironment().values().stream()
				.findFirst().get();
		final var functions = topologyEnvironment
				.extension(ITopologyEnvironmentFunctions.class);
	}
}
