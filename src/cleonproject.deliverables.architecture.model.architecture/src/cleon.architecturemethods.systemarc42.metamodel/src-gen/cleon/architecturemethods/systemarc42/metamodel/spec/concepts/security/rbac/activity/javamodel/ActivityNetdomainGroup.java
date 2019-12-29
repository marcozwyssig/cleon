package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ActivityNetdomainGroup extends DynamicResource implements IActivityNetdomainGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivityNetdomainGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivityNetdomainGroup>() {
    
    @Override
    public IActivityNetdomainGroup create() {
      return new ActivityNetdomainGroup();
    }
    
    @Override
    public IActivityNetdomainGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ActivityNetdomainGroup(resourceRepository, resource);
    }
  
  };

  public ActivityNetdomainGroup() {
    super(IActivityNetdomainGroup.TYPE_ID);
  }
  
  public ActivityNetdomainGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IActivityNetdomainGroup.TYPE_ID);
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
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivitySystemConfiguration> selectActivitiesForSystemConfiguration() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivitySystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.ActivityPackage.ActivityNetdomainGroup_activitiesForSystemConfiguration);
  }

  public ActivityNetdomainGroup setActivitiesForSystemConfiguration(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivitySystemConfiguration> activitiesForSystemConfiguration) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.ActivityPackage.ActivityNetdomainGroup_activitiesForSystemConfiguration, activitiesForSystemConfiguration);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public ActivityNetdomainGroup setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ActivityNetdomainGroup setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractGroup> selectGroups() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractGroups_groups);
  }

  public ActivityNetdomainGroup setGroups(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractGroup> groups) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractGroups_groups, groups);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode selectNetdomain() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractNetdomainGroup_netdomain);
  }

  public ActivityNetdomainGroup setNetdomain(cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode netdomain) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractNetdomainGroup_netdomain, netdomain);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ActivityNetdomainGroup setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractSecurityGroups> selectSecurityGroups() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractSecurityGroups.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractNetdomainGroup_securityGroups);
  }

  public ActivityNetdomainGroup setSecurityGroups(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractSecurityGroups> securityGroups) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractNetdomainGroup_securityGroups, securityGroups);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ActivityNetdomainGroup setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ActivityNetdomainGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivitySystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.ActivityPackage.ActivityNetdomainGroup_activitiesForSystemConfiguration, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractNetdomainGroup_netdomain, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivityNetdomainGroup selectToMeActivitiesForSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivitySystemConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivityNetdomainGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.ActivityPackage.ActivityNetdomainGroup_activitiesForSystemConfiguration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e3611bf2-1e06-11e9-834d-77c41fccc6bf,p9ZlzhohKSv3yQ31Fy19nniE53I=] */
