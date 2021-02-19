package cleon.common.language.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MultilingualName extends DynamicResource implements IMultilingualName {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMultilingualName> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMultilingualName>() {
    
    @Override
    public IMultilingualName create() {
      return new MultilingualName();
    }
    
    @Override
    public IMultilingualName create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MultilingualName(resourceRepository, resource);
    }
  
  };

  public MultilingualName() {
    super(IMultilingualName.TYPE_ID);
  }
  
  public MultilingualName(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMultilingualName.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageName> selectDefaultName() {
    return _getMap(cleon.common.language.metamodel.spec.javamodel.ILanguageName.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_defaultName);
  }

  public MultilingualName setDefaultName(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageName> defaultName) {
    _setMap(cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_defaultName, defaultName);
    return this;
  }
    
  @Override
  public cleon.common.language.metamodel.spec.javamodel.ILanguageSettings selectLanguageSettings() {
    return _getSingle(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractMultilingual_languageSettings);
  }

  public MultilingualName setLanguageSettings(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings languageSettings) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.AbstractMultilingual_languageSettings, languageSettings);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageName> selectNames() {
    return _getMap(cleon.common.language.metamodel.spec.javamodel.ILanguageName.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_names);
  }

  public MultilingualName setNames(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageName> names) {
    _setMap(cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_names, names);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MultilingualName setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.common.language.metamodel.spec.javamodel.ILanguageName.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_defaultName, visitor);
    _acceptSingle(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractMultilingual_languageSettings, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.javamodel.ILanguageName.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_names, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.common.language.metamodel.spec.javamodel.IMultilingualName selectToMeDefaultName(cleon.common.language.metamodel.spec.javamodel.ILanguageName object) {
    return _getToMeSingle(object.getRepository(), cleon.common.language.metamodel.spec.javamodel.IMultilingualName.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_defaultName, object.getResource());
  }
  
  public static cleon.common.language.metamodel.spec.javamodel.IMultilingualName selectToMeNames(cleon.common.language.metamodel.spec.javamodel.ILanguageName object) {
    return _getToMeSingle(object.getRepository(), cleon.common.language.metamodel.spec.javamodel.IMultilingualName.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_names, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1564455b-3360-11e8-a9fe-87ba35d8f5c4,Rfi5KUQ4WJuMMMYHwrA7aVkslro=] */
