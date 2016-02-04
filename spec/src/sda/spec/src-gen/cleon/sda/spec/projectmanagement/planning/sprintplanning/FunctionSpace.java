package cleon.sda.spec.projectmanagement.planning.sprintplanning;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5bd4d1da-c4ca-11e5-8558-4b8affb7767c,imports]] */

/* End Protected Region   [[5bd4d1da-c4ca-11e5-8558-4b8affb7767c,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[5bd4d1da-c4ca-11e5-8558-4b8affb7767c]] */
  
  /* End Protected Region   [[5bd4d1da-c4ca-11e5-8558-4b8affb7767c]] */


  public static interface ISprintBacklogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bedae007-c02b-11e5-b927-b1b055d0575f")
    public java.lang.Double SumEffort();

  }
  
  public static interface ISprintBacklogFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("bedae007-c02b-11e5-b927-b1b055d0575f")
    public java.lang.Double SumEffort(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintBacklog sprintBacklog);

  }
  
  public static class SprintBacklogFunctionsImpl implements ISprintBacklogFunctionsImpl {

    public static final ISprintBacklogFunctionsImpl INSTANCE = new SprintBacklogFunctionsImpl();

    private SprintBacklogFunctionsImpl() {}

    @Override
    public java.lang.Double SumEffort(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintBacklog sprintBacklog) {
      /* Begin Protected Region [[bedae007-c02b-11e5-b927-b1b055d0575f]] */
      return sprintBacklog.selectWorkItems().stream().filter(x -> x.selectEstimate() != null).mapToDouble(p -> Double.parseDouble(p.selectEstimate().selectName())).sum();   
      /* End Protected Region   [[bedae007-c02b-11e5-b927-b1b055d0575f]] */
    }

  }
  
  public static class SprintBacklogFunctions {

    private SprintBacklogFunctions() {}

    public static java.lang.Double SumEffort(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintBacklog sprintBacklog) {
      return DynamicResourceUtil.invoke(ISprintBacklogFunctionsImpl.class, SprintBacklogFunctionsImpl.INSTANCE, sprintBacklog).SumEffort(sprintBacklog);
    }

  }

  public static interface ISprintCapacityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("935a66c2-c02b-11e5-b927-b1b055d0575f")
    public java.lang.Integer SumBruttoCapacity();

    @IDynamicResourceExtension.MethodId("fb93c4d2-cb91-11e5-b911-69bd21f5af67")
    public java.lang.Integer SumNettoCapacity();

    @IDynamicResourceExtension.MethodId("3bb4378c-cb95-11e5-b911-69bd21f5af67")
    public java.lang.Double CalculatePace();

    @IDynamicResourceExtension.MethodId("6418a382-cb95-11e5-b911-69bd21f5af67")
    public java.lang.Integer SumEffort();

  }
  
  public static interface ISprintCapacityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("935a66c2-c02b-11e5-b927-b1b055d0575f")
    public java.lang.Integer SumBruttoCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity sprintCapacity);

    @IDynamicResourceExtension.MethodId("fb93c4d2-cb91-11e5-b911-69bd21f5af67")
    public java.lang.Integer SumNettoCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity sprintCapacity);

    @IDynamicResourceExtension.MethodId("3bb4378c-cb95-11e5-b911-69bd21f5af67")
    public java.lang.Double CalculatePace(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity sprintCapacity);

  }
  
  public static class SprintCapacityFunctionsImpl implements ISprintCapacityFunctionsImpl {

    public static final ISprintCapacityFunctionsImpl INSTANCE = new SprintCapacityFunctionsImpl();

    private SprintCapacityFunctionsImpl() {}

    @Override
    public java.lang.Integer SumBruttoCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
      /* Begin Protected Region [[935a66c2-c02b-11e5-b927-b1b055d0575f]] */
        return sprintCapacity.selectPersonCapacity().values().stream().mapToInt(p -> PersonCapacityFunctionsImpl.INSTANCE.SumBruttoCapacity(p)).sum();     
      /* End Protected Region   [[935a66c2-c02b-11e5-b927-b1b055d0575f]] */
    }

    @Override
    public java.lang.Integer SumNettoCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
      /* Begin Protected Region [[fb93c4d2-cb91-11e5-b911-69bd21f5af67]] */
    	return sprintCapacity.selectPersonCapacity().values().stream().mapToInt(p -> PersonCapacityFunctionsImpl.INSTANCE.SumNettoCapacity(p)).sum();   
      /* End Protected Region   [[fb93c4d2-cb91-11e5-b911-69bd21f5af67]] */
    }

    @Override
    public java.lang.Double CalculatePace(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
      /* Begin Protected Region [[3bb4378c-cb95-11e5-b911-69bd21f5af67]] */
    	cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintBacklog backlog = cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.SprintPlanning.selectToMeSprintCapacity(sprintCapacity).selectSprintBacklog();
    	double effort = SprintBacklogFunctionsImpl.INSTANCE.SumEffort(backlog);
    	return effort / SumNettoCapacity(sprintCapacity);
      /* End Protected Region   [[3bb4378c-cb95-11e5-b911-69bd21f5af67]] */
    }

  }
  
  public static class SprintCapacityFunctions {

    private SprintCapacityFunctions() {}

    public static java.lang.Integer SumBruttoCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
      return DynamicResourceUtil.invoke(ISprintCapacityFunctionsImpl.class, SprintCapacityFunctionsImpl.INSTANCE, sprintCapacity).SumBruttoCapacity(sprintCapacity);
    }

    public static java.lang.Integer SumNettoCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
      return DynamicResourceUtil.invoke(ISprintCapacityFunctionsImpl.class, SprintCapacityFunctionsImpl.INSTANCE, sprintCapacity).SumNettoCapacity(sprintCapacity);
    }

    public static java.lang.Double CalculatePace(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
      return DynamicResourceUtil.invoke(ISprintCapacityFunctionsImpl.class, SprintCapacityFunctionsImpl.INSTANCE, sprintCapacity).CalculatePace(sprintCapacity);
    }

  }

  public static interface IPersonCapacityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8f9bac0a-c4ca-11e5-8558-4b8affb7767c")
    public java.lang.Integer SumBruttoCapacity();

    @IDynamicResourceExtension.MethodId("5b617cb5-cb91-11e5-b911-69bd21f5af67")
    public java.lang.Integer SumNettoCapacity();

  }
  
  public static interface IPersonCapacityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8f9bac0a-c4ca-11e5-8558-4b8affb7767c")
    public java.lang.Integer SumBruttoCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.IPersonCapacity personCapacity);

    @IDynamicResourceExtension.MethodId("5b617cb5-cb91-11e5-b911-69bd21f5af67")
    public java.lang.Integer SumNettoCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.IPersonCapacity personCapacity);

  }
  
  public static class PersonCapacityFunctionsImpl implements IPersonCapacityFunctionsImpl {

    public static final IPersonCapacityFunctionsImpl INSTANCE = new PersonCapacityFunctionsImpl();

    private PersonCapacityFunctionsImpl() {}

    @Override
    public java.lang.Integer SumBruttoCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.IPersonCapacity personCapacity) {
      /* Begin Protected Region [[8f9bac0a-c4ca-11e5-8558-4b8affb7767c]] */
      return personCapacity.selectCapacityPerDay().values().stream().mapToInt(y -> y.selectCapacity()).sum();     
      /* End Protected Region   [[8f9bac0a-c4ca-11e5-8558-4b8affb7767c]] */
    }

    @Override
    public java.lang.Integer SumNettoCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.IPersonCapacity personCapacity) {
      /* Begin Protected Region [[5b617cb5-cb91-11e5-b911-69bd21f5af67]] */
    	java.lang.Integer sumCapacity = SumBruttoCapacity(personCapacity);
    	return (sumCapacity*personCapacity.selectProductivity())/100;
      /* End Protected Region   [[5b617cb5-cb91-11e5-b911-69bd21f5af67]] */
    }

  }
  
  public static class PersonCapacityFunctions {

    private PersonCapacityFunctions() {}

    public static java.lang.Integer SumBruttoCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.IPersonCapacity personCapacity) {
      return DynamicResourceUtil.invoke(IPersonCapacityFunctionsImpl.class, PersonCapacityFunctionsImpl.INSTANCE, personCapacity).SumBruttoCapacity(personCapacity);
    }

    public static java.lang.Integer SumNettoCapacity(final cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.IPersonCapacity personCapacity) {
      return DynamicResourceUtil.invoke(IPersonCapacityFunctionsImpl.class, PersonCapacityFunctionsImpl.INSTANCE, personCapacity).SumNettoCapacity(personCapacity);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5bd4d1da-c4ca-11e5-8558-4b8affb7767c,gDOXWzDrUPT256i8f3S/jRq0VGs=] */
