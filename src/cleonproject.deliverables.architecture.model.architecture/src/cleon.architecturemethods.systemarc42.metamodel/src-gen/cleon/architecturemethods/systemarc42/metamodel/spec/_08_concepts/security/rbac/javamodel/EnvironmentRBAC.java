package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EnvironmentRBAC extends DynamicResource implements IEnvironmentRBAC {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnvironmentRBAC> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnvironmentRBAC>() {
    
    @Override
    public IEnvironmentRBAC create() {
      return new EnvironmentRBAC();
    }
    
    @Override
    public IEnvironmentRBAC create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EnvironmentRBAC(resourceRepository, resource);
    }
  
  };

  public EnvironmentRBAC() {
    super(IEnvironmentRBAC.TYPE_ID);
  }
  
  public EnvironmentRBAC(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEnvironmentRBAC.TYPE_ID);
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
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivityRootGroups selectActivities() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivityRootGroups.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.EnvironmentRBAC_activities);
  }

  public EnvironmentRBAC setActivities(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivityRootGroups activities) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.EnvironmentRBAC_activities, activities);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public EnvironmentRBAC setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public EnvironmentRBAC setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment selectEnvironment() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.EnvironmentRBAC_environment);
  }

  public EnvironmentRBAC setEnvironment(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment environment) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.EnvironmentRBAC_environment, environment);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public EnvironmentRBAC setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleRootGroups selectRoles() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleRootGroups.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.EnvironmentRBAC_roles);
  }

  public EnvironmentRBAC setRoles(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleRootGroups roles) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.EnvironmentRBAC_roles, roles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public EnvironmentRBAC setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EnvironmentRBAC setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivityRootGroups.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.EnvironmentRBAC_activities, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.EnvironmentRBAC_environment, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleRootGroups.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.EnvironmentRBAC_roles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IEnvironmentRBAC selectToMeRoles(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleRootGroups object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IEnvironmentRBAC.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.EnvironmentRBAC_roles, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IEnvironmentRBAC selectToMeActivities(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivityRootGroups object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IEnvironmentRBAC.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.EnvironmentRBAC_activities, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IEnvironmentRBAC> selectToMeEnvironment(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IEnvironmentRBAC.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.EnvironmentRBAC_environment, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6c337cfe-0eaf-11e9-9f19-6d15636f4ecc,gS+BRI359CWUdMv27IGf0Ap1sIw=] */
