package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2ec20d11-f5ff-11f0-b5cb-2bfccb38336b,imports]] */

/* End Protected Region   [[2ec20d11-f5ff-11f0-b5cb-2bfccb38336b,imports]] */

public class FunctionSpace_Table {

  /* Begin Protected Region [[2ec20d11-f5ff-11f0-b5cb-2bfccb38336b]] */
  
  /* End Protected Region   [[2ec20d11-f5ff-11f0-b5cb-2bfccb38336b]] */


  public static interface ITypeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("874fe13a-f5ff-11f0-b5cb-2bfccb38336b")
    public java.lang.String DbType();

    @IDynamicResourceExtension.MethodId("3402c9d6-f606-11f0-b5cb-2bfccb38336b")
    public List<java.lang.String> AllowedValues(final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn columns);

  }
  
  public static interface ITypeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TypeFunctionsImpl implements ITypeFunctionsImpl {

    public static final ITypeFunctionsImpl INSTANCE = new TypeFunctionsImpl();

    private TypeFunctionsImpl() {}

  }
  
  public static class TypeFunctions {

    private TypeFunctions() {}

  }

  public static interface IArrayTypeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("908cafed-f5ff-11f0-b5cb-2bfccb38336b")
    public java.lang.String DbType();

    @IDynamicResourceExtension.MethodId("216c6ec2-f60c-11f0-b5cb-2bfccb38336b")
    public List<java.lang.String> AllowedValues(final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn columns);

    @IDynamicResourceExtension.MethodId("a40e5afd-f60c-11f0-b5cb-2bfccb38336b")
    public java.lang.String MakeWithBrackets();

  }
  
  public static interface IArrayTypeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ArrayTypeFunctionsImpl implements IArrayTypeFunctionsImpl {

    public static final IArrayTypeFunctionsImpl INSTANCE = new ArrayTypeFunctionsImpl();

    private ArrayTypeFunctionsImpl() {}

  }
  
  public static class ArrayTypeFunctions {

    private ArrayTypeFunctions() {}

  }

  public static interface IStandardTypeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a70fc731-f5ff-11f0-b5cb-2bfccb38336b")
    public java.lang.String DbType();

  }
  
  public static interface IStandardTypeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class StandardTypeFunctionsImpl implements IStandardTypeFunctionsImpl {

    public static final IStandardTypeFunctionsImpl INSTANCE = new StandardTypeFunctionsImpl();

    private StandardTypeFunctionsImpl() {}

  }
  
  public static class StandardTypeFunctions {

    private StandardTypeFunctions() {}

  }

  public static interface IRecordTypeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bb9f4cdb-f5ff-11f0-b5cb-2bfccb38336b")
    public java.lang.String DbType();

  }
  
  public static interface IRecordTypeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RecordTypeFunctionsImpl implements IRecordTypeFunctionsImpl {

    public static final IRecordTypeFunctionsImpl INSTANCE = new RecordTypeFunctionsImpl();

    private RecordTypeFunctionsImpl() {}

  }
  
  public static class RecordTypeFunctions {

    private RecordTypeFunctions() {}

  }

  public static interface IUnionTypeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c86e4215-f5ff-11f0-b5cb-2bfccb38336b")
    public java.lang.String DbType();

  }
  
  public static interface IUnionTypeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class UnionTypeFunctionsImpl implements IUnionTypeFunctionsImpl {

    public static final IUnionTypeFunctionsImpl INSTANCE = new UnionTypeFunctionsImpl();

    private UnionTypeFunctionsImpl() {}

  }
  
  public static class UnionTypeFunctions {

    private UnionTypeFunctions() {}

  }

  public static interface IUserTypeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d1e47046-f5ff-11f0-b5cb-2bfccb38336b")
    public java.lang.String DbType();

  }
  
  public static interface IUserTypeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class UserTypeFunctionsImpl implements IUserTypeFunctionsImpl {

    public static final IUserTypeFunctionsImpl INSTANCE = new UserTypeFunctionsImpl();

    private UserTypeFunctionsImpl() {}

  }
  
  public static class UserTypeFunctions {

    private UserTypeFunctions() {}

  }

  public static interface IEnumTypeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e2469fb6-f5ff-11f0-b5cb-2bfccb38336b")
    public java.lang.String DbType();

    @IDynamicResourceExtension.MethodId("61498454-f606-11f0-b5cb-2bfccb38336b")
    public List<java.lang.String> AllowedValues(final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn columns);

  }
  
  public static interface IEnumTypeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EnumTypeFunctionsImpl implements IEnumTypeFunctionsImpl {

    public static final IEnumTypeFunctionsImpl INSTANCE = new EnumTypeFunctionsImpl();

    private EnumTypeFunctionsImpl() {}

  }
  
  public static class EnumTypeFunctions {

    private EnumTypeFunctions() {}

  }

  public static interface IColumnFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c261eeda-f606-11f0-b5cb-2bfccb38336b")
    public List<java.lang.String> AllowedValues();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2ec20d11-f5ff-11f0-b5cb-2bfccb38336b,oIvRr8gwV0HUuMwYzM1BFh3z9rU=] */
