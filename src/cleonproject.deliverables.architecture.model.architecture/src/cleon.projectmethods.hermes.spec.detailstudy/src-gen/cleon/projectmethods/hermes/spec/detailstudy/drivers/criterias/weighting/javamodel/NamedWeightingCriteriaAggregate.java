package cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedWeightingCriteriaAggregate extends DynamicResource implements INamedWeightingCriteriaAggregate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedWeightingCriteriaAggregate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedWeightingCriteriaAggregate>() {
    
    @Override
    public INamedWeightingCriteriaAggregate create() {
      return new NamedWeightingCriteriaAggregate();
    }
    
    @Override
    public INamedWeightingCriteriaAggregate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedWeightingCriteriaAggregate(resourceRepository, resource);
    }
  
  };

  public NamedWeightingCriteriaAggregate() {
    super(INamedWeightingCriteriaAggregate.TYPE_ID);
  }
  
  public NamedWeightingCriteriaAggregate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedWeightingCriteriaAggregate.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.IAbstractCriteria> selectCriterias() {
    return _getList(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.IAbstractCriteria.class, cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.CriteriasPackage.AbstractCriteriaAggregateAware_criterias);
  }

  public NamedWeightingCriteriaAggregate setCriterias(java.util.List<? extends cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.IAbstractCriteria> criterias) {
    _setList(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.CriteriasPackage.AbstractCriteriaAggregateAware_criterias, criterias);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedWeightingCriteriaAggregate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria> selectWeightingCriterias() {
    return _getList(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria.class, cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.WeightingPackage.WeightingCriteriaAggregateAware_weightingCriterias);
  }

  public NamedWeightingCriteriaAggregate setWeightingCriterias(java.util.List<? extends cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria> weightingCriterias) {
    _setList(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.WeightingPackage.WeightingCriteriaAggregateAware_weightingCriterias, weightingCriterias);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria.class, cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.WeightingPackage.WeightingCriteriaAggregateAware_weightingCriterias, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2a93560c-a6f4-11e8-9c81-8bd68c62e435,fw0tEh0FIoNe7XWNWSgfkxBq9EY=] */
