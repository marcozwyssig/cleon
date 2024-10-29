package cleon.common.language.metamodel.spec.name.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class LanguageNameTranslation extends DynamicResource implements ILanguageNameTranslation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILanguageNameTranslation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILanguageNameTranslation>() {
    
    @Override
    public ILanguageNameTranslation create() {
      return new LanguageNameTranslation();
    }
    
    @Override
    public ILanguageNameTranslation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new LanguageNameTranslation(resourceRepository, resource);
    }
  
  };

  public LanguageNameTranslation() {
    super(ILanguageNameTranslation.TYPE_ID);
  }
  
  public LanguageNameTranslation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILanguageNameTranslation.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public cleon.common.language.metamodel.spec.language.javamodel.ILanguage selectLanguage() {
    return _getSingle(cleon.common.language.metamodel.spec.language.javamodel.ILanguage.class, cleon.common.language.metamodel.spec.name.NamePackage.LanguageNameTranslation_language);
  }

  public LanguageNameTranslation setLanguage(cleon.common.language.metamodel.spec.language.javamodel.ILanguage language) {
    _setSingle(cleon.common.language.metamodel.spec.name.NamePackage.LanguageNameTranslation_language, language);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public LanguageNameTranslation setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public LanguageNameTranslation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.common.language.metamodel.spec.language.javamodel.ILanguage.class, cleon.common.language.metamodel.spec.name.NamePackage.LanguageNameTranslation_language, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.common.language.metamodel.spec.name.javamodel.ILanguageNameTranslation> selectToMeLanguage(cleon.common.language.metamodel.spec.language.javamodel.ILanguage object) {
    return _getToMeList(object.getRepository(), cleon.common.language.metamodel.spec.name.javamodel.ILanguageNameTranslation.class, cleon.common.language.metamodel.spec.name.NamePackage.LanguageNameTranslation_language, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,27d0007a-3360-11e8-a9fe-87ba35d8f5c4,c9ifOAXh3/uInN3chPC3jRXHdzk=] */
