package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OnField extends DynamicResource implements IOnField {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOnField> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOnField>() {
    
    @Override
    public IOnField create() {
      return new OnField();
    }
    
    @Override
    public IOnField create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OnField(resourceRepository, resource);
    }
  
  };

  public OnField() {
    super(IOnField.TYPE_ID);
  }
  
  public OnField(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOnField.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn selectColumn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AbstractField_column);
  }

  public OnField setColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn column) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AbstractField_column, column);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn selectOnColumn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.OnField_onColumn);
  }

  public OnField setOnColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn onColumn) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.OnField_onColumn, onColumn);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public OnField setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OnField setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AbstractField_column, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.OnField_onColumn, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IOnField> selectToMeOnColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IOnField.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.OnField_onColumn, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,01933a9d-e116-11ee-995f-5faf5f77d478,X8Y7GpGp9CFMy7uA6prDusIoJHc=] */
