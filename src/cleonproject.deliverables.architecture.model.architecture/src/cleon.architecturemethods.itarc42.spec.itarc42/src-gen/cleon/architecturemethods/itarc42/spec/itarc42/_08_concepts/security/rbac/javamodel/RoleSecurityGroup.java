package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RoleSecurityGroup extends DynamicResource implements IRoleSecurityGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleSecurityGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleSecurityGroup>() {
    
    @Override
    public IRoleSecurityGroup create() {
      return new RoleSecurityGroup();
    }
    
    @Override
    public IRoleSecurityGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RoleSecurityGroup(resourceRepository, resource);
    }
  
  };

  public RoleSecurityGroup() {
    super(IRoleSecurityGroup.TYPE_ID);
  }
  
  public RoleSecurityGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRoleSecurityGroup.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.util.List<java.lang.String> selectMandatoryDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions);
  }
    
  public void setMandatoryDescriptions(java.util.List<java.lang.String> mandatoryDescriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, mandatoryDescriptions);
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
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.RoleSecurityGroup_roleDescription);
  }
    
  public void setRoleDescription(java.lang.String roleDescription) {
     _setSingleAttribute(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.RoleSecurityGroup_roleDescription, roleDescription);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor selectActor() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.RoleSecurityGroup_actor);
  }

  public RoleSecurityGroup setActor(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor actor) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.RoleSecurityGroup_actor, actor);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor selectApproval() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.SecurityGroups_approval);
  }

  public RoleSecurityGroup setApproval(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor approval) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.SecurityGroups_approval, approval);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public RoleSecurityGroup setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public RoleSecurityGroup setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public RoleSecurityGroup setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor selectResponsible() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.SecurityGroups_responsible);
  }

  public RoleSecurityGroup setResponsible(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor responsible) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.SecurityGroups_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRoleSubnetGroup> selectRoles() {
    return _getMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRoleSubnetGroup.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.RoleSecurityGroup_roles);
  }

  public RoleSecurityGroup setRoles(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRoleSubnetGroup> roles) {
    _setMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.RoleSecurityGroup_roles, roles);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISubnetGroup> selectSubnetGroup() {
    return _getMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISubnetGroup.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.SecurityGroups_subnetGroup);
  }

  public RoleSecurityGroup setSubnetGroup(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISubnetGroup> subnetGroup) {
    _setMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.SecurityGroups_subnetGroup, subnetGroup);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RoleSecurityGroup setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RoleSecurityGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.RoleSecurityGroup_roleDescription, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.RoleSecurityGroup_actor, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.SecurityGroups_approval, visitor);
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.SecurityGroups_responsible, visitor);
    _acceptMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRoleSubnetGroup.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.RoleSecurityGroup_roles, visitor);
    _acceptMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISubnetGroup.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.SecurityGroups_subnetGroup, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRoleSecurityGroup> selectToMeActor(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRoleSecurityGroup.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.RoleSecurityGroup_actor, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRoleSecurityGroup selectToMeRoles(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRoleSubnetGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRoleSecurityGroup.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.RoleSecurityGroup_roles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,88193678-1d9f-11e9-b601-db75aa6f89a4,6Gw71QBiU9Y/aqKngvRabelT9M0=] */
