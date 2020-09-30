package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ActivityRootGroups extends DynamicResource implements IActivityRootGroups {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivityRootGroups> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivityRootGroups>() {
    
    @Override
    public IActivityRootGroups create() {
      return new ActivityRootGroups();
    }
    
    @Override
    public IActivityRootGroups create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ActivityRootGroups(resourceRepository, resource);
    }
  
  };

  public ActivityRootGroups() {
    super(IActivityRootGroups.TYPE_ID);
  }
  
  public ActivityRootGroups(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IActivityRootGroups.TYPE_ID);
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
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityNetdomainGroup> selectActivitiesForNetDomain() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityNetdomainGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.ActivityPackage.ActivityRootGroups_activitiesForNetDomain);
  }

  public ActivityRootGroups setActivitiesForNetDomain(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityNetdomainGroup> activitiesForNetDomain) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.ActivityPackage.ActivityRootGroups_activitiesForNetDomain, activitiesForNetDomain);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public ActivityRootGroups setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ActivityRootGroups setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup> selectGroups() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.DeploymentPackage.AbstractGroups_groups);
  }

  public ActivityRootGroups setGroups(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup> groups) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.DeploymentPackage.AbstractGroups_groups, groups);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ActivityRootGroups setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup> selectSiteGroups() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.DeploymentPackage.AbstractRootGroups_siteGroups);
  }

  public ActivityRootGroups setSiteGroups(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup> siteGroups) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.DeploymentPackage.AbstractRootGroups_siteGroups, siteGroups);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ActivityRootGroups setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IPermissions selectUses() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IPermissions.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.ActivityPackage.ActivityRootGroups_uses);
  }

  public ActivityRootGroups setUses(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IPermissions uses) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.ActivityPackage.ActivityRootGroups_uses, uses);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityNetdomainGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.ActivityPackage.ActivityRootGroups_activitiesForNetDomain, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IPermissions.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.ActivityPackage.ActivityRootGroups_uses, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityRootGroups> selectToMeUses(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IPermissions object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityRootGroups.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.ActivityPackage.ActivityRootGroups_uses, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityRootGroups selectToMeActivitiesForNetDomain(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityNetdomainGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityRootGroups.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.ActivityPackage.ActivityRootGroups_activitiesForNetDomain, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6c451877-1d99-11e9-b601-db75aa6f89a4,0BB4vW/At0bxTw+k4jZRrrdmpVc=] */
