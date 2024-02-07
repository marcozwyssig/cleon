package cleon.common.language.metamodel.spec.name.javamodel;

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

  // attributes
  
  @Override
  public java.lang.String selectCurrentLanguageCode() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_currentLanguageCode);
  }
    
  public void setCurrentLanguageCode(java.lang.String currentLanguageCode) {
     _setSingleAttribute(cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_currentLanguageCode, currentLanguageCode);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings selectLanguageSettings() {
    return _getSingle(cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings);
  }

  public MultilingualNameWithLanguageSettings setLanguageSettings(cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings languageSettings) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings, languageSettings);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.name.javamodel.ILanguageNameTranslation> selectTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.name.javamodel.ILanguageNameTranslation.class, cleon.common.language.metamodel.spec.name.NamePackage.MultilingualName_translation);
  }

  public MultilingualNameWithLanguageSettings setTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.name.javamodel.ILanguageNameTranslation> translation) {
    _setMap(cleon.common.language.metamodel.spec.name.NamePackage.MultilingualName_translation, translation);
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
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_currentLanguageCode, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.name.javamodel.ILanguageNameTranslation.class, cleon.common.language.metamodel.spec.name.NamePackage.MultilingualName_translation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7164f4d7-cd42-11ec-85c9-011c467ea292,0J+yF2xh6cMHrv1HG/hp+H1gtl4=] */
