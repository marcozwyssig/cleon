package cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Manufacturer extends DynamicResource implements IManufacturer {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManufacturer> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManufacturer>() {
    
    @Override
    public IManufacturer create() {
      return new Manufacturer();
    }
    
    @Override
    public IManufacturer create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Manufacturer(resourceRepository, resource);
    }
  
  };

  public Manufacturer() {
    super(IManufacturer.TYPE_ID);
  }
  
  public Manufacturer(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IManufacturer.TYPE_ID);
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
  public java.util.List<? extends cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlockDecomposite> selectDecompose() {
    return _getList(cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlockDecomposite.class, cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.Manufacturer_decompose);
  }

  public Manufacturer setDecompose(java.util.List<? extends cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlockDecomposite> decompose) {
    _setList(cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.Manufacturer_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite> selectDecomposeComponent() {
    return _getList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent);
  }

  public Manufacturer setDecomposeComponent(java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite> decomposeComponent) {
    _setList(cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, decomposeComponent);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Manufacturer setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDependency> selectHasDependency() {
    return _getList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDependency.class, cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.Manufacturer_hasDependency);
  }

  public Manufacturer setHasDependency(java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDependency> hasDependency) {
    _setList(cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.Manufacturer_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Manufacturer setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlockDecomposite.class, cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.Manufacturer_decompose, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDependency.class, cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.Manufacturer_hasDependency, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer selectToMeHasDependency(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer.class, cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.Manufacturer_hasDependency, object.getResource());
  }
  
  public static cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer selectToMeDecompose(cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlockDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer.class, cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.Manufacturer_decompose, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,01fe9fef-2d70-11e6-959f-d1cef44ff5fd,N1ZB5+UUNJH4/8xiIhCmC33TeQU=] */
