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
  public cleon.ddd.spec.services.javamodel.IServiceDekomposition selectDecomposeDomainServices() {
    return _getSingle(cleon.ddd.spec.services.javamodel.IServiceDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeDomainServices);
  }

  public Aggregate setDecomposeDomainServices(cleon.ddd.spec.services.javamodel.IServiceDekomposition decomposeDomainServices) {
    _setSingle(cleon.ddd.spec.SpecPackage.Aggregate_decomposeDomainServices, decomposeDomainServices);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.ddd.spec.entities.javamodel.IEntityDekomposition> selectDecomposeEntities() {
    return _getList(cleon.ddd.spec.entities.javamodel.IEntityDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeEntities);
  }

  public Aggregate setDecomposeEntities(java.util.List<? extends cleon.ddd.spec.entities.javamodel.IEntityDekomposition> decomposeEntities) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_decomposeEntities, decomposeEntities);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.enums.javamodel.IEnumDekomposition> selectDecomposeEnums() {
    return _getList(cleon.uml.spec.structural.classes.enums.javamodel.IEnumDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeEnums);
  }

  public Aggregate setDecomposeEnums(java.util.List<? extends cleon.uml.spec.structural.classes.enums.javamodel.IEnumDekomposition> decomposeEnums) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_decomposeEnums, decomposeEnums);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.eda.spec.eventaggregator.javamodel.IEventAggregator> selectDecomposeEventAggregator() {
    return _getList(cleon.eda.spec.eventaggregator.javamodel.IEventAggregator.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeEventAggregator);
  }

  public Aggregate setDecomposeEventAggregator(java.util.List<? extends cleon.eda.spec.eventaggregator.javamodel.IEventAggregator> decomposeEventAggregator) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_decomposeEventAggregator, decomposeEventAggregator);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.ddd.spec.exceptions.javamodel.IExceptionDekomposition> selectDecomposeExceptions() {
    return _getList(cleon.ddd.spec.exceptions.javamodel.IExceptionDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeExceptions);
  }

  public Aggregate setDecomposeExceptions(java.util.List<? extends cleon.ddd.spec.exceptions.javamodel.IExceptionDekomposition> decomposeExceptions) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_decomposeExceptions, decomposeExceptions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.ddd.spec.repository.javamodel.IRepositoryDekomposition> selectDecomposeRepository() {
    return _getList(cleon.ddd.spec.repository.javamodel.IRepositoryDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeRepository);
  }

  public Aggregate setDecomposeRepository(java.util.List<? extends cleon.ddd.spec.repository.javamodel.IRepositoryDekomposition> decomposeRepository) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_decomposeRepository, decomposeRepository);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.ddd.spec.valueobjects.javamodel.IValueObjectDekomposition> selectDecomposeValueObjects() {
    return _getList(cleon.ddd.spec.valueobjects.javamodel.IValueObjectDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeValueObjects);
  }

  public Aggregate setDecomposeValueObjects(java.util.List<? extends cleon.ddd.spec.valueobjects.javamodel.IValueObjectDekomposition> decomposeValueObjects) {
    _setList(cleon.ddd.spec.SpecPackage.Aggregate_decomposeValueObjects, decomposeValueObjects);
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
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_decomposeClasses, visitor);
    _acceptSingle(cleon.ddd.spec.services.javamodel.IServiceDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeDomainServices, visitor);
    _acceptList(cleon.ddd.spec.entities.javamodel.IEntityDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeEntities, visitor);
    _acceptList(cleon.uml.spec.structural.classes.enums.javamodel.IEnumDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeEnums, visitor);
    _acceptList(cleon.eda.spec.eventaggregator.javamodel.IEventAggregator.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeEventAggregator, visitor);
    _acceptList(cleon.ddd.spec.exceptions.javamodel.IExceptionDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeExceptions, visitor);
    _acceptList(cleon.ddd.spec.repository.javamodel.IRepositoryDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeRepository, visitor);
    _acceptList(cleon.ddd.spec.valueobjects.javamodel.IValueObjectDekomposition.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeValueObjects, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptList(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeDecomposeEntities(cleon.ddd.spec.entities.javamodel.IEntityDekomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeEntities, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeDecomposeExceptions(cleon.ddd.spec.exceptions.javamodel.IExceptionDekomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeExceptions, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeDecomposeValueObjects(cleon.ddd.spec.valueobjects.javamodel.IValueObjectDekomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeValueObjects, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeDecomposeRepository(cleon.ddd.spec.repository.javamodel.IRepositoryDekomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeRepository, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeDecomposeDomainServices(cleon.ddd.spec.services.javamodel.IServiceDekomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeDomainServices, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeDecomposeEnums(cleon.uml.spec.structural.classes.enums.javamodel.IEnumDekomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeEnums, object.getResource());
  }
  
  public static cleon.ddd.spec.javamodel.IAggregate selectToMeDecomposeEventAggregator(cleon.eda.spec.eventaggregator.javamodel.IEventAggregator object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IAggregate.class, cleon.ddd.spec.SpecPackage.Aggregate_decomposeEventAggregator, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,83c13817-10c0-11e3-b60e-ab478a3e1eca,PKGU7ac3uM5ucFlGuMxMPF/JsgM=] */
