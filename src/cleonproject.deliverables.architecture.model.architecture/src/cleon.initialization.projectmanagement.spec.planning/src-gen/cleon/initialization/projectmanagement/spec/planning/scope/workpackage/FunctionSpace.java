package cleon.initialization.projectmanagement.spec.planning.scope.workpackage;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f1ec1850-bc86-11e6-b169-a12bde5a1c7c,imports]] */
import cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.*;
import java.util.ArrayList;
import cleon.initialization.projectmanagement.spec.planning.schedule.milestones.FunctionSpace.IReleasesFunctions;
/* End Protected Region   [[f1ec1850-bc86-11e6-b169-a12bde5a1c7c,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[f1ec1850-bc86-11e6-b169-a12bde5a1c7c]] */
  
  /* End Protected Region   [[f1ec1850-bc86-11e6-b169-a12bde5a1c7c]] */


  public static interface IWorkpackageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f1ec1852-bc86-11e6-b169-a12bde5a1c7c")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("74637dd8-d66f-11e6-ad1f-c967b4caaf09")
    public List<cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint> GetSprintsBetweenStartAndEndMilestone();

    @IDynamicResourceExtension.MethodId("87d08efa-d6ac-11e6-a1b8-05a222dbc1bd")
    public java.lang.String GetSimpleId();

    @IDynamicResourceExtension.MethodId("e51475d3-d71f-11e6-982b-b1ea55e2d61b")
    public java.lang.String GetPhaseOfEndphaseName();

    @IDynamicResourceExtension.MethodId("aa8f9a90-3eb5-11e7-a89c-83d57940f0e3")
    public List<cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule> GetModules();

  }
  
  public static interface IWorkpackageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f1ec1852-bc86-11e6-b169-a12bde5a1c7c")
    public java.lang.String GetId(final cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage workpackage);

    @IDynamicResourceExtension.MethodId("74637dd8-d66f-11e6-ad1f-c967b4caaf09")
    public List<cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint> GetSprintsBetweenStartAndEndMilestone(final cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage workpackage);

    @IDynamicResourceExtension.MethodId("87d08efa-d6ac-11e6-a1b8-05a222dbc1bd")
    public java.lang.String GetSimpleId(final cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage workpackage);

  }
  
  public static class WorkpackageFunctionsImpl implements IWorkpackageFunctionsImpl {

    public static final IWorkpackageFunctionsImpl INSTANCE = new WorkpackageFunctionsImpl();

    private WorkpackageFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage workpackage) {
      return String.format("AP%02d", workpackage.selectIdentifier());
    }

    @Override
    public List<cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint> GetSprintsBetweenStartAndEndMilestone(final cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage workpackage) {
      /* Begin Protected Region [[74637dd8-d66f-11e6-ad1f-c967b4caaf09]] */
		IRelease startMileStone = Release.selectToMePlannedEndWorkpackages(workpackage);
		IRelease endMileStone = Release.selectToMePlannedEndWorkpackages(workpackage);

		if (startMileStone == null || endMileStone == null) {
			return new ArrayList<ISprint>();
		}

		IReleases milestones = Releases.selectToMePhases(Phase.selectToMeReleases(startMileStone));
		List<ISprint> sprints = new ArrayList<ISprint>();
		boolean add = false;
		List<IRelease> milestoneList = milestones.extension(IReleasesFunctions.class).GetMilestoneList();
		for (IRelease milestone : milestoneList) {
			if (milestone == startMileStone) {
				add = true;
			}

			if (add) {
				sprints.addAll(milestone.selectSprints());
			}

			if (milestone == endMileStone) {
				add = false;
			}
		}

		return sprints;
      /* End Protected Region   [[74637dd8-d66f-11e6-ad1f-c967b4caaf09]] */
    }

    @Override
    public java.lang.String GetSimpleId(final cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage workpackage) {
      return String.format("wp%03d", workpackage.selectIdentifier());
    }

  }
  
  public static class WorkpackageFunctions {

    private WorkpackageFunctions() {}

    public static java.lang.String GetId(final cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage workpackage) {
      return DynamicResourceUtil.invoke(IWorkpackageFunctionsImpl.class, WorkpackageFunctionsImpl.INSTANCE, workpackage).GetId(workpackage);
    }

    public static List<cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint> GetSprintsBetweenStartAndEndMilestone(final cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage workpackage) {
      return DynamicResourceUtil.invoke(IWorkpackageFunctionsImpl.class, WorkpackageFunctionsImpl.INSTANCE, workpackage).GetSprintsBetweenStartAndEndMilestone(workpackage);
    }

    public static java.lang.String GetSimpleId(final cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage workpackage) {
      return DynamicResourceUtil.invoke(IWorkpackageFunctionsImpl.class, WorkpackageFunctionsImpl.INSTANCE, workpackage).GetSimpleId(workpackage);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f1ec1850-bc86-11e6-b169-a12bde5a1c7c,6r4v9iUl5Fhn7Q+f1wZvUdm6t28=] */
