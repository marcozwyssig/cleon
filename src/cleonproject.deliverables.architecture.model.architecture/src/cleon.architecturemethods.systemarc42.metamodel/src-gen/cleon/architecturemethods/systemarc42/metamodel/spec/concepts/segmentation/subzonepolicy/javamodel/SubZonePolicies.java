package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SubZonePolicies extends DynamicResource implements ISubZonePolicies {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISubZonePolicies> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISubZonePolicies>() {
    
    @Override
    public ISubZonePolicies create() {
      return new SubZonePolicies();
    }
    
    @Override
    public ISubZonePolicies create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SubZonePolicies(resourceRepository, resource);
    }
  
  };

  public SubZonePolicies() {
    super(ISubZonePolicies.TYPE_ID);
  }
  
  public SubZonePolicies(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISubZonePolicies.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISourceSubZone> selectSubzonePolicies() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISourceSubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.SubzonepolicyPackage.SubZonePolicies_subzonePolicies);
  }

  public SubZonePolicies setSubzonePolicies(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISourceSubZone> subzonePolicies) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.SubzonepolicyPackage.SubZonePolicies_subzonePolicies, subzonePolicies);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SubZonePolicies setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISourceSubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.SubzonepolicyPackage.SubZonePolicies_subzonePolicies, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZonePolicies selectToMeSubzonePolicies(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISourceSubZone object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZonePolicies.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.SubzonepolicyPackage.SubZonePolicies_subzonePolicies, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0670992e-b844-11e9-8760-2d4a9d15ec14,/27yuK27+spxsi2blEOOPa9O1a4=] */
