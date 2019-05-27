package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[189e1c41-1e07-11e9-834d-77c41fccc6bf,imports]] */

/* End Protected Region   [[189e1c41-1e07-11e9-834d-77c41fccc6bf,imports]] */

public class FunctionSpace_RBAC {

  /* Begin Protected Region [[189e1c41-1e07-11e9-834d-77c41fccc6bf]] */
  
  /* End Protected Region   [[189e1c41-1e07-11e9-834d-77c41fccc6bf]] */


  public static interface IRBACFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2f538e63-1e07-11e9-834d-77c41fccc6bf")
    public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware GetArc42_Document();

  }
  
  public static interface IRBACFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RBACFunctionsImpl implements IRBACFunctionsImpl {

    public static final IRBACFunctionsImpl INSTANCE = new RBACFunctionsImpl();

    private RBACFunctionsImpl() {}

  }
  
  public static class RBACFunctions {

    private RBACFunctions() {}

  }

  public static interface IAbstractNetdomainGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a904cb96-1e19-11e9-865e-41ef48a95f70")
    public java.lang.Integer GetRange();

    @IDynamicResourceExtension.MethodId("893ebfeb-7f21-11e9-9a52-07d4b074defc")
    public java.lang.Integer GetId();

  }
  
  public static interface IAbstractNetdomainGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("a904cb96-1e19-11e9-865e-41ef48a95f70")
    public java.lang.Integer GetRange(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup);

    @IDynamicResourceExtension.MethodId("893ebfeb-7f21-11e9-9a52-07d4b074defc")
    public java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup);

  }
  
  public static class AbstractNetdomainGroupFunctionsImpl implements IAbstractNetdomainGroupFunctionsImpl {

    public static final IAbstractNetdomainGroupFunctionsImpl INSTANCE = new AbstractNetdomainGroupFunctionsImpl();

    private AbstractNetdomainGroupFunctionsImpl() {}

    @Override
    public java.lang.Integer GetRange(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup) {
      /* Begin Protected Region [[a904cb96-1e19-11e9-865e-41ef48a95f70]] */
        return GetId(abstractNetdomainGroup) + 99;   
      /* End Protected Region   [[a904cb96-1e19-11e9-865e-41ef48a95f70]] */
    }

    @Override
    public java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup) {
      /* Begin Protected Region [[893ebfeb-7f21-11e9-9a52-07d4b074defc]] */
      return (abstractNetdomainGroup.selectNetdomain().selectGroupId() * 100) + 2000;    		  
      /* End Protected Region   [[893ebfeb-7f21-11e9-9a52-07d4b074defc]] */
    }

  }
  
  public static class AbstractNetdomainGroupFunctions {

    private AbstractNetdomainGroupFunctions() {}

    public static java.lang.Integer GetRange(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup) {
      return DynamicResourceUtil.invoke(IAbstractNetdomainGroupFunctionsImpl.class, AbstractNetdomainGroupFunctionsImpl.INSTANCE, abstractNetdomainGroup).GetRange(abstractNetdomainGroup);
    }

    public static java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup) {
      return DynamicResourceUtil.invoke(IAbstractNetdomainGroupFunctionsImpl.class, AbstractNetdomainGroupFunctionsImpl.INSTANCE, abstractNetdomainGroup).GetId(abstractNetdomainGroup);
    }

  }

  public static interface IAbstractSecurityGroupsFunctions extends IDynamicResourceExtension {

  }
  
  public static interface IAbstractSecurityGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractSecurityGroupsFunctionsImpl implements IAbstractSecurityGroupsFunctionsImpl {

    public static final IAbstractSecurityGroupsFunctionsImpl INSTANCE = new AbstractSecurityGroupsFunctionsImpl();

    private AbstractSecurityGroupsFunctionsImpl() {}

  }
  
  public static class AbstractSecurityGroupsFunctions {

    private AbstractSecurityGroupsFunctions() {}

  }

  public static interface IAbstractGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4ea436ac-1e12-11e9-865e-41ef48a95f70")
    public cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode GetNetdomain();

    @IDynamicResourceExtension.MethodId("ac99f866-7f25-11e9-9a52-07d4b074defc")
    public cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractNetdomainGroup GetNetdomainGroup();

    @IDynamicResourceExtension.MethodId("cbe6c726-7f24-11e9-9a52-07d4b074defc")
    public List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroup> GetParents();

    @IDynamicResourceExtension.MethodId("9755ee05-1e0d-11e9-865e-41ef48a95f70")
    public cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IRBAC GetRBAC();

    @IDynamicResourceExtension.MethodId("0d13ebb7-7f19-11e9-9a52-07d4b074defc")
    public java.lang.Integer GetNetdomainId();

    @IDynamicResourceExtension.MethodId("d9daba23-809a-11e9-8e65-f3f639e40a34")
    public cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityRootGroups GetRootActivityGroup();

  }
  
  public static interface IAbstractGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractGroupFunctionsImpl implements IAbstractGroupFunctionsImpl {

    public static final IAbstractGroupFunctionsImpl INSTANCE = new AbstractGroupFunctionsImpl();

    private AbstractGroupFunctionsImpl() {}

  }
  
  public static class AbstractGroupFunctions {

    private AbstractGroupFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,189e1c41-1e07-11e9-834d-77c41fccc6bf,xupgWpFlTxLWddDEUL/Kc5FoGrM=] */
