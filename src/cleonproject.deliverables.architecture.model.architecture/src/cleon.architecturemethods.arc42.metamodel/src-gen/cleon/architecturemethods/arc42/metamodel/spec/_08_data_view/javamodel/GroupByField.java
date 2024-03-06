package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class GroupByField extends DynamicResource implements IGroupByField {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGroupByField> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGroupByField>() {
    
    @Override
    public IGroupByField create() {
      return new GroupByField();
    }
    
    @Override
    public IGroupByField create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new GroupByField(resourceRepository, resource);
    }
  
  };

  public GroupByField() {
    super(IGroupByField.TYPE_ID);
  }
  
  public GroupByField(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGroupByField.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn selectColumn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AbstractField_column);
  }

  public GroupByField setColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn column) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AbstractField_column, column);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public GroupByField setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public GroupByField setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.AbstractField_column, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0cf70641-d0ce-11ee-a38e-0b82bafb3097,XlsT+GxfUyyjJNFPPn/cuNdAI+8=] */
