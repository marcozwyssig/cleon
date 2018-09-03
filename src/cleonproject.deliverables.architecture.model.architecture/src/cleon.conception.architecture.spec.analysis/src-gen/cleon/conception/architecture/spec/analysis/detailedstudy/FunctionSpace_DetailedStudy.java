package cleon.conception.architecture.spec.analysis.detailedstudy;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c51aafe9-a6fc-11e8-9c81-8bd68c62e435,imports]] */
import cleon.conception.architecture.spec.analysis.detailedstudy.javamodel.IPriorityWeighting;
import cleon.conception.architecture.spec.analysis.detailedstudy.javamodel.IRequirementsAggregate;
import cleon.conception.architecture.spec.analysis.detailedstudy.javamodel.RequirementsAggregate;
import cleon.common.resources.spec.resources.priority.javamodel.IPriority;
/* End Protected Region   [[c51aafe9-a6fc-11e8-9c81-8bd68c62e435,imports]] */

public class FunctionSpace_DetailedStudy {

  /* Begin Protected Region [[c51aafe9-a6fc-11e8-9c81-8bd68c62e435]] */
  
  /* End Protected Region   [[c51aafe9-a6fc-11e8-9c81-8bd68c62e435]] */


  public static interface IRequirementsAggregateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d7a738b2-a6fc-11e8-9c81-8bd68c62e435")
    public java.lang.Integer GetWeighting();

    @IDynamicResourceExtension.MethodId("020efbf1-a9d3-11e8-8fa3-5142962ae020")
    public java.lang.String GetDescription();

  }
  
  public static interface IRequirementsAggregateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d7a738b2-a6fc-11e8-9c81-8bd68c62e435")
    public java.lang.Integer GetWeighting(final cleon.conception.architecture.spec.analysis.detailedstudy.javamodel.IRequirementsAggregate requirementsAggregate);

  }
  
  public static class RequirementsAggregateFunctionsImpl implements IRequirementsAggregateFunctionsImpl {

    public static final IRequirementsAggregateFunctionsImpl INSTANCE = new RequirementsAggregateFunctionsImpl();

    private RequirementsAggregateFunctionsImpl() {}

    @Override
    public java.lang.Integer GetWeighting(final cleon.conception.architecture.spec.analysis.detailedstudy.javamodel.IRequirementsAggregate requirementsAggregate) {
      /* Begin Protected Region [[d7a738b2-a6fc-11e8-9c81-8bd68c62e435]] */
    	return requirementsAggregate.selectPriorityWeighting().values().stream().mapToInt(x -> x.selectWeighting()).sum();
      /* End Protected Region   [[d7a738b2-a6fc-11e8-9c81-8bd68c62e435]] */
    }

  }
  
  public static class RequirementsAggregateFunctions {

    private RequirementsAggregateFunctions() {}

    public static java.lang.Integer GetWeighting(final cleon.conception.architecture.spec.analysis.detailedstudy.javamodel.IRequirementsAggregate requirementsAggregate) {
      return DynamicResourceUtil.invoke(IRequirementsAggregateFunctionsImpl.class, RequirementsAggregateFunctionsImpl.INSTANCE, requirementsAggregate).GetWeighting(requirementsAggregate);
    }

  }

  public static interface IRequirementCriteriaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("87923632-a9d3-11e8-8fa3-5142962ae020")
    public java.lang.String GetDescription();

    @IDynamicResourceExtension.MethodId("eb7f44d0-a9d3-11e8-8fa3-5142962ae020")
    public java.lang.Integer GetWeighting();

  }
  
  public static interface IRequirementCriteriaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("eb7f44d0-a9d3-11e8-8fa3-5142962ae020")
    public java.lang.Integer GetWeighting(final cleon.conception.architecture.spec.analysis.detailedstudy.javamodel.IRequirementCriteria requirementCriteria);

  }
  
  public static class RequirementCriteriaFunctionsImpl implements IRequirementCriteriaFunctionsImpl {

    public static final IRequirementCriteriaFunctionsImpl INSTANCE = new RequirementCriteriaFunctionsImpl();

    private RequirementCriteriaFunctionsImpl() {}

    @Override
    public java.lang.Integer GetWeighting(final cleon.conception.architecture.spec.analysis.detailedstudy.javamodel.IRequirementCriteria requirementCriteria) {
      /* Begin Protected Region [[eb7f44d0-a9d3-11e8-8fa3-5142962ae020]] */
       	IRequirementsAggregate aggregate = RequirementsAggregate.selectToMeRequirementCriterias(requirementCriteria);
    	IPriority selectPriority = requirementCriteria.selectRequirement().selectPriority();
		IPriorityWeighting priorityWeighting = aggregate.selectPriorityWeighting().values().stream().filter(x -> x.selectPriority().selectNumber().equals(selectPriority.selectNumber())).findFirst().get();
		Long requirements = aggregate.selectRequirementCriterias().values().stream().filter( x -> x.selectRequirement().selectPriority().equals(selectPriority)).count();
		return priorityWeighting.selectWeighting() / requirements.intValue();
      /* End Protected Region   [[eb7f44d0-a9d3-11e8-8fa3-5142962ae020]] */
    }

  }
  
  public static class RequirementCriteriaFunctions {

    private RequirementCriteriaFunctions() {}

    public static java.lang.Integer GetWeighting(final cleon.conception.architecture.spec.analysis.detailedstudy.javamodel.IRequirementCriteria requirementCriteria) {
      return DynamicResourceUtil.invoke(IRequirementCriteriaFunctionsImpl.class, RequirementCriteriaFunctionsImpl.INSTANCE, requirementCriteria).GetWeighting(requirementCriteria);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c51aafe9-a6fc-11e8-9c81-8bd68c62e435,tn0xSppRpT8oIjpJA9919Fp/sNE=] */
