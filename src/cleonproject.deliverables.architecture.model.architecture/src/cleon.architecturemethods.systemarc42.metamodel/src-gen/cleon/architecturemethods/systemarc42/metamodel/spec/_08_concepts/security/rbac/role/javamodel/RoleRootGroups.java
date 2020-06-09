package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RoleRootGroups extends DynamicResource implements IRoleRootGroups {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleRootGroups> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleRootGroups>() {
    
    @Override
    public IRoleRootGroups create() {
      return new RoleRootGroups();
    }
    
    @Override
    public IRoleRootGroups create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RoleRootGroups(resourceRepository, resource);
    }
  
  };

  public RoleRootGroups() {
    super(IRoleRootGroups.TYPE_ID);
  }
  
  public RoleRootGroups(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRoleRootGroups.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public RoleRootGroups setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public RoleRootGroups setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractGroup> selectGroups() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.AbstractGroups_groups);
  }

  public RoleRootGroups setGroups(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractGroup> groups) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.AbstractGroups_groups, groups);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public RoleRootGroups setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleNetDomainGroup> selectRoleForSite() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleNetDomainGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.RolePackage.RoleRootGroups_roleForSite);
  }

  public RoleRootGroups setRoleForSite(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleNetDomainGroup> roleForSite) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.RolePackage.RoleRootGroups_roleForSite, roleForSite);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractSiteGroup> selectSiteGroups() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractSiteGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.AbstractRootGroups_siteGroups);
  }

  public RoleRootGroups setSiteGroups(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractSiteGroup> siteGroups) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.AbstractRootGroups_siteGroups, siteGroups);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RoleRootGroups setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleNetDomainGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.RolePackage.RoleRootGroups_roleForSite, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleRootGroups selectToMeRoleForSite(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleNetDomainGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleRootGroups.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.RolePackage.RoleRootGroups_roleForSite, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3e5a557a-1d99-11e9-b601-db75aa6f89a4,hpiNuKn8O7Idn+2B+A5KTpydPik=] */
