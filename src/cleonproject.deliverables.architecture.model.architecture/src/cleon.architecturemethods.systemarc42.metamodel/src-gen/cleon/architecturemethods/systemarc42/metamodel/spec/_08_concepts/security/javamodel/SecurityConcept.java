package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SecurityConcept extends DynamicResource implements ISecurityConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecurityConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecurityConcept>() {
    
    @Override
    public ISecurityConcept create() {
      return new SecurityConcept();
    }
    
    @Override
    public ISecurityConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SecurityConcept(resourceRepository, resource);
    }
  
  };

  public SecurityConcept() {
    super(ISecurityConcept.TYPE_ID);
  }
  
  public SecurityConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISecurityConcept.TYPE_ID);
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
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IAccounts selectAccounts() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IAccounts.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_accounts);
  }

  public SecurityConcept setAccounts(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IAccounts accounts) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_accounts, accounts);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public SecurityConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SecurityConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SecurityConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IRBAC selectRbac() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IRBAC.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_rbac);
  }

  public SecurityConcept setRbac(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IRBAC rbac) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_rbac, rbac);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IDirectoryService selectRealm() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IDirectoryService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_realm);
  }

  public SecurityConcept setRealm(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IDirectoryService realm) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_realm, realm);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SecurityConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IAccounts.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_accounts, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IRBAC.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_rbac, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IDirectoryService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_realm, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept selectToMeRealm(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IDirectoryService object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_realm, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept selectToMeRbac(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IRBAC object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_rbac, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept selectToMeAccounts(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IAccounts object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_accounts, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9515e875-0eae-11e9-9f19-6d15636f4ecc,Sata7oRkciNNBy0gRwk/KI/OHFs=] */
