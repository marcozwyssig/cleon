package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Plattform extends DynamicResource implements IPlattform {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlattform> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlattform>() {
    
    @Override
    public IPlattform create() {
      return new Plattform();
    }
    
    @Override
    public IPlattform create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Plattform(resourceRepository, resource);
    }
  
  };

  public Plattform() {
    super(IPlattform.TYPE_ID);
  }
  
  public Plattform(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPlattform.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public Plattform setDecompose(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IOperatingSystemsDecomposite selectDecomposeOperatingSystems() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IOperatingSystemsDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.Plattform_decomposeOperatingSystems);
  }

  public Plattform setDecomposeOperatingSystems(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IOperatingSystemsDecomposite decomposeOperatingSystems) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.Plattform_decomposeOperatingSystems, decomposeOperatingSystems);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServersDecomposite selectDecomposeServers() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServersDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.Plattform_decomposeServers);
  }

  public Plattform setDecomposeServers(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServersDecomposite decomposeServers) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.Plattform_decomposeServers, decomposeServers);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStoragesDecomposite selectDecomposeStorages() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStoragesDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.Plattform_decomposeStorages);
  }

  public Plattform setDecomposeStorages(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStoragesDecomposite decomposeStorages) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.Plattform_decomposeStorages, decomposeStorages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Plattform setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    // relations
    _acceptList(cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IOperatingSystemsDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.Plattform_decomposeOperatingSystems, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServersDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.Plattform_decomposeServers, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStoragesDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.Plattform_decomposeStorages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.IPlattform selectToMeDecomposeOperatingSystems(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IOperatingSystemsDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.IPlattform.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.Plattform_decomposeOperatingSystems, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.IPlattform selectToMeDecomposeServers(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServersDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.IPlattform.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.Plattform_decomposeServers, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.IPlattform selectToMeDecomposeStorages(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStoragesDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.IPlattform.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.Plattform_decomposeStorages, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d6859a6c-99aa-11e8-8f58-219af2c5d6d9,5lHTB1tYmCEwp7XG+yGn0gp5+f0=] */
