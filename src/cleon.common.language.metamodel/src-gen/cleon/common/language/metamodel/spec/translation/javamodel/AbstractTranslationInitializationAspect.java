package cleon.common.language.metamodel.spec.translation.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.AbstractInitializationAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.common.language.metamodel.spec.FunctionSpace_Language.IAbstractTranslationFunctions;
import cleon.common.language.metamodel.spec.translation.TranslationPackage;
import cleon.common.resources.metamodel.spec.literals.StringFunctionSpace.StringLiteralFunctionsImpl;

public class AbstractTranslationInitializationAspect extends AbstractInitializationAspect {

	@Override
	public void initialize(final IModifiable modifiable, final INode clazz, final Package pkg, final INode newInstance) {
		final var typeSystem = TypeSystem.create(modifiable);
		final var resourceRepository = typeSystem.getResourceRepository();
		final var abstractTranslation = resourceRepository.getResource(IAbstractTranslation.class, newInstance);
		final var abstractFunctions = abstractTranslation.extension(IAbstractTranslationFunctions.class);
		final var md5 = StringLiteralFunctionsImpl.INSTANCE.md5(abstractFunctions.OriginText());
		Update.createStatement(modifiable, pkg, newInstance, TranslationPackage.AbstractTranslation_md5, LiteralUtil.create(md5));

	}

}