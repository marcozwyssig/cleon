package cleon.projectmethods.hermes.spec.detailstudy;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[106e2f5e-a6e8-11e8-9c81-8bd68c62e435,imports]] */
import cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.FunctionSpace_Weighting.IWeightingEvaluationFunctions;
/* End Protected Region   [[106e2f5e-a6e8-11e8-9c81-8bd68c62e435,imports]] */

public class FunctionSpace_Detailstudy {

  /* Begin Protected Region [[106e2f5e-a6e8-11e8-9c81-8bd68c62e435]] */
  
  /* End Protected Region   [[106e2f5e-a6e8-11e8-9c81-8bd68c62e435]] */


  public static interface ISolutionsEvaluationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4925332e-3d0a-11e5-871f-6beac6a7c24b")
    public java.lang.Double CalculateScore();

    @IDynamicResourceExtension.MethodId("981f3e73-0547-11e6-adf9-af3c4dc80bc3")
    public java.lang.Double CalculateRelativeScore();

    @IDynamicResourceExtension.MethodId("dd4a48c8-13fc-11e9-a836-9d144e5bc2a5")
    public java.lang.Double CalculateMaxScore();

    @IDynamicResourceExtension.MethodId("7764184a-2033-11e9-83b3-a16e26b4cc59")
    public java.lang.Long CalculateAllFullfills();

    @IDynamicResourceExtension.MethodId("19b2b091-2034-11e9-83b3-a16e26b4cc59")
    public java.lang.Boolean CalculateIslFullfilled();

  }
  
  public static interface ISolutionsEvaluationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4925332e-3d0a-11e5-871f-6beac6a7c24b")
    public java.lang.Double CalculateScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation);

    @IDynamicResourceExtension.MethodId("981f3e73-0547-11e6-adf9-af3c4dc80bc3")
    public java.lang.Double CalculateRelativeScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation);

    @IDynamicResourceExtension.MethodId("dd4a48c8-13fc-11e9-a836-9d144e5bc2a5")
    public java.lang.Double CalculateMaxScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation);

    @IDynamicResourceExtension.MethodId("7764184a-2033-11e9-83b3-a16e26b4cc59")
    public java.lang.Long CalculateAllFullfills(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation);

    @IDynamicResourceExtension.MethodId("19b2b091-2034-11e9-83b3-a16e26b4cc59")
    public java.lang.Boolean CalculateIslFullfilled(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation);

  }
  
  public static class SolutionsEvaluationFunctionsImpl implements ISolutionsEvaluationFunctionsImpl {

    public static final ISolutionsEvaluationFunctionsImpl INSTANCE = new SolutionsEvaluationFunctionsImpl();

    private SolutionsEvaluationFunctionsImpl() {}

    @Override
    public java.lang.Double CalculateScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      /* Begin Protected Region [[4925332e-3d0a-11e5-871f-6beac6a7c24b]] */
      return solutionsEvaluation.selectWeightingEvaluation().values().stream().mapToDouble(p -> p.extension(IWeightingEvaluationFunctions.class).CalculateScore()).sum();
      /* End Protected Region   [[4925332e-3d0a-11e5-871f-6beac6a7c24b]] */
    }

    @Override
    public java.lang.Double CalculateRelativeScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      /* Begin Protected Region [[981f3e73-0547-11e6-adf9-af3c4dc80bc3]] */
       	double max = solutionsEvaluation.selectWeightingEvaluation().values().stream().mapToDouble(p -> p.extension(IWeightingEvaluationFunctions.class).CalculateMaxScore()).sum();
       	double actual = solutionsEvaluation.selectWeightingEvaluation().values().stream().mapToDouble(p -> p.extension(IWeightingEvaluationFunctions.class).CalculateScore()).sum();
       	return (actual * 100) / max;  
      /* End Protected Region   [[981f3e73-0547-11e6-adf9-af3c4dc80bc3]] */
    }

    @Override
    public java.lang.Double CalculateMaxScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      /* Begin Protected Region [[dd4a48c8-13fc-11e9-a836-9d144e5bc2a5]] */
        return solutionsEvaluation.selectWeightingEvaluation().values().stream().mapToDouble(p -> p.extension(IWeightingEvaluationFunctions.class).CalculateMaxScore()).sum();
      /* End Protected Region   [[dd4a48c8-13fc-11e9-a836-9d144e5bc2a5]] */
    }

    @Override
    public java.lang.Long CalculateAllFullfills(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      /* Begin Protected Region [[7764184a-2033-11e9-83b3-a16e26b4cc59]] */
      return solutionsEvaluation.selectKnockoutEvaluation().values().stream().filter(x -> x.selectFulfiils()).count();
      /* End Protected Region   [[7764184a-2033-11e9-83b3-a16e26b4cc59]] */
    }

    @Override
    public java.lang.Boolean CalculateIslFullfilled(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      /* Begin Protected Region [[19b2b091-2034-11e9-83b3-a16e26b4cc59]] */
        return solutionsEvaluation.selectKnockoutEvaluation().values().stream().allMatch(x -> x.selectFulfiils());
      /* End Protected Region   [[19b2b091-2034-11e9-83b3-a16e26b4cc59]] */
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

    public static java.lang.Double CalculateMaxScore(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      return DynamicResourceUtil.invoke(ISolutionsEvaluationFunctionsImpl.class, SolutionsEvaluationFunctionsImpl.INSTANCE, solutionsEvaluation).CalculateMaxScore(solutionsEvaluation);
    }

    public static java.lang.Long CalculateAllFullfills(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      return DynamicResourceUtil.invoke(ISolutionsEvaluationFunctionsImpl.class, SolutionsEvaluationFunctionsImpl.INSTANCE, solutionsEvaluation).CalculateAllFullfills(solutionsEvaluation);
    }

    public static java.lang.Boolean CalculateIslFullfilled(final cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      return DynamicResourceUtil.invoke(ISolutionsEvaluationFunctionsImpl.class, SolutionsEvaluationFunctionsImpl.INSTANCE, solutionsEvaluation).CalculateIslFullfilled(solutionsEvaluation);
    }

  }

  public static interface IAbstractCriteriaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("eb9c8a85-a77f-11e8-8660-2f457072b676")
    public List<cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.IAbstractCriteria> AllCriterials();

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

  public static interface IAbstractNamedCriteriaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fe95627a-a782-11e8-8660-2f457072b676")
    public java.lang.String GetDescription();

  }
  
  public static interface IAbstractNamedCriteriaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractNamedCriteriaFunctionsImpl implements IAbstractNamedCriteriaFunctionsImpl {

    public static final IAbstractNamedCriteriaFunctionsImpl INSTANCE = new AbstractNamedCriteriaFunctionsImpl();

    private AbstractNamedCriteriaFunctionsImpl() {}

  }
  
  public static class AbstractNamedCriteriaFunctions {

    private AbstractNamedCriteriaFunctions() {}

  }

  public static interface IDriversFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cb605dad-2030-11e9-83b3-a16e26b4cc59")
    public List<cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> ChapterOrder();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,106e2f5e-a6e8-11e8-9c81-8bd68c62e435,NwLXBnCly+bWgTNdz2M/DG29+DY=] */
