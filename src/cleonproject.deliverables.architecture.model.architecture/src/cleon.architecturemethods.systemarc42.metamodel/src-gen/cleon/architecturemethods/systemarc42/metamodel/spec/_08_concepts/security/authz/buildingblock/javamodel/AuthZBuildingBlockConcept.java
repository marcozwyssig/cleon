package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AuthZBuildingBlockConcept extends DynamicResource implements IAuthZBuildingBlockConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAuthZBuildingBlockConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAuthZBuildingBlockConcept>() {
    
    @Override
    public IAuthZBuildingBlockConcept create() {
      return new AuthZBuildingBlockConcept();
    }
    
    @Override
    public IAuthZBuildingBlockConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AuthZBuildingBlockConcept(resourceRepository, resource);
    }
  
  };

  public AuthZBuildingBlockConcept() {
    super(IAuthZBuildingBlockConcept.TYPE_ID);
  }
  
  public AuthZBuildingBlockConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAuthZBuildingBlockConcept.TYPE_ID);
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
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockActivity selectAuthZBuildingBlockActivity() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockActivity.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.BuildingblockPackage.AuthZBuildingBlockConcept_authZBuildingBlockActivity);
  }

  public AuthZBuildingBlockConcept setAuthZBuildingBlockActivity(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockActivity authZBuildingBlockActivity) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.BuildingblockPackage.AuthZBuildingBlockConcept_authZBuildingBlockActivity, authZBuildingBlockActivity);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockActor selectAuthZBuildingBlockActor() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockActor.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.BuildingblockPackage.AuthZBuildingBlockConcept_authZBuildingBlockActor);
  }

  public AuthZBuildingBlockConcept setAuthZBuildingBlockActor(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockActor authZBuildingBlockActor) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.BuildingblockPackage.AuthZBuildingBlockConcept_authZBuildingBlockActor, authZBuildingBlockActor);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public AuthZBuildingBlockConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public AuthZBuildingBlockConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public AuthZBuildingBlockConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AuthZBuildingBlockConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockActivity.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.BuildingblockPackage.AuthZBuildingBlockConcept_authZBuildingBlockActivity, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockActor.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.BuildingblockPackage.AuthZBuildingBlockConcept_authZBuildingBlockActor, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.javamodel.IAuthZBuildingBlockConcept selectToMeAuthZBuildingBlockActivity(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockActivity object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.javamodel.IAuthZBuildingBlockConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.BuildingblockPackage.AuthZBuildingBlockConcept_authZBuildingBlockActivity, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.javamodel.IAuthZBuildingBlockConcept selectToMeAuthZBuildingBlockActor(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockActor object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.javamodel.IAuthZBuildingBlockConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.BuildingblockPackage.AuthZBuildingBlockConcept_authZBuildingBlockActor, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4b83a3b8-032a-11eb-af88-136a9a3b3817,Hn3XPOneiwNUP8to3EJPrMq1o4k=] */
