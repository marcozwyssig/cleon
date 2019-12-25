package cleon.common.resources.metamodel.spec.versions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SemanticVersion extends DynamicResource implements ISemanticVersion {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISemanticVersion> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISemanticVersion>() {
    
    @Override
    public ISemanticVersion create() {
      return new SemanticVersion();
    }
    
    @Override
    public ISemanticVersion create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SemanticVersion(resourceRepository, resource);
    }
  
  };

  public SemanticVersion() {
    super(ISemanticVersion.TYPE_ID);
  }
  
  public SemanticVersion(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISemanticVersion.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectMajor() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersion_major);
  }
    
  public void setMajor(java.lang.Integer major) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersion_major, major);
  }

  @Override
  public java.lang.Integer selectMinor() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersion_minor);
  }
    
  public void setMinor(java.lang.Integer minor) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersion_minor, minor);
  }

  @Override
  public java.lang.Integer selectPatch() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersion_patch);
  }
    
  public void setPatch(java.lang.Integer patch) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersion_patch, patch);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SemanticVersion setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersion_major, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersion_minor, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersion_patch, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2b7fed0c-d40f-11e5-8556-8f55ceb91287,pehcxH/9zgTGp8EpN5xXOn0QB/o=] */
