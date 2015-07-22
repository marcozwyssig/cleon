package cleon.ddd.spec.repository.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RepositoryDekomposition extends DynamicResource implements IRepositoryDekomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRepositoryDekomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRepositoryDekomposition>() {
    
    @Override
    public IRepositoryDekomposition create() {
      return new RepositoryDekomposition();
    }
    
    @Override
    public IRepositoryDekomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RepositoryDekomposition(resourceRepository, resource);
    }
  
  };

  public RepositoryDekomposition() {
    super(IRepositoryDekomposition.TYPE_ID);
  }
  
  public RepositoryDekomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRepositoryDekomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public RepositoryDekomposition setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.javamodel.IClassifier selectClass() {
    return _getSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.ClassifierDecomposition_class);
  }

  public RepositoryDekomposition setClass(cleon.uml.spec.structural.classes.javamodel.IClassifier class_) {
    _setSingle(cleon.uml.spec.structural.packages.PackagesPackage.ClassifierDecomposition_class, class_);
    return this;
  }
    
  @Override
  public cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock selectDecompose() {
    return _getSingle(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_decompose);
  }

  public RepositoryDekomposition setDecompose(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock decompose) {
    _setSingle(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public RepositoryDekomposition setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public RepositoryDekomposition setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.ddd.spec.repository.javamodel.IRepository selectRepository() {
    return _getSingle(cleon.ddd.spec.repository.javamodel.IRepository.class, cleon.ddd.spec.repository.RepositoryPackage.RepositoryDekomposition_repository);
  }

  public RepositoryDekomposition setRepository(cleon.ddd.spec.repository.javamodel.IRepository repository) {
    _setSingle(cleon.ddd.spec.repository.RepositoryPackage.RepositoryDekomposition_repository, repository);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RepositoryDekomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.ClassifierDecomposition_class, visitor);
    _acceptSingle(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_decompose, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptSingle(cleon.ddd.spec.repository.javamodel.IRepository.class, cleon.ddd.spec.repository.RepositoryPackage.RepositoryDekomposition_repository, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.ddd.spec.repository.javamodel.IRepositoryDekomposition selectToMeRepository(cleon.ddd.spec.repository.javamodel.IRepository object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.repository.javamodel.IRepositoryDekomposition.class, cleon.ddd.spec.repository.RepositoryPackage.RepositoryDekomposition_repository, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,43b7a073-28b4-11e5-8b63-33a353e42346,ieUwz0oszY/03vU7pHKGt5wyh6E=] */
