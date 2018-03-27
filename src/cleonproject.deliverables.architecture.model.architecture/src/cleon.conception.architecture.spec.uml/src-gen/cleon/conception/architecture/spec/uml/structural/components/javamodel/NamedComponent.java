package cleon.conception.architecture.spec.uml.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedComponent extends DynamicResource implements INamedComponent {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedComponent> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedComponent>() {
    
    @Override
    public INamedComponent create() {
      return new NamedComponent();
    }
    
    @Override
    public INamedComponent create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedComponent(resourceRepository, resource);
    }
  
  };

  public NamedComponent() {
    super(INamedComponent.TYPE_ID);
  }
  
  public NamedComponent(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedComponent.TYPE_ID);
  }

  // attributes
  
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

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, shortName);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public NamedComponent setDecompose(java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition> selectDecomposePackages() {
    return _getList(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages);
  }

  public NamedComponent setDecomposePackages(java.util.List<? extends cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition> decomposePackages) {
    _setList(cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, decomposePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public NamedComponent setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentDependency> selectHasDependency() {
    return _getList(cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentDependency.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency);
  }

  public NamedComponent setHasDependency(java.util.List<? extends cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentDependency> hasDependency) {
    _setList(cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition selectNoPackages() {
    return _getSingle(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.Component_noPackages);
  }

  public NamedComponent setNoPackages(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition noPackages) {
    _setSingle(cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.Component_noPackages, noPackages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedComponent setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, visitor);
    // relations
    _acceptList(cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentDependency.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, visitor);
    _acceptSingle(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.Component_noPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4e84e5d8-41b0-11e5-86f2-816f5628b22b,QFnA+WcBufbm/fHyk3Aa71rUw0k=] */
