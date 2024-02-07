package cleon.common.language.metamodel.spec.languageClass.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class LanguageNameAspectTranslation extends DynamicResource implements ILanguageNameAspectTranslation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILanguageNameAspectTranslation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILanguageNameAspectTranslation>() {
    
    @Override
    public ILanguageNameAspectTranslation create() {
      return new LanguageNameAspectTranslation();
    }
    
    @Override
    public ILanguageNameAspectTranslation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new LanguageNameAspectTranslation(resourceRepository, resource);
    }
  
  };

  public LanguageNameAspectTranslation() {
    super(ILanguageNameAspectTranslation.TYPE_ID);
  }
  
  public LanguageNameAspectTranslation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILanguageNameAspectTranslation.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.language.metamodel.spec.language.javamodel.ILanguage selectLanguage() {
    return _getSingle(cleon.common.language.metamodel.spec.language.javamodel.ILanguage.class, cleon.common.language.metamodel.spec.languageClass.LanguageClassPackage.LanguageNameAspectTranslation_language);
  }

  public LanguageNameAspectTranslation setLanguage(cleon.common.language.metamodel.spec.language.javamodel.ILanguage language) {
    _setSingle(cleon.common.language.metamodel.spec.languageClass.LanguageClassPackage.LanguageNameAspectTranslation_language, language);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public LanguageNameAspectTranslation setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.selector.element.javamodel.ILinkSelector selectTranslations() {
    return _getSingle(ch.actifsource.core.selector.element.javamodel.ILinkSelector.class, cleon.common.language.metamodel.spec.languageClass.LanguageClassPackage.LanguageNameAspectTranslation_translations);
  }

  public LanguageNameAspectTranslation setTranslations(ch.actifsource.core.selector.element.javamodel.ILinkSelector translations) {
    _setSingle(cleon.common.language.metamodel.spec.languageClass.LanguageClassPackage.LanguageNameAspectTranslation_translations, translations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public LanguageNameAspectTranslation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.language.metamodel.spec.language.javamodel.ILanguage.class, cleon.common.language.metamodel.spec.languageClass.LanguageClassPackage.LanguageNameAspectTranslation_language, visitor);
    _acceptSingle(ch.actifsource.core.selector.element.javamodel.ILinkSelector.class, cleon.common.language.metamodel.spec.languageClass.LanguageClassPackage.LanguageNameAspectTranslation_translations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.common.language.metamodel.spec.languageClass.javamodel.ILanguageNameAspectTranslation> selectToMeLanguage(cleon.common.language.metamodel.spec.language.javamodel.ILanguage object) {
    return _getToMeList(object.getRepository(), cleon.common.language.metamodel.spec.languageClass.javamodel.ILanguageNameAspectTranslation.class, cleon.common.language.metamodel.spec.languageClass.LanguageClassPackage.LanguageNameAspectTranslation_language, object.getResource());
  }
  
  public static cleon.common.language.metamodel.spec.languageClass.javamodel.ILanguageNameAspectTranslation selectToMeTranslations(ch.actifsource.core.selector.element.javamodel.ILinkSelector object) {
    return _getToMeSingle(object.getRepository(), cleon.common.language.metamodel.spec.languageClass.javamodel.ILanguageNameAspectTranslation.class, cleon.common.language.metamodel.spec.languageClass.LanguageClassPackage.LanguageNameAspectTranslation_translations, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,07e0a1d7-c5d2-11ee-8549-1528e55916a4,k1XJ5vlZrjUwLmIX5bNxo0XMWJA=] */
