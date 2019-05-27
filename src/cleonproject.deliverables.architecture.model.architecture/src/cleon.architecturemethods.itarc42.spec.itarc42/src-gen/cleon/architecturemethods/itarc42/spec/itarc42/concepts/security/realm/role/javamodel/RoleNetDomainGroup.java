package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.realm.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RoleNetDomainGroup extends DynamicResource implements IRoleNetDomainGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleNetDomainGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleNetDomainGroup>() {
    
    @Override
    public IRoleNetDomainGroup create() {
      return new RoleNetDomainGroup();
    }
    
    @Override
    public IRoleNetDomainGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RoleNetDomainGroup(resourceRepository, resource);
    }
  
  };

  public RoleNetDomainGroup() {
    super(IRoleNetDomainGroup.TYPE_ID);
  }
  
  public RoleNetDomainGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRoleNetDomainGroup.TYPE_ID);
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

  public RoleNetDomainGroup setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public RoleNetDomainGroup setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroup> selectGroups() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroup.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractGroups_groups);
  }

  public RoleNetDomainGroup setGroups(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroup> groups) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractGroups_groups, groups);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode selectNetdomain() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractNetdomainGroup_netdomain);
  }

  public RoleNetDomainGroup setNetdomain(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode netdomain) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractNetdomainGroup_netdomain, netdomain);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public RoleNetDomainGroup setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.realm.role.javamodel.IRoleActorGroup> selectRoles() {
    return _getMap(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.realm.role.javamodel.IRoleActorGroup.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.realm.role.RolePackage.RoleNetDomainGroup_roles);
  }

  public RoleNetDomainGroup setRoles(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.realm.role.javamodel.IRoleActorGroup> roles) {
    _setMap(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.realm.role.RolePackage.RoleNetDomainGroup_roles, roles);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractSecurityGroups> selectSecurityGroups() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractSecurityGroups.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractNetdomainGroup_securityGroups);
  }

  public RoleNetDomainGroup setSecurityGroups(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractSecurityGroups> securityGroups) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractNetdomainGroup_securityGroups, securityGroups);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RoleNetDomainGroup setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RoleNetDomainGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroup.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractGroups_groups, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractNetdomainGroup_netdomain, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.realm.role.javamodel.IRoleActorGroup.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.realm.role.RolePackage.RoleNetDomainGroup_roles, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractSecurityGroups.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractNetdomainGroup_securityGroups, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.realm.role.javamodel.IRoleNetDomainGroup selectToMeRoles(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.realm.role.javamodel.IRoleActorGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.realm.role.javamodel.IRoleNetDomainGroup.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.realm.role.RolePackage.RoleNetDomainGroup_roles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,94d1c1e5-1da3-11e9-b601-db75aa6f89a4,ZMR+kGujMZWAPEhrXncEsjtVxIY=] */
