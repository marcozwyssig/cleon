package cleon.architecturemethods.arc42.sample.arc42.javamodel;

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

  // attributes
  
  @Override
  public java.lang.Boolean selectAllowRecursiveDependency() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency);
  }
    
  public void setAllowRecursiveDependency(java.lang.Boolean allowRecursiveDependency) {
     _setSingleAttribute(cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency, allowRecursiveDependency);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.sample.arc42.javamodel.ISampleBuildingBlock selectTo() {
    return _getSingle(cleon.architecturemethods.arc42.sample.arc42.javamodel.ISampleBuildingBlock.class, cleon.architecturemethods.arc42.sample.arc42.Arc42Package.SampleDependency_to);
  }

  public SampleDependency setTo(cleon.architecturemethods.arc42.sample.arc42.javamodel.ISampleBuildingBlock to) {
    _setSingle(cleon.architecturemethods.arc42.sample.arc42.Arc42Package.SampleDependency_to, to);
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
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.sample.arc42.javamodel.ISampleBuildingBlock.class, cleon.architecturemethods.arc42.sample.arc42.Arc42Package.SampleDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.sample.arc42.javamodel.ISampleDependency> selectToMeTo(cleon.architecturemethods.arc42.sample.arc42.javamodel.ISampleBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.sample.arc42.javamodel.ISampleDependency.class, cleon.architecturemethods.arc42.sample.arc42.Arc42Package.SampleDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3b9d179f-c07b-11e6-beed-bb6789615dd5,qD4JFZfisOHVH/CtFodjSAylcfA=] */
