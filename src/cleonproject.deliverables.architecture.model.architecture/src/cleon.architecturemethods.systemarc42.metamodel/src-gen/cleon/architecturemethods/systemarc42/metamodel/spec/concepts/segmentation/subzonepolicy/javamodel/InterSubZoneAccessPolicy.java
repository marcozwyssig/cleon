package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InterSubZoneAccessPolicy extends DynamicResource implements IInterSubZoneAccessPolicy {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInterSubZoneAccessPolicy> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInterSubZoneAccessPolicy>() {
    
    @Override
    public IInterSubZoneAccessPolicy create() {
      return new InterSubZoneAccessPolicy();
    }
    
    @Override
    public IInterSubZoneAccessPolicy create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InterSubZoneAccessPolicy(resourceRepository, resource);
    }
  
  };

  public InterSubZoneAccessPolicy() {
    super(IInterSubZoneAccessPolicy.TYPE_ID);
  }
  
  public InterSubZoneAccessPolicy(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInterSubZoneAccessPolicy.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAllowProxySpecificCommunications() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.SubzonepolicyPackage.InterSubZoneAccessPolicy_allowProxySpecificCommunications);
  }
    
  public void setAllowProxySpecificCommunications(java.lang.Boolean allowProxySpecificCommunications) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.SubzonepolicyPackage.InterSubZoneAccessPolicy_allowProxySpecificCommunications, allowProxySpecificCommunications);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone selectPolicyForSecuritySubZone() {
    return _getSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.SubzonepolicyPackage.SubZoneAccessPolicy_policyForSecuritySubZone);
  }

  public InterSubZoneAccessPolicy setPolicyForSecuritySubZone(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone policyForSecuritySubZone) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.SubzonepolicyPackage.SubZoneAccessPolicy_policyForSecuritySubZone, policyForSecuritySubZone);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public InterSubZoneAccessPolicy setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InterSubZoneAccessPolicy setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.SubzonepolicyPackage.InterSubZoneAccessPolicy_allowProxySpecificCommunications, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.SubzonepolicyPackage.SubZoneAccessPolicy_policyForSecuritySubZone, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d1cbec76-b844-11e9-8760-2d4a9d15ec14,qbTU3NFx/BnW9zZqCXexowHsE5E=] */
