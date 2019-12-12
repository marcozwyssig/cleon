package cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Blackbox_Requirements extends DynamicResource implements IBlackbox_Requirements {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBlackbox_Requirements> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBlackbox_Requirements>() {
    
    @Override
    public IBlackbox_Requirements create() {
      return new Blackbox_Requirements();
    }
    
    @Override
    public IBlackbox_Requirements create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Blackbox_Requirements(resourceRepository, resource);
    }
  
  };

  public Blackbox_Requirements() {
    super(IBlackbox_Requirements.TYPE_ID);
  }
  
  public Blackbox_Requirements(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBlackbox_Requirements.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters);
  }

  public Blackbox_Requirements setChapters(java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.doc.spec.javamodel.IDocumentElement.class, cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Blackbox_Requirements setDocumentElements(java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Blackbox_Requirements setParagraphs(java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.javamodel.IRequirementCoverageDescription> selectRequirementCoverageDescription() {
    return _getMap(cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.javamodel.IRequirementCoverageDescription.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Blackbox_aE_Requirements_requirementCoverageDescription);
  }

  public Blackbox_Requirements setRequirementCoverageDescription(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.javamodel.IRequirementCoverageDescription> requirementCoverageDescription) {
    _setMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Blackbox_aE_Requirements_requirementCoverageDescription, requirementCoverageDescription);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Blackbox_Requirements setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.javamodel.IRequirementCoverageDescription.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Blackbox_aE_Requirements_requirementCoverageDescription, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBlackbox_Requirements selectToMeRequirementCoverageDescription(cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.javamodel.IRequirementCoverageDescription object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBlackbox_Requirements.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Blackbox_aE_Requirements_requirementCoverageDescription, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4a655e3e-0df0-11e9-a28e-8b950dcca323,yabMWx/Ren5a9/Zg5RvYlY/Je58=] */
