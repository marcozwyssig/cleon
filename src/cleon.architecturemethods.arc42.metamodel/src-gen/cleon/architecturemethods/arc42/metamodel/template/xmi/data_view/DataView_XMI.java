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

  public static interface ITableFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("50bfa312-2f0a-11f0-9f77-e70293d1379e")
    public java.lang.String RenderXMI();

    @IDynamicResourceExtension.MethodId("938ceb7b-2f15-11f0-9f77-e70293d1379e")
    public java.lang.String Id();

  }
  
  public static interface ITableFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TableFunctionsImpl implements ITableFunctionsImpl {

    public static final ITableFunctionsImpl INSTANCE = new TableFunctionsImpl();

    private TableFunctionsImpl() {}

  }
  
  public static class TableFunctions {

    private TableFunctions() {}

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,24306e3b-2f09-11f0-9cc2-230006819e4a,PSmstMCvmtzsL9IE1YQJB1S39AY=] */
