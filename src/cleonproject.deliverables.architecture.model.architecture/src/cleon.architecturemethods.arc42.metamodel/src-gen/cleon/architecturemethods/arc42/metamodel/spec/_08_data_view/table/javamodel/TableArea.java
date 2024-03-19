package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TableArea extends DynamicResource implements ITableArea {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITableArea> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITableArea>() {
    
    @Override
    public ITableArea create() {
      return new TableArea();
    }
    
    @Override
    public ITableArea create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TableArea(resourceRepository, resource);
    }
  
  };

  public TableArea() {
    super(ITableArea.TYPE_ID);
  }
  
  public TableArea(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITableArea.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IView> selectSubviews() {
    return _getMultiMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableArea_subviews);
  }

  public TableArea setSubviews(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IView> subviews) {
    _setMultiMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableArea_subviews, subviews);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITable> selectTables() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITable.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableArea_tables);
  }

  public TableArea setTables(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITable> tables) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableArea_tables, tables);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TableArea setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IView> selectViews() {
    return _getMultiMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableArea_views);
  }

  public TableArea setViews(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IView> views) {
    _setMultiMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableArea_views, views);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptMultiMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableArea_subviews, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITable.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableArea_tables, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptMultiMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableArea_views, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea selectToMeTables(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITable object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableArea_tables, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea selectToMeViews(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableArea_views, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea selectToMeSubviews(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.TableArea_subviews, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,01f5d505-b934-11ee-a0d0-e953bcbfaeef,xG2K+5fMxctucrk0bjcOq+m9peQ=] */
