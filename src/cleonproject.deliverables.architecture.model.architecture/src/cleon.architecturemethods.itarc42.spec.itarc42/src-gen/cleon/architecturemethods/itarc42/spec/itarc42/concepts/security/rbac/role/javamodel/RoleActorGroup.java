package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RoleActorGroup extends DynamicResource implements IRoleActorGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleActorGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleActorGroup>() {
    
    @Override
    public IRoleActorGroup create() {
      return new RoleActorGroup();
    }
    
    @Override
    public IRoleActorGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RoleActorGroup(resourceRepository, resource);
    }
  
  };

  public RoleActorGroup() {
    super(IRoleActorGroup.TYPE_ID);
  }
  
  public RoleActorGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRoleActorGroup.TYPE_ID);
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

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectRoleDescription() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorGroup_roleDescription);
  }
    
  public void setRoleDescription(java.lang.String roleDescription) {
     _setSingleAttribute(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorGroup_roleDescription, roleDescription);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor selectActor() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorGroup_actor);
  }

  public RoleActorGroup setActor(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor actor) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorGroup_actor, actor);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor selectApproval() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractSecurityGroups_approval);
  }

  public RoleActorGroup setApproval(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor approval) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractSecurityGroups_approval, approval);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public RoleActorGroup setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public RoleActorGroup setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroup> selectGroups() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroup.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractGroups_groups);
  }

  public RoleActorGroup setGroups(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroup> groups) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractGroups_groups, groups);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public RoleActorGroup setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor selectResponsible() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractSecurityGroups_responsible);
  }

  public RoleActorGroup setResponsible(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor responsible) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractSecurityGroups_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleSystemComponent> selectRoles() {
    return _getMap(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleSystemComponent.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorGroup_roles);
  }

  public RoleActorGroup setRoles(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleSystemComponent> roles) {
    _setMap(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorGroup_roles, roles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RoleActorGroup setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RoleActorGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorGroup_roleDescription, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorGroup_actor, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractSecurityGroups_approval, visitor);
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroup.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractGroups_groups, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractSecurityGroups_responsible, visitor);
    _acceptMap(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleSystemComponent.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorGroup_roles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleActorGroup> selectToMeActor(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleActorGroup.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorGroup_actor, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleActorGroup selectToMeRoles(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleSystemComponent object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleActorGroup.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorGroup_roles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,88193678-1d9f-11e9-b601-db75aa6f89a4,vPAs1A/Fk9Wo0d1qBDlbsgB+tA8=] */
