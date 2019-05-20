package cleon.modelinglanguages.network.spec.network.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SegmentationNetwork extends DynamicResource implements ISegmentationNetwork {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISegmentationNetwork> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISegmentationNetwork>() {
    
    @Override
    public ISegmentationNetwork create() {
      return new SegmentationNetwork();
    }
    
    @Override
    public ISegmentationNetwork create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SegmentationNetwork(resourceRepository, resource);
    }
  
  };

  public SegmentationNetwork() {
    super(ISegmentationNetwork.TYPE_ID);
  }
  
  public SegmentationNetwork(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISegmentationNetwork.TYPE_ID);
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

  public SegmentationNetwork setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public SegmentationNetwork setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IGroup> selectGroups() {
    return _getList(cleon.modelinglanguages.network.spec.network.javamodel.IGroup.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups);
  }

  public SegmentationNetwork setGroups(java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IGroup> groups) {
    _setList(cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups, groups);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetwork> selectNetworks() {
    return _getList(cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetwork.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractNetworkAware_networks);
  }

  public SegmentationNetwork setNetworks(java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetwork> networks) {
    _setList(cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractNetworkAware_networks, networks);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SegmentationNetwork setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPRange selectRange() {
    return _getSingle(cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPRange.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractNetworks_range);
  }

  public SegmentationNetwork setRange(cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPRange range) {
    _setSingle(cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractNetworks_range, range);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SegmentationNetwork setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone> selectZones() {
    return _getList(cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone.class, cleon.modelinglanguages.network.spec.network.segmentation.SegmentationPackage.SegmentationNetwork_zones);
  }

  public SegmentationNetwork setZones(java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone> zones) {
    _setList(cleon.modelinglanguages.network.spec.network.segmentation.SegmentationPackage.SegmentationNetwork_zones, zones);
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
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.modelinglanguages.network.spec.network.javamodel.IGroup.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups, visitor);
    _acceptList(cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetwork.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractNetworkAware_networks, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPRange.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractNetworks_range, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone.class, cleon.modelinglanguages.network.spec.network.segmentation.SegmentationPackage.SegmentationNetwork_zones, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.network.spec.network.segmentation.javamodel.ISegmentationNetwork> selectToMeZones(cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.network.spec.network.segmentation.javamodel.ISegmentationNetwork.class, cleon.modelinglanguages.network.spec.network.segmentation.SegmentationPackage.SegmentationNetwork_zones, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,adb6ceb3-7ac7-11e9-a70f-4dc03941a024,O3KXm/yOUfdDqb9UawCNmWU5c1Y=] */
