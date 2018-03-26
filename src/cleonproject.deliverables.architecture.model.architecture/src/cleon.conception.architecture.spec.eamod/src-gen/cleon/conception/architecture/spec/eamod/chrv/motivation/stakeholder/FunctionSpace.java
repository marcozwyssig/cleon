package cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[0e5cc754-0de2-11e6-a33d-238391a68770,imports]] */

/* End Protected Region   [[0e5cc754-0de2-11e6-a33d-238391a68770,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[0e5cc754-0de2-11e6-a33d-238391a68770]] */
  
  /* End Protected Region   [[0e5cc754-0de2-11e6-a33d-238391a68770]] */


  public static interface IStakeholderFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("18c78e02-0de2-11e6-a33d-238391a68770")
    public java.lang.String GetId();

  }
  
  public static interface IStakeholderFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("18c78e02-0de2-11e6-a33d-238391a68770")
    public java.lang.String GetId(final cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder stakeholder);

  }
  
  public static class StakeholderFunctionsImpl implements IStakeholderFunctionsImpl {

    public static final IStakeholderFunctionsImpl INSTANCE = new StakeholderFunctionsImpl();

    private StakeholderFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder stakeholder) {
      return String.format("S%02d", stakeholder.selectIdentifier());   
    }

  }
  
  public static class StakeholderFunctions {

    private StakeholderFunctions() {}

    public static java.lang.String GetId(final cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder stakeholder) {
      return DynamicResourceUtil.invoke(IStakeholderFunctionsImpl.class, StakeholderFunctionsImpl.INSTANCE, stakeholder).GetId(stakeholder);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,0e5cc754-0de2-11e6-a33d-238391a68770,OBRBz3y8SGu9CEK1QxlUu6AuVZs=] */
