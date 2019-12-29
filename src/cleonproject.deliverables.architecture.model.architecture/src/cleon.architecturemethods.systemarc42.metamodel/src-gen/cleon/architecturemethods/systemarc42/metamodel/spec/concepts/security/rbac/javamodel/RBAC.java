package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RBAC extends DynamicResource implements IRBAC {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRBAC> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRBAC>() {
    
    @Override
    public IRBAC create() {
      return new RBAC();
    }
    
    @Override
    public IRBAC create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RBAC(resourceRepository, resource);
    }
  
  };

  public RBAC() {
    super(IRBAC.TYPE_ID);
  }
  
  public RBAC(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRBAC.TYPE_ID);
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
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivityRootGroups selectActivities() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivityRootGroups.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.RBAC_activities);
  }

  public RBAC setActivities(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivityRootGroups activities) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.RBAC_activities, activities);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public RBAC setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public RBAC setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.IEnvironment selectEnvironment() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.IEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.RBAC_environment);
  }

  public RBAC setEnvironment(cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.IEnvironment environment) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.RBAC_environment, environment);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public RBAC setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.role.javamodel.IRoleRootGroups selectRoles() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.role.javamodel.IRoleRootGroups.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.RBAC_roles);
  }

  public RBAC setRoles(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.role.javamodel.IRoleRootGroups roles) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.RBAC_roles, roles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RBAC setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RBAC setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivityRootGroups.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.RBAC_activities, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.IEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.RBAC_environment, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.role.javamodel.IRoleRootGroups.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.RBAC_roles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IRBAC selectToMeRoles(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.role.javamodel.IRoleRootGroups object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IRBAC.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.RBAC_roles, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IRBAC selectToMeActivities(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivityRootGroups object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IRBAC.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.RBAC_activities, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IRBAC> selectToMeEnvironment(cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.IEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IRBAC.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.RBAC_environment, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6c337cfe-0eaf-11e9-9f19-6d15636f4ecc,BMlaqRTYQSAF7/mtQy4a3Kusi98=] */