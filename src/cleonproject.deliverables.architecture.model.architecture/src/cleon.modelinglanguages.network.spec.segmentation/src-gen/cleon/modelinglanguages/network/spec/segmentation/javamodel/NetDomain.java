package cleon.modelinglanguages.network.spec.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NetDomain extends DynamicResource implements INetDomain {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetDomain> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetDomain>() {
    
    @Override
    public INetDomain create() {
      return new NetDomain();
    }
    
    @Override
    public INetDomain create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NetDomain(resourceRepository, resource);
    }
  
  };

  public NetDomain() {
    super(INetDomain.TYPE_ID);
  }
  
  public NetDomain(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INetDomain.TYPE_ID);
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

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.ISegment> selectSegments() {
    return _getList(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISegment.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.NetDomain_segments);
  }

  public NetDomain setSegments(java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.ISegment> segments) {
    _setList(cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.NetDomain_segments, segments);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NetDomain setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone> selectZones() {
    return _getList(cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.Zone_zones);
  }

  public NetDomain setZones(java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone> zones) {
    _setList(cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.Zone_zones, zones);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISegment.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.NetDomain_segments, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.Zone_zones, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.network.spec.segmentation.javamodel.INetDomain selectToMeSegments(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISegment object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.spec.segmentation.javamodel.INetDomain.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.NetDomain_segments, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,da24cca3-0b73-11e9-a136-69d076e48ed1,9Hd9BJaLRuNbQaUT2viwRg5bPKc=] */
