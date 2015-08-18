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

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public Aggregate setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose);
  }

  public Aggregate setDecompose(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> decompose) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition> selectDecomposeClasses() {
    return _getList(cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_decomposeClasses);
  }

  public Aggregate setDecomposeClasses(java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition> decomposeClasses) {
    _setList(cleon.uml.spec.structural.packages.PackagesPackage.Package_decomposeClasses, decomposeClasses);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph> selectDescription() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph.class, cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description);
  }

  public Aggregate setDescription(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph> description) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description, description);
    return this;
  }
    
  @Override
  public cleon.ddd.spec.services.javamodel.IServiceDekomposition selectDomainServices() {
    return _getSingle(cleon.ddd.spec.services.javamodel.IServiceDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_domainServices);
  }

  public Aggregate setDomainServices(cleon.ddd.spec.services.javamodel.IServiceDekomposition domainServices) {
    _setSingle(cleon.ddd.spec.SpecPackage.Aggregate_domainServices, domainServices);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.ddd.spec.entities.javamodel.IEntityDekomposition> selectEntities() {
    return _getList(cleon.ddd.spec.entities.javamodel.IEntityDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_entities);
  }

  public Aggregate setEntities(java.util.List<? extends cleon.ddd.spec.entities.javamodel.IEntityDekomposition> entities) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_entities, entities);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.enums.javamodel.IEnumDekomposition> selectEnums() {
    return _getList(cleon.uml.spec.structural.classes.enums.javamodel.IEnumDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_enums);
  }

  public Aggregate setEnums(java.util.List<? extends cleon.uml.spec.structural.classes.enums.javamodel.IEnumDekomposition> enums) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_enums, enums);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.eda.spec.eventaggregator.javamodel.IEventAggregator> selectEventAggregator() {
    return _getList(cleon.eda.spec.eventaggregator.javamodel.IEventAggregator.class, cleon.ddd.spec.SpecPackage.Aggregate_eventAggregator);
  }

  public Aggregate setEventAggregator(java.util.List<? extends cleon.eda.spec.eventaggregator.javamodel.IEventAggregator> eventAggregator) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_eventAggregator, eventAggregator);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.ddd.spec.exceptions.javamodel.IExceptionDekomposition> selectExceptions() {
    return _getList(cleon.ddd.spec.exceptions.javamodel.IExceptionDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_exceptions);
  }

  public Aggregate setExceptions(java.util.List<? extends cleon.ddd.spec.exceptions.javamodel.IExceptionDekomposition> exceptions) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_exceptions, exceptions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Aggregate setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public Aggregate setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.ddd.spec.repository.javamodel.IRepositoryDekomposition> selectRepository() {
    return _getList(cleon.ddd.spec.repository.javamodel.IRepositoryDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_repository);
  }

  public Aggregate setRepository(java.util.List<? extends cleon.ddd.spec.repository.javamodel.IRepositoryDekomposition> repository) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_repository, repository);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition> selectSubPackages() {
    return _getList(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages);
  }

  public Aggregate setSubPackages(java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition> subPackages) {
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
  public java.util.List<? extends cleon.ddd.spec.valueobjects.javamodel.IValueObjectDekomposition> selectValueObjects() {
    return _getList(cleon.ddd.spec.valueobjects.javamodel.IValueObjectDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_valueObjects);
  }

  public Aggregate setValueObjects(java.util.List<? extends cleon.ddd.spec.valueobjects.javamodel.IValueObjectDekomposition> valueObjects) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_valueObjects, valueObjects);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_decomposeClasses, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph.class, cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description, visitor);
    _acceptSingle(cleon.ddd.spec.services.javamodel.IServiceDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_domainServices, visitor);
    _acceptList(cleon.ddd.spec.entities.javamodel.IEntityDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_entities, visitor);
    _acceptList(cleon.uml.spec.structural.classes.enums.javamodel.IEnumDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_enums, visitor);
    _acceptList(cleon.eda.spec.eventaggregator.javamodel.IEventAggregator.class, cleon.ddd.spec.SpecPackage.Aggregate_eventAggregator, visitor);
    _acceptList(cleon.ddd.spec.exceptions.javamodel.IExceptionDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_exceptions, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptList(cleon.ddd.spec.repository.javamodel.IRepositoryDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_repository, visitor);
    _acceptList(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.ddd.spec.valueobjects.javamodel.IValueObjectDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_valueObjects, visitor);
  }

  // toMeRelations
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeEntities(cleon.ddd.spec.entities.javamodel.IEntityDekomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_entities, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeExceptions(cleon.ddd.spec.exceptions.javamodel.IExceptionDekomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_exceptions, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeValueObjects(cleon.ddd.spec.valueobjects.javamodel.IValueObjectDekomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_valueObjects, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeRepository(cleon.ddd.spec.repository.javamodel.IRepositoryDekomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_repository, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeDomainServices(cleon.ddd.spec.services.javamodel.IServiceDekomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_domainServices, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeEnums(cleon.uml.spec.structural.classes.enums.javamodel.IEnumDekomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_enums, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeEventAggregator(cleon.eda.spec.eventaggregator.javamodel.IEventAggregator object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_eventAggregator, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,83c13817-10c0-11e3-b60e-ab478a3e1eca,KZLKEToVGbAfBmMNbGetxi1YW3E=] */
