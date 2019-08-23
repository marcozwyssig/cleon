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

    @IDynamicResourceExtension.MethodId("63f0e9b9-9c8f-11e9-9b32-35cf2fd07621")
    public java.lang.Integer Max();

    @IDynamicResourceExtension.MethodId("8f1d7786-9c8f-11e9-9b32-35cf2fd07621")
    public java.lang.Integer MaxRounded();

  }
  
  public static interface IAbstractNetdomainGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("a904cb96-1e19-11e9-865e-41ef48a95f70")
    public java.lang.Integer GetRange(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup);

    @IDynamicResourceExtension.MethodId("893ebfeb-7f21-11e9-9a52-07d4b074defc")
    public java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup);

    @IDynamicResourceExtension.MethodId("8f1d7786-9c8f-11e9-9b32-35cf2fd07621")
    public java.lang.Integer MaxRounded(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup);

  }
  
  public static class AbstractNetdomainGroupFunctionsImpl implements IAbstractNetdomainGroupFunctionsImpl {

    public static final IAbstractNetdomainGroupFunctionsImpl INSTANCE = new AbstractNetdomainGroupFunctionsImpl();

    private AbstractNetdomainGroupFunctionsImpl() {}

    @Override
    public java.lang.Integer GetRange(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup) {
      /* Begin Protected Region [[a904cb96-1e19-11e9-865e-41ef48a95f70]] */
        return GetId(abstractNetdomainGroup) + MaxRounded(abstractNetdomainGroup) - 1;   
      /* End Protected Region   [[a904cb96-1e19-11e9-865e-41ef48a95f70]] */
    }

    @Override
    public java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup) {
      /* Begin Protected Region [[893ebfeb-7f21-11e9-9a52-07d4b074defc]] */
    	return (abstractNetdomainGroup.selectNetdomain().selectGroupId() * MaxRounded(abstractNetdomainGroup)) + 2000;    		  
      /* End Protected Region   [[893ebfeb-7f21-11e9-9a52-07d4b074defc]] */
    }

    @Override
    public java.lang.Integer MaxRounded(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup) {
      /* Begin Protected Region [[8f1d7786-9c8f-11e9-9b32-35cf2fd07621]] */
    	IAbstractNetdomainGroupFunctions functions = abstractNetdomainGroup.extension(IAbstractNetdomainGroupFunctions.class);
    	return ((functions.Max() + 99) / 100 ) * 100;
      /* End Protected Region   [[8f1d7786-9c8f-11e9-9b32-35cf2fd07621]] */
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

    public static java.lang.Integer MaxRounded(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup) {
      return DynamicResourceUtil.invoke(IAbstractNetdomainGroupFunctionsImpl.class, AbstractNetdomainGroupFunctionsImpl.INSTANCE, abstractNetdomainGroup).MaxRounded(abstractNetdomainGroup);
    }

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

    @IDynamicResourceExtension.MethodId("94ef12db-809c-11e9-8e65-f3f639e40a34")
    public cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleRootGroups GetRootRoleGroup();

    @IDynamicResourceExtension.MethodId("34e81fa9-c56f-11e9-9daa-cf9f9f7341e8")
    public List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroup> GetAllChildren();

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

  public static interface IAbstractGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("792154d6-c56f-11e9-9daa-cf9f9f7341e8")
    public List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroup> GetAllChildren();

  }
  
  public static interface IAbstractGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractGroupsFunctionsImpl implements IAbstractGroupsFunctionsImpl {

    public static final IAbstractGroupsFunctionsImpl INSTANCE = new AbstractGroupsFunctionsImpl();

    private AbstractGroupsFunctionsImpl() {}

  }
  
  public static class AbstractGroupsFunctions {

    private AbstractGroupsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,189e1c41-1e07-11e9-834d-77c41fccc6bf,jXb+M0CWpqy/NFvUDtvwHgGmKII=] */
