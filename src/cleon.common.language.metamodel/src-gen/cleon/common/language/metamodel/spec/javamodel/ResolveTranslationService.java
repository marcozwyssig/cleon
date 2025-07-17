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

	private final ILanguageClass languageClass;
	private final IDynamicResourceRepository repository;
	private final ch.actifsource.core.javamodel.IResource resource;

	public ResolveTranslationService(final ch.actifsource.core.javamodel.IResource resource) {
		this.resource = resource;
		this.repository = initializeRepository();
		this.languageClass = findLanguageClass();
	}

	private ILanguageClass findLanguageClass() {
		final var shallowType = Select.shallowType(resource.getReadJobExecutor(), resource.getResource());
		Logger.instance().logVerbose("Shallow type identified: " + Select.simpleName(resource.getReadJobExecutor(), shallowType));

		final var languageClassNode = searchForLanguageClass(shallowType);
		if (languageClassNode == null) {
			Logger.instance().logVerbose("No language class found for resource.");
			return null;
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
			Logger.instance().logError("LanguageNameAspectTranslation is null; cannot retrieve translation value.");
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
			Logger.instance().logInfo("Translation value not found for selector.");
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
		final var language = repository.getResource(cleon.common.language.metamodel.spec.languages.javamodel.ILanguage.class, languageKey);
		return language.selectCode().equals(languageCode);
	}

	private INode searchForLanguageClass(final INode currentType) {
		final Function<INode, INode> searchRecursive = new Function<>() {
			@Override
			public INode apply(final INode typeNode) {
				Logger.instance().logVerbose("Examining type: " + Select.simpleName(resource.getReadJobExecutor(), typeNode));

				if (typeNode.equals(CorePackage.Resource)) {
					Logger.instance().logVerbose("Reached root resource type. Ending search.");
					return null;
				}

				if (isLanguageClass(typeNode)) {
					Logger.instance().logVerbose("Language class found: " + Select.simpleName(resource.getReadJobExecutor(), typeNode));
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

	public String translate() {
		final var currentLanguageCode = CurrentLanguage.getInstance().LanguageCode();
		return translate(currentLanguageCode, null);
	}

	public String translate(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language) {
		return translate(language.selectCode(), null);
	}
	
	public String translate(final Resource language) {
		final var languageObject = repository.getResource(ILanguage.class, language); 		
		return translate(languageObject);
	}
	
	public String translate(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language, Function<String, String> whenNotLanguageClass) {		
		return translate(language.selectCode(), whenNotLanguageClass);
	}

	private String translate(final String languageCode, Function<String, String> whenNotLanguageClass) {
		if( languageClass == null) {
			Logger.instance().logInfo("No Language class found for : " + Select.simpleName(resource.getReadJobExecutor(), resource.getResource()));
			if( whenNotLanguageClass == null) {
				return Select.simpleName(resource.getReadJobExecutor(), resource.getResource());				
			} else {
				Logger.instance().logInfo("Execute whenNotLanguageClass lambda.");				
				return whenNotLanguageClass.apply(languageCode);
			}
		}

		final var languageKey = findTranslationKeyForLanguage(languageCode);
		if (languageKey == null) {
			Logger.instance().logError("No translation found for language code: " + languageCode);
			return null;
		}
		Logger.instance().logVerbose("Translation found for language code: " + languageCode);

		final var languageTranslation = languageClass.selectTranslations().get(languageKey);
		return getTranslationValue(languageTranslation);
	}
}