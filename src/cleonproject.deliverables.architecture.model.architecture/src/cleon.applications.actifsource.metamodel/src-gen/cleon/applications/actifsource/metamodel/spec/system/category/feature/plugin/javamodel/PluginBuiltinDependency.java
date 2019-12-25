package cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PluginBuiltinDependency extends DynamicResource implements IPluginBuiltinDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPluginBuiltinDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPluginBuiltinDependency>() {
    
    @Override
    public IPluginBuiltinDependency create() {
      return new PluginBuiltinDependency();
    }
    
    @Override
    public IPluginBuiltinDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PluginBuiltinDependency(resourceRepository, resource);
    }
  
  };

  public PluginBuiltinDependency() {
    super(IPluginBuiltinDependency.TYPE_ID);
  }
  
  public PluginBuiltinDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPluginBuiltinDependency.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAllowRecursiveDependency() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency);
  }
    
  public void setAllowRecursiveDependency(java.lang.Boolean allowRecursiveDependency) {
     _setSingleAttribute(cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency, allowRecursiveDependency);
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

  // relations
  
  @Override
  public cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin selectTo() {
    return _getSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.PluginBuiltinDependency_to);
  }

  public PluginBuiltinDependency setTo(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin to) {
    _setSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.PluginBuiltinDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PluginBuiltinDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.PluginBuiltinDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IPluginBuiltinDependency> selectToMeTo(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin object) {
    return _getToMeList(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IPluginBuiltinDependency.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.PluginBuiltinDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dc98b25c-0c6a-11e6-86c5-87a8b520dd59,C9JvByw6EFsu+nUUrBWREwXYEOU=] */
