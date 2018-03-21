package cleon.conception.arc.sample.arc42.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SampleDependency extends DynamicResource implements ISampleDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISampleDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISampleDependency>() {
    
    @Override
    public ISampleDependency create() {
      return new SampleDependency();
    }
    
    @Override
    public ISampleDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SampleDependency(resourceRepository, resource);
    }
  
  };

  public SampleDependency() {
    super(ISampleDependency.TYPE_ID);
  }
  
  public SampleDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISampleDependency.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.conception.arc.sample.arc42.javamodel.ISampleBuildingBlock selectTo() {
    return _getSingle(cleon.conception.arc.sample.arc42.javamodel.ISampleBuildingBlock.class, cleon.conception.arc.sample.arc42.Arc42Package.SampleDependency_to);
  }

  public SampleDependency setTo(cleon.conception.arc.sample.arc42.javamodel.ISampleBuildingBlock to) {
    _setSingle(cleon.conception.arc.sample.arc42.Arc42Package.SampleDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SampleDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.conception.arc.sample.arc42.javamodel.ISampleBuildingBlock.class, cleon.conception.arc.sample.arc42.Arc42Package.SampleDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.arc.sample.arc42.javamodel.ISampleDependency> selectToMeTo(cleon.conception.arc.sample.arc42.javamodel.ISampleBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.conception.arc.sample.arc42.javamodel.ISampleDependency.class, cleon.conception.arc.sample.arc42.Arc42Package.SampleDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3b9d179f-c07b-11e6-beed-bb6789615dd5,Krm8JAhdgJxQdcdwZDQKcGm6m1g=] */
