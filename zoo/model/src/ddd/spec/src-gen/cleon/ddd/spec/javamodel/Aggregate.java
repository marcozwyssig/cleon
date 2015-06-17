package cleon.ddd.spec.javamodel;

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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters);
  }

  public Aggregate setChapters(java.util.List<? extends cleon.doc.spec.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.javamodel.IClassWithInterface> selectClasses() {
    return _getList(cleon.uml.spec.structural.classes.javamodel.IClassWithInterface.class, cleon.ddd.spec.SpecPackage.Aggregate_classes);
  }

  public Aggregate setClasses(java.util.List<? extends cleon.uml.spec.structural.classes.javamodel.IClassWithInterface> classes) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_classes, classes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Aggregate setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.ddd.spec.javamodel.IEntity> selectEntities() {
    return _getList(cleon.ddd.spec.javamodel.IEntity.class, cleon.ddd.spec.SpecPackage.Aggregate_entities);
  }

  public Aggregate setEntities(java.util.List<? extends cleon.ddd.spec.javamodel.IEntity> entities) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_entities, entities);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.enums.javamodel.IEnum> selectEnums() {
    return _getList(cleon.uml.spec.structural.classes.enums.javamodel.IEnum.class, cleon.ddd.spec.SpecPackage.Aggregate_enums);
  }

  public Aggregate setEnums(java.util.List<? extends cleon.uml.spec.structural.classes.enums.javamodel.IEnum> enums) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_enums, enums);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.ddd.spec.javamodel.IEventAggregator> selectEventAggregator() {
    return _getList(cleon.ddd.spec.javamodel.IEventAggregator.class, cleon.ddd.spec.SpecPackage.Aggregate_eventAggregator);
  }

  public Aggregate setEventAggregator(java.util.List<? extends cleon.ddd.spec.javamodel.IEventAggregator> eventAggregator) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_eventAggregator, eventAggregator);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.ddd.spec.javamodel.IDomainException> selectExceptions() {
    return _getList(cleon.ddd.spec.javamodel.IDomainException.class, cleon.ddd.spec.SpecPackage.Aggregate_exceptions);
  }

  public Aggregate setExceptions(java.util.List<? extends cleon.ddd.spec.javamodel.IDomainException> exceptions) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_exceptions, exceptions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.ddd.spec.javamodel.IRepositoryPackage> selectRepository() {
    return _getList(cleon.ddd.spec.javamodel.IRepositoryPackage.class, cleon.ddd.spec.SpecPackage.Aggregate_repository);
  }

  public Aggregate setRepository(java.util.List<? extends cleon.ddd.spec.javamodel.IRepositoryPackage> repository) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_repository, repository);
    return this;
  }
    
  @Override
  public cleon.ddd.spec.services.javamodel.IMainServicePackage selectServicePackage() {
    return _getSingle(cleon.ddd.spec.services.javamodel.IMainServicePackage.class, cleon.ddd.spec.SpecPackage.Aggregate_servicePackage);
  }

  public Aggregate setServicePackage(cleon.ddd.spec.services.javamodel.IMainServicePackage servicePackage) {
    _setSingle(cleon.ddd.spec.SpecPackage.Aggregate_servicePackage, servicePackage);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackage> selectSubPackages() {
    return _getList(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages);
  }

  public Aggregate setSubPackages(java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackage> subPackages) {
    _setList(cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, subPackages);
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
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock> selectUseDecompositions() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions);
  }

  public Aggregate setUseDecompositions(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock> useDecompositions) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, useDecompositions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.ddd.spec.javamodel.IValueObject> selectValueObjects() {
    return _getList(cleon.ddd.spec.javamodel.IValueObject.class, cleon.ddd.spec.SpecPackage.Aggregate_valueObjects);
  }

  public Aggregate setValueObjects(java.util.List<? extends cleon.ddd.spec.javamodel.IValueObject> valueObjects) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_valueObjects, valueObjects);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    // relations
    _acceptList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters, visitor);
    _acceptList(cleon.uml.spec.structural.classes.javamodel.IClassWithInterface.class, cleon.ddd.spec.SpecPackage.Aggregate_classes, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.ddd.spec.javamodel.IEntity.class, cleon.ddd.spec.SpecPackage.Aggregate_entities, visitor);
    _acceptList(cleon.uml.spec.structural.classes.enums.javamodel.IEnum.class, cleon.ddd.spec.SpecPackage.Aggregate_enums, visitor);
    _acceptList(cleon.ddd.spec.javamodel.IEventAggregator.class, cleon.ddd.spec.SpecPackage.Aggregate_eventAggregator, visitor);
    _acceptList(cleon.ddd.spec.javamodel.IDomainException.class, cleon.ddd.spec.SpecPackage.Aggregate_exceptions, visitor);
    _acceptList(cleon.ddd.spec.javamodel.IRepositoryPackage.class, cleon.ddd.spec.SpecPackage.Aggregate_repository, visitor);
    _acceptSingle(cleon.ddd.spec.services.javamodel.IMainServicePackage.class, cleon.ddd.spec.SpecPackage.Aggregate_servicePackage, visitor);
    _acceptList(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, visitor);
    _acceptList(cleon.ddd.spec.javamodel.IValueObject.class, cleon.ddd.spec.SpecPackage.Aggregate_valueObjects, visitor);
  }

  // toMeRelations
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeEntities(cleon.ddd.spec.javamodel.IEntity object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_entities, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeExceptions(cleon.ddd.spec.javamodel.IDomainException object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_exceptions, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeValueObjects(cleon.ddd.spec.javamodel.IValueObject object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_valueObjects, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeClasses(cleon.uml.spec.structural.classes.javamodel.IClassWithInterface object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_classes, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeRepository(cleon.ddd.spec.javamodel.IRepositoryPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_repository, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeServicePackage(cleon.ddd.spec.services.javamodel.IMainServicePackage object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_servicePackage, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeEnums(cleon.uml.spec.structural.classes.enums.javamodel.IEnum object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_enums, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeEventAggregator(cleon.ddd.spec.javamodel.IEventAggregator object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_eventAggregator, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,83c13817-10c0-11e3-b60e-ab478a3e1eca,/jp123cLO0aIKsKRe4uI+VCDnog=] */
