package ikt.product.documentation.spec.deployment.environment;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[bb871dfc-02d3-11e9-9e58-33d596257b14,imports]] */
import ikt.product.documentation.spec.deployment.environment.javamodel.EnvironmentView;
/* End Protected Region   [[bb871dfc-02d3-11e9-9e58-33d596257b14,imports]] */

public class FunctionSpace_Environmnent {

  /* Begin Protected Region [[bb871dfc-02d3-11e9-9e58-33d596257b14]] */
  
  /* End Protected Region   [[bb871dfc-02d3-11e9-9e58-33d596257b14]] */


  public static interface IEnvironmentViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d26206d3-0aa2-11e9-8a91-633e556ac68f")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("ebae8f76-2aba-11e9-a3f8-336d9e792e17")
    public java.lang.Boolean IsSupplied();

    @IDynamicResourceExtension.MethodId("c927eb2b-2abe-11e9-a3f8-336d9e792e17")
    public java.lang.String GetMaterialTypeName();

    @IDynamicResourceExtension.MethodId("d43dcbfc-2ace-11e9-a3f8-336d9e792e17")
    public ikt.product.documentation.spec.deployment.environment.naming.javamodel.IDisplayNameStrategy GetDisplayNameStrategy();

    @IDynamicResourceExtension.MethodId("94fce6cd-2ed3-11e9-9ca2-d7354798e154")
    public java.lang.String OnlyName();

  }
  
  public static interface IEnvironmentViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("ebae8f76-2aba-11e9-a3f8-336d9e792e17")
    public java.lang.Boolean IsSupplied(final ikt.product.documentation.spec.deployment.environment.javamodel.IEnvironmentView environmentView);

  }
  
  public static class EnvironmentViewFunctionsImpl implements IEnvironmentViewFunctionsImpl {

    public static final IEnvironmentViewFunctionsImpl INSTANCE = new EnvironmentViewFunctionsImpl();

    private EnvironmentViewFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsSupplied(final ikt.product.documentation.spec.deployment.environment.javamodel.IEnvironmentView environmentView) {
      return true;
    }

  }
  
  public static class EnvironmentViewFunctions {

    private EnvironmentViewFunctions() {}

    public static java.lang.Boolean IsSupplied(final ikt.product.documentation.spec.deployment.environment.javamodel.IEnvironmentView environmentView) {
      return DynamicResourceUtil.invoke(IEnvironmentViewFunctionsImpl.class, EnvironmentViewFunctionsImpl.INSTANCE, environmentView).IsSupplied(environmentView);
    }

  }

  public static interface IDeploymentLevelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c21927d9-0b6d-11e9-a136-69d076e48ed1")
    public java.lang.String GetLevelNr();

  }
  
  public static interface IDeploymentLevelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("c21927d9-0b6d-11e9-a136-69d076e48ed1")
    public java.lang.String GetLevelNr(final ikt.product.documentation.spec.deployment.environment.javamodel.IDeploymentLevel deploymentLevel);

  }
  
  public static class DeploymentLevelFunctionsImpl implements IDeploymentLevelFunctionsImpl {

    public static final IDeploymentLevelFunctionsImpl INSTANCE = new DeploymentLevelFunctionsImpl();

    private DeploymentLevelFunctionsImpl() {}

    @Override
    public java.lang.String GetLevelNr(final ikt.product.documentation.spec.deployment.environment.javamodel.IDeploymentLevel deploymentLevel) {
      /* Begin Protected Region [[c21927d9-0b6d-11e9-a136-69d076e48ed1]] */
    	if( deploymentLevel == null)
    		return "";
    	
    	if( EnvironmentView.selectToMeLevel_1(deploymentLevel) != null) {
    		return "1";
    	}

    	if( EnvironmentView.selectToMeLevel_2(deploymentLevel) != null) {
    		return "2";
    	}

    	if( EnvironmentView.selectToMeLevel_3(deploymentLevel) != null) {
    		return "3";
    	}

    	if( EnvironmentView.selectToMeLevel_4(deploymentLevel) != null) {
    		return "4";
    	}

    	if( EnvironmentView.selectToMeLevel_5(deploymentLevel) != null) {
    		return "5";
    	}

    	if( EnvironmentView.selectToMeLevel_6(deploymentLevel) != null) {
    		return "6";
    	}

    	if( EnvironmentView.selectToMeLevel_7(deploymentLevel) != null) {
    		return "7";
    	}
    	
    	if( EnvironmentView.selectToMeLevel_8(deploymentLevel) != null) {
    		return "8";
    	}
    	
    	
    	return "";
    	
      /* End Protected Region   [[c21927d9-0b6d-11e9-a136-69d076e48ed1]] */
    }

  }
  
  public static class DeploymentLevelFunctions {

    private DeploymentLevelFunctions() {}

    public static java.lang.String GetLevelNr(final ikt.product.documentation.spec.deployment.environment.javamodel.IDeploymentLevel deploymentLevel) {
      return DynamicResourceUtil.invoke(IDeploymentLevelFunctionsImpl.class, DeploymentLevelFunctionsImpl.INSTANCE, deploymentLevel).GetLevelNr(deploymentLevel);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,bb871dfc-02d3-11e9-9e58-33d596257b14,NmQ6q+dOugWsl81WMVPvl9CV5Ho=] */
