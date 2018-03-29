package cleon.common.resources.spec.language.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Language extends DynamicResource implements ILanguage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILanguage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILanguage>() {
    
    @Override
    public ILanguage create() {
      return new Language();
    }
    
    @Override
    public ILanguage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Language(resourceRepository, resource);
    }
  
  };

  public Language() {
    super(ILanguage.TYPE_ID);
  }
  
  public Language(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILanguage.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectCode() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.language.LanguagePackage.Language_Code);
  }
    
  public void setCode(java.lang.String code) {
     _setSingleAttribute(cleon.common.resources.spec.language.LanguagePackage.Language_Code, code);
  }

  @Override
  public java.lang.String selectISOLanguageName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.language.LanguagePackage.Language_ISOLanguageName);
  }
    
  public void setISOLanguageName(java.lang.String iSOLanguageName) {
     _setSingleAttribute(cleon.common.resources.spec.language.LanguagePackage.Language_ISOLanguageName, iSOLanguageName);
  }

  @Override
  public java.lang.String selectLanguageFamily() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.language.LanguagePackage.Language_LanguageFamily);
  }
    
  public void setLanguageFamily(java.lang.String languageFamily) {
     _setSingleAttribute(cleon.common.resources.spec.language.LanguagePackage.Language_LanguageFamily, languageFamily);
  }

  @Override
  public java.lang.String selectNativeName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.language.LanguagePackage.Language_NativeName);
  }
    
  public void setNativeName(java.lang.String nativeName) {
     _setSingleAttribute(cleon.common.resources.spec.language.LanguagePackage.Language_NativeName, nativeName);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Language setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.language.LanguagePackage.Language_Code, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.language.LanguagePackage.Language_ISOLanguageName, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.language.LanguagePackage.Language_LanguageFamily, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.language.LanguagePackage.Language_NativeName, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7ac6b9d2-3334-11e8-a9fe-87ba35d8f5c4,dg+tXrxIz4yJ+kbdBw5D7Umt51A=] */
