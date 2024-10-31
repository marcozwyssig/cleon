package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TableMappingView extends DynamicResource implements ITableMappingView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITableMappingView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITableMappingView>() {
    
    @Override
    public ITableMappingView create() {
      return new TableMappingView();
    }
    
    @Override
    public ITableMappingView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TableMappingView(resourceRepository, resource);
    }
  
  };

  public TableMappingView() {
    super(ITableMappingView.TYPE_ID);
  }
  
  public TableMappingView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITableMappingView.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerationValue selectEnumerationValue() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerationValue.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableMappingView_enumerationValue);
  }

  public TableMappingView setEnumerationValue(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerationValue enumerationValue) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableMappingView_enumerationValue, enumerationValue);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITable> selectTables() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITable.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableMappingView_tables);
  }

  public TableMappingView setTables(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITable> tables) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableMappingView_tables, tables);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TableMappingView setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TableMappingView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerationValue.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableMappingView_enumerationValue, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITable.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableMappingView_tables, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableMappingView> selectToMeEnumerationValue(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerationValue object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableMappingView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableMappingView_enumerationValue, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableMappingView> selectToMeTables(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITable object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableMappingView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableMappingView_tables, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fe7d7631-cffb-11ee-9bb8-5f4f5b483c01,Z1neJPiYg7JPbBcwzlOo0FfYtB0=] */
