package cleon.conception.uml.spec.uml.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ComponentWithPackage extends DynamicResource implements IComponentWithPackage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentWithPackage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentWithPackage>() {
    
    @Override
    public IComponentWithPackage create() {
      return new ComponentWithPackage();
    }
    
    @Override
    public IComponentWithPackage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ComponentWithPackage(resourceRepository, resource);
    }
  
  };

  public ComponentWithPackage() {
    super(IComponentWithPackage.TYPE_ID);
  }
  
  public ComponentWithPackage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComponentWithPackage.TYPE_ID);
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
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, shortName);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecomposite.class, cleon.conception.modelinglanguage.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public ComponentWithPackage setDecompose(java.util.List<? extends cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.conception.modelinglanguage.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition> selectDecomposePackages() {
    return _getList(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages);
  }

  public ComponentWithPackage setDecomposePackages(java.util.List<? extends cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition> decomposePackages) {
    _setList(cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, decomposePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ComponentWithPackage setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentDependency> selectHasDependency() {
    return _getList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentDependency.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency);
  }

  public ComponentWithPackage setHasDependency(java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentDependency> hasDependency) {
    _setList(cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ComponentWithPackage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, visitor);
    // relations
    _acceptList(cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecomposite.class, cleon.conception.modelinglanguage.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentDependency.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentWithPackage selectToMeHasDependency(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentWithPackage.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, object.getResource());
  }
  
  public static cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentWithPackage selectToMeDecomposePackages(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentWithPackage.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2adc4d98-85c1-11e3-be33-79789cf5eae3,gl2FfpnJO6cF6lrgXiaOsPH2u/o=] */
