package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f1ec1850-bc86-11e6-b169-a12bde5a1c7c,imports]] */

/* End Protected Region   [[f1ec1850-bc86-11e6-b169-a12bde5a1c7c,imports]] */

public class FunctionSpace_Workpackage {

  /* Begin Protected Region [[f1ec1850-bc86-11e6-b169-a12bde5a1c7c]] */
  
  /* End Protected Region   [[f1ec1850-bc86-11e6-b169-a12bde5a1c7c]] */


  public static interface IWorkpackageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f1ec1852-bc86-11e6-b169-a12bde5a1c7c")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("74637dd8-d66f-11e6-ad1f-c967b4caaf09")
    public List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint> GetRequiredSprints();

    @IDynamicResourceExtension.MethodId("87d08efa-d6ac-11e6-a1b8-05a222dbc1bd")
    public java.lang.String GetSimpleId();

    @IDynamicResourceExtension.MethodId("e51475d3-d71f-11e6-982b-b1ea55e2d61b")
    public java.lang.String GetPhaseOfEndphaseName();

    @IDynamicResourceExtension.MethodId("aa8f9a90-3eb5-11e7-a89c-83d57940f0e3")
    public List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome> GetModules();

    @IDynamicResourceExtension.MethodId("ff97575a-bfee-11e8-a3d0-5394fd9291a1")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.javamodel.IScope GetScope();

  }
  
  public static interface IWorkpackageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f1ec1852-bc86-11e6-b169-a12bde5a1c7c")
    public java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage workpackage);

    @IDynamicResourceExtension.MethodId("87d08efa-d6ac-11e6-a1b8-05a222dbc1bd")
    public java.lang.String GetSimpleId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage workpackage);

  }
  
  public static class WorkpackageFunctionsImpl implements IWorkpackageFunctionsImpl {

    public static final IWorkpackageFunctionsImpl INSTANCE = new WorkpackageFunctionsImpl();

    private WorkpackageFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage workpackage) {
      return String.format("AP%02d", workpackage.selectIdentifier());
    }

    @Override
    public java.lang.String GetSimpleId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage workpackage) {
      return String.format("wp%03d", workpackage.selectIdentifier());
    }

  }
  
  public static class WorkpackageFunctions {

    private WorkpackageFunctions() {}

    public static java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage workpackage) {
      return DynamicResourceUtil.invoke(IWorkpackageFunctionsImpl.class, WorkpackageFunctionsImpl.INSTANCE, workpackage).GetId(workpackage);
    }

    public static java.lang.String GetSimpleId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage workpackage) {
      return DynamicResourceUtil.invoke(IWorkpackageFunctionsImpl.class, WorkpackageFunctionsImpl.INSTANCE, workpackage).GetSimpleId(workpackage);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f1ec1850-bc86-11e6-b169-a12bde5a1c7c,PFm3RjwHyvWyFL6zM7NPkhWZeTI=] */
