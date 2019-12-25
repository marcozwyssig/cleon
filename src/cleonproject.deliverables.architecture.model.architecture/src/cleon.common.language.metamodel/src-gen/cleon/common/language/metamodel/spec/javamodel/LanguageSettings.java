package cleon.common.language.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class LanguageSettings extends DynamicResource implements ILanguageSettings {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILanguageSettings> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILanguageSettings>() {
    
    @Override
    public ILanguageSettings create() {
      return new LanguageSettings();
    }
    
    @Override
    public ILanguageSettings create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new LanguageSettings(resourceRepository, resource);
    }
  
  };

  public LanguageSettings() {
    super(ILanguageSettings.TYPE_ID);
  }
  
  public LanguageSettings(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILanguageSettings.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.language.metamodel.spec.javamodel.ILanguage selectDefaultLanguage() {
    return _getSingle(cleon.common.language.metamodel.spec.javamodel.ILanguage.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettings_defaultLanguage);
  }

  public LanguageSettings setDefaultLanguage(cleon.common.language.metamodel.spec.javamodel.ILanguage defaultLanguage) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.LanguageSettings_defaultLanguage, defaultLanguage);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.language.metamodel.spec.javamodel.ILanguage> selectLanguages() {
    return _getList(cleon.common.language.metamodel.spec.javamodel.ILanguage.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettings_languages);
  }

  public LanguageSettings setLanguages(java.util.List<? extends cleon.common.language.metamodel.spec.javamodel.ILanguage> languages) {
    _setList(cleon.common.language.metamodel.spec.SpecPackage.LanguageSettings_languages, languages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public LanguageSettings setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.language.metamodel.spec.javamodel.ILanguage.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettings_defaultLanguage, visitor);
    _acceptList(cleon.common.language.metamodel.spec.javamodel.ILanguage.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettings_languages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.common.language.metamodel.spec.javamodel.ILanguageSettings> selectToMeDefaultLanguage(cleon.common.language.metamodel.spec.javamodel.ILanguage object) {
    return _getToMeList(object.getRepository(), cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettings_defaultLanguage, object.getResource());
  }
  
  public static java.util.List<cleon.common.language.metamodel.spec.javamodel.ILanguageSettings> selectToMeLanguages(cleon.common.language.metamodel.spec.javamodel.ILanguage object) {
    return _getToMeList(object.getRepository(), cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettings_languages, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,73f7c4f5-335e-11e8-a9fe-87ba35d8f5c4,P0RIDyLFc4y6N8GYGCYigAPv8Do=] */
