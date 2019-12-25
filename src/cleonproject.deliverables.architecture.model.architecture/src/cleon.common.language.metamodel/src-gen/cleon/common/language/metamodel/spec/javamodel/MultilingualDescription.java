package cleon.common.language.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MultilingualDescription extends DynamicResource implements IMultilingualDescription {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMultilingualDescription> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMultilingualDescription>() {
    
    @Override
    public IMultilingualDescription create() {
      return new MultilingualDescription();
    }
    
    @Override
    public IMultilingualDescription create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MultilingualDescription(resourceRepository, resource);
    }
  
  };

  public MultilingualDescription() {
    super(IMultilingualDescription.TYPE_ID);
  }
  
  public MultilingualDescription(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMultilingualDescription.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageDescription> selectDefaultDescription() {
    return _getMap(cleon.common.language.metamodel.spec.javamodel.ILanguageDescription.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualDescription_defaultDescription);
  }

  public MultilingualDescription setDefaultDescription(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageDescription> defaultDescription) {
    _setMap(cleon.common.language.metamodel.spec.SpecPackage.MultilingualDescription_defaultDescription, defaultDescription);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageDescription> selectDescription() {
    return _getMap(cleon.common.language.metamodel.spec.javamodel.ILanguageDescription.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualDescription_description);
  }

  public MultilingualDescription setDescription(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageDescription> description) {
    _setMap(cleon.common.language.metamodel.spec.SpecPackage.MultilingualDescription_description, description);
    return this;
  }
    
  @Override
  public cleon.common.language.metamodel.spec.javamodel.ILanguageSettings selectLanguageSettings() {
    return _getSingle(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractMultilingual_languageSettings);
  }

  public MultilingualDescription setLanguageSettings(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings languageSettings) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.AbstractMultilingual_languageSettings, languageSettings);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MultilingualDescription setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.common.language.metamodel.spec.javamodel.ILanguageDescription.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualDescription_defaultDescription, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.javamodel.ILanguageDescription.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualDescription_description, visitor);
    _acceptSingle(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractMultilingual_languageSettings, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.common.language.metamodel.spec.javamodel.IMultilingualDescription selectToMeDefaultDescription(cleon.common.language.metamodel.spec.javamodel.ILanguageDescription object) {
    return _getToMeSingle(object.getRepository(), cleon.common.language.metamodel.spec.javamodel.IMultilingualDescription.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualDescription_defaultDescription, object.getResource());
  }
  
  public static cleon.common.language.metamodel.spec.javamodel.IMultilingualDescription selectToMeDescription(cleon.common.language.metamodel.spec.javamodel.ILanguageDescription object) {
    return _getToMeSingle(object.getRepository(), cleon.common.language.metamodel.spec.javamodel.IMultilingualDescription.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualDescription_description, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a9e3052c-335e-11e8-a9fe-87ba35d8f5c4,PxeUQLizIE7NMgEFeXuatW1iKko=] */
