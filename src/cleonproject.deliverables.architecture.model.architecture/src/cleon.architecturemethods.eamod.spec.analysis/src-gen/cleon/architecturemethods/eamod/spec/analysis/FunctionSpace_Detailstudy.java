package cleon.architecturemethods.eamod.spec.analysis;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c51aafe9-a6fc-11e8-9c81-8bd68c62e435,imports]] */
import cleon.architecturemethods.eamod.spec.analysis.javamodel.IPriorityWeighting;
import cleon.architecturemethods.eamod.spec.analysis.javamodel.ISubjectAreaAggregate;
import cleon.architecturemethods.eamod.spec.analysis.javamodel.SubjectAreaAggregate;
import cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.FunctionSpace_Requirements.IAbstractRequirementFunctions;
import cleon.common.resources.spec.resources.priority.javamodel.IPriority;
/* End Protected Region   [[c51aafe9-a6fc-11e8-9c81-8bd68c62e435,imports]] */

public class FunctionSpace_Detailstudy {

  /* Begin Protected Region [[c51aafe9-a6fc-11e8-9c81-8bd68c62e435]] */
  
  /* End Protected Region   [[c51aafe9-a6fc-11e8-9c81-8bd68c62e435]] */


  public static interface IRequirementManagementAggregateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a9c349b3-e0f4-11e8-8499-a3b0fb3cad90")
    public List<cleon.common.resources.spec.resources.priority.javamodel.IPriority> GetPriorities();

    @IDynamicResourceExtension.MethodId("dcf18da9-e0f4-11e8-8499-a3b0fb3cad90")
    public List<cleon.common.resources.spec.resources.priority.javamodel.IPriority> GetPrioritiesDistinct();

    @IDynamicResourceExtension.MethodId("83ce7028-14f8-11e9-ac43-5132797a057a")
    public java.lang.Integer GetRequirementSum();

    @IDynamicResourceExtension.MethodId("1b3ddfa8-14fa-11e9-ac43-5132797a057a")
    public java.lang.Double GetWeighting();

