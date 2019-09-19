package cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.knockout.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedKnockoutCriteriaAggregate extends DynamicResource implements INamedKnockoutCriteriaAggregate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedKnockoutCriteriaAggregate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedKnockoutCriteriaAggregate>() {
    
    @Override
    public INamedKnockoutCriteriaAggregate create() {
      return new NamedKnockoutCriteriaAggregate();
    }
    
    @Override
    public INamedKnockoutCriteriaAggregate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedKnockoutCriteriaAggregate(resourceRepository, resource);
    }
  
  };

  public NamedKnockoutCriteriaAggregate() {
    super(INamedKnockoutCriteriaAggregate.TYPE_ID);
  }
  
  public NamedKnockoutCriteriaAggregate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedKnockoutCriteriaAggregate.TYPE_ID);
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

  public NamedKnockoutCriteriaAggregate setCriterias(java.util.List<? extends cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.IAbstractCriteria> criterias) {
    _setList(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.CriteriasPackage.AbstractCriteriaAggregateAware_criterias, criterias);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteria> selectKnockoutCriterias() {
    return _getList(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteria.class, cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.knockout.KnockoutPackage.KnockoutCriteriaAggregateAware_knockoutCriterias);
  }

  public NamedKnockoutCriteriaAggregate setKnockoutCriterias(java.util.List<? extends cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteria> knockoutCriterias) {
    _setList(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.knockout.KnockoutPackage.KnockoutCriteriaAggregateAware_knockoutCriterias, knockoutCriterias);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedKnockoutCriteriaAggregate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteria.class, cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.knockout.KnockoutPackage.KnockoutCriteriaAggregateAware_knockoutCriterias, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,068e7d02-2029-11e9-83b3-a16e26b4cc59,uK7OAwsRjNo5ghDQm8KWl2TVD40=] */
