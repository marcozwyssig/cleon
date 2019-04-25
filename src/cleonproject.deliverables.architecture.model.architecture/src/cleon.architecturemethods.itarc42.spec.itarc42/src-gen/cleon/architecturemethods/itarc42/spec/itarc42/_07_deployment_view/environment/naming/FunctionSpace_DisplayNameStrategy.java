package cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.naming;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[185c5ae6-11b1-11e9-9a7b-590a6369b499,imports]] */

/* End Protected Region   [[185c5ae6-11b1-11e9-9a7b-590a6369b499,imports]] */

public class FunctionSpace_DisplayNameStrategy {

  /* Begin Protected Region [[185c5ae6-11b1-11e9-9a7b-590a6369b499]] */
  
  /* End Protected Region   [[185c5ae6-11b1-11e9-9a7b-590a6369b499]] */


  public static interface IDisplayNameStrategyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("25933a80-11b1-11e9-9a7b-590a6369b499")
    public java.lang.String GetDisplayName(final cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode serviceBuildingNode);

    @IDynamicResourceExtension.MethodId("f3de4db5-2acf-11e9-a3f8-336d9e792e17")
    public java.lang.String GetDisplayName(final cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IExecutionEnvironmentBuildNode executionEnvironmentBuildNode);

    @IDynamicResourceExtension.MethodId("d4e957e8-2ed3-11e9-9ca2-d7354798e154")
    public java.lang.String OnlyName(final cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode serviceBuildingNode);

    @IDynamicResourceExtension.MethodId("da6f3989-2ed3-11e9-9ca2-d7354798e154")
    public java.lang.String OnlyName(final cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IExecutionEnvironmentBuildNode executionEnvironmentBuildNode);

  }
  
  public static interface IDisplayNameStrategyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DisplayNameStrategyFunctionsImpl implements IDisplayNameStrategyFunctionsImpl {

    public static final IDisplayNameStrategyFunctionsImpl INSTANCE = new DisplayNameStrategyFunctionsImpl();

    private DisplayNameStrategyFunctionsImpl() {}

  }
  
  public static class DisplayNameStrategyFunctions {

    private DisplayNameStrategyFunctions() {}

  }

  public static interface IBABSDisplayNameStrategyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("46c9e23a-11b1-11e9-9a7b-590a6369b499")
    public java.lang.String GetDisplayName(final cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode serviceBuildingNode);

    @IDynamicResourceExtension.MethodId("60312adf-2ed4-11e9-9ca2-d7354798e154")
    public java.lang.String OnlyName(final cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IServiceBuildNode serviceBuildingNode);

    @IDynamicResourceExtension.MethodId("49209dd5-2acc-11e9-a3f8-336d9e792e17")
    public java.lang.String GetDisplayName(final cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IExecutionEnvironmentBuildNode executionEnvironmentBuildNode);

    @IDynamicResourceExtension.MethodId("97600e73-2ed4-11e9-9ca2-d7354798e154")
    public java.lang.String OnlyName(final cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IExecutionEnvironmentBuildNode executionEnvironmentBuildNode);

  }
  
  public static interface IBABSDisplayNameStrategyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BABSDisplayNameStrategyFunctionsImpl implements IBABSDisplayNameStrategyFunctionsImpl {

    public static final IBABSDisplayNameStrategyFunctionsImpl INSTANCE = new BABSDisplayNameStrategyFunctionsImpl();

    private BABSDisplayNameStrategyFunctionsImpl() {}

  }
  
  public static class BABSDisplayNameStrategyFunctions {

    private BABSDisplayNameStrategyFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,185c5ae6-11b1-11e9-9a7b-590a6369b499,m7LCqbqqI5TIMdgPSZfX5pfQfnM=] */
