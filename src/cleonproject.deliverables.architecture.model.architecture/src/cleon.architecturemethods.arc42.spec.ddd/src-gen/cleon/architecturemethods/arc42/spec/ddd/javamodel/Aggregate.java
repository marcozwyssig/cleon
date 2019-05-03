package cleon.architecturemethods.arc42.spec.ddd.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Aggregate extends DynamicResource implements IAggregate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAggregate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAggregate>() {
    
    @Override
    public IAggregate create() {
      return new Aggregate();
    }
    
    @Override
    public IAggregate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Aggregate(resourceRepository, resource);
    }
  
  };

  public Aggregate() {
    super(IAggregate.TYPE_ID);
  }
  
  public Aggregate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAggregate.TYPE_ID);
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

  public Aggregate setDecompose(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageInClassifierDecomposition> selectDecomposeClasses() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.Package_decomposeClasses);
  }

  public Aggregate setDecomposeClasses(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageInClassifierDecomposition> decomposeClasses) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.Package_decomposeClasses, decomposeClasses);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IServiceDecomposition selectDomainServices() {
    return _getSingle(cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IServiceDecomposition.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_domainServices);
  }

  public Aggregate setDomainServices(cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IServiceDecomposition domainServices) {
    _setSingle(cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_domainServices, domainServices);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntityDecomposition> selectEntities() {
    return _getList(cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntityDecomposition.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_entities);
  }

  public Aggregate setEntities(java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntityDecomposition> entities) {
    _setList(cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_entities, entities);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.javamodel.IEnumDekomposition> selectEnums() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.javamodel.IEnumDekomposition.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_enums);
  }

  public Aggregate setEnums(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.javamodel.IEnumDekomposition> enums) {
    _setList(cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_enums, enums);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturestylesandpatterns.eda.spec.eda.eventaggregator.javamodel.IEventAggregator> selectEventAggregator() {
    return _getList(cleon.architecturestylesandpatterns.eda.spec.eda.eventaggregator.javamodel.IEventAggregator.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_eventAggregator);
  }

  public Aggregate setEventAggregator(java.util.List<? extends cleon.architecturestylesandpatterns.eda.spec.eda.eventaggregator.javamodel.IEventAggregator> eventAggregator) {
    _setList(cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_eventAggregator, eventAggregator);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.exceptions.javamodel.IExceptionDecomposition> selectExceptions() {
    return _getList(cleon.architecturemethods.arc42.spec.ddd.exceptions.javamodel.IExceptionDecomposition.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_exceptions);
  }

  public Aggregate setExceptions(java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.exceptions.javamodel.IExceptionDecomposition> exceptions) {
    _setList(cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_exceptions, exceptions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.repository.javamodel.IRepositoryDecomposition> selectRepository() {
    return _getList(cleon.architecturemethods.arc42.spec.ddd.repository.javamodel.IRepositoryDecomposition.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_repository);
  }

  public Aggregate setRepository(java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.repository.javamodel.IRepositoryDecomposition> repository) {
    _setList(cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_repository, repository);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition> selectSubPackages() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition.class, cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.Package_subPackages);
  }

  public Aggregate setSubPackages(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition> subPackages) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.Package_subPackages, subPackages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Aggregate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.valueobjects.javamodel.IValueObjectDecomposition> selectValueObjects() {
    return _getList(cleon.architecturemethods.arc42.spec.ddd.valueobjects.javamodel.IValueObjectDecomposition.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_valueObjects);
  }

  public Aggregate setValueObjects(java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.valueobjects.javamodel.IValueObjectDecomposition> valueObjects) {
    _setList(cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_valueObjects, valueObjects);
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
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.Package_decomposeClasses, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IServiceDecomposition.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_domainServices, visitor);
    _acceptList(cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntityDecomposition.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_entities, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.javamodel.IEnumDekomposition.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_enums, visitor);
    _acceptList(cleon.architecturestylesandpatterns.eda.spec.eda.eventaggregator.javamodel.IEventAggregator.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_eventAggregator, visitor);
    _acceptList(cleon.architecturemethods.arc42.spec.ddd.exceptions.javamodel.IExceptionDecomposition.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_exceptions, visitor);
    _acceptList(cleon.architecturemethods.arc42.spec.ddd.repository.javamodel.IRepositoryDecomposition.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_repository, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition.class, cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.Package_subPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.architecturemethods.arc42.spec.ddd.valueobjects.javamodel.IValueObjectDecomposition.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_valueObjects, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.ddd.javamodel.IAggregate selectToMeEntities(cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntityDecomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.ddd.javamodel.IAggregate.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_entities, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.ddd.javamodel.IAggregate selectToMeExceptions(cleon.architecturemethods.arc42.spec.ddd.exceptions.javamodel.IExceptionDecomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.ddd.javamodel.IAggregate.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_exceptions, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.ddd.javamodel.IAggregate selectToMeValueObjects(cleon.architecturemethods.arc42.spec.ddd.valueobjects.javamodel.IValueObjectDecomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.ddd.javamodel.IAggregate.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_valueObjects, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.ddd.javamodel.IAggregate selectToMeRepository(cleon.architecturemethods.arc42.spec.ddd.repository.javamodel.IRepositoryDecomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.ddd.javamodel.IAggregate.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_repository, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.ddd.javamodel.IAggregate selectToMeDomainServices(cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IServiceDecomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.ddd.javamodel.IAggregate.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_domainServices, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.ddd.javamodel.IAggregate selectToMeEnums(cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.javamodel.IEnumDekomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.ddd.javamodel.IAggregate.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_enums, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.ddd.javamodel.IAggregate selectToMeEventAggregator(cleon.architecturestylesandpatterns.eda.spec.eda.eventaggregator.javamodel.IEventAggregator object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.ddd.javamodel.IAggregate.class, cleon.architecturemethods.arc42.spec.ddd.DddPackage.Aggregate_eventAggregator, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,83c13817-10c0-11e3-b60e-ab478a3e1eca,ed34vZ/HG/AHF352/tg+Gz7DkyM=] */
