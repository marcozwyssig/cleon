package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel;

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
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
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
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> selectDecompose() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose);
  }

  public Aggregate setDecompose(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> decompose) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier> selectDecomposeClasses() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier.class, cleon.modelinglanguages.uml.metamodel.spec.structural.packages.PackagesPackage.Package_decomposeClasses);
  }

  public Aggregate setDecomposeClasses(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier> decomposeClasses) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.PackagesPackage.Package_decomposeClasses, decomposeClasses);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.services.javamodel.IDomainService> selectDomainServices() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.services.javamodel.IDomainService.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_domainServices);
  }

  public Aggregate setDomainServices(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.services.javamodel.IDomainService> domainServices) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_domainServices, domainServices);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.entities.javamodel.IEntity> selectEntities() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.entities.javamodel.IEntity.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_entities);
  }

  public Aggregate setEntities(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.entities.javamodel.IEntity> entities) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_entities, entities);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.enums.javamodel.IEnum> selectEnums() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.enums.javamodel.IEnum.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_enums);
  }

  public Aggregate setEnums(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.enums.javamodel.IEnum> enums) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_enums, enums);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel.IEventAggregator> selectEventAggregator() {
    return _getList(cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel.IEventAggregator.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_eventAggregator);
  }

  public Aggregate setEventAggregator(java.util.List<? extends cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel.IEventAggregator> eventAggregator) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_eventAggregator, eventAggregator);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.exceptions.javamodel.IDomainException> selectExceptions() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.exceptions.javamodel.IDomainException.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_exceptions);
  }

  public Aggregate setExceptions(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.exceptions.javamodel.IDomainException> exceptions) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_exceptions, exceptions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.repository.javamodel.IRepository> selectRepository() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.repository.javamodel.IRepository.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_repository);
  }

  public Aggregate setRepository(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.repository.javamodel.IRepository> repository) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_repository, repository);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage> selectSubPackages() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.metamodel.spec.structural.packages.PackagesPackage.Package_subPackages);
  }

  public Aggregate setSubPackages(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage> subPackages) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.PackagesPackage.Package_subPackages, subPackages);
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
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.valueobjects.javamodel.IValueObject> selectValueObjects() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.valueobjects.javamodel.IValueObject.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_valueObjects);
  }

  public Aggregate setValueObjects(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.valueobjects.javamodel.IValueObject> valueObjects) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_valueObjects, valueObjects);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.services.javamodel.IDomainService.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_domainServices, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.entities.javamodel.IEntity.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_entities, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.enums.javamodel.IEnum.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_enums, visitor);
    _acceptList(cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel.IEventAggregator.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_eventAggregator, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.exceptions.javamodel.IDomainException.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_exceptions, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.repository.javamodel.IRepository.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_repository, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.metamodel.spec.structural.packages.PackagesPackage.Package_subPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.valueobjects.javamodel.IValueObject.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_valueObjects, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IAggregate selectToMeEntities(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.entities.javamodel.IEntity object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IAggregate.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_entities, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IAggregate selectToMeExceptions(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.exceptions.javamodel.IDomainException object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IAggregate.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_exceptions, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IAggregate selectToMeValueObjects(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.valueobjects.javamodel.IValueObject object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IAggregate.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_valueObjects, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IAggregate selectToMeRepository(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.repository.javamodel.IRepository object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IAggregate.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_repository, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IAggregate selectToMeDomainServices(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.services.javamodel.IDomainService object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IAggregate.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_domainServices, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IAggregate selectToMeEnums(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.enums.javamodel.IEnum object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IAggregate.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_enums, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IAggregate selectToMeEventAggregator(cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel.IEventAggregator object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IAggregate.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.DddPackage.Aggregate_eventAggregator, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,83c13817-10c0-11e3-b60e-ab478a3e1eca,FKau8EnATJPGFYByFF6ejOsr50Y=] */
