package cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ConfidentialityClassification extends DynamicResource implements IConfidentialityClassification {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConfidentialityClassification> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConfidentialityClassification>() {
    
    @Override
    public IConfidentialityClassification create() {
      return new ConfidentialityClassification();
    }
    
    @Override
    public IConfidentialityClassification create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ConfidentialityClassification(resourceRepository, resource);
    }
  
  };

  public ConfidentialityClassification() {
    super(IConfidentialityClassification.TYPE_ID);
  }
  
  public ConfidentialityClassification(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IConfidentialityClassification.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.resources.metamodel.spec.confidentiality.javamodel.IConfidentialityClassification selectConfidentialityClassification() {
    return _getSingle(cleon.common.resources.metamodel.spec.confidentiality.javamodel.IConfidentialityClassification.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.LifetimePackage.ConfidentialityClassification_confidentialityClassification);
  }

  public ConfidentialityClassification setConfidentialityClassification(cleon.common.resources.metamodel.spec.confidentiality.javamodel.IConfidentialityClassification confidentialityClassification) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.LifetimePackage.ConfidentialityClassification_confidentialityClassification, confidentialityClassification);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IServiceLifetime selectLifetime() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IServiceLifetime.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.LifetimePackage.LifetimeAware_lifetime);
  }

  public ConfidentialityClassification setLifetime(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IServiceLifetime lifetime) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.LifetimePackage.LifetimeAware_lifetime, lifetime);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ConfidentialityClassification setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ConfidentialityClassification setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.resources.metamodel.spec.confidentiality.javamodel.IConfidentialityClassification.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.LifetimePackage.ConfidentialityClassification_confidentialityClassification, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IServiceLifetime.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.LifetimePackage.LifetimeAware_lifetime, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IConfidentialityClassification> selectToMeConfidentialityClassification(cleon.common.resources.metamodel.spec.confidentiality.javamodel.IConfidentialityClassification object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IConfidentialityClassification.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.LifetimePackage.ConfidentialityClassification_confidentialityClassification, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ca23724e-c6cb-11e6-8242-2f0ed6756d77,inACBLM4pGY/OE2pzYzPalRZbPc=] */
