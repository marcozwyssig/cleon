package cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[345560d5-2025-11e9-83b3-a16e26b4cc59,imports]] */

/* End Protected Region   [[345560d5-2025-11e9-83b3-a16e26b4cc59,imports]] */

public class FunctionSpace_Weighting {

  /* Begin Protected Region [[345560d5-2025-11e9-83b3-a16e26b4cc59]] */
  
  /* End Protected Region   [[345560d5-2025-11e9-83b3-a16e26b4cc59]] */


  public static interface INamedWeightingCriteriaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("56f33e35-a6f5-11e8-9c81-8bd68c62e435")
    public java.lang.Double GetWeighting();

  }
  
  public static interface INamedWeightingCriteriaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedWeightingCriteriaFunctionsImpl implements INamedWeightingCriteriaFunctionsImpl {

    public static final INamedWeightingCriteriaFunctionsImpl INSTANCE = new NamedWeightingCriteriaFunctionsImpl();

    private NamedWeightingCriteriaFunctionsImpl() {}

  }
  
  public static class NamedWeightingCriteriaFunctions {

    private NamedWeightingCriteriaFunctions() {}

  }

  public static interface IWeightingEvaluationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("52c3bb3b-3d08-11e5-871f-6beac6a7c24b")
    public java.lang.Double CalculateScore();

    @IDynamicResourceExtension.MethodId("da1f4d11-0547-11e6-adf9-af3c4dc80bc3")
    public java.lang.Double CalculateMaxScore();

  }
  
  public static interface IWeightingEvaluationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("52c3bb3b-3d08-11e5-871f-6beac6a7c24b")
    public java.lang.Double CalculateScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IWeightingEvaluation weightingEvaluation);

    @IDynamicResourceExtension.MethodId("da1f4d11-0547-11e6-adf9-af3c4dc80bc3")
    public java.lang.Double CalculateMaxScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IWeightingEvaluation weightingEvaluation);

  }
  
  public static class WeightingEvaluationFunctionsImpl implements IWeightingEvaluationFunctionsImpl {

    public static final IWeightingEvaluationFunctionsImpl INSTANCE = new WeightingEvaluationFunctionsImpl();

    private WeightingEvaluationFunctionsImpl() {}

    @Override
    public java.lang.Double CalculateScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IWeightingEvaluation weightingEvaluation) {
      /* Begin Protected Region [[52c3bb3b-3d08-11e5-871f-6beac6a7c24b]] */
		double weighting = weightingEvaluation.selectCriteria().extension(IWeightingCriteriaFunctions.class).GetWeighting();
		double score = Double.parseDouble(weightingEvaluation.selectScore().selectName());
		return (weighting / 100) * score; 
      /* End Protected Region   [[52c3bb3b-3d08-11e5-871f-6beac6a7c24b]] */
    }

    @Override
    public java.lang.Double CalculateMaxScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IWeightingEvaluation weightingEvaluation) {
      /* Begin Protected Region [[da1f4d11-0547-11e6-adf9-af3c4dc80bc3]] */
		double weighting = weightingEvaluation.selectCriteria().extension(IWeightingCriteriaFunctions.class).GetWeighting();
		return (weighting / 100) * 5;   
      /* End Protected Region   [[da1f4d11-0547-11e6-adf9-af3c4dc80bc3]] */
    }

  }
  
  public static class WeightingEvaluationFunctions {

    private WeightingEvaluationFunctions() {}

    public static java.lang.Double CalculateScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IWeightingEvaluation weightingEvaluation) {
      return DynamicResourceUtil.invoke(IWeightingEvaluationFunctionsImpl.class, WeightingEvaluationFunctionsImpl.INSTANCE, weightingEvaluation).CalculateScore(weightingEvaluation);
    }

    public static java.lang.Double CalculateMaxScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IWeightingEvaluation weightingEvaluation) {
      return DynamicResourceUtil.invoke(IWeightingEvaluationFunctionsImpl.class, WeightingEvaluationFunctionsImpl.INSTANCE, weightingEvaluation).CalculateMaxScore(weightingEvaluation);
    }

  }

  public static interface IWeightingCriteriaAggregateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("417d9e46-a6f5-11e8-9c81-8bd68c62e435")
    public java.lang.Double GetWeighting();

    @IDynamicResourceExtension.MethodId("d5587f0b-202b-11e9-83b3-a16e26b4cc59")
    public List<cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.IAbstractCriteria> AllCriterials();

  }
  
  public static interface IWeightingCriteriaAggregateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("417d9e46-a6f5-11e8-9c81-8bd68c62e435")
    public java.lang.Double GetWeighting(final cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteriaAggregate weightingCriteriaAggregate);

  }
  
  public static class WeightingCriteriaAggregateFunctionsImpl implements IWeightingCriteriaAggregateFunctionsImpl {

    public static final IWeightingCriteriaAggregateFunctionsImpl INSTANCE = new WeightingCriteriaAggregateFunctionsImpl();

    private WeightingCriteriaAggregateFunctionsImpl() {}

    @Override
    public java.lang.Double GetWeighting(final cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteriaAggregate weightingCriteriaAggregate) {
      /* Begin Protected Region [[417d9e46-a6f5-11e8-9c81-8bd68c62e435]] */
        return weightingCriteriaAggregate.selectWeightingCriterias().stream().mapToDouble(x -> x.extension(IWeightingCriteriaFunctions.class).GetWeighting()).sum();
      /* End Protected Region   [[417d9e46-a6f5-11e8-9c81-8bd68c62e435]] */
    }

  }
  
  public static class WeightingCriteriaAggregateFunctions {

    private WeightingCriteriaAggregateFunctions() {}

    public static java.lang.Double GetWeighting(final cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteriaAggregate weightingCriteriaAggregate) {
      return DynamicResourceUtil.invoke(IWeightingCriteriaAggregateFunctionsImpl.class, WeightingCriteriaAggregateFunctionsImpl.INSTANCE, weightingCriteriaAggregate).GetWeighting(weightingCriteriaAggregate);
    }

  }

  public static interface IWeightingCriteriaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("56b0cd40-a780-11e8-8660-2f457072b676")
    public java.lang.Double GetWeighting();

    @IDynamicResourceExtension.MethodId("a5a526be-202a-11e9-83b3-a16e26b4cc59")
    public List<cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.IAbstractCriteria> AllCriterials();

  }
  
  public static interface IWeightingCriteriaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WeightingCriteriaFunctionsImpl implements IWeightingCriteriaFunctionsImpl {

    public static final IWeightingCriteriaFunctionsImpl INSTANCE = new WeightingCriteriaFunctionsImpl();

    private WeightingCriteriaFunctionsImpl() {}

  }
  
  public static class WeightingCriteriaFunctions {

    private WeightingCriteriaFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,345560d5-2025-11e9-83b3-a16e26b4cc59,744q2JA3ZcFPps5OGAl++x66mvM=] */
