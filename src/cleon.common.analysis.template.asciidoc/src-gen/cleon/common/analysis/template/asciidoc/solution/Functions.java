package cleon.common.analysis.template.asciidoc.solution;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[de8668e7-3c32-11e5-9962-cf3035adb922,imports]] */

/* End Protected Region   [[de8668e7-3c32-11e5-9962-cf3035adb922,imports]] */

public class Functions {

  /* Begin Protected Region [[de8668e7-3c32-11e5-9962-cf3035adb922]] */
  
  /* End Protected Region   [[de8668e7-3c32-11e5-9962-cf3035adb922]] */


  public static interface IGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bccc26cd-3cf8-11e5-871f-6beac6a7c24b")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface IGoalsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GoalsFunctionsImpl implements IGoalsFunctionsImpl {

    public static final IGoalsFunctionsImpl INSTANCE = new GoalsFunctionsImpl();

    private GoalsFunctionsImpl() {}

  }
  
  public static class GoalsFunctions {

    private GoalsFunctions() {}

  }

  public static interface ISolutionsEvaluationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4925332e-3d0a-11e5-871f-6beac6a7c24b")
    public java.lang.Double CalculateScore();

    @IDynamicResourceExtension.MethodId("839e0d4a-3c33-11e5-9962-cf3035adb922")
    public java.lang.String RenderChapterContent();

    @IDynamicResourceExtension.MethodId("981f3e73-0547-11e6-adf9-af3c4dc80bc3")
    public java.lang.Double CalculateRelativeScore();

  }
  
  public static interface ISolutionsEvaluationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4925332e-3d0a-11e5-871f-6beac6a7c24b")
    public java.lang.Double CalculateScore(final cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation);

    @IDynamicResourceExtension.MethodId("981f3e73-0547-11e6-adf9-af3c4dc80bc3")
    public java.lang.Double CalculateRelativeScore(final cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation);

  }
  
  public static class SolutionsEvaluationFunctionsImpl implements ISolutionsEvaluationFunctionsImpl {

    public static final ISolutionsEvaluationFunctionsImpl INSTANCE = new SolutionsEvaluationFunctionsImpl();

    private SolutionsEvaluationFunctionsImpl() {}

    @Override
    public java.lang.Double CalculateScore(final cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      /* Begin Protected Region [[4925332e-3d0a-11e5-871f-6beac6a7c24b]] */
    	return solutionsEvaluation.selectEvaluation().values().stream().mapToDouble(p -> EvaluationFunctionsImpl.INSTANCE.CalculateScore(p)).sum();
      /* End Protected Region   [[4925332e-3d0a-11e5-871f-6beac6a7c24b]] */
    }

    @Override
    public java.lang.Double CalculateRelativeScore(final cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      /* Begin Protected Region [[981f3e73-0547-11e6-adf9-af3c4dc80bc3]] */
       	double max = solutionsEvaluation.selectEvaluation().values().stream().mapToDouble(p -> EvaluationFunctionsImpl.INSTANCE.CalculateMaxScore(p)).sum();
       	double actual = solutionsEvaluation.selectEvaluation().values().stream().mapToDouble(p -> EvaluationFunctionsImpl.INSTANCE.CalculateScore(p)).sum();
       	return (actual * 100) / max;
      /* End Protected Region   [[981f3e73-0547-11e6-adf9-af3c4dc80bc3]] */
    }

  }
  
  public static class SolutionsEvaluationFunctions {

    private SolutionsEvaluationFunctions() {}

    public static java.lang.Double CalculateScore(final cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      return DynamicResourceUtil.invoke(ISolutionsEvaluationFunctionsImpl.class, SolutionsEvaluationFunctionsImpl.INSTANCE, solutionsEvaluation).CalculateScore(solutionsEvaluation);
    }

    public static java.lang.Double CalculateRelativeScore(final cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      return DynamicResourceUtil.invoke(ISolutionsEvaluationFunctionsImpl.class, SolutionsEvaluationFunctionsImpl.INSTANCE, solutionsEvaluation).CalculateRelativeScore(solutionsEvaluation);
    }

  }

  public static interface IBestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fe83bf61-3d16-11e5-871f-6beac6a7c24b")
    public java.lang.String RenderContent();

  }
  
  public static interface IBestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BestFunctionsImpl implements IBestFunctionsImpl {

    public static final IBestFunctionsImpl INSTANCE = new BestFunctionsImpl();

    private BestFunctionsImpl() {}

  }
  
  public static class BestFunctions {

    private BestFunctions() {}

  }

  public static interface IEvaluationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("52c3bb3b-3d08-11e5-871f-6beac6a7c24b")
    public java.lang.Double CalculateScore();

    @IDynamicResourceExtension.MethodId("da1f4d11-0547-11e6-adf9-af3c4dc80bc3")
    public java.lang.Double CalculateMaxScore();

  }
  
  public static interface IEvaluationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("52c3bb3b-3d08-11e5-871f-6beac6a7c24b")
    public java.lang.Double CalculateScore(final cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IEvaluation evaluation);

    @IDynamicResourceExtension.MethodId("da1f4d11-0547-11e6-adf9-af3c4dc80bc3")
    public java.lang.Double CalculateMaxScore(final cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IEvaluation evaluation);

  }
  
  public static class EvaluationFunctionsImpl implements IEvaluationFunctionsImpl {

    public static final IEvaluationFunctionsImpl INSTANCE = new EvaluationFunctionsImpl();

    private EvaluationFunctionsImpl() {}

    @Override
    public java.lang.Double CalculateScore(final cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IEvaluation evaluation) {
      /* Begin Protected Region [[52c3bb3b-3d08-11e5-871f-6beac6a7c24b]] */
		double weighting = evaluation.selectGoal().selectWeighting();
		double score = Double.parseDouble(evaluation.selectScore().selectName());
		return (weighting / 100) * score; 
      /* End Protected Region   [[52c3bb3b-3d08-11e5-871f-6beac6a7c24b]] */
    }

    @Override
    public java.lang.Double CalculateMaxScore(final cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IEvaluation evaluation) {
      /* Begin Protected Region [[da1f4d11-0547-11e6-adf9-af3c4dc80bc3]] */
		double weighting = evaluation.selectGoal().selectWeighting();
		return (weighting / 100) * 5;  
      /* End Protected Region   [[da1f4d11-0547-11e6-adf9-af3c4dc80bc3]] */
    }

  }
  
  public static class EvaluationFunctions {

    private EvaluationFunctions() {}

    public static java.lang.Double CalculateScore(final cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IEvaluation evaluation) {
      return DynamicResourceUtil.invoke(IEvaluationFunctionsImpl.class, EvaluationFunctionsImpl.INSTANCE, evaluation).CalculateScore(evaluation);
    }

    public static java.lang.Double CalculateMaxScore(final cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IEvaluation evaluation) {
      return DynamicResourceUtil.invoke(IEvaluationFunctionsImpl.class, EvaluationFunctionsImpl.INSTANCE, evaluation).CalculateMaxScore(evaluation);
    }

  }

  public static interface IAnalysisDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1f166999-c02a-11e5-b927-b1b055d0575f")
    public java.lang.String GetDocumentPath();

    @IDynamicResourceExtension.MethodId("bb29c102-024a-11e6-9b87-a94a5128b9df")
    public java.lang.String GetContext();

  }
  
  public static interface IAnalysisDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AnalysisDocumentFunctionsImpl implements IAnalysisDocumentFunctionsImpl {

    public static final IAnalysisDocumentFunctionsImpl INSTANCE = new AnalysisDocumentFunctionsImpl();

    private AnalysisDocumentFunctionsImpl() {}

  }
  
  public static class AnalysisDocumentFunctions {

    private AnalysisDocumentFunctions() {}

  }

  public static interface IDriversFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("dce32dac-024a-11e6-9b87-a94a5128b9df")
    public java.lang.String GetContext();

  }
  
  public static interface IDriversFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DriversFunctionsImpl implements IDriversFunctionsImpl {

    public static final IDriversFunctionsImpl INSTANCE = new DriversFunctionsImpl();

    private DriversFunctionsImpl() {}

  }
  
  public static class DriversFunctions {

    private DriversFunctions() {}

  }

  public static interface ISolutionAnalysisFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ed1a067b-024a-11e6-9b87-a94a5128b9df")
    public java.lang.String GetContext();

  }
  
  public static interface ISolutionAnalysisFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SolutionAnalysisFunctionsImpl implements ISolutionAnalysisFunctionsImpl {

    public static final ISolutionAnalysisFunctionsImpl INSTANCE = new SolutionAnalysisFunctionsImpl();

    private SolutionAnalysisFunctionsImpl() {}

  }
  
  public static class SolutionAnalysisFunctions {

    private SolutionAnalysisFunctions() {}

  }

  public static interface IEvaluationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1c91aafc-024b-11e6-9b87-a94a5128b9df")
    public java.lang.String GetContext();

    @IDynamicResourceExtension.MethodId("c469cb47-0557-11e6-adf9-af3c4dc80bc3")
    public java.lang.String RenderDocumentContent();

  }
  
  public static interface IEvaluationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EvaluationsFunctionsImpl implements IEvaluationsFunctionsImpl {

    public static final IEvaluationsFunctionsImpl INSTANCE = new EvaluationsFunctionsImpl();

    private EvaluationsFunctionsImpl() {}

  }
  
  public static class EvaluationsFunctions {

    private EvaluationsFunctions() {}

  }

  public static interface ISolutionsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2201451b-024b-11e6-9b87-a94a5128b9df")
    public java.lang.String GetContext();

  }
  
  public static interface ISolutionsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SolutionsFunctionsImpl implements ISolutionsFunctionsImpl {

    public static final ISolutionsFunctionsImpl INSTANCE = new SolutionsFunctionsImpl();

    private SolutionsFunctionsImpl() {}

  }
  
  public static class SolutionsFunctions {

    private SolutionsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,de8668e7-3c32-11e5-9962-cf3035adb922,TZdxLN5+Bl6hinrUuQQtySsGCJg=] */
