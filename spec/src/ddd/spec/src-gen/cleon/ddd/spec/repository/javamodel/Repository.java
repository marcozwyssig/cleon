package cleon.ddd.spec.repository.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Repository extends DynamicResource implements IRepository {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRepository> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRepository>() {
    
    @Override
    public IRepository create() {
      return new Repository();
    }
    
    @Override
    public IRepository create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Repository(resourceRepository, resource);
    }
  
  };

  public Repository() {
    super(IRepository.TYPE_ID);
  }
  
  public Repository(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRepository.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Repository setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.interfaces.javamodel.IInterfaceData> selectData() {
    return _getList(cleon.uml.spec.structural.classes.interfaces.javamodel.IInterfaceData.class, cleon.uml.spec.structural.classes.interfaces.InterfacesPackage.InterfaceService_data);
  }

  public Repository setData(java.util.List<? extends cleon.uml.spec.structural.classes.interfaces.javamodel.IInterfaceData> data) {
    _setList(cleon.uml.spec.structural.classes.interfaces.InterfacesPackage.InterfaceService_data, data);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose);
  }

  public Repository setDecompose(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> decompose) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.method.javamodel.IMethod> selectGetBy() {
    return _getList(cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.ddd.spec.repository.RepositoryPackage.Repository_getBy);
  }

  public Repository setGetBy(java.util.List<? extends cleon.uml.spec.structural.classes.method.javamodel.IMethod> getBy) {
    _setList(cleon.ddd.spec.repository.RepositoryPackage.Repository_getBy, getBy);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.method.javamodel.IMethod> selectMethods() {
    return _getList(cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.uml.spec.structural.classes.method.MethodPackage.MethodClass_methods);
  }

  public Repository setMethods(java.util.List<? extends cleon.uml.spec.structural.classes.method.javamodel.IMethod> methods) {
    _setList(cleon.uml.spec.structural.classes.method.MethodPackage.MethodClass_methods, methods);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Repository setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Repository setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.ddd.spec.entities.javamodel.IEntity selectSearch() {
    return _getSingle(cleon.ddd.spec.entities.javamodel.IEntity.class, cleon.ddd.spec.repository.RepositoryPackage.Repository_search);
  }

  public Repository setSearch(cleon.ddd.spec.entities.javamodel.IEntity search) {
    _setSingle(cleon.ddd.spec.repository.RepositoryPackage.Repository_search, search);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.method.javamodel.IMethod> selectSearchBy() {
    return _getList(cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.ddd.spec.repository.RepositoryPackage.Repository_searchBy);
  }

  public Repository setSearchBy(java.util.List<? extends cleon.uml.spec.structural.classes.method.javamodel.IMethod> searchBy) {
    _setList(cleon.ddd.spec.repository.RepositoryPackage.Repository_searchBy, searchBy);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Repository setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.uml.spec.structural.classes.interfaces.javamodel.IInterfaceData.class, cleon.uml.spec.structural.classes.interfaces.InterfacesPackage.InterfaceService_data, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.ddd.spec.repository.RepositoryPackage.Repository_getBy, visitor);
    _acceptList(cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.uml.spec.structural.classes.method.MethodPackage.MethodClass_methods, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.ddd.spec.entities.javamodel.IEntity.class, cleon.ddd.spec.repository.RepositoryPackage.Repository_search, visitor);
    _acceptList(cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.ddd.spec.repository.RepositoryPackage.Repository_searchBy, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.ddd.spec.repository.javamodel.IRepository> selectToMeSearch(cleon.ddd.spec.entities.javamodel.IEntity object) {
    return _getToMeList(object.getRepository(), cleon.ddd.spec.repository.javamodel.IRepository.class, cleon.ddd.spec.repository.RepositoryPackage.Repository_search, object.getResource());
  }
  
  public static cleon.ddd.spec.repository.javamodel.IRepository selectToMeSearchBy(cleon.uml.spec.structural.classes.method.javamodel.IMethod object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.repository.javamodel.IRepository.class, cleon.ddd.spec.repository.RepositoryPackage.Repository_searchBy, object.getResource());
  }
  
  public static cleon.ddd.spec.repository.javamodel.IRepository selectToMeGetBy(cleon.uml.spec.structural.classes.method.javamodel.IMethod object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.repository.javamodel.IRepository.class, cleon.ddd.spec.repository.RepositoryPackage.Repository_getBy, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5e627f84-10c2-11e3-b60e-ab478a3e1eca,03oxidpBeSpJ43dgZQeE1otyWhk=] */
