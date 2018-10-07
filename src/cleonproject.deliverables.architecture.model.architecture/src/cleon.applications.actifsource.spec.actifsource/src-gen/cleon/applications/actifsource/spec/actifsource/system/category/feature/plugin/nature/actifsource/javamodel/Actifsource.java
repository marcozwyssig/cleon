package cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Actifsource extends DynamicResource implements IActifsource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActifsource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActifsource>() {
    
    @Override
    public IActifsource create() {
      return new Actifsource();
    }
    
    @Override
    public IActifsource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Actifsource(resourceRepository, resource);
    }
  
  };

  public Actifsource() {
    super(IActifsource.TYPE_ID);
  }
  
  public Actifsource(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IActifsource.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectBuildFactoryClassName() {
    return _getSingleAttribute(java.lang.String.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.ActifsourcePackage.Actifsource_buildFactoryClassName);
  }
    
  public void setBuildFactoryClassName(java.lang.String buildFactoryClassName) {
     _setSingleAttribute(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.ActifsourcePackage.Actifsource_buildFactoryClassName, buildFactoryClassName);
  }

  @Override
  public java.lang.String selectPluginActivationClassName() {
    return _getSingleAttribute(java.lang.String.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.ActifsourcePackage.Actifsource_pluginActivationClassName);
  }
    
  public void setPluginActivationClassName(java.lang.String pluginActivationClassName) {
     _setSingleAttribute(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.ActifsourcePackage.Actifsource_pluginActivationClassName, pluginActivationClassName);
  }

  @Override
  public java.lang.Boolean selectUseSimpleNameForBinding() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.ActifsourcePackage.Actifsource_useSimpleNameForBinding);
  }
    
  public void setUseSimpleNameForBinding(java.lang.Boolean useSimpleNameForBinding) {
     _setSingleAttribute(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.ActifsourcePackage.Actifsource_useSimpleNameForBinding, useSimpleNameForBinding);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.ITargetPath> selectTargetPaths() {
    return _getMap(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.ITargetPath.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.ActifsourcePackage.Actifsource_targetPaths);
  }

  public Actifsource setTargetPaths(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.ITargetPath> targetPaths) {
    _setMap(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.ActifsourcePackage.Actifsource_targetPaths, targetPaths);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Actifsource setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.ActifsourcePackage.Actifsource_buildFactoryClassName, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.ActifsourcePackage.Actifsource_pluginActivationClassName, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.ActifsourcePackage.Actifsource_useSimpleNameForBinding, visitor);
    // relations
    _acceptMap(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.ITargetPath.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.ActifsourcePackage.Actifsource_targetPaths, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource selectToMeTargetPaths(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.ITargetPath object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.ActifsourcePackage.Actifsource_targetPaths, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cc2363fe-3fd7-11e8-bd50-b94594551673,bijf1LjYrtr+hOXo9M16CTm0fNM=] */
