package cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Segment extends DynamicResource implements ISegment {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISegment> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISegment>() {
    
    @Override
    public ISegment create() {
      return new Segment();
    }
    
    @Override
    public ISegment create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Segment(resourceRepository, resource);
    }
  
  };

  public Segment() {
    super(ISegment.TYPE_ID);
  }
  
  public Segment(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISegment.TYPE_ID);
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
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISecurityZone> selectSecurityZones() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISecurityZone.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.Segment_securityZones);
  }

  public Segment setSecurityZones(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISecurityZone> securityZones) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.Segment_securityZones, securityZones);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Segment setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.IZone> selectZones() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.IZone.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.Zone_zones);
  }

  public Segment setZones(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.IZone> zones) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.Zone_zones, zones);
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
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISecurityZone.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.Segment_securityZones, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.IZone.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.Zone_zones, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISegment selectToMeSecurityZones(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISecurityZone object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISegment.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.Segment_securityZones, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e820f880-0b73-11e9-a136-69d076e48ed1,P/Mi7NCXhICdIx3JsAP4TENKPV4=] */
