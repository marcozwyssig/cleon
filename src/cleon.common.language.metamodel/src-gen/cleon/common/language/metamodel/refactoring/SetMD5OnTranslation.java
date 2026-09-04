package cleon.common.language.metamodel.refactoring;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.common.language.metamodel.spec.FunctionSpace_Language.IAbstractTranslationFunctions;
import cleon.common.language.metamodel.spec.translation.TranslationPackage;
import cleon.common.language.metamodel.spec.translation.javamodel.IAbstractTranslation;
import cleon.common.resources.metamodel.spec.literals.StringFunctionSpace.StringLiteralFunctionsImpl;

public class SetMD5OnTranslation extends AbstractAllInstancesRefactorerAspect {

	public SetMD5OnTranslation() {
		super("1.0", 2024, 11, 29, "Set MD5 for translation", TranslationPackage.AbstractTranslation);
	}

	@Override
	protected void refactor(final IModifiable executor, final Package _package, final INode translationNode) {
		final var typeSystem = TypeSystem.create(executor);
		final var resourceRepository = typeSystem.getResourceRepository();

		final var translation = resourceRepository.getResource(IAbstractTranslation.class, translationNode);
		if( translation.selectMd5() == null ) {
			final var function = translation.extension(IAbstractTranslationFunctions.class);
			final var originText = function.OriginText();

			if( originText != null ) {
				final var md5HashCode = StringLiteralFunctionsImpl.INSTANCE.md5(originText);
				Update.createOrModifyStatement(executor, _package, translationNode,
						TranslationPackage.AbstractTranslation_md5, LiteralUtil.create(md5HashCode));
			}
		}
	}
}
