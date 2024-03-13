package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SelectField extends DynamicResource implements ISelectField {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISelectField> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISelectField>() {
    
    @Override
    public ISelectField create() {
      return new SelectField();
    }
    
    @Override
    public ISelectField create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SelectField(resourceRepository, resource);
    }
  
  };

  public SelectField() {
    super(ISelectField.TYPE_ID);
  }
  
  public SelectField(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISelectField.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectAlias() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.SelectField_alias);
  }
    
  public void setAlias(java.lang.String alias) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.SelectField_alias, alias);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelectAggregate selectAggregate() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelectAggregate.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.SelectField_aggregate);
  }

  public SelectField setAggregate(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelectAggregate aggregate) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.SelectField_aggregate, aggregate);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn selectColumn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AbstractField_column);
  }

  public SelectField setColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn column) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AbstractField_column, column);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SelectField setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SelectField setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.SelectField_alias, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelectAggregate.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.SelectField_aggregate, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AbstractField_column, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelectField> selectToMeAggregate(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelectAggregate object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelectField.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.SelectField_aggregate, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,50a4626f-d0cc-11ee-a38e-0b82bafb3097,R1shfG1MYkBc3zNzj7p3dPsd1zM=] */
