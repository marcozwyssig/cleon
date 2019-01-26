package cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OrganizationalConstraints extends DynamicResource implements IOrganizationalConstraints {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganizationalConstraints> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganizationalConstraints>() {
    
    @Override
    public IOrganizationalConstraints create() {
      return new OrganizationalConstraints();
    }
    
    @Override
    public IOrganizationalConstraints create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OrganizationalConstraints(resourceRepository, resource);
    }
  
  };

  public OrganizationalConstraints() {
    super(IOrganizationalConstraints.TYPE_ID);
  }
  
  public OrganizationalConstraints(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOrganizationalConstraints.TYPE_ID);
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

  public OrganizationalConstraints setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements);
  }

  public OrganizationalConstraints setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.IOrganizationalConstraint> selectOrganizationalConstraints() {
    return _getList(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.IOrganizationalConstraint.class, cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints._02_architecture_constraintsPackage.OrganizationalConstraints_organizationalConstraints);
  }

  public OrganizationalConstraints setOrganizationalConstraints(java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.IOrganizationalConstraint> organizationalConstraints) {
    _setList(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints._02_architecture_constraintsPackage.OrganizationalConstraints_organizationalConstraints, organizationalConstraints);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public OrganizationalConstraints setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OrganizationalConstraints setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.IOrganizationalConstraint.class, cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints._02_architecture_constraintsPackage.OrganizationalConstraints_organizationalConstraints, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.IOrganizationalConstraints selectToMeOrganizationalConstraints(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.IOrganizationalConstraint object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.IOrganizationalConstraints.class, cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints._02_architecture_constraintsPackage.OrganizationalConstraints_organizationalConstraints, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f7b7d6ee-e100-11e8-8499-a3b0fb3cad90,U1KYKHEnSvn9ByrGysMloqfqF9s=] */
