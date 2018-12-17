package cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PackageInClassifierDecomposition extends DynamicResource implements IPackageInClassifierDecomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackageInClassifierDecomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackageInClassifierDecomposition>() {
    
    @Override
    public IPackageInClassifierDecomposition create() {
      return new PackageInClassifierDecomposition();
    }
    
    @Override
    public IPackageInClassifierDecomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PackageInClassifierDecomposition(resourceRepository, resource);
    }
  
  };

  public PackageInClassifierDecomposition() {
    super(IPackageInClassifierDecomposition.TYPE_ID);
  }
  
  public PackageInClassifierDecomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPackageInClassifierDecomposition.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectPurpose() {
    return _getListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose);
  }
    
  public void setPurpose(java.util.List<java.lang.String> purpose) {
     _setListAttribute(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, purpose);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier selectInto() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier.class, cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into);
  }

  public PackageInClassifierDecomposition setInto(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier into) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into, into);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public PackageInClassifierDecomposition setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PackageInClassifierDecomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier.class, cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into, visitor);
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageInClassifierDecomposition selectToMeInto(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c64a4da0-1757-11e5-9ca7-d1bb57b73459,rdFOErylelg/CRCyq1BDlpycpZY=] */
