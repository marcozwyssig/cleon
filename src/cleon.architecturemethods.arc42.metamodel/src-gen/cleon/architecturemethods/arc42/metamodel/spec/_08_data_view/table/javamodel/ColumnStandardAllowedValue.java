package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ColumnStandardAllowedValue extends DynamicResource implements IColumnStandardAllowedValue {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IColumnStandardAllowedValue> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IColumnStandardAllowedValue>() {
    
    @Override
    public IColumnStandardAllowedValue create() {
      return new ColumnStandardAllowedValue();
    }
    
    @Override
    public IColumnStandardAllowedValue create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ColumnStandardAllowedValue(resourceRepository, resource);
    }
  
  };

  public ColumnStandardAllowedValue() {
    super(IColumnStandardAllowedValue.TYPE_ID);
  }
  
  public ColumnStandardAllowedValue(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IColumnStandardAllowedValue.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ColumnStandardAllowedValue setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumnValue selectValueFromAllowedValues() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumnValue.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnStandardAllowedValue_valueFromAllowedValues);
  }

  public ColumnStandardAllowedValue setValueFromAllowedValues(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumnValue valueFromAllowedValues) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnStandardAllowedValue_valueFromAllowedValues, valueFromAllowedValues);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumnValue.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnStandardAllowedValue_valueFromAllowedValues, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumnStandardAllowedValue> selectToMeValueFromAllowedValues(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumnValue object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumnStandardAllowedValue.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnStandardAllowedValue_valueFromAllowedValues, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5b5557d0-d42a-11f0-b3aa-65c9c1969da9,3Jbj+b5THsrD6/SST5QIgRAF+OU=] */
