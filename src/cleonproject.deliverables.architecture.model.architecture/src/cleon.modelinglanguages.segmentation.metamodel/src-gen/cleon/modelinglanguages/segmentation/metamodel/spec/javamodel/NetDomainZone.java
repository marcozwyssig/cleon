package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NetDomainZone extends DynamicResource implements INetDomainZone {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetDomainZone> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetDomainZone>() {
    
    @Override
    public INetDomainZone create() {
      return new NetDomainZone();
    }
    
    @Override
    public INetDomainZone create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NetDomainZone(resourceRepository, resource);
    }
  
  };

  public NetDomainZone() {
    super(INetDomainZone.TYPE_ID);
  }
  
  public NetDomainZone(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INetDomainZone.TYPE_ID);
  }

  // attributes
  
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
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone> selectAllowed() {
    return _getList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.NetDomainZone_allowed);
  }

  public NetDomainZone setAllowed(java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone> allowed) {
    _setList(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.NetDomainZone_allowed, allowed);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> selectAllowedAccessTo() {
    return _getList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.Zone_allowedAccessTo);
  }

  public NetDomainZone setAllowedAccessTo(java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> allowedAccessTo) {
    _setList(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.Zone_allowedAccessTo, allowedAccessTo);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public NetDomainZone setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public NetDomainZone setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs);
  }

  public NetDomainZone setNoParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public NetDomainZone setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISegmentZone> selectSegments() {
    return _getList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISegmentZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.NetDomainZone_segments);
  }

  public NetDomainZone setSegments(java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISegmentZone> segments) {
    _setList(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.NetDomainZone_segments, segments);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NetDomainZone setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> selectZones() {
    return _getList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.Zone_zones);
  }

  public NetDomainZone setZones(java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> zones) {
    _setList(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.Zone_zones, zones);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.NetDomainZone_allowed, visitor);
    _acceptList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISegmentZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.NetDomainZone_segments, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone selectToMeSegments(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISegmentZone object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.NetDomainZone_segments, object.getResource());
  }
  
  public static java.util.List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone> selectToMeAllowed(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.NetDomainZone_allowed, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,da24cca3-0b73-11e9-a136-69d076e48ed1,Ut8QNM/+h+6HhmB9fZMUng/wuCU=] */
