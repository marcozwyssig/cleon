package cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PluginProjectDependency extends DynamicResource implements IPluginProjectDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPluginProjectDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPluginProjectDependency>() {
    
    @Override
    public IPluginProjectDependency create() {
      return new PluginProjectDependency();
    }
    
    @Override
    public IPluginProjectDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PluginProjectDependency(resourceRepository, resource);
    }
  
  };

  public PluginProjectDependency() {
    super(IPluginProjectDependency.TYPE_ID);
  }
  
  public PluginProjectDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPluginProjectDependency.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAllowRecursiveDependency() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Dependency_allowRecursiveDependency);
  }
    
  public void setAllowRecursiveDependency(java.lang.Boolean allowRecursiveDependency) {
     _setSingleAttribute(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Dependency_allowRecursiveDependency, allowRecursiveDependency);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin selectTo() {
    return _getSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.PluginProjectDependency_to);
  }

  public PluginProjectDependency setTo(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin to) {
    _setSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.PluginProjectDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PluginProjectDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Dependency_allowRecursiveDependency, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.PluginProjectDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginProjectDependency> selectToMeTo(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin object) {
    return _getToMeList(object.getRepository(), cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginProjectDependency.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.PluginProjectDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,eb57b8c2-0c6a-11e6-86c5-87a8b520dd59,XFFRJr7gf/P6kar1ihpjCSvXGDo=] */
