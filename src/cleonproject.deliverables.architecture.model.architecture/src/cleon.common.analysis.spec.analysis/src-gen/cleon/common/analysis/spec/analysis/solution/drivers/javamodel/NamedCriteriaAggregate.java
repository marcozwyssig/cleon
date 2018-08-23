package cleon.common.analysis.spec.analysis.solution.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedCriteriaAggregate extends DynamicResource implements INamedCriteriaAggregate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedCriteriaAggregate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedCriteriaAggregate>() {
    
    @Override
    public INamedCriteriaAggregate create() {
      return new NamedCriteriaAggregate();
    }
    
    @Override
    public INamedCriteriaAggregate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedCriteriaAggregate(resourceRepository, resource);
    }
  
  };

  public NamedCriteriaAggregate() {
    super(INamedCriteriaAggregate.TYPE_ID);
  }
  
  public NamedCriteriaAggregate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedCriteriaAggregate.TYPE_ID);
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
  public java.util.List<? extends cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IAbstractCriteria> selectCriterias() {
    return _getList(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IAbstractCriteria.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.CriteriaAggregateAware_criterias);
  }

  public NamedCriteriaAggregate setCriterias(java.util.List<? extends cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IAbstractCriteria> criterias) {
    _setList(cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.CriteriaAggregateAware_criterias, criterias);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedCriteriaAggregate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IAbstractCriteria.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.CriteriaAggregateAware_criterias, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2a93560c-a6f4-11e8-9c81-8bd68c62e435,zl0kcdMMQkMgFegBfNcp65qalKk=] */
