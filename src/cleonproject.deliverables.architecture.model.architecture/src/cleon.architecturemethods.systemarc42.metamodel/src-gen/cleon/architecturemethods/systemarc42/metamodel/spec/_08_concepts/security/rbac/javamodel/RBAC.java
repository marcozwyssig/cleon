package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel;

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
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.RBAC_chapters);
  }

  public RBAC setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter> chapters) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.RBAC_chapters, chapters);
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
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IEnvironmentRBAC> selectEnvironmentRBAC() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IEnvironmentRBAC.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.RBAC_environmentRBAC);
  }

  public RBAC setEnvironmentRBAC(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IEnvironmentRBAC> environmentRBAC) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.RBAC_environmentRBAC, environmentRBAC);
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
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IResponsibilities selectResponsibilities() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IResponsibilities.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.RBAC_responsibilities);
  }

  public RBAC setResponsibilities(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IResponsibilities responsibilities) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.RBAC_responsibilities, responsibilities);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Template> selectTemplates() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Template.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.RBAC_templates);
  }

  public RBAC setTemplates(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Template> templates) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.RBAC_templates, templates);
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
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.RBAC_chapters, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IEnvironmentRBAC.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.RBAC_environmentRBAC, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IResponsibilities.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.RBAC_responsibilities, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Template.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.RBAC_templates, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IRBAC selectToMeChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IRBAC.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.RBAC_chapters, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IRBAC selectToMeTemplates(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.template.javamodel.IRBAC_Role_Template object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IRBAC.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.RBAC_templates, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IRBAC selectToMeEnvironmentRBAC(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IEnvironmentRBAC object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IRBAC.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.RBAC_environmentRBAC, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IRBAC> selectToMeResponsibilities(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IResponsibilities object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IRBAC.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.RBAC_responsibilities, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9db33409-6e8e-11ea-b8e8-f1a46e0c42f7,+hp99xNrhXzMeyC/xzwMuXTpgmw=] */
