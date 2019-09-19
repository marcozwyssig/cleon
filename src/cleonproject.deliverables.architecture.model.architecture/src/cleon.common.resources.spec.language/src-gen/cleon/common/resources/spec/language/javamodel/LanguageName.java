package cleon.common.resources.spec.language.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class LanguageName extends DynamicResource implements ILanguageName {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILanguageName> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILanguageName>() {
    
    @Override
    public ILanguageName create() {
      return new LanguageName();
    }
    
    @Override
    public ILanguageName create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new LanguageName(resourceRepository, resource);
    }
  
  };

  public LanguageName() {
    super(ILanguageName.TYPE_ID);
  }
  
  public LanguageName(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILanguageName.TYPE_ID);
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
  public cleon.common.resources.spec.language.javamodel.ILanguage selectLanguage() {
    return _getSingle(cleon.common.resources.spec.language.javamodel.ILanguage.class, cleon.common.resources.spec.language.LanguagePackage.LanguageName_language);
  }

  public LanguageName setLanguage(cleon.common.resources.spec.language.javamodel.ILanguage language) {
    _setSingle(cleon.common.resources.spec.language.LanguagePackage.LanguageName_language, language);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public LanguageName setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public LanguageName setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.common.resources.spec.language.javamodel.ILanguage.class, cleon.common.resources.spec.language.LanguagePackage.LanguageName_language, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.common.resources.spec.language.javamodel.ILanguageName> selectToMeLanguage(cleon.common.resources.spec.language.javamodel.ILanguage object) {
    return _getToMeList(object.getRepository(), cleon.common.resources.spec.language.javamodel.ILanguageName.class, cleon.common.resources.spec.language.LanguagePackage.LanguageName_language, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,27d0007a-3360-11e8-a9fe-87ba35d8f5c4,jc0hqpIo7ytNU3jzYqjaG3n8oUE=] */
