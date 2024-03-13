package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SelectColumn extends DynamicResource implements ISelectColumn {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISelectColumn> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISelectColumn>() {
    
    @Override
    public ISelectColumn create() {
      return new SelectColumn();
    }
    
    @Override
    public ISelectColumn create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SelectColumn(resourceRepository, resource);
    }
  
  };

  public SelectColumn() {
    super(ISelectColumn.TYPE_ID);
  }
  
  public SelectColumn(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISelectColumn.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectAlias() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AliasAware_alias);
  }
    
  public void setAlias(java.lang.String alias) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AliasAware_alias, alias);
  }

  @Override
  public java.lang.Boolean selectDistinct() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.SelectColumn_distinct);
  }
    
  public void setDistinct(java.lang.Boolean distinct) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.SelectColumn_distinct, distinct);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelectAggregate selectAggregate() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelectAggregate.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.SelectColumn_aggregate);
  }

  public SelectColumn setAggregate(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelectAggregate aggregate) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.SelectColumn_aggregate, aggregate);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn selectColumn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AbstractColumn_column);
  }

  public SelectColumn setColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn column) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AbstractColumn_column, column);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SelectColumn setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SelectColumn setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AliasAware_alias, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.SelectColumn_distinct, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelectAggregate.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.SelectColumn_aggregate, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AbstractColumn_column, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelectColumn> selectToMeAggregate(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelectAggregate object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelectColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.SelectColumn_aggregate, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,50a4626f-d0cc-11ee-a38e-0b82bafb3097,zX6qXd/UwAjigAfrYVSBB+ivU9Y=] */
