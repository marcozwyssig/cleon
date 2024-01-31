package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SensorClass extends DynamicResource implements ISensorClass {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISensorClass> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISensorClass>() {
    
    @Override
    public ISensorClass create() {
      return new SensorClass();
    }
    
    @Override
    public ISensorClass create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SensorClass(resourceRepository, resource);
    }
  
  };

  public SensorClass() {
    super(ISensorClass.TYPE_ID);
  }
  
  public SensorClass(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISensorClass.TYPE_ID);
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
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectDisplayName() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.SensorClass_displayName);
  }
    
  public void setDisplayName(java.lang.String displayName) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.SensorClass_displayName, displayName);
  }

  @Override
  public java.lang.Integer selectInterval_aE__aA_s_aC_() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.IntervalAware_interval_aE__aA_s_aC_);
  }
    
  public void setInterval_aE__aA_s_aC_(java.lang.Integer interval_aE__aA_s_aC_) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.IntervalAware_interval_aE__aA_s_aC_, interval_aE__aA_s_aC_);
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

  public SensorClass setAspect(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends ch.actifsource.core.javamodel.IAbstractAspectImplementation> aspect) {
    _setMultiMap(ch.actifsource.core.CorePackage.AspectProvider_aspect, aspect);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.core.javamodel.IAspectInterface> selectDefinesAspect() {
    return _getList(ch.actifsource.core.javamodel.IAspectInterface.class, ch.actifsource.core.CorePackage.Class_definesAspect);
  }

  public SensorClass setDefinesAspect(java.util.List<? extends ch.actifsource.core.javamodel.IAspectInterface> definesAspect) {
    _setList(ch.actifsource.core.CorePackage.Class_definesAspect, definesAspect);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.core.javamodel.IClass> selectExtends() {
    return _getList(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Class_extends);
  }

  public SensorClass setExtends(java.util.List<? extends ch.actifsource.core.javamodel.IClass> extends_) {
    _setList(ch.actifsource.core.CorePackage.Class_extends, extends_);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IColor selectFillColor() {
    return _getSingle(ch.actifsource.core.javamodel.IColor.class, ch.actifsource.core.CorePackage.Class_fillColor);
  }

  public SensorClass setFillColor(ch.actifsource.core.javamodel.IColor fillColor) {
    _setSingle(ch.actifsource.core.CorePackage.Class_fillColor, fillColor);
    return this;
  }
    
  @Override
  public cleon.common.language.metamodel.spec.javamodel.ILanguageSettings selectLanguageSettings() {
    return _getSingle(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings);
  }

  public SensorClass setLanguageSettings(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings languageSettings) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings, languageSettings);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IColor selectLineColor() {
    return _getSingle(ch.actifsource.core.javamodel.IColor.class, ch.actifsource.core.CorePackage.Class_lineColor);
  }

  public SensorClass setLineColor(ch.actifsource.core.javamodel.IColor lineColor) {
    _setSingle(ch.actifsource.core.CorePackage.Class_lineColor, lineColor);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IInheritanceModifier selectModifier() {
    return _getSingle(ch.actifsource.core.javamodel.IInheritanceModifier.class, ch.actifsource.core.CorePackage.Class_modifier);
  }

  public SensorClass setModifier(ch.actifsource.core.javamodel.IInheritanceModifier modifier) {
    _setSingle(ch.actifsource.core.CorePackage.Class_modifier, modifier);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.core.javamodel.IProperty> selectProperty() {
    return _getList(ch.actifsource.core.javamodel.IProperty.class, ch.actifsource.core.CorePackage.Class_property);
  }

  public SensorClass setProperty(java.util.List<? extends ch.actifsource.core.javamodel.IProperty> property) {
    _setList(ch.actifsource.core.CorePackage.Class_property, property);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IAbstractShape selectShape() {
    return _getSingle(ch.actifsource.core.javamodel.IAbstractShape.class, ch.actifsource.core.CorePackage.Class_shape);
  }

  public SensorClass setShape(ch.actifsource.core.javamodel.IAbstractShape shape) {
    _setSingle(ch.actifsource.core.CorePackage.Class_shape, shape);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageDescriptionTranslation> selectTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualDescription_translation);
  }

  public SensorClass setTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageDescriptionTranslation> translation) {
    _setMap(cleon.common.language.metamodel.spec.SpecPackage.MultilingualDescription_translation, translation);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SensorClass setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.SensorClass_displayName, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.IntervalAware_interval_aE__aA_s_aC_, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptMultiMap(ch.actifsource.core.javamodel.IAbstractAspectImplementation.class, ch.actifsource.core.CorePackage.AspectProvider_aspect, visitor);
    _acceptList(ch.actifsource.core.javamodel.IAspectInterface.class, ch.actifsource.core.CorePackage.Class_definesAspect, visitor);
    _acceptList(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Class_extends, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IColor.class, ch.actifsource.core.CorePackage.Class_fillColor, visitor);
    _acceptSingle(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IColor.class, ch.actifsource.core.CorePackage.Class_lineColor, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IInheritanceModifier.class, ch.actifsource.core.CorePackage.Class_modifier, visitor);
    _acceptList(ch.actifsource.core.javamodel.IProperty.class, ch.actifsource.core.CorePackage.Class_property, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IAbstractShape.class, ch.actifsource.core.CorePackage.Class_shape, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualDescription_translation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,33be3a6e-cfe0-11ea-99e7-03141914df18,Tj7CiYMEcxUTQseiD8q3JpMCako=] */
