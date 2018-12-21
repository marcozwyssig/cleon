package cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ComponentCompositionVersionedDependency extends DynamicResource implements IComponentCompositionVersionedDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentCompositionVersionedDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentCompositionVersionedDependency>() {
    
    @Override
    public IComponentCompositionVersionedDependency create() {
      return new ComponentCompositionVersionedDependency();
    }
    
    @Override
    public IComponentCompositionVersionedDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ComponentCompositionVersionedDependency(resourceRepository, resource);
    }
  
  };

  public ComponentCompositionVersionedDependency() {
    super(IComponentCompositionVersionedDependency.TYPE_ID);
  }
  
  public ComponentCompositionVersionedDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComponentCompositionVersionedDependency.TYPE_ID);
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
  public cleon.common.resources.spec.resources.versions.javamodel.ISystemStage selectSystemStage() {
    return _getSingle(cleon.common.resources.spec.resources.versions.javamodel.ISystemStage.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_systemStage);
  }

  public ComponentCompositionVersionedDependency setSystemStage(cleon.common.resources.spec.resources.versions.javamodel.ISystemStage systemStage) {
    _setSingle(cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_systemStage, systemStage);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentComposition selectTo() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentComposition.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDependency_to);
  }

  public ComponentCompositionVersionedDependency setTo(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentComposition to) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ComponentCompositionVersionedDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion selectVersion() {
    return _getSingle(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version);
  }

  public ComponentCompositionVersionedDependency setVersion(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion version) {
    _setSingle(cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version, version);
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
    _acceptSingle(cleon.common.resources.spec.resources.versions.javamodel.ISystemStage.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_systemStage, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentComposition.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,966d2038-d40f-11e5-8556-8f55ceb91287,gucbej10XU9KE3xs2u0TI6EIEI0=] */
