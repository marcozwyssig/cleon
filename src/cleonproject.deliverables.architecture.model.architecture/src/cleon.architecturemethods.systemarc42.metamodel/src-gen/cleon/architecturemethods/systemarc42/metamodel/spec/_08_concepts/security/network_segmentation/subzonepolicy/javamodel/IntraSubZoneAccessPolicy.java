package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class IntraSubZoneAccessPolicy extends DynamicResource implements IIntraSubZoneAccessPolicy {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIntraSubZoneAccessPolicy> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIntraSubZoneAccessPolicy>() {
    
    @Override
    public IIntraSubZoneAccessPolicy create() {
      return new IntraSubZoneAccessPolicy();
    }
    
    @Override
    public IIntraSubZoneAccessPolicy create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new IntraSubZoneAccessPolicy(resourceRepository, resource);
    }
  
  };

  public IntraSubZoneAccessPolicy() {
    super(IIntraSubZoneAccessPolicy.TYPE_ID);
  }
  
  public IntraSubZoneAccessPolicy(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIntraSubZoneAccessPolicy.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone selectPolicyForDestinationSecuritySubZone() {
    return _getSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.SubzonepolicyPackage.SubZoneAccessPolicy_policyForDestinationSecuritySubZone);
  }

  public IntraSubZoneAccessPolicy setPolicyForDestinationSecuritySubZone(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone policyForDestinationSecuritySubZone) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.SubzonepolicyPackage.SubZoneAccessPolicy_policyForDestinationSecuritySubZone, policyForDestinationSecuritySubZone);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IRestriction selectRestriction() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IRestriction.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.SubzonepolicyPackage.IntraSubZoneAccessPolicy_restriction);
  }

  public IntraSubZoneAccessPolicy setRestriction(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IRestriction restriction) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.SubzonepolicyPackage.IntraSubZoneAccessPolicy_restriction, restriction);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public IntraSubZoneAccessPolicy setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public IntraSubZoneAccessPolicy setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.SubzonepolicyPackage.SubZoneAccessPolicy_policyForDestinationSecuritySubZone, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IRestriction.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.SubzonepolicyPackage.IntraSubZoneAccessPolicy_restriction, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy> selectToMeRestriction(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IRestriction object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.SubzonepolicyPackage.IntraSubZoneAccessPolicy_restriction, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bdd74804-b844-11e9-8760-2d4a9d15ec14,Av8R1EQE23RKHEpNNIT/IAt5u/I=] */
