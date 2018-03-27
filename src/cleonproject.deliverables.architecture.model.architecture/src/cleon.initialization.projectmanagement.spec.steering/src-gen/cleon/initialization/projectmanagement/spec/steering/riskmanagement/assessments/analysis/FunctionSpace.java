package cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[416d5506-3252-11e6-ab4d-73a9260c8088,imports]] */

/* End Protected Region   [[416d5506-3252-11e6-ab4d-73a9260c8088,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[416d5506-3252-11e6-ab4d-73a9260c8088]] */
  
  /* End Protected Region   [[416d5506-3252-11e6-ab4d-73a9260c8088]] */


  public static interface IRiskAnalysisFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4ca64235-3252-11e6-ab4d-73a9260c8088")
    public java.lang.Integer CalculateScore();

    @IDynamicResourceExtension.MethodId("90cf4aa5-3252-11e6-ab4d-73a9260c8088")
    public java.lang.Boolean IsVeryHigh(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification);

    @IDynamicResourceExtension.MethodId("b99590b0-3253-11e6-ab4d-73a9260c8088")
    public java.lang.Boolean IsHigh(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification);

    @IDynamicResourceExtension.MethodId("bd790c81-3253-11e6-ab4d-73a9260c8088")
    public java.lang.Boolean IsMedium(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification);

    @IDynamicResourceExtension.MethodId("c19c9e92-3253-11e6-ab4d-73a9260c8088")
    public java.lang.Boolean IsLow(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification);

  }
  
  public static interface IRiskAnalysisFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4ca64235-3252-11e6-ab4d-73a9260c8088")
    public java.lang.Integer CalculateScore(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis riskAnalysis);

    @IDynamicResourceExtension.MethodId("90cf4aa5-3252-11e6-ab4d-73a9260c8088")
    public java.lang.Boolean IsVeryHigh(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification, final cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis riskAnalysis);

    @IDynamicResourceExtension.MethodId("b99590b0-3253-11e6-ab4d-73a9260c8088")
    public java.lang.Boolean IsHigh(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification, final cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis riskAnalysis);

    @IDynamicResourceExtension.MethodId("bd790c81-3253-11e6-ab4d-73a9260c8088")
    public java.lang.Boolean IsMedium(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification, final cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis riskAnalysis);

    @IDynamicResourceExtension.MethodId("c19c9e92-3253-11e6-ab4d-73a9260c8088")
    public java.lang.Boolean IsLow(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification, final cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis riskAnalysis);

  }
  
  public static class RiskAnalysisFunctionsImpl implements IRiskAnalysisFunctionsImpl {

    public static final IRiskAnalysisFunctionsImpl INSTANCE = new RiskAnalysisFunctionsImpl();

    private RiskAnalysisFunctionsImpl() {}

    @Override
    public java.lang.Integer CalculateScore(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis riskAnalysis) {
      /* Begin Protected Region [[4ca64235-3252-11e6-ab4d-73a9260c8088]] */
		int impactRate = Integer.parseInt(riskAnalysis.selectImpactRate().selectName());    
		int probability = Integer.parseInt(riskAnalysis.selectProbability().selectName());
		return impactRate * probability * (100/24);        
      /* End Protected Region   [[4ca64235-3252-11e6-ab4d-73a9260c8088]] */
    }

    @Override
    public java.lang.Boolean IsVeryHigh(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification, final cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis riskAnalysis) {
      /* Begin Protected Region [[90cf4aa5-3252-11e6-ab4d-73a9260c8088]] */
    	int score = CalculateScore(riskAnalysis);
    	return score > riskClassification.selectVeryHigh();    	
      /* End Protected Region   [[90cf4aa5-3252-11e6-ab4d-73a9260c8088]] */
    }

    @Override
    public java.lang.Boolean IsHigh(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification, final cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis riskAnalysis) {
      /* Begin Protected Region [[b99590b0-3253-11e6-ab4d-73a9260c8088]] */
    	int score = CalculateScore(riskAnalysis);
    	return score < riskClassification.selectVeryHigh() && score >= riskClassification.selectHigh();   
      /* End Protected Region   [[b99590b0-3253-11e6-ab4d-73a9260c8088]] */
    }

    @Override
    public java.lang.Boolean IsMedium(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification, final cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis riskAnalysis) {
      /* Begin Protected Region [[bd790c81-3253-11e6-ab4d-73a9260c8088]] */
    	int score = CalculateScore(riskAnalysis);
    	return score < riskClassification.selectHigh() && score >= riskClassification.selectMedium();
      /* End Protected Region   [[bd790c81-3253-11e6-ab4d-73a9260c8088]] */
    }

    @Override
    public java.lang.Boolean IsLow(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification, final cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis riskAnalysis) {
      /* Begin Protected Region [[c19c9e92-3253-11e6-ab4d-73a9260c8088]] */
    	int score = CalculateScore(riskAnalysis);
    	return score < riskClassification.selectMedium();     
      /* End Protected Region   [[c19c9e92-3253-11e6-ab4d-73a9260c8088]] */
    }

  }
  
  public static class RiskAnalysisFunctions {

    private RiskAnalysisFunctions() {}

    public static java.lang.Integer CalculateScore(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis riskAnalysis) {
      return DynamicResourceUtil.invoke(IRiskAnalysisFunctionsImpl.class, RiskAnalysisFunctionsImpl.INSTANCE, riskAnalysis).CalculateScore(riskAnalysis);
    }

    public static java.lang.Boolean IsVeryHigh(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification, final cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis riskAnalysis) {
      return DynamicResourceUtil.invoke(IRiskAnalysisFunctionsImpl.class, RiskAnalysisFunctionsImpl.INSTANCE, riskAnalysis).IsVeryHigh(riskClassification, riskAnalysis);
    }

    public static java.lang.Boolean IsHigh(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification, final cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis riskAnalysis) {
      return DynamicResourceUtil.invoke(IRiskAnalysisFunctionsImpl.class, RiskAnalysisFunctionsImpl.INSTANCE, riskAnalysis).IsHigh(riskClassification, riskAnalysis);
    }

    public static java.lang.Boolean IsMedium(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification, final cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis riskAnalysis) {
      return DynamicResourceUtil.invoke(IRiskAnalysisFunctionsImpl.class, RiskAnalysisFunctionsImpl.INSTANCE, riskAnalysis).IsMedium(riskClassification, riskAnalysis);
    }

    public static java.lang.Boolean IsLow(final cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification, final cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis riskAnalysis) {
      return DynamicResourceUtil.invoke(IRiskAnalysisFunctionsImpl.class, RiskAnalysisFunctionsImpl.INSTANCE, riskAnalysis).IsLow(riskClassification, riskAnalysis);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,416d5506-3252-11e6-ab4d-73a9260c8088,WN6iLLvTvrS8y15IArQulIau/sE=] */
