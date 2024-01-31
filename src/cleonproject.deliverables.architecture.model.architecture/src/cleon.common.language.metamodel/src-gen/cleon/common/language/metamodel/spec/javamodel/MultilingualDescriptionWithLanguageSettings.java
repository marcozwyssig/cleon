package cleon.common.language.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MultilingualDescriptionWithLanguageSettings extends DynamicResource implements IMultilingualDescriptionWithLanguageSettings {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMultilingualDescriptionWithLanguageSettings> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMultilingualDescriptionWithLanguageSettings>() {
    
    @Override
    public IMultilingualDescriptionWithLanguageSettings create() {
      return new MultilingualDescriptionWithLanguageSettings();
    }
    
    @Override
    public IMultilingualDescriptionWithLanguageSettings create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MultilingualDescriptionWithLanguageSettings(resourceRepository, resource);
    }
  
  };

  public MultilingualDescriptionWithLanguageSettings() {
    super(IMultilingualDescriptionWithLanguageSettings.TYPE_ID);
  }
  
  public MultilingualDescriptionWithLanguageSettings(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMultilingualDescriptionWithLanguageSettings.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.common.language.metamodel.spec.javamodel.ILanguageSettings selectLanguageSettings() {
    return _getSingle(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings);
  }

  public MultilingualDescriptionWithLanguageSettings setLanguageSettings(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings languageSettings) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings, languageSettings);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageDescriptionTranslation> selectTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualDescription_translation);
  }

  public MultilingualDescriptionWithLanguageSettings setTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageDescriptionTranslation> translation) {
    _setMap(cleon.common.language.metamodel.spec.SpecPackage.MultilingualDescription_translation, translation);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MultilingualDescriptionWithLanguageSettings setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualDescription_translation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e33e3da3-cd44-11ec-85c9-011c467ea292,6XScQ5Pt711rrWsvpXBDPpEpEMo=] */
