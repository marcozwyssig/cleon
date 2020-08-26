package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DirectoryServiceConcept extends DynamicResource implements IDirectoryServiceConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDirectoryServiceConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDirectoryServiceConcept>() {
    
    @Override
    public IDirectoryServiceConcept create() {
      return new DirectoryServiceConcept();
    }
    
    @Override
    public IDirectoryServiceConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DirectoryServiceConcept(resourceRepository, resource);
    }
  
  };

  public DirectoryServiceConcept() {
    super(IDirectoryServiceConcept.TYPE_ID);
  }
  
  public DirectoryServiceConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDirectoryServiceConcept.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public DirectoryServiceConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryService> selectDirectoryService() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceConcept_directoryService);
  }

  public DirectoryServiceConcept setDirectoryService(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryService> directoryService) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceConcept_directoryService, directoryService);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceForSystemConfiguration> selectDirectoryServiceForSystemConfigurations() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceForSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceConcept_directoryServiceForSystemConfigurations);
  }

  public DirectoryServiceConcept setDirectoryServiceForSystemConfigurations(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceForSystemConfiguration> directoryServiceForSystemConfigurations) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceConcept_directoryServiceForSystemConfigurations, directoryServiceForSystemConfigurations);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public DirectoryServiceConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public DirectoryServiceConcept setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DirectoryServiceConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DirectoryServiceConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceConcept_directoryService, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceForSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceConcept_directoryServiceForSystemConfigurations, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceConcept selectToMeDirectoryServiceForSystemConfigurations(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceForSystemConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceConcept_directoryServiceForSystemConfigurations, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceConcept selectToMeDirectoryService(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryService object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.javamodel.IDirectoryServiceConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.directoryservice.DirectoryservicePackage.DirectoryServiceConcept_directoryService, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ebac8bd2-0eaf-11e9-9f19-6d15636f4ecc,Q9r2ujKjsk4GaKIunxBwZbu1vto=] */
