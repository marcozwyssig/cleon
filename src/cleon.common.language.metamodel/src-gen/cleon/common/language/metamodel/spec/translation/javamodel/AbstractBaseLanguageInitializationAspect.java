package cleon.common.language.metamodel.spec.translation.javamodel;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import ch.actifsource.core.INode;
import ch.actifsource.core.Literal;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.AbstractInitializationAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.common.language.metamodel.spec.FunctionSpace_Language.IAbstractTranslationFunctions;

public abstract class AbstractBaseLanguageInitializationAspect extends AbstractInitializationAspect {
	protected abstract void setTargetText(IModifiable modifiable, Package pkg, INode newInstance, Literal literal);

	@Override
	public void initialize(IModifiable modifiable, INode clazz, Package pkg, INode newInstance) {

		try {
			final var typeSystem = TypeSystem.create(modifiable);
			final var resourceRepository = typeSystem.getResourceRepository();
			
			final var abstractLanguage = resourceRepository.getResource(IAbstractTranslation.class, newInstance);
			final var abstractLanguageFunctions = abstractLanguage.extension(IAbstractTranslationFunctions.class);
							
			final var targetLanguage = abstractLanguageFunctions.TargetLanguage().selectCode();
			final var sourceLanguage = abstractLanguageFunctions.SourceLanguage().selectCode();
			final var sourceText = abstractLanguageFunctions.OriginText();
			if (sourceText == null || sourceText.isEmpty() ) {
				return;
			}
			
			try {
				final var targetText = TranslationService.INSTANCE.translate(sourceLanguage, targetLanguage, sourceText);
				ch.actifsource.util.log.Logger.instance().logInfo(String.format("Source Language: %s; Target Language: %s; Source Text: %s; Target Text: %s;", sourceLanguage, targetLanguage, sourceText, targetText));				
				setTargetText(modifiable, pkg, newInstance, LiteralUtil.create(targetText));
			} catch (final IOException e) {
				throw new RuntimeException(e);
			}
			
		} catch (final Exception e) {
			if( e != null)
			{
				final var sw = new StringWriter();
				final var pw = new PrintWriter(sw);
				e.printStackTrace(pw);
				ch.actifsource.util.log.Logger.instance().logError("Exception: " + e.getMessage() + " StackTrace: " + sw);
			}

		}
	}
}