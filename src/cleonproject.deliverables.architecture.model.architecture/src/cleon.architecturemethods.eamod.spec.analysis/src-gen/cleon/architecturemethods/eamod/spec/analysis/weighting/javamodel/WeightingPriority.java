package cleon.architecturemethods.eamod.spec.analysis.weighting.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WeightingPriority extends DynamicResource implements IWeightingPriority {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWeightingPriority> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWeightingPriority>() {
    
    @Override
    public IWeightingPriority create() {
      return new WeightingPriority();
    }
    
    @Override
    public IWeightingPriority create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WeightingPriority(resourceRepository, resource);
    }
  
  };

  public WeightingPriority() {
    super(IWeightingPriority.TYPE_ID);
  }
  
  public WeightingPriority(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWeightingPriority.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectWeighting() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.WeightingPackage.WeightingAware_weighting);
  }
    
  public void setWeighting(java.lang.Integer weighting) {
     _setSingleAttribute(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.WeightingPackage.WeightingAware_weighting, weighting);
  }

  // relations
  
  @Override
  public cleon.common.resources.spec.resources.priority.javamodel.IPriority selectPriority() {
    return _getSingle(cleon.common.resources.spec.resources.priority.javamodel.IPriority.class, cleon.architecturemethods.eamod.spec.analysis.weighting.WeightingPackage.WeightingPriority_priority);
  }

  public WeightingPriority setPriority(cleon.common.resources.spec.resources.priority.javamodel.IPriority priority) {
    _setSingle(cleon.architecturemethods.eamod.spec.analysis.weighting.WeightingPackage.WeightingPriority_priority, priority);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public WeightingPriority setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WeightingPriority setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.WeightingPackage.WeightingAware_weighting, visitor);
    // relations
    _acceptSingle(cleon.common.resources.spec.resources.priority.javamodel.IPriority.class, cleon.architecturemethods.eamod.spec.analysis.weighting.WeightingPackage.WeightingPriority_priority, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.analysis.weighting.javamodel.IWeightingPriority> selectToMePriority(cleon.common.resources.spec.resources.priority.javamodel.IPriority object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.analysis.weighting.javamodel.IWeightingPriority.class, cleon.architecturemethods.eamod.spec.analysis.weighting.WeightingPackage.WeightingPriority_priority, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,02e39a6b-a6fc-11e8-9c81-8bd68c62e435,5Ujcvb00XdRCiSHzM8GvSRfZIKk=] */
