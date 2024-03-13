package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OrderBy extends DynamicResource implements IOrderBy {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrderBy> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrderBy>() {
    
    @Override
    public IOrderBy create() {
      return new OrderBy();
    }
    
    @Override
    public IOrderBy create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OrderBy(resourceRepository, resource);
    }
  
  };

  public OrderBy() {
    super(IOrderBy.TYPE_ID);
  }
  
  public OrderBy(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOrderBy.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IOrderByColumn> selectOrderby() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IOrderByColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.OrderBy_orderby);
  }

  public OrderBy setOrderby(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IOrderByColumn> orderby) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.OrderBy_orderby, orderby);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OrderBy setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IOrderByColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.OrderBy_orderby, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IOrderBy selectToMeOrderby(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IOrderByColumn object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IOrderBy.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.OrderBy_orderby, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9fb09ec9-e141-11ee-9375-43bf1495bfd9,aB8T/FKH7w2uD1eQswYHI2kNZfM=] */
