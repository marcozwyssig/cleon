package cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Plugin_Nature extends DynamicResource implements IPlugin_Nature {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlugin_Nature> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlugin_Nature>() {
    
    @Override
    public IPlugin_Nature create() {
      return new Plugin_Nature();
    }
    
    @Override
    public IPlugin_Nature create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Plugin_Nature(resourceRepository, resource);
    }
  
  };

  public Plugin_Nature() {
    super(IPlugin_Nature.TYPE_ID);
  }
  
  public Plugin_Nature(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPlugin_Nature.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectAccessrules() {
    return _getListAttribute(java.lang.String.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.NaturePackage.Plugin_aE_Nature_accessrules);
  }
    
  public void setAccessrules(java.util.List<java.lang.String> accessrules) {
     _setListAttribute(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.NaturePackage.Plugin_aE_Nature_accessrules, accessrules);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPackage> selectExportPackage() {
    return _getList(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPackage.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.NaturePackage.Plugin_aE_Nature_exportPackage);
  }

  public Plugin_Nature setExportPackage(java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPackage> exportPackage) {
    _setList(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.NaturePackage.Plugin_aE_Nature_exportPackage, exportPackage);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Plugin_Nature setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.NaturePackage.Plugin_aE_Nature_accessrules, visitor);
    // relations
    _acceptList(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPackage.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.NaturePackage.Plugin_aE_Nature_exportPackage, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature selectToMeExportPackage(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.NaturePackage.Plugin_aE_Nature_exportPackage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d5d42a4f-41a9-11e8-81d0-774e4d9334dd,Xc2nJBGQZkiyydn+ttOqFPJn3rw=] */
