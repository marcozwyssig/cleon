package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AutorizationSystemArc42 extends DynamicResource implements IAutorizationSystemArc42 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAutorizationSystemArc42> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAutorizationSystemArc42>() {
    
    @Override
    public IAutorizationSystemArc42 create() {
      return new AutorizationSystemArc42();
    }
    
    @Override
    public IAutorizationSystemArc42 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AutorizationSystemArc42(resourceRepository, resource);
    }
  
  };

  public AutorizationSystemArc42() {
    super(IAutorizationSystemArc42.TYPE_ID);
  }
  
  public AutorizationSystemArc42(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAutorizationSystemArc42.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForSystemConfiguration selectActivityBlock() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.AutorizationSystemArc42_activityBlock);
  }

  public AutorizationSystemArc42 setActivityBlock(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForSystemConfiguration activityBlock) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.AutorizationSystemArc42_activityBlock, activityBlock);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public AutorizationSystemArc42 setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public AutorizationSystemArc42 setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public AutorizationSystemArc42 setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public AutorizationSystemArc42 setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AutorizationSystemArc42 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.AutorizationSystemArc42_activityBlock, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorizationSystemArc42> selectToMeActivityBlock(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForSystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorizationSystemArc42.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.AutorizationSystemArc42_activityBlock, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c727191a-23f5-11eb-83b1-3d2a97975978,A77fwUGjyD2WP4RhoxeiRAluaow=] */