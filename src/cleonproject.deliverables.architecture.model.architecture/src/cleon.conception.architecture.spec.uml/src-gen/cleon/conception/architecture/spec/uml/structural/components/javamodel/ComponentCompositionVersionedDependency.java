package cleon.conception.architecture.spec.uml.structural.components.javamodel;

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

  // relations
  
  @Override
  public cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentComposition selectTo() {
    return _getSingle(cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentComposition.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentCompositionDependency_to);
  }

  public ComponentCompositionVersionedDependency setTo(cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentComposition to) {
    _setSingle(cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentCompositionDependency_to, to);
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
    // relations
    _acceptSingle(cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentComposition.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentCompositionDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,966d2038-d40f-11e5-8556-8f55ceb91287,YuC3GVV0qsKZD8HTRx+mhUqnJEk=] */
