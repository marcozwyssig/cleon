package cleon.conception.uml.spec.uml.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedComponentWithPackage extends DynamicResource implements INamedComponentWithPackage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedComponentWithPackage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedComponentWithPackage>() {
    
    @Override
    public INamedComponentWithPackage create() {
      return new NamedComponentWithPackage();
    }
    
    @Override
    public INamedComponentWithPackage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedComponentWithPackage(resourceRepository, resource);
    }
  
  };

  public NamedComponentWithPackage() {
    super(INamedComponentWithPackage.TYPE_ID);
  }
  
  public NamedComponentWithPackage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedComponentWithPackage.TYPE_ID);
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
  public java.util.List<? extends cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDecomposite.class, cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public NamedComponentWithPackage setDecompose(java.util.List<? extends cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition> selectDecomposePackages() {
    return _getList(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages);
  }

  public NamedComponentWithPackage setDecomposePackages(java.util.List<? extends cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition> decomposePackages) {
    _setList(cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, decomposePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public NamedComponentWithPackage setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentDependency> selectHasDependency() {
    return _getList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentDependency.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency);
  }

  public NamedComponentWithPackage setHasDependency(java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentDependency> hasDependency) {
    _setList(cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedComponentWithPackage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDecomposite.class, cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentDependency.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,46835629-41b0-11e5-86f2-816f5628b22b,E4hTtwteZofmqhY0uA/YvL/uGdU=] */