    @IDynamicResourceExtension.MethodId("c5cb0919-1582-11e9-888c-794d92ffc0c6")
    public java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria requirementCriteria);

    @IDynamicResourceExtension.MethodId("82998965-1583-11e9-888c-794d92ffc0c6")
    public List<cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria> GetAllRequirementCriterias();

  }
  
  public static interface IRequirementManagementAggregateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("83ce7028-14f8-11e9-ac43-5132797a057a")
    public java.lang.Integer GetRequirementSum(final cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementManagementAggregate requirementManagementAggregate);

    @IDynamicResourceExtension.MethodId("1b3ddfa8-14fa-11e9-ac43-5132797a057a")
    public java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementManagementAggregate requirementManagementAggregate);

    @IDynamicResourceExtension.MethodId("c5cb0919-1582-11e9-888c-794d92ffc0c6")
    public java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria requirementCriteria, final cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementManagementAggregate requirementManagementAggregate);

  }
  
  public static class RequirementManagementAggregateFunctionsImpl implements IRequirementManagementAggregateFunctionsImpl {

    public static final IRequirementManagementAggregateFunctionsImpl INSTANCE = new RequirementManagementAggregateFunctionsImpl();

    private RequirementManagementAggregateFunctionsImpl() {}

    @Override
    public java.lang.Integer GetRequirementSum(final cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementManagementAggregate requirementManagementAggregate) {
      /* Begin Protected Region [[83ce7028-14f8-11e9-ac43-5132797a057a]] */
    	return requirementManagementAggregate.selectSubjectAreaAggregate().values().stream().mapToInt(x -> x.extension(ISubjectAreaAggregateFunctions.class).GetRequirementCount()).sum();
      /* End Protected Region   [[83ce7028-14f8-11e9-ac43-5132797a057a]] */
    }

    @Override
    public java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementManagementAggregate requirementManagementAggregate) {
      /* Begin Protected Region [[1b3ddfa8-14fa-11e9-ac43-5132797a057a]] */
    	return requirementManagementAggregate.selectPriorityWeighting().values().stream().mapToDouble(x -> {
    		if( x != null)
    			return x.selectWeighting();
    		else
    			return 0;
    	}).sum();
      /* End Protected Region   [[1b3ddfa8-14fa-11e9-ac43-5132797a057a]] */
    }

    @Override
    public java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria requirementCriteria, final cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementManagementAggregate requirementManagementAggregate) {
      /* Begin Protected Region [[c5cb0919-1582-11e9-888c-794d92ffc0c6]] */
    	IPriority selectPriority = requirementCriteria.selectRequirement().extension(IAbstractRequirementFunctions.class).GetPriority();
		IPriorityWeighting priorityWeighting = requirementManagementAggregate.selectPriorityWeighting().values().stream().filter(x -> x.selectPriority().selectNumber().equals(selectPriority.selectNumber())).findFirst().get();
		IRequirementManagementAggregateFunctions functions = requirementManagementAggregate.extension(IRequirementManagementAggregateFunctions.class);
		Long requirements = functions.GetAllRequirementCriterias().stream().filter( x -> x.selectRequirement().extension(IAbstractRequirementFunctions.class).GetPriority().equals(selectPriority)).count();
		return priorityWeighting.selectWeighting().doubleValue() / requirements.doubleValue();
      /* End Protected Region   [[c5cb0919-1582-11e9-888c-794d92ffc0c6]] */
    }

  }
  
  public static class RequirementManagementAggregateFunctions {

    private RequirementManagementAggregateFunctions() {}

    public static java.lang.Integer GetRequirementSum(final cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementManagementAggregate requirementManagementAggregate) {
      return DynamicResourceUtil.invoke(IRequirementManagementAggregateFunctionsImpl.class, RequirementManagementAggregateFunctionsImpl.INSTANCE, requirementManagementAggregate).GetRequirementSum(requirementManagementAggregate);
    }

    public static java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementManagementAggregate requirementManagementAggregate) {
      return DynamicResourceUtil.invoke(IRequirementManagementAggregateFunctionsImpl.class, RequirementManagementAggregateFunctionsImpl.INSTANCE, requirementManagementAggregate).GetWeighting(requirementManagementAggregate);
    }

    public static java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria requirementCriteria, final cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementManagementAggregate requirementManagementAggregate) {
      return DynamicResourceUtil.invoke(IRequirementManagementAggregateFunctionsImpl.class, RequirementManagementAggregateFunctionsImpl.INSTANCE, requirementManagementAggregate).GetWeighting(requirementCriteria, requirementManagementAggregate);
    }

  }

  public static interface ISubjectAreaAggregateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("020efbf1-a9d3-11e8-8fa3-5142962ae020")
    public java.lang.String GetDescription();

    @IDynamicResourceExtension.MethodId("b0ff5911-14f8-11e9-ac43-5132797a057a")
    public java.lang.Integer GetRequirementCount();

  }
  
  public static interface ISubjectAreaAggregateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SubjectAreaAggregateFunctionsImpl implements ISubjectAreaAggregateFunctionsImpl {

    public static final ISubjectAreaAggregateFunctionsImpl INSTANCE = new SubjectAreaAggregateFunctionsImpl();

    private SubjectAreaAggregateFunctionsImpl() {}

  }
  
  public static class SubjectAreaAggregateFunctions {

    private SubjectAreaAggregateFunctions() {}

  }

  public static interface IRequirementCriteriaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("87923632-a9d3-11e8-8fa3-5142962ae020")
    public java.lang.String GetDescription();

    @IDynamicResourceExtension.MethodId("eb7f44d0-a9d3-11e8-8fa3-5142962ae020")
    public java.lang.Double GetWeighting();

    @IDynamicResourceExtension.MethodId("ebf9d096-1582-11e9-888c-794d92ffc0c6")
    public cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementManagementAggregate GetRequirementManagement();

  }
  
  public static interface IRequirementCriteriaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("eb7f44d0-a9d3-11e8-8fa3-5142962ae020")
    public java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria requirementCriteria);

  }
  
  public static class RequirementCriteriaFunctionsImpl implements IRequirementCriteriaFunctionsImpl {

    public static final IRequirementCriteriaFunctionsImpl INSTANCE = new RequirementCriteriaFunctionsImpl();

    private RequirementCriteriaFunctionsImpl() {}

    @Override
    public java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria requirementCriteria) {
      /* Begin Protected Region [[eb7f44d0-a9d3-11e8-8fa3-5142962ae020]] */
    	return requirementCriteria.extension(IRequirementCriteriaFunctions.class).GetRequirementManagement().extension(IRequirementManagementAggregateFunctions.class).GetWeighting(requirementCriteria);
      /* End Protected Region   [[eb7f44d0-a9d3-11e8-8fa3-5142962ae020]] */
    }

  }
  
  public static class RequirementCriteriaFunctions {

    private RequirementCriteriaFunctions() {}

    public static java.lang.Double GetWeighting(final cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria requirementCriteria) {
      return DynamicResourceUtil.invoke(IRequirementCriteriaFunctionsImpl.class, RequirementCriteriaFunctionsImpl.INSTANCE, requirementCriteria).GetWeighting(requirementCriteria);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c51aafe9-a6fc-11e8-9c81-8bd68c62e435,lgu2R2YhxZCsh+RYjYccCYG7F8k=] */
