package cleon.architecturemethods.arc42.metamodel.spec._08_data_view;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f837c1a7-b936-11ee-a0d0-e953bcbfaeef,imports]] */
import java.util.Arrays;
import java.util.stream.Collectors;

/* End Protected Region   [[f837c1a7-b936-11ee-a0d0-e953bcbfaeef,imports]] */

public class FunctionSpace_Data_View {

  /* Begin Protected Region [[f837c1a7-b936-11ee-a0d0-e953bcbfaeef]] */
  
  /* End Protected Region   [[f837c1a7-b936-11ee-a0d0-e953bcbfaeef]] */


  public static interface IPrimaryKeyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fe9f4f89-b936-11ee-a0d0-e953bcbfaeef")
    public java.lang.String ColumnsAsList();

  }
  
  public static interface IPrimaryKeyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PrimaryKeyFunctionsImpl implements IPrimaryKeyFunctionsImpl {

    public static final IPrimaryKeyFunctionsImpl INSTANCE = new PrimaryKeyFunctionsImpl();

    private PrimaryKeyFunctionsImpl() {}

  }
  
  public static class PrimaryKeyFunctions {

    private PrimaryKeyFunctions() {}

  }

  public static interface ILiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("442330d7-b93b-11ee-a0d0-e953bcbfaeef")
    public java.lang.String ToType();

  }
  
  public static interface ILiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LiteralFunctionsImpl implements ILiteralFunctionsImpl {

    public static final ILiteralFunctionsImpl INSTANCE = new LiteralFunctionsImpl();

    private LiteralFunctionsImpl() {}

  }
  
  public static class LiteralFunctions {

    private LiteralFunctions() {}

  }

  public static interface IAbstractTableFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("de1b7980-cf36-11ee-8c06-a5102392725a")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerationValue> AllEnumerationValues();

    @IDynamicResourceExtension.MethodId("00a6db1b-cf37-11ee-8c06-a5102392725a")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerationValue> UsedEnumerationValues();

    @IDynamicResourceExtension.MethodId("16cc69f4-cf37-11ee-8c06-a5102392725a")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerationValue> AvailableEnumerationValues();

    @IDynamicResourceExtension.MethodId("3186a2cd-e134-11ee-995f-5faf5f77d478")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn> Columns();

    @IDynamicResourceExtension.MethodId("ae2b8d22-e135-11ee-995f-5faf5f77d478")
    public java.lang.String Name();

    @IDynamicResourceExtension.MethodId("1b3b6de1-e140-11ee-9375-43bf1495bfd9")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn> CriteriaFields();

    @IDynamicResourceExtension.MethodId("cda158a9-5cb3-11f0-941a-2501c6dfb162")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable> AllPersistentTables();

    @IDynamicResourceExtension.MethodId("bcfe34ea-5cce-11f0-97fc-b537e659b5f2")
    public java.lang.Boolean IsPersistent();

    @IDynamicResourceExtension.MethodId("d300e238-620e-11f0-8ed9-1d79caf8da43")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("3dd7954b-6236-11f0-bad7-45c7bffc2eff")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation> ToRelations();

    @IDynamicResourceExtension.MethodId("d5ec1ec3-6237-11f0-bad7-45c7bffc2eff")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation> FromRelations();

    @IDynamicResourceExtension.MethodId("a7abe9ac-6237-11f0-bad7-45c7bffc2eff")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation> AllRelations();

    @IDynamicResourceExtension.MethodId("b1b72e6c-6b90-11f0-8c6a-09245c78ab92")
    public java.lang.String Stereotype();

    @IDynamicResourceExtension.MethodId("8a66c4f6-fb7d-11f0-919e-07363e802872")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation> AllRelationsWithinTableArea();

    @IDynamicResourceExtension.MethodId("f1a17806-fb7d-11f0-919e-07363e802872")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea TableArea();

  }
  
  public static interface IAbstractTableFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("cda158a9-5cb3-11f0-941a-2501c6dfb162")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable> AllPersistentTables(final List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable> abstractTableList);

  }
  
  public static class AbstractTableFunctionsImpl implements IAbstractTableFunctionsImpl {

    public static final IAbstractTableFunctionsImpl INSTANCE = new AbstractTableFunctionsImpl();

    private AbstractTableFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable> AllPersistentTables(final List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable> abstractTableList) {
      /* Begin Protected Region [[cda158a9-5cb3-11f0-941a-2501c6dfb162]] */
    	return abstractTableList.stream().filter(x -> x.extension(IAbstractTableFunctions.class).IsPersistent()).collect(Collectors.toList());
      /* End Protected Region   [[cda158a9-5cb3-11f0-941a-2501c6dfb162]] */
    }

  }
  
  public static class AbstractTableFunctions {

    private AbstractTableFunctions() {}

    public static List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable> AllPersistentTables(final List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable> abstractTableList) {
      return DynamicResourceUtil.invoke(IAbstractTableFunctionsImpl.class, AbstractTableFunctionsImpl.INSTANCE, abstractTableList).AllPersistentTables(abstractTableList);
    }

  }

  public static interface ISelectColumnFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d6df2c9e-d0cc-11ee-a38e-0b82bafb3097")
    public java.lang.String SimpleName();

  }
  
  public static interface ISelectColumnFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SelectColumnFunctionsImpl implements ISelectColumnFunctionsImpl {

    public static final ISelectColumnFunctionsImpl INSTANCE = new SelectColumnFunctionsImpl();

    private SelectColumnFunctionsImpl() {}

  }
  
  public static class SelectColumnFunctions {

    private SelectColumnFunctions() {}

  }

  public static interface ISelectFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fd0365ed-d0cf-11ee-bd60-4767a6be68d4")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("810deeb5-e149-11ee-9375-43bf1495bfd9")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn> FieldsDependingSelectAll();

    @IDynamicResourceExtension.MethodId("13182fab-e11c-11ee-995f-5faf5f77d478")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn> Fields();

    @IDynamicResourceExtension.MethodId("2aa08299-e11c-11ee-995f-5faf5f77d478")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IView View();

  }
  
  public static interface ISelectFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("810deeb5-e149-11ee-9375-43bf1495bfd9")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn> FieldsDependingSelectAll(final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.ISelect select);

  }
  
  public static class SelectFunctionsImpl implements ISelectFunctionsImpl {

    public static final ISelectFunctionsImpl INSTANCE = new SelectFunctionsImpl();

    private SelectFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn> FieldsDependingSelectAll(final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.ISelect select) {
      /* Begin Protected Region [[810deeb5-e149-11ee-9375-43bf1495bfd9]] */
    	if( select.selectSelectAllFields()) {
    		 return Arrays.asList();
    	}
    	final var selectFunctions = select.extension(ISelectFunctions.class);
    	return selectFunctions.Fields();   
      /* End Protected Region   [[810deeb5-e149-11ee-9375-43bf1495bfd9]] */
    }

  }
  
  public static class SelectFunctions {

    private SelectFunctions() {}

    public static List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn> FieldsDependingSelectAll(final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.ISelect select) {
      return DynamicResourceUtil.invoke(ISelectFunctionsImpl.class, SelectFunctionsImpl.INSTANCE, select).FieldsDependingSelectAll(select);
    }

  }

  public static interface IGroup_ByFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("93391247-d0d0-11ee-bd60-4767a6be68d4")
    public java.lang.String SimpleName();

  }
  
  public static interface IGroup_ByFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class Group_ByFunctionsImpl implements IGroup_ByFunctionsImpl {

    public static final IGroup_ByFunctionsImpl INSTANCE = new Group_ByFunctionsImpl();

    private Group_ByFunctionsImpl() {}

  }
  
  public static class Group_ByFunctions {

    private Group_ByFunctions() {}

  }

  public static interface IHavingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("33466ec3-d0d1-11ee-bd60-4767a6be68d4")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("df924bc2-e11a-11ee-995f-5faf5f77d478")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable From();

  }
  
  public static interface IHavingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class HavingFunctionsImpl implements IHavingFunctionsImpl {

    public static final IHavingFunctionsImpl INSTANCE = new HavingFunctionsImpl();

    private HavingFunctionsImpl() {}

  }
  
  public static class HavingFunctions {

    private HavingFunctions() {}

  }

  public static interface IConditionalOperatorFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f1420861-d0d2-11ee-bd60-4767a6be68d4")
    public java.lang.Boolean IsEqual();

    @IDynamicResourceExtension.MethodId("22b3f5a2-d0d3-11ee-bd60-4767a6be68d4")
    public java.lang.Boolean IsNotEqual();

    @IDynamicResourceExtension.MethodId("2bb12373-d0d3-11ee-bd60-4767a6be68d4")
    public java.lang.Boolean IsLess();

    @IDynamicResourceExtension.MethodId("454635af-d0d3-11ee-bd60-4767a6be68d4")
    public java.lang.Boolean IsLessEqual();

    @IDynamicResourceExtension.MethodId("5780f4f4-d0d3-11ee-bd60-4767a6be68d4")
    public java.lang.Boolean IsGreater();

    @IDynamicResourceExtension.MethodId("65367a7e-d0d3-11ee-bd60-4767a6be68d4")
    public java.lang.Boolean IsGreaterEqual();

  }
  
  public static interface IConditionalOperatorFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f1420861-d0d2-11ee-bd60-4767a6be68d4")
    public java.lang.Boolean IsEqual(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator);

    @IDynamicResourceExtension.MethodId("22b3f5a2-d0d3-11ee-bd60-4767a6be68d4")
    public java.lang.Boolean IsNotEqual(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator);

    @IDynamicResourceExtension.MethodId("2bb12373-d0d3-11ee-bd60-4767a6be68d4")
    public java.lang.Boolean IsLess(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator);

    @IDynamicResourceExtension.MethodId("454635af-d0d3-11ee-bd60-4767a6be68d4")
    public java.lang.Boolean IsLessEqual(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator);

    @IDynamicResourceExtension.MethodId("5780f4f4-d0d3-11ee-bd60-4767a6be68d4")
    public java.lang.Boolean IsGreater(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator);

    @IDynamicResourceExtension.MethodId("65367a7e-d0d3-11ee-bd60-4767a6be68d4")
    public java.lang.Boolean IsGreaterEqual(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator);

  }
  
  public static class ConditionalOperatorFunctionsImpl implements IConditionalOperatorFunctionsImpl {

    public static final IConditionalOperatorFunctionsImpl INSTANCE = new ConditionalOperatorFunctionsImpl();

    private ConditionalOperatorFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsEqual(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator) {
      return conditionalOperator.isEqual();
    }

    @Override
    public java.lang.Boolean IsNotEqual(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator) {
      return conditionalOperator.isNotEqual();
    }

    @Override
    public java.lang.Boolean IsLess(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator) {
      return conditionalOperator.isLess();
    }

    @Override
    public java.lang.Boolean IsLessEqual(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator) {
      return conditionalOperator.isLessEqual();
    }

    @Override
    public java.lang.Boolean IsGreater(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator) {
      return conditionalOperator.isGreater();
    }

    @Override
    public java.lang.Boolean IsGreaterEqual(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator) {
      return conditionalOperator.isGreaterEqual();
    }

  }
  
  public static class ConditionalOperatorFunctions {

    private ConditionalOperatorFunctions() {}

    public static java.lang.Boolean IsEqual(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator) {
      return DynamicResourceUtil.invoke(IConditionalOperatorFunctionsImpl.class, ConditionalOperatorFunctionsImpl.INSTANCE, conditionalOperator).IsEqual(conditionalOperator);
    }

    public static java.lang.Boolean IsNotEqual(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator) {
      return DynamicResourceUtil.invoke(IConditionalOperatorFunctionsImpl.class, ConditionalOperatorFunctionsImpl.INSTANCE, conditionalOperator).IsNotEqual(conditionalOperator);
    }

    public static java.lang.Boolean IsLess(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator) {
      return DynamicResourceUtil.invoke(IConditionalOperatorFunctionsImpl.class, ConditionalOperatorFunctionsImpl.INSTANCE, conditionalOperator).IsLess(conditionalOperator);
    }

    public static java.lang.Boolean IsLessEqual(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator) {
      return DynamicResourceUtil.invoke(IConditionalOperatorFunctionsImpl.class, ConditionalOperatorFunctionsImpl.INSTANCE, conditionalOperator).IsLessEqual(conditionalOperator);
    }

    public static java.lang.Boolean IsGreater(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator) {
      return DynamicResourceUtil.invoke(IConditionalOperatorFunctionsImpl.class, ConditionalOperatorFunctionsImpl.INSTANCE, conditionalOperator).IsGreater(conditionalOperator);
    }

    public static java.lang.Boolean IsGreaterEqual(final ch.actifsource.core.validation.javamodel.IConditionalOperator conditionalOperator) {
      return DynamicResourceUtil.invoke(IConditionalOperatorFunctionsImpl.class, ConditionalOperatorFunctionsImpl.INSTANCE, conditionalOperator).IsGreaterEqual(conditionalOperator);
    }

  }

  public static interface IConditionalFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c371368a-e11a-11ee-995f-5faf5f77d478")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseElement From();

  }
  
  public static interface IConditionalFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ConditionalFunctionsImpl implements IConditionalFunctionsImpl {

    public static final IConditionalFunctionsImpl INSTANCE = new ConditionalFunctionsImpl();

    private ConditionalFunctionsImpl() {}

  }
  
  public static class ConditionalFunctions {

    private ConditionalFunctions() {}

  }

  public static interface IWhereFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("09d674b8-e11b-11ee-995f-5faf5f77d478")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseElement From();

  }
  
  public static interface IWhereFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WhereFunctionsImpl implements IWhereFunctionsImpl {

    public static final IWhereFunctionsImpl INSTANCE = new WhereFunctionsImpl();

    private WhereFunctionsImpl() {}

  }
  
  public static class WhereFunctions {

    private WhereFunctions() {}

  }

  public static interface IColumnFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b59ccd48-e11c-11ee-995f-5faf5f77d478")
    public java.lang.String FullName();

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

  public static interface IWhereAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7100449a-e120-11ee-995f-5faf5f77d478")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseElement From();

  }
  
  public static interface IWhereAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WhereAwareFunctionsImpl implements IWhereAwareFunctionsImpl {

    public static final IWhereAwareFunctionsImpl INSTANCE = new WhereAwareFunctionsImpl();

    private WhereAwareFunctionsImpl() {}

  }
  
  public static class WhereAwareFunctions {

    private WhereAwareFunctions() {}

  }

  public static interface IViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("82d5b266-e120-11ee-995f-5faf5f77d478")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseElement From();

    @IDynamicResourceExtension.MethodId("b0f451a0-e132-11ee-995f-5faf5f77d478")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("85517bef-e135-11ee-995f-5faf5f77d478")
    public java.lang.String Name();

    @IDynamicResourceExtension.MethodId("e333e7d7-e135-11ee-995f-5faf5f77d478")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn> Columns();

    @IDynamicResourceExtension.MethodId("8c4b05a2-e13f-11ee-9375-43bf1495bfd9")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn> CriteriaFields();

  }
  
  public static interface IViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ViewFunctionsImpl implements IViewFunctionsImpl {

    public static final IViewFunctionsImpl INSTANCE = new ViewFunctionsImpl();

    private ViewFunctionsImpl() {}

  }
  
  public static class ViewFunctions {

    private ViewFunctions() {}

  }

  public static interface IJoinFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8d6344b2-e120-11ee-995f-5faf5f77d478")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable From();

    @IDynamicResourceExtension.MethodId("04094cda-e122-11ee-995f-5faf5f77d478")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseElement FromView();

    @IDynamicResourceExtension.MethodId("fb8095db-e12d-11ee-995f-5faf5f77d478")
    public java.lang.String SimpleName();

  }
  
  public static interface IJoinFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class JoinFunctionsImpl implements IJoinFunctionsImpl {

    public static final IJoinFunctionsImpl INSTANCE = new JoinFunctionsImpl();

    private JoinFunctionsImpl() {}

  }
  
  public static class JoinFunctions {

    private JoinFunctions() {}

  }

  public static interface IJoinBaseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c579861e-e121-11ee-995f-5faf5f77d478")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseElement FromView();

  }
  
  public static interface IJoinBaseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class JoinBaseFunctionsImpl implements IJoinBaseFunctionsImpl {

    public static final IJoinBaseFunctionsImpl INSTANCE = new JoinBaseFunctionsImpl();

    private JoinBaseFunctionsImpl() {}

  }
  
  public static class JoinBaseFunctions {

    private JoinBaseFunctions() {}

  }

  public static interface IDatabaseElementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("12f74d6d-e134-11ee-995f-5faf5f77d478")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn> Columns();

    @IDynamicResourceExtension.MethodId("5e2ef9f3-e134-11ee-995f-5faf5f77d478")
    public java.lang.String Name();

    @IDynamicResourceExtension.MethodId("53de3789-e141-11ee-9375-43bf1495bfd9")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn> CriteriaFields();

  }
  
  public static interface IDatabaseElementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DatabaseElementFunctionsImpl implements IDatabaseElementFunctionsImpl {

    public static final IDatabaseElementFunctionsImpl INSTANCE = new DatabaseElementFunctionsImpl();

    private DatabaseElementFunctionsImpl() {}

  }
  
  public static class DatabaseElementFunctions {

    private DatabaseElementFunctions() {}

  }

  public static interface ITableAreaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("de076a79-e138-11ee-b0cd-2573623ee439")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable> Tables();

    @IDynamicResourceExtension.MethodId("0bf63a76-624f-11f0-884c-55717352a45e")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation> AllRelations();

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

  public static interface IOrderByFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("dc3ad1be-e141-11ee-9375-43bf1495bfd9")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseElement From();

    @IDynamicResourceExtension.MethodId("cdda9c4d-e529-11ee-a074-d7afe74e4a27")
    public java.lang.String SimpleName();

  }
  
  public static interface IOrderByFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OrderByFunctionsImpl implements IOrderByFunctionsImpl {

    public static final IOrderByFunctionsImpl INSTANCE = new OrderByFunctionsImpl();

    private OrderByFunctionsImpl() {}

  }
  
  public static class OrderByFunctions {

    private OrderByFunctions() {}

  }

  public static interface IColumnExpressionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0f27da92-e14f-11ee-9375-43bf1495bfd9")
    public java.lang.String code();

  }
  
  public static interface IColumnExpressionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ColumnExpressionFunctionsImpl implements IColumnExpressionFunctionsImpl {

    public static final IColumnExpressionFunctionsImpl INSTANCE = new ColumnExpressionFunctionsImpl();

    private ColumnExpressionFunctionsImpl() {}

  }
  
  public static class ColumnExpressionFunctions {

    private ColumnExpressionFunctions() {}

  }

  public static interface IBooleanExpressionBaseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a20ee6bd-e151-11ee-9375-43bf1495bfd9")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IConditional Conditional();

    @IDynamicResourceExtension.MethodId("c3a97f9e-e151-11ee-9375-43bf1495bfd9")
    public ch.actifsource.solution.datatype.generic.expression.bool.javamodel.IBooleanExpressionBase Parent();

  }
  
  public static interface IBooleanExpressionBaseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BooleanExpressionBaseFunctionsImpl implements IBooleanExpressionBaseFunctionsImpl {

    public static final IBooleanExpressionBaseFunctionsImpl INSTANCE = new BooleanExpressionBaseFunctionsImpl();

    private BooleanExpressionBaseFunctionsImpl() {}

  }
  
  public static class BooleanExpressionBaseFunctions {

    private BooleanExpressionBaseFunctions() {}

  }

  public static interface IDataExpressionBaseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ce99fcee-e152-11ee-9375-43bf1495bfd9")
    public ch.actifsource.solution.datatype.generic.expression.bool.javamodel.IBooleanExpressionBase Parent();

  }
  
  public static interface IDataExpressionBaseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DataExpressionBaseFunctionsImpl implements IDataExpressionBaseFunctionsImpl {

    public static final IDataExpressionBaseFunctionsImpl INSTANCE = new DataExpressionBaseFunctionsImpl();

    private DataExpressionBaseFunctionsImpl() {}

  }
  
  public static class DataExpressionBaseFunctions {

    private DataExpressionBaseFunctions() {}

  }

  public static interface ITableDatabaseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cbcf8aac-5cce-11f0-97fc-b537e659b5f2")
    public java.lang.Boolean IsPersistent();

  }
  
  public static interface ITableDatabaseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("cbcf8aac-5cce-11f0-97fc-b537e659b5f2")
    public java.lang.Boolean IsPersistent(final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableDatabase tableDatabase);

  }
  
  public static class TableDatabaseFunctionsImpl implements ITableDatabaseFunctionsImpl {

    public static final ITableDatabaseFunctionsImpl INSTANCE = new TableDatabaseFunctionsImpl();

    private TableDatabaseFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsPersistent(final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableDatabase tableDatabase) {
      return true;
    }

  }
  
  public static class TableDatabaseFunctions {

    private TableDatabaseFunctions() {}

    public static java.lang.Boolean IsPersistent(final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableDatabase tableDatabase) {
      return DynamicResourceUtil.invoke(ITableDatabaseFunctionsImpl.class, TableDatabaseFunctionsImpl.INSTANCE, tableDatabase).IsPersistent(tableDatabase);
    }

  }

  public static interface IAbstractTableRelationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cfbdb344-6235-11f0-bad7-45c7bffc2eff")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable FromTable();

    @IDynamicResourceExtension.MethodId("715a9135-670a-11f0-8771-c3f8175f9d05")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn ForeignKeyColumn();

    @IDynamicResourceExtension.MethodId("90566461-670a-11f0-8771-c3f8175f9d05")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn PrimaryKeyColumn();

    @IDynamicResourceExtension.MethodId("e199ff57-6235-11f0-bad7-45c7bffc2eff")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable ToTable();

    @IDynamicResourceExtension.MethodId("a2ece452-6b8d-11f0-8c6a-09245c78ab92")
    public java.lang.String DestinationId();

    @IDynamicResourceExtension.MethodId("a4f6f03f-6b8e-11f0-8c6a-09245c78ab92")
    public java.lang.String SourceId();

    @IDynamicResourceExtension.MethodId("a1b9bb3a-6243-11f0-bad7-45c7bffc2eff")
    public java.lang.String FullCardinality();

    @IDynamicResourceExtension.MethodId("c99135e4-6ba8-11f0-8c6a-09245c78ab92")
    public java.lang.String Cardinality();

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

    @IDynamicResourceExtension.MethodId("b157bbd0-6ba8-11f0-8c6a-09245c78ab92")
    public java.lang.String Cardinality();

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

    @IDynamicResourceExtension.MethodId("b157bbd7-6ba8-11f0-8c6a-09245c78ab92")
    public java.lang.String Cardinality();

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

  public static interface IDatabaseViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2997863d-fac6-11f0-81b8-83fdbb37c0b0")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable> Tables();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f837c1a7-b936-11ee-a0d0-e953bcbfaeef,6HJI82OIYUMBybiXxe2ivu7COeU=] */
