package cleon.common.language.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class LanguageClass extends DynamicResource implements ILanguageClass {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILanguageClass> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILanguageClass>() {
    
    @Override
    public ILanguageClass create() {
      return new LanguageClass();
    }
    
    @Override
    public ILanguageClass create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new LanguageClass(resourceRepository, resource);
    }
  
  };

  public LanguageClass() {
    super(ILanguageClass.TYPE_ID);
  }
  
  public LanguageClass(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILanguageClass.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAllowRoot() {
    return _getSingleAttribute(java.lang.Boolean.class, ch.actifsource.core.CorePackage.Class_allowRoot);
  }
    
  public void setAllowRoot(java.lang.Boolean allowRoot) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Class_allowRoot, allowRoot);
  }

  @Override
  public java.lang.String selectClassIcon() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Class_classIcon);
  }
    
  public void setClassIcon(java.lang.String classIcon) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Class_classIcon, classIcon);
  }

  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
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
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends ch.actifsource.core.javamodel.IAbstractAspectImplementation> selectAspect() {
    return _getMultiMap(ch.actifsource.core.javamodel.IAbstractAspectImplementation.class, ch.actifsource.core.CorePackage.AspectProvider_aspect);
  }

  public LanguageClass setAspect(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends ch.actifsource.core.javamodel.IAbstractAspectImplementation> aspect) {
    _setMultiMap(ch.actifsource.core.CorePackage.AspectProvider_aspect, aspect);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.core.javamodel.IAspectInterface> selectDefinesAspect() {
    return _getList(ch.actifsource.core.javamodel.IAspectInterface.class, ch.actifsource.core.CorePackage.Class_definesAspect);
  }

  public LanguageClass setDefinesAspect(java.util.List<? extends ch.actifsource.core.javamodel.IAspectInterface> definesAspect) {
    _setList(ch.actifsource.core.CorePackage.Class_definesAspect, definesAspect);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.core.javamodel.IClass> selectExtends() {
    return _getList(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Class_extends);
  }

  public LanguageClass setExtends(java.util.List<? extends ch.actifsource.core.javamodel.IClass> extends_) {
    _setList(ch.actifsource.core.CorePackage.Class_extends, extends_);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IColor selectFillColor() {
    return _getSingle(ch.actifsource.core.javamodel.IColor.class, ch.actifsource.core.CorePackage.Class_fillColor);
  }

  public LanguageClass setFillColor(ch.actifsource.core.javamodel.IColor fillColor) {
    _setSingle(ch.actifsource.core.CorePackage.Class_fillColor, fillColor);
    return this;
  }
    
  @Override
  public cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings selectLanguageSettings() {
    return _getSingle(cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings);
  }

  public LanguageClass setLanguageSettings(cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings languageSettings) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings, languageSettings);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IColor selectLineColor() {
    return _getSingle(ch.actifsource.core.javamodel.IColor.class, ch.actifsource.core.CorePackage.Class_lineColor);
  }

  public LanguageClass setLineColor(ch.actifsource.core.javamodel.IColor lineColor) {
    _setSingle(ch.actifsource.core.CorePackage.Class_lineColor, lineColor);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IInheritanceModifier selectModifier() {
    return _getSingle(ch.actifsource.core.javamodel.IInheritanceModifier.class, ch.actifsource.core.CorePackage.Class_modifier);
  }

  public LanguageClass setModifier(ch.actifsource.core.javamodel.IInheritanceModifier modifier) {
    _setSingle(ch.actifsource.core.CorePackage.Class_modifier, modifier);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.name.javamodel.ILanguageNameTranslation> selectNames() {
    return _getMap(cleon.common.language.metamodel.spec.name.javamodel.ILanguageNameTranslation.class, cleon.common.language.metamodel.spec.name.NamePackage.MultilingualName_names);
  }

  public LanguageClass setNames(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.name.javamodel.ILanguageNameTranslation> names) {
    _setMap(cleon.common.language.metamodel.spec.name.NamePackage.MultilingualName_names, names);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.core.javamodel.IProperty> selectProperty() {
    return _getList(ch.actifsource.core.javamodel.IProperty.class, ch.actifsource.core.CorePackage.Class_property);
  }

  public LanguageClass setProperty(java.util.List<? extends ch.actifsource.core.javamodel.IProperty> property) {
    _setList(ch.actifsource.core.CorePackage.Class_property, property);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IAbstractShape selectShape() {
    return _getSingle(ch.actifsource.core.javamodel.IAbstractShape.class, ch.actifsource.core.CorePackage.Class_shape);
  }

  public LanguageClass setShape(ch.actifsource.core.javamodel.IAbstractShape shape) {
    _setSingle(ch.actifsource.core.CorePackage.Class_shape, shape);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public LanguageClass setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, ch.actifsource.core.CorePackage.Class_allowRoot, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Class_classIcon, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptMultiMap(ch.actifsource.core.javamodel.IAbstractAspectImplementation.class, ch.actifsource.core.CorePackage.AspectProvider_aspect, visitor);
    _acceptList(ch.actifsource.core.javamodel.IAspectInterface.class, ch.actifsource.core.CorePackage.Class_definesAspect, visitor);
    _acceptList(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Class_extends, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IColor.class, ch.actifsource.core.CorePackage.Class_fillColor, visitor);
    _acceptSingle(cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IColor.class, ch.actifsource.core.CorePackage.Class_lineColor, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IInheritanceModifier.class, ch.actifsource.core.CorePackage.Class_modifier, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.name.javamodel.ILanguageNameTranslation.class, cleon.common.language.metamodel.spec.name.NamePackage.MultilingualName_names, visitor);
    _acceptList(ch.actifsource.core.javamodel.IProperty.class, ch.actifsource.core.CorePackage.Class_property, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IAbstractShape.class, ch.actifsource.core.CorePackage.Class_shape, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,af81de75-c04e-11ee-bc88-af1934b8c942,NWKhA73Xu+L8lDzxWWCv88ZKoqA=] */
