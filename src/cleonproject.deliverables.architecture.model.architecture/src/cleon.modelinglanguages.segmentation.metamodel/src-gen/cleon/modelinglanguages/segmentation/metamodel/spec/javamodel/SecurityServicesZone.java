package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SecurityServicesZone extends DynamicResource implements ISecurityServicesZone {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecurityServicesZone> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecurityServicesZone>() {
    
    @Override
    public ISecurityServicesZone create() {
      return new SecurityServicesZone();
    }
    
    @Override
    public ISecurityServicesZone create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SecurityServicesZone(resourceRepository, resource);
    }
  
  };

  public SecurityServicesZone() {
    super(ISecurityServicesZone.TYPE_ID);
  }
  
  public SecurityServicesZone(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISecurityServicesZone.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, chapterPath);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecurityZone> selectAllowedAccessTo() {
    return _getList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecurityZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecurityZone_allowedAccessTo);
  }

  public SecurityServicesZone setAllowedAccessTo(java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecurityZone> allowedAccessTo) {
    _setList(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecurityZone_allowedAccessTo, allowedAccessTo);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public SecurityServicesZone setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SecurityServicesZone setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs);
  }

  public SecurityServicesZone setNoParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SecurityServicesZone setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> selectSecuritySubZones() {
    return _getList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecurityZone_securitySubZones);
  }

  public SecurityServicesZone setSecuritySubZones(java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> securitySubZones) {
    _setList(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecurityZone_securitySubZones, securitySubZones);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SecurityServicesZone setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> selectZones() {
    return _getList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.Zone_zones);
  }

  public SecurityServicesZone setZones(java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> zones) {
    _setList(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.Zone_zones, zones);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecurityZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecurityZone_allowedAccessTo, visitor);
    _acceptList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecurityZone_securitySubZones, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0e3a9edc-0b76-11e9-a136-69d076e48ed1,MJXFrUAvXjgnZum6uBrmPBs8OfM=] */
