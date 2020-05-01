package cleon.common.doc.metamodel.spec.paragraph.table.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import cleon.common.doc.metamodel.spec.paragraph.table.TablePackage;

public class TableValidationAspect implements IResourceValidationAspect {
	public TableValidationAspect() {
	}

	@Override
	public void validate(final ValidationContext validationContext,
			final List<IResourceInconsistency> inconsistencies) {
		final ITypeSystem typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		final ITable table = resourceRepository.getResource(ITable.class, validationContext.getResource());
		final int sumColumn = table.selectColumns().stream().mapToInt(IColumn::selectWidth).sum();
		if (sumColumn != 100) {
			final String message = String.format("Sum of colums (%d) width is not 100", sumColumn);
			inconsistencies.add(new PredicateInconsistency(validationContext.getPackage(),
					validationContext.getResource(), TablePackage.Table_columns, message));
		}

	}
}