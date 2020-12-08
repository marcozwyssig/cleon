package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServiceAccountBuildingBlocks extends DynamicResource implements IServiceAccountBuildingBlocks {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceAccountBuildingBlocks> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceAccountBuildingBlocks>() {
    
    @Override
    public IServiceAccountBuildingBlocks create() {
      return new ServiceAccountBuildingBlocks();
    }
    
    @Override
    public IServiceAccountBuildingBlocks create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServiceAccountBuildingBlocks(resourceRepository, resource);
    }
  
  };

  public ServiceAccountBuildingBlocks() {
    super(IServiceAccountBuildingBlocks.TYPE_ID);
  }
  
  public ServiceAccountBuildingBlocks(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServiceAccountBuildingBlocks.TYPE_ID);
  }

  // attributes
  
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

  public ServiceAccountBuildingBlocks setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ServiceAccountBuildingBlocks setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ServiceAccountBuildingBlocks setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountBuildingBlockSystem> selectServiceAccountBuildingBlockSystem() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountBuildingBlockSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccountBuildingBlocks_serviceAccountBuildingBlockSystem);
  }

  public ServiceAccountBuildingBlocks setServiceAccountBuildingBlockSystem(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountBuildingBlockSystem> serviceAccountBuildingBlockSystem) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccountBuildingBlocks_serviceAccountBuildingBlockSystem, serviceAccountBuildingBlockSystem);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServiceAccountBuildingBlocks setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountBuildingBlockSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccountBuildingBlocks_serviceAccountBuildingBlockSystem, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountBuildingBlocks selectToMeServiceAccountBuildingBlockSystem(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountBuildingBlockSystem object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountBuildingBlocks.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccountBuildingBlocks_serviceAccountBuildingBlockSystem, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,16bcefe1-395b-11eb-978d-47c0228773ba,0D0IeZOyn6sL9E5aw7/mJduf4vQ=] */
