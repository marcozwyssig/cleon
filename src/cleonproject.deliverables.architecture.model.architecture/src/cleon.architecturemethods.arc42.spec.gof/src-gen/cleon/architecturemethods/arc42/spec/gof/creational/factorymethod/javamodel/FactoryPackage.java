package cleon.architecturemethods.arc42.spec.gof.creational.factorymethod.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FactoryPackage extends DynamicResource implements IFactoryPackage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFactoryPackage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFactoryPackage>() {
    
    @Override
    public IFactoryPackage create() {
      return new FactoryPackage();
    }
    
    @Override
    public IFactoryPackage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FactoryPackage(resourceRepository, resource);
    }
  
  };

  public FactoryPackage() {
    super(IFactoryPackage.TYPE_ID);
  }
  
  public FactoryPackage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFactoryPackage.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public FactoryPackage setDecompose(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageInClassifierDecomposition> selectDecomposeClasses() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.Package_decomposeClasses);
  }

  public FactoryPackage setDecomposeClasses(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageInClassifierDecomposition> decomposeClasses) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.Package_decomposeClasses, decomposeClasses);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.gof.creational.factorymethod.javamodel.IFactoryCreator selectFactory() {
    return _getSingle(cleon.architecturemethods.arc42.spec.gof.creational.factorymethod.javamodel.IFactoryCreator.class, cleon.architecturemethods.arc42.spec.gof.creational.factorymethod.FactorymethodPackage.FactoryPackage_factory);
  }

  public FactoryPackage setFactory(cleon.architecturemethods.arc42.spec.gof.creational.factorymethod.javamodel.IFactoryCreator factory) {
    _setSingle(cleon.architecturemethods.arc42.spec.gof.creational.factorymethod.FactorymethodPackage.FactoryPackage_factory, factory);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition> selectSubPackages() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition.class, cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.Package_subPackages);
  }

  public FactoryPackage setSubPackages(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition> subPackages) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.Package_subPackages, subPackages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FactoryPackage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.Package_decomposeClasses, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.gof.creational.factorymethod.javamodel.IFactoryCreator.class, cleon.architecturemethods.arc42.spec.gof.creational.factorymethod.FactorymethodPackage.FactoryPackage_factory, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition.class, cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.Package_subPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.gof.creational.factorymethod.javamodel.IFactoryPackage selectToMeFactory(cleon.architecturemethods.arc42.spec.gof.creational.factorymethod.javamodel.IFactoryCreator object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.gof.creational.factorymethod.javamodel.IFactoryPackage.class, cleon.architecturemethods.arc42.spec.gof.creational.factorymethod.FactorymethodPackage.FactoryPackage_factory, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,46daf4f0-ddd3-11e4-b0b5-6911fa4e24e5,S+KtDD/EYnDh1fbEki5j6s0Ry18=] */
