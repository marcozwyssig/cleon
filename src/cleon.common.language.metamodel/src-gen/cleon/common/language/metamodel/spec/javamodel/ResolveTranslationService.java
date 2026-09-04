package cleon.common.language.metamodel.spec.javamodel;

import java.util.function.Function;

import ch.actifsource.core.CorePackage;
import ch.actifsource.core.INode;
import ch.actifsource.core.Resource;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.selector.SelectSelectorUtil;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.set.INodeList;
import ch.actifsource.util.log.Logger;
import cleon.common.language.metamodel.spec.language_class.Language_classPackage;
import cleon.common.language.metamodel.spec.language_class.javamodel.ILanguageClass;
import cleon.common.language.metamodel.spec.language_class.javamodel.ILanguageNameAspectTranslation;
import cleon.common.language.metamodel.spec.languages.javamodel.CurrentLanguage;
import cleon.common.language.metamodel.spec.languages.javamodel.ILanguage;

public class ResolveTranslationService {

	private static boolean LOGGING = false;

	private final ILanguageClass languageClass;
	private final IDynamicResourceRepository repository;
	private final ch.actifsource.core.javamodel.IResource resource;

	public ResolveTranslationService(final ch.actifsource.core.javamodel.IResource resource) {
		this.resource = resource;
		this.repository = initializeRepository();
		this.languageClass = findLanguageClass();
	}

	// --- Public API ---

	public String translate() {
		return translate(CurrentLanguage.getInstance().LanguageCode(), null);
	}

	public String translate(final Function<String, String> resolver) {
		return translate(CurrentLanguage.getInstance().LanguageCode(), resolver);
	}

	public String translate(final ILanguage language) {
		return translate(language.selectCode(), null);
	}

	public String translate(final ILanguage language, final Function<String, String> resolver) {
		return translate(language.selectCode(), resolver);
	}

	public String translate(final Resource language) {
		return translate(repository.getResource(ILanguage.class, language).selectCode(), null);
	}

	private String translate(final String languageCode, final Function<String, String> resolver) {
		if (languageClass == null) {
			return resolver != null
					? resolver.apply(languageCode)
					: Select.simpleName(resource.getReadJobExecutor(), resource.getResource());
		}

		final var languageKey = findTranslationKeyForLanguage(languageCode);
		if (languageKey == null) {
			logError("No translation found for language code: " + languageCode);
			return null;
		} else {
			logInfo("Found languageKey " + languageCode);
		}
		
		return getTranslationValue(languageClass.selectTranslations().get(languageKey));
	}

	// --- Infrastructure ---

	private ILanguageClass findLanguageClass() {
		final var shallowType = Select.shallowType(resource.getReadJobExecutor(), resource.getResource());
		logInfo("Shallow type identified: " + Select.simpleName(resource.getReadJobExecutor(), shallowType));

		final var languageClassNode = searchForLanguageClass(shallowType);
		if (languageClassNode == null) {
			logInfo("No language class found for resource.");
			return null;
		} else {
			logInfo("Language class found for resource.");
		}
		return repository.getResource(ILanguageClass.class, languageClassNode);
	}

	private INode findTranslationKeyForLanguage(final String languageCode) {
		return languageClass.selectTranslations().keySet().stream()
				.filter(key -> isMatchingLanguageCode(key, languageCode))
				.findFirst()
				.orElse(null);
	}

	private INodeList getExtendedTypes(final INode currentType) {
		return Select.objectsForRelation(resource.getReadJobExecutor(), CorePackage.Class_extends, currentType);
	}

	private String getTranslationValue(final ILanguageNameAspectTranslation languageTranslation) {
		if (languageTranslation == null) {
			logError("LanguageNameAspectTranslation is null; cannot retrieve translation value.");
			return null;
		}

		final var selector = Select.objectForRelationOrNull(
				resource.getReadJobExecutor(),
				Language_classPackage.LanguageNameAspectTranslation_translationValue,
				languageTranslation.getResource());

		final var translationValue = SelectSelectorUtil.selectSelectorTextOrNull(
				resource.getReadJobExecutor(),
				selector,
				resource.getResource());

		if (translationValue == null) {
			logInfo("Translation value not found for selector.");
		} else {
			logInfo("Translation value " + translationValue);
		}
		return translationValue;
	}

	private IDynamicResourceRepository initializeRepository() {
		final var typeSystem = TypeSystem.create(resource.getReadJobExecutor());
		return typeSystem.getResourceRepository();
	}

	private boolean isLanguageClass(final INode typeNode) {
		final var shallowType = Select.shallowType(resource.getReadJobExecutor(), typeNode);
		return shallowType.equals(Language_classPackage.LanguageClass);
	}

	private boolean isMatchingLanguageCode(final INode languageKey, final String languageCode) {
		final var language = repository.getResource(ILanguage.class, languageKey);
		return language.selectCode().equals(languageCode);
	}

	private INode searchForLanguageClass(final INode currentType) {
		final Function<INode, INode> searchRecursive = new Function<>() {
			@Override
			public INode apply(final INode typeNode) {
				logInfo("Examining type: " + Select.simpleName(resource.getReadJobExecutor(), typeNode));

				if (typeNode.equals(CorePackage.Resource)) {
					logInfo("Reached root resource type. Ending search.");
					return null;
				}

				if (isLanguageClass(typeNode)) {
					logInfo("Language class found: " + Select.simpleName(resource.getReadJobExecutor(), typeNode));
					return typeNode;
				}

				for (final var extendedType : getExtendedTypes(typeNode)) {
					final var foundNode = this.apply(extendedType);
					if (foundNode != null) {
						return foundNode;
					}
				}
				return null;
			}
		};
		return searchRecursive.apply(currentType);
	}

	// --- Logging ---
	private static void logInfo(final String message) {
		if (LOGGING) {
			Logger.instance().logInfo(message);
		}
	}

	private static void logError(final String message) {
		Logger.instance().logError(message);
	}
}