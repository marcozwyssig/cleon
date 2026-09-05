package cleon.common.language.metamodel.spec;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7b8a1045-3361-11e8-a9fe-87ba35d8f5c4,imports]] */
import cleon.common.language.metamodel.spec.languages.InstancesModel;
import cleon.common.resources.metamodel.spec.literals.StringFunctionSpace;
import cleon.common.language.metamodel.spec.javamodel.ResolveTranslationService;
import ch.actifsource.core.job.Select;
/* End Protected Region   [[7b8a1045-3361-11e8-a9fe-87ba35d8f5c4,imports]] */

public class FunctionSpace_Language {

  /* Begin Protected Region [[7b8a1045-3361-11e8-a9fe-87ba35d8f5c4]] */

  /* End Protected Region   [[7b8a1045-3361-11e8-a9fe-87ba35d8f5c4]] */


  public static interface ILanguageSettingsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("83f97c59-3361-11e8-a9fe-87ba35d8f5c4")
    public java.lang.String formatLanguages();

    @IDynamicResourceExtension.MethodId("4d70765d-9856-11ef-9d7c-b5806d5ad1be")
    public List<cleon.common.language.metamodel.spec.languages.javamodel.ILanguage> AllLanguages();

    @IDynamicResourceExtension.MethodId("1a04a259-9858-11ef-9d7c-b5806d5ad1be")
    public java.lang.String SimpleName();

  }
  
  public static interface ILanguageSettingsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LanguageSettingsFunctionsImpl implements ILanguageSettingsFunctionsImpl {

    public static final ILanguageSettingsFunctionsImpl INSTANCE = new LanguageSettingsFunctionsImpl();

    private LanguageSettingsFunctionsImpl() {}

  }
  
  public static class LanguageSettingsFunctions {

    private LanguageSettingsFunctions() {}

  }

  public static interface IMultilingualDescriptionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a441e094-f382-11ea-9268-b5c52a12d7f9")
    public java.lang.String translateDescriptionDe();

    @IDynamicResourceExtension.MethodId("3ca8bf73-d22c-11ee-b255-49ab47716ebd")
    public java.lang.String translateDescriptionEn();

    @IDynamicResourceExtension.MethodId("74641b99-9dd4-11ef-8e7d-336090501e1a")
    public java.lang.String translateDescription(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IMultilingualDescriptionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("a441e094-f382-11ea-9268-b5c52a12d7f9")
    public java.lang.String translateDescriptionDe(final cleon.common.language.metamodel.spec.translation.description.javamodel.IMultilingualDescription multilingualDescription);

    @IDynamicResourceExtension.MethodId("3ca8bf73-d22c-11ee-b255-49ab47716ebd")
    public java.lang.String translateDescriptionEn(final cleon.common.language.metamodel.spec.translation.description.javamodel.IMultilingualDescription multilingualDescription);

    @IDynamicResourceExtension.MethodId("74641b99-9dd4-11ef-8e7d-336090501e1a")
    public java.lang.String translateDescription(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language, final cleon.common.language.metamodel.spec.translation.description.javamodel.IMultilingualDescription multilingualDescription);

  }
  
  public static class MultilingualDescriptionFunctionsImpl implements IMultilingualDescriptionFunctionsImpl {

    public static final IMultilingualDescriptionFunctionsImpl INSTANCE = new MultilingualDescriptionFunctionsImpl();

    private MultilingualDescriptionFunctionsImpl() {}

    @Override
    public java.lang.String translateDescriptionDe(final cleon.common.language.metamodel.spec.translation.description.javamodel.IMultilingualDescription multilingualDescription) {
      /* Begin Protected Region [[a441e094-f382-11ea-9268-b5c52a12d7f9]] */
      if( multilingualDescription.selectDescriptionTranslation().containsKey(InstancesModel.de__F___S___F_German)) {
      	final var description = multilingualDescription.selectDescriptionTranslation().get(InstancesModel.de__F___S___F_German);
      	return String.join("\n", description.selectDescriptions());
      }
      return StringFunctionSpace.StringLiteralFunctionsImpl.INSTANCE.combine(multilingualDescription.selectDescriptions());
      /* End Protected Region   [[a441e094-f382-11ea-9268-b5c52a12d7f9]] */
    }

    @Override
    public java.lang.String translateDescriptionEn(final cleon.common.language.metamodel.spec.translation.description.javamodel.IMultilingualDescription multilingualDescription) {
      /* Begin Protected Region [[3ca8bf73-d22c-11ee-b255-49ab47716ebd]] */
      if( multilingualDescription.selectDescriptionTranslation().containsKey(InstancesModel.en__F___S___F_English)) {
      	final var description = multilingualDescription.selectDescriptionTranslation().get(InstancesModel.en__F___S___F_English);
      	return String.join("\n", description.selectDescriptions());
      }
      return StringFunctionSpace.StringLiteralFunctionsImpl.INSTANCE.combine(multilingualDescription.selectDescriptions());
      /* End Protected Region   [[3ca8bf73-d22c-11ee-b255-49ab47716ebd]] */
    }

    @Override
    public java.lang.String translateDescription(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language, final cleon.common.language.metamodel.spec.translation.description.javamodel.IMultilingualDescription multilingualDescription) {
      /* Begin Protected Region [[74641b99-9dd4-11ef-8e7d-336090501e1a]] */
	  if(multilingualDescription.selectDescriptions() == null || multilingualDescription.selectDescriptions().isEmpty()) {
		  return null;
	  }
		
	  if( multilingualDescription.selectDescriptionTranslation().containsKey(language.getResource())) {
	  	final var description = multilingualDescription.selectDescriptionTranslation().get(language.getResource());
	  	return String.join("\n", description.selectDescriptions());
	  }
	  return StringFunctionSpace.StringLiteralFunctionsImpl.INSTANCE.combine(System.lineSeparator(), multilingualDescription.selectDescriptions());
      /* End Protected Region   [[74641b99-9dd4-11ef-8e7d-336090501e1a]] */
    }

  }
  
  public static class MultilingualDescriptionFunctions {

    private MultilingualDescriptionFunctions() {}

    public static java.lang.String translateDescriptionDe(final cleon.common.language.metamodel.spec.translation.description.javamodel.IMultilingualDescription multilingualDescription) {
      return DynamicResourceUtil.invoke(IMultilingualDescriptionFunctionsImpl.class, MultilingualDescriptionFunctionsImpl.INSTANCE, multilingualDescription).translateDescriptionDe(multilingualDescription);
    }

    public static java.lang.String translateDescriptionEn(final cleon.common.language.metamodel.spec.translation.description.javamodel.IMultilingualDescription multilingualDescription) {
      return DynamicResourceUtil.invoke(IMultilingualDescriptionFunctionsImpl.class, MultilingualDescriptionFunctionsImpl.INSTANCE, multilingualDescription).translateDescriptionEn(multilingualDescription);
    }

    public static java.lang.String translateDescription(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language, final cleon.common.language.metamodel.spec.translation.description.javamodel.IMultilingualDescription multilingualDescription) {
      return DynamicResourceUtil.invoke(IMultilingualDescriptionFunctionsImpl.class, MultilingualDescriptionFunctionsImpl.INSTANCE, multilingualDescription).translateDescription(language, multilingualDescription);
    }

  }

  public static interface IMultilingualNameFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("47e137a4-d22c-11ee-b255-49ab47716ebd")
    public java.lang.String translateNameDe();

    @IDynamicResourceExtension.MethodId("47e137a6-d22c-11ee-b255-49ab47716ebd")
    public java.lang.String translateNameEn();

    @IDynamicResourceExtension.MethodId("626c3d20-0f01-11f0-b76f-5998f6696fc7")
    public java.lang.String translateName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("98d4283f-8323-11f0-9a84-89dbde45d60f")
    public java.lang.String translateNameWithCurrentLanguage();

    @IDynamicResourceExtension.MethodId("99d566b5-a299-11ef-9aea-bfda14a4d373")
    public java.lang.String translateSimpleName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IMultilingualNameFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("47e137a4-d22c-11ee-b255-49ab47716ebd")
    public java.lang.String translateNameDe(final cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName multilingualName);

    @IDynamicResourceExtension.MethodId("47e137a6-d22c-11ee-b255-49ab47716ebd")
    public java.lang.String translateNameEn(final cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName multilingualName);

    @IDynamicResourceExtension.MethodId("626c3d20-0f01-11f0-b76f-5998f6696fc7")
    public java.lang.String translateName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language, final cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName multilingualName);

    @IDynamicResourceExtension.MethodId("98d4283f-8323-11f0-9a84-89dbde45d60f")
    public java.lang.String translateNameWithCurrentLanguage(final cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName multilingualName);

    @IDynamicResourceExtension.MethodId("99d566b5-a299-11ef-9aea-bfda14a4d373")
    public java.lang.String translateSimpleName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language, final cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName multilingualName);

  }
  
  public static class MultilingualNameFunctionsImpl implements IMultilingualNameFunctionsImpl {

    public static final IMultilingualNameFunctionsImpl INSTANCE = new MultilingualNameFunctionsImpl();

    private MultilingualNameFunctionsImpl() {}

    @Override
    public java.lang.String translateNameDe(final cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName multilingualName) {
      /* Begin Protected Region [[47e137a4-d22c-11ee-b255-49ab47716ebd]] */
      if( multilingualName.selectNameTranslation().containsKey(InstancesModel.de__F___S___F_German)) {
      	final var name = multilingualName.selectNameTranslation().get(InstancesModel.de__F___S___F_German);
      	return String.join("\n", name.selectName());
      }
      return multilingualName.selectName();
      /* End Protected Region   [[47e137a4-d22c-11ee-b255-49ab47716ebd]] */
    }

    @Override
    public java.lang.String translateNameEn(final cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName multilingualName) {
      /* Begin Protected Region [[47e137a6-d22c-11ee-b255-49ab47716ebd]] */
      if( multilingualName.selectNameTranslation().containsKey(InstancesModel.en__F___S___F_English)) {
      	final var name = multilingualName.selectNameTranslation().get(InstancesModel.en__F___S___F_English);
      	return String.join("\n", name.selectName());
      }
      return multilingualName.selectName();
      /* End Protected Region   [[47e137a6-d22c-11ee-b255-49ab47716ebd]] */
    }

    @Override
    public java.lang.String translateName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language, final cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName multilingualName) {
      /* Begin Protected Region [[626c3d20-0f01-11f0-b76f-5998f6696fc7]] */
        final var resolveTranslationService = new ResolveTranslationService(multilingualName);
        return resolveTranslationService.translate(language, x -> {
        	if (multilingualName.selectNameTranslation().isEmpty()) {
        		return Select.simpleName(multilingualName.getReadJobExecutor(), multilingualName.getResource());
        	}
        	
            if( multilingualName.selectNameTranslation().containsKey(language.getResource())) {
              	final var name = multilingualName.selectNameTranslation().get(language.getResource());
              	return name.selectName();
              }
            return multilingualName.selectName();   
        });     	
      /* End Protected Region   [[626c3d20-0f01-11f0-b76f-5998f6696fc7]] */
    }

    @Override
    public java.lang.String translateNameWithCurrentLanguage(final cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName multilingualName) {
      /* Begin Protected Region [[98d4283f-8323-11f0-9a84-89dbde45d60f]] */
        final var resolveTranslationService = new ResolveTranslationService(multilingualName);
        return resolveTranslationService.translate(x -> {       	
        	for (var translation : multilingualName.selectNameTranslation().values()) {
        		if( translation.selectLanguage().selectCode().equals(x)) {
        			return translation.selectName(); 
        		}
        	}
        	
            return multilingualName.selectName();
        });
      /* End Protected Region   [[98d4283f-8323-11f0-9a84-89dbde45d60f]] */
    }

    @Override
    public java.lang.String translateSimpleName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language, final cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName multilingualName) {
      /* Begin Protected Region [[99d566b5-a299-11ef-9aea-bfda14a4d373]] */
        final var resolveTranslationService = new ResolveTranslationService(multilingualName);
        return resolveTranslationService.translate(language, x -> {
        	if (multilingualName.selectNameTranslation().isEmpty()) {
        		return Select.simpleName(multilingualName.getReadJobExecutor(), multilingualName.getResource());
        	}
        	
            if( multilingualName.selectNameTranslation().containsKey(language.getResource())) {
              	final var name = multilingualName.selectNameTranslation().get(language.getResource());
              	return name.selectName();
              }
            return multilingualName.selectName();   
        });     	
      /* End Protected Region   [[99d566b5-a299-11ef-9aea-bfda14a4d373]] */
    }

  }
  
  public static class MultilingualNameFunctions {

    private MultilingualNameFunctions() {}

    public static java.lang.String translateNameDe(final cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName multilingualName) {
      return DynamicResourceUtil.invoke(IMultilingualNameFunctionsImpl.class, MultilingualNameFunctionsImpl.INSTANCE, multilingualName).translateNameDe(multilingualName);
    }

    public static java.lang.String translateNameEn(final cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName multilingualName) {
      return DynamicResourceUtil.invoke(IMultilingualNameFunctionsImpl.class, MultilingualNameFunctionsImpl.INSTANCE, multilingualName).translateNameEn(multilingualName);
    }

    public static java.lang.String translateName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language, final cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName multilingualName) {
      return DynamicResourceUtil.invoke(IMultilingualNameFunctionsImpl.class, MultilingualNameFunctionsImpl.INSTANCE, multilingualName).translateName(language, multilingualName);
    }

    public static java.lang.String translateNameWithCurrentLanguage(final cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName multilingualName) {
      return DynamicResourceUtil.invoke(IMultilingualNameFunctionsImpl.class, MultilingualNameFunctionsImpl.INSTANCE, multilingualName).translateNameWithCurrentLanguage(multilingualName);
    }

    public static java.lang.String translateSimpleName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language, final cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName multilingualName) {
      return DynamicResourceUtil.invoke(IMultilingualNameFunctionsImpl.class, MultilingualNameFunctionsImpl.INSTANCE, multilingualName).translateSimpleName(language, multilingualName);
    }

  }

  public static interface IAbstractMultilingualFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5dc9f105-cd3c-11ec-85c9-011c467ea292")
    public cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings LanguageSettings();

  }
  
  public static interface IAbstractMultilingualFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractMultilingualFunctionsImpl implements IAbstractMultilingualFunctionsImpl {

    public static final IAbstractMultilingualFunctionsImpl INSTANCE = new AbstractMultilingualFunctionsImpl();

    private AbstractMultilingualFunctionsImpl() {}

  }
  
  public static class AbstractMultilingualFunctions {

    private AbstractMultilingualFunctions() {}

  }

  public static interface IMultilingualNameWithLanguageSettingsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("92a82004-cd42-11ec-85c9-011c467ea292")
    public cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings LanguageSettings();

  }
  
  public static interface IMultilingualNameWithLanguageSettingsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MultilingualNameWithLanguageSettingsFunctionsImpl implements IMultilingualNameWithLanguageSettingsFunctionsImpl {

    public static final IMultilingualNameWithLanguageSettingsFunctionsImpl INSTANCE = new MultilingualNameWithLanguageSettingsFunctionsImpl();

    private MultilingualNameWithLanguageSettingsFunctionsImpl() {}

  }
  
  public static class MultilingualNameWithLanguageSettingsFunctions {

    private MultilingualNameWithLanguageSettingsFunctions() {}

  }

  public static interface IMultilingualDescriptionWithLanguageSettingsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fccce81d-cd44-11ec-85c9-011c467ea292")
    public cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings LanguageSettings();

  }
  
  public static interface IMultilingualDescriptionWithLanguageSettingsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MultilingualDescriptionWithLanguageSettingsFunctionsImpl implements IMultilingualDescriptionWithLanguageSettingsFunctionsImpl {

    public static final IMultilingualDescriptionWithLanguageSettingsFunctionsImpl INSTANCE = new MultilingualDescriptionWithLanguageSettingsFunctionsImpl();

    private MultilingualDescriptionWithLanguageSettingsFunctionsImpl() {}

  }
  
  public static class MultilingualDescriptionWithLanguageSettingsFunctions {

    private MultilingualDescriptionWithLanguageSettingsFunctions() {}

  }

  public static interface IAbstractLanguageSettingsAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("41427efa-c5ea-11ee-a17d-a7a71cc7c14b")
    public java.lang.String PrimaryLanguage();

  }
  
  public static interface IAbstractLanguageSettingsAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractLanguageSettingsAwareFunctionsImpl implements IAbstractLanguageSettingsAwareFunctionsImpl {

    public static final IAbstractLanguageSettingsAwareFunctionsImpl INSTANCE = new AbstractLanguageSettingsAwareFunctionsImpl();

    private AbstractLanguageSettingsAwareFunctionsImpl() {}

  }
  
  public static class AbstractLanguageSettingsAwareFunctions {

    private AbstractLanguageSettingsAwareFunctions() {}

  }

  public static interface IResourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8a21d594-c5f0-11ee-a17d-a7a71cc7c14b")
    public java.lang.String translateSimpleNameWithCurrentLanguage();

    @IDynamicResourceExtension.MethodId("17e0f1f3-9dc9-11ef-8e7d-336090501e1a")
    public java.lang.String translateSimpleName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("4ea7607c-b932-11ef-bd66-85d6377e7c75")
    public java.lang.String translateSimpleNameDe();

    @IDynamicResourceExtension.MethodId("5f84d9a8-b932-11ef-bd66-85d6377e7c75")
    public java.lang.String translateSimpleNameEn();

  }
  
  public static interface IResourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8a21d594-c5f0-11ee-a17d-a7a71cc7c14b")
    public java.lang.String translateSimpleNameWithCurrentLanguage(final ch.actifsource.core.javamodel.IResource resource);

    @IDynamicResourceExtension.MethodId("17e0f1f3-9dc9-11ef-8e7d-336090501e1a")
    public java.lang.String translateSimpleName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language, final ch.actifsource.core.javamodel.IResource resource);

    @IDynamicResourceExtension.MethodId("4ea7607c-b932-11ef-bd66-85d6377e7c75")
    public java.lang.String translateSimpleNameDe(final ch.actifsource.core.javamodel.IResource resource);

    @IDynamicResourceExtension.MethodId("5f84d9a8-b932-11ef-bd66-85d6377e7c75")
    public java.lang.String translateSimpleNameEn(final ch.actifsource.core.javamodel.IResource resource);

  }
  
  public static class ResourceFunctionsImpl implements IResourceFunctionsImpl {

    public static final IResourceFunctionsImpl INSTANCE = new ResourceFunctionsImpl();

    private ResourceFunctionsImpl() {}

    @Override
    public java.lang.String translateSimpleNameWithCurrentLanguage(final ch.actifsource.core.javamodel.IResource resource) {
      /* Begin Protected Region [[8a21d594-c5f0-11ee-a17d-a7a71cc7c14b]] */
      final var resolveTranslationService = new ResolveTranslationService(resource);
      return resolveTranslationService.translate();
      /* End Protected Region   [[8a21d594-c5f0-11ee-a17d-a7a71cc7c14b]] */
    }

    @Override
    public java.lang.String translateSimpleName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language, final ch.actifsource.core.javamodel.IResource resource) {
      /* Begin Protected Region [[17e0f1f3-9dc9-11ef-8e7d-336090501e1a]] */
      final var resolveTranslationService = new ResolveTranslationService(resource);
      return resolveTranslationService.translate(language);
      /* End Protected Region   [[17e0f1f3-9dc9-11ef-8e7d-336090501e1a]] */
    }

    @Override
    public java.lang.String translateSimpleNameDe(final ch.actifsource.core.javamodel.IResource resource) {
      /* Begin Protected Region [[4ea7607c-b932-11ef-bd66-85d6377e7c75]] */
        final var resolveTranslationService = new ResolveTranslationService(resource);
        return resolveTranslationService.translate(InstancesModel.de__F___S___F_German);   
      /* End Protected Region   [[4ea7607c-b932-11ef-bd66-85d6377e7c75]] */
    }

    @Override
    public java.lang.String translateSimpleNameEn(final ch.actifsource.core.javamodel.IResource resource) {
      /* Begin Protected Region [[5f84d9a8-b932-11ef-bd66-85d6377e7c75]] */
        final var resolveTranslationService = new ResolveTranslationService(resource);
        return resolveTranslationService.translate(InstancesModel.en__F___S___F_English);      
      /* End Protected Region   [[5f84d9a8-b932-11ef-bd66-85d6377e7c75]] */
    }

  }
  
  public static class ResourceFunctions {

    private ResourceFunctions() {}

    public static java.lang.String translateSimpleNameWithCurrentLanguage(final ch.actifsource.core.javamodel.IResource resource) {
      return DynamicResourceUtil.invoke(IResourceFunctionsImpl.class, ResourceFunctionsImpl.INSTANCE, resource).translateSimpleNameWithCurrentLanguage(resource);
    }

    public static java.lang.String translateSimpleName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language, final ch.actifsource.core.javamodel.IResource resource) {
      return DynamicResourceUtil.invoke(IResourceFunctionsImpl.class, ResourceFunctionsImpl.INSTANCE, resource).translateSimpleName(language, resource);
    }

    public static java.lang.String translateSimpleNameDe(final ch.actifsource.core.javamodel.IResource resource) {
      return DynamicResourceUtil.invoke(IResourceFunctionsImpl.class, ResourceFunctionsImpl.INSTANCE, resource).translateSimpleNameDe(resource);
    }

    public static java.lang.String translateSimpleNameEn(final ch.actifsource.core.javamodel.IResource resource) {
      return DynamicResourceUtil.invoke(IResourceFunctionsImpl.class, ResourceFunctionsImpl.INSTANCE, resource).translateSimpleNameEn(resource);
    }

  }

  public static interface IAbstractTranslationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5afebf57-97a4-11ef-a385-611913ad635b")
    public java.lang.String OriginText();

    @IDynamicResourceExtension.MethodId("76af884e-9dae-11ef-b12a-15e52f90bd0b")
    public cleon.common.language.metamodel.spec.languages.javamodel.ILanguage SourceLanguage();

    @IDynamicResourceExtension.MethodId("bc796fff-9dae-11ef-b12a-15e52f90bd0b")
    public cleon.common.language.metamodel.spec.languages.javamodel.ILanguage TargetLanguage();

  }
  
  public static interface IAbstractTranslationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractTranslationFunctionsImpl implements IAbstractTranslationFunctionsImpl {

    public static final IAbstractTranslationFunctionsImpl INSTANCE = new AbstractTranslationFunctionsImpl();

    private AbstractTranslationFunctionsImpl() {}

  }
  
  public static class AbstractTranslationFunctions {

    private AbstractTranslationFunctions() {}

  }

  public static interface ILanguageNameTranslationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("22e6b038-97ab-11ef-9bd3-25e6f963be24")
    public java.lang.String OriginText();

    @IDynamicResourceExtension.MethodId("7a0235c9-9dae-11ef-b12a-15e52f90bd0b")
    public cleon.common.language.metamodel.spec.languages.javamodel.ILanguage SourceLanguage();

  }
  
  public static interface ILanguageNameTranslationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LanguageNameTranslationFunctionsImpl implements ILanguageNameTranslationFunctionsImpl {

    public static final ILanguageNameTranslationFunctionsImpl INSTANCE = new LanguageNameTranslationFunctionsImpl();

    private LanguageNameTranslationFunctionsImpl() {}

  }
  
  public static class LanguageNameTranslationFunctions {

    private LanguageNameTranslationFunctions() {}

  }

  public static interface ILanguageDescriptionTranslationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("332418f3-97ab-11ef-9bd3-25e6f963be24")
    public java.lang.String OriginText();

    @IDynamicResourceExtension.MethodId("8b8f0191-9dae-11ef-b12a-15e52f90bd0b")
    public cleon.common.language.metamodel.spec.languages.javamodel.ILanguage SourceLanguage();

  }
  
  public static interface ILanguageDescriptionTranslationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LanguageDescriptionTranslationFunctionsImpl implements ILanguageDescriptionTranslationFunctionsImpl {

    public static final ILanguageDescriptionTranslationFunctionsImpl INSTANCE = new LanguageDescriptionTranslationFunctionsImpl();

    private LanguageDescriptionTranslationFunctionsImpl() {}

  }
  
  public static class LanguageDescriptionTranslationFunctions {

    private LanguageDescriptionTranslationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7b8a1045-3361-11e8-a9fe-87ba35d8f5c4,2QFtLYVh65oCSMkur1Hz+UB5Tts=] */
