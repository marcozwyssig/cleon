package cleon.architecturemethods.eamod.metamodel.spec.chan.weighting;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c51aafe9-a6fc-11e8-9c81-8bd68c62e435,imports]] */
import cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingPriority;
import cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.FunctionSpace_Requirements.IAbstractRequirementFunctions;
import cleon.common.resources.metamodel.spec.priority.javamodel.IPriority;
/* End Protected Region   [[c51aafe9-a6fc-11e8-9c81-8bd68c62e435,imports]] */

public class FunctionSpace_EAMod_Weighting {

  /* Begin Protected Region [[c51aafe9-a6fc-11e8-9c81-8bd68c62e435]] */
  
  /* End Protected Region   [[c51aafe9-a6fc-11e8-9c81-8bd68c62e435]] */


  public static interface IWeightingRequirementManagementAggregateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a9c349b3-e0f4-11e8-8499-a3b0fb3cad90")
    public List<cleon.common.resources.metamodel.spec.priority.javamodel.IPriority> GetPriorities();

    @IDynamicResourceExtension.MethodId("dcf18da9-e0f4-11e8-8499-a3b0fb3cad90")
    public List<cleon.common.resources.metamodel.spec.priority.javamodel.IPriority> GetPrioritiesDistinct();

    @IDynamicResourceExtension.MethodId("83ce7028-14f8-11e9-ac43-5132797a057a")
    public java.lang.Integer GetRequirementSum();

    @IDynamicResourceExtension.MethodId("1b3ddfa8-14fa-11e9-ac43-5132797a057a")
    public java.lang.Double GetWeighting();

