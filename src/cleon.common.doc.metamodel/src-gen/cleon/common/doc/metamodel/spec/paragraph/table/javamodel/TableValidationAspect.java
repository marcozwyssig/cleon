package cleon.common.doc.metamodel.spec.paragraph.table.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.common.doc.metamodel.spec.paragraph.table.TablePackage;

public class TableValidationAspect implements IResourceValidationAspect {
	public TableValidationAspect() {
	}

	@Override
	public void validate(final ValidationContext validationContext,
			final List<IResourceInconsistency> inconsistencies) {
		final var start = Instant.now();
		try {

			final var typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
			final var resourceRepository = typeSystem.getResourceRepository();
			final var table = resourceRepository.getResource(ITable.class, validationContext.getResource());
			final var sumColumn = table.selectColumns().stream().mapToDouble(IColumn::selectWidth).sum();
			if (sumColumn != 100) {
				final var message = String.format("Sum of colums (%d) width is not 100", sumColumn);
				inconsistencies.add(new PredicateInconsistency(validationContext.getPackage(),
						validationContext.getResource(), TablePackage.Table_columns, message));
			}
		} finally {
			final var finish = Instant.now();
			final var timeElapsed = Duration.between(start, finish).toMillis();
			if( timeElapsed > 100 ) {
				Logger.instance().logInfo(String.format("Validation time for %s took %d ms", this.getClass().getSimpleName(), timeElapsed));
			}

		}

	}
}