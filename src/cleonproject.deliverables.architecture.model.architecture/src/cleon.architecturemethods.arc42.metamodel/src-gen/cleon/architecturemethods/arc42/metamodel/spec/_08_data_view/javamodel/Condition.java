package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Condition extends DynamicResource implements ICondition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICondition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICondition>() {
    
    @Override
    public ICondition create() {
      return new Condition();
    }
    
    @Override
    public ICondition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Condition(resourceRepository, resource);
    }
  
  };

  public Condition() {
    super(ICondition.TYPE_ID);
  }
  
  public Condition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICondition.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectValue() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Condition_value);
  }
    
  public void setValue(java.lang.String value) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Condition_value, value);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn selectColumn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AbstractColumn_column);
  }

  public Condition setColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn column) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AbstractColumn_column, column);
    return this;
  }
    
  @Override
  public ch.actifsource.core.validation.javamodel.IConditionalOperator selectOperator() {
    return _getSingle(ch.actifsource.core.validation.javamodel.IConditionalOperator.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Condition_operator);
  }

  public Condition setOperator(ch.actifsource.core.validation.javamodel.IConditionalOperator operator) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Condition_operator, operator);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Condition setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Condition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Condition_value, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AbstractColumn_column, visitor);
    _acceptSingle(ch.actifsource.core.validation.javamodel.IConditionalOperator.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Condition_operator, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ICondition> selectToMeOperator(ch.actifsource.core.validation.javamodel.IConditionalOperator object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ICondition.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Condition_operator, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f75c24b0-d0d0-11ee-bd60-4767a6be68d4,9qyAr9bxFlnRvgHGba9ziSCkGyE=] */
