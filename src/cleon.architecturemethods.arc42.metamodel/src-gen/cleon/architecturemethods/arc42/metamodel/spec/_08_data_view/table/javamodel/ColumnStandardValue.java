package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ColumnStandardValue extends DynamicResource implements IColumnStandardValue {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IColumnStandardValue> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IColumnStandardValue>() {
    
    @Override
    public IColumnStandardValue create() {
      return new ColumnStandardValue();
    }
    
    @Override
    public IColumnStandardValue create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ColumnStandardValue(resourceRepository, resource);
    }
  
  };

  public ColumnStandardValue() {
    super(IColumnStandardValue.TYPE_ID);
  }
  
  public ColumnStandardValue(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IColumnStandardValue.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectValue() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnStandardValue_value);
  }
    
  public void setValue(java.lang.String value) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnStandardValue_value, value);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ColumnStandardValue setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnStandardValue_value, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6b458b53-d42a-11f0-b3aa-65c9c1969da9,ceqANos3qwkGBp9kdnwoQP42iK4=] */
