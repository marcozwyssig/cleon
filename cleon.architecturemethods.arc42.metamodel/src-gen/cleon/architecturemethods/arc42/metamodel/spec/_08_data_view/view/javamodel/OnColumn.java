package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OnColumn extends DynamicResource implements IOnColumn {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOnColumn> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOnColumn>() {
    
    @Override
    public IOnColumn create() {
      return new OnColumn();
    }
    
    @Override
    public IOnColumn create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OnColumn(resourceRepository, resource);
    }
  
  };

  public OnColumn() {
    super(IOnColumn.TYPE_ID);
  }
  
  public OnColumn(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOnColumn.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn selectColumn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.AbstractColumn_column);
  }

  public OnColumn setColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn column) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.AbstractColumn_column, column);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn selectOnColumn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.OnColumn_onColumn);
  }

  public OnColumn setOnColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn onColumn) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.OnColumn_onColumn, onColumn);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public OnColumn setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OnColumn setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.AbstractColumn_column, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.OnColumn_onColumn, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IOnColumn> selectToMeOnColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IOnColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.OnColumn_onColumn, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,01933a9d-e116-11ee-995f-5faf5f77d478,UZu1E87b/2Fxrnj5SlMBqhriz4w=] */
