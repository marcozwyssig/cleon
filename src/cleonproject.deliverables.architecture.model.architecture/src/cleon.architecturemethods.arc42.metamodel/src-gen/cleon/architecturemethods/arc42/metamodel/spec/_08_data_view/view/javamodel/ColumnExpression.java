package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ColumnExpression extends DynamicResource implements IColumnExpression {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IColumnExpression> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IColumnExpression>() {
    
    @Override
    public IColumnExpression create() {
      return new ColumnExpression();
    }
    
    @Override
    public IColumnExpression create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ColumnExpression(resourceRepository, resource);
    }
  
  };

  public ColumnExpression() {
    super(IColumnExpression.TYPE_ID);
  }
  
  public ColumnExpression(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IColumnExpression.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn selectColumn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ColumnExpression_column);
  }

  public ColumnExpression setColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn column) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ColumnExpression_column, column);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ColumnExpression setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ColumnExpression_column, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IColumnExpression> selectToMeColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IColumnExpression.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.ColumnExpression_column, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,786ef45e-e14e-11ee-9375-43bf1495bfd9,zz6WijZhbpoHsycMmzxjIVxrOY4=] */
