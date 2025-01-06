package cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PackageDependency extends DynamicResource implements IPackageDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackageDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackageDependency>() {
    
    @Override
    public IPackageDependency create() {
      return new PackageDependency();
    }
    
    @Override
    public IPackageDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PackageDependency(resourceRepository, resource);
    }
  
  };

  public PackageDependency() {
    super(IPackageDependency.TYPE_ID);
  }
  
  public PackageDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPackageDependency.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAllowRecursiveDependency() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency);
  }
    
  public void setAllowRecursiveDependency(java.lang.Boolean allowRecursiveDependency) {
     _setSingleAttribute(cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency, allowRecursiveDependency);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectBuidingBlock() {
    return _getSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_buidingBlock);
  }

  public PackageDependency setBuidingBlock(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock buidingBlock) {
    _setSingle(cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_buidingBlock, buidingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage selectToPackage() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.metamodel.spec.structural.packages.PackagesPackage.PackageDependency_toPackage);
  }

  public PackageDependency setToPackage(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage toPackage) {
    _setSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.PackagesPackage.PackageDependency_toPackage, toPackage);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PackageDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.metamodel.spec.structural.packages.PackagesPackage.PackageDependency_toPackage, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackageDependency> selectToMeToPackage(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackageDependency.class, cleon.modelinglanguages.uml.metamodel.spec.structural.packages.PackagesPackage.PackageDependency_toPackage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0666770b-bd4b-11ef-8ef5-1f95735d55f6,X0nIfRf12mH7PHcBA8GFFJKIAME=] */
