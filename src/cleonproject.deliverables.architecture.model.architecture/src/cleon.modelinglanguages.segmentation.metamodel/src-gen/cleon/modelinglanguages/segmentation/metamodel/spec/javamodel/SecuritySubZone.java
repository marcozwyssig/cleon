package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SecuritySubZone extends DynamicResource implements ISecuritySubZone {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecuritySubZone> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecuritySubZone>() {
    
    @Override
    public ISecuritySubZone create() {
      return new SecuritySubZone();
    }
    
    @Override
    public ISecuritySubZone create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SecuritySubZone(resourceRepository, resource);
    }
  
  };

  public SecuritySubZone() {
    super(ISecuritySubZone.TYPE_ID);
  }
  
  public SecuritySubZone(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISecuritySubZone.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectVLAN_No() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecuritySubZone_VLAN_aE_No);
  }
    
  public void setVLAN_No(java.lang.Integer vLAN_No) {
     _setSingleAttribute(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecuritySubZone_VLAN_aE_No, vLAN_No);
  }

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

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Integer selectRange() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecuritySubZone_range);
  }
    
  public void setRange(java.lang.Integer range) {
     _setSingleAttribute(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecuritySubZone_range, range);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> selectAllowed() {
    return _getList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecuritySubZone_allowed);
  }

  public SecuritySubZone setAllowed(java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> allowed) {
    _setList(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecuritySubZone_allowed, allowed);
    return this;
  }
    
  @Override
  public cleon.common.resources.metamodel.spec.confidentiality.javamodel.IClassification selectClassification() {
    return _getSingle(cleon.common.resources.metamodel.spec.confidentiality.javamodel.IClassification.class, cleon.common.resources.metamodel.spec.confidentiality.ConfidentialityPackage.ClassificationAware_classification);
  }

  public SecuritySubZone setClassification(cleon.common.resources.metamodel.spec.confidentiality.javamodel.IClassification classification) {
    _setSingle(cleon.common.resources.metamodel.spec.confidentiality.ConfidentialityPackage.ClassificationAware_classification, classification);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone selectNoZones() {
    return _getSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecuritySubZone_noZones);
  }

  public SecuritySubZone setNoZones(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone noZones) {
    _setSingle(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecuritySubZone_noZones, noZones);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SecuritySubZone setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> selectZones() {
    return _getList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.Zone_zones);
  }

  public SecuritySubZone setZones(java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> zones) {
    _setList(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.Zone_zones, zones);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecuritySubZone_VLAN_aE_No, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecuritySubZone_range, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecuritySubZone_allowed, visitor);
    _acceptSingle(cleon.common.resources.metamodel.spec.confidentiality.javamodel.IClassification.class, cleon.common.resources.metamodel.spec.confidentiality.ConfidentialityPackage.ClassificationAware_classification, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone selectToMeNoZones(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecuritySubZone_noZones, object.getResource());
  }
  
  public static java.util.List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> selectToMeAllowed(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.SecuritySubZone_allowed, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7f40c131-0b75-11e9-a136-69d076e48ed1,ZjoEDvsHkpvCh5S7eQL5FujUDXI=] */
