package cleon.projectmethods.hermes.spec.detailstudy;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[106e2f5e-a6e8-11e8-9c81-8bd68c62e435,imports]] */

/* End Protected Region   [[106e2f5e-a6e8-11e8-9c81-8bd68c62e435,imports]] */

public class FunctionSpace_Detailstudy {

  /* Begin Protected Region [[106e2f5e-a6e8-11e8-9c81-8bd68c62e435]] */
  
  /* End Protected Region   [[106e2f5e-a6e8-11e8-9c81-8bd68c62e435]] */


  public static interface ISolutionsEvaluationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4925332e-3d0a-11e5-871f-6beac6a7c24b")
    public java.lang.Double CalculateScore();

    @IDynamicResourceExtension.MethodId("981f3e73-0547-11e6-adf9-af3c4dc80bc3")
    public java.lang.Double CalculateRelativeScore();

  }
  
  public static interface ISolutionsEvaluationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4925332e-3d0a-11e5-871f-6beac6a7c24b")
    public java.lang.Double CalculateScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation);

    @IDynamicResourceExtension.MethodId("981f3e73-0547-11e6-adf9-af3c4dc80bc3")
    public java.lang.Double CalculateRelativeScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation);

  }
  
  public static class SolutionsEvaluationFunctionsImpl implements ISolutionsEvaluationFunctionsImpl {

    public static final ISolutionsEvaluationFunctionsImpl INSTANCE = new SolutionsEvaluationFunctionsImpl();

    private SolutionsEvaluationFunctionsImpl() {}

    @Override
    public java.lang.Double CalculateScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      /* Begin Protected Region [[4925332e-3d0a-11e5-871f-6beac6a7c24b]] */
      return solutionsEvaluation.selectEvaluation().values().stream().mapToDouble(p -> p.extension(IEvaluationFunctions.class).CalculateScore()).sum();
      /* End Protected Region   [[4925332e-3d0a-11e5-871f-6beac6a7c24b]] */
    }

    @Override
    public java.lang.Double CalculateRelativeScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      /* Begin Protected Region [[981f3e73-0547-11e6-adf9-af3c4dc80bc3]] */
       	double max = solutionsEvaluation.selectEvaluation().values().stream().mapToDouble(p -> p.extension(IEvaluationFunctions.class).CalculateMaxScore()).sum();
       	double actual = solutionsEvaluation.selectEvaluation().values().stream().mapToDouble(p -> p.extension(IEvaluationFunctions.class).CalculateScore()).sum();
       	return (actual * 100) / max;  
      /* End Protected Region   [[981f3e73-0547-11e6-adf9-af3c4dc80bc3]] */
    }

  }
  
  public static class SolutionsEvaluationFunctions {

    private SolutionsEvaluationFunctions() {}

    public static java.lang.Double CalculateScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      return DynamicResourceUtil.invoke(ISolutionsEvaluationFunctionsImpl.class, SolutionsEvaluationFunctionsImpl.INSTANCE, solutionsEvaluation).CalculateScore(solutionsEvaluation);
    }

    public static java.lang.Double CalculateRelativeScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      return DynamicResourceUtil.invoke(ISolutionsEvaluationFunctionsImpl.class, SolutionsEvaluationFunctionsImpl.INSTANCE, solutionsEvaluation).CalculateRelativeScore(solutionsEvaluation);
    }

  }

  public static interface IEvaluationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("52c3bb3b-3d08-11e5-871f-6beac6a7c24b")
    public java.lang.Double CalculateScore();

    @IDynamicResourceExtension.MethodId("da1f4d11-0547-11e6-adf9-af3c4dc80bc3")
    public java.lang.Double CalculateMaxScore();

  }
  
  public static interface IEvaluationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("52c3bb3b-3d08-11e5-871f-6beac6a7c24b")
    public java.lang.Double CalculateScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluation evaluation);

    @IDynamicResourceExtension.MethodId("da1f4d11-0547-11e6-adf9-af3c4dc80bc3")
    public java.lang.Double CalculateMaxScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluation evaluation);

  }
  
  public static class EvaluationFunctionsImpl implements IEvaluationFunctionsImpl {

    public static final IEvaluationFunctionsImpl INSTANCE = new EvaluationFunctionsImpl();

    private EvaluationFunctionsImpl() {}

    @Override
    public java.lang.Double CalculateScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluation evaluation) {
      /* Begin Protected Region [[52c3bb3b-3d08-11e5-871f-6beac6a7c24b]] */
		double weighting = evaluation.selectCriteria().extension(IAbstractCriteriaFunctions.class).GetWeighting();
		double score = Double.parseDouble(evaluation.selectScore().selectName());
		return (weighting / 100) * score; 
      /* End Protected Region   [[52c3bb3b-3d08-11e5-871f-6beac6a7c24b]] */
    }

    @Override
    public java.lang.Double CalculateMaxScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluation evaluation) {
      /* Begin Protected Region [[da1f4d11-0547-11e6-adf9-af3c4dc80bc3]] */
		double weighting = evaluation.selectCriteria().extension(IAbstractCriteriaFunctions.class).GetWeighting();
		return (weighting / 100) * 5;  
      /* End Protected Region   [[da1f4d11-0547-11e6-adf9-af3c4dc80bc3]] */
    }

  }
  
  public static class EvaluationFunctions {

    private EvaluationFunctions() {}

    public static java.lang.Double CalculateScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluation evaluation) {
      return DynamicResourceUtil.invoke(IEvaluationFunctionsImpl.class, EvaluationFunctionsImpl.INSTANCE, evaluation).CalculateScore(evaluation);
    }

    public static java.lang.Double CalculateMaxScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluation evaluation) {
      return DynamicResourceUtil.invoke(IEvaluationFunctionsImpl.class, EvaluationFunctionsImpl.INSTANCE, evaluation).CalculateMaxScore(evaluation);
    }

  }

  public static interface ICriteriaAggregateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("417d9e46-a6f5-11e8-9c81-8bd68c62e435")
    public java.lang.Double GetWeighting();

    @IDynamicResourceExtension.MethodId("2ea10c6a-a6e8-11e8-9c81-8bd68c62e435")
    public List<cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.IAbstractCriteria> AllCriterials();

  }
  
  public static interface ICriteriaAggregateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("417d9e46-a6f5-11e8-9c81-8bd68c62e435")
    public java.lang.Double GetWeighting(final cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.ICriteriaAggregate criteriaAggregate);

  }
  
  public static class CriteriaAggregateFunctionsImpl implements ICriteriaAggregateFunctionsImpl {

    public static final ICriteriaAggregateFunctionsImpl INSTANCE = new CriteriaAggregateFunctionsImpl();

    private CriteriaAggregateFunctionsImpl() {}

    @Override
    public java.lang.Double GetWeighting(final cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.ICriteriaAggregate criteriaAggregate) {
      /* Begin Protected Region [[417d9e46-a6f5-11e8-9c81-8bd68c62e435]] */
      return criteriaAggregate.selectCriterias().stream().mapToDouble(x -> x.extension(IAbstractCriteriaFunctions.class).GetWeighting()).sum();
      /* End Protected Region   [[417d9e46-a6f5-11e8-9c81-8bd68c62e435]] */
    }

  }
  
  public static class CriteriaAggregateFunctions {

    private CriteriaAggregateFunctions() {}

    public static java.lang.Double GetWeighting(final cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.ICriteriaAggregate criteriaAggregate) {
      return DynamicResourceUtil.invoke(ICriteriaAggregateFunctionsImpl.class, CriteriaAggregateFunctionsImpl.INSTANCE, criteriaAggregate).GetWeighting(criteriaAggregate);
    }

  }

  public static interface ICriteriaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("133ae757-a780-11e8-8660-2f457072b676")
    public List<cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.IAbstractCriteria> AllCriterials();

  }
  
  public static interface ICriteriaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CriteriaFunctionsImpl implements ICriteriaFunctionsImpl {

    public static final ICriteriaFunctionsImpl INSTANCE = new CriteriaFunctionsImpl();

    private CriteriaFunctionsImpl() {}

  }
  
  public static class CriteriaFunctions {

    private CriteriaFunctions() {}

  }

  public static interface IAbstractCriteriaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("eb9c8a85-a77f-11e8-8660-2f457072b676")
    public List<cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.IAbstractCriteria> AllCriterials();

    @IDynamicResourceExtension.MethodId("56b0cd40-a780-11e8-8660-2f457072b676")
    public java.lang.Double GetWeighting();

    @IDynamicResourceExtension.MethodId("5029b3dc-a781-11e8-8660-2f457072b676")
    public java.lang.String GetDescription();

  }
  
  public static interface IAbstractCriteriaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractCriteriaFunctionsImpl implements IAbstractCriteriaFunctionsImpl {

    public static final IAbstractCriteriaFunctionsImpl INSTANCE = new AbstractCriteriaFunctionsImpl();

    private AbstractCriteriaFunctionsImpl() {}

  }
  
  public static class AbstractCriteriaFunctions {

    private AbstractCriteriaFunctions() {}

  }

  public static interface INamedCriteriaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("56f33e35-a6f5-11e8-9c81-8bd68c62e435")
    public java.lang.Double GetWeighting();

    @IDynamicResourceExtension.MethodId("fe95627a-a782-11e8-8660-2f457072b676")
    public java.lang.String GetDescription();

  }
  
  public static interface INamedCriteriaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedCriteriaFunctionsImpl implements INamedCriteriaFunctionsImpl {

    public static final INamedCriteriaFunctionsImpl INSTANCE = new NamedCriteriaFunctionsImpl();

    private NamedCriteriaFunctionsImpl() {}

  }
  
  public static class NamedCriteriaFunctions {

    private NamedCriteriaFunctions() {}

  }

  public static interface INamedCriteriaAggregateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1080f0ed-a783-11e8-8660-2f457072b676")
    public java.lang.String GetDescription();

  }
  
  public static interface INamedCriteriaAggregateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedCriteriaAggregateFunctionsImpl implements INamedCriteriaAggregateFunctionsImpl {

    public static final INamedCriteriaAggregateFunctionsImpl INSTANCE = new NamedCriteriaAggregateFunctionsImpl();

    private NamedCriteriaAggregateFunctionsImpl() {}

  }
  
  public static class NamedCriteriaAggregateFunctions {

    private NamedCriteriaAggregateFunctions() {}

  }

  public static interface IDetailstudyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5ab3c7c5-13e9-11e9-a836-9d144e5bc2a5")
    public List<cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> ChapterOrder();

  }
  
  public static interface IDetailstudyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DetailstudyFunctionsImpl implements IDetailstudyFunctionsImpl {

    public static final IDetailstudyFunctionsImpl INSTANCE = new DetailstudyFunctionsImpl();

    private DetailstudyFunctionsImpl() {}

  }
  
  public static class DetailstudyFunctions {

    private DetailstudyFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,106e2f5e-a6e8-11e8-9c81-8bd68c62e435,LkMBGaa9dJxFWIPU2uB2Qhc3G9E=] */
