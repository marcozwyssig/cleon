package cleon.common.doc.metamodel.spec.paragraph.sourcecode.javamodel;

import java.util.List;

import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency.NodeRole;
import ch.actifsource.util.inconsistency.InconsistencyType;

public class SourceCodeValidationAspect implements IResourceValidationAspect {

    @Override
    public void validate(ValidationContext context, List<IResourceInconsistency> inconsistencyList) {
        var repository = TypeSystem.create(context.getReadJobExecutor()).getResourceRepository();
        var sourceCode = repository.getResource(ISourceCode.class, context.getResource());
        
        boolean hasCode = sourceCode.selectCode().isEmpty() == false;
        boolean hasInclude = sourceCode.selectInclude() != null;
        
        if (hasCode && hasInclude) {
            inconsistencyList.add(new SingleResourceInconsistency(
                context.getPackage(),
                context.getResource(),
                NodeRole.Object,
                "Both 'Code' and 'Include' cannot have values. One must be empty.", 
                InconsistencyType.Error
            ));
        } else if (!hasCode && !hasInclude) {
            inconsistencyList.add(new SingleResourceInconsistency(
                context.getPackage(),
                context.getResource(),
                NodeRole.Object,
                "Either 'Code' or 'Include' must have a value. Both cannot be empty.", 
                InconsistencyType.Error
            ));
        }
    }
}