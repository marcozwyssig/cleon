package cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.variety;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[fd3bd282-6ca1-11e7-8bc1-2fb13127901b,imports]] */

/* End Protected Region   [[fd3bd282-6ca1-11e7-8bc1-2fb13127901b,imports]] */

public class VarietyFunctionSpace {

  /* Begin Protected Region [[fd3bd282-6ca1-11e7-8bc1-2fb13127901b]] */
  
  /* End Protected Region   [[fd3bd282-6ca1-11e7-8bc1-2fb13127901b]] */


  public static interface IInfrastractureProductVarietyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0719eacc-6ca2-11e7-8bc1-2fb13127901b")
    public cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety GetAllDirectedDependendies();

    @IDynamicResourceExtension.MethodId("606bd350-778e-11e7-9604-cb27385e129c")
    public java.lang.String GetName();

  }
  
  public static interface IInfrastractureProductVarietyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InfrastractureProductVarietyFunctionsImpl implements IInfrastractureProductVarietyFunctionsImpl {

    public static final IInfrastractureProductVarietyFunctionsImpl INSTANCE = new InfrastractureProductVarietyFunctionsImpl();

    private InfrastractureProductVarietyFunctionsImpl() {}

  }
  
  public static class InfrastractureProductVarietyFunctions {

    private InfrastractureProductVarietyFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fd3bd282-6ca1-11e7-8bc1-2fb13127901b,Rm64CC1bez+aLI5ZQEHcTKHb0iU=] */
