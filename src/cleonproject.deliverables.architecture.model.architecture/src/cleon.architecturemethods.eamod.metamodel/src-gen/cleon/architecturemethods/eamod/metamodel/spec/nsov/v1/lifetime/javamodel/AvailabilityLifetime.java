package cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AvailabilityLifetime extends DynamicResource implements IAvailabilityLifetime {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAvailabilityLifetime> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAvailabilityLifetime>() {
    
    @Override
    public IAvailabilityLifetime create() {
      return new AvailabilityLifetime();
    }
    
    @Override
    public IAvailabilityLifetime create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AvailabilityLifetime(resourceRepository, resource);
    }
  
  };

  public AvailabilityLifetime() {
    super(IAvailabilityLifetime.TYPE_ID);
  }
  
  public AvailabilityLifetime(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAvailabilityLifetime.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.resources.metamodel.spec.availability.javamodel.IAvailabilityClassification selectAvailabilityClassification() {
    return _getSingle(cleon.common.resources.metamodel.spec.availability.javamodel.IAvailabilityClassification.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.LifetimePackage.AvailabilityLifetime_availabilityClassification);
  }

  public AvailabilityLifetime setAvailabilityClassification(cleon.common.resources.metamodel.spec.availability.javamodel.IAvailabilityClassification availabilityClassification) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.LifetimePackage.AvailabilityLifetime_availabilityClassification, availabilityClassification);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IConfidentialityClassification> selectConfidentialityLifetime() {
    return _getMap(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IConfidentialityClassification.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.LifetimePackage.AvailabilityLifetime_confidentialityLifetime);
  }

  public AvailabilityLifetime setConfidentialityLifetime(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IConfidentialityClassification> confidentialityLifetime) {
    _setMap(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.LifetimePackage.AvailabilityLifetime_confidentialityLifetime, confidentialityLifetime);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public AvailabilityLifetime setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AvailabilityLifetime setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.resources.metamodel.spec.availability.javamodel.IAvailabilityClassification.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.LifetimePackage.AvailabilityLifetime_availabilityClassification, visitor);
    _acceptMap(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IConfidentialityClassification.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.LifetimePackage.AvailabilityLifetime_confidentialityLifetime, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IAvailabilityLifetime> selectToMeAvailabilityClassification(cleon.common.resources.metamodel.spec.availability.javamodel.IAvailabilityClassification object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IAvailabilityLifetime.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.LifetimePackage.AvailabilityLifetime_availabilityClassification, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IAvailabilityLifetime selectToMeConfidentialityLifetime(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IConfidentialityClassification object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IAvailabilityLifetime.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.LifetimePackage.AvailabilityLifetime_confidentialityLifetime, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9fffa277-c6cb-11e6-8242-2f0ed6756d77,PDxOZO96QUBpvrVWCga6z8myc+s=] */
