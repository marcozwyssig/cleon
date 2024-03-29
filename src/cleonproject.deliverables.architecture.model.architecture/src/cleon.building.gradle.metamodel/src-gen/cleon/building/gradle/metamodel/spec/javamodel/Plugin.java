package cleon.building.gradle.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Plugin extends DynamicResource implements IPlugin {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlugin> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlugin>() {
    
    @Override
    public IPlugin create() {
      return new Plugin();
    }
    
    @Override
    public IPlugin create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Plugin(resourceRepository, resource);
    }
  
  };

  public Plugin() {
    super(IPlugin.TYPE_ID);
  }
  
  public Plugin(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPlugin.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectDisplayName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.naming.NamingPackage.DisplayName_displayName);
  }
    
  public void setDisplayName(java.lang.String displayName) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.naming.NamingPackage.DisplayName_displayName, displayName);
  }

  @Override
  public java.util.List<java.lang.String> selectMandatoryDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions);
  }
    
  public void setMandatoryDescriptions(java.util.List<java.lang.String> mandatoryDescriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, mandatoryDescriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectNamespace() {
    return _getSingleAttribute(java.lang.String.class, cleon.building.gradle.metamodel.spec.SpecPackage.Plugin_namespace);
  }
    
  public void setNamespace(java.lang.String namespace) {
     _setSingleAttribute(cleon.building.gradle.metamodel.spec.SpecPackage.Plugin_namespace, namespace);
  }

  // relations
  
  @Override
  public cleon.common.resources.metamodel.spec.versions.javamodel.ISystemStage selectSystemStage() {
    return _getSingle(cleon.common.resources.metamodel.spec.versions.javamodel.ISystemStage.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersionAware_systemStage);
  }

  public Plugin setSystemStage(cleon.common.resources.metamodel.spec.versions.javamodel.ISystemStage systemStage) {
    _setSingle(cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersionAware_systemStage, systemStage);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.building.gradle.metamodel.spec.javamodel.ITask> selectTasks() {
    return _getList(cleon.building.gradle.metamodel.spec.javamodel.ITask.class, cleon.building.gradle.metamodel.spec.SpecPackage.Plugin_tasks);
  }

  public Plugin setTasks(java.util.List<? extends cleon.building.gradle.metamodel.spec.javamodel.ITask> tasks) {
    _setList(cleon.building.gradle.metamodel.spec.SpecPackage.Plugin_tasks, tasks);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Plugin setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.common.resources.metamodel.spec.versions.javamodel.ISemanticVersion selectVersion() {
    return _getSingle(cleon.common.resources.metamodel.spec.versions.javamodel.ISemanticVersion.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersionAware_version);
  }

  public Plugin setVersion(cleon.common.resources.metamodel.spec.versions.javamodel.ISemanticVersion version) {
    _setSingle(cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersionAware_version, version);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.naming.NamingPackage.DisplayName_displayName, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.building.gradle.metamodel.spec.SpecPackage.Plugin_namespace, visitor);
    // relations
    _acceptSingle(cleon.common.resources.metamodel.spec.versions.javamodel.ISystemStage.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersionAware_systemStage, visitor);
    _acceptList(cleon.building.gradle.metamodel.spec.javamodel.ITask.class, cleon.building.gradle.metamodel.spec.SpecPackage.Plugin_tasks, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.common.resources.metamodel.spec.versions.javamodel.ISemanticVersion.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersionAware_version, visitor);
  }

  public static cleon.building.gradle.metamodel.spec.javamodel.IPlugin selectToMeTasks(cleon.building.gradle.metamodel.spec.javamodel.ITask object) {
    return _getToMeSingle(object.getRepository(), cleon.building.gradle.metamodel.spec.javamodel.IPlugin.class, cleon.building.gradle.metamodel.spec.SpecPackage.Plugin_tasks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8ae372cf-c0a8-11e7-a130-7198de5ddf3f,mCHqObJINZB1Xx0dCSZ1e0/LlYc=] */