    @IDynamicResourceExtension.MethodId("c5cb0919-1582-11e9-888c-794d92ffc0c6")
    public java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementCriteria requirementCriteria);

    @IDynamicResourceExtension.MethodId("82998965-1583-11e9-888c-794d92ffc0c6")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementCriteria> GetAllRequirementCriterias();

  }
  
  public static interface IWeightingRequirementManagementAggregateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("83ce7028-14f8-11e9-ac43-5132797a057a")
    public java.lang.Integer GetRequirementSum(final cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementManagementAggregate weightingRequirementManagementAggregate);

    @IDynamicResourceExtension.MethodId("1b3ddfa8-14fa-11e9-ac43-5132797a057a")
    public java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementManagementAggregate weightingRequirementManagementAggregate);

    @IDynamicResourceExtension.MethodId("c5cb0919-1582-11e9-888c-794d92ffc0c6")
    public java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementCriteria requirementCriteria, final cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementManagementAggregate weightingRequirementManagementAggregate);

  }
  
  public static class WeightingRequirementManagementAggregateFunctionsImpl implements IWeightingRequirementManagementAggregateFunctionsImpl {

    public static final IWeightingRequirementManagementAggregateFunctionsImpl INSTANCE = new WeightingRequirementManagementAggregateFunctionsImpl();

    private WeightingRequirementManagementAggregateFunctionsImpl() {}

    @Override
    public java.lang.Integer GetRequirementSum(final cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementManagementAggregate weightingRequirementManagementAggregate) {
      /* Begin Protected Region [[83ce7028-14f8-11e9-ac43-5132797a057a]] */
    	return weightingRequirementManagementAggregate.selectSubjectAreaAggregate().values().stream().mapToInt(x -> x.extension(IWeightingSubjectAreaAggregateFunctions.class).GetRequirementCount()).sum();
      /* End Protected Region   [[83ce7028-14f8-11e9-ac43-5132797a057a]] */
    }

    @Override
    public java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementManagementAggregate weightingRequirementManagementAggregate) {
      /* Begin Protected Region [[1b3ddfa8-14fa-11e9-ac43-5132797a057a]] */
    	return weightingRequirementManagementAggregate.selectPriorityWeighting().values().stream().mapToDouble(x -> {
    		if( x != null)
    			return x.selectWeighting();
    		else
    			return 0;
    	}).sum();
      /* End Protected Region   [[1b3ddfa8-14fa-11e9-ac43-5132797a057a]] */
    }

    @Override
    public java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementCriteria requirementCriteria, final cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementManagementAggregate weightingRequirementManagementAggregate) {
      /* Begin Protected Region [[c5cb0919-1582-11e9-888c-794d92ffc0c6]] */
    	IPriority selectPriority = requirementCriteria.selectRequirement().extension(IAbstractRequirementFunctions.class).GetPriority();
		IWeightingPriority priorityWeighting = weightingRequirementManagementAggregate.selectPriorityWeighting().values().stream().filter(x -> x.selectPriority().selectNumber().equals(selectPriority.selectNumber())).findFirst().get();
		IWeightingRequirementManagementAggregateFunctions functions = weightingRequirementManagementAggregate.extension(IWeightingRequirementManagementAggregateFunctions.class);
		Long requirements = functions.GetAllRequirementCriterias().stream().filter( x -> x.selectRequirement().extension(IAbstractRequirementFunctions.class).GetPriority().equals(selectPriority)).count();
		return priorityWeighting.selectWeighting().doubleValue() / requirements.doubleValue();
      /* End Protected Region   [[c5cb0919-1582-11e9-888c-794d92ffc0c6]] */
    }

  }
  
  public static class WeightingRequirementManagementAggregateFunctions {

    private WeightingRequirementManagementAggregateFunctions() {}

    public static java.lang.Integer GetRequirementSum(final cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementManagementAggregate weightingRequirementManagementAggregate) {
      return DynamicResourceUtil.invoke(IWeightingRequirementManagementAggregateFunctionsImpl.class, WeightingRequirementManagementAggregateFunctionsImpl.INSTANCE, weightingRequirementManagementAggregate).GetRequirementSum(weightingRequirementManagementAggregate);
    }

    public static java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementManagementAggregate weightingRequirementManagementAggregate) {
      return DynamicResourceUtil.invoke(IWeightingRequirementManagementAggregateFunctionsImpl.class, WeightingRequirementManagementAggregateFunctionsImpl.INSTANCE, weightingRequirementManagementAggregate).GetWeighting(weightingRequirementManagementAggregate);
    }

    public static java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementCriteria requirementCriteria, final cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementManagementAggregate weightingRequirementManagementAggregate) {
      return DynamicResourceUtil.invoke(IWeightingRequirementManagementAggregateFunctionsImpl.class, WeightingRequirementManagementAggregateFunctionsImpl.INSTANCE, weightingRequirementManagementAggregate).GetWeighting(requirementCriteria, weightingRequirementManagementAggregate);
    }

  }

  public static interface IWeightingSubjectAreaAggregateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("020efbf1-a9d3-11e8-8fa3-5142962ae020")
    public java.lang.String GetDescription();

    @IDynamicResourceExtension.MethodId("b0ff5911-14f8-11e9-ac43-5132797a057a")
    public java.lang.Integer GetRequirementCount();

  }
  
  public static interface IWeightingSubjectAreaAggregateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WeightingSubjectAreaAggregateFunctionsImpl implements IWeightingSubjectAreaAggregateFunctionsImpl {

    public static final IWeightingSubjectAreaAggregateFunctionsImpl INSTANCE = new WeightingSubjectAreaAggregateFunctionsImpl();

    private WeightingSubjectAreaAggregateFunctionsImpl() {}

  }
  
  public static class WeightingSubjectAreaAggregateFunctions {

    private WeightingSubjectAreaAggregateFunctions() {}

  }

  public static interface IWeightingRequirementCriteriaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("87923632-a9d3-11e8-8fa3-5142962ae020")
    public java.lang.String GetDescription();

    @IDynamicResourceExtension.MethodId("eb7f44d0-a9d3-11e8-8fa3-5142962ae020")
    public java.lang.Double GetWeighting();

    @IDynamicResourceExtension.MethodId("ebf9d096-1582-11e9-888c-794d92ffc0c6")
    public cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementManagementAggregate GetRequirementManagement();

  }
  
  public static interface IWeightingRequirementCriteriaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("eb7f44d0-a9d3-11e8-8fa3-5142962ae020")
    public java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementCriteria weightingRequirementCriteria);

  }
  
  public static class WeightingRequirementCriteriaFunctionsImpl implements IWeightingRequirementCriteriaFunctionsImpl {

    public static final IWeightingRequirementCriteriaFunctionsImpl INSTANCE = new WeightingRequirementCriteriaFunctionsImpl();

    private WeightingRequirementCriteriaFunctionsImpl() {}

    @Override
    public java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementCriteria weightingRequirementCriteria) {
      /* Begin Protected Region [[eb7f44d0-a9d3-11e8-8fa3-5142962ae020]] */
    	return weightingRequirementCriteria.extension(IWeightingRequirementCriteriaFunctions.class).GetRequirementManagement().extension(IWeightingRequirementManagementAggregateFunctions.class).GetWeighting(weightingRequirementCriteria);
      /* End Protected Region   [[eb7f44d0-a9d3-11e8-8fa3-5142962ae020]] */
    }

  }
  
  public static class WeightingRequirementCriteriaFunctions {

    private WeightingRequirementCriteriaFunctions() {}

    public static java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingRequirementCriteria weightingRequirementCriteria) {
      return DynamicResourceUtil.invoke(IWeightingRequirementCriteriaFunctionsImpl.class, WeightingRequirementCriteriaFunctionsImpl.INSTANCE, weightingRequirementCriteria).GetWeighting(weightingRequirementCriteria);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c51aafe9-a6fc-11e8-9c81-8bd68c62e435,lpFEnLVBvRXC5MiirDSaQG+VFxU=] */
