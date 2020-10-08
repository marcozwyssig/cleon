package cleon.common.doc.metamodel.spec.chapter.references.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedReference extends DynamicResource implements INamedReference {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedReference> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedReference>() {
    
    @Override
    public INamedReference create() {
      return new NamedReference();
    }
    
    @Override
    public INamedReference create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedReference(resourceRepository, resource);
    }
  
  };

  public NamedReference() {
    super(INamedReference.TYPE_ID);
  }
  
  public NamedReference(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedReference.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.net.URL selectSource() {
    return _getSingleAttribute(java.net.URL.class, cleon.common.doc.metamodel.spec.chapter.references.ReferencesPackage.Reference_source);
  }
    
  public void setSource(java.net.URL source) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.references.ReferencesPackage.Reference_source, source);
  }

  @Override
  public java.lang.String selectVersion() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.Version_version);
  }
    
  public void setVersion(java.lang.String version) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.versions.VersionsPackage.Version_version, version);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedReference setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.net.URL.class, cleon.common.doc.metamodel.spec.chapter.references.ReferencesPackage.Reference_source, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.Version_version, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,13280843-0766-11e9-9896-ef29067b4914,g48kNE0ZbFFV8r+DpZmwH1uIvaA=] */
