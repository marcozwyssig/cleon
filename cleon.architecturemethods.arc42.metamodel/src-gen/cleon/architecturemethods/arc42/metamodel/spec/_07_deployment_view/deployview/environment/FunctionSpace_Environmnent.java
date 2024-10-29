package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[bb871dfc-02d3-11e9-9e58-33d596257b14,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.SystemEnvironmentNode;
/* End Protected Region   [[bb871dfc-02d3-11e9-9e58-33d596257b14,imports]] */

public class FunctionSpace_Environmnent {

  /* Begin Protected Region [[bb871dfc-02d3-11e9-9e58-33d596257b14]] */

  /* End Protected Region   [[bb871dfc-02d3-11e9-9e58-33d596257b14]] */


  public static interface ISystemEnvironmentNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d26206d3-0aa2-11e9-8a91-633e556ac68f")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("ebae8f76-2aba-11e9-a3f8-336d9e792e17")
    public java.lang.Boolean IsSupplied();

    @IDynamicResourceExtension.MethodId("c927eb2b-2abe-11e9-a3f8-336d9e792e17")
    public java.lang.String GetMaterialTypeName();

    @IDynamicResourceExtension.MethodId("94fce6cd-2ed3-11e9-9ca2-d7354798e154")
    public java.lang.String OnlyName();

    @IDynamicResourceExtension.MethodId("7cd01e99-b08e-11ea-b791-9b401fd02359")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode> Related();

  }
  
  public static interface ISystemEnvironmentNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("ebae8f76-2aba-11e9-a3f8-336d9e792e17")
    public java.lang.Boolean IsSupplied(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode);

  }
  
  public static class SystemEnvironmentNodeFunctionsImpl implements ISystemEnvironmentNodeFunctionsImpl {

    public static final ISystemEnvironmentNodeFunctionsImpl INSTANCE = new SystemEnvironmentNodeFunctionsImpl();

    private SystemEnvironmentNodeFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsSupplied(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      return true;
    }

  }
  
  public static class SystemEnvironmentNodeFunctions {

    private SystemEnvironmentNodeFunctions() {}

    public static java.lang.Boolean IsSupplied(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      return DynamicResourceUtil.invoke(ISystemEnvironmentNodeFunctionsImpl.class, SystemEnvironmentNodeFunctionsImpl.INSTANCE, systemEnvironmentNode).IsSupplied(systemEnvironmentNode);
    }

  }

  public static interface IDeploymentLevelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c21927d9-0b6d-11e9-a136-69d076e48ed1")
    public java.lang.String GetLevelNr();

  }
  
  public static interface IDeploymentLevelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("c21927d9-0b6d-11e9-a136-69d076e48ed1")
    public java.lang.String GetLevelNr(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.IDeploymentLevel deploymentLevel);

  }
  
  public static class DeploymentLevelFunctionsImpl implements IDeploymentLevelFunctionsImpl {

    public static final IDeploymentLevelFunctionsImpl INSTANCE = new DeploymentLevelFunctionsImpl();

    private DeploymentLevelFunctionsImpl() {}

    @Override
    public java.lang.String GetLevelNr(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.IDeploymentLevel deploymentLevel) {
      /* Begin Protected Region [[c21927d9-0b6d-11e9-a136-69d076e48ed1]] */
      if( deploymentLevel == null) {
      	return "";
      }

      if( SystemEnvironmentNode.selectToMeLevel_1(deploymentLevel) != null) {
      	return "1";
      }

      if( SystemEnvironmentNode.selectToMeLevel_2(deploymentLevel) != null) {
      	return "2";
      }

      if( SystemEnvironmentNode.selectToMeLevel_3(deploymentLevel) != null) {
      	return "3";
      }

      if( SystemEnvironmentNode.selectToMeLevel_4(deploymentLevel) != null) {
      	return "4";
      }

      if( SystemEnvironmentNode.selectToMeLevel_5(deploymentLevel) != null) {
      	return "5";
      }

      if( SystemEnvironmentNode.selectToMeLevel_6(deploymentLevel) != null) {
      	return "6";
      }

      if( SystemEnvironmentNode.selectToMeLevel_7(deploymentLevel) != null) {
      	return "7";
      }

      if( SystemEnvironmentNode.selectToMeLevel_8(deploymentLevel) != null) {
      	return "8";
      }

      return "";

      /* End Protected Region   [[c21927d9-0b6d-11e9-a136-69d076e48ed1]] */
    }

  }
  
  public static class DeploymentLevelFunctions {

    private DeploymentLevelFunctions() {}

    public static java.lang.String GetLevelNr(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.IDeploymentLevel deploymentLevel) {
      return DynamicResourceUtil.invoke(IDeploymentLevelFunctionsImpl.class, DeploymentLevelFunctionsImpl.INSTANCE, deploymentLevel).GetLevelNr(deploymentLevel);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,bb871dfc-02d3-11e9-9e58-33d596257b14,y+9K25pT5x+a7PH1ipVfkJJxPUc=] */
