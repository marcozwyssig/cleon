package cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ActivitySystemConfiguration extends DynamicResource implements IActivitySystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivitySystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivitySystemConfiguration>() {
    
    @Override
    public IActivitySystemConfiguration create() {
      return new ActivitySystemConfiguration();
    }
    
    @Override
    public IActivitySystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ActivitySystemConfiguration(resourceRepository, resource);
    }
  
  };

  public ActivitySystemConfiguration() {
    super(IActivitySystemConfiguration.TYPE_ID);
  }
  
  public ActivitySystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IActivitySystemConfiguration.TYPE_ID);
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
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivityPermission> selectActivitiesForPermissions() {
    return _getMap(cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivityPermission.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.ActivityPackage.ActivitySystemConfiguration_activitiesForPermissions);
  }

  public ActivitySystemConfiguration setActivitiesForPermissions(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivityPermission> activitiesForPermissions) {
    _setMap(cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.ActivityPackage.ActivitySystemConfiguration_activitiesForPermissions, activitiesForPermissions);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor selectApproval() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractSecurityGroups_approval);
  }

  public ActivitySystemConfiguration setApproval(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor approval) {
    _setSingle(cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractSecurityGroups_approval, approval);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public ActivitySystemConfiguration setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ActivitySystemConfiguration setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractGroup> selectGroups() {
    return _getList(cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractGroup.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractGroups_groups);
  }

  public ActivitySystemConfiguration setGroups(java.util.List<? extends cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractGroup> groups) {
    _setList(cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractGroups_groups, groups);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ActivitySystemConfiguration setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor selectResponsible() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractSecurityGroups_responsible);
  }

  public ActivitySystemConfiguration setResponsible(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor responsible) {
    _setSingle(cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractSecurityGroups_responsible, responsible);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration selectSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.itarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.ActivityPackage.ActivitySystemConfiguration_systemConfiguration);
  }

  public ActivitySystemConfiguration setSystemConfiguration(cleon.architecturemethods.itarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration systemConfiguration) {
    _setSingle(cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.ActivityPackage.ActivitySystemConfiguration_systemConfiguration, systemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ActivitySystemConfiguration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ActivitySystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivityPermission.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.ActivityPackage.ActivitySystemConfiguration_activitiesForPermissions, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractSecurityGroups_approval, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractSecurityGroups_responsible, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.ActivityPackage.ActivitySystemConfiguration_systemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivitySystemConfiguration> selectToMeSystemConfiguration(cleon.architecturemethods.itarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivitySystemConfiguration.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.ActivityPackage.ActivitySystemConfiguration_systemConfiguration, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivitySystemConfiguration selectToMeActivitiesForPermissions(cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivityPermission object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivitySystemConfiguration.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.ActivityPackage.ActivitySystemConfiguration_activitiesForPermissions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0ef24c7d-1d9a-11e9-b601-db75aa6f89a4,B4rCKci68qSvzIjqQlHkfZoo2Nw=] */
