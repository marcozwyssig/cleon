package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SourceSubZone extends DynamicResource implements ISourceSubZone {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceSubZone> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceSubZone>() {
    
    @Override
    public ISourceSubZone create() {
      return new SourceSubZone();
    }
    
    @Override
    public ISourceSubZone create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SourceSubZone(resourceRepository, resource);
    }
  
  };

  public SourceSubZone() {
    super(ISourceSubZone.TYPE_ID);
  }
  
  public SourceSubZone(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISourceSubZone.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> selectDestinationSubZonePolicy() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.SubzonepolicyPackage.SourceSubZone_destinationSubZonePolicy);
  }

  public SourceSubZone setDestinationSubZonePolicy(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> destinationSubZonePolicy) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.SubzonepolicyPackage.SourceSubZone_destinationSubZonePolicy, destinationSubZonePolicy);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone selectSourceSecuritySubZone() {
    return _getSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.SubzonepolicyPackage.SourceSubZone_sourceSecuritySubZone);
  }

  public SourceSubZone setSourceSecuritySubZone(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone sourceSecuritySubZone) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.SubzonepolicyPackage.SourceSubZone_sourceSecuritySubZone, sourceSecuritySubZone);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SourceSubZone setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SourceSubZone setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.SubzonepolicyPackage.SourceSubZone_destinationSubZonePolicy, visitor);
    _acceptSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.SubzonepolicyPackage.SourceSubZone_sourceSecuritySubZone, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.ISourceSubZone> selectToMeSourceSecuritySubZone(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.ISourceSubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.SubzonepolicyPackage.SourceSubZone_sourceSecuritySubZone, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.ISourceSubZone selectToMeDestinationSubZonePolicy(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.ISourceSubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.SubzonepolicyPackage.SourceSubZone_destinationSubZonePolicy, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,19162783-b844-11e9-8760-2d4a9d15ec14,C5Lf6zO3mhDkq4lFEOxi0RCHznc=] */
