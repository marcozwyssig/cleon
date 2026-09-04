package cleon.common.doc.metamodel.spec.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class LanguageTextTranslation extends DynamicResource implements ILanguageTextTranslation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILanguageTextTranslation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILanguageTextTranslation>() {
    
    @Override
    public ILanguageTextTranslation create() {
      return new LanguageTextTranslation();
    }
    
    @Override
    public ILanguageTextTranslation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new LanguageTextTranslation(resourceRepository, resource);
    }
  
  };

  public LanguageTextTranslation() {
    super(ILanguageTextTranslation.TYPE_ID);
  }
  
  public LanguageTextTranslation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILanguageTextTranslation.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectMd5() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.language.metamodel.spec.translation.TranslationPackage.AbstractTranslation_md5);
  }
    
  public void setMd5(java.lang.String md5) {
     _setSingleAttribute(cleon.common.language.metamodel.spec.translation.TranslationPackage.AbstractTranslation_md5, md5);
  }

  @Override
  public java.lang.String selectMd5_origin() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.language.metamodel.spec.translation.TranslationPackage.AbstractTranslation_md5_aE_origin);
  }
    
  public void setMd5_origin(java.lang.String md5_origin) {
     _setSingleAttribute(cleon.common.language.metamodel.spec.translation.TranslationPackage.AbstractTranslation_md5_aE_origin, md5_origin);
  }

  @Override
  public java.lang.String selectText() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.LanguageTextTranslation_text);
  }
    
  public void setText(java.lang.String text) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.LanguageTextTranslation_text, text);
  }

  // relations
  
  @Override
  public cleon.common.language.metamodel.spec.languages.javamodel.ILanguage selectLanguage() {
    return _getSingle(cleon.common.language.metamodel.spec.languages.javamodel.ILanguage.class, cleon.common.language.metamodel.spec.translation.TranslationPackage.AbstractTranslation_language);
  }

  public LanguageTextTranslation setLanguage(cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language) {
    _setSingle(cleon.common.language.metamodel.spec.translation.TranslationPackage.AbstractTranslation_language, language);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public LanguageTextTranslation setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public LanguageTextTranslation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.language.metamodel.spec.translation.TranslationPackage.AbstractTranslation_md5, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.language.metamodel.spec.translation.TranslationPackage.AbstractTranslation_md5_aE_origin, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.LanguageTextTranslation_text, visitor);
    // relations
    _acceptSingle(cleon.common.language.metamodel.spec.languages.javamodel.ILanguage.class, cleon.common.language.metamodel.spec.translation.TranslationPackage.AbstractTranslation_language, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dfa128bc-9def-11ef-970e-cda72e282c65,HYbU0hpHqSgkLpqRYokewKRG3bk=] */
