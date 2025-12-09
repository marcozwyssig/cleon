package cleon.architecturemethods.arc42.metamodel.template.xmi.data_view;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[24306e3b-2f09-11f0-9cc2-230006819e4a,imports]] */

/* End Protected Region   [[24306e3b-2f09-11f0-9cc2-230006819e4a,imports]] */

public class DataView_XMI {

  /* Begin Protected Region [[24306e3b-2f09-11f0-9cc2-230006819e4a]] */
  
  /* End Protected Region   [[24306e3b-2f09-11f0-9cc2-230006819e4a]] */


  public static interface IDatabaseViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c3aecfdf-2f09-11f0-9cc2-230006819e4a")
    public java.lang.String RenderXMI();

    @IDynamicResourceExtension.MethodId("566d084b-2f15-11f0-9f77-e70293d1379e")
    public java.lang.String Id();

  }
  
  public static interface IDatabaseViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DatabaseViewFunctionsImpl implements IDatabaseViewFunctionsImpl {

    public static final IDatabaseViewFunctionsImpl INSTANCE = new DatabaseViewFunctionsImpl();

    private DatabaseViewFunctionsImpl() {}

  }
  
  public static class DatabaseViewFunctions {

    private DatabaseViewFunctions() {}

  }

  public static interface ITableAreaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4ab7e7d3-2f0a-11f0-9f77-e70293d1379e")
    public java.lang.String RenderXMI();

    @IDynamicResourceExtension.MethodId("24710340-2f15-11f0-9f77-e70293d1379e")
    public java.lang.String Id();

    @IDynamicResourceExtension.MethodId("686f8343-6c4f-11f0-9a54-8beabbd05ae8")
    public java.lang.String DiagramId();

  }
  
  public static interface ITableAreaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TableAreaFunctionsImpl implements ITableAreaFunctionsImpl {

    public static final ITableAreaFunctionsImpl INSTANCE = new TableAreaFunctionsImpl();

    private TableAreaFunctionsImpl() {}

  }
  
  public static class TableAreaFunctions {

    private TableAreaFunctions() {}

  }

  public static interface IAbstractTableFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("50bfa312-2f0a-11f0-9f77-e70293d1379e")
    public java.lang.String RenderXMI();

    @IDynamicResourceExtension.MethodId("938ceb7b-2f15-11f0-9f77-e70293d1379e")
    public java.lang.String Id();

  }
  
  public static interface IAbstractTableFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractTableFunctionsImpl implements IAbstractTableFunctionsImpl {

    public static final IAbstractTableFunctionsImpl INSTANCE = new AbstractTableFunctionsImpl();

    private AbstractTableFunctionsImpl() {}

  }
  
  public static class AbstractTableFunctions {

    private AbstractTableFunctions() {}

  }

  public static interface IColumnFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e40ed063-2f15-11f0-9f77-e70293d1379e")
    public java.lang.String Id();

  }
  
  public static interface IColumnFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ColumnFunctionsImpl implements IColumnFunctionsImpl {

    public static final IColumnFunctionsImpl INSTANCE = new ColumnFunctionsImpl();

    private ColumnFunctionsImpl() {}

  }
  
  public static class ColumnFunctions {

    private ColumnFunctions() {}

  }

  public static interface IDataViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("55e87823-2f21-11f0-a641-656c88d7f94a")
    public java.lang.String Id();

  }
  
  public static interface IDataViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DataViewFunctionsImpl implements IDataViewFunctionsImpl {

    public static final IDataViewFunctionsImpl INSTANCE = new DataViewFunctionsImpl();

    private DataViewFunctionsImpl() {}

  }
  
  public static class DataViewFunctions {

    private DataViewFunctions() {}

  }

  public static interface IAbstractTableRelationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("46f907c7-6708-11f0-8771-c3f8175f9d05")
    public java.lang.String Id();

    @IDynamicResourceExtension.MethodId("65d2abdd-6708-11f0-8771-c3f8175f9d05")
    public java.lang.String Name();

    @IDynamicResourceExtension.MethodId("b6693709-6c4f-11f0-9a54-8beabbd05ae8")
    public java.lang.String RenderXmi();

  }
  
  public static interface IAbstractTableRelationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractTableRelationFunctionsImpl implements IAbstractTableRelationFunctionsImpl {

    public static final IAbstractTableRelationFunctionsImpl INSTANCE = new AbstractTableRelationFunctionsImpl();

    private AbstractTableRelationFunctionsImpl() {}

  }
  
  public static class AbstractTableRelationFunctions {

    private AbstractTableRelationFunctions() {}

  }

  public static interface ITableRelationOneToOneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e3c6110d-6c4f-11f0-9a54-8beabbd05ae8")
    public java.lang.String RenderXmi();

  }
  
  public static interface ITableRelationOneToOneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TableRelationOneToOneFunctionsImpl implements ITableRelationOneToOneFunctionsImpl {

    public static final ITableRelationOneToOneFunctionsImpl INSTANCE = new TableRelationOneToOneFunctionsImpl();

    private TableRelationOneToOneFunctionsImpl() {}

  }
  
  public static class TableRelationOneToOneFunctions {

    private TableRelationOneToOneFunctions() {}

  }

  public static interface ITableRelationManyToOneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ef6f9a8d-6c4f-11f0-9a54-8beabbd05ae8")
    public java.lang.String RenderXmi();

  }
  
  public static interface ITableRelationManyToOneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TableRelationManyToOneFunctionsImpl implements ITableRelationManyToOneFunctionsImpl {

    public static final ITableRelationManyToOneFunctionsImpl INSTANCE = new TableRelationManyToOneFunctionsImpl();

    private TableRelationManyToOneFunctionsImpl() {}

  }
  
  public static class TableRelationManyToOneFunctions {

    private TableRelationManyToOneFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,24306e3b-2f09-11f0-9cc2-230006819e4a,tWgY7B1jHnLV9bSqhfNCyrsvFCk=] */
