package ikt.product.documentation.spec.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RoleGroups extends DynamicResource implements IRoleGroups {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleGroups> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleGroups>() {
    
    @Override
    public IRoleGroups create() {
      return new RoleGroups();
    }
    
    @Override
    public IRoleGroups create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RoleGroups(resourceRepository, resource);
    }
  
  };

  public RoleGroups() {
    super(IRoleGroups.TYPE_ID);
  }
  
  public RoleGroups(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRoleGroups.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public RoleGroups setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public RoleGroups setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public RoleGroups setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRoleSecurityGroup> selectRoles() {
    return _getMultiMap(ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRoleSecurityGroup.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.RoleGroups_roles);
  }

  public RoleGroups setRoles(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRoleSecurityGroup> roles) {
    _setMultiMap(ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.RoleGroups_roles, roles);
    return this;
  }
    
  @Override
  public java.util.List<? extends ikt.product.documentation.spec.concepts.security.rbac.javamodel.ISecurityGroups> selectSecurityGroups() {
    return _getList(ikt.product.documentation.spec.concepts.security.rbac.javamodel.ISecurityGroups.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.Groups_securityGroups);
  }

  public RoleGroups setSecurityGroups(java.util.List<? extends ikt.product.documentation.spec.concepts.security.rbac.javamodel.ISecurityGroups> securityGroups) {
    _setList(ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.Groups_securityGroups, securityGroups);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RoleGroups setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMultiMap(ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRoleSecurityGroup.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.RoleGroups_roles, visitor);
    _acceptList(ikt.product.documentation.spec.concepts.security.rbac.javamodel.ISecurityGroups.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.Groups_securityGroups, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRoleGroups selectToMeRoles(ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRoleSecurityGroup object) {
    return _getToMeSingle(object.getRepository(), ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRoleGroups.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.RoleGroups_roles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3e5a557a-1d99-11e9-b601-db75aa6f89a4,p6HjBDr48p4fv8G9BdpwMYXqXiA=] */
