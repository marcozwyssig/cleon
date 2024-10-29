package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AutorizationConcept extends DynamicResource implements IAutorizationConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAutorizationConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAutorizationConcept>() {
    
    @Override
    public IAutorizationConcept create() {
      return new AutorizationConcept();
    }
    
    @Override
    public IAutorizationConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AutorizationConcept(resourceRepository, resource);
    }
  
  };

  public AutorizationConcept() {
    super(IAutorizationConcept.TYPE_ID);
  }
  
  public AutorizationConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAutorizationConcept.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, chapterPath);
  }

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
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.javamodel.IAuthZBuildingBlockConcept selectAuthZForBuildingBlock() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.javamodel.IAuthZBuildingBlockConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.AuthzPackage.AutorizationConcept_authZForBuildingBlock);
  }

  public AutorizationConcept setAuthZForBuildingBlock(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.javamodel.IAuthZBuildingBlockConcept authZForBuildingBlock) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.AuthzPackage.AutorizationConcept_authZForBuildingBlock, authZForBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAuthZEnvironmentConcept selectAuthZForEnvironment() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAuthZEnvironmentConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.AuthzPackage.AutorizationConcept_authZForEnvironment);
  }

  public AutorizationConcept setAuthZForEnvironment(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAuthZEnvironmentConcept authZForEnvironment) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.AuthzPackage.AutorizationConcept_authZForEnvironment, authZForEnvironment);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.AuthzPackage.AutorizationConcept_chapters);
  }

  public AutorizationConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter> chapters) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.AuthzPackage.AutorizationConcept_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public AutorizationConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public AutorizationConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibilities selectResponsibilities() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibilities.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.AuthzPackage.AutorizationConcept_responsibilities);
  }

  public AutorizationConcept setResponsibilities(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibilities responsibilities) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.AuthzPackage.AutorizationConcept_responsibilities, responsibilities);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AutorizationConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.javamodel.IAuthZBuildingBlockConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.AuthzPackage.AutorizationConcept_authZForBuildingBlock, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAuthZEnvironmentConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.AuthzPackage.AutorizationConcept_authZForEnvironment, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.AuthzPackage.AutorizationConcept_chapters, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibilities.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.AuthzPackage.AutorizationConcept_responsibilities, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.javamodel.IAutorizationConcept selectToMeChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.javamodel.IAutorizationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.AuthzPackage.AutorizationConcept_chapters, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.javamodel.IAutorizationConcept selectToMeAuthZForBuildingBlock(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.javamodel.IAuthZBuildingBlockConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.javamodel.IAutorizationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.AuthzPackage.AutorizationConcept_authZForBuildingBlock, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.javamodel.IAutorizationConcept selectToMeAuthZForEnvironment(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAuthZEnvironmentConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.javamodel.IAutorizationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.AuthzPackage.AutorizationConcept_authZForEnvironment, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.javamodel.IAutorizationConcept> selectToMeResponsibilities(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibilities object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.javamodel.IAutorizationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.AuthzPackage.AutorizationConcept_responsibilities, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9db33409-6e8e-11ea-b8e8-f1a46e0c42f7,gVujtvj8noSUdgAw7Fg8927V6Ac=] */
