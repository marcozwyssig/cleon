package cleon.common.language.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MultilingualNameWithLanguageSettings extends DynamicResource implements IMultilingualNameWithLanguageSettings {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMultilingualNameWithLanguageSettings> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMultilingualNameWithLanguageSettings>() {
    
    @Override
    public IMultilingualNameWithLanguageSettings create() {
      return new MultilingualNameWithLanguageSettings();
    }
    
    @Override
    public IMultilingualNameWithLanguageSettings create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MultilingualNameWithLanguageSettings(resourceRepository, resource);
    }
  
  };

  public MultilingualNameWithLanguageSettings() {
    super(IMultilingualNameWithLanguageSettings.TYPE_ID);
  }
  
  public MultilingualNameWithLanguageSettings(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMultilingualNameWithLanguageSettings.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageName> selectDefaultName() {
    return _getMap(cleon.common.language.metamodel.spec.javamodel.ILanguageName.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_defaultName);
  }

  public MultilingualNameWithLanguageSettings setDefaultName(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageName> defaultName) {
    _setMap(cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_defaultName, defaultName);
    return this;
  }
    
  @Override
  public cleon.common.language.metamodel.spec.javamodel.ILanguageSettings selectLanguageSettings() {
    return _getSingle(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings);
  }

  public MultilingualNameWithLanguageSettings setLanguageSettings(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings languageSettings) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings, languageSettings);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageName> selectNames() {
    return _getMap(cleon.common.language.metamodel.spec.javamodel.ILanguageName.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_names);
  }

  public MultilingualNameWithLanguageSettings setNames(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageName> names) {
    _setMap(cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_names, names);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MultilingualNameWithLanguageSettings setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.common.language.metamodel.spec.javamodel.ILanguageName.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_defaultName, visitor);
    _acceptSingle(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.javamodel.ILanguageName.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_names, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7164f4d7-cd42-11ec-85c9-011c467ea292,g5C9OPuAX7xvHre4kU/EBgxu6+I=] */
