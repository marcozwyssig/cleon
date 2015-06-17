package cleon.ddd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RepositoryPackage extends DynamicResource implements IRepositoryPackage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRepositoryPackage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRepositoryPackage>() {
    
    @Override
    public IRepositoryPackage create() {
      return new RepositoryPackage();
    }
    
    @Override
    public IRepositoryPackage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RepositoryPackage(resourceRepository, resource);
    }
  
  };

  public RepositoryPackage() {
    super(IRepositoryPackage.TYPE_ID);
  }
  
  public RepositoryPackage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRepositoryPackage.TYPE_ID);
  }

  // attributes
  
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

  public RepositoryPackage setChapters(java.util.List<? extends cleon.doc.spec.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.javamodel.IClassifier> selectClasses() {
    return _getList(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_classes);
  }

  public RepositoryPackage setClasses(java.util.List<? extends cleon.uml.spec.structural.classes.javamodel.IClassifier> classes) {
    _setList(cleon.uml.spec.structural.packages.PackagesPackage.Package_classes, classes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public RepositoryPackage setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.ddd.spec.javamodel.IRepository> selectRepositories() {
    return _getList(cleon.ddd.spec.javamodel.IRepository.class, cleon.ddd.spec.SpecPackage.RepositoryPackage_repositories);
  }

  public RepositoryPackage setRepositories(java.util.List<? extends cleon.ddd.spec.javamodel.IRepository> repositories) {
    _setList(cleon.ddd.spec.SpecPackage.RepositoryPackage_repositories, repositories);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackage> selectSubPackages() {
    return _getList(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages);
  }

  public RepositoryPackage setSubPackages(java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackage> subPackages) {
    _setList(cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, subPackages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RepositoryPackage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock> selectUseDecompositions() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions);
  }

  public RepositoryPackage setUseDecompositions(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock> useDecompositions) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, useDecompositions);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    // relations
    _acceptList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters, visitor);
    _acceptList(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_classes, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.ddd.spec.javamodel.IRepository.class, cleon.ddd.spec.SpecPackage.RepositoryPackage_repositories, visitor);
    _acceptList(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, visitor);
  }

  // toMeRelations
  
  public static cleon.ddd.spec.javamodel.IRepositoryPackage selectToMeRepositories(cleon.ddd.spec.javamodel.IRepository object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IRepositoryPackage.class, cleon.ddd.spec.SpecPackage.RepositoryPackage_repositories, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6b207fc8-01ce-11e4-ab1e-81fd30785d6d,lrwqQ01kWPFJJnxwf+HX97qA75g=] */
