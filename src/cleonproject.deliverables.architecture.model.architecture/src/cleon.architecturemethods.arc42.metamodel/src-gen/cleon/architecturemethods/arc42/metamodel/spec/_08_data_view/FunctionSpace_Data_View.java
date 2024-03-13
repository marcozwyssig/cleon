package cleon.architecturemethods.arc42.metamodel.spec._08_data_view;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f837c1a7-b936-11ee-a0d0-e953bcbfaeef,imports]] */

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

  public static interface ITableFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("de1b7980-cf36-11ee-8c06-a5102392725a")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerationValue> AllEnumerationValues();

    @IDynamicResourceExtension.MethodId("00a6db1b-cf37-11ee-8c06-a5102392725a")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerationValue> UsedEnumerationValues();

    @IDynamicResourceExtension.MethodId("16cc69f4-cf37-11ee-8c06-a5102392725a")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerationValue> AvailableEnumerationValues();

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

  public static interface ISelectFieldFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d6df2c9e-d0cc-11ee-a38e-0b82bafb3097")
    public java.lang.String SimpleName();

  }
  
  public static interface ISelectFieldFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SelectFieldFunctionsImpl implements ISelectFieldFunctionsImpl {

    public static final ISelectFieldFunctionsImpl INSTANCE = new SelectFieldFunctionsImpl();

    private SelectFieldFunctionsImpl() {}

  }
  
  public static class SelectFieldFunctions {

    private SelectFieldFunctions() {}

  }

  public static interface ISelectFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fd0365ed-d0cf-11ee-bd60-4767a6be68d4")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("13182fab-e11c-11ee-995f-5faf5f77d478")
    public List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn> Fields();

    @IDynamicResourceExtension.MethodId("2aa08299-e11c-11ee-995f-5faf5f77d478")
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IView View();

  }
  
  public static interface ISelectFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SelectFunctionsImpl implements ISelectFunctionsImpl {

    public static final ISelectFunctionsImpl INSTANCE = new SelectFunctionsImpl();

    private SelectFunctionsImpl() {}

  }
  
  public static class SelectFunctions {

    private SelectFunctions() {}

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
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITable From();

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

  public static interface IConditionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("69420d3a-d0d2-11ee-bd60-4767a6be68d4")
    public java.lang.String SimpleName();

  }
  
  public static interface IConditionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ConditionFunctionsImpl implements IConditionFunctionsImpl {

    public static final IConditionFunctionsImpl INSTANCE = new ConditionFunctionsImpl();

    private ConditionFunctionsImpl() {}

  }
  
  public static class ConditionFunctions {

    private ConditionFunctions() {}

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
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITable From();

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
    public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITable From();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f837c1a7-b936-11ee-a0d0-e953bcbfaeef,We4nsS5Xs8L8TjycSZMF7E4Vl+U=] */
