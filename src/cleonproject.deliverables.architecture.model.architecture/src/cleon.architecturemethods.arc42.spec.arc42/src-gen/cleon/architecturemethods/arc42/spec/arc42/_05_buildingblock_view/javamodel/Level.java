package cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Level extends DynamicResource implements ILevel {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILevel> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILevel>() {
    
    @Override
    public ILevel create() {
      return new Level();
    }
    
    @Override
    public ILevel create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Level(resourceRepository, resource);
    }
  
  };

  public Level() {
    super(ILevel.TYPE_ID);
  }
  
  public Level(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILevel.TYPE_ID);
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
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBlackbox> selectBlackboxes() {
    return _getMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBlackbox.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Level_blackboxes);
  }

  public Level setBlackboxes(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBlackbox> blackboxes) {
    _setMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Level_blackboxes, blackboxes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.doc.spec.chapter.javamodel.IChapter.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Level_chapters);
  }

  public Level setChapters(java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Level_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.doc.spec.javamodel.IDocumentElement.class, cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Level setDocumentElements(java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Level setParagraphs(java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Level setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Level setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectWhitebox() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Level_whitebox);
  }

  public Level setWhitebox(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock whitebox) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Level_whitebox, whitebox);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBlackbox.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Level_blackboxes, visitor);
    _acceptList(cleon.common.doc.doc.spec.chapter.javamodel.IChapter.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Level_chapters, visitor);
    _acceptList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Level_whitebox, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel selectToMeWhitebox(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Level_whitebox, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel selectToMeChapters(cleon.common.doc.doc.spec.chapter.javamodel.IChapter object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Level_chapters, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel selectToMeBlackboxes(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBlackbox object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Level_blackboxes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1551fb66-2857-11e8-9af4-b7d7a3bbddc1,m4kNcMfa+mrPAQvyGmVpbiyZxC0=] */
